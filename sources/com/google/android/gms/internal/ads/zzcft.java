package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcft implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzcfp f20125a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f20126b;

    /* renamed from: c */
    private final zzdtu<Executor> f20127c;

    private zzcft(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20125a = zzcfp;
        this.f20126b = zzdtu;
        this.f20127c = zzdtu2;
    }

    /* renamed from: a */
    public static zzcft m22491a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcft(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return m22492a(this.f20125a, this.f20126b.get(), this.f20127c.get());
    }

    /* renamed from: a */
    public static Set<zzbuz<zzbsr>> m22492a(zzcfp zzcfp, zzcfz zzcfz, Executor executor) {
        Set<zzbuz<zzbsr>> c = zzcfp.m22481c(zzcfz, executor);
        zzdto.m24236a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
