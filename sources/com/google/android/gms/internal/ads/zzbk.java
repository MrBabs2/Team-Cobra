package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzbk {

    public static final class zza extends zzdob<zza, C12965zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        /* access modifiers changed from: private */
        public static final zza zzdy;
        private int zzdj;
        private zzb zzdw;
        private zzc zzdx;

        /* renamed from: com.google.android.gms.internal.ads.zzbk$zza$zza  reason: collision with other inner class name */
        public static final class C12965zza extends zzdob.zza<zza, C12965zza> implements zzdpm {
            private C12965zza() {
                super(zza.zzdy);
            }

            /* synthetic */ C12965zza(C7801oc ocVar) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzdy = zza;
            zzdob.m24005a(zza.class, zza);
        }

        private zza() {
        }

        /* renamed from: a */
        public static zza m21233a(byte[] bArr, zzdno zzdno) throws zzdok {
            return (zza) zzdob.m24001a(zzdy, bArr, zzdno);
        }

        /* renamed from: j */
        public final boolean mo28241j() {
            return (this.zzdj & 1) == 1;
        }

        /* renamed from: k */
        public final zzb mo28242k() {
            zzb zzb = this.zzdw;
            return zzb == null ? zzb.m21240k() : zzb;
        }

        /* renamed from: l */
        public final boolean mo28243l() {
            return (this.zzdj & 2) == 2;
        }

        /* renamed from: m */
        public final zzc mo28244m() {
            zzc zzc = this.zzdx;
            return zzc == null ? zzc.m21244l() : zzc;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7801oc.f16487a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C12965zza((C7801oc) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzdy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzdw", "zzdx"});
                case 4:
                    return zzdy;
                case 5:
                    zzdpv<zza> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zza.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzdy);
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

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        /* access modifiers changed from: private */
        public static final zzb zzea;
        private int zzdj;
        private int zzdz = 2;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzea);
            }

            /* synthetic */ zza(C7801oc ocVar) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzea = zzb;
            zzdob.m24005a(zzb.class, zzb);
        }

        private zzb() {
        }

        /* renamed from: k */
        public static zzb m21240k() {
            return zzea;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7801oc.f16487a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((C7801oc) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzea, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdj", "zzdz", zzbm.m21345a()});
                case 4:
                    return zzea;
                case 5:
                    zzdpv<zzb> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zzb.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzea);
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
        public final zzbm mo28245j() {
            zzbm a = zzbm.m21344a(this.zzdz);
            return a == null ? zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD : a;
        }
    }

    public static final class zzc extends zzdob<zzc, zza> implements zzdpm {
        private static volatile zzdpv<zzc> zzdv;
        /* access modifiers changed from: private */
        public static final zzc zzep;
        private int zzdj;
        private String zzej = "";
        private String zzek = "";
        private String zzel = "";
        private String zzem = "";
        private String zzen = "";
        private String zzeo = "";

        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzep);
            }

            /* synthetic */ zza(C7801oc ocVar) {
                this();
            }
        }

        static {
            zzc zzc = new zzc();
            zzep = zzc;
            zzdob.m24005a(zzc.class, zzc);
        }

        private zzc() {
        }

        /* renamed from: l */
        public static zzc m21244l() {
            return zzep;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7801oc.f16487a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((C7801oc) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzep, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdj", "zzej", "zzek", "zzel", "zzem", "zzen", "zzeo"});
                case 4:
                    return zzep;
                case 5:
                    zzdpv<zzc> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zzc.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzep);
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
        public final String mo28246j() {
            return this.zzej;
        }

        /* renamed from: k */
        public final String mo28247k() {
            return this.zzeo;
        }
    }
}
