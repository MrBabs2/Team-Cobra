package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: f */
        private final boolean f10770f;

        private ImageType(boolean z) {
            this.f10770f = z;
        }

        public boolean hasAlpha() {
            return this.f10770f;
        }
    }

    /* renamed from: a */
    int mo20064a(InputStream inputStream, C5999b bVar) throws IOException;

    /* renamed from: a */
    ImageType mo20065a(InputStream inputStream) throws IOException;

    /* renamed from: a */
    ImageType mo20066a(ByteBuffer byteBuffer) throws IOException;
}
