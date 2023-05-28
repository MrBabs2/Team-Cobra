package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdfb;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.jr */
final class C7631jr extends zzdbt<zzdbj, zzdfb, zzdgh> {
    public C7631jr() {
        super(zzdbj.class, zzdfb.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
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
        return zzdfb.m23427a(zzdmr);
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
        zzdfb.zza l = zzdfb.m23432l();
        l.mo28962a(0);
        l.mo28963a(zzdmr.m23767b(zzdlo.m23738a(32)));
        return (zzdfb) ((zzdob) l.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdfb zzdfb = (zzdfb) zzdpk;
        zzdlx.m23742a(zzdfb.mo28960j(), 0);
        if (zzdfb.mo28961k().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        return new zzdjv(((zzdfb) zzdpk).mo28961k().mo29071a());
    }
}
