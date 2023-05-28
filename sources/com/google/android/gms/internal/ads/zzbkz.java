package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzbkz extends zzaac {

    /* renamed from: f */
    private final Context f19115f;

    /* renamed from: g */
    private final zzbai f19116g;

    /* renamed from: h */
    private final zzclc f19117h;

    /* renamed from: i */
    private final zzcjz<zzams, zzclb> f19118i;

    /* renamed from: j */
    private final zzcpf f19119j;

    /* renamed from: k */
    private final zzcgb f19120k;

    /* renamed from: l */
    private boolean f19121l = false;

    zzbkz(Context context, zzbai zzbai, zzclc zzclc, zzcjz<zzams, zzclb> zzcjz, zzcpf zzcpf, zzcgb zzcgb) {
        this.f19115f = context;
        this.f19116g = zzbai;
        this.f19117h = zzclc;
        this.f19118i = zzcjz;
        this.f19119j = zzcpf;
        this.f19120k = zzcgb;
    }

    /* renamed from: p1 */
    private final String m21306p1() {
        Context applicationContext = this.f19115f.getApplicationContext() == null ? this.f19115f : this.f19115f.getApplicationContext();
        try {
            return Wrappers.m16317a(applicationContext).mo25507a(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zzawz.m20168e("Error getting metadata", e);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26908B() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f19121l     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.f19115f     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzacu.m18983a(r0)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzawm r0 = com.google.android.gms.ads.internal.zzk.zzlk()     // Catch:{ all -> 0x0046 }
            android.content.Context r1 = r3.f19115f     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzbai r2 = r3.f19116g     // Catch:{ all -> 0x0046 }
            r0.mo27732a((android.content.Context) r1, (com.google.android.gms.internal.ads.zzbai) r2)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzvn r0 = com.google.android.gms.ads.internal.zzk.zzlm()     // Catch:{ all -> 0x0046 }
            android.content.Context r1 = r3.f19115f     // Catch:{ all -> 0x0046 }
            r0.mo29844a((android.content.Context) r1)     // Catch:{ all -> 0x0046 }
            r0 = 1
            r3.f19121l = r0     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzcgb r0 = r3.f19120k     // Catch:{ all -> 0x0046 }
            r0.mo28687f()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17894d1     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r1.mo27163a(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzcpf r0 = r3.f19119j     // Catch:{ all -> 0x0046 }
            r0.mo28753a()     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkz.mo26908B():void");
    }

    /* renamed from: G0 */
    public final synchronized float mo26909G0() {
        return zzk.zzll().mo27828a();
    }

    /* renamed from: a */
    public final synchronized void mo26910a(float f) {
        zzk.zzll().mo27829a(f);
    }

    /* renamed from: b */
    public final void mo26914b(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbad.m20519b("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.m16390H(iObjectWrapper);
        if (context == null) {
            zzbad.m20519b("Context is null. Failed to open debug menu.");
            return;
        }
        zzayb zzayb = new zzayb(context);
        zzayb.mo27835a(str);
        zzayb.mo27842d(this.f19116g.f18742f);
        zzayb.mo27832a();
    }

    /* renamed from: f */
    public final void mo26915f(String str) {
        this.f19119j.mo28754a(str);
    }

    /* renamed from: g */
    public final synchronized void mo26916g(boolean z) {
        zzk.zzll().mo27830a(z);
    }

    /* renamed from: k0 */
    public final List<zzaio> mo26917k0() throws RemoteException {
        return this.f19120k.mo28682b();
    }

    /* renamed from: n */
    public final synchronized void mo26918n(String str) {
        zzacu.m18983a(this.f19115f);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17823M1)).booleanValue()) {
                zzk.zzlo().zza(this.f19115f, this.f19116g, str, (Runnable) null);
            }
        }
    }

    /* renamed from: r0 */
    public final String mo26919r0() {
        return this.f19116g.f18742f;
    }

    /* renamed from: s0 */
    public final synchronized boolean mo26920s0() {
        return zzk.zzll().mo27831b();
    }

    /* renamed from: a */
    public final void mo26913a(String str, IObjectWrapper iObjectWrapper) {
        String p1 = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17827N1)).booleanValue() ? m21306p1() : "";
        if (!TextUtils.isEmpty(p1)) {
            str = p1;
        }
        if (!TextUtils.isEmpty(str)) {
            zzacu.m18983a(this.f19115f);
            boolean booleanValue = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17823M1)).booleanValue() | ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17774A0)).booleanValue();
            C7838pc pcVar = null;
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17774A0)).booleanValue()) {
                booleanValue = true;
                pcVar = new C7838pc(this, (Runnable) ObjectWrapper.m16390H(iObjectWrapper));
            }
            if (booleanValue) {
                zzk.zzlo().zza(this.f19115f, this.f19116g, str, (Runnable) pcVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo26912a(zzamp zzamp) throws RemoteException {
        this.f19117h.mo28733a(zzamp);
    }

    /* renamed from: a */
    public final void mo26911a(zzait zzait) throws RemoteException {
        this.f19120k.mo28678a(zzait);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28257a(Runnable runnable) {
        Preconditions.m16042a("Adapters must be initialized on the main thread.");
        Map<String, zzamm> e = zzk.zzlk().mo27743i().mo27787j().mo27729e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzbad.m20522c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f19117h.mo28734a()) {
                HashMap hashMap = new HashMap();
                IObjectWrapper a = ObjectWrapper.m16391a(this.f19115f);
                for (zzamm zzamm : e.values()) {
                    for (zzaml next : zzamm.f18200a) {
                        String str = next.f18198b;
                        for (String next2 : next.f18197a) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        zzcjy<zzams, zzclb> a2 = this.f19118i.mo28720a(str2, jSONObject);
                        if (a2 != null) {
                            zzams zzams = (zzams) a2.f20303b;
                            if (!zzams.isInitialized()) {
                                if (zzams.mo27422n0()) {
                                    zzams.mo27406a(a, (zzatk) (zzclb) a2.f20304c, (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    zzbad.m20516a(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        zzbad.m20522c(sb.toString(), th2);
                    }
                }
            }
        }
    }
}
