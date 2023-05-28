package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPublicKey;

public final class zzdke {

    /* renamed from: a */
    private ECPublicKey f21449a;

    public zzdke(ECPublicKey eCPublicKey) {
        this.f21449a = eCPublicKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0190  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdkf mo29054a(java.lang.String r11, byte[] r12, byte[] r13, int r14, com.google.android.gms.internal.ads.zzdkv r15) throws java.security.GeneralSecurityException {
        /*
            r10 = this;
            java.security.interfaces.ECPublicKey r0 = r10.f21449a
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.KeyPair r0 = com.google.android.gms.internal.ads.zzdkr.m23711a((java.security.spec.ECParameterSpec) r0)
            java.security.PublicKey r1 = r0.getPublic()
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            java.security.PrivateKey r0 = r0.getPrivate()
            java.security.interfaces.ECPrivateKey r0 = (java.security.interfaces.ECPrivateKey) r0
            java.security.interfaces.ECPublicKey r2 = r10.f21449a
            java.security.spec.ECParameterSpec r3 = r2.getParams()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.security.spec.ECParameterSpec r4 = r0.getParams()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.security.spec.EllipticCurve r5 = r3.getCurve()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.security.spec.EllipticCurve r6 = r4.getCurve()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            if (r5 == 0) goto L_0x0198
            java.security.spec.ECPoint r5 = r3.getGenerator()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.security.spec.ECPoint r6 = r4.getGenerator()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            if (r5 == 0) goto L_0x0198
            java.math.BigInteger r5 = r3.getOrder()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.math.BigInteger r6 = r4.getOrder()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            if (r5 == 0) goto L_0x0198
            int r3 = r3.getCofactor()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            int r4 = r4.getCofactor()     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            if (r3 != r4) goto L_0x0198
            java.security.spec.ECPoint r2 = r2.getW()
            byte[] r0 = com.google.android.gms.internal.ads.zzdkr.m23718a((java.security.interfaces.ECPrivateKey) r0, (java.security.spec.ECPoint) r2)
            java.security.spec.ECParameterSpec r2 = r1.getParams()
            java.security.spec.EllipticCurve r2 = r2.getCurve()
            java.security.spec.ECPoint r1 = r1.getW()
            com.google.android.gms.internal.ads.zzdkr.m23717a((java.security.spec.ECPoint) r1, (java.security.spec.EllipticCurve) r2)
            int r2 = com.google.android.gms.internal.ads.zzdkr.m23719b(r2)
            int[] r3 = com.google.android.gms.internal.ads.C7818ot.f16513a
            int r4 = r15.ordinal()
            r3 = r3[r4]
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == r5) goto L_0x00fd
            if (r3 == r4) goto L_0x00c8
            r7 = 3
            if (r3 != r7) goto L_0x00a3
            int r2 = r2 + r5
            byte[] r15 = new byte[r2]
            java.math.BigInteger r3 = r1.getAffineX()
            byte[] r3 = r3.toByteArray()
            int r8 = r3.length
            int r2 = r2 - r8
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r6, r15, r2, r8)
            java.math.BigInteger r1 = r1.getAffineY()
            boolean r1 = r1.testBit(r6)
            if (r1 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r7 = 2
        L_0x009e:
            byte r1 = (byte) r7
            r15[r6] = r1
            goto L_0x0123
        L_0x00a3:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = java.lang.String.valueOf(r15)
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r13 = r13.length()
            int r13 = r13 + 15
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.lang.String r13 = "invalid format:"
            r14.append(r13)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c8:
            int r15 = r2 * 2
            byte[] r3 = new byte[r15]
            java.math.BigInteger r7 = r1.getAffineX()
            byte[] r7 = r7.toByteArray()
            int r8 = r7.length
            if (r8 <= r2) goto L_0x00de
            int r8 = r7.length
            int r8 = r8 - r2
            int r9 = r7.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r8, r9)
        L_0x00de:
            java.math.BigInteger r1 = r1.getAffineY()
            byte[] r1 = r1.toByteArray()
            int r8 = r1.length
            if (r8 <= r2) goto L_0x00f0
            int r8 = r1.length
            int r8 = r8 - r2
            int r9 = r1.length
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r8, r9)
        L_0x00f0:
            int r8 = r1.length
            int r15 = r15 - r8
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r6, r3, r15, r8)
            int r15 = r7.length
            int r2 = r2 - r15
            int r15 = r7.length
            java.lang.System.arraycopy(r7, r6, r3, r2, r15)
            goto L_0x0122
        L_0x00fd:
            int r15 = r2 * 2
            int r15 = r15 + r5
            byte[] r3 = new byte[r15]
            java.math.BigInteger r7 = r1.getAffineX()
            byte[] r7 = r7.toByteArray()
            java.math.BigInteger r1 = r1.getAffineY()
            byte[] r1 = r1.toByteArray()
            int r8 = r1.length
            int r15 = r15 - r8
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r6, r3, r15, r8)
            int r2 = r2 + r5
            int r15 = r7.length
            int r2 = r2 - r15
            int r15 = r7.length
            java.lang.System.arraycopy(r7, r6, r3, r2, r15)
            r15 = 4
            r3[r6] = r15
        L_0x0122:
            r15 = r3
        L_0x0123:
            byte[][] r1 = new byte[r4][]
            r1[r6] = r15
            r1[r5] = r0
            byte[] r0 = com.google.android.gms.internal.ads.zzdjs.m23702a(r1)
            com.google.android.gms.internal.ads.zzdkx<com.google.android.gms.internal.ads.zzdld, javax.crypto.Mac> r1 = com.google.android.gms.internal.ads.zzdkx.f21465g
            java.lang.Object r1 = r1.mo29057a(r11)
            javax.crypto.Mac r1 = (javax.crypto.Mac) r1
            int r2 = r1.getMacLength()
            int r2 = r2 * 255
            if (r14 > r2) goto L_0x0190
            if (r12 == 0) goto L_0x014c
            int r2 = r12.length
            if (r2 != 0) goto L_0x0143
            goto L_0x014c
        L_0x0143:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r12, r11)
            r1.init(r2)
            goto L_0x015a
        L_0x014c:
            javax.crypto.spec.SecretKeySpec r12 = new javax.crypto.spec.SecretKeySpec
            int r2 = r1.getMacLength()
            byte[] r2 = new byte[r2]
            r12.<init>(r2, r11)
            r1.init(r12)
        L_0x015a:
            byte[] r12 = r1.doFinal(r0)
            byte[] r0 = new byte[r14]
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r12, r11)
            r1.init(r2)
            byte[] r11 = new byte[r6]
            r12 = 0
        L_0x016b:
            r1.update(r11)
            r1.update(r13)
            byte r11 = (byte) r5
            r1.update(r11)
            byte[] r11 = r1.doFinal()
            int r2 = r11.length
            int r2 = r2 + r12
            if (r2 >= r14) goto L_0x0186
            int r2 = r11.length
            java.lang.System.arraycopy(r11, r6, r0, r12, r2)
            int r2 = r11.length
            int r12 = r12 + r2
            int r5 = r5 + 1
            goto L_0x016b
        L_0x0186:
            int r14 = r14 - r12
            java.lang.System.arraycopy(r11, r6, r0, r12, r14)
            com.google.android.gms.internal.ads.zzdkf r11 = new com.google.android.gms.internal.ads.zzdkf
            r11.<init>(r15, r0)
            return r11
        L_0x0190:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "size too large"
            r11.<init>(r12)
            throw r11
        L_0x0198:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            java.lang.String r12 = "invalid public key spec"
            r11.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x01a2, NullPointerException -> 0x01a0 }
        L_0x01a0:
            r11 = move-exception
            goto L_0x01a3
        L_0x01a2:
            r11 = move-exception
        L_0x01a3:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            goto L_0x01ae
        L_0x01ad:
            throw r12
        L_0x01ae:
            goto L_0x01ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdke.mo29054a(java.lang.String, byte[], byte[], int, com.google.android.gms.internal.ads.zzdkv):com.google.android.gms.internal.ads.zzdkf");
    }
}
