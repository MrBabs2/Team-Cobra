package com.google.zxing.p197g;

import java.util.Arrays;

/* renamed from: com.google.zxing.g.a */
/* compiled from: BitArray */
public final class C8824a implements Cloneable {

    /* renamed from: f */
    private int[] f25052f;

    /* renamed from: g */
    private int f25053g;

    public C8824a() {
        this.f25053g = 0;
        this.f25052f = new int[1];
    }

    /* renamed from: a */
    public boolean mo32588a(int i) {
        return ((1 << (i & 31)) & this.f25052f[i / 32]) != 0;
    }

    /* renamed from: b */
    public int mo32589b() {
        return this.f25053g;
    }

    /* renamed from: c */
    public int mo32591c() {
        return (this.f25053g + 7) / 8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8824a)) {
            return false;
        }
        C8824a aVar = (C8824a) obj;
        if (this.f25053g != aVar.f25053g || !Arrays.equals(this.f25052f, aVar.f25052f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f25053g * 31) + Arrays.hashCode(this.f25052f);
    }

    public String toString() {
        int i = this.f25053g;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f25053g; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo32588a(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m28801b(int i) {
        if (i > (this.f25052f.length << 5)) {
            int[] c = m28802c(i);
            int[] iArr = this.f25052f;
            System.arraycopy(iArr, 0, c, 0, iArr.length);
            this.f25052f = c;
        }
    }

    /* renamed from: c */
    private static int[] m28802c(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo32587a(boolean z) {
        m28801b(this.f25053g + 1);
        if (z) {
            int[] iArr = this.f25052f;
            int i = this.f25053g;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f25053g++;
    }

    public C8824a clone() {
        return new C8824a((int[]) this.f25052f.clone(), this.f25053g);
    }

    C8824a(int[] iArr, int i) {
        this.f25052f = iArr;
        this.f25053g = i;
    }

    /* renamed from: a */
    public void mo32584a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m28801b(this.f25053g + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo32587a(z);
            i2--;
        }
    }

    /* renamed from: b */
    public void mo32590b(C8824a aVar) {
        if (this.f25053g == aVar.f25053g) {
            int i = 0;
            while (true) {
                int[] iArr = this.f25052f;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f25052f[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: a */
    public void mo32586a(C8824a aVar) {
        int i = aVar.f25053g;
        m28801b(this.f25053g + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo32587a(aVar.mo32588a(i2));
        }
    }

    /* renamed from: a */
    public void mo32585a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo32588a(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }
}
