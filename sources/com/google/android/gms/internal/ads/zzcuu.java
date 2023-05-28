package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcuu implements zzdti<zzcus> {

    /* renamed from: a */
    private final zzdtu<zzavg> f20988a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f20989b;

    /* renamed from: c */
    private final zzdtu<Context> f20990c;

    private zzcuu(zzdtu<zzavg> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<Context> zzdtu3) {
        this.f20988a = zzdtu;
        this.f20989b = zzdtu2;
        this.f20990c = zzdtu3;
    }

    /* renamed from: a */
    public static zzcuu m23007a(zzdtu<zzavg> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<Context> zzdtu3) {
        return new zzcuu(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzcus(this.f20988a.get(), this.f20989b.get(), this.f20990c.get());
    }
}
