package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzded extends zzdob<zzded, zza> implements zzdpm {
    private static volatile zzdpv<zzded> zzdv;
    /* access modifiers changed from: private */
    public static final zzded zzgrd;
    private int zzgqu;
    private zzdef zzgrb;

    public static final class zza extends zzdob.zza<zzded, zza> implements zzdpm {
        private zza() {
            super(zzded.zzgrd);
        }

        /* synthetic */ zza(C7370cs csVar) {
            this();
        }
    }

    static {
        zzded zzded = new zzded();
        zzgrd = zzded;
        zzdob.m24005a(zzded.class, zzded);
    }

    private zzded() {
    }

    /* renamed from: a */
    public static zzded m23366a(zzdmr zzdmr) throws zzdok {
        return (zzded) zzdob.m23996a(zzgrd, zzdmr);
    }

    /* renamed from: l */
    public static zzded m23367l() {
        return zzgrd;
    }

    /* renamed from: j */
    public final int mo28943j() {
        return this.zzgqu;
    }

    /* renamed from: k */
    public final zzdef mo28944k() {
        zzdef zzdef = this.zzgrb;
        return zzdef == null ? zzdef.m23372k() : zzdef;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7370cs.f14769a[i - 1]) {
            case 1:
                return new zzded();
            case 2:
                return new zza((C7370cs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgrb", "zzgqu"});
            case 4:
                return zzgrd;
            case 5:
                zzdpv<zzded> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzded.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrd);
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
