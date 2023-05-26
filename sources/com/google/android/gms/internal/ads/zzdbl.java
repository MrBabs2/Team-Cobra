package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgy;
import java.security.GeneralSecurityException;

public final class zzdbl {
    /* renamed from: a */
    public static zzdgy m23245a(String str, String str2, String str3, int i, boolean z) {
        zzdgy.zza p = zzdgy.m23570p();
        p.mo29010a(str2);
        String valueOf = String.valueOf(str3);
        p.mo29012b(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink."));
        p.mo29009a(0);
        p.mo29011a(true);
        p.mo29013c(str);
        return (zzdgy) ((zzdob) p.mo29143t());
    }

    /* renamed from: a */
    public static void m23246a(zzdho zzdho) throws GeneralSecurityException {
        for (zzdgy next : zzdho.mo29044j()) {
            if (next.mo29004j().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (next.mo29005k().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!next.mo29008n().isEmpty()) {
                zzdbk<?> a = zzdcf.m23291a(next.mo29008n());
                zzdcf.m23303a(a.mo25836a());
                zzdcf.m23302a(a.mo25835a(next.mo29004j(), next.mo29005k(), next.mo29006l()), next.mo29007m());
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }
}
