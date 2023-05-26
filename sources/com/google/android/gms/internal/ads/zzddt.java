package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzddt extends zzdob<zzddt, zza> implements zzdpm {
    private static volatile zzdpv<zzddt> zzdv;
    /* access modifiers changed from: private */
    public static final zzddt zzgqq;
    private zzded zzgqo;
    private zzdgn zzgqp;

    public static final class zza extends zzdob.zza<zzddt, zza> implements zzdpm {
        private zza() {
            super(zzddt.zzgqq);
        }

        /* synthetic */ zza(C7296as asVar) {
            this();
        }
    }

    static {
        zzddt zzddt = new zzddt();
        zzgqq = zzddt;
        zzdob.m24005a(zzddt.class, zzddt);
    }

    private zzddt() {
    }

    /* renamed from: a */
    public static zzddt m23341a(zzdmr zzdmr) throws zzdok {
        return (zzddt) zzdob.m23996a(zzgqq, zzdmr);
    }

    /* renamed from: j */
    public final zzded mo28933j() {
        zzded zzded = this.zzgqo;
        return zzded == null ? zzded.m23367l() : zzded;
    }

    /* renamed from: k */
    public final zzdgn mo28934k() {
        zzdgn zzdgn = this.zzgqp;
        return zzdgn == null ? zzdgn.m23525l() : zzdgn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7296as.f14499a[i - 1]) {
            case 1:
                return new zzddt();
            case 2:
                return new zza((C7296as) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgqq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzgqo", "zzgqp"});
            case 4:
                return zzgqq;
            case 5:
                zzdpv<zzddt> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzddt.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgqq);
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
