package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfr implements zzdti<Set<zzbuz<zzbro>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20121a;

    /* renamed from: b */
    private final zzdtu<Executor> f20122b;

    private zzcfr(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20121a = zzdtu;
        this.f20122b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfr m22489a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfr(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbro>> d = zzcfp.m22482d(this.f20121a.get(), this.f20122b.get());
        zzdto.m24236a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
