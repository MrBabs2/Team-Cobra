package com.google.android.gms.internal.ads;

public final class zzbpz implements zzdti<zzbuz<zzbrl>> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19392a;

    private zzbpz(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        this.f19392a = zzdtu;
    }

    /* renamed from: a */
    public static zzbpz m21780a(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        return new zzbpz(zzbpx, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19392a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
