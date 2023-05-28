package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.p166r.C6316k;

/* renamed from: com.bumptech.glide.load.o.c.x */
/* compiled from: UnitBitmapDecoder */
public final class C6185x implements C6028j<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.o.c.x$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C6186a implements C5992u<Bitmap> {

        /* renamed from: f */
        private final Bitmap f11311f;

        C6186a(Bitmap bitmap) {
            this.f11311f = bitmap;
        }

        /* renamed from: a */
        public void mo20235a() {
        }

        /* renamed from: c */
        public int mo20238c() {
            return C6316k.m12988a(this.f11311f);
        }

        /* renamed from: d */
        public Class<Bitmap> mo20239d() {
            return Bitmap.class;
        }

        public Bitmap get() {
            return this.f11311f;
        }
    }

    /* renamed from: a */
    public boolean mo20320a(Bitmap bitmap, C6027i iVar) {
        return true;
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20319a(Bitmap bitmap, int i, int i2, C6027i iVar) {
        return new C6186a(bitmap);
    }
}
