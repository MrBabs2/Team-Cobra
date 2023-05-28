package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcfg implements zzdti<zzbuz<zzczz>> {

    /* renamed from: a */
    private final zzdtu<zzcfk> f20104a;

    /* renamed from: b */
    private final zzdtu<Executor> f20105b;

    private zzcfg(zzdtu<zzcfk> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20104a = zzdtu;
        this.f20105b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfg m22465a(zzdtu<zzcfk> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfg(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20104a.get(), this.f20105b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
