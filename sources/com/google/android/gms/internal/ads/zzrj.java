package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

public abstract class zzrj extends zzrp {

    /* renamed from: b */
    private final SparseArray<Map<zzrb, zzrl>> f22594b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f22595c = new SparseBooleanArray();

    /* renamed from: a */
    public final void mo29688a(int i, boolean z) {
        if (this.f22595c.get(i) != z) {
            this.f22595c.put(i, z);
            mo29694a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzrm[] mo29684a(zzlp[] zzlpArr, zzrb[] zzrbArr, int[][][] iArr) throws zzku;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.gms.internal.ads.zzrl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzrr mo29687a(com.google.android.gms.internal.ads.zzlp[] r17, com.google.android.gms.internal.ads.zzrb r18) throws com.google.android.gms.internal.ads.zzku {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r1.length
            int r3 = r3 + 1
            int[] r3 = new int[r3]
            int r4 = r1.length
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zzra[][] r5 = new com.google.android.gms.internal.ads.zzra[r4][]
            int r6 = r1.length
            int r6 = r6 + 1
            int[][][] r11 = new int[r6][][]
            r7 = 0
        L_0x0016:
            if (r7 >= r4) goto L_0x0025
            int r8 = r2.f22575a
            com.google.android.gms.internal.ads.zzra[] r9 = new com.google.android.gms.internal.ads.zzra[r8]
            r5[r7] = r9
            int[][] r8 = new int[r8][]
            r11[r7] = r8
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0025:
            int r4 = r1.length
            int[] r10 = new int[r4]
            r7 = 0
        L_0x0029:
            if (r7 >= r4) goto L_0x0036
            r8 = r1[r7]
            int r8 = r8.mo29432a()
            r10[r7] = r8
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0036:
            r4 = 0
        L_0x0037:
            int r7 = r2.f22575a
            if (r4 >= r7) goto L_0x0096
            com.google.android.gms.internal.ads.zzra r7 = r2.mo29675a((int) r4)
            int r8 = r1.length
            r9 = 0
            r12 = 0
        L_0x0042:
            int r13 = r1.length
            if (r9 >= r13) goto L_0x0062
            r13 = r1[r9]
            r14 = 0
        L_0x0048:
            int r15 = r7.f22571a
            if (r14 >= r15) goto L_0x005f
            com.google.android.gms.internal.ads.zzlh r15 = r7.mo29671a((int) r14)
            int r15 = r13.mo29483a(r15)
            r6 = 3
            r15 = r15 & r6
            if (r15 <= r12) goto L_0x005c
            r8 = r9
            if (r15 == r6) goto L_0x0062
            r12 = r15
        L_0x005c:
            int r14 = r14 + 1
            goto L_0x0048
        L_0x005f:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0062:
            int r6 = r1.length
            if (r8 != r6) goto L_0x006a
            int r6 = r7.f22571a
            int[] r6 = new int[r6]
            goto L_0x0083
        L_0x006a:
            r6 = r1[r8]
            int r9 = r7.f22571a
            int[] r9 = new int[r9]
            r12 = 0
        L_0x0071:
            int r13 = r7.f22571a
            if (r12 >= r13) goto L_0x0082
            com.google.android.gms.internal.ads.zzlh r13 = r7.mo29671a((int) r12)
            int r13 = r6.mo29483a(r13)
            r9[r12] = r13
            int r12 = r12 + 1
            goto L_0x0071
        L_0x0082:
            r6 = r9
        L_0x0083:
            r9 = r3[r8]
            r12 = r5[r8]
            r12[r9] = r7
            r7 = r11[r8]
            r7[r9] = r6
            r6 = r3[r8]
            int r6 = r6 + 1
            r3[r8] = r6
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0096:
            int r4 = r1.length
            com.google.android.gms.internal.ads.zzrb[] r9 = new com.google.android.gms.internal.ads.zzrb[r4]
            int r4 = r1.length
            int[] r8 = new int[r4]
            r4 = 0
        L_0x009d:
            int r6 = r1.length
            if (r4 >= r6) goto L_0x00c6
            r6 = r3[r4]
            com.google.android.gms.internal.ads.zzrb r7 = new com.google.android.gms.internal.ads.zzrb
            r12 = r5[r4]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            com.google.android.gms.internal.ads.zzra[] r12 = (com.google.android.gms.internal.ads.zzra[]) r12
            r7.<init>(r12)
            r9[r4] = r7
            r7 = r11[r4]
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r7, r6)
            int[][] r6 = (int[][]) r6
            r11[r4] = r6
            r6 = r1[r4]
            int r6 = r6.mo29450o()
            r8[r4] = r6
            int r4 = r4 + 1
            goto L_0x009d
        L_0x00c6:
            int r4 = r1.length
            r3 = r3[r4]
            com.google.android.gms.internal.ads.zzrb r12 = new com.google.android.gms.internal.ads.zzrb
            int r4 = r1.length
            r4 = r5[r4]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.google.android.gms.internal.ads.zzra[] r3 = (com.google.android.gms.internal.ads.zzra[]) r3
            r12.<init>(r3)
            com.google.android.gms.internal.ads.zzrm[] r3 = r0.mo29684a(r1, r9, r11)
            r4 = 0
        L_0x00dc:
            int r5 = r1.length
            r6 = 0
            if (r4 >= r5) goto L_0x010a
            android.util.SparseBooleanArray r5 = r0.f22595c
            boolean r5 = r5.get(r4)
            if (r5 == 0) goto L_0x00eb
            r3[r4] = r6
            goto L_0x0101
        L_0x00eb:
            r5 = r9[r4]
            android.util.SparseArray<java.util.Map<com.google.android.gms.internal.ads.zzrb, com.google.android.gms.internal.ads.zzrl>> r7 = r0.f22594b
            java.lang.Object r7 = r7.get(r4)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 != 0) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            java.lang.Object r5 = r7.get(r5)
            r6 = r5
            com.google.android.gms.internal.ads.zzrl r6 = (com.google.android.gms.internal.ads.zzrl) r6
        L_0x00ff:
            if (r6 != 0) goto L_0x0104
        L_0x0101:
            int r4 = r4 + 1
            goto L_0x00dc
        L_0x0104:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x010a:
            com.google.android.gms.internal.ads.zzrk r4 = new com.google.android.gms.internal.ads.zzrk
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            int r5 = r1.length
            com.google.android.gms.internal.ads.zzlq[] r5 = new com.google.android.gms.internal.ads.zzlq[r5]
            r7 = 0
        L_0x0114:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x0124
            r8 = r3[r7]
            if (r8 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzlq r8 = com.google.android.gms.internal.ads.zzlq.f22210b
            goto L_0x011f
        L_0x011e:
            r8 = r6
        L_0x011f:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0114
        L_0x0124:
            com.google.android.gms.internal.ads.zzrr r1 = new com.google.android.gms.internal.ads.zzrr
            com.google.android.gms.internal.ads.zzro r6 = new com.google.android.gms.internal.ads.zzro
            r6.<init>(r3)
            r1.<init>(r2, r6, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrj.mo29687a(com.google.android.gms.internal.ads.zzlp[], com.google.android.gms.internal.ads.zzrb):com.google.android.gms.internal.ads.zzrr");
    }

    /* renamed from: a */
    public final void mo29689a(Object obj) {
        zzrk zzrk = (zzrk) obj;
    }
}
