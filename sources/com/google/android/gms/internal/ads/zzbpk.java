package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbpk {

    /* renamed from: a */
    private final Executor f19375a;

    /* renamed from: b */
    private final ScheduledExecutorService f19376b;

    /* renamed from: c */
    private final zzbbh<zzbph> f19377c;

    /* renamed from: d */
    private volatile boolean f19378d = true;

    public zzbpk(Executor executor, ScheduledExecutorService scheduledExecutorService, zzbbh<zzbph> zzbbh) {
        this.f19375a = executor;
        this.f19376b = scheduledExecutorService;
        this.f19377c = zzbbh;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m21764b() {
        this.f19378d = false;
    }

    /* renamed from: a */
    public final void mo28389a(zzban<zzbpc> zzban) {
        zzbar.m20546a(this.f19377c, new C7654kd(this, zzban), this.f19375a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21763a(List<? extends zzbbh<? extends zzbpc>> list, zzban<zzbpc> zzban) {
        if (list == null || list.isEmpty()) {
            this.f19375a.execute(new C7539hd(zzban));
            return;
        }
        zzbbh<B> a = zzbar.m20539a(null);
        for (zzbbh jdVar : list) {
            a = zzbar.m20542a(zzbar.m20544a(a, Throwable.class, new C7576id(zzban), this.f19375a), new C7617jd(this, zzban, jdVar), this.f19375a);
        }
        zzbar.m20546a(a, new C7691ld(this, zzban), this.f19375a);
    }

    /* renamed from: a */
    public final boolean mo28390a() {
        return this.f19378d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28388a(zzban zzban, zzbbh zzbbh, zzbpc zzbpc) throws Exception {
        if (zzbpc != null) {
            zzban.mo25565a(zzbpc);
        }
        return zzbar.m20541a(zzbbh, ((Long) zzyt.m25670e().mo27163a(zzacu.f17899e1)).longValue(), TimeUnit.MILLISECONDS, this.f19376b);
    }
}
