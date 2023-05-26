package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcej implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f20065a;

    /* renamed from: b */
    private final zzdtu<Executor> f20066b;

    private zzcej(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20065a = zzdtu;
        this.f20066b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcej m22438a(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcej(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20065a.get(), this.f20066b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
