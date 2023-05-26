package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcek implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f20067a;

    /* renamed from: b */
    private final zzdtu<Executor> f20068b;

    private zzcek(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20067a = zzdtu;
        this.f20068b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcek m22439a(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcek(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20067a.get(), this.f20068b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
