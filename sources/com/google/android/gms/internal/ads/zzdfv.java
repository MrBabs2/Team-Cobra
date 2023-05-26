package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfv extends zzdob<zzdfv, zza> implements zzdpm {
    private static volatile zzdpv<zzdfv> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfv zzgsy;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;
    private zzdfx zzgsx;

    public static final class zza extends zzdob.zza<zzdfv, zza> implements zzdpm {
        private zza() {
            super(zzdfv.zzgsy);
        }

        /* renamed from: a */
        public final zza mo28972a(int i) {
            mo29140j();
            ((zzdfv) this.f21572g).m23460b(0);
            return this;
        }

        /* synthetic */ zza(C7817os osVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28973a(zzdfx zzdfx) {
            mo29140j();
            ((zzdfv) this.f21572g).m23459a(zzdfx);
            return this;
        }

        /* renamed from: a */
        public final zza mo28974a(zzdmr zzdmr) {
            mo29140j();
            ((zzdfv) this.f21572g).m23461b(zzdmr);
            return this;
        }
    }

    static {
        zzdfv zzdfv = new zzdfv();
        zzgsy = zzdfv;
        zzdob.m24005a(zzdfv.class, zzdfv);
    }

    private zzdfv() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23459a(zzdfx zzdfx) {
        if (zzdfx != null) {
            this.zzgsx = zzdfx;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23460b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: m */
    public static zza m23462m() {
        return (zza) ((zzdob.zza) zzgsy.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo28969j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28970k() {
        return this.zzgqs;
    }

    /* renamed from: l */
    public final zzdfx mo28971l() {
        zzdfx zzdfx = this.zzgsx;
        return zzdfx == null ? zzdfx.m23481p() : zzdfx;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23461b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static zzdfv m23455a(zzdmr zzdmr) throws zzdok {
        return (zzdfv) zzdob.m23996a(zzgsy, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7817os.f16512a[i - 1]) {
            case 1:
                return new zzdfv();
            case 2:
                return new zza((C7817os) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgsy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgsx", "zzgqs"});
            case 4:
                return zzgsy;
            case 5:
                zzdpv<zzdfv> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfv.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgsy);
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
