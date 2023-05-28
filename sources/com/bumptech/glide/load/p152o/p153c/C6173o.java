package com.bumptech.glide.load.p152o.p153c;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.c.o */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C6173o implements ImageHeaderParser {
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo20065a(InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo20066a(ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public int mo20064a(InputStream inputStream, C5999b bVar) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
