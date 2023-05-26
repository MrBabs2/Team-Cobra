package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdaa implements zzdti<zzczt> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f21281a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f21282b;

    /* renamed from: c */
    private final zzdtu<C7704lq> f21283c;

    private zzdaa(zzdtu<zzbbl> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<C7704lq> zzdtu3) {
        this.f21281a = zzdtu;
        this.f21282b = zzdtu2;
        this.f21283c = zzdtu3;
    }

    /* renamed from: a */
    public static zzdaa m23181a(zzdtu<zzbbl> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<C7704lq> zzdtu3) {
        return new zzdaa(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzczt(this.f21281a.get(), this.f21282b.get(), this.f21283c.get());
    }
}
