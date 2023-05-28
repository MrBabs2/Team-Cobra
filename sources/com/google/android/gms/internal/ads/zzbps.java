package com.google.android.gms.internal.ads;

public final class zzbps implements zzdti<zzcxm> {

    /* renamed from: a */
    private final zzbpr f19385a;

    private zzbps(zzbpr zzbpr) {
        this.f19385a = zzbpr;
    }

    /* renamed from: a */
    public static zzbps m21771a(zzbpr zzbpr) {
        return new zzbps(zzbpr);
    }

    /* renamed from: b */
    public static zzcxm m21772b(zzbpr zzbpr) {
        zzcxm b = zzbpr.mo28392b();
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public final /* synthetic */ Object get() {
        return m21772b(this.f19385a);
    }
}
