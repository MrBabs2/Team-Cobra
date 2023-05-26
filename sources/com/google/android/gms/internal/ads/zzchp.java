package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzchp implements zzdti<zzchl> {

    /* renamed from: a */
    private final zzdtu<zzbtg> f20209a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f20210b;

    /* renamed from: c */
    private final zzdtu<zzcgn> f20211c;

    /* renamed from: d */
    private final zzdtu<zzbbl> f20212d;

    /* renamed from: e */
    private final zzdtu<ScheduledExecutorService> f20213e;

    /* renamed from: f */
    private final zzdtu<zzcji> f20214f;

    private zzchp(zzdtu<zzbtg> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<zzcgn> zzdtu3, zzdtu<zzbbl> zzdtu4, zzdtu<ScheduledExecutorService> zzdtu5, zzdtu<zzcji> zzdtu6) {
        this.f20209a = zzdtu;
        this.f20210b = zzdtu2;
        this.f20211c = zzdtu3;
        this.f20212d = zzdtu4;
        this.f20213e = zzdtu5;
        this.f20214f = zzdtu6;
    }

    /* renamed from: a */
    public static zzchp m22552a(zzdtu<zzbtg> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<zzcgn> zzdtu3, zzdtu<zzbbl> zzdtu4, zzdtu<ScheduledExecutorService> zzdtu5, zzdtu<zzcji> zzdtu6) {
        return new zzchp(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6);
    }

    public final /* synthetic */ Object get() {
        return new zzchl(this.f20209a.get(), this.f20210b.get(), this.f20211c.get(), this.f20212d.get(), this.f20213e.get(), this.f20214f.get());
    }
}
