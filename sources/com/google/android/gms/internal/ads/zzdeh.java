package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdeh extends zzdob<zzdeh, zza> implements zzdpm {
    private static volatile zzdpv<zzdeh> zzdv;
    /* access modifiers changed from: private */
    public static final zzdeh zzgrh;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;
    private zzdel zzgrg;

    public static final class zza extends zzdob.zza<zzdeh, zza> implements zzdpm {
        private zza() {
            super(zzdeh.zzgrh);
        }

        /* renamed from: a */
        public final zza mo28949a(int i) {
            mo29140j();
            ((zzdeh) this.f21572g).m23381b(0);
            return this;
        }

        /* synthetic */ zza(C7444es esVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28950a(zzdel zzdel) {
            mo29140j();
            ((zzdeh) this.f21572g).m23380a(zzdel);
            return this;
        }

        /* renamed from: a */
        public final zza mo28951a(zzdmr zzdmr) {
            mo29140j();
            ((zzdeh) this.f21572g).m23382b(zzdmr);
            return this;
        }
    }

    static {
        zzdeh zzdeh = new zzdeh();
        zzgrh = zzdeh;
        zzdob.m24005a(zzdeh.class, zzdeh);
    }

    private zzdeh() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23380a(zzdel zzdel) {
        if (zzdel != null) {
            this.zzgrg = zzdel;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23381b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: m */
    public static zza m23383m() {
        return (zza) ((zzdob.zza) zzgrh.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo28946j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28947k() {
        return this.zzgqs;
    }

    /* renamed from: l */
    public final zzdel mo28948l() {
        zzdel zzdel = this.zzgrg;
        return zzdel == null ? zzdel.m23397k() : zzdel;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23382b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static zzdeh m23376a(zzdmr zzdmr) throws zzdok {
        return (zzdeh) zzdob.m23996a(zzgrh, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7444es.f15165a[i - 1]) {
            case 1:
                return new zzdeh();
            case 2:
                return new zza((C7444es) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrg", "zzgqs"});
            case 4:
                return zzgrh;
            case 5:
                zzdpv<zzdeh> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdeh.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrh);
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
