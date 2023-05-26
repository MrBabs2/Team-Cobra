package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbqk implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f19411a;

    /* renamed from: b */
    private final zzdtu<Executor> f19412b;

    private zzbqk(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19411a = zzdtu;
        this.f19412b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqk m21795a(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbqk(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return m21796a(this.f19411a.get(), this.f19412b.get());
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m21796a(zzbme zzbme, Executor executor) {
        zzbuz<zzbsr> zzbuz = new zzbuz<>(zzbme, executor);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
