package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcwq implements zzcva<zzcwp> {

    /* renamed from: a */
    private zzamg f21075a;

    /* renamed from: b */
    private ScheduledExecutorService f21076b;

    /* renamed from: c */
    private boolean f21077c;

    /* renamed from: d */
    private ApplicationInfo f21078d;

    public zzcwq(zzamg zzamg, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f21075a = zzamg;
        this.f21076b = scheduledExecutorService;
        this.f21077c = z;
        this.f21078d = applicationInfo;
    }

    /* renamed from: a */
    public final zzbbh<zzcwp> mo25785a() {
        if (!this.f21077c) {
            return zzbar.m20538a((Throwable) new Exception("Auto Collect Location is false."));
        }
        return zzbar.m20543a(zzbar.m20541a(this.f21075a.mo27379a(this.f21078d), ((Long) zzyt.m25670e().mo27163a(zzacu.f17819L1)).longValue(), TimeUnit.MILLISECONDS, this.f21076b), C7888qp.f16672a, (Executor) zzaxg.f18648a);
    }
}
