package com.google.android.gms.internal.ads;

public final class zzcys implements zzdti<zzdh> {

    /* renamed from: a */
    private final zzdtu<zzcym> f21220a;

    private zzcys(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        this.f21220a = zzdtu;
    }

    /* renamed from: a */
    public static zzcys m23126a(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        return new zzcys(zzcyo, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzdh zzdh = this.f21220a.get().f21212d;
        zzdto.m24236a(zzdh, "Cannot return null from a non-@Nullable @Provides method");
        return zzdh;
    }
}
