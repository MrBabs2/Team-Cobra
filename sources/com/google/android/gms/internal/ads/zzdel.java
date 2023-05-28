package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdel extends zzdob<zzdel, zza> implements zzdpm {
    private static volatile zzdpv<zzdel> zzdv;
    /* access modifiers changed from: private */
    public static final zzdel zzgrj;
    private int zzgre;

    public static final class zza extends zzdob.zza<zzdel, zza> implements zzdpm {
        private zza() {
            super(zzdel.zzgrj);
        }

        /* synthetic */ zza(C7517gs gsVar) {
            this();
        }
    }

    static {
        zzdel zzdel = new zzdel();
        zzgrj = zzdel;
        zzdob.m24005a(zzdel.class, zzdel);
    }

    private zzdel() {
    }

    /* renamed from: k */
    public static zzdel m23397k() {
        return zzgrj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7517gs.f15320a[i - 1]) {
            case 1:
                return new zzdel();
            case 2:
                return new zza((C7517gs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrj, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgre"});
            case 4:
                return zzgrj;
            case 5:
                zzdpv<zzdel> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdel.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrj);
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
    public final int mo28954j() {
        return this.zzgre;
    }
}
