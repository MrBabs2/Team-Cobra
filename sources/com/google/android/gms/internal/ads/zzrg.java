package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class zzrg extends zzrj {

    /* renamed from: d */
    private final AtomicReference<zzrh> f22584d;

    public zzrg() {
        this((zzrn) null);
    }

    /* renamed from: a */
    private static int m25149a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: b */
    private static boolean m25151b(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        if (r10 <= r15) goto L_0x017b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzrm[] mo29684a(com.google.android.gms.internal.ads.zzlp[] r35, com.google.android.gms.internal.ads.zzrb[] r36, int[][][] r37) throws com.google.android.gms.internal.ads.zzku {
        /*
            r34 = this;
            r0 = r35
            int r1 = r0.length
            com.google.android.gms.internal.ads.zzrm[] r2 = new com.google.android.gms.internal.ads.zzrm[r1]
            r3 = r34
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.zzrh> r4 = r3.f22584d
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzrh r4 = (com.google.android.gms.internal.ads.zzrh) r4
            r6 = 0
            r7 = 0
        L_0x0011:
            r8 = 2
            if (r6 >= r1) goto L_0x024f
            r12 = r0[r6]
            int r12 = r12.mo29450o()
            if (r8 != r12) goto L_0x0239
            if (r7 != 0) goto L_0x022c
            r7 = r36[r6]
            r12 = r37[r6]
            int r13 = r4.f22586b
            int r14 = r4.f22587c
            int r15 = r4.f22588d
            int r10 = r4.f22591g
            int r8 = r4.f22592h
            boolean r5 = r4.f22593i
            boolean r9 = r4.f22589e
            boolean r11 = r4.f22590f
            r23 = r1
            r19 = r4
            r0 = 0
            r3 = 0
            r4 = 0
            r20 = 0
            r21 = -1
            r22 = -1
        L_0x003f:
            int r1 = r7.f22575a
            if (r4 >= r1) goto L_0x020c
            com.google.android.gms.internal.ads.zzra r1 = r7.mo29675a((int) r4)
            r24 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r25 = r2
            int r2 = r1.f22571a
            r7.<init>(r2)
            r26 = r6
            r2 = 0
        L_0x0055:
            int r6 = r1.f22571a
            if (r2 >= r6) goto L_0x0063
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7.add(r6)
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0063:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r2) goto L_0x0130
            if (r8 != r2) goto L_0x006c
            goto L_0x0130
        L_0x006c:
            r27 = r0
            r6 = 0
        L_0x006f:
            int r0 = r1.f22571a
            if (r6 >= r0) goto L_0x00fa
            com.google.android.gms.internal.ads.zzlh r0 = r1.mo29671a((int) r6)
            r28 = r3
            int r3 = r0.f22193o
            if (r3 <= 0) goto L_0x00e0
            r29 = r9
            int r9 = r0.f22194p
            if (r9 <= 0) goto L_0x00db
            r30 = r5
            if (r5 == 0) goto L_0x009b
            if (r3 <= r9) goto L_0x008b
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            r31 = r8
            if (r10 <= r8) goto L_0x0092
            r8 = 1
            goto L_0x0093
        L_0x0092:
            r8 = 0
        L_0x0093:
            if (r5 == r8) goto L_0x009d
            r5 = r10
            r32 = r5
            r8 = r31
            goto L_0x00a2
        L_0x009b:
            r31 = r8
        L_0x009d:
            r8 = r10
            r32 = r8
            r5 = r31
        L_0x00a2:
            int r10 = r3 * r5
            r33 = r15
            int r15 = r9 * r8
            if (r10 < r15) goto L_0x00b4
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.gms.internal.ads.zzsy.m25281a((int) r15, (int) r3)
            r5.<init>(r8, r3)
            goto L_0x00be
        L_0x00b4:
            android.graphics.Point r3 = new android.graphics.Point
            int r8 = com.google.android.gms.internal.ads.zzsy.m25281a((int) r10, (int) r9)
            r3.<init>(r8, r5)
            r5 = r3
        L_0x00be:
            int r3 = r0.f22193o
            int r0 = r0.f22194p
            int r8 = r3 * r0
            int r9 = r5.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r3 < r9) goto L_0x00ea
            int r3 = r5.y
            float r3 = (float) r3
            float r3 = r3 * r10
            int r3 = (int) r3
            if (r0 < r3) goto L_0x00ea
            if (r8 >= r2) goto L_0x00ea
            r2 = r8
            goto L_0x00ea
        L_0x00db:
            r30 = r5
            r31 = r8
            goto L_0x00e6
        L_0x00e0:
            r30 = r5
            r31 = r8
            r29 = r9
        L_0x00e6:
            r32 = r10
            r33 = r15
        L_0x00ea:
            int r6 = r6 + 1
            r3 = r28
            r9 = r29
            r5 = r30
            r8 = r31
            r10 = r32
            r15 = r33
            goto L_0x006f
        L_0x00fa:
            r28 = r3
            r30 = r5
            r31 = r8
            r29 = r9
            r32 = r10
            r33 = r15
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L_0x013e
            int r0 = r7.size()
            r3 = 1
            int r0 = r0 - r3
        L_0x0111:
            if (r0 < 0) goto L_0x013e
            java.lang.Object r3 = r7.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.gms.internal.ads.zzlh r3 = r1.mo29671a((int) r3)
            int r3 = r3.mo29471b()
            r5 = -1
            if (r3 == r5) goto L_0x012a
            if (r3 <= r2) goto L_0x012d
        L_0x012a:
            r7.remove(r0)
        L_0x012d:
            int r0 = r0 + -1
            goto L_0x0111
        L_0x0130:
            r27 = r0
            r28 = r3
            r30 = r5
            r31 = r8
            r29 = r9
            r32 = r10
            r33 = r15
        L_0x013e:
            r0 = r12[r4]
            r5 = r20
            r6 = r21
            r8 = r22
            r3 = r28
            r2 = 0
        L_0x0149:
            int r9 = r1.f22571a
            if (r2 >= r9) goto L_0x01ee
            r9 = r0[r2]
            boolean r9 = m25151b(r9, r11)
            if (r9 == 0) goto L_0x01da
            com.google.android.gms.internal.ads.zzlh r9 = r1.mo29671a((int) r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            boolean r10 = r7.contains(r10)
            if (r10 == 0) goto L_0x017d
            int r10 = r9.f22193o
            r15 = -1
            if (r10 == r15) goto L_0x016a
            if (r10 > r13) goto L_0x017d
        L_0x016a:
            int r10 = r9.f22194p
            if (r10 == r15) goto L_0x0170
            if (r10 > r14) goto L_0x017d
        L_0x0170:
            int r10 = r9.f22185g
            if (r10 == r15) goto L_0x0179
            r15 = r33
            if (r10 > r15) goto L_0x017f
            goto L_0x017b
        L_0x0179:
            r15 = r33
        L_0x017b:
            r10 = 1
            goto L_0x0180
        L_0x017d:
            r15 = r33
        L_0x017f:
            r10 = 0
        L_0x0180:
            if (r10 != 0) goto L_0x018c
            if (r29 == 0) goto L_0x0185
            goto L_0x018c
        L_0x0185:
            r22 = r0
            r20 = r1
            r21 = r3
            goto L_0x01e2
        L_0x018c:
            r20 = r1
            r21 = r3
            if (r10 == 0) goto L_0x0194
            r1 = 2
            goto L_0x0195
        L_0x0194:
            r1 = 1
        L_0x0195:
            r3 = r0[r2]
            r22 = r0
            r0 = 0
            boolean r3 = m25151b(r3, r0)
            if (r3 == 0) goto L_0x01a2
            int r1 = r1 + 1000
        L_0x01a2:
            if (r1 <= r5) goto L_0x01a6
            r0 = 1
            goto L_0x01a7
        L_0x01a6:
            r0 = 0
        L_0x01a7:
            if (r1 != r5) goto L_0x01ca
            int r0 = r9.mo29471b()
            if (r0 == r6) goto L_0x01b8
            int r0 = r9.mo29471b()
            int r0 = m25149a((int) r0, (int) r6)
            goto L_0x01be
        L_0x01b8:
            int r0 = r9.f22185g
            int r0 = m25149a((int) r0, (int) r8)
        L_0x01be:
            if (r3 == 0) goto L_0x01c5
            if (r10 == 0) goto L_0x01c5
            if (r0 <= 0) goto L_0x01c9
            goto L_0x01c7
        L_0x01c5:
            if (r0 >= 0) goto L_0x01c9
        L_0x01c7:
            r0 = 1
            goto L_0x01ca
        L_0x01c9:
            r0 = 0
        L_0x01ca:
            if (r0 == 0) goto L_0x01e2
            int r0 = r9.f22185g
            int r3 = r9.mo29471b()
            r8 = r0
            r5 = r1
            r27 = r2
            r6 = r3
            r3 = r20
            goto L_0x01e4
        L_0x01da:
            r22 = r0
            r20 = r1
            r21 = r3
            r15 = r33
        L_0x01e2:
            r3 = r21
        L_0x01e4:
            int r2 = r2 + 1
            r33 = r15
            r1 = r20
            r0 = r22
            goto L_0x0149
        L_0x01ee:
            r21 = r3
            r15 = r33
            int r4 = r4 + 1
            r20 = r5
            r22 = r8
            r7 = r24
            r2 = r25
            r0 = r27
            r9 = r29
            r5 = r30
            r8 = r31
            r10 = r32
            r21 = r6
            r6 = r26
            goto L_0x003f
        L_0x020c:
            r27 = r0
            r25 = r2
            r28 = r3
            r26 = r6
            if (r28 != 0) goto L_0x0218
            r10 = 0
            goto L_0x0221
        L_0x0218:
            com.google.android.gms.internal.ads.zzri r10 = new com.google.android.gms.internal.ads.zzri
            r1 = r27
            r0 = r28
            r10.<init>(r0, r1)
        L_0x0221:
            r25[r26] = r10
            r0 = r25[r26]
            if (r0 == 0) goto L_0x0229
            r11 = 1
            goto L_0x022a
        L_0x0229:
            r11 = 0
        L_0x022a:
            r7 = r11
            goto L_0x0234
        L_0x022c:
            r23 = r1
            r25 = r2
            r19 = r4
            r26 = r6
        L_0x0234:
            r0 = r36[r26]
            int r0 = r0.f22575a
            goto L_0x0241
        L_0x0239:
            r23 = r1
            r25 = r2
            r19 = r4
            r26 = r6
        L_0x0241:
            int r6 = r26 + 1
            r3 = r34
            r0 = r35
            r4 = r19
            r1 = r23
            r2 = r25
            goto L_0x0011
        L_0x024f:
            r25 = r2
            r19 = r4
            r3 = r1
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0257:
            if (r0 >= r3) goto L_0x0420
            r4 = r35[r0]
            int r4 = r4.mo29450o()
            r6 = 3
            r7 = 1
            if (r4 == r7) goto L_0x038d
            r7 = 2
            if (r4 == r7) goto L_0x0386
            if (r4 == r6) goto L_0x02de
            r4 = r35[r0]
            r4.mo29450o()
            r4 = r36[r0]
            r5 = r37[r0]
            r7 = r19
            boolean r6 = r7.f22590f
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0279:
            int r12 = r4.f22575a
            if (r9 >= r12) goto L_0x02cb
            com.google.android.gms.internal.ads.zzra r12 = r4.mo29675a((int) r9)
            r13 = r5[r9]
            r14 = 0
        L_0x0284:
            int r15 = r12.f22571a
            if (r14 >= r15) goto L_0x02c4
            r15 = r13[r14]
            boolean r15 = m25151b(r15, r6)
            if (r15 == 0) goto L_0x02b9
            com.google.android.gms.internal.ads.zzlh r15 = r12.mo29671a((int) r14)
            int r15 = r15.f22180C
            r18 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x029e
            r15 = 1
            goto L_0x029f
        L_0x029e:
            r15 = 0
        L_0x029f:
            r23 = r3
            if (r15 == 0) goto L_0x02a5
            r15 = 2
            goto L_0x02a6
        L_0x02a5:
            r15 = 1
        L_0x02a6:
            r3 = r13[r14]
            r19 = r4
            r4 = 0
            boolean r3 = m25151b(r3, r4)
            if (r3 == 0) goto L_0x02b3
            int r15 = r15 + 1000
        L_0x02b3:
            if (r15 <= r11) goto L_0x02bd
            r8 = r12
            r10 = r14
            r11 = r15
            goto L_0x02bd
        L_0x02b9:
            r23 = r3
            r19 = r4
        L_0x02bd:
            int r14 = r14 + 1
            r4 = r19
            r3 = r23
            goto L_0x0284
        L_0x02c4:
            r23 = r3
            r19 = r4
            int r9 = r9 + 1
            goto L_0x0279
        L_0x02cb:
            r23 = r3
            if (r8 != 0) goto L_0x02d1
            r3 = 0
            goto L_0x02d6
        L_0x02d1:
            com.google.android.gms.internal.ads.zzri r3 = new com.google.android.gms.internal.ads.zzri
            r3.<init>(r8, r10)
        L_0x02d6:
            r25[r0] = r3
            r5 = -1
            r15 = 0
            r17 = 2
            goto L_0x0382
        L_0x02de:
            r23 = r3
            r7 = r19
            if (r2 != 0) goto L_0x038a
            r2 = r36[r0]
            r3 = r37[r0]
            boolean r4 = r7.f22590f
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x02ee:
            int r12 = r2.f22575a
            if (r8 >= r12) goto L_0x036b
            com.google.android.gms.internal.ads.zzra r12 = r2.mo29675a((int) r8)
            r13 = r3[r8]
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = 0
        L_0x02fc:
            int r15 = r12.f22571a
            if (r9 >= r15) goto L_0x0360
            r15 = r13[r9]
            boolean r15 = m25151b(r15, r4)
            if (r15 == 0) goto L_0x0356
            com.google.android.gms.internal.ads.zzlh r15 = r12.mo29671a((int) r9)
            int r5 = r15.f22180C
            r18 = 1
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0316
            r5 = 1
            goto L_0x0317
        L_0x0316:
            r5 = 0
        L_0x0317:
            int r6 = r15.f22180C
            r17 = 2
            r6 = r6 & 2
            r21 = r2
            r2 = 0
            if (r6 == 0) goto L_0x0324
            r6 = 1
            goto L_0x0325
        L_0x0324:
            r6 = 0
        L_0x0325:
            boolean r22 = m25150a((com.google.android.gms.internal.ads.zzlh) r15, (java.lang.String) r2)
            if (r22 == 0) goto L_0x0335
            if (r5 == 0) goto L_0x032f
            r2 = 6
            goto L_0x0345
        L_0x032f:
            if (r6 != 0) goto L_0x0333
            r2 = 5
            goto L_0x0345
        L_0x0333:
            r2 = 4
            goto L_0x0345
        L_0x0335:
            if (r5 == 0) goto L_0x0339
            r2 = 3
            goto L_0x0345
        L_0x0339:
            if (r6 == 0) goto L_0x035a
            r2 = 0
            boolean r5 = m25150a((com.google.android.gms.internal.ads.zzlh) r15, (java.lang.String) r2)
            if (r5 == 0) goto L_0x0344
            r2 = 2
            goto L_0x0345
        L_0x0344:
            r2 = 1
        L_0x0345:
            r5 = r13[r9]
            r6 = 0
            boolean r5 = m25151b(r5, r6)
            if (r5 == 0) goto L_0x0350
            int r2 = r2 + 1000
        L_0x0350:
            if (r2 <= r11) goto L_0x035a
            r11 = r2
            r10 = r9
            r14 = r12
            goto L_0x035a
        L_0x0356:
            r21 = r2
            r17 = 2
        L_0x035a:
            int r9 = r9 + 1
            r2 = r21
            r6 = 3
            goto L_0x02fc
        L_0x0360:
            r21 = r2
            r17 = 2
            int r8 = r8 + 1
            r9 = r10
            r10 = r11
            r11 = r14
            r6 = 3
            goto L_0x02ee
        L_0x036b:
            r17 = 2
            if (r11 != 0) goto L_0x0371
            r2 = 0
            goto L_0x0376
        L_0x0371:
            com.google.android.gms.internal.ads.zzri r2 = new com.google.android.gms.internal.ads.zzri
            r2.<init>(r11, r9)
        L_0x0376:
            r25[r0] = r2
            r2 = r25[r0]
            if (r2 == 0) goto L_0x037e
            r3 = 1
            goto L_0x037f
        L_0x037e:
            r3 = 0
        L_0x037f:
            r2 = r3
        L_0x0380:
            r5 = -1
            r15 = 0
        L_0x0382:
            r18 = 1
            goto L_0x0418
        L_0x0386:
            r23 = r3
            r7 = r19
        L_0x038a:
            r17 = 2
            goto L_0x0380
        L_0x038d:
            r23 = r3
            r7 = r19
            r17 = 2
            if (r1 != 0) goto L_0x0380
            r1 = r36[r0]
            r3 = r37[r0]
            boolean r4 = r7.f22590f
            r5 = 0
            r6 = 0
            r8 = -1
            r9 = -1
        L_0x039f:
            int r10 = r1.f22575a
            if (r5 >= r10) goto L_0x03fd
            com.google.android.gms.internal.ads.zzra r10 = r1.mo29675a((int) r5)
            r11 = r3[r5]
            r12 = r9
            r9 = r8
            r8 = r6
            r6 = 0
        L_0x03ad:
            int r13 = r10.f22571a
            if (r6 >= r13) goto L_0x03f4
            r13 = r11[r6]
            boolean r13 = m25151b(r13, r4)
            if (r13 == 0) goto L_0x03ee
            com.google.android.gms.internal.ads.zzlh r13 = r10.mo29671a((int) r6)
            r14 = r11[r6]
            int r15 = r13.f22180C
            r18 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x03cb
            r15 = 0
            r16 = 1
            goto L_0x03ce
        L_0x03cb:
            r15 = 0
            r16 = 0
        L_0x03ce:
            boolean r13 = m25150a((com.google.android.gms.internal.ads.zzlh) r13, (java.lang.String) r15)
            if (r13 == 0) goto L_0x03da
            if (r16 == 0) goto L_0x03d8
            r13 = 4
            goto L_0x03df
        L_0x03d8:
            r13 = 3
            goto L_0x03df
        L_0x03da:
            if (r16 == 0) goto L_0x03de
            r13 = 2
            goto L_0x03df
        L_0x03de:
            r13 = 1
        L_0x03df:
            r15 = 0
            boolean r14 = m25151b(r14, r15)
            if (r14 == 0) goto L_0x03e8
            int r13 = r13 + 1000
        L_0x03e8:
            if (r13 <= r8) goto L_0x03f1
            r9 = r5
            r12 = r6
            r8 = r13
            goto L_0x03f1
        L_0x03ee:
            r15 = 0
            r18 = 1
        L_0x03f1:
            int r6 = r6 + 1
            goto L_0x03ad
        L_0x03f4:
            r15 = 0
            r18 = 1
            int r5 = r5 + 1
            r6 = r8
            r8 = r9
            r9 = r12
            goto L_0x039f
        L_0x03fd:
            r5 = -1
            r15 = 0
            r18 = 1
            if (r8 != r5) goto L_0x0405
            r3 = 0
            goto L_0x040e
        L_0x0405:
            com.google.android.gms.internal.ads.zzra r1 = r1.mo29675a((int) r8)
            com.google.android.gms.internal.ads.zzri r3 = new com.google.android.gms.internal.ads.zzri
            r3.<init>(r1, r9)
        L_0x040e:
            r25[r0] = r3
            r1 = r25[r0]
            if (r1 == 0) goto L_0x0416
            r3 = 1
            goto L_0x0417
        L_0x0416:
            r3 = 0
        L_0x0417:
            r1 = r3
        L_0x0418:
            int r0 = r0 + 1
            r19 = r7
            r3 = r23
            goto L_0x0257
        L_0x0420:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.mo29684a(com.google.android.gms.internal.ads.zzlp[], com.google.android.gms.internal.ads.zzrb[], int[][][]):com.google.android.gms.internal.ads.zzrm[]");
    }

    private zzrg(zzrn zzrn) {
        this.f22584d = new AtomicReference<>(new zzrh());
    }

    /* renamed from: a */
    private static boolean m25150a(zzlh zzlh, String str) {
        return str != null && TextUtils.equals(str, zzsy.m25294c(zzlh.f22181D));
    }
}
