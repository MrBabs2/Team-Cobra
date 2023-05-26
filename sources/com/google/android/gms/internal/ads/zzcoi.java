package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsm;

public final class zzcoi<AdT, AdapterT, ListenerT extends zzbsm> implements zzdti<zzcoe<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20686a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f20687b;

    /* renamed from: c */
    private final zzdtu<zzcjz<AdapterT, ListenerT>> f20688c;

    /* renamed from: d */
    private final zzdtu<zzcka<AdT, AdapterT, ListenerT>> f20689d;

    private zzcoi(zzdtu<zzczt> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtu3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtu4) {
        this.f20686a = zzdtu;
        this.f20687b = zzdtu2;
        this.f20688c = zzdtu3;
        this.f20689d = zzdtu4;
    }

    /* renamed from: a */
    public static <AdT, AdapterT, ListenerT extends zzbsm> zzcoi<AdT, AdapterT, ListenerT> m22738a(zzdtu<zzczt> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtu3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtu4) {
        return new zzcoi<>(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        return new zzcoe(this.f20686a.get(), this.f20687b.get(), this.f20688c.get(), this.f20689d.get());
    }
}
