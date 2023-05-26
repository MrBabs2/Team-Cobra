package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzckv implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final zzboc f20336a;

    /* renamed from: b */
    private final zzckb f20337b;

    /* renamed from: c */
    private final zzbbl f20338c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzbrm f20339d;

    /* renamed from: e */
    private final ScheduledExecutorService f20340e;

    public zzckv(zzboc zzboc, zzckb zzckb, zzbrm zzbrm, ScheduledExecutorService scheduledExecutorService, zzbbl zzbbl) {
        this.f20336a = zzboc;
        this.f20337b = zzckb;
        this.f20339d = zzbrm;
        this.f20340e = scheduledExecutorService;
        this.f20338c = zzbbl;
    }

    /* renamed from: a */
    public final zzbbh<zzbnf> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        return this.f20338c.mo27892a(new C7920rk(this, zzcxu, zzcxm));
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        return zzcxu.f21162a.f21156a.mo28816a() != null && this.f20337b.mo28717b(zzcxu, zzcxm);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzbnf mo28726c(zzcxu zzcxu, zzcxm zzcxm) throws Exception {
        return this.f20336a.mo25825a(new zzbpr(zzcxu, zzcxm, (String) null), new zzbop(zzcxu.f21162a.f21156a.mo28816a(), new C7957sk(this, zzcxu, zzcxm))).mo25921a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28727d(zzcxu zzcxu, zzcxm zzcxm) {
        zzbar.m20546a(zzbar.m20541a(this.f20337b.mo28716a(zzcxu, zzcxm), (long) zzcxm.f21110I, TimeUnit.SECONDS, this.f20340e), new C7994tk(this), (Executor) this.f20338c);
    }
}
