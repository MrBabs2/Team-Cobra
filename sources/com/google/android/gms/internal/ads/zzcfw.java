package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfw implements zzdti<Set<zzbuz<zzxr>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20132a;

    /* renamed from: b */
    private final zzdtu<Executor> f20133b;

    private zzcfw(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20132a = zzdtu;
        this.f20133b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfw m22495a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfw(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzxr>> g = zzcfp.m22485g(this.f20132a.get(), this.f20133b.get());
        zzdto.m24236a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
