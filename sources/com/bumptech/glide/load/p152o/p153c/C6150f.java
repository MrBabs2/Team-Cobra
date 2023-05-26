package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.p166r.C6302a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.c.f */
/* compiled from: ByteBufferBitmapDecoder */
public class C6150f implements C6028j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C6167l f11252a;

    public C6150f(C6167l lVar) {
        this.f11252a = lVar;
    }

    /* renamed from: a */
    public boolean mo20320a(ByteBuffer byteBuffer, C6027i iVar) {
        return this.f11252a.mo20459a(byteBuffer);
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20319a(ByteBuffer byteBuffer, int i, int i2, C6027i iVar) throws IOException {
        return this.f11252a.mo20456a(C6302a.m12952c(byteBuffer), i, i2, iVar);
    }
}
