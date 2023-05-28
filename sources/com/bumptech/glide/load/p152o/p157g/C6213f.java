package com.bumptech.glide.load.p152o.p157g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.p152o.p153c.C6148d;
import com.bumptech.glide.p166r.C6315j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.g.f */
/* compiled from: GifDrawableTransformation */
public class C6213f implements C6030l<C6209c> {

    /* renamed from: b */
    private final C6030l<Bitmap> f11347b;

    public C6213f(C6030l<Bitmap> lVar) {
        C6315j.m12978a(lVar);
        this.f11347b = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6213f) {
            return this.f11347b.equals(((C6213f) obj).f11347b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11347b.hashCode();
    }

    public C5992u<C6209c> transform(Context context, C5992u<C6209c> uVar, int i, int i2) {
        C6209c cVar = uVar.get();
        C6148d dVar = new C6148d(cVar.mo20510c(), C5874c.m11487b(context).mo19958c());
        C5992u<Bitmap> transform = this.f11347b.transform(context, dVar, i, i2);
        if (!dVar.equals(transform)) {
            dVar.mo20235a();
        }
        cVar.mo20508a(this.f11347b, transform.get());
        return uVar;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f11347b.updateDiskCacheKey(messageDigest);
    }
}
