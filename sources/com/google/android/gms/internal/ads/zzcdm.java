package com.google.android.gms.internal.ads;

public final class zzcdm implements zzdti<zzcjv<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20007a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f20008b;

    /* renamed from: c */
    private final zzdtu<zzcnd> f20009c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f20010d;

    public zzcdm(zzdtu<zzczt> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<zzcnd> zzdtu3, zzdtu<zzcoc> zzdtu4) {
        this.f20007a = zzdtu;
        this.f20008b = zzdtu2;
        this.f20009c = zzdtu3;
        this.f20010d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzcoe zzcoe = new zzcoe(this.f20007a.get(), this.f20008b.get(), this.f20010d.get(), this.f20009c.get());
        zzdto.m24236a(zzcoe, "Cannot return null from a non-@Nullable @Provides method");
        return zzcoe;
    }
}
