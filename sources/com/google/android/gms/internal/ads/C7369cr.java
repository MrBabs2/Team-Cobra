package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdhc;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cr */
final class C7369cr {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static zzdhc m16742a(zzdha zzdha) {
        zzdhc.zza j = zzdhc.m23607j();
        j.mo29027a(zzdha.mo29019j());
        for (zzdha.zzb next : zzdha.mo29020k()) {
            zzdhc.zzb.zza j2 = zzdhc.zzb.m23620j();
            j2.mo29032a(next.mo29024l().mo28996j());
            j2.mo29030a(next.mo29025m());
            j2.mo29031a(next.mo29022j());
            j2.mo29029a(next.mo29026n());
            j.mo29028a((zzdhc.zzb) ((zzdob) j2.mo29143t()));
        }
        return (zzdhc) ((zzdob) j.mo29143t());
    }

    /* renamed from: b */
    public static void m16743b(zzdha zzdha) throws GeneralSecurityException {
        int j = zzdha.mo29019j();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzdha.zzb next : zzdha.mo29020k()) {
            if (next.mo29025m() != zzdgu.DESTROYED) {
                i++;
                if (!next.mo29023k()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo29026n())}));
                } else if (next.mo29022j() == zzdhm.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo29026n())}));
                } else if (next.mo29025m() != zzdgu.UNKNOWN_STATUS) {
                    if (next.mo29025m() == zzdgu.ENABLED && next.mo29026n() == j) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.mo29024l().mo28998l() != zzdgr.zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo29026n())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("empty keyset");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
