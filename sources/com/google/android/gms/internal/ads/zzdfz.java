package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfz extends zzdob<zzdfz, zza> implements zzdpm {
    private static volatile zzdpv<zzdfz> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfz zzgtc;
    private int zzgqy;
    private int zzgta;
    private zzdmr zzgtb = zzdmr.f21488g;

    public static final class zza extends zzdob.zza<zzdfz, zza> implements zzdpm {
        private zza() {
            super(zzdfz.zzgtc);
        }

        /* synthetic */ zza(C7891qs qsVar) {
            this();
        }
    }

    static {
        zzdfz zzdfz = new zzdfz();
        zzgtc = zzdfz;
        zzdob.m24005a(zzdfz.class, zzdfz);
    }

    private zzdfz() {
    }

    /* renamed from: m */
    public static zzdfz m23492m() {
        return zzgtc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7891qs.f16675a[i - 1]) {
            case 1:
                return new zzdfz();
            case 2:
                return new zza((C7891qs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgtc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzgta", "zzgqy", "zzgtb"});
            case 4:
                return zzgtc;
            case 5:
                zzdpv<zzdfz> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfz.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgtc);
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
    public final zzdgj mo28983j() {
        zzdgj a = zzdgj.m23505a(this.zzgqy);
        return a == null ? zzdgj.UNRECOGNIZED : a;
    }

    /* renamed from: k */
    public final zzdgf mo28984k() {
        zzdgf a = zzdgf.m23500a(this.zzgta);
        return a == null ? zzdgf.UNRECOGNIZED : a;
    }

    /* renamed from: l */
    public final zzdmr mo28985l() {
        return this.zzgtb;
    }
}
