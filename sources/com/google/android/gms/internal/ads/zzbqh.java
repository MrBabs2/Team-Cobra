package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbqh implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f19405a;

    /* renamed from: b */
    private final zzdtu<Executor> f19406b;

    private zzbqh(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19405a = zzdtu;
        this.f19406b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqh m21792a(zzdtu<zzbme> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbqh(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19405a.get(), this.f19406b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
