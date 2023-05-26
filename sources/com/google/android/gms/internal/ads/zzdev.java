package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdev extends zzdob<zzdev, zza> implements zzdpm {
    private static volatile zzdpv<zzdev> zzdv;
    /* access modifiers changed from: private */
    public static final zzdev zzgrp;
    private int zzgqu;

    public static final class zza extends zzdob.zza<zzdev, zza> implements zzdpm {
        private zza() {
            super(zzdev.zzgrp);
        }

        /* synthetic */ zza(C7591is isVar) {
            this();
        }
    }

    static {
        zzdev zzdev = new zzdev();
        zzgrp = zzdev;
        zzdob.m24005a(zzdev.class, zzdev);
    }

    private zzdev() {
    }

    /* renamed from: a */
    public static zzdev m23413a(zzdmr zzdmr) throws zzdok {
        return (zzdev) zzdob.m23996a(zzgrp, zzdmr);
    }

    /* renamed from: j */
    public final int mo28959j() {
        return this.zzgqu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7591is.f15682a[i - 1]) {
            case 1:
                return new zzdev();
            case 2:
                return new zza((C7591is) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrp, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzgqu"});
            case 4:
                return zzgrp;
            case 5:
                zzdpv<zzdev> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdev.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrp);
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
