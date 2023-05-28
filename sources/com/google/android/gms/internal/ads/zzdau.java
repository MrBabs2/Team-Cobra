package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdob;

public final class zzdau extends zzdob<zzdau, zza> implements zzdpm {
    private static volatile zzdpv<zzdau> zzdv;
    /* access modifiers changed from: private */
    public static final zzdau zzgoq;
    private int zzdj;
    private String zzdk = "";
    private int zzgon;
    private String zzgoo = "";
    private zzdap zzgop;

    public static final class zza extends zzdob.zza<zzdau, zza> implements zzdpm {
        private zza() {
            super(zzdau.zzgoq);
        }

        /* renamed from: a */
        public final zza mo28886a(zzb zzb) {
            mo29140j();
            ((zzdau) this.f21572g).m23220a(zzb);
            return this;
        }

        /* synthetic */ zza(C8148xq xqVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo28887a(String str) {
            mo29140j();
            ((zzdau) this.f21572g).m23224a(str);
            return this;
        }

        /* renamed from: a */
        public final zza mo28885a(zzdap.zzb zzb) {
            mo29140j();
            ((zzdau) this.f21572g).m23219a(zzb);
            return this;
        }
    }

    static {
        zzdau zzdau = new zzdau();
        zzgoq = zzdau;
        zzdob.m24005a(zzdau.class, zzdau);
    }

    private zzdau() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23220a(zzb zzb2) {
        if (zzb2 != null) {
            this.zzdj |= 1;
            this.zzgon = zzb2.mo28259c();
            return;
        }
        throw null;
    }

    /* renamed from: j */
    public static zza m23225j() {
        return (zza) ((zzdob.zza) zzgoq.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    public enum zzb implements zzdoe {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: f */
        private final int f21312f;

        static {
            new C8185yq();
        }

        private zzb(int i) {
            this.f21312f = i;
        }

        /* renamed from: a */
        public static zzb m23231a(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        /* renamed from: c */
        public final int mo28259c() {
            return this.f21312f;
        }

        /* renamed from: a */
        public static zzdog m23232a() {
            return C8222zq.f17660a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23224a(String str) {
        if (str != null) {
            this.zzdj |= 2;
            this.zzdk = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23219a(zzdap.zzb zzb2) {
        this.zzgop = (zzdap) ((zzdob) zzb2.mo29143t());
        this.zzdj |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8148xq.f17203a[i - 1]) {
            case 1:
                return new zzdau();
            case 2:
                return new zza((C8148xq) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgoq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdj", "zzgon", zzb.m23232a(), "zzdk", "zzgoo", "zzgop"});
            case 4:
                return zzgoq;
            case 5:
                zzdpv<zzdau> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdau.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgoq);
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
