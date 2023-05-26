package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class zzdjh implements zzdby {

    /* renamed from: a */
    private final SecretKey f21431a;

    /* renamed from: b */
    private final int f21432b;

    /* renamed from: c */
    private byte[] f21433c;

    /* renamed from: d */
    private byte[] f21434d;

    /* renamed from: a */
    private static Cipher m23690a() throws GeneralSecurityException {
        return zzdkx.f21464f.mo29057a("AES/ECB/NoPadding");
    }

    /* renamed from: a */
    public final byte[] mo28913a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        Cipher a = m23690a();
        a.init(1, this.f21431a);
        double length = (double) bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            bArr2 = zzdjs.m23700a(bArr, (max - 1) << 4, this.f21433c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                bArr2 = zzdjs.m23701a(copyOf, this.f21434d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = a.doFinal(zzdjs.m23700a(bArr3, 0, bArr, i << 4, 16));
        }
        byte[] a2 = zzdjs.m23701a(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f21432b];
        System.arraycopy(a.doFinal(a2), 0, bArr4, 0, this.f21432b);
        return bArr4;
    }
}
