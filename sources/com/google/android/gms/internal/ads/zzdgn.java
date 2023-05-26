package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgn extends zzdob<zzdgn, zza> implements zzdpm {
    private static volatile zzdpv<zzdgn> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgn zzgtv;
    private int zzgqu;
    private zzdgp zzgtt;

    public static final class zza extends zzdob.zza<zzdgn, zza> implements zzdpm {
        private zza() {
            super(zzdgn.zzgtv);
        }

        /* synthetic */ zza(C8076vs vsVar) {
            this();
        }
    }

    static {
        zzdgn zzdgn = new zzdgn();
        zzgtv = zzdgn;
        zzdob.m24005a(zzdgn.class, zzdgn);
    }

    private zzdgn() {
    }

    /* renamed from: a */
    public static zzdgn m23524a(zzdmr zzdmr) throws zzdok {
        return (zzdgn) zzdob.m23996a(zzgtv, zzdmr);
    }

    /* renamed from: l */
    public static zzdgn m23525l() {
        return zzgtv;
    }

    /* renamed from: j */
    public final int mo28992j() {
        return this.zzgqu;
    }

    /* renamed from: k */
    public final zzdgp mo28993k() {
        zzdgp zzdgp = this.zzgtt;
        return zzdgp == null ? zzdgp.m23530l() : zzdgp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8076vs.f17037a[i - 1]) {
            case 1:
                return new zzdgn();
            case 2:
                return new zza((C8076vs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgtv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgtt", "zzgqu"});
            case 4:
                return zzgtv;
            case 5:
                zzdpv<zzdgn> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgn.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgtv);
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
