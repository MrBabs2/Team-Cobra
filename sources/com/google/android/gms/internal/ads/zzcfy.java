package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfy implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20136a;

    /* renamed from: b */
    private final zzdtu<Executor> f20137b;

    private zzcfy(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20136a = zzdtu;
        this.f20137b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfy m22497a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfy(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzczz>> h = zzcfp.m22486h(this.f20136a.get(), this.f20137b.get());
        zzdto.m24236a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
