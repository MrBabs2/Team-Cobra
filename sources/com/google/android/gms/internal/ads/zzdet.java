package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdet extends zzdob<zzdet, zza> implements zzdpm {
    private static volatile zzdpv<zzdet> zzdv;
    /* access modifiers changed from: private */
    public static final zzdet zzgro;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;

    public static final class zza extends zzdob.zza<zzdet, zza> implements zzdpm {
        private zza() {
            super(zzdet.zzgro);
        }

        /* renamed from: a */
        public final zza mo28957a(int i) {
            mo29140j();
            ((zzdet) this.f21572g).m23404b(0);
            return this;
        }

        /* synthetic */ zza(C7554hs hsVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28958a(zzdmr zzdmr) {
            mo29140j();
            ((zzdet) this.f21572g).m23405b(zzdmr);
            return this;
        }
    }

    static {
        zzdet zzdet = new zzdet();
        zzgro = zzdet;
        zzdob.m24005a(zzdet.class, zzdet);
    }

    private zzdet() {
    }

    /* renamed from: a */
    public static zzdet m23401a(zzdmr zzdmr) throws zzdok {
        return (zzdet) zzdob.m23996a(zzgro, zzdmr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23404b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: l */
    public static zza m23406l() {
        return (zza) ((zzdob.zza) zzgro.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo28955j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28956k() {
        return this.zzgqs;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23405b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7554hs.f15540a[i - 1]) {
            case 1:
                return new zzdet();
            case 2:
                return new zza((C7554hs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgro, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgro;
            case 5:
                zzdpv<zzdet> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdet.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgro);
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
