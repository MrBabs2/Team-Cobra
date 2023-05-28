package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzbyn extends zzbpc {

    /* renamed from: f */
    private final Executor f19678f;

    /* renamed from: g */
    private final zzbyt f19679g;

    /* renamed from: h */
    private final zzbzb f19680h;

    /* renamed from: i */
    private final zzbzl f19681i;

    /* renamed from: j */
    private final zzbyx f19682j;

    /* renamed from: k */
    private final zzbzc f19683k;

    /* renamed from: l */
    private final zzdte<zzccb> f19684l;

    /* renamed from: m */
    private final zzdte<zzcbz> f19685m;

    /* renamed from: n */
    private final zzdte<zzccg> f19686n;

    /* renamed from: o */
    private final zzdte<zzcbw> f19687o;

    /* renamed from: p */
    private final zzdte<zzccd> f19688p;

    /* renamed from: q */
    private zzcab f19689q;

    /* renamed from: r */
    private boolean f19690r;

    /* renamed from: s */
    private final zzavf f19691s;

    /* renamed from: t */
    private final zzdh f19692t;

    /* renamed from: u */
    private final zzbai f19693u;

    /* renamed from: v */
    private final Context f19694v;

    public zzbyn(Executor executor, zzbyt zzbyt, zzbzb zzbzb, zzbzl zzbzl, zzbyx zzbyx, zzbzc zzbzc, zzdte<zzccb> zzdte, zzdte<zzcbz> zzdte2, zzdte<zzccg> zzdte3, zzdte<zzcbw> zzdte4, zzdte<zzccd> zzdte5, zzavf zzavf, zzdh zzdh, zzbai zzbai, Context context) {
        this.f19678f = executor;
        this.f19679g = zzbyt;
        this.f19680h = zzbzb;
        this.f19681i = zzbzl;
        this.f19682j = zzbyx;
        this.f19683k = zzbzc;
        this.f19684l = zzdte;
        this.f19685m = zzdte2;
        this.f19686n = zzdte3;
        this.f19687o = zzdte4;
        this.f19688p = zzdte5;
        this.f19691s = zzavf;
        this.f19692t = zzdh;
        this.f19693u = zzbai;
        this.f19694v = context;
    }

    /* renamed from: a */
    public final synchronized void mo28503a(String str) {
        this.f19680h.mo28484a(str);
    }

    /* renamed from: b */
    public final synchronized void mo28505b(Bundle bundle) {
        this.f19680h.mo28473a(bundle);
    }

    /* renamed from: c */
    public final void mo26812c() {
        this.f19678f.execute(new C7989tf(this));
        if (this.f19679g.mo28547n() != 7) {
            Executor executor = this.f19678f;
            zzbzb zzbzb = this.f19680h;
            zzbzb.getClass();
            executor.execute(C8026uf.m18286a(zzbzb));
        }
        super.mo26812c();
    }

    /* renamed from: f */
    public final synchronized void mo28509f() {
        this.f19680h.mo28490u();
    }

    /* renamed from: g */
    public final synchronized void mo28510g() {
        if (this.f19689q == null) {
            zzbad.m20516a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f19678f.execute(new C8100wf(this, this.f19689q instanceof zzbzi));
        }
    }

    /* renamed from: h */
    public final synchronized void mo28511h() {
        if (!this.f19690r) {
            this.f19680h.mo28485b();
        }
    }

    /* renamed from: i */
    public final boolean mo28512i() {
        return this.f19682j.mo28561b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo28513j() {
        this.f19680h.destroy();
        this.f19679g.mo28518a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo28514k() {
        try {
            int n = this.f19679g.mo28547n();
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 6) {
                            if (n != 7) {
                                zzbad.m20519b("Wrong native template id!");
                            } else if (this.f19683k.mo28570e() != null) {
                                this.f19683k.mo28570e().mo27334a(this.f19687o.get());
                            }
                        } else if (this.f19683k.mo28568c() != null) {
                            m22063b("Google");
                            this.f19683k.mo28568c().mo27266a(this.f19686n.get());
                        }
                    } else if (this.f19683k.mo28565a(this.f19679g.mo28538e()) != null) {
                        this.f19683k.mo28565a(this.f19679g.mo28538e()).mo27264a(this.f19688p.get());
                    }
                } else if (this.f19683k.mo28566b() != null) {
                    m22063b("Google");
                    this.f19683k.mo28566b().mo27261a(this.f19685m.get());
                }
            } else if (this.f19683k.mo28564a() != null) {
                m22063b("Google");
                this.f19683k.mo28564a().mo27262a(this.f19684l.get());
            }
        } catch (RemoteException e) {
            zzbad.m20520b("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: l */
    public final synchronized void mo28515l() {
        this.f19680h.mo28491w();
    }

    /* renamed from: m */
    public final zzaee mo28516m() {
        return new zzbym(this.f19679g);
    }

    /* renamed from: a */
    public final synchronized void mo28494a(Bundle bundle) {
        this.f19680h.mo28486b(bundle);
    }

    /* renamed from: b */
    public final synchronized void mo28507b(zzcab zzcab) {
        this.f19680h.mo28477a(zzcab.mo28585h0(), zzcab.mo28581F0());
        if (zzcab.mo28587m0() != null) {
            zzcab.mo28587m0().setClickable(false);
            zzcab.mo28587m0().removeAllViews();
        }
        if (zzcab.mo28592q0() != null) {
            zzcab.mo28592q0().mo29779b((zzue) this.f19691s);
        }
        this.f19689q = null;
    }

    /* renamed from: a */
    public final synchronized void mo28384a() {
        this.f19678f.execute(new C8063vf(this));
        super.mo28384a();
    }

    /* renamed from: c */
    public final synchronized boolean mo28508c(Bundle bundle) {
        if (this.f19690r) {
            return true;
        }
        boolean c = this.f19680h.mo28488c(bundle);
        this.f19690r = c;
        return c;
    }

    /* renamed from: c */
    public static boolean m22064c(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    /* renamed from: a */
    public final synchronized void mo28502a(zzcab zzcab) {
        zzdc a;
        this.f19689q = zzcab;
        this.f19681i.mo28599a(zzcab);
        this.f19680h.mo28479a(zzcab.mo28585h0(), zzcab.mo28593u0(), zzcab.mo28582K0(), (View.OnTouchListener) zzcab, (View.OnClickListener) zzcab);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17943n1)).booleanValue() && (a = this.f19692t.mo29015a()) != null) {
            a.zzb(zzcab.mo28585h0());
        }
        if (zzcab.mo28592q0() != null) {
            zzcab.mo28592q0().mo29778a((zzue) this.f19691s);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22063b(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbyx r0 = r10.f19682j
            boolean r0 = r0.mo28563d()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzbyt r0 = r10.f19679g
            com.google.android.gms.internal.ads.zzbgz r0 = r0.mo28552s()
            com.google.android.gms.internal.ads.zzbyt r1 = r10.f19679g
            com.google.android.gms.internal.ads.zzbgz r1 = r1.mo28551r()
            if (r0 != 0) goto L_0x001a
            if (r1 != 0) goto L_0x001a
            return
        L_0x001a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r3 = 0
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            r8 = r3
            goto L_0x0032
        L_0x002a:
            if (r2 == 0) goto L_0x0030
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L_0x0028
        L_0x0030:
            r0 = r3
            r8 = r0
        L_0x0032:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.content.Context r4 = r10.f19694v
            boolean r3 = r3.mo27566b((android.content.Context) r4)
            if (r3 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzbai r3 = r10.f19693u
            int r4 = r3.f18743g
            int r3 = r3.f18744h
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.mo27561a(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0075
            return
        L_0x0075:
            com.google.android.gms.internal.ads.zzbyt r3 = r10.f19679g
            r3.mo28522a((com.google.android.gms.dynamic.IObjectWrapper) r11)
            r0.mo25654a((com.google.android.gms.dynamic.IObjectWrapper) r11)
            if (r2 == 0) goto L_0x008c
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzaqd r1 = com.google.android.gms.ads.internal.zzk.zzlv()
            r1.mo27564a(r11, r0)
        L_0x008c:
            com.google.android.gms.internal.ads.zzaqd r0 = com.google.android.gms.ads.internal.zzk.zzlv()
            r0.mo27563a((com.google.android.gms.dynamic.IObjectWrapper) r11)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyn.m22063b(java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo28497a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17901e3)).booleanValue()) {
            this.f19681i.mo28602b(this.f19689q);
        }
        this.f19680h.mo28476a(view, view2, map, map2, z);
    }

    /* renamed from: b */
    public final void mo28506b(View view) {
        IObjectWrapper t = this.f19679g.mo28553t();
        boolean z = this.f19679g.mo28552s() != null;
        if (this.f19682j.mo28563d() && t != null && z && view != null) {
            zzk.zzlv().mo27564a(t, view);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28496a(View view, MotionEvent motionEvent, View view2) {
        this.f19680h.mo28475a(view, motionEvent, view2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo28498a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f19690r     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x0013
            com.google.android.gms.internal.ads.zzbzb r6 = r2.f19680h     // Catch:{ all -> 0x005c }
            r6.mo28478a((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005c }
            r2.f19690r = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r2)
            return
        L_0x0013:
            if (r6 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzacu.f17811J1     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r1.mo27163a(r6)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x005c }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x005a
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005c }
        L_0x0031:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x005c }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005c }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0031
            boolean r1 = m22064c((android.view.View) r1)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzbzb r6 = r2.f19680h     // Catch:{ all -> 0x005c }
            r6.mo28478a((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005c }
            r2.f19690r = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r2)
            return
        L_0x005a:
            monitor-exit(r2)
            return
        L_0x005c:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0060
        L_0x005f:
            throw r3
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyn.mo28498a(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: a */
    public final synchronized void mo28495a(View view) {
        this.f19680h.mo28474a(view);
    }

    /* renamed from: a */
    public final synchronized void mo28501a(zzagd zzagd) {
        this.f19680h.mo28483a(zzagd);
    }

    /* renamed from: a */
    public final synchronized void mo28500a(zzaak zzaak) {
        this.f19680h.mo28482a(zzaak);
    }

    /* renamed from: a */
    public final synchronized void mo28499a(zzaag zzaag) {
        this.f19680h.mo28481a(zzaag);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28504a(boolean z) {
        this.f19680h.mo28480a(this.f19689q.mo28585h0(), this.f19689q.mo28581F0(), this.f19689q.mo28593u0(), z);
    }
}
