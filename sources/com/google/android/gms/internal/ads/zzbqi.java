package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbqi implements zzdti<zzbuz<zzbrl>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f19407a;

    /* renamed from: b */
    private final zzdtu<Executor> f19408b;

    private zzbqi(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19407a = zzdtu;
        this.f19408b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqi m21793a(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbqi(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19407a.get(), this.f19408b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
