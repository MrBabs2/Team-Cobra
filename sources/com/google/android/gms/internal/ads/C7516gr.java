package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdeb;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gr */
final class C7516gr extends zzdbt<zzdlk, zzdeb, zzded> {
    public C7516gr() {
        super(zzdlk.class, zzdeb.class, zzded.class, "type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    /* renamed from: a */
    private static void m17014a(zzdef zzdef) throws GeneralSecurityException {
        if (zzdef.mo28945j() < 12 || zzdef.mo28945j() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
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
        return zzdeb.m23349a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzded.m23366a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzded zzded = (zzded) zzdpk;
        zzdeb.zza m = zzdeb.m23356m();
        m.mo28941a(zzded.mo28944k());
        m.mo28942a(zzdmr.m23767b(zzdlo.m23738a(zzded.mo28943j())));
        m.mo28940a(0);
        return (zzdeb) ((zzdob) m.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdeb zzdeb = (zzdeb) zzdpk;
        zzdlx.m23742a(zzdeb.mo28937j(), 0);
        zzdlx.m23741a(zzdeb.mo28938k().size());
        m17014a(zzdeb.mo28939l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        zzded zzded = (zzded) zzdpk;
        zzdlx.m23741a(zzded.mo28943j());
        m17014a(zzded.mo28944k());
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdeb zzdeb = (zzdeb) zzdpk;
        return new zzdjj(zzdeb.mo28938k().mo29071a(), zzdeb.mo28939l().mo28945j());
    }
}
