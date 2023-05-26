package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcuy implements zzdti<zzcuw> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f21000a;

    /* renamed from: b */
    private final zzdtu<Context> f21001b;

    /* renamed from: c */
    private final zzdtu<zzbai> f21002c;

    private zzcuy(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzbai> zzdtu3) {
        this.f21000a = zzdtu;
        this.f21001b = zzdtu2;
        this.f21002c = zzdtu3;
    }

    /* renamed from: a */
    public static zzcuy m23011a(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzbai> zzdtu3) {
        return new zzcuy(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzcuw(this.f21000a.get(), this.f21001b.get(), this.f21002c.get());
    }
}
