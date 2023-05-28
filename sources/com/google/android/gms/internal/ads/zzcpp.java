package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

public final class zzcpp extends zzzd {

    /* renamed from: f */
    private final Context f20756f;

    /* renamed from: g */
    private final zzbjm f20757g;

    /* renamed from: h */
    private final zzcxx f20758h;

    /* renamed from: i */
    private final zzbzc f20759i;

    /* renamed from: j */
    private final zzcpw f20760j;

    /* renamed from: k */
    private final zzbro f20761k;

    /* renamed from: l */
    private zzbpk f20762l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f20763m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f20764n;

    public zzcpp(Context context, zzbjm zzbjm, zzcxx zzcxx, zzbzc zzbzc, zzyz zzyz) {
        zzcpw zzcpw = new zzcpw();
        this.f20760j = zzcpw;
        this.f20756f = context;
        this.f20757g = zzbjm;
        this.f20758h = zzcxx;
        this.f20759i = zzbzc;
        zzcpw.mo28762a(zzyz);
        this.f20761k = new C8181ym(this.f20760j, zzbzc.mo28570e());
    }

    /* renamed from: a */
    public final void mo25847a(zzxz zzxz) {
        mo25848a(zzxz, 1);
    }

    public final synchronized String getMediationAdapterClassName() {
        return this.f20763m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final /* synthetic */ void mo28759p1() {
        this.f20761k.onAdFailedToLoad(1);
    }

    /* renamed from: v */
    public final synchronized String mo25850v() {
        return this.f20764n;
    }

    /* renamed from: y */
    public final synchronized boolean mo25851y() throws RemoteException {
        return this.f20762l != null && this.f20762l.mo28390a();
    }

    /* renamed from: a */
    public final synchronized void mo25848a(zzxz zzxz, int i) {
        if (this.f20758h.mo28831b() == null) {
            zzbad.m20519b("Ad unit ID should not be null for AdLoader.");
            this.f20757g.mo28224a().execute(new C8144xm(this));
            return;
        }
        zzcya.m23108a(this.f20756f, zzxz.f22986k);
        this.f20763m = null;
        this.f20764n = null;
        zzcxx zzcxx = this.f20758h;
        zzcxx.mo28822a(zzxz);
        zzcxx.mo28817a(i);
        zzcxv c = zzcxx.mo28832c();
        zzbxp h = this.f20757g.mo28231h();
        zzbqy.zza zza = new zzbqy.zza();
        zza.mo28402a(this.f20756f);
        zza.mo28404a(c);
        zzbxp a = h.mo26770a(zza.mo28406a());
        zzbtv.zza zza2 = new zzbtv.zza();
        zza2.mo28445a((zzbsr) this.f20760j, this.f20757g.mo28224a());
        zza2.mo28442a(this.f20761k, this.f20757g.mo28224a());
        zza2.mo28444a((zzbrw) this.f20760j, this.f20757g.mo28224a());
        zza2.mo28446a((zzxr) this.f20760j, this.f20757g.mo28224a());
        zza2.mo28441a((zzbrl) this.f20760j, this.f20757g.mo28224a());
        zza2.mo28447a(c.f21177n, this.f20757g.mo28224a());
        zzbxo a2 = a.mo26771a(zza2.mo28448a()).mo26772a(new zzbxk(this.f20759i, this.f20760j.mo28761a())).mo26769a();
        a2.mo26810d().mo28836a(1);
        zzbpk a3 = a2.mo26805a();
        this.f20762l = a3;
        a3.mo28389a((zzban<zzbpc>) new C8218zm(this, a2));
    }
}
