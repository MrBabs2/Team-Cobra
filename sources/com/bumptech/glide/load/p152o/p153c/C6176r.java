package com.bumptech.glide.load.p152o.p153c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.C5987q;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.load.o.c.r */
/* compiled from: LazyBitmapDrawableResource */
public final class C6176r implements C5992u<BitmapDrawable>, C5987q {

    /* renamed from: f */
    private final Resources f11290f;

    /* renamed from: g */
    private final C5992u<Bitmap> f11291g;

    private C6176r(Resources resources, C5992u<Bitmap> uVar) {
        C6315j.m12978a(resources);
        this.f11290f = resources;
        C6315j.m12978a(uVar);
        this.f11291g = uVar;
    }

    /* renamed from: a */
    public static C5992u<BitmapDrawable> m12483a(Resources resources, C5992u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new C6176r(resources, uVar);
    }

    /* renamed from: b */
    public void mo20245b() {
        C5992u<Bitmap> uVar = this.f11291g;
        if (uVar instanceof C5987q) {
            ((C5987q) uVar).mo20245b();
        }
    }

    /* renamed from: c */
    public int mo20238c() {
        return this.f11291g.mo20238c();
    }

    /* renamed from: d */
    public Class<BitmapDrawable> mo20239d() {
        return BitmapDrawable.class;
    }

    /* renamed from: a */
    public void mo20235a() {
        this.f11291g.mo20235a();
    }

    public BitmapDrawable get() {
        return new BitmapDrawable(this.f11290f, this.f11291g.get());
    }
}
