package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdhi extends zzdob<zzdhi, zza> implements zzdpm {
    private static volatile zzdpv<zzdhi> zzdv;
    /* access modifiers changed from: private */
    public static final zzdhi zzgvm;
    private int zzgqk;
    private zzdhk zzgvl;

    public static final class zza extends zzdob.zza<zzdhi, zza> implements zzdpm {
        private zza() {
            super(zzdhi.zzgvm);
        }

        /* renamed from: a */
        public final zza mo29040a(int i) {
            mo29140j();
            ((zzdhi) this.f21572g).m23648b(0);
            return this;
        }

        /* synthetic */ zza(C7518gt gtVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29041a(zzdhk zzdhk) {
            mo29140j();
            ((zzdhi) this.f21572g).m23647a(zzdhk);
            return this;
        }
    }

    static {
        zzdhi zzdhi = new zzdhi();
        zzgvm = zzdhi;
        zzdob.m24005a(zzdhi.class, zzdhi);
    }

    private zzdhi() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23647a(zzdhk zzdhk) {
        if (zzdhk != null) {
            this.zzgvl = zzdhk;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23648b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: l */
    public static zza m23649l() {
        return (zza) ((zzdob.zza) zzgvm.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo29038j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdhk mo29039k() {
        zzdhk zzdhk = this.zzgvl;
        return zzdhk == null ? zzdhk.m23657l() : zzdhk;
    }

    /* renamed from: a */
    public static zzdhi m23644a(zzdmr zzdmr) throws zzdok {
        return (zzdhi) zzdob.m23996a(zzgvm, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7518gt.f15321a[i - 1]) {
            case 1:
                return new zzdhi();
            case 2:
                return new zza((C7518gt) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvl"});
            case 4:
                return zzgvm;
            case 5:
                zzdpv<zzdhi> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdhi.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvm);
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
