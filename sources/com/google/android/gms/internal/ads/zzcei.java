package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcei implements zzdti<zzbuz<zzbrw>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f20063a;

    /* renamed from: b */
    private final zzdtu<Executor> f20064b;

    private zzcei(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20063a = zzdtu;
        this.f20064b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcei m22437a(zzdtu<zzcep> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcei(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20063a.get(), this.f20064b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
