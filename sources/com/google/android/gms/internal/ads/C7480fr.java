package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fr */
final class C7480fr extends zzdbt<zzdbj, zzddr, zzddt> {
    public C7480fr() throws GeneralSecurityException {
        super(zzdbj.class, zzddr.class, zzddt.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzdcf.m23301a(new C7516gr());
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
        return zzddr.m23325a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzddt.m23341a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzddt zzddt = (zzddt) zzdpk;
        zzddr.zza m = zzddr.m23332m();
        m.mo28931a((zzdeb) zzdcf.m23295a("type.googleapis.com/google.crypto.tink.AesCtrKey", (zzdpk) zzddt.mo28933j()));
        m.mo28932a((zzdgl) zzdcf.m23295a("type.googleapis.com/google.crypto.tink.HmacKey", (zzdpk) zzddt.mo28934k()));
        m.mo28930a(0);
        return (zzddr) ((zzdob) m.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdlx.m23742a(((zzddr) zzdpk).mo28927j(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        zzdlx.m23741a(((zzddt) zzdpk).mo28933j().mo28943j());
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzddr zzddr = (zzddr) zzdpk;
        return new zzdkw((zzdlk) zzdcf.m23299a("type.googleapis.com/google.crypto.tink.AesCtrKey", (zzdpk) zzddr.mo28928k(), zzdlk.class), (zzdby) zzdcf.m23299a("type.googleapis.com/google.crypto.tink.HmacKey", (zzdpk) zzddr.mo28929l(), zzdby.class), zzddr.mo28929l().mo28988l().mo28995k());
    }
}
