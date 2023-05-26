package com.google.android.gms.internal.ads;

public final class zzbnv implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbnk f19263a;

    /* renamed from: b */
    private final zzdtu<zzbot> f19264b;

    public zzbnv(zzbnk zzbnk, zzdtu<zzbot> zzdtu) {
        this.f19263a = zzbnk;
        this.f19264b = zzdtu;
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m21414a(zzbnk zzbnk, zzbot zzbot) {
        zzbuz<zzbsr> zzbuz = new zzbuz<>(zzbot, zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }

    public final /* synthetic */ Object get() {
        return m21414a(this.f19263a, this.f19264b.get());
    }
}
