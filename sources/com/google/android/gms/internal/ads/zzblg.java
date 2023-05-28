package com.google.android.gms.internal.ads;

public final class zzblg implements zzdti<zzbah> {

    /* renamed from: a */
    private final zzdtu<String> f19130a;

    private zzblg(zzdtu<String> zzdtu) {
        this.f19130a = zzdtu;
    }

    /* renamed from: a */
    public static zzblg m21321a(zzdtu<String> zzdtu) {
        return new zzblg(zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbah zzbah = new zzbah(this.f19130a.get());
        zzdto.m24236a(zzbah, "Cannot return null from a non-@Nullable @Provides method");
        return zzbah;
    }
}
