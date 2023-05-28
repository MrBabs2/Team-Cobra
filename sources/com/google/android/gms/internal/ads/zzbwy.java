package com.google.android.gms.internal.ads;

public final class zzbwy implements zzdti<zzcjv<zzbvx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f19564a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f19565b;

    /* renamed from: c */
    private final zzdtu<zzclq> f19566c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f19567d;

    public zzbwy(zzdtu<zzczt> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<zzclq> zzdtu3, zzdtu<zzcoc> zzdtu4) {
        this.f19564a = zzdtu;
        this.f19565b = zzdtu2;
        this.f19566c = zzdtu3;
        this.f19567d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzcoe zzcoe = new zzcoe(this.f19564a.get(), this.f19565b.get(), this.f19567d.get(), this.f19566c.get());
        zzdto.m24236a(zzcoe, "Cannot return null from a non-@Nullable @Provides method");
        return zzcoe;
    }
}
