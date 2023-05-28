package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcsx implements zzdti<zzcsv> {

    /* renamed from: a */
    private final zzdtu<Context> f20917a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f20918b;

    private zzcsx(zzdtu<Context> zzdtu, zzdtu<zzbbl> zzdtu2) {
        this.f20917a = zzdtu;
        this.f20918b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcsx m22961a(zzdtu<Context> zzdtu, zzdtu<zzbbl> zzdtu2) {
        return new zzcsx(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcsv(this.f20917a.get(), this.f20918b.get());
    }
}
