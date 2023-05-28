package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzchd implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<C7660kj> f20194a;

    /* renamed from: b */
    private final zzdtu<Executor> f20195b;

    private zzchd(zzdtu<C7660kj> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20194a = zzdtu;
        this.f20195b = zzdtu2;
    }

    /* renamed from: a */
    public static zzchd m22540a(zzdtu<C7660kj> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzchd(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20194a.get(), this.f20195b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
