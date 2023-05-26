package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@zzard
public final class zzbgg extends zzbft {

    /* renamed from: i */
    private String f18944i;

    /* renamed from: j */
    private final zzbde f18945j;

    /* renamed from: k */
    private boolean f18946k;

    /* renamed from: l */
    private final zzbfl f18947l = new zzbfl();

    /* renamed from: m */
    private ByteBuffer f18948m;

    /* renamed from: n */
    private boolean f18949n;

    /* renamed from: o */
    private final Object f18950o = new Object();

    /* renamed from: p */
    private boolean f18951p;

    public zzbgg(zzbdf zzbdf, zzbde zzbde) {
        super(zzbdf);
        this.f18945j = zzbde;
    }

    /* renamed from: f */
    private final void m20848f() {
        int position = this.f18948m.position();
        boolean z = position > 0;
        int f = zzbdk.m20699f();
        int g = zzbdk.m20700g();
        String str = this.f18944i;
        mo28072a(str, mo28079b(str), position, 0, z, f, g);
    }

    /* JADX WARNING: type inference failed for: r7v15, types: [com.google.android.gms.internal.ads.zzbeh] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r1.f18948m.remaining() > 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        m20848f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if (r1.f18946k != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r4 = r7.mo25498b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
        if ((r4 - r16) < r10) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        m20848f();
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if ((r4 - r8) > (1000 * r12)) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5 = new java.lang.StringBuilder(49);
        r5.append("Timeout exceeded. Limit: ");
        r5.append(r12);
        r5.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0108, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        r4 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5 = r1.f18948m.limit();
        r7 = new java.lang.StringBuilder(35);
        r7.append("Precache abort at ");
        r7.append(r5);
        r7.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        throw new java.io.IOException(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28077a(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r1.f18944i = r2
            java.lang.String r3 = r21.mo28079b(r22)
            java.lang.String r4 = "error"
            r5 = 0
            com.google.android.gms.internal.ads.zzjs r0 = new com.google.android.gms.internal.ads.zzjs     // Catch:{ Exception -> 0x013a }
            java.lang.String r8 = r1.f18930g     // Catch:{ Exception -> 0x013a }
            r9 = 0
            r10 = 0
            com.google.android.gms.internal.ads.zzbde r7 = r1.f18945j     // Catch:{ Exception -> 0x013a }
            int r11 = r7.f18830d     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzbde r7 = r1.f18945j     // Catch:{ Exception -> 0x013a }
            int r12 = r7.f18832f     // Catch:{ Exception -> 0x013a }
            r13 = 1
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzbde r7 = r1.f18945j     // Catch:{ Exception -> 0x013a }
            boolean r7 = r7.f18836j     // Catch:{ Exception -> 0x013a }
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzbeh r7 = new com.google.android.gms.internal.ads.zzbeh     // Catch:{ Exception -> 0x0030 }
            android.content.Context r8 = r1.f18929f     // Catch:{ Exception -> 0x0030 }
            r9 = 0
            r7.<init>(r8, r0, r9)     // Catch:{ Exception -> 0x0030 }
            r0 = r7
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x013d
        L_0x0033:
            android.net.Uri r7 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzjq r8 = new com.google.android.gms.internal.ads.zzjq     // Catch:{ Exception -> 0x013a }
            r8.<init>(r7)     // Catch:{ Exception -> 0x013a }
            r0.mo25635a(r8)     // Catch:{ Exception -> 0x013a }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbdf> r7 = r1.f18931h     // Catch:{ Exception -> 0x013a }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzbdf r7 = (com.google.android.gms.internal.ads.zzbdf) r7     // Catch:{ Exception -> 0x013a }
            if (r7 == 0) goto L_0x004c
            r7.mo25663a((java.lang.String) r3, (com.google.android.gms.internal.ads.zzbft) r1)     // Catch:{ Exception -> 0x0030 }
        L_0x004c:
            com.google.android.gms.common.util.Clock r7 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ Exception -> 0x013a }
            long r8 = r7.mo25498b()     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r10 = com.google.android.gms.internal.ads.zzacu.f17969u     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzacr r11 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x013a }
            java.lang.Object r10 = r11.mo27163a(r10)     // Catch:{ Exception -> 0x013a }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x013a }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r12 = com.google.android.gms.internal.ads.zzacu.f17965t     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzacr r13 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x013a }
            java.lang.Object r12 = r13.mo27163a(r12)     // Catch:{ Exception -> 0x013a }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ Exception -> 0x013a }
            long r12 = r12.longValue()     // Catch:{ Exception -> 0x013a }
            com.google.android.gms.internal.ads.zzbde r14 = r1.f18945j     // Catch:{ Exception -> 0x013a }
            int r14 = r14.f18829c     // Catch:{ Exception -> 0x013a }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ Exception -> 0x013a }
            r1.f18948m = r14     // Catch:{ Exception -> 0x013a }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x013a }
            r16 = r8
        L_0x0084:
            java.nio.ByteBuffer r6 = r1.f18948m     // Catch:{ Exception -> 0x013a }
            int r6 = r6.remaining()     // Catch:{ Exception -> 0x013a }
            int r6 = java.lang.Math.min(r6, r14)     // Catch:{ Exception -> 0x013a }
            int r6 = r0.read(r15, r5, r6)     // Catch:{ Exception -> 0x013a }
            r14 = -1
            if (r6 != r14) goto L_0x00a7
            r14 = 1
            r1.f18951p = r14     // Catch:{ Exception -> 0x0030 }
            com.google.android.gms.internal.ads.zzbfl r0 = r1.f18947l     // Catch:{ Exception -> 0x0030 }
            java.nio.ByteBuffer r6 = r1.f18948m     // Catch:{ Exception -> 0x0030 }
            long r6 = r0.mo28065a(r6)     // Catch:{ Exception -> 0x0030 }
            int r0 = (int) r6     // Catch:{ Exception -> 0x0030 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0030 }
            r1.mo28073a((java.lang.String) r2, (java.lang.String) r3, (long) r6)     // Catch:{ Exception -> 0x0030 }
        L_0x00a5:
            r2 = 1
            goto L_0x00c6
        L_0x00a7:
            java.lang.Object r14 = r1.f18950o     // Catch:{ Exception -> 0x013a }
            monitor-enter(r14)     // Catch:{ Exception -> 0x013a }
            boolean r5 = r1.f18946k     // Catch:{ all -> 0x012f }
            if (r5 != 0) goto L_0x00b7
            java.nio.ByteBuffer r5 = r1.f18948m     // Catch:{ all -> 0x012f }
            r18 = r4
            r4 = 0
            r5.put(r15, r4, r6)     // Catch:{ all -> 0x0138 }
            goto L_0x00b9
        L_0x00b7:
            r18 = r4
        L_0x00b9:
            monitor-exit(r14)     // Catch:{ all -> 0x0138 }
            java.nio.ByteBuffer r4 = r1.f18948m     // Catch:{ Exception -> 0x0134 }
            int r4 = r4.remaining()     // Catch:{ Exception -> 0x0134 }
            if (r4 > 0) goto L_0x00c7
            r21.m20848f()     // Catch:{ Exception -> 0x0134 }
            goto L_0x00a5
        L_0x00c6:
            return r2
        L_0x00c7:
            boolean r4 = r1.f18946k     // Catch:{ Exception -> 0x0134 }
            if (r4 != 0) goto L_0x0109
            long r4 = r7.mo25498b()     // Catch:{ Exception -> 0x0134 }
            long r19 = r4 - r16
            int r6 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x00da
            r21.m20848f()     // Catch:{ Exception -> 0x0134 }
            r16 = r4
        L_0x00da:
            long r4 = r4 - r8
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r12
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x00e9
            r4 = r18
            r5 = 0
            r14 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0084
        L_0x00e9:
            java.lang.String r4 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0030 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r5.append(r0)     // Catch:{ Exception -> 0x0030 }
            r5.append(r12)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = " sec"
            r5.append(r0)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0030 }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x0030 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0030 }
            throw r5     // Catch:{ Exception -> 0x0030 }
        L_0x0109:
            java.lang.String r4 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0030 }
            java.nio.ByteBuffer r5 = r1.f18948m     // Catch:{ Exception -> 0x0030 }
            int r5 = r5.limit()     // Catch:{ Exception -> 0x0030 }
            r6 = 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0030 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r6 = "Precache abort at "
            r7.append(r6)     // Catch:{ Exception -> 0x0030 }
            r7.append(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r5 = " bytes"
            r7.append(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0030 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0030 }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x012f:
            r0 = move-exception
            r18 = r4
        L_0x0132:
            monitor-exit(r14)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ Exception -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            r4 = r18
            goto L_0x013d
        L_0x0138:
            r0 = move-exception
            goto L_0x0132
        L_0x013a:
            r0 = move-exception
            r18 = r4
        L_0x013d:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            r7 = 1
            int r6 = r6 + r7
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r5)
            java.lang.String r5 = ":"
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r5 = java.lang.String.valueOf(r22)
            int r5 = r5.length()
            int r5 = r5 + 34
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Failed to preload url "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = " Exception: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            com.google.android.gms.internal.ads.zzbad.m20523d(r5)
            r1.mo28076a(r2, r3, r4, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgg.mo28077a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo28079b(String str) {
        String valueOf = String.valueOf(super.mo28079b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: c */
    public final ByteBuffer mo28088c() {
        synchronized (this.f18950o) {
            if (this.f18948m != null && !this.f18949n) {
                this.f18948m.flip();
                this.f18949n = true;
            }
            this.f18946k = true;
        }
        return this.f18948m;
    }

    /* renamed from: d */
    public final String mo28089d() {
        return this.f18944i;
    }

    /* renamed from: e */
    public final boolean mo28090e() {
        return this.f18951p;
    }

    /* renamed from: b */
    public final void mo28080b() {
        this.f18946k = true;
    }
}
