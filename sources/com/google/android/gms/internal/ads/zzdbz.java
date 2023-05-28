package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
public final class zzdbz {
    @Deprecated
    /* renamed from: a */
    public static final zzdbu m23279a(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdha a = zzdha.m23590a(bArr);
            m23280a(a);
            return zzdbu.m23273a(a);
        } catch (zzdok unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m23280a(com.google.android.gms.internal.ads.zzdha r3) throws java.security.GeneralSecurityException {
        /*
            java.util.List r3 = r3.mo29020k()
            java.util.Iterator r3 = r3.iterator()
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.ads.zzdha$zzb r0 = (com.google.android.gms.internal.ads.zzdha.zzb) r0
            com.google.android.gms.internal.ads.zzdgr r1 = r0.mo29024l()
            com.google.android.gms.internal.ads.zzdgr$zzb r1 = r1.mo28998l()
            com.google.android.gms.internal.ads.zzdgr$zzb r2 = com.google.android.gms.internal.ads.zzdgr.zzb.UNKNOWN_KEYMATERIAL
            if (r1 == r2) goto L_0x0039
            com.google.android.gms.internal.ads.zzdgr r1 = r0.mo29024l()
            com.google.android.gms.internal.ads.zzdgr$zzb r1 = r1.mo28998l()
            com.google.android.gms.internal.ads.zzdgr$zzb r2 = com.google.android.gms.internal.ads.zzdgr.zzb.SYMMETRIC
            if (r1 == r2) goto L_0x0039
            com.google.android.gms.internal.ads.zzdgr r0 = r0.mo29024l()
            com.google.android.gms.internal.ads.zzdgr$zzb r0 = r0.mo28998l()
            com.google.android.gms.internal.ads.zzdgr$zzb r1 = com.google.android.gms.internal.ads.zzdgr.zzb.ASYMMETRIC_PRIVATE
            if (r0 == r1) goto L_0x0039
            goto L_0x0008
        L_0x0039:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains secret key material"
            r3.<init>(r0)
            throw r3
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdbz.m23280a(com.google.android.gms.internal.ads.zzdha):void");
    }
}
