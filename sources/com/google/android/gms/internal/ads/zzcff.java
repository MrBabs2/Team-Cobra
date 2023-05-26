package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcff implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f20102a;

    /* renamed from: b */
    private final zzdtu<Executor> f20103b;

    private zzcff(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20102a = zzdtu;
        this.f20103b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcff m22464a(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcff(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20102a.get(), this.f20103b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
