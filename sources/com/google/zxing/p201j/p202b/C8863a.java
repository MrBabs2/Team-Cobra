package com.google.zxing.p201j.p202b;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.j.b.a */
/* compiled from: BarcodeMatrix */
public final class C8863a {

    /* renamed from: a */
    private final C8864b[] f25145a;

    /* renamed from: b */
    private int f25146b;

    /* renamed from: c */
    private final int f25147c;

    /* renamed from: d */
    private final int f25148d;

    C8863a(int i, int i2) {
        C8864b[] bVarArr = new C8864b[i];
        this.f25145a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f25145a[i3] = new C8864b(((i2 + 4) * 17) + 1);
        }
        this.f25148d = i2 * 17;
        this.f25147c = i;
        this.f25146b = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8864b mo32647a() {
        return this.f25145a[this.f25146b];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32649b() {
        this.f25146b++;
    }

    /* renamed from: a */
    public byte[][] mo32648a(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f25148d * i;
        iArr[0] = this.f25147c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f25147c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f25145a[i4 / i2].mo32651a(i);
        }
        return bArr;
    }
}
