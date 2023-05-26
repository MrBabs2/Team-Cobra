package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu */
final class C7556hu extends C7745mu {

    /* renamed from: j */
    private final int f15542j;

    /* renamed from: k */
    private final int f15543k;

    C7556hu(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdmr.m23766b(i, i + i2, bArr.length);
        this.f15542j = i;
        this.f15543k = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26044a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f16260i, mo26045g(), bArr, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo26045g() {
        return this.f15542j;
    }

    /* renamed from: h */
    public final byte mo26046h(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f16260i[this.f15542j + i];
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
    public final byte mo26047i(int i) {
        return this.f16260i[this.f15542j + i];
    }

    public final int size() {
        return this.f15543k;
    }
}
