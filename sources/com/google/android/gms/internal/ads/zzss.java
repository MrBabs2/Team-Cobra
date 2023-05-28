package com.google.android.gms.internal.ads;

public final class zzss {

    /* renamed from: a */
    private byte[] f22656a;

    /* renamed from: b */
    private int f22657b;

    /* renamed from: c */
    private int f22658c;

    /* renamed from: d */
    private int f22659d;

    public zzss() {
    }

    /* renamed from: a */
    public final int mo29721a(int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f22658c;
            if (i6 != 0) {
                byte[] bArr = this.f22656a;
                int i7 = this.f22657b;
                b2 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b2 = this.f22656a[this.f22657b];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f22657b++;
        }
        if (i > 0) {
            int i8 = this.f22658c + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.f22656a;
                int i9 = this.f22657b;
                b = (b4 & (((bArr2[i9 + 1] & 255) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b3;
                this.f22657b = i9 + 1;
            } else {
                byte[] bArr3 = this.f22656a;
                int i10 = this.f22657b;
                b = (b4 & ((bArr3[i10] & 255) >> (8 - i8))) | b3;
                if (i8 == 8) {
                    this.f22657b = i10 + 1;
                }
            }
            b3 = b;
            this.f22658c = i8 % 8;
        }
        int i11 = this.f22657b;
        if (i11 >= 0 && (i2 = this.f22658c) >= 0 && i2 < 8 && (i11 < (i3 = this.f22659d) || (i11 == i3 && i2 == 0))) {
            z = true;
        }
        zzsk.m25218b(z);
        return b3;
    }

    public zzss(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzss(byte[] bArr, int i) {
        this.f22656a = bArr;
        this.f22659d = i;
    }
}
