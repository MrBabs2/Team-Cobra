package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgr extends zzdob<zzdgr, zza> implements zzdpm {
    private static volatile zzdpv<zzdgr> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgr zzguc;
    private String zzgtz = "";
    private zzdmr zzgua = zzdmr.f21488g;
    private int zzgub;

    public static final class zza extends zzdob.zza<zzdgr, zza> implements zzdpm {
        private zza() {
            super(zzdgr.zzguc);
        }

        /* renamed from: a */
        public final zza mo29001a(String str) {
            mo29140j();
            ((zzdgr) this.f21572g).m23540a(str);
            return this;
        }

        /* synthetic */ zza(C8150xs xsVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29000a(zzdmr zzdmr) {
            mo29140j();
            ((zzdgr) this.f21572g).m23539a(zzdmr);
            return this;
        }

        /* renamed from: a */
        public final zza mo28999a(zzb zzb) {
            mo29140j();
            ((zzdgr) this.f21572g).m23535a(zzb);
            return this;
        }
    }

    public enum zzb implements zzdoe {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        private final int f21408f;

        static {
            new C8187ys();
        }

        private zzb(int i) {
            this.f21408f = i;
        }

        /* renamed from: a */
        public static zzb m23551a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        /* renamed from: c */
        public final int mo28259c() {
            if (this != UNRECOGNIZED) {
                return this.f21408f;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        zzdgr zzdgr = new zzdgr();
        zzguc = zzdgr;
        zzdob.m24005a(zzdgr.class, zzdgr);
    }

    private zzdgr() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23540a(String str) {
        if (str != null) {
            this.zzgtz = str;
            return;
        }
        throw null;
    }

    /* renamed from: m */
    public static zza m23541m() {
        return (zza) ((zzdob.zza) zzguc.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: n */
    public static zzdgr m23542n() {
        return zzguc;
    }

    /* renamed from: j */
    public final String mo28996j() {
        return this.zzgtz;
    }

    /* renamed from: k */
    public final zzdmr mo28997k() {
        return this.zzgua;
    }

    /* renamed from: l */
    public final zzb mo28998l() {
        zzb a = zzb.m23551a(this.zzgub);
        return a == null ? zzb.UNRECOGNIZED : a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23539a(zzdmr zzdmr) {
        if (zzdmr != null) {
            this.zzgua = zzdmr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23535a(zzb zzb2) {
        if (zzb2 != null) {
            this.zzgub = zzb2.mo28259c();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C8150xs.f17204a[i - 1]) {
            case 1:
                return new zzdgr();
            case 2:
                return new zza((C8150xs) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzguc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzgub"});
            case 4:
                return zzguc;
            case 5:
                zzdpv<zzdgr> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgr.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzguc);
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
