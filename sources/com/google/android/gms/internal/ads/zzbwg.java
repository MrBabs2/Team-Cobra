package com.google.android.gms.internal.ads;

public final class zzbwg implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzbxa> f19542a;

    private zzbwg(zzbvz zzbvz, zzdtu<zzbxa> zzdtu) {
        this.f19542a = zzdtu;
    }

    /* renamed from: a */
    public static zzbwg m21975a(zzbvz zzbvz, zzdtu<zzbxa> zzdtu) {
        return new zzbwg(zzbvz, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19542a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
