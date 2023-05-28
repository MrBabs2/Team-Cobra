package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdhc extends zzdob<zzdhc, zza> implements zzdpm {
    private static volatile zzdpv<zzdhc> zzdv;
    /* access modifiers changed from: private */
    public static final zzdhc zzgvf;
    private int zzdj;
    private int zzgux;
    private zzdoj<zzb> zzgve = zzdob.m24008i();

    public static final class zza extends zzdob.zza<zzdhc, zza> implements zzdpm {
        private zza() {
            super(zzdhc.zzgvf);
        }

        /* renamed from: a */
        public final zza mo29027a(int i) {
            mo29140j();
            ((zzdhc) this.f21572g).m23606b(i);
            return this;
        }

        /* synthetic */ zza(C7408dt dtVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29028a(zzb zzb) {
            mo29140j();
            ((zzdhc) this.f21572g).m23603a(zzb);
            return this;
        }
    }

    static {
        zzdhc zzdhc = new zzdhc();
        zzgvf = zzdhc;
        zzdob.m24005a(zzdhc.class, zzdhc);
    }

    private zzdhc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23603a(zzb zzb2) {
        if (zzb2 != null) {
            if (!this.zzgve.mo26833q()) {
                zzdoj<zzb> zzdoj = this.zzgve;
                int size = zzdoj.size();
                this.zzgve = zzdoj.mo25790c(size == 0 ? 10 : size << 1);
            }
            this.zzgve.add(zzb2);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23606b(int i) {
        this.zzgux = i;
    }

    /* renamed from: j */
    public static zza m23607j() {
        return (zza) ((zzdob.zza) zzgvf.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        /* access modifiers changed from: private */
        public static final zzb zzgvg;
        private String zzgtz = "";
        private int zzguq;
        private int zzgvb;
        private int zzgvc;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzgvg);
            }

            /* renamed from: a */
            public final zza mo29032a(String str) {
                mo29140j();
                ((zzb) this.f21572g).m23618a(str);
                return this;
            }

            /* synthetic */ zza(C7408dt dtVar) {
                this();
            }

            /* renamed from: a */
            public final zza mo29030a(zzdgu zzdgu) {
                mo29140j();
                ((zzb) this.f21572g).m23612a(zzdgu);
                return this;
            }

            /* renamed from: a */
            public final zza mo29029a(int i) {
                mo29140j();
                ((zzb) this.f21572g).m23619b(i);
                return this;
            }

            /* renamed from: a */
            public final zza mo29031a(zzdhm zzdhm) {
                mo29140j();
                ((zzb) this.f21572g).m23617a(zzdhm);
                return this;
            }
        }

        static {
            zzb zzb = new zzb();
            zzgvg = zzb;
            zzdob.m24005a(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23618a(String str) {
            if (str != null) {
                this.zzgtz = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m23619b(int i) {
            this.zzgvc = i;
        }

        /* renamed from: j */
        public static zza m23620j() {
            return (zza) ((zzdob.zza) zzgvg.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23612a(zzdgu zzdgu) {
            if (zzdgu != null) {
                this.zzgvb = zzdgu.mo28259c();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23617a(zzdhm zzdhm) {
            if (zzdhm != null) {
                this.zzguq = zzdhm.mo28259c();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7408dt.f15025a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((C7408dt) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzgvg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgtz", "zzgvb", "zzgvc", "zzguq"});
                case 4:
                    return zzgvg;
                case 5:
                    zzdpv<zzb> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zzb.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzgvg);
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7408dt.f15025a[i - 1]) {
            case 1:
                return new zzdhc();
            case 2:
                return new zza((C7408dt) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdj", "zzgux", "zzgve", zzb.class});
            case 4:
                return zzgvf;
            case 5:
                zzdpv<zzdhc> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdhc.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvf);
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
