package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

public final class zzcle implements zzcjv<zzbvx> {

    /* renamed from: a */
    private final Context f20549a;

    /* renamed from: b */
    private final zzcdn f20550b;

    /* renamed from: c */
    private final zzbws f20551c;

    /* renamed from: d */
    private final zzcxv f20552d;

    /* renamed from: e */
    private final Executor f20553e;

    /* renamed from: f */
    private final zzbai f20554f;

    public zzcle(Context context, zzbai zzbai, zzcxv zzcxv, Executor executor, zzbws zzbws, zzcdn zzcdn) {
        this.f20549a = context;
        this.f20552d = zzcxv;
        this.f20551c = zzbws;
        this.f20553e = executor;
        this.f20554f = zzbai;
        this.f20550b = zzcdn;
    }

    /* renamed from: a */
    public final zzbbh<zzbvx> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzced zzced = new zzced();
        zzbbh<zzbvx> a = zzbar.m20542a(zzbar.m20539a(null), new C8031uk(this, zzcxm, zzced, zzcxu), this.f20553e);
        zzced.getClass();
        a.mo25573b(C8068vk.m18316a(zzced), this.f20553e);
        return a;
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        zzcxq zzcxq = zzcxm.f21132p;
        return (zzcxq == null || zzcxq.f21152a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28735a(zzcxm zzcxm, zzced zzced, zzcxu zzcxu, Object obj) throws Exception {
        zzbgz a = this.f20550b.mo28655a(this.f20552d.f21168e);
        a.mo25667a(zzcxm.f21114M);
        zzced.mo28666a(this.f20549a, a.getView());
        zzbbr zzbbr = new zzbbr();
        zzbvy a2 = this.f20551c.mo26025a(new zzbpr(zzcxu, zzcxm, (String) null), new zzbvz(new C8105wk(this, a, zzcxm, zzbbr), a));
        zzbbr.mo27904b(a2);
        a2.mo25590d().mo28428a(new C8142xk(a), zzbbm.f18749b);
        a2.mo26080g().mo28659a(a, true);
        a2.mo26080g();
        zzcxq zzcxq = zzcxm.f21132p;
        zzbbh<?> a3 = zzcdp.m22419a(a, zzcxq.f21153b, zzcxq.f21152a);
        if (zzcxm.f21106E) {
            a3.mo25573b(new C8179yk(a), this.f20553e);
        }
        a3.mo25573b(new C8216zk(a), this.f20553e);
        return zzbar.m20543a(a3, new C7289al(a2), zzbbm.f18749b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28736a(zzbgz zzbgz, zzcxm zzcxm, zzbbr zzbbr, boolean z, Context context) {
        zzcxm zzcxm2 = zzcxm;
        try {
            zzbgz.mo25683d(true);
            zzk.zzlg();
            zzh zzh = new zzh(false, zzaxi.m20311n(this.f20549a), false, 0.0f, -1, z, zzcxm2.f21107F, false);
            zzk.zzlf();
            Context context2 = context;
            zzm.zza(context2, new AdOverlayInfoParcel((zzxr) null, ((zzbvy) zzbbr.get()).mo26083j(), (zzu) null, zzbgz, zzcxm2.f21109H, this.f20554f, zzcxm2.f21141y, zzh), true);
        } catch (Exception unused) {
        }
    }
}
