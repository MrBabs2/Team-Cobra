package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzdbu {

    /* renamed from: a */
    private zzdha f21326a;

    private zzdbu(zzdha zzdha) {
        this.f21326a = zzdha;
    }

    /* renamed from: a */
    static final zzdbu m23273a(zzdha zzdha) throws GeneralSecurityException {
        if (zzdha != null && zzdha.mo29021l() > 0) {
            return new zzdbu(zzdha);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        return C7369cr.m16742a(this.f21326a).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzdha mo28909a() {
        return this.f21326a;
    }
}
