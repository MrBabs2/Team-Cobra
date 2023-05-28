package com.google.android.gms.internal.ads;

final class p20 {

    /* renamed from: a */
    public final int f16548a;

    /* renamed from: b */
    public final long[] f16549b;

    /* renamed from: c */
    public final int[] f16550c;

    /* renamed from: d */
    public final int f16551d;

    /* renamed from: e */
    public final long[] f16552e;

    /* renamed from: f */
    public final int[] f16553f;

    public p20(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        zzsk.m25216a(iArr.length == jArr2.length);
        zzsk.m25216a(jArr.length == jArr2.length);
        zzsk.m25216a(iArr2.length != jArr2.length ? false : z);
        this.f16549b = jArr;
        this.f16550c = iArr;
        this.f16551d = i;
        this.f16552e = jArr2;
        this.f16553f = iArr2;
        this.f16548a = jArr.length;
    }

    /* renamed from: a */
    public final int mo26397a(long j) {
        for (int a = zzsy.m25283a(this.f16552e, j, true, false); a >= 0; a--) {
            if ((this.f16553f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo26398b(long j) {
        for (int b = zzsy.m25293b(this.f16552e, j, true, false); b < this.f16552e.length; b++) {
            if ((this.f16553f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
