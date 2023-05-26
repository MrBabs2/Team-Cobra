package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzchb implements zzdti<zzbbh<String>> {

    /* renamed from: a */
    private final zzdtu<zzdh> f20189a;

    /* renamed from: b */
    private final zzdtu<Context> f20190b;

    /* renamed from: c */
    private final zzdtu<zzbbl> f20191c;

    private zzchb(zzdtu<zzdh> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzbbl> zzdtu3) {
        this.f20189a = zzdtu;
        this.f20190b = zzdtu2;
        this.f20191c = zzdtu3;
    }

    /* renamed from: a */
    public static zzchb m22538a(zzdtu<zzdh> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzbbl> zzdtu3) {
        return new zzchb(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        zzbbh a = this.f20191c.get().mo27892a(new C8177yi(this.f20189a.get(), this.f20190b.get()));
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
