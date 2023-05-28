package com.google.android.gms.internal.ads;

final class b00 {

    /* renamed from: a */
    public final int f14526a;

    /* renamed from: b */
    public final long[] f14527b;

    /* renamed from: c */
    public final int[] f14528c;

    /* renamed from: d */
    public final long[] f14529d;

    /* renamed from: e */
    public final int[] f14530e;

    b00(long[] jArr, int[] iArr, long[] jArr2, int[] iArr2) {
        boolean z = true;
        zzkh.m24657a(iArr.length == jArr2.length);
        zzkh.m24657a(jArr.length == jArr2.length);
        zzkh.m24657a(iArr2.length != jArr2.length ? false : z);
        this.f14527b = jArr;
        this.f14528c = iArr;
        this.f14529d = jArr2;
        this.f14530e = iArr2;
        this.f14526a = jArr.length;
    }
}
