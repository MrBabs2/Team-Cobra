package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
final class C8306k0 extends C8321n0 {

    /* renamed from: i */
    private final int f23274i;

    /* renamed from: j */
    private final int f23275j;

    C8306k0(byte[] bArr, int i, int i2) {
        super(bArr);
        zzte.m26522b(i, i + i2, bArr.length);
        this.f23274i = i;
        this.f23275j = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo30137d() {
        return this.f23274i;
    }

    /* renamed from: h */
    public final byte mo30138h(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f23302h[this.f23274i + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final byte mo30139i(int i) {
        return this.f23302h[this.f23274i + i];
    }

    public final int size() {
        return this.f23275j;
    }
}
