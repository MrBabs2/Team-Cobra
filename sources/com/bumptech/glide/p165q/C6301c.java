package com.bumptech.glide.p165q;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.p166r.C6315j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.q.c */
/* compiled from: ObjectKey */
public final class C6301c implements C6022f {

    /* renamed from: b */
    private final Object f11547b;

    public C6301c(Object obj) {
        C6315j.m12978a(obj);
        this.f11547b = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6301c) {
            return this.f11547b.equals(((C6301c) obj).f11547b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11547b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f11547b + '}';
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f11547b.toString().getBytes(C6022f.f11096a));
    }
}
