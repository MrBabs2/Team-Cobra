package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcgl implements zzdti<zzcgb> {

    /* renamed from: a */
    private final zzdtu<Executor> f20153a;

    /* renamed from: b */
    private final zzdtu<Context> f20154b;

    /* renamed from: c */
    private final zzdtu<Executor> f20155c;

    /* renamed from: d */
    private final zzdtu<zzclc> f20156d;

    /* renamed from: e */
    private final zzdtu<ScheduledExecutorService> f20157e;

    public zzcgl(zzdtu<Executor> zzdtu, zzdtu<Context> zzdtu2, zzdtu<Executor> zzdtu3, zzdtu<zzclc> zzdtu4, zzdtu<ScheduledExecutorService> zzdtu5) {
        this.f20153a = zzdtu;
        this.f20154b = zzdtu2;
        this.f20155c = zzdtu3;
        this.f20156d = zzdtu4;
        this.f20157e = zzdtu5;
    }

    public final /* synthetic */ Object get() {
        return new zzcgb(this.f20153a.get(), this.f20154b.get(), this.f20155c.get(), this.f20156d.get(), this.f20157e.get());
    }
}
