package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfr extends zzdob<zzdfr, zza> implements zzdpm {
    private static volatile zzdpv<zzdfr> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfr zzgss;
    private zzdft zzgsr;

    public static final class zza extends zzdob.zza<zzdfr, zza> implements zzdpm {
        private zza() {
            super(zzdfr.zzgss);
        }

        /* synthetic */ zza(C7743ms msVar) {
            this();
        }
    }

    static {
        zzdfr zzdfr = new zzdfr();
        zzgss = zzdfr;
        zzdob.m24005a(zzdfr.class, zzdfr);
    }

    private zzdfr() {
    }

    /* renamed from: a */
    public static zzdfr m23445a(zzdmr zzdmr) throws zzdok {
        return (zzdfr) zzdob.m23996a(zzgss, zzdmr);
    }

    /* renamed from: j */
    public final zzdft mo28965j() {
        zzdft zzdft = this.zzgsr;
        return zzdft == null ? zzdft.m23449m() : zzdft;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7743ms.f16256a[i - 1]) {
            case 1:
                return new zzdfr();
            case 2:
                return new zza((C7743ms) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgss, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzgsr"});
            case 4:
                return zzgss;
            case 5:
                zzdpv<zzdfr> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfr.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgss);
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
