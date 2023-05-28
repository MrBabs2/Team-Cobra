package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.p152o.p153c.C6177s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.e */
/* compiled from: ImageHeaderParserUtils */
public final class C5905e {
    /* renamed from: a */
    public static ImageHeaderParser.ImageType m11674a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = list.get(i).mo20066a(byteBuffer);
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m11675b(List<ImageHeaderParser> list, InputStream inputStream, C5999b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6177s(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageHeaderParser.ImageType a = list.get(i).mo20065a(inputStream);
                if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m11673a(List<ImageHeaderParser> list, InputStream inputStream, C5999b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6177s(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a = list.get(i).mo20064a(inputStream, bVar);
                if (a != -1) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }
}
