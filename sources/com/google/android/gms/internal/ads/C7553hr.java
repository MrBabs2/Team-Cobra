package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hr */
final class C7553hr extends zzdbt<zzdbj, zzdeh, zzdej> {
    public C7553hr() {
        super(zzdbj.class, zzdeh.class, zzdej.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
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
        return zzdeh.m23376a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdej.m23392a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdej zzdej = (zzdej) zzdpk;
        zzdeh.zza m = zzdeh.m23383m();
        m.mo28951a(zzdmr.m23767b(zzdlo.m23738a(zzdej.mo28952j())));
        m.mo28950a(zzdej.mo28953k());
        m.mo28949a(0);
        return (zzdeh) ((zzdob) m.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdeh zzdeh = (zzdeh) zzdpk;
        zzdlx.m23742a(zzdeh.mo28946j(), 0);
        zzdlx.m23741a(zzdeh.mo28947k().size());
        if (zzdeh.mo28948l().mo28954j() != 12 && zzdeh.mo28948l().mo28954j() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        zzdej zzdej = (zzdej) zzdpk;
        zzdlx.m23741a(zzdej.mo28952j());
        if (zzdej.mo28953k().mo28954j() != 12 && zzdej.mo28953k().mo28954j() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdeh zzdeh = (zzdeh) zzdpk;
        return new zzdjk(zzdeh.mo28947k().mo29071a(), zzdeh.mo28948l().mo28954j());
    }
}
