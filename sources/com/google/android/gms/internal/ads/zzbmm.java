package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbmm implements zzdti<zzbml> {

    /* renamed from: a */
    private final zzdtu<Context> f19176a;

    /* renamed from: b */
    private final zzdtu<zzty> f19177b;

    private zzbmm(zzdtu<Context> zzdtu, zzdtu<zzty> zzdtu2) {
        this.f19176a = zzdtu;
        this.f19177b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbmm m21362a(zzdtu<Context> zzdtu, zzdtu<zzty> zzdtu2) {
        return new zzbmm(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzbml(this.f19176a.get(), this.f19177b.get());
    }
}
