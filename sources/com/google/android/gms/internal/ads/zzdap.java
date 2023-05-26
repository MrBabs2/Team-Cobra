package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdap extends zzdob<zzdap, zzb> implements zzdpm {
    private static volatile zzdpv<zzdap> zzdv;
    private static final zzdoi<Integer, zza> zzgof = new C8000tq();
    /* access modifiers changed from: private */
    public static final zzdap zzgoj;
    private int zzdj;
    private zzdoh zzgoe = zzdob.m24007d();
    private String zzgog = "";
    private String zzgoh = "";
    private String zzgoi = "";

    public static final class zzb extends zzdob.zza<zzdap, zzb> implements zzdpm {
        private zzb() {
            super(zzdap.zzgoj);
        }

        /* renamed from: a */
        public final zzb mo28883a(zza zza) {
            mo29140j();
            ((zzdap) this.f21572g).m23207a(zza);
            return this;
        }

        /* synthetic */ zzb(C8000tq tqVar) {
            this();
        }

        /* renamed from: a */
        public final zzb mo28884a(String str) {
            mo29140j();
            ((zzdap) this.f21572g).m23210a(str);
            return this;
        }
    }

    static {
        zzdap zzdap = new zzdap();
        zzgoj = zzdap;
        zzdob.m24005a(zzdap.class, zzdap);
    }

    private zzdap() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23207a(zza zza2) {
        if (zza2 != null) {
            if (!this.zzgoe.mo26833q()) {
                zzdoh zzdoh = this.zzgoe;
                int size = zzdoh.size();
                this.zzgoe = zzdoh.mo26050d(size == 0 ? 10 : size << 1);
            }
            this.zzgoe.mo26051f(zza2.mo28259c());
            return;
        }
        throw null;
    }

    /* renamed from: j */
    public static zzb m23211j() {
        return (zzb) ((zzdob.zza) zzgoj.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    public enum zza implements zzdoe {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: f */
        private final int f21308f;

        static {
            new C8074vq();
        }

        private zza(int i) {
            this.f21308f = i;
        }

        /* renamed from: a */
        public static zza m23214a(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        /* renamed from: c */
        public final int mo28259c() {
            return this.f21308f;
        }

        /* renamed from: a */
        public static zzdog m23215a() {
            return C8111wq.f17101a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23210a(String str) {
        if (str != null) {
            this.zzdj |= 1;
            this.zzgog = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8037uq.f16972a[i - 1]) {
            case 1:
                return new zzdap();
            case 2:
                return new zzb((C8000tq) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgoj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdj", "zzgoe", zza.m23215a(), "zzgog", "zzgoh", "zzgoi"});
            case 4:
                return zzgoj;
            case 5:
                zzdpv<zzdap> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdap.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgoj);
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
