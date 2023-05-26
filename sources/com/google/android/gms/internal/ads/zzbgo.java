package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@zzard
public final class zzbgo extends zzbft implements zzsj<zzrv> {

    /* renamed from: i */
    private String f18957i;

    /* renamed from: j */
    private final zzbde f18958j;

    /* renamed from: k */
    private boolean f18959k;

    /* renamed from: l */
    private final C7651ka f18960l = new C7651ka();

    /* renamed from: m */
    private final zzbfl f18961m = new zzbfl();

    /* renamed from: n */
    private ByteBuffer f18962n;

    /* renamed from: o */
    private boolean f18963o;

    /* renamed from: p */
    private final Object f18964p = new Object();

    /* renamed from: q */
    private boolean f18965q;

    public zzbgo(zzbdf zzbdf, zzbde zzbde) {
        super(zzbdf);
        this.f18958j = zzbde;
    }

    /* renamed from: f */
    private final void m20869f() {
        int a = (int) this.f18960l.mo26170a();
        int a2 = (int) this.f18961m.mo28065a(this.f18962n);
        int position = this.f18962n.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        boolean z = round > 0;
        int f = zzbfa.m20768f();
        int g = zzbfa.m20769g();
        String str = this.f18957i;
        mo28071a(str, mo28079b(str), position, a, (long) round, (long) a2, z, f, g);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28048a(Object obj) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28049a(Object obj, int i) {
    }

    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.zzbex] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r9.f18962n.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        m20869f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r9.f18959k != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r12 = r1.mo25498b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if ((r12 - r16) < r4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        m20869f();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.f18962n.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r12 = r18;
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
            r9 = r21
            r10 = r22
            r9.f18957i = r10
            java.lang.String r11 = r21.mo28079b(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.zzsa r0 = new com.google.android.gms.internal.ads.zzsa     // Catch:{ Exception -> 0x013c }
            java.lang.String r2 = r9.f18930g     // Catch:{ Exception -> 0x013c }
            r3 = 0
            com.google.android.gms.internal.ads.zzbde r1 = r9.f18958j     // Catch:{ Exception -> 0x013c }
            int r5 = r1.f18830d     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbde r1 = r9.f18958j     // Catch:{ Exception -> 0x013c }
            int r6 = r1.f18832f     // Catch:{ Exception -> 0x013c }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbde r1 = r9.f18958j     // Catch:{ Exception -> 0x013c }
            boolean r1 = r1.f18836j     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzbex r1 = new com.google.android.gms.internal.ads.zzbex     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r9.f18929f     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0032 }
            r0 = r1
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x013f
        L_0x0035:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzry r2 = new com.google.android.gms.internal.ads.zzry     // Catch:{ Exception -> 0x013c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x013c }
            r0.mo26232a(r2)     // Catch:{ Exception -> 0x013c }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbdf> r1 = r9.f18931h     // Catch:{ Exception -> 0x013c }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbdf r1 = (com.google.android.gms.internal.ads.zzbdf) r1     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x004e
            r1.mo25663a((java.lang.String) r11, (com.google.android.gms.internal.ads.zzbft) r9)     // Catch:{ Exception -> 0x0032 }
        L_0x004e:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ Exception -> 0x013c }
            long r2 = r1.mo25498b()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r4 = com.google.android.gms.internal.ads.zzacu.f17969u     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzacr r5 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r4 = r5.mo27163a(r4)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x013c }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzacu.f17965t     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzacr r7 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r6 = r7.mo27163a(r6)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x013c }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbde r8 = r9.f18958j     // Catch:{ Exception -> 0x013c }
            int r8 = r8.f18829c     // Catch:{ Exception -> 0x013c }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x013c }
            r9.f18962n = r8     // Catch:{ Exception -> 0x013c }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x013c }
            r16 = r2
        L_0x0086:
            java.nio.ByteBuffer r14 = r9.f18962n     // Catch:{ Exception -> 0x013c }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x013c }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x013c }
            int r14 = r0.read(r15, r13, r14)     // Catch:{ Exception -> 0x013c }
            r8 = -1
            if (r14 != r8) goto L_0x00a9
            r8 = 1
            r9.f18965q = r8     // Catch:{ Exception -> 0x0032 }
            com.google.android.gms.internal.ads.zzbfl r0 = r9.f18961m     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f18962n     // Catch:{ Exception -> 0x0032 }
            long r0 = r0.mo28065a(r1)     // Catch:{ Exception -> 0x0032 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0032 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0032 }
            r9.mo28073a((java.lang.String) r10, (java.lang.String) r11, (long) r0)     // Catch:{ Exception -> 0x0032 }
        L_0x00a7:
            r1 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.Object r8 = r9.f18964p     // Catch:{ Exception -> 0x013c }
            monitor-enter(r8)     // Catch:{ Exception -> 0x013c }
            boolean r13 = r9.f18959k     // Catch:{ all -> 0x0131 }
            if (r13 != 0) goto L_0x00b9
            java.nio.ByteBuffer r13 = r9.f18962n     // Catch:{ all -> 0x0131 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013a }
            goto L_0x00bb
        L_0x00b9:
            r18 = r12
        L_0x00bb:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            java.nio.ByteBuffer r8 = r9.f18962n     // Catch:{ Exception -> 0x0136 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0136 }
            if (r8 > 0) goto L_0x00c9
            r21.m20869f()     // Catch:{ Exception -> 0x0136 }
            goto L_0x00a7
        L_0x00c8:
            return r1
        L_0x00c9:
            boolean r8 = r9.f18959k     // Catch:{ Exception -> 0x0136 }
            if (r8 != 0) goto L_0x010b
            long r12 = r1.mo25498b()     // Catch:{ Exception -> 0x0136 }
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00dc
            r21.m20869f()     // Catch:{ Exception -> 0x0136 }
            r16 = r12
        L_0x00dc:
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00eb
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0086
        L_0x00eb:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            r1.append(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0032 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x010b:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f18962n     // Catch:{ Exception -> 0x0032 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0032 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0032 }
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x0131:
            r0 = move-exception
            r18 = r12
        L_0x0134:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r12 = r18
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            goto L_0x0134
        L_0x013c:
            r0 = move-exception
            r18 = r12
        L_0x013f:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
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
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbad.m20523d(r1)
            r9.mo28076a(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgo.mo28077a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo28079b(String str) {
        String valueOf = String.valueOf(super.mo28079b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: c */
    public final ByteBuffer mo28096c() {
        synchronized (this.f18964p) {
            if (this.f18962n != null && !this.f18963o) {
                this.f18962n.flip();
                this.f18963o = true;
            }
            this.f18959k = true;
        }
        return this.f18962n;
    }

    /* renamed from: d */
    public final String mo28097d() {
        return this.f18957i;
    }

    /* renamed from: e */
    public final boolean mo28098e() {
        return this.f18965q;
    }

    /* renamed from: b */
    public final void mo28080b() {
        this.f18959k = true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28050a(Object obj, zzry zzry) {
        zzrv zzrv = (zzrv) obj;
        if (zzrv instanceof zzsa) {
            this.f18960l.mo26171a((zzsa) zzrv);
        }
    }
}
