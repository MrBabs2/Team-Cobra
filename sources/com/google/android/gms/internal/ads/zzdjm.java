package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdjm implements zzdbj {

    /* renamed from: a */
    private final SecretKey f21442a;

    public zzdjm(byte[] bArr) throws GeneralSecurityException {
        zzdlx.m23741a(bArr.length);
        this.f21442a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo26324a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = zzdlo.m23738a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            Cipher a2 = zzdkx.f21464f.mo29057a("AES/GCM/NoPadding");
            a2.init(1, this.f21442a, m23697a(a, 0, a.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                a2.updateAAD(bArr2);
            }
            int doFinal = a2.doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    private static AlgorithmParameterSpec m23697a(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (zzdlv.m23740a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
