package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfq implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20119a;

    /* renamed from: b */
    private final zzdtu<Executor> f20120b;

    private zzcfq(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20119a = zzdtu;
        this.f20120b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfq m22488a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfq(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrl>> e = zzcfp.m22483e(this.f20119a.get(), this.f20120b.get());
        zzdto.m24236a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
