package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdho;
import java.security.GeneralSecurityException;

public final class zzddc {
    @Deprecated

    /* renamed from: a */
    public static final zzdho f21366a;

    /* renamed from: b */
    public static final zzdho f21367b;

    static {
        zzdho.zza k = zzdho.m23668k();
        k.mo29139a(zzdcj.f21340a);
        zzdho.zza zza = k;
        zza.mo29045a(zzdbl.m23245a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        zza.mo29046a("TINK_HYBRID_1_0_0");
        f21366a = (zzdho) ((zzdob) zza.mo29143t());
        zzdho.zza k2 = zzdho.m23668k();
        k2.mo29139a(f21366a);
        zzdho.zza zza2 = k2;
        zza2.mo29046a("TINK_HYBRID_1_1_0");
        zzdho zzdho = (zzdho) ((zzdob) zza2.mo29143t());
        zzdho.zza k3 = zzdho.m23668k();
        k3.mo29139a(zzdcj.f21341b);
        zzdho.zza zza3 = k3;
        zza3.mo29045a(zzdbl.m23245a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        zza3.mo29046a("TINK_HYBRID");
        f21367b = (zzdho) ((zzdob) zza3.mo29143t());
        try {
            m23316a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m23316a() throws GeneralSecurityException {
        zzdcj.m23306a();
        zzdcf.m23304a("TinkHybridEncrypt", (zzdbk<?>) new C7890qr());
        zzdcf.m23304a("TinkHybridDecrypt", (zzdbk<?>) new C7853pr());
        zzdbl.m23246a(f21367b);
    }
}
