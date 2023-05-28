package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfx implements zzdti<Set<zzbuz<zzbrw>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20134a;

    /* renamed from: b */
    private final zzdtu<Executor> f20135b;

    private zzcfx(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20134a = zzdtu;
        this.f20135b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfx m22496a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfx(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrw>> f = zzcfp.m22484f(this.f20134a.get(), this.f20135b.get());
        zzdto.m24236a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
