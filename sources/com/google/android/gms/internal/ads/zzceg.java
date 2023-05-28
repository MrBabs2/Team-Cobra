package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzceg implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f20059a;

    /* renamed from: b */
    private final zzdtu<Executor> f20060b;

    private zzceg(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20059a = zzdtu;
        this.f20060b = zzdtu2;
    }

    /* renamed from: a */
    public static zzceg m22435a(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzceg(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20059a.get(), this.f20060b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
