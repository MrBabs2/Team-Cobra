package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdhi;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.lr */
final class C7705lr extends zzdbt<zzdbj, zzdhi, zzdhk> {
    public C7705lr() {
        super(zzdbj.class, zzdhi.class, zzdhk.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    /* renamed from: E */
    public final int mo25925E() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzdgr.zzb mo25926c() {
        return zzdgr.zzb.REMOTE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ zzdpk mo25928d(zzdmr zzdmr) throws zzdok {
        return zzdhi.m23644a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdhk.m23656a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdhi.zza l = zzdhi.m23649l();
        l.mo29041a((zzdhk) zzdpk);
        l.mo29040a(0);
        return (zzdhi) ((zzdob) l.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdlx.m23742a(((zzdhi) zzdpk).mo29038j(), 0);
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdhi zzdhi = (zzdhi) zzdpk;
        String j = zzdhi.mo29039k().mo29042j();
        return new zzdcs(zzdhi.mo29039k().mo29043k(), zzdbx.m23277a(j).mo28912b(j));
    }
}
