package com.bumptech.glide.load.p152o.p155e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.C5992u;

/* renamed from: com.bumptech.glide.load.o.e.d */
/* compiled from: NonOwnedDrawableResource */
final class C6200d extends C6198b<Drawable> {
    private C6200d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static C5992u<Drawable> m12561a(Drawable drawable) {
        if (drawable != null) {
            return new C6200d(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo20235a() {
    }

    /* renamed from: c */
    public int mo20238c() {
        return Math.max(1, this.f11323f.getIntrinsicWidth() * this.f11323f.getIntrinsicHeight() * 4);
    }

    /* renamed from: d */
    public Class<Drawable> mo20239d() {
        return this.f11323f.getClass();
    }
}
