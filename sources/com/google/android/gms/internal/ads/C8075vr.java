package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgl;
import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.vr */
final class C8075vr extends zzdbt<zzdby, zzdgl, zzdgn> {
    public C8075vr() {
        super(zzdby.class, zzdgl.class, zzdgn.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    /* renamed from: a */
    private static void m18319a(zzdgp zzdgp) throws GeneralSecurityException {
        if (zzdgp.mo28995k() >= 10) {
            int i = C8112wr.f17102a[zzdgp.mo28994j().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zzdgp.mo28995k() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzdgp.mo28995k() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzdgp.mo28995k() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
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
        return zzdgl.m23507a(zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ zzdpk mo25930e(zzdmr zzdmr) throws zzdok {
        return zzdgn.m23524a(zzdmr);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo25932f(zzdpk zzdpk) throws GeneralSecurityException {
        zzdgn zzdgn = (zzdgn) zzdpk;
        zzdgl.zza m = zzdgl.m23514m();
        m.mo28989a(0);
        m.mo28990a(zzdgn.mo28993k());
        m.mo28991a(zzdmr.m23767b(zzdlo.m23738a(zzdgn.mo28992j())));
        return (zzdgl) ((zzdob) m.mo29143t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo25927c(zzdpk zzdpk) throws GeneralSecurityException {
        zzdgl zzdgl = (zzdgl) zzdpk;
        zzdlx.m23742a(zzdgl.mo28986j(), 0);
        if (zzdgl.mo28987k().size() >= 16) {
            m18319a(zzdgl.mo28988l());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo25929d(zzdpk zzdpk) throws GeneralSecurityException {
        zzdgn zzdgn = (zzdgn) zzdpk;
        if (zzdgn.mo28992j() >= 16) {
            m18319a(zzdgn.mo28993k());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo25931e(zzdpk zzdpk) throws GeneralSecurityException {
        zzdgl zzdgl = (zzdgl) zzdpk;
        zzdgj j = zzdgl.mo28988l().mo28994j();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdgl.mo28987k().mo29071a(), "HMAC");
        int k = zzdgl.mo28988l().mo28995k();
        int i = C8112wr.f17102a[j.ordinal()];
        if (i == 1) {
            return new zzdll("HMACSHA1", secretKeySpec, k);
        }
        if (i == 2) {
            return new zzdll("HMACSHA256", secretKeySpec, k);
        }
        if (i == 3) {
            return new zzdll("HMACSHA512", secretKeySpec, k);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
