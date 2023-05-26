package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzcig extends zzarn {

    /* renamed from: f */
    private final Context f20233f;

    /* renamed from: g */
    private final Executor f20234g;

    /* renamed from: h */
    private final zzasm f20235h;

    /* renamed from: i */
    private final zzasl f20236i;

    /* renamed from: j */
    private final zzblp f20237j;

    public zzcig(Context context, Executor executor, zzasm zzasm, zzblp zzblp, zzasl zzasl) {
        zzacu.m18983a(context);
        this.f20233f = context;
        this.f20234g = executor;
        this.f20235h = zzasm;
        this.f20236i = zzasl;
        this.f20237j = zzblp;
    }

    /* renamed from: a */
    public final zzari mo27587a(zzarg zzarg) throws RemoteException {
        return null;
    }

    /* renamed from: a */
    public final zzbbh<InputStream> mo28700a(zzarx zzarx) {
        zzalr a = zzk.zzlt().mo27371a(this.f20233f, zzbai.m20531d());
        zzcvs a2 = this.f20237j.mo28222a(zzarx);
        C7697lj ljVar = new C7697lj(a2);
        zzczc zzczc = C7734mj.f16246a;
        zzalj<I, O> a3 = a.mo27373a("AFMA_getAdDictionary", zzalo.f18180b, C7771nj.f16392a);
        zzalj<I, O> a4 = a.mo27373a("google.afma.response.normalize", zzcir.f20238d, zzalo.f18181c);
        zzciu zzciu = new zzciu(this.f20233f, zzarx.f18439g.f18742f, this.f20235h, zzarx.f18444l);
        zzczt c = a2.mo25731c();
        zzcze a5 = c.mo28850a(zzczs.GMS_SIGNALS, zzbar.m20539a(zzarx.f18438f)).mo28858a(ljVar).mo28860a(zzczc).mo28856a();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17808I2)).booleanValue()) {
            zzaln<JSONObject> zzaln = zzalo.f18180b;
            return c.mo28850a(zzczs.AD_REQUEST, a5).mo28858a(a.mo27373a("google.afma.request.getAdResponse", zzaln, zzaln)).mo28860a(C7808oj.f16497a).mo28856a();
        }
        zzcze<E, O2> a6 = c.mo28850a(zzczs.BUILD_URL, a5).mo28858a(a3).mo28856a();
        zzcze a7 = c.mo28848a(zzczs.HTTP, (zzbbh<?>[]) new zzbbh[]{a6, a5}).mo28852a(new C7845pj(a5, a6)).mo28860a(zzciu).mo28856a();
        return c.mo28848a(zzczs.PRE_PROCESS, (zzbbh<?>[]) new zzbbh[]{a5, a6, a7}).mo28852a(new C7882qj(a7, a5, a6)).mo28858a(a4).mo28856a();
    }

    /* renamed from: a */
    public final void mo27588a(zzarg zzarg, zzarp zzarp) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo27590b(zzarx zzarx, zzarr zzarr) {
        zzbbh zzbbh;
        zzalr a = zzk.zzlt().mo27371a(this.f20233f, zzbai.m20531d());
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17852T2)).booleanValue()) {
            zzbbh = zzbar.m20538a((Throwable) new Exception("Signal collection disabled."));
        } else {
            zzcvs a2 = this.f20237j.mo28222a(zzarx);
            zzcvb<JSONObject> b = this.f20237j.mo28222a(zzarx).mo25730b();
            zzbbh = a2.mo25731c().mo28850a(zzczs.GET_SIGNALS, zzbar.m20539a(zzarx.f18438f)).mo28858a(new C7956sj(b)).mo28863a(zzczs.JS_SIGNALS).mo28858a(a.mo27373a("google.afma.request.getSignals", zzalo.f18180b, zzalo.f18181c)).mo28856a();
        }
        m22567a((zzbbh<InputStream>) zzbbh, zzarr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final /* synthetic */ void mo28701p1() {
        zzbao.m20536a(this.f20236i.mo27612a(), "persistFlags");
    }

    /* renamed from: a */
    public final void mo27589a(zzarx zzarx, zzarr zzarr) {
        zzbbh<InputStream> a = mo28700a(zzarx);
        m22567a(a, zzarr);
        a.mo25573b(new C7919rj(this), this.f20234g);
    }

    /* renamed from: a */
    private final void m22567a(zzbbh<InputStream> zzbbh, zzarr zzarr) {
        zzbar.m20546a(zzbar.m20542a(zzbbh, new C7993tj(this), (Executor) zzaxg.f18648a), new C8030uj(this, zzarr), zzbbm.f18749b);
    }
}
