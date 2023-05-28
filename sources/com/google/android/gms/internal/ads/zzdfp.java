package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfp extends zzdob<zzdfp, zza> implements zzdpm {
    private static volatile zzdpv<zzdfp> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfp zzgsq;
    private zzdgw zzgsp;

    public static final class zza extends zzdob.zza<zzdfp, zza> implements zzdpm {
        private zza() {
            super(zzdfp.zzgsq);
        }

        /* synthetic */ zza(C7706ls lsVar) {
            this();
        }
    }

    static {
        zzdfp zzdfp = new zzdfp();
        zzgsq = zzdfp;
        zzdob.m24005a(zzdfp.class, zzdfp);
    }

    private zzdfp() {
    }

    /* renamed from: k */
    public static zzdfp m23441k() {
        return zzgsq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7706ls.f16179a[i - 1]) {
            case 1:
                return new zzdfp();
            case 2:
                return new zza((C7706ls) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgsq, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzgsp"});
            case 4:
                return zzgsq;
            case 5:
                zzdpv<zzdfp> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfp.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgsq);
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

    /* renamed from: j */
    public final zzdgw mo28964j() {
        zzdgw zzdgw = this.zzgsp;
        return zzdgw == null ? zzdgw.m23555l() : zzdgw;
    }
}
