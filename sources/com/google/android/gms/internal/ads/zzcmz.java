package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcmz<AdT> implements zzdti<zzcmx<AdT>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20632a;

    /* renamed from: b */
    private final zzdtu<zzcmu> f20633b;

    /* renamed from: c */
    private final zzdtu<zzbrm> f20634c;

    /* renamed from: d */
    private final zzdtu<zzdae> f20635d;

    /* renamed from: e */
    private final zzdtu<zzbpe<AdT>> f20636e;

    /* renamed from: f */
    private final zzdtu<Executor> f20637f;

    /* renamed from: g */
    private final zzdtu<ScheduledExecutorService> f20638g;

    private zzcmz(zzdtu<zzczt> zzdtu, zzdtu<zzcmu> zzdtu2, zzdtu<zzbrm> zzdtu3, zzdtu<zzdae> zzdtu4, zzdtu<zzbpe<AdT>> zzdtu5, zzdtu<Executor> zzdtu6, zzdtu<ScheduledExecutorService> zzdtu7) {
        this.f20632a = zzdtu;
        this.f20633b = zzdtu2;
        this.f20634c = zzdtu3;
        this.f20635d = zzdtu4;
        this.f20636e = zzdtu5;
        this.f20637f = zzdtu6;
        this.f20638g = zzdtu7;
    }

    /* renamed from: a */
    public static <AdT> zzcmz<AdT> m22711a(zzdtu<zzczt> zzdtu, zzdtu<zzcmu> zzdtu2, zzdtu<zzbrm> zzdtu3, zzdtu<zzdae> zzdtu4, zzdtu<zzbpe<AdT>> zzdtu5, zzdtu<Executor> zzdtu6, zzdtu<ScheduledExecutorService> zzdtu7) {
        return new zzcmz(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6, zzdtu7);
    }

    public final /* synthetic */ Object get() {
        return new zzcmx(this.f20632a.get(), this.f20633b.get(), this.f20634c.get(), this.f20635d.get(), this.f20636e.get(), this.f20637f.get(), this.f20638g.get());
    }
}
