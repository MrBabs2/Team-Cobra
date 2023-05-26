package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzbi {

    public static final class zza extends zzdob<zza, C12964zza> implements zzdpm {
        /* access modifiers changed from: private */
        public static final zza zzdu;
        private static volatile zzdpv<zza> zzdv;
        private int zzdj;
        private String zzdk = "";
        private long zzdl;
        private String zzdm = "";
        private String zzdn = "";
        private String zzdo = "";
        private long zzdp;
        private long zzdq;
        private String zzdr = "";
        private long zzds;
        private String zzdt = "";

        /* renamed from: com.google.android.gms.internal.ads.zzbi$zza$zza  reason: collision with other inner class name */
        public static final class C12964zza extends zzdob.zza<zza, C12964zza> implements zzdpm {
            private C12964zza() {
                super(zza.zzdu);
            }

            /* renamed from: a */
            public final C12964zza mo28170a(String str) {
                mo29140j();
                ((zza) this.f21572g).m21082a(str);
                return this;
            }

            /* renamed from: b */
            public final C12964zza mo28171b(String str) {
                mo29140j();
                ((zza) this.f21572g).m21084b(str);
                return this;
            }

            /* renamed from: c */
            public final C12964zza mo28172c(String str) {
                mo29140j();
                ((zza) this.f21572g).m21086c(str);
                return this;
            }

            /* synthetic */ C12964zza(C7948sb sbVar) {
                this();
            }

            /* renamed from: a */
            public final C12964zza mo28169a(long j) {
                mo29140j();
                ((zza) this.f21572g).m21079a(j);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzdu = zza;
            zzdob.m24005a(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21082a(String str) {
            if (str != null) {
                this.zzdj |= 1;
                this.zzdk = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21084b(String str) {
            if (str != null) {
                this.zzdj |= 4;
                this.zzdm = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21086c(String str) {
            if (str != null) {
                this.zzdj |= 8;
                this.zzdn = str;
                return;
            }
            throw null;
        }

        /* renamed from: j */
        public static C12964zza m21087j() {
            return (C12964zza) ((zzdob.zza) zzdu.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21079a(long j) {
            this.zzdj |= 2;
            this.zzdl = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (C7948sb.f16842a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C12964zza((C7948sb) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzdu, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", new Object[]{"zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt"});
                case 4:
                    return zzdu;
                case 5:
                    zzdpv<zza> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zza.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzdu);
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
}
