package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgp extends zzdob<zzdgp, zza> implements zzdpm {
    private static volatile zzdpv<zzdgp> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgp zzgty;
    private int zzgtw;
    private int zzgtx;

    public static final class zza extends zzdob.zza<zzdgp, zza> implements zzdpm {
        private zza() {
            super(zzdgp.zzgty);
        }

        /* synthetic */ zza(C8113ws wsVar) {
            this();
        }
    }

    static {
        zzdgp zzdgp = new zzdgp();
        zzgty = zzdgp;
        zzdob.m24005a(zzdgp.class, zzdgp);
    }

    private zzdgp() {
    }

    /* renamed from: l */
    public static zzdgp m23530l() {
        return zzgty;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8113ws.f17103a[i - 1]) {
            case 1:
                return new zzdgp();
            case 2:
                return new zza((C8113ws) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgty, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzgtw", "zzgtx"});
            case 4:
                return zzgty;
            case 5:
                zzdpv<zzdgp> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgp.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgty);
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
    public final zzdgj mo28994j() {
        zzdgj a = zzdgj.m23505a(this.zzgtw);
        return a == null ? zzdgj.UNRECOGNIZED : a;
    }

    /* renamed from: k */
    public final int mo28995k() {
        return this.zzgtx;
    }
}
