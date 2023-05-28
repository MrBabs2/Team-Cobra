package com.google.zxing.p203k.p205c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.zxing.k.c.b */
/* compiled from: ByteMatrix */
public final class C8878b {

    /* renamed from: a */
    private final byte[][] f25205a;

    /* renamed from: b */
    private final int f25206b;

    /* renamed from: c */
    private final int f25207c;

    public C8878b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f25205a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f25206b = i;
        this.f25207c = i2;
    }

    /* renamed from: a */
    public byte mo32678a(int i, int i2) {
        return this.f25205a[i2][i];
    }

    /* renamed from: b */
    public int mo32683b() {
        return this.f25207c;
    }

    /* renamed from: c */
    public int mo32684c() {
        return this.f25206b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f25206b * 2 * this.f25207c) + 2);
        for (int i = 0; i < this.f25207c; i++) {
            byte[] bArr = this.f25205a[i];
            for (int i2 = 0; i2 < this.f25206b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public byte[][] mo32682a() {
        return this.f25205a;
    }

    /* renamed from: a */
    public void mo32680a(int i, int i2, int i3) {
        this.f25205a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void mo32681a(int i, int i2, boolean z) {
        this.f25205a[i2][i] = z ? (byte) 1 : 0;
    }

    /* renamed from: a */
    public void mo32679a(byte b) {
        for (byte[] fill : this.f25205a) {
            Arrays.fill(fill, b);
        }
    }
}
