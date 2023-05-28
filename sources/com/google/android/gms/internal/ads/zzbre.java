package com.google.android.gms.internal.ads;

public final class zzbre implements zzdti<zzcxv> {

    /* renamed from: a */
    private final zzbqy f19444a;

    private zzbre(zzbqy zzbqy) {
        this.f19444a = zzbqy;
    }

    /* renamed from: a */
    public static zzbre m21828a(zzbqy zzbqy) {
        return new zzbre(zzbqy);
    }

    /* renamed from: b */
    public static zzcxv m21829b(zzbqy zzbqy) {
        zzcxv b = zzbqy.mo28399b();
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public final /* synthetic */ Object get() {
        return m21829b(this.f19444a);
    }
}
