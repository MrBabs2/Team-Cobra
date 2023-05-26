package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcsf implements zzdti<zzcsd> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f20894a;

    /* renamed from: b */
    private final zzdtu<Context> f20895b;

    private zzcsf(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2) {
        this.f20894a = zzdtu;
        this.f20895b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcsf m22951a(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2) {
        return new zzcsf(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcsd(this.f20894a.get(), this.f20895b.get());
    }
}
