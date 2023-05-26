package com.google.android.gms.internal.ads;

final class j30 {

    /* renamed from: a */
    private int f15711a = 1000;

    /* renamed from: b */
    private int[] f15712b = new int[1000];

    /* renamed from: c */
    private long[] f15713c = new long[1000];

    /* renamed from: d */
    private int[] f15714d = new int[1000];

    /* renamed from: e */
    private int[] f15715e = new int[1000];

    /* renamed from: f */
    private long[] f15716f = new long[1000];

    /* renamed from: g */
    private zznx[] f15717g = new zznx[1000];

    /* renamed from: h */
    private zzlh[] f15718h = new zzlh[1000];

    /* renamed from: i */
    private int f15719i;

    /* renamed from: j */
    private int f15720j;

    /* renamed from: k */
    private int f15721k;

    /* renamed from: l */
    private int f15722l;

    /* renamed from: m */
    private long f15723m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f15724n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f15725o = true;

    /* renamed from: p */
    private boolean f15726p = true;

    /* renamed from: q */
    private zzlh f15727q;

    /* renamed from: a */
    public final synchronized long mo26112a() {
        return Math.max(this.f15723m, this.f15724n);
    }

    /* renamed from: b */
    public final void mo26117b() {
        this.f15720j = 0;
        this.f15721k = 0;
        this.f15722l = 0;
        this.f15719i = 0;
        this.f15725o = true;
    }

    /* renamed from: c */
    public final void mo26118c() {
        this.f15723m = Long.MIN_VALUE;
        this.f15724n = Long.MIN_VALUE;
    }

    /* renamed from: d */
    public final int mo26119d() {
        return this.f15720j + this.f15719i;
    }

    /* renamed from: e */
    public final synchronized boolean mo26120e() {
        return this.f15719i != 0;
    }

    /* renamed from: f */
    public final synchronized zzlh mo26121f() {
        if (this.f15726p) {
            return null;
        }
        return this.f15727q;
    }

    /* renamed from: g */
    public final synchronized long mo26122g() {
        if (!mo26120e()) {
            return -1;
        }
        int i = ((this.f15721k + this.f15719i) - 1) % this.f15711a;
        this.f15721k = (this.f15721k + this.f15719i) % this.f15711a;
        this.f15720j += this.f15719i;
        this.f15719i = 0;
        return this.f15713c[i] + ((long) this.f15714d[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo26111a(com.google.android.gms.internal.ads.zzlj r5, com.google.android.gms.internal.ads.zznd r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzlh r9, com.google.android.gms.internal.ads.zzqs r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo26120e()     // Catch:{ all -> 0x00a4 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo29541a(r5)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzlh r6 = r4.f15727q     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzlh r6 = r4.f15727q     // Catch:{ all -> 0x00a4 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.zzlh r6 = r4.f15727q     // Catch:{ all -> 0x00a4 }
            r5.f22205a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzlh[] r7 = r4.f15718h     // Catch:{ all -> 0x00a4 }
            int r8 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a4 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009a
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.f22333c     // Catch:{ all -> 0x00a4 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            monitor-exit(r4)
            return r2
        L_0x003c:
            long[] r5 = r4.f15716f     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.f22334d = r0     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f15715e     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.mo29541a(r5)     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f15714d     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f22537a = r5     // Catch:{ all -> 0x00a4 }
            long[] r5 = r4.f15713c     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f22538b = r0     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.zznx[] r5 = r4.f15717g     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f22540d = r5     // Catch:{ all -> 0x00a4 }
            long r0 = r4.f15723m     // Catch:{ all -> 0x00a4 }
            long r5 = r6.f22334d     // Catch:{ all -> 0x00a4 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a4 }
            r4.f15723m = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f15719i     // Catch:{ all -> 0x00a4 }
            int r5 = r5 - r8
            r4.f15719i = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            int r5 = r5 + r8
            r4.f15721k = r5     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f15720j     // Catch:{ all -> 0x00a4 }
            int r6 = r6 + r8
            r4.f15720j = r6     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f15711a     // Catch:{ all -> 0x00a4 }
            if (r5 != r6) goto L_0x0084
            r4.f15721k = r7     // Catch:{ all -> 0x00a4 }
        L_0x0084:
            int r5 = r4.f15719i     // Catch:{ all -> 0x00a4 }
            if (r5 <= 0) goto L_0x008f
            long[] r5 = r4.f15713c     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a4 }
            goto L_0x0096
        L_0x008f:
            long r5 = r10.f22538b     // Catch:{ all -> 0x00a4 }
            int r7 = r10.f22537a     // Catch:{ all -> 0x00a4 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a4 }
            long r5 = r5 + r7
            r6 = r5
        L_0x0096:
            r10.f22539c = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x009a:
            com.google.android.gms.internal.ads.zzlh[] r6 = r4.f15718h     // Catch:{ all -> 0x00a4 }
            int r7 = r4.f15721k     // Catch:{ all -> 0x00a4 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a4 }
            r5.f22205a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x00a4:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j30.mo26111a(com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zznd, boolean, boolean, com.google.android.gms.internal.ads.zzlh, com.google.android.gms.internal.ads.zzqs):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo26113a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo26120e()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r8.f15716f     // Catch:{ all -> 0x005e }
            int r3 = r8.f15721k     // Catch:{ all -> 0x005e }
            r3 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r3 = r8.f15724n     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.f15721k     // Catch:{ all -> 0x005e }
            r3 = -1
            r4 = -1
        L_0x0023:
            int r5 = r8.f15722l     // Catch:{ all -> 0x005e }
            if (r0 == r5) goto L_0x0040
            long[] r5 = r8.f15716f     // Catch:{ all -> 0x005e }
            r6 = r5[r0]     // Catch:{ all -> 0x005e }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0040
            int[] r5 = r8.f15715e     // Catch:{ all -> 0x005e }
            r5 = r5[r0]     // Catch:{ all -> 0x005e }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0038
            r4 = r11
        L_0x0038:
            int r0 = r0 + 1
            int r5 = r8.f15711a     // Catch:{ all -> 0x005e }
            int r0 = r0 % r5
            int r11 = r11 + 1
            goto L_0x0023
        L_0x0040:
            if (r4 != r3) goto L_0x0044
            monitor-exit(r8)
            return r1
        L_0x0044:
            int r9 = r8.f15721k     // Catch:{ all -> 0x005e }
            int r9 = r9 + r4
            int r10 = r8.f15711a     // Catch:{ all -> 0x005e }
            int r9 = r9 % r10
            r8.f15721k = r9     // Catch:{ all -> 0x005e }
            int r10 = r8.f15720j     // Catch:{ all -> 0x005e }
            int r10 = r10 + r4
            r8.f15720j = r10     // Catch:{ all -> 0x005e }
            int r10 = r8.f15719i     // Catch:{ all -> 0x005e }
            int r10 = r10 - r4
            r8.f15719i = r10     // Catch:{ all -> 0x005e }
            long[] r10 = r8.f15713c     // Catch:{ all -> 0x005e }
            r9 = r10[r9]     // Catch:{ all -> 0x005e }
            monitor-exit(r8)
            return r9
        L_0x005c:
            monitor-exit(r8)
            return r1
        L_0x005e:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0062
        L_0x0061:
            throw r9
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j30.mo26113a(long, boolean):long");
    }

    /* renamed from: a */
    public final synchronized boolean mo26116a(zzlh zzlh) {
        if (zzlh == null) {
            this.f15726p = true;
            return false;
        }
        this.f15726p = false;
        if (zzsy.m25289a((Object) zzlh, (Object) this.f15727q)) {
            return false;
        }
        this.f15727q = zzlh;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26115a(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.zznx r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f15725o     // Catch:{ all -> 0x00e7 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f15725o = r1     // Catch:{ all -> 0x00e7 }
        L_0x000e:
            boolean r0 = r5.f15726p     // Catch:{ all -> 0x00e7 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)     // Catch:{ all -> 0x00e7 }
            r5.mo26114a((long) r6)     // Catch:{ all -> 0x00e7 }
            long[] r0 = r5.f15716f     // Catch:{ all -> 0x00e7 }
            int r3 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r0[r3] = r6     // Catch:{ all -> 0x00e7 }
            long[] r6 = r5.f15713c     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r9     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f15714d     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r11     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f15715e     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zznx[] r6 = r5.f15717g     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r12     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzlh[] r6 = r5.f15718h     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzlh r8 = r5.f15727q     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f15712b     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r1     // Catch:{ all -> 0x00e7 }
            int r6 = r5.f15719i     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.f15719i = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00da
            int r6 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e7 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e7 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e7 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e7 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zznx[] r12 = new com.google.android.gms.internal.ads.zznx[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzlh[] r0 = new com.google.android.gms.internal.ads.zzlh[r6]     // Catch:{ all -> 0x00e7 }
            int r2 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            int r3 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            int r2 = r2 - r3
            long[] r3 = r5.f15713c     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e7 }
            long[] r3 = r5.f15716f     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f15715e     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f15714d     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zznx[] r3 = r5.f15717g     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzlh[] r3 = r5.f15718h     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f15712b     // Catch:{ all -> 0x00e7 }
            int r4 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e7 }
            int r3 = r5.f15721k     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.f15713c     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.f15716f     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f15715e     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f15714d     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zznx[] r4 = r5.f15717g     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzlh[] r4 = r5.f15718h     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f15712b     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e7 }
            r5.f15713c = r8     // Catch:{ all -> 0x00e7 }
            r5.f15716f = r9     // Catch:{ all -> 0x00e7 }
            r5.f15715e = r10     // Catch:{ all -> 0x00e7 }
            r5.f15714d = r11     // Catch:{ all -> 0x00e7 }
            r5.f15717g = r12     // Catch:{ all -> 0x00e7 }
            r5.f15718h = r0     // Catch:{ all -> 0x00e7 }
            r5.f15712b = r7     // Catch:{ all -> 0x00e7 }
            r5.f15721k = r1     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            r5.f15722l = r7     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            r5.f15719i = r7     // Catch:{ all -> 0x00e7 }
            r5.f15711a = r6     // Catch:{ all -> 0x00e7 }
            monitor-exit(r5)
            return
        L_0x00da:
            int r6 = r5.f15722l     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.f15722l = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f15711a     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00e5
            r5.f15722l = r1     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r5)
            return
        L_0x00e7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j30.mo26115a(long, int, long, int, com.google.android.gms.internal.ads.zznx):void");
    }

    /* renamed from: a */
    public final synchronized void mo26114a(long j) {
        this.f15724n = Math.max(this.f15724n, j);
    }
}
