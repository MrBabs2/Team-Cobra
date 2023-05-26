package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzciz implements zzdti<zzbuz<zzczz>> {

    /* renamed from: a */
    private final zzdtu<zzcjk> f20261a;

    /* renamed from: b */
    private final zzdtu<Executor> f20262b;

    private zzciz(zzdtu<zzcjk> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20261a = zzdtu;
        this.f20262b = zzdtu2;
    }

    /* renamed from: a */
    public static zzciz m22580a(zzdtu<zzcjk> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzciz(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20261a.get(), this.f20262b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
