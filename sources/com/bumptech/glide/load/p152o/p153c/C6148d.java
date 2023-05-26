package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C5987q;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;

/* renamed from: com.bumptech.glide.load.o.c.d */
/* compiled from: BitmapResource */
public class C6148d implements C5992u<Bitmap>, C5987q {

    /* renamed from: f */
    private final Bitmap f11250f;

    /* renamed from: g */
    private final C6004e f11251g;

    public C6148d(Bitmap bitmap, C6004e eVar) {
        C6315j.m12979a(bitmap, "Bitmap must not be null");
        this.f11250f = bitmap;
        C6315j.m12979a(eVar, "BitmapPool must not be null");
        this.f11251g = eVar;
    }

    /* renamed from: a */
    public static C6148d m12395a(Bitmap bitmap, C6004e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C6148d(bitmap, eVar);
    }

    /* renamed from: b */
    public void mo20245b() {
        this.f11250f.prepareToDraw();
    }

    /* renamed from: c */
    public int mo20238c() {
        return C6316k.m12988a(this.f11250f);
    }

    /* renamed from: d */
    public Class<Bitmap> mo20239d() {
        return Bitmap.class;
    }

    /* renamed from: a */
    public void mo20235a() {
        this.f11251g.mo20283a(this.f11250f);
    }

    public Bitmap get() {
        return this.f11250f;
    }
}
