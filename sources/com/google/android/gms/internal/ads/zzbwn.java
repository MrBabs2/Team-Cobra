package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbwn implements zzdti<zzbuz<zzbto>> {

    /* renamed from: a */
    private final zzbvz f19550a;

    /* renamed from: b */
    private final zzdtu<Executor> f19551b;

    private zzbwn(zzbvz zzbvz, zzdtu<Executor> zzdtu) {
        this.f19550a = zzbvz;
        this.f19551b = zzdtu;
    }

    /* renamed from: a */
    public static zzbwn m21981a(zzbvz zzbvz, zzdtu<Executor> zzdtu) {
        return new zzbwn(zzbvz, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(new C7693lf(this.f19550a), this.f19551b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
