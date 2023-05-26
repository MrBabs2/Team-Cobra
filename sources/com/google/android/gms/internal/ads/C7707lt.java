package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.lt */
final class C7707lt extends C7744mt {
    C7707lt(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo26218a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int[] mo26219a(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            C7744mt.m17587a(iArr2, this.f16258a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}
