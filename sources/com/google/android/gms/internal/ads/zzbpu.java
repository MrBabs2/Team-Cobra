package com.google.android.gms.internal.ads;

public final class zzbpu implements zzdti<zzcxu> {

    /* renamed from: a */
    private final zzbpr f19387a;

    private zzbpu(zzbpr zzbpr) {
        this.f19387a = zzbpr;
    }

    /* renamed from: a */
    public static zzbpu m21775a(zzbpr zzbpr) {
        return new zzbpu(zzbpr);
    }

    /* renamed from: b */
    public static zzcxu m21776b(zzbpr zzbpr) {
        zzcxu a = zzbpr.mo28391a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m21776b(this.f19387a);
    }
}
