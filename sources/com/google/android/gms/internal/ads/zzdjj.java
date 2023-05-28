package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdjj implements zzdlk {

    /* renamed from: a */
    private final SecretKeySpec f21435a;

    /* renamed from: b */
    private final int f21436b;

    /* renamed from: c */
    private final int f21437c;

    public zzdjj(byte[] bArr, int i) throws GeneralSecurityException {
        zzdlx.m23741a(bArr.length);
        this.f21435a = new SecretKeySpec(bArr, "AES");
        int blockSize = zzdkx.f21464f.mo29057a("AES/CTR/NoPadding").getBlockSize();
        this.f21437c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f21436b = i;
    }

    /* renamed from: a */
    public final byte[] mo26247a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f21436b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a = zzdlo.m23738a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f21436b);
            int length2 = bArr.length;
            int i2 = this.f21436b;
            Cipher a2 = zzdkx.f21464f.mo29057a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f21437c];
            System.arraycopy(a, 0, bArr3, 0, this.f21436b);
            a2.init(1, this.f21435a, new IvParameterSpec(bArr3));
            if (a2.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(Integer.MAX_VALUE - this.f21436b);
        throw new GeneralSecurityException(sb.toString());
    }
}
