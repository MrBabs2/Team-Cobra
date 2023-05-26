package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdig extends zzdob<zzdig, zza> implements zzdpm {
    private static volatile zzdpv<zzdig> zzdv;
    /* access modifiers changed from: private */
    public static final zzdig zzgwz;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;

    public static final class zza extends zzdob.zza<zzdig, zza> implements zzdpm {
        private zza() {
            super(zzdig.zzgwz);
        }

        /* renamed from: a */
        public final zza mo29049a(int i) {
            mo29140j();
            ((zzdig) this.f21572g).m23677b(0);
            return this;
        }

        /* synthetic */ zza(C7670kt ktVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29050a(zzdmr zzdmr) {
            mo29140j();
            ((zzdig) this.f21572g).m23678b(zzdmr);
            return this;
        }
    }

    static {
        zzdig zzdig = new zzdig();
        zzgwz = zzdig;
        zzdob.m24005a(zzdig.class, zzdig);
    }

    private zzdig() {
    }

    /* renamed from: a */
    public static zzdig m23674a(zzdmr zzdmr) throws zzdok {
        return (zzdig) zzdob.m23996a(zzgwz, zzdmr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23677b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: l */
    public static zza m23679l() {
        return (zza) ((zzdob.zza) zzgwz.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo29047j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo29048k() {
        return this.zzgqs;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23678b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7670kt.f16019a[i - 1]) {
            case 1:
                return new zzdig();
            case 2:
                return new zza((C7670kt) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgwz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgwz;
            case 5:
                zzdpv<zzdig> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdig.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgwz);
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
