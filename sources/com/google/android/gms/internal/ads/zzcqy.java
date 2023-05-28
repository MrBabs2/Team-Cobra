package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

public final class zzcqy implements zzdti<zzbbh<zzcrc>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20826a;

    /* renamed from: b */
    private final zzdtu<zzcqz> f20827b;

    /* renamed from: c */
    private final zzdtu<zzbbh<zzarx>> f20828c;

    public zzcqy(zzdtu<zzczt> zzdtu, zzdtu<zzcqz> zzdtu2, zzdtu<zzbbh<zzarx>> zzdtu3) {
        this.f20826a = zzdtu;
        this.f20827b = zzdtu2;
        this.f20828c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        zzcze a = this.f20826a.get().mo28850a(zzczs.GENERATE_SIGNALS, this.f20828c.get()).mo28858a(this.f20827b.get()).mo28857a((long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17800G2)).intValue(), TimeUnit.SECONDS).mo28856a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
