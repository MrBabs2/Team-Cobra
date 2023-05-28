package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdeb extends zzdob<zzdeb, zza> implements zzdpm {
    private static volatile zzdpv<zzdeb> zzdv;
    /* access modifiers changed from: private */
    public static final zzdeb zzgrc;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;
    private zzdef zzgrb;

    public static final class zza extends zzdob.zza<zzdeb, zza> implements zzdpm {
        private zza() {
            super(zzdeb.zzgrc);
        }

        /* renamed from: a */
        public final zza mo28940a(int i) {
            mo29140j();
            ((zzdeb) this.f21572g).m23354b(0);
            return this;
        }

        /* synthetic */ zza(C7333bs bsVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28941a(zzdef zzdef) {
            mo29140j();
            ((zzdeb) this.f21572g).m23353a(zzdef);
            return this;
        }

        /* renamed from: a */
        public final zza mo28942a(zzdmr zzdmr) {
            mo29140j();
            ((zzdeb) this.f21572g).m23355b(zzdmr);
            return this;
        }
    }

    static {
        zzdeb zzdeb = new zzdeb();
        zzgrc = zzdeb;
        zzdob.m24005a(zzdeb.class, zzdeb);
    }

    private zzdeb() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23353a(zzdef zzdef) {
        if (zzdef != null) {
            this.zzgrb = zzdef;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23354b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: m */
    public static zza m23356m() {
        return (zza) ((zzdob.zza) zzgrc.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: n */
    public static zzdeb m23357n() {
        return zzgrc;
    }

    /* renamed from: j */
    public final int mo28937j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28938k() {
        return this.zzgqs;
    }

    /* renamed from: l */
    public final zzdef mo28939l() {
        zzdef zzdef = this.zzgrb;
        return zzdef == null ? zzdef.m23372k() : zzdef;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23355b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static zzdeb m23349a(zzdmr zzdmr) throws zzdok {
        return (zzdeb) zzdob.m23996a(zzgrc, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7333bs.f14657a[i - 1]) {
            case 1:
                return new zzdeb();
            case 2:
                return new zza((C7333bs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrb", "zzgqs"});
            case 4:
                return zzgrc;
            case 5:
                zzdpv<zzdeb> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdeb.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrc);
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
