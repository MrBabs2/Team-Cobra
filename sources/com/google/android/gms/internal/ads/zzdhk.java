package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdhk extends zzdob<zzdhk, zza> implements zzdpm {
    private static volatile zzdpv<zzdhk> zzdv;
    /* access modifiers changed from: private */
    public static final zzdhk zzgvp;
    private String zzgvn = "";
    private zzdgw zzgvo;

    public static final class zza extends zzdob.zza<zzdhk, zza> implements zzdpm {
        private zza() {
            super(zzdhk.zzgvp);
        }

        /* synthetic */ zza(C7555ht htVar) {
            this();
        }
    }

    static {
        zzdhk zzdhk = new zzdhk();
        zzgvp = zzdhk;
        zzdob.m24005a(zzdhk.class, zzdhk);
    }

    private zzdhk() {
    }

    /* renamed from: a */
    public static zzdhk m23656a(zzdmr zzdmr) throws zzdok {
        return (zzdhk) zzdob.m23996a(zzgvp, zzdmr);
    }

    /* renamed from: l */
    public static zzdhk m23657l() {
        return zzgvp;
    }

    /* renamed from: j */
    public final String mo29042j() {
        return this.zzgvn;
    }

    /* renamed from: k */
    public final zzdgw mo29043k() {
        zzdgw zzdgw = this.zzgvo;
        return zzdgw == null ? zzdgw.m23555l() : zzdgw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7555ht.f15541a[i - 1]) {
            case 1:
                return new zzdhk();
            case 2:
                return new zza((C7555ht) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzgvn", "zzgvo"});
            case 4:
                return zzgvp;
            case 5:
                zzdpv<zzdhk> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdhk.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvp);
                            zzdv = zzdpv;
                        }
                    }
                }
                return zzdpv;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
