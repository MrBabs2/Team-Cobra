package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdho;
import java.security.GeneralSecurityException;

public final class zzddo {
    @Deprecated

    /* renamed from: a */
    public static final zzdho f21368a;

    /* renamed from: b */
    public static final zzdho f21369b;

    static {
        zzdho.zza k = zzdho.m23668k();
        k.mo29046a("TINK_MAC_1_0_0");
        k.mo29045a(zzdbl.m23245a("TinkMac", "Mac", "HmacKey", 0, true));
        f21368a = (zzdho) ((zzdob) k.mo29143t());
        zzdho.zza k2 = zzdho.m23668k();
        k2.mo29139a(f21368a);
        zzdho.zza zza = k2;
        zza.mo29046a("TINK_MAC_1_1_0");
        zzdho zzdho = (zzdho) ((zzdob) zza.mo29143t());
        zzdho.zza k3 = zzdho.m23668k();
        k3.mo29139a(f21368a);
        zzdho.zza zza2 = k3;
        zza2.mo29046a("TINK_MAC");
        f21369b = (zzdho) ((zzdob) zza2.mo29143t());
        try {
            m23321a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m23321a() throws GeneralSecurityException {
        zzdcf.m23304a("TinkMac", (zzdbk<?>) new C8149xr());
        zzdbl.m23246a(f21369b);
    }
}
