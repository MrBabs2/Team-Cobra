package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdej extends zzdob<zzdej, zza> implements zzdpm {
    private static volatile zzdpv<zzdej> zzdv;
    /* access modifiers changed from: private */
    public static final zzdej zzgri;
    private int zzgqu;
    private zzdel zzgrg;

    public static final class zza extends zzdob.zza<zzdej, zza> implements zzdpm {
        private zza() {
            super(zzdej.zzgri);
        }

        /* synthetic */ zza(C7481fs fsVar) {
            this();
        }
    }

    static {
        zzdej zzdej = new zzdej();
        zzgri = zzdej;
        zzdob.m24005a(zzdej.class, zzdej);
    }

    private zzdej() {
    }

    /* renamed from: a */
    public static zzdej m23392a(zzdmr zzdmr) throws zzdok {
        return (zzdej) zzdob.m23996a(zzgri, zzdmr);
    }

    /* renamed from: j */
    public final int mo28952j() {
        return this.zzgqu;
    }

    /* renamed from: k */
    public final zzdel mo28953k() {
        zzdel zzdel = this.zzgrg;
        return zzdel == null ? zzdel.m23397k() : zzdel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7481fs.f15241a[i - 1]) {
            case 1:
                return new zzdej();
            case 2:
                return new zza((C7481fs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgri, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgrg", "zzgqu"});
            case 4:
                return zzgri;
            case 5:
                zzdpv<zzdej> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdej.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgri);
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
