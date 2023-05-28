package com.google.android.gms.internal.ads;

public final class zzboj implements zzdti<zzcjv<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f19286a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f19287b;

    /* renamed from: c */
    private final zzdtu<zzckm> f19288c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f19289d;

    public zzboj(zzdtu<zzczt> zzdtu, zzdtu<zzbbl> zzdtu2, zzdtu<zzckm> zzdtu3, zzdtu<zzcoc> zzdtu4) {
        this.f19286a = zzdtu;
        this.f19287b = zzdtu2;
        this.f19288c = zzdtu3;
        this.f19289d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzcoe zzcoe = new zzcoe(this.f19286a.get(), this.f19287b.get(), this.f19289d.get(), this.f19288c.get());
        zzdto.m24236a(zzcoe, "Cannot return null from a non-@Nullable @Provides method");
        return zzcoe;
    }
}
