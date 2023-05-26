package com.google.android.gms.internal.ads;

public final class zzbof implements zzdti<zzcjv<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<Boolean> f19277a;

    /* renamed from: b */
    private final zzdtu<zzcmo> f19278b;

    /* renamed from: c */
    private final zzdtu<zzcoe<zzbnf, zzams, zzcla>> f19279c;

    public zzbof(zzdtu<Boolean> zzdtu, zzdtu<zzcmo> zzdtu2, zzdtu<zzcoe<zzbnf, zzams, zzcla>> zzdtu3) {
        this.f19277a = zzdtu;
        this.f19278b = zzdtu2;
        this.f19279c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f19277a.get().booleanValue();
        zzcjv zzcjv = (zzcmo) this.f19278b.get();
        zzcjv zzcjv2 = (zzcoe) this.f19279c.get();
        if (!booleanValue) {
            zzcjv = zzcjv2;
        }
        zzdto.m24236a(zzcjv, "Cannot return null from a non-@Nullable @Provides method");
        return zzcjv;
    }
}
