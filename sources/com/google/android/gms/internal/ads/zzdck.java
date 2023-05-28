package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public class zzdck implements zzdcc<zzdbj> {

    /* renamed from: com.google.android.gms.internal.ads.zzdck$a */
    static class C8233a implements zzdbj {

        /* renamed from: a */
        private final zzdca<zzdbj> f21342a;

        private C8233a(zzdca<zzdbj> zzdca) {
            this.f21342a = zzdca;
        }

        /* renamed from: a */
        public final byte[] mo26324a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdjs.m23702a(this.f21342a.mo28917b().mo28920c(), this.f21342a.mo28917b().mo28918a().mo26324a(bArr, bArr2));
        }
    }

    static {
        Logger.getLogger(zzdck.class.getName());
    }

    /* renamed from: a */
    public final Class<zzdbj> mo28921a() {
        return zzdbj.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28922a(zzdca zzdca) throws GeneralSecurityException {
        return new C8233a(zzdca);
    }
}
