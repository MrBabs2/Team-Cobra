package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

public final class zzcnl implements zzcjv<zzcdb> {

    /* renamed from: a */
    private final Context f20662a;

    /* renamed from: b */
    private final zzcdn f20663b;

    /* renamed from: c */
    private final zzcdf f20664c;

    /* renamed from: d */
    private final zzcxv f20665d;

    /* renamed from: e */
    private final Executor f20666e;

    /* renamed from: f */
    private final zzbai f20667f;

    public zzcnl(Context context, zzbai zzbai, zzcxv zzcxv, Executor executor, zzcdf zzcdf, zzcdn zzcdn) {
        this.f20662a = context;
        this.f20665d = zzcxv;
        this.f20664c = zzcdf;
        this.f20666e = executor;
        this.f20667f = zzbai;
        this.f20663b = zzcdn;
    }

    /* renamed from: a */
    public final zzbbh<zzcdb> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzced zzced = new zzced();
        zzbbh<zzcdb> a = zzbar.m20542a(zzbar.m20539a(null), new C8032ul(this, zzcxm, zzced, zzcxu), this.f20666e);
        zzced.getClass();
        a.mo25573b(C8069vl.m18317a(zzced), this.f20666e);
        return a;
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        zzcxq zzcxq = zzcxm.f21132p;
        return (zzcxq == null || zzcxq.f21152a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28744a(zzcxm zzcxm, zzced zzced, zzcxu zzcxu, Object obj) throws Exception {
        zzbgz a = this.f20663b.mo28655a(this.f20665d.f21168e);
        a.mo25667a(zzcxm.f21114M);
        zzced.mo28666a(this.f20662a, a.getView());
        zzbbr zzbbr = new zzbbr();
        zzcdc a2 = this.f20664c.mo26174a(new zzbpr(zzcxu, zzcxm, (String) null), new zzcdd(new C8180yl(this, a, zzcxm, zzbbr), a));
        zzbbr.mo27904b(a2);
        zzahx.m19254a(a, (zzahy) a2.mo26209k());
        a2.mo25590d().mo28428a(new C8217zl(a), zzbbm.f18749b);
        a2.mo26205g().mo28659a(a, true);
        a2.mo26205g();
        zzcxq zzcxq = zzcxm.f21132p;
        zzbbh<?> a3 = zzcdp.m22419a(a, zzcxq.f21153b, zzcxq.f21152a);
        if (zzcxm.f21106E) {
            a3.mo25573b(new C7290am(a), this.f20666e);
        }
        a3.mo25573b(new C7327bm(a), this.f20666e);
        return zzbar.m20543a(a3, new C7364cm(a2), zzbbm.f18749b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28745a(zzbgz zzbgz, zzcxm zzcxm, zzbbr zzbbr, boolean z, Context context) {
        zzbgz zzbgz2;
        zzcxm zzcxm2 = zzcxm;
        try {
            zzcdc zzcdc = (zzcdc) zzbbr.get();
            if (zzbgz.mo25647I()) {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17990z0)).booleanValue()) {
                    zzbgz a = this.f20663b.mo28655a(this.f20665d.f21168e);
                    zzahx.m19254a(a, (zzahy) zzcdc.mo26209k());
                    zzced zzced = new zzced();
                    zzced.mo28666a(this.f20662a, a.getView());
                    zzcdc.mo26205g().mo28659a(a, true);
                    a.mo25697k().mo28128a((zzbij) new C8106wl(zzced, a));
                    zzbii k = a.mo25697k();
                    a.getClass();
                    k.mo28129a(C8143xl.m18454a(a));
                    a.mo25664a(zzcxm2.f21132p.f21153b, zzcxm2.f21132p.f21152a, (String) null);
                    zzbgz2 = a;
                    zzbgz2.mo25683d(true);
                    zzk.zzlg();
                    zzh zzh = new zzh(false, zzaxi.m20311n(this.f20662a), false, 0.0f, -1, z, zzcxm2.f21107F, zzcxm2.f21108G);
                    zzk.zzlf();
                    zzm.zza(context, new AdOverlayInfoParcel((zzxr) null, ((zzcdc) zzbbr.get()).mo26207i(), (zzu) null, zzbgz2, zzcxm2.f21109H, this.f20667f, zzcxm2.f21141y, zzh), true);
                }
            }
            zzbgz2 = zzbgz;
            zzbgz2.mo25683d(true);
            zzk.zzlg();
            zzh zzh2 = new zzh(false, zzaxi.m20311n(this.f20662a), false, 0.0f, -1, z, zzcxm2.f21107F, zzcxm2.f21108G);
            zzk.zzlf();
            zzm.zza(context, new AdOverlayInfoParcel((zzxr) null, ((zzcdc) zzbbr.get()).mo26207i(), (zzu) null, zzbgz2, zzcxm2.f21109H, this.f20667f, zzcxm2.f21141y, zzh2), true);
        } catch (Exception unused) {
        }
    }
}
