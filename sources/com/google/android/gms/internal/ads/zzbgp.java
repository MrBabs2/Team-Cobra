package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
@zzard
public final class zzbgp extends zzbft implements zzbfi {

    /* renamed from: i */
    private zzbfa f18966i;

    /* renamed from: j */
    private String f18967j;

    /* renamed from: k */
    private boolean f18968k;

    /* renamed from: l */
    private Exception f18969l;

    /* renamed from: m */
    private boolean f18970m;

    public zzbgp(zzbdf zzbdf, zzbde zzbde) {
        super(zzbdf);
        zzbfa zzbfa = new zzbfa(zzbdf.getContext(), zzbde);
        this.f18966i = zzbfa;
        zzbfa.mo28040a((zzbfi) this);
    }

    /* renamed from: a */
    public final void mo28000a(int i) {
    }

    /* renamed from: a */
    public final void mo28001a(int i, int i2) {
    }

    /* renamed from: a */
    public final void mo28004a(boolean z, long j) {
        zzbdf zzbdf = (zzbdf) this.f18931h.get();
        if (zzbdf != null) {
            zzbbm.f18748a.execute(new C7688la(zzbdf, z, j));
        }
    }

    /* renamed from: b */
    public final void mo28081b(int i) {
        this.f18966i.mo28063e().mo28028c(i);
    }

    /* renamed from: c */
    public final void mo28082c(int i) {
        this.f18966i.mo28063e().mo28030d(i);
    }

    /* renamed from: d */
    public final void mo28083d(int i) {
        this.f18966i.mo28063e().mo28021a(i);
    }

    /* renamed from: e */
    public final void mo28084e(int i) {
        this.f18966i.mo28063e().mo28026b(i);
    }

    /* renamed from: c */
    private final void m20880c(String str) {
        synchronized (this) {
            this.f18968k = true;
            notify();
            mo24917a();
        }
        String str2 = this.f18967j;
        if (str2 != null) {
            String b = mo28079b(str2);
            Exception exc = this.f18969l;
            if (exc != null) {
                mo28076a(this.f18967j, b, "badUrl", m20879b(str, exc));
            } else {
                mo28076a(this.f18967j, b, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    /* renamed from: a */
    public final void mo28003a(String str, Exception exc) {
        this.f18969l = exc;
        zzbad.m20522c("Precache error", exc);
        m20880c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo28079b(String str) {
        String valueOf = String.valueOf(super.mo28079b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: b */
    public final void mo28080b() {
        m20880c((String) null);
    }

    /* renamed from: b */
    private static String m20879b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo24917a() {
        zzbfa zzbfa = this.f18966i;
        if (zzbfa != null) {
            zzbfa.mo28040a((zzbfi) null);
            this.f18966i.mo28061c();
        }
        super.mo24917a();
    }

    /* renamed from: a */
    public final boolean mo28077a(String str) {
        return mo28078a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r11.f18969l == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        throw r11.f18969l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28078a(java.lang.String r34, java.lang.String[] r35) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            r0 = r35
            r11.f18967j = r12
            java.lang.String r13 = r33.mo28079b((java.lang.String) r34)
            java.lang.String r14 = "error"
            int r1 = r0.length     // Catch:{ Exception -> 0x0162 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x0162 }
            r2 = 0
        L_0x0012:
            int r3 = r0.length     // Catch:{ Exception -> 0x0162 }
            if (r2 >= r3) goto L_0x0023
            r3 = r0[r2]     // Catch:{ Exception -> 0x0020 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0020 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0020 }
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0020:
            r0 = move-exception
            goto L_0x0165
        L_0x0023:
            com.google.android.gms.internal.ads.zzbfa r0 = r11.f18966i     // Catch:{ Exception -> 0x0162 }
            java.lang.String r2 = r11.f18930g     // Catch:{ Exception -> 0x0162 }
            r0.mo28055a((android.net.Uri[]) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0162 }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbdf> r0 = r11.f18931h     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzbdf r0 = (com.google.android.gms.internal.ads.zzbdf) r0     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0037
            r0.mo25663a((java.lang.String) r13, (com.google.android.gms.internal.ads.zzbft) r11)     // Catch:{ Exception -> 0x0020 }
        L_0x0037:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ Exception -> 0x0162 }
            long r16 = r0.mo25498b()     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f17969u     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ Exception -> 0x0162 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0162 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f17965t     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ Exception -> 0x0162 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0162 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0162 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.zzacj<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzacu.f17961s     // Catch:{ Exception -> 0x0162 }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0162 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0162 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0162 }
            r1 = -1
        L_0x0076:
            monitor-enter(r33)     // Catch:{ Exception -> 0x0162 }
            long r18 = r0.mo25498b()     // Catch:{ all -> 0x015b }
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x012e
            boolean r3 = r11.f18968k     // Catch:{ all -> 0x015b }
            if (r3 == 0) goto L_0x0098
            java.lang.Exception r0 = r11.f18969l     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.f18969l     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x008e:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0098:
            boolean r3 = r11.f18970m     // Catch:{ all -> 0x015b }
            r18 = 1
            if (r3 == 0) goto L_0x00a1
            monitor-exit(r33)     // Catch:{ all -> 0x0160 }
            goto L_0x0102
        L_0x00a1:
            com.google.android.gms.internal.ads.zzbfa r3 = r11.f18966i     // Catch:{ all -> 0x015b }
            com.google.android.gms.internal.ads.zzkv r3 = r3.mo28062d()     // Catch:{ all -> 0x015b }
            if (r3 == 0) goto L_0x0122
            r20 = r14
            long r14 = r3.mo26393e()     // Catch:{ all -> 0x0157 }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x0106
            long r23 = r3.mo26388b()     // Catch:{ all -> 0x0157 }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c3
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            int r25 = com.google.android.gms.internal.ads.zzbfa.m20768f()     // Catch:{ all -> 0x0157 }
            int r26 = com.google.android.gms.internal.ads.zzbfa.m20769g()     // Catch:{ all -> 0x0157 }
            r1 = r33
            r2 = r34
            r3 = r13
            r27 = r4
            r4 = r23
            r29 = r6
            r6 = r14
            r31 = r9
            r9 = r25
            r10 = r26
            r1.mo28075a((java.lang.String) r2, (java.lang.String) r3, (long) r4, (long) r6, (boolean) r8, (int) r9, (int) r10)     // Catch:{ all -> 0x0157 }
            r1 = r23
            goto L_0x00ea
        L_0x00e4:
            r27 = r4
            r29 = r6
            r31 = r9
        L_0x00ea:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00f3
            r11.mo28073a((java.lang.String) r12, (java.lang.String) r13, (long) r14)     // Catch:{ all -> 0x0157 }
            monitor-exit(r33)     // Catch:{ all -> 0x0157 }
            goto L_0x0102
        L_0x00f3:
            com.google.android.gms.internal.ads.zzbfa r3 = r11.f18966i     // Catch:{ all -> 0x0157 }
            long r3 = r3.mo28057b()     // Catch:{ all -> 0x0157 }
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 < 0) goto L_0x0103
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x0103
            monitor-exit(r33)     // Catch:{ all -> 0x0157 }
        L_0x0102:
            return r18
        L_0x0103:
            r3 = r31
            goto L_0x010b
        L_0x0106:
            r27 = r4
            r29 = r6
            r3 = r9
        L_0x010b:
            r11.wait(r3)     // Catch:{ InterruptedException -> 0x0118 }
            monitor-exit(r33)     // Catch:{ all -> 0x0157 }
            r9 = r3
            r14 = r20
            r4 = r27
            r6 = r29
            goto L_0x0076
        L_0x0118:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0122:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x012e:
            r29 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0154 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r3.<init>(r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0154 }
            r4 = r29
            r3.append(r4)     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0154 }
            r0.<init>(r2)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            r14 = r1
            goto L_0x015e
        L_0x0157:
            r0 = move-exception
            r14 = r20
            goto L_0x015e
        L_0x015b:
            r0 = move-exception
            r20 = r14
        L_0x015e:
            monitor-exit(r33)     // Catch:{ all -> 0x0160 }
            throw r0     // Catch:{ Exception -> 0x0020 }
        L_0x0160:
            r0 = move-exception
            goto L_0x015e
        L_0x0162:
            r0 = move-exception
            r20 = r14
        L_0x0165:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r34)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbad.m20523d(r1)
            r33.mo24917a()
            java.lang.String r0 = m20879b(r14, r0)
            r11.mo28076a(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgp.mo28078a(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: c */
    public final zzbfa mo28099c() {
        synchronized (this) {
            this.f18970m = true;
            notify();
        }
        this.f18966i.mo28040a((zzbfi) null);
        zzbfa zzbfa = this.f18966i;
        this.f18966i = null;
        return zzbfa;
    }
}
