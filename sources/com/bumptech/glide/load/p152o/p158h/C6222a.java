package com.bumptech.glide.load.p152o.p158h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.p152o.p154d.C6196b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.o.h.a */
/* compiled from: BitmapBytesTranscoder */
public class C6222a implements C6226e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f11374a;

    /* renamed from: b */
    private final int f11375b;

    public C6222a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C5992u<byte[]> mo20552a(C5992u<Bitmap> uVar, C6027i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f11374a, this.f11375b, byteArrayOutputStream);
        uVar.mo20235a();
        return new C6196b(byteArrayOutputStream.toByteArray());
    }

    public C6222a(Bitmap.CompressFormat compressFormat, int i) {
        this.f11374a = compressFormat;
        this.f11375b = i;
    }
}
