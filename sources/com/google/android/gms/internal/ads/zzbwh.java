package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

public final class zzbwh implements zzdti<zzbuz<zzo>> {

    /* renamed from: a */
    private final zzdtu<zzbxa> f19543a;

    private zzbwh(zzbvz zzbvz, zzdtu<zzbxa> zzdtu) {
        this.f19543a = zzdtu;
    }

    /* renamed from: a */
    public static zzbwh m21976a(zzbvz zzbvz, zzdtu<zzbxa> zzdtu) {
        return new zzbwh(zzbvz, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19543a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
