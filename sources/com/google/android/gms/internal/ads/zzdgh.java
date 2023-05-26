package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgh extends zzdob<zzdgh, zza> implements zzdpm {
    private static volatile zzdpv<zzdgh> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgh zzgtm;

    public static final class zza extends zzdob.zza<zzdgh, zza> implements zzdpm {
        private zza() {
            super(zzdgh.zzgtm);
        }

        /* synthetic */ zza(C7965ss ssVar) {
            this();
        }
    }

    static {
        zzdgh zzdgh = new zzdgh();
        zzgtm = zzdgh;
        zzdob.m24005a(zzdgh.class, zzdgh);
    }

    private zzdgh() {
    }

    /* renamed from: a */
    public static zzdgh m23502a(zzdmr zzdmr) throws zzdok {
        return (zzdgh) zzdob.m23996a(zzgtm, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7965ss.f16863a[i - 1]) {
            case 1:
                return new zzdgh();
            case 2:
                return new zza((C7965ss) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgtm, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzgtm;
            case 5:
                zzdpv<zzdgh> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgh.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgtm);
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
