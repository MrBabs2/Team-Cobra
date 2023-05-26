package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdho;
import java.security.GeneralSecurityException;

public final class zzdcj {
    @Deprecated

    /* renamed from: a */
    public static final zzdho f21340a;

    /* renamed from: b */
    public static final zzdho f21341b;

    static {
        zzdho.zza k = zzdho.m23668k();
        k.mo29139a(zzddo.f21368a);
        zzdho.zza zza = k;
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesEaxKey", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesGcmKey", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        zza.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        zza.mo29046a("TINK_AEAD_1_0_0");
        f21340a = (zzdho) ((zzdob) zza.mo29143t());
        zzdho.zza k2 = zzdho.m23668k();
        k2.mo29139a(f21340a);
        zzdho.zza zza2 = k2;
        zza2.mo29046a("TINK_AEAD_1_1_0");
        zzdho zzdho = (zzdho) ((zzdob) zza2.mo29143t());
        zzdho.zza k3 = zzdho.m23668k();
        k3.mo29139a(zzddo.f21369b);
        zzdho.zza zza3 = k3;
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesEaxKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "AesGcmKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        zza3.mo29045a(zzdbl.m23245a("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true));
        zza3.mo29046a("TINK_AEAD");
        f21341b = (zzdho) ((zzdob) zza3.mo29143t());
        try {
            m23306a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m23306a() throws GeneralSecurityException {
        zzddo.m23321a();
        zzdcf.m23304a("TinkAead", (zzdbk<?>) new C7406dr());
        zzdbl.m23246a(f21341b);
    }
}
