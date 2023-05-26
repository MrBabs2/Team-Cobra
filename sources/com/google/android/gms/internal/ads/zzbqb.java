package com.google.android.gms.internal.ads;

public final class zzbqb implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19394a;

    private zzbqb(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        this.f19394a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqb m21782a(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        return new zzbqb(zzbpx, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19394a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
