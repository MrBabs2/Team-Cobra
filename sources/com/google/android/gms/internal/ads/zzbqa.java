package com.google.android.gms.internal.ads;

public final class zzbqa implements zzdti<zzbuz<zzbrw>> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19393a;

    private zzbqa(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        this.f19393a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqa m21781a(zzbpx zzbpx, zzdtu<zzbqe> zzdtu) {
        return new zzbqa(zzbpx, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19393a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
