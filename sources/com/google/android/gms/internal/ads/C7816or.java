package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.or */
final class C7816or extends zzdbt<zzdbq, zzdfx, zzdgh> {
    public C7816or() {
        super(zzdbq.class, zzdfx.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    }

    /* renamed from: E */
    public final int mo25925E() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzdgr.zzb mo25926c() {
        return zzdgr.zzb.ASYMMETRIC_PUBLIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ zzdpk mo25928d(zzdmr zzdmr) throws zzdok {
        return zzdfx.m23479c(zzdmr);
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

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfx zzdfx = (zzdfx) zzdpk;
        zzdlx.m23742a(zzdfx.mo28975j(), 0);
        C7964sr.m18178a(zzdfx.mo28978m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfx zzdfx = (zzdfx) zzdpk;
        zzdft m = zzdfx.mo28978m();
        zzdfz j = m.mo28966j();
        return new zzdkc(zzdkr.m23713a(C7964sr.m18175a(j.mo28984k()), zzdfx.mo28976k().mo29071a(), zzdfx.mo28977l().mo29071a()), j.mo28985l().mo29071a(), C7964sr.m18177a(j.mo28983j()), C7964sr.m18176a(m.mo28968l()), new C8038ur(m.mo28967k().mo28964j()));
    }
}
