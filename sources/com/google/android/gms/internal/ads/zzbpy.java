package com.google.android.gms.internal.ads;

public final class zzbpy implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19391a;

    private zzbpy(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        this.f19391a = zzdtu;
    }

    /* renamed from: a */
    public static zzbpy m21779a(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        return new zzbpy(zzbpx, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19391a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
