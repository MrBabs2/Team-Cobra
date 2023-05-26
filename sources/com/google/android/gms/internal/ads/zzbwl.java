package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbwl implements zzdti<zzbuz<zzbrl>> {

    /* renamed from: a */
    private final zzdtu<zzbxg> f19547a;

    /* renamed from: b */
    private final zzdtu<Executor> f19548b;

    private zzbwl(zzbvz zzbvz, zzdtu<zzbxg> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19547a = zzdtu;
        this.f19548b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbwl m21979a(zzbvz zzbvz, zzdtu<zzbxg> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbwl(zzbvz, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19547a.get(), this.f19548b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
