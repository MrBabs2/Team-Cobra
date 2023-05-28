package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzceh implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f20061a;

    /* renamed from: b */
    private final zzdtu<Executor> f20062b;

    private zzceh(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20061a = zzdtu;
        this.f20062b = zzdtu2;
    }

    /* renamed from: a */
    public static zzceh m22436a(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzceh(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20061a.get(), this.f20062b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
