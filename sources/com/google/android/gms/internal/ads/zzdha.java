package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.List;

public final class zzdha extends zzdob<zzdha, zza> implements zzdpm {
    private static volatile zzdpv<zzdha> zzdv;
    /* access modifiers changed from: private */
    public static final zzdha zzguz;
    private int zzdj;
    private int zzgux;
    private zzdoj<zzb> zzguy = zzdob.m24008i();

    public static final class zza extends zzdob.zza<zzdha, zza> implements zzdpm {
        private zza() {
            super(zzdha.zzguz);
        }

        /* synthetic */ zza(C7371ct ctVar) {
            this();
        }
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        /* access modifiers changed from: private */
        public static final zzb zzgvd;
        private int zzguq;
        private zzdgr zzgva;
        private int zzgvb;
        private int zzgvc;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzgvd);
            }

            /* synthetic */ zza(C7371ct ctVar) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzgvd = zzb;
            zzdob.m24005a(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7371ct.f14770a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((C7371ct) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzgvd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgva", "zzgvb", "zzgvc", "zzguq"});
                case 4:
                    return zzgvd;
                case 5:
                    zzdpv<zzb> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zzb.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzgvd);
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

        /* renamed from: j */
        public final zzdhm mo29022j() {
            zzdhm a = zzdhm.m23662a(this.zzguq);
            return a == null ? zzdhm.UNRECOGNIZED : a;
        }

        /* renamed from: k */
        public final boolean mo29023k() {
            return this.zzgva != null;
        }

        /* renamed from: l */
        public final zzdgr mo29024l() {
            zzdgr zzdgr = this.zzgva;
            return zzdgr == null ? zzdgr.m23542n() : zzdgr;
        }

        /* renamed from: m */
        public final zzdgu mo29025m() {
            zzdgu a = zzdgu.m23553a(this.zzgvb);
            return a == null ? zzdgu.UNRECOGNIZED : a;
        }

        /* renamed from: n */
        public final int mo29026n() {
            return this.zzgvc;
        }
    }

    static {
        zzdha zzdha = new zzdha();
        zzguz = zzdha;
        zzdob.m24005a(zzdha.class, zzdha);
    }

    private zzdha() {
    }

    /* renamed from: a */
    public static zzdha m23590a(byte[] bArr) throws zzdok {
        return (zzdha) zzdob.m23999a(zzguz, bArr);
    }

    /* renamed from: j */
    public final int mo29019j() {
        return this.zzgux;
    }

    /* renamed from: k */
    public final List<zzb> mo29020k() {
        return this.zzguy;
    }

    /* renamed from: l */
    public final int mo29021l() {
        return this.zzguy.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7371ct.f14770a[i - 1]) {
            case 1:
                return new zzdha();
            case 2:
                return new zza((C7371ct) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzguz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdj", "zzgux", "zzguy", zzb.class});
            case 4:
                return zzguz;
            case 5:
                zzdpv<zzdha> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdha.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzguz);
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
