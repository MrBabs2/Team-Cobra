package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

public final class zzcqj extends zzasx {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzbbh<zzcdb> f20808f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzcdb f20809g;

    /* renamed from: h */
    private final zzbjm f20810h;

    /* renamed from: i */
    private final Context f20811i;

    /* renamed from: j */
    private final zzcqc f20812j = new zzcqc();

    /* renamed from: k */
    private final zzcpx f20813k = new zzcpx();

    /* renamed from: l */
    private final zzcpy f20814l = new zzcpy();

    /* renamed from: m */
    private zzbss f20815m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f20816n = false;

    /* renamed from: o */
    private final zzcxx f20817o = new zzcxx();

    /* renamed from: p */
    private boolean f20818p = false;

    public zzcqj(zzbjm zzbjm, Context context) {
        this.f20810h = zzbjm;
        this.f20811i = context;
    }

    /* renamed from: s1 */
    private final synchronized boolean m22906s1() {
        return this.f20809g != null && !this.f20809g.mo28652f();
    }

    /* renamed from: B */
    public final synchronized void mo27121B(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.m16042a("resume must be called on the main UI thread.");
        if (this.f20809g != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.m16390H(iObjectWrapper);
            }
            this.f20809g.mo28653g().mo28411b(context);
        }
    }

    /* renamed from: F */
    public final synchronized void mo27122F(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.m16042a("pause must be called on the main UI thread.");
        if (this.f20809g != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.m16390H(iObjectWrapper);
            }
            this.f20809g.mo28653g().mo28409a(context);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27125a(zzath zzath) throws RemoteException {
        Preconditions.m16042a("loadAd must be called on the main UI thread.");
        this.f20816n = false;
        if (zzath.f18510g == null) {
            zzbad.m20519b("Ad unit ID should not be null for rewarded video ad.");
            this.f20810h.mo28224a().execute(new C7512gn(this));
        } else if (!zzacw.m18986a(zzath.f18510g)) {
            if (this.f20808f == null) {
                if (m22906s1()) {
                    if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17784C2)).booleanValue()) {
                        return;
                    }
                }
                zzcya.m23108a(this.f20811i, zzath.f18509f.f22986k);
                this.f20809g = null;
                zzcxx zzcxx = this.f20817o;
                zzcxx.mo28825a(zzath.f18510g);
                zzcxx.mo28823a(zzyd.m25647d());
                zzcxx.mo28822a(zzath.f18509f);
                zzcxv c = zzcxx.mo28832c();
                zzcdg i = this.f20810h.mo28232i();
                zzbqy.zza zza = new zzbqy.zza();
                zza.mo28402a(this.f20811i);
                zza.mo28404a(c);
                zza.mo28405a((String) null);
                zzcdg a = i.mo26133a(zza.mo28406a());
                zzbtv.zza zza2 = new zzbtv.zza();
                zza2.mo28441a((zzbrl) this.f20812j, this.f20810h.mo28224a());
                zza2.mo28445a((zzbsr) new C7627jn(this, this.f20812j), this.f20810h.mo28224a());
                zza2.mo28442a((zzbro) this.f20812j, this.f20810h.mo28224a());
                zza2.mo28440a((AdMetadataListener) this.f20813k, this.f20810h.mo28224a());
                zza2.mo28439a((AppEventListener) this.f20814l, this.f20810h.mo28224a());
                zzcdf a2 = a.mo26134a(zza2.mo28448a()).mo26132a();
                this.f20815m = a2.mo26176c();
                zzbbh<zzcdb> b = a2.mo26175b();
                this.f20808f = b;
                zzbar.m20546a(b, new C7549hn(this, a2), this.f20810h.mo28224a());
            }
        }
    }

    public final void destroy() throws RemoteException {
        mo27131k((IObjectWrapper) null);
    }

    public final Bundle getAdMetadata() {
        zzbss zzbss;
        Preconditions.m16042a("getAdMetadata can only be called from the UI thread.");
        if (!this.f20816n || (zzbss = this.f20815m) == null) {
            return new Bundle();
        }
        return zzbss.mo28420w();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.f20809g == null) {
            return null;
        }
        return this.f20809g.mo28385b();
    }

    public final boolean isLoaded() throws RemoteException {
        Preconditions.m16042a("isLoaded must be called on the main UI thread.");
        return m22906s1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27131k(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m16042a((java.lang.String) r0)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzcpx r0 = r2.f20813k     // Catch:{ all -> 0x0028 }
            r1 = 0
            r0.mo28763a(r1)     // Catch:{ all -> 0x0028 }
            r0 = 0
            r2.f20816n = r0     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzcdb r0 = r2.f20809g     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            if (r3 != 0) goto L_0x0016
            goto L_0x001d
        L_0x0016:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.m16390H(r3)     // Catch:{ all -> 0x0028 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0028 }
        L_0x001d:
            com.google.android.gms.internal.ads.zzcdb r3 = r2.f20809g     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzbry r3 = r3.mo28653g()     // Catch:{ all -> 0x0028 }
            r3.mo28412d(r1)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqj.mo27131k(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* renamed from: o */
    public final void mo27132o(String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final void mo28774p1() {
        this.f20816n = true;
    }

    public final void pause() throws RemoteException {
        mo27122F((IObjectWrapper) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public final void mo28775q1() {
        this.f20813k.onAdMetadataChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final /* synthetic */ void mo28776r1() {
        this.f20812j.onAdFailedToLoad(1);
    }

    public final void resume() throws RemoteException {
        mo27121B((IObjectWrapper) null);
    }

    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17782C0)).booleanValue()) {
            Preconditions.m16042a("#008 Must be called on the main UI thread.: setCustomData");
            this.f20817o.mo28833c(str);
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.m16042a("setImmersiveMode must be called on the main UI thread.");
        this.f20818p = z;
    }

    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.m16042a("setUserId must be called on the main UI thread.");
        this.f20817o.mo28829b(str);
    }

    public final synchronized void show() throws RemoteException {
        mo27139v((IObjectWrapper) null);
    }

    /* renamed from: v */
    public final synchronized void mo27139v(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.m16042a("showAd must be called on the main UI thread.");
        if (this.f20809g != null) {
            if (iObjectWrapper != null) {
                Object H = ObjectWrapper.m16390H(iObjectWrapper);
                if (H instanceof Activity) {
                    activity = (Activity) H;
                    this.f20809g.mo28651a(this.f20818p, activity);
                }
            }
            activity = null;
            this.f20809g.mo28651a(this.f20818p, activity);
        }
    }

    /* renamed from: a */
    public final void mo27124a(zzatb zzatb) throws RemoteException {
        Preconditions.m16042a("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f20812j.mo28771a(zzatb);
    }

    /* renamed from: a */
    public final void mo27123a(zzasu zzasu) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f20812j.mo28770a(zzasu);
    }

    /* renamed from: a */
    public final void mo27126a(zzzp zzzp) {
        Preconditions.m16042a("setAdMetadataListener can only be called from the UI thread.");
        this.f20813k.mo28763a(new C7586in(this, zzzp));
    }
}
