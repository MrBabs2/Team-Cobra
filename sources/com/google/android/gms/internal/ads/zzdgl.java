package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgl extends zzdob<zzdgl, zza> implements zzdpm {
    private static volatile zzdpv<zzdgl> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgl zzgtu;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;
    private zzdgp zzgtt;

    public static final class zza extends zzdob.zza<zzdgl, zza> implements zzdpm {
        private zza() {
            super(zzdgl.zzgtu);
        }

        /* renamed from: a */
        public final zza mo28989a(int i) {
            mo29140j();
            ((zzdgl) this.f21572g).m23512b(0);
            return this;
        }

        /* synthetic */ zza(C8039us usVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28990a(zzdgp zzdgp) {
            mo29140j();
            ((zzdgl) this.f21572g).m23511a(zzdgp);
            return this;
        }

        /* renamed from: a */
        public final zza mo28991a(zzdmr zzdmr) {
            mo29140j();
            ((zzdgl) this.f21572g).m23513b(zzdmr);
            return this;
        }
    }

    static {
        zzdgl zzdgl = new zzdgl();
        zzgtu = zzdgl;
        zzdob.m24005a(zzdgl.class, zzdgl);
    }

    private zzdgl() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23511a(zzdgp zzdgp) {
        if (zzdgp != null) {
            this.zzgtt = zzdgp;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23512b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: m */
    public static zza m23514m() {
        return (zza) ((zzdob.zza) zzgtu.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: n */
    public static zzdgl m23515n() {
        return zzgtu;
    }

    /* renamed from: j */
    public final int mo28986j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28987k() {
        return this.zzgqs;
    }

    /* renamed from: l */
    public final zzdgp mo28988l() {
        zzdgp zzdgp = this.zzgtt;
        return zzdgp == null ? zzdgp.m23530l() : zzdgp;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23513b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static zzdgl m23507a(zzdmr zzdmr) throws zzdok {
        return (zzdgl) zzdob.m23996a(zzgtu, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8039us.f16978a[i - 1]) {
            case 1:
                return new zzdgl();
            case 2:
                return new zza((C8039us) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgtu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgtt", "zzgqs"});
            case 4:
                return zzgtu;
            case 5:
                zzdpv<zzdgl> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgl.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgtu);
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
