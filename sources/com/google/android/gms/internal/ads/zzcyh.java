package com.google.android.gms.internal.ads;

public final class zzcyh implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcyi> f21198a;

    private zzcyh(zzcyg zzcyg, zzdtu<zzcyi> zzdtu) {
        this.f21198a = zzdtu;
    }

    /* renamed from: a */
    public static zzcyh m23116a(zzcyg zzcyg, zzdtu<zzcyi> zzdtu) {
        return new zzcyh(zzcyg, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f21198a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
