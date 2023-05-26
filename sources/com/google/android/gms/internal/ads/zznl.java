package com.google.android.gms.internal.ads;

public final class zznl implements zznu {

    /* renamed from: a */
    private final int f22343a;

    /* renamed from: b */
    private final long[] f22344b;

    /* renamed from: c */
    private final long[] f22345c;

    /* renamed from: d */
    private final long f22346d;

    public zznl(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22344b = jArr;
        this.f22345c = jArr3;
        int length = iArr.length;
        this.f22343a = length;
        if (length > 0) {
            this.f22346d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f22346d = 0;
        }
    }

    /* renamed from: a */
    public final long mo29569a(long j) {
        return this.f22344b[zzsy.m25283a(this.f22345c, j, true, true)];
    }

    /* renamed from: b */
    public final boolean mo29570b() {
        return true;
    }

    /* renamed from: c */
    public final long mo29571c() {
        return this.f22346d;
    }
}
