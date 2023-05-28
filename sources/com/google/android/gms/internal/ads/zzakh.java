package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzakh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f18153a;

    /* renamed from: b */
    private final Context f18154b;

    /* renamed from: c */
    private final String f18155c;

    /* renamed from: d */
    private final zzbai f18156d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzayp<zzajw> f18157e;

    /* renamed from: f */
    private zzayp<zzajw> f18158f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzala f18159g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f18160h;

    public zzakh(Context context, zzbai zzbai, String str) {
        this.f18153a = new Object();
        this.f18160h = 1;
        this.f18155c = str;
        this.f18154b = context.getApplicationContext();
        this.f18156d = zzbai;
        this.f18157e = new zzakv();
        this.f18158f = new zzakv();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzala mo27358a(zzdh zzdh) {
        zzala zzala = new zzala(this.f18158f);
        zzbbm.f18748a.execute(new C7564i1(this, zzdh, zzala));
        zzala.mo27910a(new C7938s1(this, zzala), new C7975t1(this, zzala));
        return zzala;
    }

    /* renamed from: b */
    public final zzakw mo27362b(zzdh zzdh) {
        synchronized (this.f18153a) {
            synchronized (this.f18153a) {
                if (this.f18159g != null && this.f18160h == 0) {
                    if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17892d)).booleanValue()) {
                        this.f18159g.mo27910a(new C7605j1(this), C7642k1.f15783a);
                    }
                }
            }
            if (this.f18159g != null) {
                if (this.f18159g.mo27909a() != -1) {
                    if (this.f18160h == 0) {
                        zzakw c = this.f18159g.mo27366c();
                        return c;
                    } else if (this.f18160h == 1) {
                        this.f18160h = 2;
                        mo27358a((zzdh) null);
                        zzakw c2 = this.f18159g.mo27366c();
                        return c2;
                    } else if (this.f18160h == 2) {
                        zzakw c3 = this.f18159g.mo27366c();
                        return c3;
                    } else {
                        zzakw c4 = this.f18159g.mo27366c();
                        return c4;
                    }
                }
            }
            this.f18160h = 2;
            zzala a = mo27358a((zzdh) null);
            this.f18159g = a;
            zzakw c5 = a.mo27366c();
            return c5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27359a(zzajw zzajw) {
        if (zzajw.mo27342f()) {
            this.f18160h = 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27361a(zzdh zzdh, zzala zzala) {
        zzajw zzajw;
        try {
            Context context = this.f18154b;
            zzbai zzbai = this.f18156d;
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17970u0)).booleanValue()) {
                zzajw = new zzajj(context, zzbai);
            } else {
                zzajw = new zzajy(context, zzbai, zzdh, (zza) null);
            }
            zzajw.mo27337a(new C7679l1(this, zzala, zzajw));
            zzajw.mo27355a("/jsLoaded", new C7790o1(this, zzala, zzajw));
            zzazk zzazk = new zzazk();
            C7827p1 p1Var = new C7827p1(this, zzdh, zzajw, zzazk);
            zzazk.mo27869a(p1Var);
            zzajw.mo27355a("/requestReload", p1Var);
            if (this.f18155c.endsWith(".js")) {
                zzajw.mo27340e(this.f18155c);
            } else if (this.f18155c.startsWith("<html>")) {
                zzajw.mo27341f(this.f18155c);
            } else {
                zzajw.mo27338c(this.f18155c);
            }
            zzaxi.f18651h.postDelayed(new C7864q1(this, zzala, zzajw), (long) C8012u1.f16933a);
        } catch (Throwable th) {
            zzbad.m20520b("Error creating webview.", th);
            zzk.zzlk().mo27734a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzala.mo27912b();
        }
    }

    public zzakh(Context context, zzbai zzbai, String str, zzayp<zzajw> zzayp, zzayp<zzajw> zzayp2) {
        this(context, zzbai, str);
        this.f18157e = zzayp;
        this.f18158f = zzayp2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo27360a(com.google.android.gms.internal.ads.zzala r4, com.google.android.gms.internal.ads.zzajw r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18153a
            monitor-enter(r0)
            int r1 = r4.mo27909a()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo27909a()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo27912b()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.zzbbm.f18748a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.C7753n1.m17665a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.zzawz.m20167e(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.mo27360a(com.google.android.gms.internal.ads.zzala, com.google.android.gms.internal.ads.zzajw):void");
    }
}
