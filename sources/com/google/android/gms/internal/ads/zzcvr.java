package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcvr implements zzdti<zzcvo> {

    /* renamed from: a */
    private final zzdtu<zzawi> f21037a;

    /* renamed from: b */
    private final zzdtu<Context> f21038b;

    /* renamed from: c */
    private final zzdtu<ScheduledExecutorService> f21039c;

    /* renamed from: d */
    private final zzdtu<Executor> f21040d;

    public zzcvr(zzdtu<zzawi> zzdtu, zzdtu<Context> zzdtu2, zzdtu<ScheduledExecutorService> zzdtu3, zzdtu<Executor> zzdtu4) {
        this.f21037a = zzdtu;
        this.f21038b = zzdtu2;
        this.f21039c = zzdtu3;
        this.f21040d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        return new zzcvo(this.f21037a.get(), this.f21038b.get(), this.f21039c.get(), this.f21040d.get());
    }
}
