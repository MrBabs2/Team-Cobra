package com.bumptech.glide.load.p152o.p153c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.n */
/* compiled from: DrawableTransformation */
public class C6172n implements C6030l<Drawable> {

    /* renamed from: b */
    private final C6030l<Bitmap> f11283b;

    /* renamed from: c */
    private final boolean f11284c;

    public C6172n(C6030l<Bitmap> lVar, boolean z) {
        this.f11283b = lVar;
        this.f11284c = z;
    }

    /* renamed from: a */
    private C5992u<Drawable> m12475a(Context context, C5992u<Bitmap> uVar) {
        return C6176r.m12483a(context.getResources(), uVar);
    }

    /* renamed from: a */
    public C6030l<BitmapDrawable> mo20462a() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6172n) {
            return this.f11283b.equals(((C6172n) obj).f11283b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11283b.hashCode();
    }

    public C5992u<Drawable> transform(Context context, C5992u<Drawable> uVar, int i, int i2) {
        C6004e c = C5874c.m11487b(context).mo19958c();
        Drawable drawable = uVar.get();
        C5992u<Bitmap> a = C6170m.m12472a(c, drawable, i, i2);
        if (a != null) {
            C5992u<Bitmap> transform = this.f11283b.transform(context, a, i, i2);
            if (!transform.equals(a)) {
                return m12475a(context, transform);
            }
            transform.mo20235a();
            return uVar;
        } else if (!this.f11284c) {
            return uVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f11283b.updateDiskCacheKey(messageDigest);
    }
}
