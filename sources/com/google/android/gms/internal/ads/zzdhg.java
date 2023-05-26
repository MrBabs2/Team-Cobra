package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdhg extends zzdob<zzdhg, zza> implements zzdpm {
    private static volatile zzdpv<zzdhg> zzdv;
    /* access modifiers changed from: private */
    public static final zzdhg zzgvk;
    private String zzgvj = "";

    public static final class zza extends zzdob.zza<zzdhg, zza> implements zzdpm {
        private zza() {
            super(zzdhg.zzgvk);
        }

        /* synthetic */ zza(C7482ft ftVar) {
            this();
        }
    }

    static {
        zzdhg zzdhg = new zzdhg();
        zzgvk = zzdhg;
        zzdob.m24005a(zzdhg.class, zzdhg);
    }

    private zzdhg() {
    }

    /* renamed from: a */
    public static zzdhg m23639a(zzdmr zzdmr) throws zzdok {
        return (zzdhg) zzdob.m23996a(zzgvk, zzdmr);
    }

    /* renamed from: k */
    public static zzdhg m23640k() {
        return zzgvk;
    }

    /* renamed from: j */
    public final String mo29037j() {
        return this.zzgvj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7482ft.f15242a[i - 1]) {
            case 1:
                return new zzdhg();
            case 2:
                return new zza((C7482ft) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzgvj"});
            case 4:
                return zzgvk;
            case 5:
                zzdpv<zzdhg> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdhg.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvk);
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
