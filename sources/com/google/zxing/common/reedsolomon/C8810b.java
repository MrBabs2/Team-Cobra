package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.b */
/* compiled from: GenericGFPoly */
final class C8810b {

    /* renamed from: a */
    private final C8809a f25029a;

    /* renamed from: b */
    private final int[] f25030b;

    C8810b(C8809a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f25029a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f25030b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f25030b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f25030b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo32551a() {
        return this.f25030b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32552b() {
        return this.f25030b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo32555c() {
        return this.f25030b[0] == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo32552b() * 8);
        for (int b = mo32552b(); b >= 0; b--) {
            int a = mo32548a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int c = this.f25029a.mo32546c(a);
                    if (c == 0) {
                        sb.append('1');
                    } else if (c == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(c);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32548a(int i) {
        int[] iArr = this.f25030b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8810b[] mo32553b(C8810b bVar) {
        if (!this.f25029a.equals(bVar.f25029a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo32555c()) {
            C8810b b = this.f25029a.mo32545b();
            int b2 = this.f25029a.mo32543b(bVar.mo32548a(bVar.mo32552b()));
            C8810b bVar2 = this;
            while (bVar2.mo32552b() >= bVar.mo32552b() && !bVar2.mo32555c()) {
                int b3 = bVar2.mo32552b() - bVar.mo32552b();
                int b4 = this.f25029a.mo32544b(bVar2.mo32548a(bVar2.mo32552b()), b2);
                C8810b a = bVar.mo32549a(b3, b4);
                b = b.mo32550a(this.f25029a.mo32542a(b3, b4));
                bVar2 = bVar2.mo32550a(a);
            }
            return new C8810b[]{b, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8810b mo32554c(C8810b bVar) {
        if (!this.f25029a.equals(bVar.f25029a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32555c() || bVar.mo32555c()) {
            return this.f25029a.mo32545b();
        } else {
            int[] iArr = this.f25030b;
            int length = iArr.length;
            int[] iArr2 = bVar.f25030b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C8809a.m28741c(iArr3[i4], this.f25029a.mo32544b(i2, iArr2[i3]));
                }
            }
            return new C8810b(this.f25029a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8810b mo32550a(C8810b bVar) {
        if (!this.f25029a.equals(bVar.f25029a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32555c()) {
            return bVar;
        } else {
            if (bVar.mo32555c()) {
                return this;
            }
            int[] iArr = this.f25030b;
            int[] iArr2 = bVar.f25030b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C8809a.m28741c(iArr2[i - length], iArr[i]);
            }
            return new C8810b(this.f25029a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8810b mo32549a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f25029a.mo32545b();
        } else {
            int length = this.f25030b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f25029a.mo32544b(this.f25030b[i3], i2);
            }
            return new C8810b(this.f25029a, iArr);
        }
    }
}
