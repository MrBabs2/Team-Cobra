package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbmr implements zzdti<zzbmg> {

    /* renamed from: a */
    private final zzdtu<zzty> f19198a;

    /* renamed from: b */
    private final zzdtu<zzaly> f19199b;

    /* renamed from: c */
    private final zzdtu<Executor> f19200c;

    private zzbmr(zzdtu<zzty> zzdtu, zzdtu<zzaly> zzdtu2, zzdtu<Executor> zzdtu3) {
        this.f19198a = zzdtu;
        this.f19199b = zzdtu2;
        this.f19200c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbmr m21373a(zzdtu<zzty> zzdtu, zzdtu<zzaly> zzdtu2, zzdtu<Executor> zzdtu3) {
        return new zzbmr(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        zzbmg zzbmg = new zzbmg(this.f19198a.get().mo29774d(), this.f19199b.get(), this.f19200c.get());
        zzdto.m24236a(zzbmg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbmg;
    }
}
