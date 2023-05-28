package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcwu implements zzcva<zzcwt> {

    /* renamed from: a */
    private zzaqm f21084a;

    /* renamed from: b */
    private ScheduledExecutorService f21085b;

    /* renamed from: c */
    private Context f21086c;

    public zzcwu(zzaqm zzaqm, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f21084a = zzaqm;
        this.f21085b = scheduledExecutorService;
        this.f21086c = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcwt> mo25785a() {
        return zzbar.m20543a(zzbar.m20541a(this.f21084a.mo27569a(this.f21086c), ((Long) zzyt.m25670e().mo27163a(zzacu.f17835P1)).longValue(), TimeUnit.MILLISECONDS, this.f21085b), C7925rp.f16774a, (Executor) zzaxg.f18648a);
    }
}
