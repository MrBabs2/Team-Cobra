package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzciy implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcjg> f20259a;

    /* renamed from: b */
    private final zzdtu<Executor> f20260b;

    private zzciy(zzdtu<zzcjg> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20259a = zzdtu;
        this.f20260b = zzdtu2;
    }

    /* renamed from: a */
    public static zzciy m22579a(zzdtu<zzcjg> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzciy(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20259a.get(), this.f20260b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
