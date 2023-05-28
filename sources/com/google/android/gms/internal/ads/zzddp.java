package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public final class zzddp implements zzdcc<zzdby> {

    /* renamed from: com.google.android.gms.internal.ads.zzddp$a */
    static class C8235a implements zzdby {

        /* renamed from: a */
        private final zzdca<zzdby> f21370a;

        /* renamed from: b */
        private final byte[] f21371b;

        private C8235a(zzdca<zzdby> zzdca) {
            this.f21371b = new byte[]{0};
            this.f21370a = zzdca;
        }

        /* renamed from: a */
        public final byte[] mo28913a(byte[] bArr) throws GeneralSecurityException {
            if (this.f21370a.mo28917b().mo28919b().equals(zzdhm.LEGACY)) {
                return zzdjs.m23702a(this.f21370a.mo28917b().mo28920c(), this.f21370a.mo28917b().mo28918a().mo28913a(zzdjs.m23702a(bArr, this.f21371b)));
            }
            return zzdjs.m23702a(this.f21370a.mo28917b().mo28920c(), this.f21370a.mo28917b().mo28918a().mo28913a(bArr));
        }
    }

    static {
        Logger.getLogger(zzddp.class.getName());
    }

    /* renamed from: a */
    public final Class<zzdby> mo28921a() {
        return zzdby.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28922a(zzdca zzdca) throws GeneralSecurityException {
        return new C8235a(zzdca);
    }
}
