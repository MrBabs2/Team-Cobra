package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdfb extends zzdob<zzdfb, zza> implements zzdpm {
    private static volatile zzdpv<zzdfb> zzdv;
    /* access modifiers changed from: private */
    public static final zzdfb zzgrs;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f21488g;

    public static final class zza extends zzdob.zza<zzdfb, zza> implements zzdpm {
        private zza() {
            super(zzdfb.zzgrs);
        }

        /* renamed from: a */
        public final zza mo28962a(int i) {
            mo29140j();
            ((zzdfb) this.f21572g).m23430b(0);
            return this;
        }

        /* synthetic */ zza(C7632js jsVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28963a(zzdmr zzdmr) {
            mo29140j();
            ((zzdfb) this.f21572g).m23431b(zzdmr);
            return this;
        }
    }

    static {
        zzdfb zzdfb = new zzdfb();
        zzgrs = zzdfb;
        zzdob.m24005a(zzdfb.class, zzdfb);
    }

    private zzdfb() {
    }

    /* renamed from: a */
    public static zzdfb m23427a(zzdmr zzdmr) throws zzdok {
        return (zzdfb) zzdob.m23996a(zzgrs, zzdmr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23430b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: l */
    public static zza m23432l() {
        return (zza) ((zzdob.zza) zzgrs.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo28960j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdmr mo28961k() {
        return this.zzgqs;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23431b(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgqs = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7632js.f15773a[i - 1]) {
            case 1:
                return new zzdfb();
            case 2:
                return new zza((C7632js) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgrs, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgrs;
            case 5:
                zzdpv<zzdfb> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdfb.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgrs);
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
