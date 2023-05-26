package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdft extends zzdob<zzdft, zza> implements zzdpm {
    private static volatile zzdpv<zzdft> zzdv;
    /* access modifiers changed from: private */
    public static final zzdft zzgsw;
    private zzdfz zzgst;
    private zzdfp zzgsu;
    private int zzgsv;

    public static final class zza extends zzdob.zza<zzdft, zza> implements zzdpm {
        private zza() {
            super(zzdft.zzgsw);
        }

        /* synthetic */ zza(C7780ns nsVar) {
            this();
        }
    }

    static {
        zzdft zzdft = new zzdft();
        zzgsw = zzdft;
        zzdob.m24005a(zzdft.class, zzdft);
    }

    private zzdft() {
    }

    /* renamed from: m */
    public static zzdft m23449m() {
        return zzgsw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7780ns.f16401a[i - 1]) {
            case 1:
                return new zzdft();
            case 2:
                return new zza((C7780ns) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgsw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzgst", "zzgsu", "zzgsv"});
            case 4:
                return zzgsw;
            case 5:
                zzdpv<zzdft> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdft.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgsw);
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
    public final zzdfz mo28966j() {
        zzdfz zzdfz = this.zzgst;
        return zzdfz == null ? zzdfz.m23492m() : zzdfz;
    }

    /* renamed from: k */
    public final zzdfp mo28967k() {
        zzdfp zzdfp = this.zzgsu;
        return zzdfp == null ? zzdfp.m23441k() : zzdfp;
    }

    /* renamed from: l */
    public final zzdfd mo28968l() {
        zzdfd a = zzdfd.m23439a(this.zzgsv);
        return a == null ? zzdfd.UNRECOGNIZED : a;
    }
}
