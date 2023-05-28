package com.bumptech.glide.load.p152o.p157g;

import android.util.Log;
import com.bumptech.glide.load.C5905e;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* renamed from: com.bumptech.glide.load.o.g.j */
/* compiled from: StreamGifDecoder */
public class C6221j implements C6028j<InputStream, C6209c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f11371a;

    /* renamed from: b */
    private final C6028j<ByteBuffer, C6209c> f11372b;

    /* renamed from: c */
    private final C5999b f11373c;

    public C6221j(List<ImageHeaderParser> list, C6028j<ByteBuffer, C6209c> jVar, C5999b bVar) {
        this.f11371a = list;
        this.f11372b = jVar;
        this.f11373c = bVar;
    }

    /* renamed from: a */
    public boolean mo20320a(InputStream inputStream, C6027i iVar) throws IOException {
        return !((Boolean) iVar.mo20316a(C6220i.f11370b)).booleanValue() && C5905e.m11675b(this.f11371a, inputStream, this.f11373c) == ImageHeaderParser.ImageType.GIF;
    }

    /* renamed from: a */
    public C5992u<C6209c> mo20319a(InputStream inputStream, int i, int i2, C6027i iVar) throws IOException {
        byte[] a = m12646a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f11372b.mo20319a(ByteBuffer.wrap(a), i, i2, iVar);
    }

    /* renamed from: a */
    private static byte[] m12646a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }
}
