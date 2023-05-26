package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
@zzard
public abstract class zzbgl extends zzbft {

    /* renamed from: i */
    private final zzbdk f18953i;

    /* renamed from: j */
    private boolean f18954j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f18955k = null;

    /* renamed from: l */
    private boolean f18956l;

    public zzbgl(zzbdf zzbdf) {
        super(zzbdf);
        zzbdk zzbdk = new zzbdk();
        this.f18953i = zzbdk;
        zzbdk.mo27992a((zzbdo) new C7614ja(this));
    }

    /* renamed from: a */
    public void mo24917a() {
        this.f18953i.mo27995b();
        super.mo24917a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo28079b(String str) {
        String valueOf = String.valueOf(super.mo28079b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo28092c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzhn mo28093c(String str);

    /* renamed from: d */
    public final void mo28094d() {
        synchronized (this) {
            this.f18956l = true;
            this.f18953i.mo27991a();
        }
    }

    /* renamed from: e */
    public final zzbdk mo28095e() {
        return this.f18953i;
    }

    /* renamed from: b */
    public final void mo28080b() {
        synchronized (this) {
            this.f18954j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (android.text.TextUtils.isEmpty(r9.f18955k) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        r1 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r14 = r9.f18955k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        java.lang.Thread.sleep(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0128, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0129, code lost:
        r12 = r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28077a(java.lang.String r32) {
        /*
            r31 = this;
            r9 = r31
            r10 = r32
            com.google.android.gms.internal.ads.zzhn r0 = r31.mo28093c(r32)
            java.lang.String r11 = r31.mo28079b(r32)
            java.lang.String r12 = "error"
            r13 = 0
            r14 = 0
            com.google.android.gms.internal.ads.zzbdk r1 = r9.f18953i     // Catch:{ IOException -> 0x014c }
            boolean r0 = r1.mo27994a((com.google.android.gms.internal.ads.zzhn) r0)     // Catch:{ IOException -> 0x014c }
            if (r0 == 0) goto L_0x013d
            com.google.android.gms.internal.ads.zzbdk r0 = r9.f18953i     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzge r0 = r0.mo27996c()     // Catch:{ IOException -> 0x014c }
            if (r0 == 0) goto L_0x012e
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbdf> r1 = r9.f18931h     // Catch:{ IOException -> 0x014c }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzbdf r1 = (com.google.android.gms.internal.ads.zzbdf) r1     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x002d
            r1.mo25663a((java.lang.String) r11, (com.google.android.gms.internal.ads.zzbft) r9)     // Catch:{ IOException -> 0x014c }
        L_0x002d:
            com.google.android.gms.common.util.Clock r15 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ IOException -> 0x014c }
            long r16 = r15.mo25498b()     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f17969u     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ IOException -> 0x014c }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ IOException -> 0x014c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x014c }
            long r18 = r1.longValue()     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f17965t     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ IOException -> 0x014c }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ IOException -> 0x014c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x014c }
            long r1 = r1.longValue()     // Catch:{ IOException -> 0x014c }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r20 = r1 * r3
            com.google.android.gms.internal.ads.zzacj<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzacu.f17961s     // Catch:{ IOException -> 0x014c }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ IOException -> 0x014c }
            java.lang.Object r1 = r2.mo27163a(r1)     // Catch:{ IOException -> 0x014c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x014c }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x014c }
            long r6 = (long) r1     // Catch:{ IOException -> 0x014c }
            r1 = -1
        L_0x006c:
            monitor-enter(r31)     // Catch:{ IOException -> 0x014c }
            long r3 = r15.mo25498b()     // Catch:{ all -> 0x012b }
            long r3 = r3 - r16
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x00f6
            boolean r3 = r9.f18954j     // Catch:{ all -> 0x012b }
            if (r3 == 0) goto L_0x0092
            java.lang.String r0 = r9.f18955k     // Catch:{ all -> 0x012b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "badUrl"
            java.lang.String r14 = r9.f18955k     // Catch:{ all -> 0x0128 }
            goto L_0x008a
        L_0x0088:
            java.lang.String r1 = "externalAbort"
        L_0x008a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0092:
            boolean r3 = r9.f18956l     // Catch:{ all -> 0x012b }
            r22 = 1
            if (r3 == 0) goto L_0x009a
            monitor-exit(r31)     // Catch:{ all -> 0x012b }
            goto L_0x00e0
        L_0x009a:
            long r4 = r0.mo26852e()     // Catch:{ all -> 0x012b }
            r23 = 0
            int r3 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e1
            long r25 = r0.mo26848b()     // Catch:{ all -> 0x012b }
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00c8
            int r1 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b2
            r8 = 1
            goto L_0x00b3
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            r1 = r31
            r2 = r32
            r3 = r11
            r27 = r4
            r4 = r25
            r29 = r6
            r6 = r27
            r1.mo28074a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x012b }
            r1 = r25
            r3 = r27
            goto L_0x00cb
        L_0x00c8:
            r29 = r6
            r3 = r4
        L_0x00cb:
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00d4
            r9.mo28073a((java.lang.String) r10, (java.lang.String) r11, (long) r3)     // Catch:{ all -> 0x012b }
            monitor-exit(r31)     // Catch:{ all -> 0x012b }
            goto L_0x00e0
        L_0x00d4:
            r31.mo28092c()     // Catch:{ all -> 0x012b }
            int r3 = (r23 > r29 ? 1 : (r23 == r29 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e3
            monitor-exit(r31)     // Catch:{ all -> 0x012b }
        L_0x00e0:
            return r22
        L_0x00e1:
            r29 = r6
        L_0x00e3:
            monitor-exit(r31)     // Catch:{ all -> 0x012b }
            java.lang.Thread.sleep(r18)     // Catch:{ InterruptedException -> 0x00ea }
            r6 = r29
            goto L_0x006c
        L_0x00ea:
            java.lang.String r12 = "error"
            java.lang.String r14 = "Sleep interrupted."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x014c }
            java.lang.String r1 = "Interrupted sleep."
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c }
            throw r0     // Catch:{ IOException -> 0x014c }
        L_0x00f6:
            java.lang.String r1 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r20)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0128 }
            int r2 = r2.length()     // Catch:{ all -> 0x0128 }
            int r2 = r2 + 27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r3.<init>(r2)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0128 }
            r3.append(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = " ms"
            r3.append(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0128 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "Timed out while buffering."
            r0.<init>(r3)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            r12 = r1
            r14 = r2
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            r12 = r1
            goto L_0x012c
        L_0x012b:
            r0 = move-exception
        L_0x012c:
            monitor-exit(r31)     // Catch:{ all -> 0x012b }
            throw r0     // Catch:{ IOException -> 0x014c }
        L_0x012e:
            java.lang.String r12 = "playerFailed"
            java.lang.String r14 = "ExoPlayer not created"
            r31.mo24917a()     // Catch:{ IOException -> 0x014c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x014c }
            java.lang.String r1 = "Failed to get ExoPlayer"
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c }
            throw r0     // Catch:{ IOException -> 0x014c }
        L_0x013d:
            java.lang.String r12 = "playerFailed"
            java.lang.String r14 = "ExoPlayer prepare failed"
            r31.mo24917a()     // Catch:{ IOException -> 0x014c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x014c }
            java.lang.String r1 = "Failed to prepare AdExoPlayerHelper"
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c }
            throw r0     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r32)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)
            r9.mo28076a(r10, r11, r12, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgl.mo28077a(java.lang.String):boolean");
    }
}
