package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdef extends zzdob<zzdef, zza> implements zzdpm {
    private static volatile zzdpv<zzdef> zzdv;
    /* access modifiers changed from: private */
    public static final zzdef zzgrf;
    private int zzgre;

    public static final class zza extends zzdob.zza<zzdef, zza> implements zzdpm {
        private zza() {
            super(zzdef.zzgrf);
        }

        /* synthetic */ zza(C7407ds dsVar) {
            this();
        }
    }

    static {
        zzdef zzdef = new zzdef();
        zzgrf = zzdef;
        zzdob.m24005a(zzdef.class, zzdef);
    }

    private zzdef() {
    }

    /* renamed from: k */
    public static zzdef m23372k() {
        return zzgrf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7407ds.f15024a[i - 1]) {
            case 1:
                return new zzdef();
            case 2:
                return new zza((C7407ds) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrf, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgre"});
            case 4:
                return zzgrf;
            case 5:
                zzdpv<zzdef> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdef.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrf);
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
    public final int mo28945j() {
        return this.zzgre;
    }
}
