package com.bumptech.glide.load;

import com.bumptech.glide.p166r.C6305b;
import java.security.MessageDigest;
import p050l.p066e.C4868a;

/* renamed from: com.bumptech.glide.load.i */
/* compiled from: Options */
public final class C6027i implements C6022f {

    /* renamed from: b */
    private final C4868a<C6024h<?>, Object> f11103b = new C6305b();

    /* renamed from: a */
    public void mo20317a(C6027i iVar) {
        this.f11103b.mo17020a(iVar.f11103b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6027i) {
            return this.f11103b.equals(((C6027i) obj).f11103b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11103b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f11103b + '}';
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f11103b.size(); i++) {
            m12070a(this.f11103b.mo17022b(i), this.f11103b.mo17028d(i), messageDigest);
        }
    }

    /* renamed from: a */
    public <T> C6027i mo20315a(C6024h<T> hVar, T t) {
        this.f11103b.put(hVar, t);
        return this;
    }

    /* renamed from: a */
    public <T> T mo20316a(C6024h<T> hVar) {
        return this.f11103b.containsKey(hVar) ? this.f11103b.get(hVar) : hVar.mo20309a();
    }

    /* renamed from: a */
    private static <T> void m12070a(C6024h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo20310a(obj, messageDigest);
    }
}
