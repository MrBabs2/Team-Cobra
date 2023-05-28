package com.bumptech.glide.p166r;

import p050l.p066e.C4868a;
import p050l.p066e.C4881g;

/* renamed from: com.bumptech.glide.r.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C6305b<K, V> extends C4868a<K, V> {

    /* renamed from: n */
    private int f11553n;

    /* renamed from: a */
    public V mo17018a(int i, V v) {
        this.f11553n = 0;
        return super.mo17018a(i, v);
    }

    /* renamed from: c */
    public V mo17024c(int i) {
        this.f11553n = 0;
        return super.mo17024c(i);
    }

    public void clear() {
        this.f11553n = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f11553n == 0) {
            this.f11553n = super.hashCode();
        }
        return this.f11553n;
    }

    public V put(K k, V v) {
        this.f11553n = 0;
        return super.put(k, v);
    }

    /* renamed from: a */
    public void mo17020a(C4881g<? extends K, ? extends V> gVar) {
        this.f11553n = 0;
        super.mo17020a(gVar);
    }
}
