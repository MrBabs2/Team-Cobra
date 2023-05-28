package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdet;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ir */
final class C7590ir extends zzdbt<zzdbj, zzdet, zzdev> {
    public C7590ir() {
        super(zzdbj.class, zzdet.class, zzdev.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
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
        return zzdet.m23401a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdev.m23413a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdet.zza l = zzdet.m23406l();
        l.mo28958a(zzdmr.m23767b(zzdlo.m23738a(((zzdev) zzdpk).mo28959j())));
        l.mo28957a(0);
        return (zzdet) ((zzdob) l.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdet zzdet = (zzdet) zzdpk;
        zzdlx.m23742a(zzdet.mo28955j(), 0);
        zzdlx.m23741a(zzdet.mo28956k().size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        zzdlx.m23741a(((zzdev) zzdpk).mo28959j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        return new zzdjm(((zzdet) zzdpk).mo28956k().mo29071a());
    }
}
