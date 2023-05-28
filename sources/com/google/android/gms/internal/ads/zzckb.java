package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzckb implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final zzboc f20305a;

    /* renamed from: b */
    private final Context f20306b;

    /* renamed from: c */
    private final zzcdn f20307c;

    /* renamed from: d */
    private final zzcxv f20308d;

    /* renamed from: e */
    private final Executor f20309e;

    /* renamed from: f */
    private final zzbam<zzcxm, zzayb> f20310f;

    public zzckb(zzboc zzboc, Context context, Executor executor, zzcdn zzcdn, zzcxv zzcxv, zzbam<zzcxm, zzayb> zzbam) {
        this.f20306b = context;
        this.f20305a = zzboc;
        this.f20309e = executor;
        this.f20307c = zzcdn;
        this.f20308d = zzcxv;
        this.f20310f = zzbam;
    }

    /* renamed from: a */
    public final zzbbh<zzbnf> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        return zzbar.m20542a(zzbar.m20539a(null), new C7473fk(this, zzcxu, zzcxm), this.f20309e);
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        zzcxq zzcxq = zzcxm.f21132p;
        return (zzcxq == null || zzcxq.f21152a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28724a(zzbgz zzbgz) {
        zzbgz.mo25724v();
        zzbhq e = zzbgz.mo25685e();
        zzacd zzacd = this.f20308d.f21165b;
        if (zzacd != null && e != null) {
            e.mo28162b(zzacd);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28723a(zzcxu zzcxu, zzcxm zzcxm, Object obj) throws Exception {
        zzcxn zzcxn;
        zzyd a = zzcxy.m23100a(this.f20306b, zzcxm.f21134r);
        zzbgz a2 = this.f20307c.mo28655a(a);
        a2.mo25667a(zzcxm.f21114M);
        zzboc zzboc = this.f20305a;
        zzbpr zzbpr = new zzbpr(zzcxu, zzcxm, (String) null);
        zzcec zzcec = new zzcec(this.f20306b, a2.getView(), this.f20310f.apply(zzcxm));
        a2.getClass();
        zzbpb a3 = C7509gk.m17012a(a2);
        if (a.f23024n) {
            zzcxn = new zzcxn(-3, 0, true);
        } else {
            zzcxn = new zzcxn(a.f23020j, a.f23017g, false);
        }
        zzbng a4 = zzboc.mo25824a(zzbpr, new zzbnk(zzcec, a2, a3, zzcxn));
        a4.mo25868h().mo28659a(a2, false);
        a4.mo25590d().mo28428a(new C7546hk(a2), zzbbm.f18749b);
        a4.mo25868h();
        zzcxq zzcxq = zzcxm.f21132p;
        zzbbh<?> a5 = zzcdp.m22419a(a2, zzcxq.f21153b, zzcxq.f21152a);
        if (zzcxm.f21106E) {
            a2.getClass();
            a5.mo25573b(C7583ik.m17187a(a2), this.f20309e);
        }
        a5.mo25573b(new C7624jk(this, a2), this.f20309e);
        return zzbar.m20543a(a5, new C7661kk(a4), zzbbm.f18749b);
    }
}
