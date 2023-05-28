package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfx extends zzdob<zzdfx, zza> implements zzdpm {
    private static volatile zzdpv<zzdfx> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfx zzgsz;
    private int zzgqk;
    private zzdmr zzgsh;
    private zzdmr zzgsi;
    private zzdft zzgsr;

    public static final class zza extends zzdob.zza<zzdfx, zza> implements zzdpm {
        private zza() {
            super(zzdfx.zzgsz);
        }

        /* renamed from: a */
        public final zza mo28979a(int i) {
            mo29140j();
            ((zzdfx) this.f21572g).m23476b(0);
            return this;
        }

        /* renamed from: b */
        public final zza mo28982b(zzdmr zzdmr) {
            mo29140j();
            ((zzdfx) this.f21572g).m23478b(zzdmr);
            return this;
        }

        /* synthetic */ zza(C7854ps psVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28980a(zzdft zzdft) {
            mo29140j();
            ((zzdfx) this.f21572g).m23471a(zzdft);
            return this;
        }

        /* renamed from: a */
        public final zza mo28981a(zzdmr zzdmr) {
            mo29140j();
            ((zzdfx) this.f21572g).m23475a(zzdmr);
            return this;
        }
    }

    static {
        zzdfx zzdfx = new zzdfx();
        zzgsz = zzdfx;
        zzdob.m24005a(zzdfx.class, zzdfx);
    }

    private zzdfx() {
        zzdmr zzdmr = zzdmr.f21488g;
        this.zzgsh = zzdmr;
        this.zzgsi = zzdmr;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23471a(zzdft zzdft) {
        if (zzdft != null) {
            this.zzgsr = zzdft;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23476b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: c */
    public static zzdfx m23479c(zzdmr zzdmr) throws zzdok {
        return (zzdfx) zzdob.m23996a(zzgsz, zzdmr);
    }

    /* renamed from: n */
    public static zza m23480n() {
        return (zza) ((zzdob.zza) zzgsz.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: p */
    public static zzdfx m23481p() {
        return zzgsz;
    }

    /* renamed from: j */
    public final int mo28975j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28976k() {
        return this.zzgsh;
    }

    /* renamed from: l */
    public final zzdmr mo28977l() {
        return this.zzgsi;
    }

    /* renamed from: m */
    public final zzdft mo28978m() {
        zzdft zzdft = this.zzgsr;
        return zzdft == null ? zzdft.m23449m() : zzdft;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23478b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgsi = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23475a(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgsh = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7854ps.f16602a[i - 1]) {
            case 1:
                return new zzdfx();
            case 2:
                return new zza((C7854ps) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgsz, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzgqk", "zzgsr", "zzgsh", "zzgsi"});
            case 4:
                return zzgsz;
            case 5:
                zzdpv<zzdfx> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfx.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgsz);
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
