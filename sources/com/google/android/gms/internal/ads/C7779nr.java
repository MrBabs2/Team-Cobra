package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdfv;
import com.google.android.gms.internal.ads.zzdfx;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.nr */
final class C7779nr extends zzdbt<zzdbp, zzdfv, zzdfr> implements zzdbs<zzdbp> {
    public C7779nr() {
        super(zzdbp.class, zzdfv.class, zzdfr.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    /* renamed from: E */
    public final int mo25925E() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzdgr.zzb mo25926c() {
        return zzdgr.zzb.ASYMMETRIC_PRIVATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ zzdpk mo25928d(zzdmr zzdmr) throws zzdok {
        return zzdfv.m23455a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdfr.m23445a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfr zzdfr = (zzdfr) zzdpk;
        KeyPair a = zzdkr.m23711a(zzdkr.m23714a(C7964sr.m18175a(zzdfr.mo28965j().mo28966j().mo28984k())));
        ECPoint w = ((ECPublicKey) a.getPublic()).getW();
        zzdfx.zza n = zzdfx.m23480n();
        n.mo28979a(0);
        n.mo28980a(zzdfr.mo28965j());
        n.mo28981a(zzdmr.m23767b(w.getAffineX().toByteArray()));
        n.mo28982b(zzdmr.m23767b(w.getAffineY().toByteArray()));
        zzdfv.zza m = zzdfv.m23462m();
        m.mo28972a(0);
        m.mo28973a((zzdfx) ((zzdob) n.mo29143t()));
        m.mo28974a(zzdmr.m23767b(((ECPrivateKey) a.getPrivate()).getS().toByteArray()));
        return (zzdfv) ((zzdob) m.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfv zzdfv = (zzdfv) zzdpk;
        zzdlx.m23742a(zzdfv.mo28969j(), 0);
        C7964sr.m18178a(zzdfv.mo28971l().mo28978m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        C7964sr.m18178a(((zzdfr) zzdpk).mo28965j());
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfv zzdfv = (zzdfv) zzdpk;
        zzdft m = zzdfv.mo28971l().mo28978m();
        zzdfz j = m.mo28966j();
        return new zzdkb(zzdkr.m23712a(C7964sr.m18175a(j.mo28984k()), zzdfv.mo28970k().mo29071a()), j.mo28985l().mo29071a(), C7964sr.m18177a(j.mo28983j()), C7964sr.m18176a(m.mo28968l()), new C8038ur(m.mo28967k().mo28964j()));
    }
}
