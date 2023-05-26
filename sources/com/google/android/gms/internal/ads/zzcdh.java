package com.google.android.gms.internal.ads;

public final class zzcdh implements zzdti<zzcjv<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzcoe<zzcdb, zzams, zzclb>> f19997a;

    /* renamed from: b */
    private final zzdtu<zzcoe<zzcdb, zzams, zzcla>> f19998b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f19999c;

    public zzcdh(zzdtu<zzcoe<zzcdb, zzams, zzclb>> zzdtu, zzdtu<zzcoe<zzcdb, zzams, zzcla>> zzdtu2, zzdtu<zzcxv> zzdtu3) {
        this.f19997a = zzdtu;
        this.f19998b = zzdtu2;
        this.f19999c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        zzcjv zzcjv;
        zzdtu<zzcoe<zzcdb, zzams, zzclb>> zzdtu = this.f19997a;
        zzdtu<zzcoe<zzcdb, zzams, zzcla>> zzdtu2 = this.f19998b;
        if (this.f19999c.get().f21178o.contains("new_rewarded")) {
            zzcjv = zzdtu2.get();
        } else {
            zzcjv = zzdtu.get();
        }
        zzdto.m24236a(zzcjv, "Cannot return null from a non-@Nullable @Provides method");
        return zzcjv;
    }
}
