package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.sr */
final class C7964sr {
    /* renamed from: a */
    public static void m18178a(zzdft zzdft) throws GeneralSecurityException {
        zzdkr.m23714a(m18175a(zzdft.mo28966j().mo28984k()));
        m18177a(zzdft.mo28966j().mo28983j());
        if (zzdft.mo28968l() != zzdfd.UNKNOWN_FORMAT) {
            zzdcf.m23294a(zzdft.mo28967k().mo28964j());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static String m18177a(zzdgj zzdgj) throws NoSuchAlgorithmException {
        int i = C8001tr.f16914a[zzdgj.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzdgj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: a */
    public static zzdkt m18175a(zzdgf zzdgf) throws GeneralSecurityException {
        int i = C8001tr.f16915b[zzdgf.ordinal()];
        if (i == 1) {
            return zzdkt.NIST_P256;
        }
        if (i == 2) {
            return zzdkt.NIST_P384;
        }
        if (i == 3) {
            return zzdkt.NIST_P521;
        }
        String valueOf = String.valueOf(zzdgf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static zzdkv m18176a(zzdfd zzdfd) throws GeneralSecurityException {
        int i = C8001tr.f16916c[zzdfd.ordinal()];
        if (i == 1) {
            return zzdkv.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzdkv.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return zzdkv.COMPRESSED;
        }
        String valueOf = String.valueOf(zzdfd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }
}
