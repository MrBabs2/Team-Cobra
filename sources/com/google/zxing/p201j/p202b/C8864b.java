package com.google.zxing.p201j.p202b;

/* renamed from: com.google.zxing.j.b.b */
/* compiled from: BarcodeRow */
final class C8864b {

    /* renamed from: a */
    private final byte[] f25149a;

    /* renamed from: b */
    private int f25150b = 0;

    C8864b(int i) {
        this.f25149a = new byte[i];
    }

    /* renamed from: a */
    private void m28950a(int i, boolean z) {
        this.f25149a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32650a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f25150b;
            this.f25150b = i3 + 1;
            m28950a(i3, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo32651a(int i) {
        int length = this.f25149a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f25149a[i2 / i];
        }
        return bArr;
    }
}
