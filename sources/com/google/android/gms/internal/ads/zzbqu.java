package com.google.android.gms.internal.ads;

public final class zzbqu implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzbqr> f19426a;

    private zzbqu(zzbqt zzbqt, zzdtu<zzbqr> zzdtu) {
        this.f19426a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqu m21808a(zzbqt zzbqt, zzdtu<zzbqr> zzdtu) {
        return new zzbqu(zzbqt, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19426a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
