package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcfe implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f20100a;

    /* renamed from: b */
    private final zzdtu<Executor> f20101b;

    private zzcfe(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20100a = zzdtu;
        this.f20101b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfe m22463a(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfe(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20100a.get(), this.f20101b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
