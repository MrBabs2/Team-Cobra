package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzdeb;
import com.google.android.gms.internal.ads.zzdet;
import com.google.android.gms.internal.ads.zzdgl;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ur */
final class C8038ur implements zzdka {

    /* renamed from: a */
    private final String f16973a;

    /* renamed from: b */
    private final int f16974b;

    /* renamed from: c */
    private zzdet f16975c;

    /* renamed from: d */
    private zzddr f16976d;

    /* renamed from: e */
    private int f16977e;

    C8038ur(zzdgw zzdgw) throws GeneralSecurityException {
        String j = zzdgw.mo29002j();
        this.f16973a = j;
        if (j.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdev a = zzdev.m23413a(zzdgw.mo29003k());
                this.f16975c = (zzdet) zzdcf.m23305b(zzdgw);
                this.f16974b = a.mo28959j();
            } catch (zzdok e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f16973a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzddt a2 = zzddt.m23341a(zzdgw.mo29003k());
                this.f16976d = (zzddr) zzdcf.m23305b(zzdgw);
                this.f16977e = a2.mo28933j().mo28943j();
                this.f16974b = this.f16977e + a2.mo28934k().mo28992j();
            } catch (zzdok e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.f16973a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    /* renamed from: a */
    public final int mo26662a() {
        return this.f16974b;
    }

    /* renamed from: a */
    public final zzdbj mo26663a(byte[] bArr) throws GeneralSecurityException {
        Class<zzdbj> cls = zzdbj.class;
        if (bArr.length != this.f16974b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f16973a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            zzdet.zza l = zzdet.m23406l();
            l.mo29139a(this.f16975c);
            zzdet.zza zza = l;
            zza.mo28958a(zzdmr.m23764a(bArr, 0, this.f16974b));
            return (zzdbj) zzdcf.m23299a(this.f16973a, (zzdpk) (zzdet) ((zzdob) zza.mo29143t()), cls);
        } else if (this.f16973a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f16977e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f16977e, this.f16974b);
            zzdeb.zza m = zzdeb.m23356m();
            m.mo29139a(this.f16976d.mo28928k());
            zzdeb.zza zza2 = m;
            zza2.mo28942a(zzdmr.m23767b(copyOfRange));
            zzdgl.zza m2 = zzdgl.m23514m();
            m2.mo29139a(this.f16976d.mo28929l());
            zzdgl.zza zza3 = m2;
            zza3.mo28991a(zzdmr.m23767b(copyOfRange2));
            zzddr.zza m3 = zzddr.m23332m();
            m3.mo28930a(this.f16976d.mo28927j());
            m3.mo28931a((zzdeb) ((zzdob) zza2.mo29143t()));
            m3.mo28932a((zzdgl) ((zzdob) zza3.mo29143t()));
            return (zzdbj) zzdcf.m23299a(this.f16973a, (zzdpk) (zzddr) ((zzdob) m3.mo29143t()), cls);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
