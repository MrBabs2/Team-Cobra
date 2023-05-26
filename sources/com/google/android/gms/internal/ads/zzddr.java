package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzddr extends zzdob<zzddr, zza> implements zzdpm {
    private static volatile zzdpv<zzddr> zzdv;
    /* access modifiers changed from: private */
    public static final zzddr zzgqn;
    private int zzgqk;
    private zzdeb zzgql;
    private zzdgl zzgqm;

    public static final class zza extends zzdob.zza<zzddr, zza> implements zzdpm {
        private zza() {
            super(zzddr.zzgqn);
        }

        /* renamed from: a */
        public final zza mo28930a(int i) {
            mo29140j();
            ((zzddr) this.f21572g).m23331b(i);
            return this;
        }

        /* synthetic */ zza(C8223zr zrVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28931a(zzdeb zzdeb) {
            mo29140j();
            ((zzddr) this.f21572g).m23329a(zzdeb);
            return this;
        }

        /* renamed from: a */
        public final zza mo28932a(zzdgl zzdgl) {
            mo29140j();
            ((zzddr) this.f21572g).m23330a(zzdgl);
            return this;
        }
    }

    static {
        zzddr zzddr = new zzddr();
        zzgqn = zzddr;
        zzdob.m24005a(zzddr.class, zzddr);
    }

    private zzddr() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23329a(zzdeb zzdeb) {
        if (zzdeb != null) {
            this.zzgql = zzdeb;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23331b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: m */
    public static zza m23332m() {
        return (zza) ((zzdob.zza) zzgqn.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo28927j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdeb mo28928k() {
        zzdeb zzdeb = this.zzgql;
        return zzdeb == null ? zzdeb.m23357n() : zzdeb;
    }

    /* renamed from: l */
    public final zzdgl mo28929l() {
        zzdgl zzdgl = this.zzgqm;
        return zzdgl == null ? zzdgl.m23515n() : zzdgl;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23330a(zzdgl zzdgl) {
        if (zzdgl != null) {
            this.zzgqm = zzdgl;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static zzddr m23325a(zzdmr zzdmr) throws zzdok {
        return (zzddr) zzdob.m23996a(zzgqn, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8223zr.f17661a[i - 1]) {
            case 1:
                return new zzddr();
            case 2:
                return new zza((C8223zr) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgqn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzgqk", "zzgql", "zzgqm"});
            case 4:
                return zzgqn;
            case 5:
                zzdpv<zzddr> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzddr.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgqn);
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
