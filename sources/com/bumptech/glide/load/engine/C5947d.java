package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6022f;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.d */
/* compiled from: DataCacheKey */
final class C5947d implements C6022f {

    /* renamed from: b */
    private final C6022f f10857b;

    /* renamed from: c */
    private final C6022f f10858c;

    C5947d(C6022f fVar, C6022f fVar2) {
        this.f10857b = fVar;
        this.f10858c = fVar2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5947d)) {
            return false;
        }
        C5947d dVar = (C5947d) obj;
        if (!this.f10857b.equals(dVar.f10857b) || !this.f10858c.equals(dVar.f10858c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f10857b.hashCode() * 31) + this.f10858c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f10857b + ", signature=" + this.f10858c + '}';
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f10857b.updateDiskCacheKey(messageDigest);
        this.f10858c.updateDiskCacheKey(messageDigest);
    }
}
