package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbqg implements zzdti<zzbuz<zzbvg>> {

    /* renamed from: a */
    private final zzdtu<zzbvh> f19403a;

    /* renamed from: b */
    private final zzdtu<Executor> f19404b;

    private zzbqg(zzdtu<zzbvh> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19403a = zzdtu;
        this.f19404b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqg m21791a(zzdtu<zzbvh> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzbqg(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19403a.get(), this.f19404b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
