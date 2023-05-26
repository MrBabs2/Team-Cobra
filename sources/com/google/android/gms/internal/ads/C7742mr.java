package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdig;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mr */
final class C7742mr extends zzdbt<zzdbj, zzdig, zzdgh> {
    public C7742mr() {
        super(zzdbj.class, zzdig.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    /* renamed from: E */
    public final int mo25925E() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzdgr.zzb mo25926c() {
        return zzdgr.zzb.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ zzdpk mo25928d(zzdmr zzdmr) throws zzdok {
        return zzdig.m23674a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdgh.m23502a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdig.zza l = zzdig.m23679l();
        l.mo29049a(0);
        l.mo29050a(zzdmr.m23767b(zzdlo.m23738a(32)));
        return (zzdig) ((zzdob) l.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdig zzdig = (zzdig) zzdpk;
        zzdlx.m23742a(zzdig.mo29047j(), 0);
        if (zzdig.mo29048k().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        return new zzdma(((zzdig) zzdpk).mo29048k().mo29071a());
    }
}
