package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfu implements zzdti<Set<zzbuz<zzbtk>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20128a;

    /* renamed from: b */
    private final zzdtu<Executor> f20129b;

    private zzcfu(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20128a = zzdtu;
        this.f20129b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfu m22493a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfu(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbtk>> i = zzcfp.m22487i(this.f20128a.get(), this.f20129b.get());
        zzdto.m24236a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
