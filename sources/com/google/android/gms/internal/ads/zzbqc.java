package com.google.android.gms.internal.ads;

public final class zzbqc implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19395a;

    private zzbqc(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        this.f19395a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqc m21783a(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        return new zzbqc(zzbpx, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19395a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
