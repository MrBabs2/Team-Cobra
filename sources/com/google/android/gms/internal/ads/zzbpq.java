package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzbpq implements zzdti<zzbpk> {

    /* renamed from: a */
    private final zzdtu<Executor> f19379a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f19380b;

    /* renamed from: c */
    private final zzdtu<zzbbh<zzbph>> f19381c;

    public zzbpq(zzdtu<Executor> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<zzbbh<zzbph>> zzdtu3) {
        this.f19379a = zzdtu;
        this.f19380b = zzdtu2;
        this.f19381c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzbpk(this.f19379a.get(), this.f19380b.get(), this.f19381c.get());
    }
}
