package com.google.android.gms.internal.ads;

public final class zzdlj {

    /* renamed from: a */
    private final byte[] f21478a;

    private zzdlj(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f21478a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static zzdlj m23733a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new zzdlj(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo29060a() {
        byte[] bArr = this.f21478a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
