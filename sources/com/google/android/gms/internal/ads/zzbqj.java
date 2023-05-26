package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbqj implements zzdti<zzbuz<zzbrw>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f19409a;

    /* renamed from: b */
    private final zzdtu<Executor> f19410b;

    private zzbqj(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19409a = zzdtu;
        this.f19410b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqj m21794a(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbqj(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19409a.get(), this.f19410b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
