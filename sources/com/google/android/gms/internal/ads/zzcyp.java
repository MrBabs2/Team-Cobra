package com.google.android.gms.internal.ads;

public final class zzcyp implements zzdti<zzaxb> {

    /* renamed from: a */
    private final zzdtu<zzcym> f21216a;

    private zzcyp(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        this.f21216a = zzdtu;
    }

    /* renamed from: a */
    public static zzcyp m23123a(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        return new zzcyp(zzcyo, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzaxb zzaxb = this.f21216a.get().f21210b;
        zzdto.m24236a(zzaxb, "Cannot return null from a non-@Nullable @Provides method");
        return zzaxb;
    }
}
