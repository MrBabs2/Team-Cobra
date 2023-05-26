package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfs implements zzdti<Set<zzbuz<zzbrx>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20123a;

    /* renamed from: b */
    private final zzdtu<Executor> f20124b;

    private zzcfs(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20123a = zzdtu;
        this.f20124b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfs m22490a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfs(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrx>> a = zzcfp.m22478a(this.f20123a.get(), this.f20124b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
