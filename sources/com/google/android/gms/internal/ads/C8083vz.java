package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz */
final class C8083vz {

    /* renamed from: a */
    private int f17041a = 1000;

    /* renamed from: b */
    private long[] f17042b = new long[1000];

    /* renamed from: c */
    private int[] f17043c = new int[1000];

    /* renamed from: d */
    private int[] f17044d = new int[1000];

    /* renamed from: e */
    private long[] f17045e = new long[1000];

    /* renamed from: f */
    private byte[][] f17046f = new byte[1000][];

    /* renamed from: g */
    private int f17047g;

    /* renamed from: h */
    private int f17048h;

    /* renamed from: i */
    private int f17049i;

    /* renamed from: j */
    private int f17050j;

    /* renamed from: a */
    public final void mo26714a() {
        this.f17048h = 0;
        this.f17049i = 0;
        this.f17050j = 0;
        this.f17047g = 0;
    }

    /* renamed from: b */
    public final synchronized long mo26717b() {
        this.f17047g--;
        int i = this.f17049i;
        int i2 = i + 1;
        this.f17049i = i2;
        this.f17048h++;
        if (i2 == this.f17041a) {
            this.f17049i = 0;
        }
        if (this.f17047g > 0) {
            return this.f17042b[this.f17049i];
        }
        return ((long) this.f17043c[i]) + this.f17042b[i];
    }

    /* renamed from: a */
    public final synchronized boolean mo26716a(zzhm zzhm, C8120wz wzVar) {
        if (this.f17047g == 0) {
            return false;
        }
        zzhm.f21965e = this.f17045e[this.f17049i];
        zzhm.f21963c = this.f17043c[this.f17049i];
        zzhm.f21964d = this.f17044d[this.f17049i];
        wzVar.f17107a = this.f17042b[this.f17049i];
        wzVar.f17108b = this.f17046f[this.f17049i];
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo26713a(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f17047g     // Catch:{ all -> 0x0067 }
            r1 = -1
            if (r0 == 0) goto L_0x0065
            long[] r0 = r9.f17045e     // Catch:{ all -> 0x0067 }
            int r3 = r9.f17049i     // Catch:{ all -> 0x0067 }
            r3 = r0[r3]     // Catch:{ all -> 0x0067 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0065
        L_0x0012:
            int r0 = r9.f17050j     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0019
            int r0 = r9.f17041a     // Catch:{ all -> 0x0067 }
            goto L_0x001b
        L_0x0019:
            int r0 = r9.f17050j     // Catch:{ all -> 0x0067 }
        L_0x001b:
            int r0 = r0 + -1
            long[] r3 = r9.f17045e     // Catch:{ all -> 0x0067 }
            r4 = r3[r0]     // Catch:{ all -> 0x0067 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            monitor-exit(r9)
            return r1
        L_0x0027:
            r0 = 0
            int r3 = r9.f17049i     // Catch:{ all -> 0x0067 }
            r4 = -1
            r5 = -1
        L_0x002c:
            int r6 = r9.f17050j     // Catch:{ all -> 0x0067 }
            if (r3 == r6) goto L_0x0049
            long[] r6 = r9.f17045e     // Catch:{ all -> 0x0067 }
            r7 = r6[r3]     // Catch:{ all -> 0x0067 }
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0049
            int[] r6 = r9.f17044d     // Catch:{ all -> 0x0067 }
            r6 = r6[r3]     // Catch:{ all -> 0x0067 }
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0041
            r5 = r0
        L_0x0041:
            int r3 = r3 + 1
            int r6 = r9.f17041a     // Catch:{ all -> 0x0067 }
            int r3 = r3 % r6
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0049:
            if (r5 != r4) goto L_0x004d
            monitor-exit(r9)
            return r1
        L_0x004d:
            int r10 = r9.f17047g     // Catch:{ all -> 0x0067 }
            int r10 = r10 - r5
            r9.f17047g = r10     // Catch:{ all -> 0x0067 }
            int r10 = r9.f17049i     // Catch:{ all -> 0x0067 }
            int r10 = r10 + r5
            int r11 = r9.f17041a     // Catch:{ all -> 0x0067 }
            int r10 = r10 % r11
            r9.f17049i = r10     // Catch:{ all -> 0x0067 }
            int r11 = r9.f17048h     // Catch:{ all -> 0x0067 }
            int r11 = r11 + r5
            r9.f17048h = r11     // Catch:{ all -> 0x0067 }
            long[] r11 = r9.f17042b     // Catch:{ all -> 0x0067 }
            r10 = r11[r10]     // Catch:{ all -> 0x0067 }
            monitor-exit(r9)
            return r10
        L_0x0065:
            monitor-exit(r9)
            return r1
        L_0x0067:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x006b
        L_0x006a:
            throw r10
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8083vz.mo26713a(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26715a(long r4, int r6, long r7, int r9, byte[] r10) {
        /*
            r3 = this;
            monitor-enter(r3)
            long[] r0 = r3.f17045e     // Catch:{ all -> 0x00a1 }
            int r1 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            r0[r1] = r4     // Catch:{ all -> 0x00a1 }
            long[] r4 = r3.f17042b     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            r4[r5] = r7     // Catch:{ all -> 0x00a1 }
            int[] r4 = r3.f17043c     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            r4[r5] = r9     // Catch:{ all -> 0x00a1 }
            int[] r4 = r3.f17044d     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            r4[r5] = r6     // Catch:{ all -> 0x00a1 }
            byte[][] r4 = r3.f17046f     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            r4[r5] = r10     // Catch:{ all -> 0x00a1 }
            int r4 = r3.f17047g     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + 1
            r3.f17047g = r4     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            r6 = 0
            if (r4 != r5) goto L_0x0093
            int r4 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + 1000
            long[] r5 = new long[r4]     // Catch:{ all -> 0x00a1 }
            long[] r7 = new long[r4]     // Catch:{ all -> 0x00a1 }
            int[] r8 = new int[r4]     // Catch:{ all -> 0x00a1 }
            int[] r9 = new int[r4]     // Catch:{ all -> 0x00a1 }
            byte[][] r10 = new byte[r4][]     // Catch:{ all -> 0x00a1 }
            int r0 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            int r1 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            int r0 = r0 - r1
            long[] r1 = r3.f17042b     // Catch:{ all -> 0x00a1 }
            int r2 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r1, r2, r5, r6, r0)     // Catch:{ all -> 0x00a1 }
            long[] r1 = r3.f17045e     // Catch:{ all -> 0x00a1 }
            int r2 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r1, r2, r7, r6, r0)     // Catch:{ all -> 0x00a1 }
            int[] r1 = r3.f17044d     // Catch:{ all -> 0x00a1 }
            int r2 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r1, r2, r8, r6, r0)     // Catch:{ all -> 0x00a1 }
            int[] r1 = r3.f17043c     // Catch:{ all -> 0x00a1 }
            int r2 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r1, r2, r9, r6, r0)     // Catch:{ all -> 0x00a1 }
            byte[][] r1 = r3.f17046f     // Catch:{ all -> 0x00a1 }
            int r2 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r1, r2, r10, r6, r0)     // Catch:{ all -> 0x00a1 }
            int r1 = r3.f17049i     // Catch:{ all -> 0x00a1 }
            long[] r2 = r3.f17042b     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r2, r6, r5, r0, r1)     // Catch:{ all -> 0x00a1 }
            long[] r2 = r3.f17045e     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r2, r6, r7, r0, r1)     // Catch:{ all -> 0x00a1 }
            int[] r2 = r3.f17044d     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r2, r6, r8, r0, r1)     // Catch:{ all -> 0x00a1 }
            int[] r2 = r3.f17043c     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r2, r6, r9, r0, r1)     // Catch:{ all -> 0x00a1 }
            byte[][] r2 = r3.f17046f     // Catch:{ all -> 0x00a1 }
            java.lang.System.arraycopy(r2, r6, r10, r0, r1)     // Catch:{ all -> 0x00a1 }
            r3.f17042b = r5     // Catch:{ all -> 0x00a1 }
            r3.f17045e = r7     // Catch:{ all -> 0x00a1 }
            r3.f17044d = r8     // Catch:{ all -> 0x00a1 }
            r3.f17043c = r9     // Catch:{ all -> 0x00a1 }
            r3.f17046f = r10     // Catch:{ all -> 0x00a1 }
            r3.f17049i = r6     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            r3.f17050j = r5     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            r3.f17047g = r5     // Catch:{ all -> 0x00a1 }
            r3.f17041a = r4     // Catch:{ all -> 0x00a1 }
            monitor-exit(r3)
            return
        L_0x0093:
            int r4 = r3.f17050j     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + 1
            r3.f17050j = r4     // Catch:{ all -> 0x00a1 }
            int r5 = r3.f17041a     // Catch:{ all -> 0x00a1 }
            if (r4 != r5) goto L_0x009f
            r3.f17050j = r6     // Catch:{ all -> 0x00a1 }
        L_0x009f:
            monitor-exit(r3)
            return
        L_0x00a1:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8083vz.mo26715a(long, int, long, int, byte[]):void");
    }
}
