package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdhe extends zzdob<zzdhe, zza> implements zzdpm {
    private static volatile zzdpv<zzdhe> zzdv;
    /* access modifiers changed from: private */
    public static final zzdhe zzgvi;
    private int zzgqk;
    private zzdhg zzgvh;

    public static final class zza extends zzdob.zza<zzdhe, zza> implements zzdpm {
        private zza() {
            super(zzdhe.zzgvi);
        }

        /* renamed from: a */
        public final zza mo29035a(int i) {
            mo29140j();
            ((zzdhe) this.f21572g).m23631b(0);
            return this;
        }

        /* synthetic */ zza(C7445et etVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29036a(zzdhg zzdhg) {
            mo29140j();
            ((zzdhe) this.f21572g).m23630a(zzdhg);
            return this;
        }
    }

    static {
        zzdhe zzdhe = new zzdhe();
        zzgvi = zzdhe;
        zzdob.m24005a(zzdhe.class, zzdhe);
    }

    private zzdhe() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23630a(zzdhg zzdhg) {
        if (zzdhg != null) {
            this.zzgvh = zzdhg;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23631b(int i) {
        this.zzgqk = i;
    }

    /* renamed from: l */
    public static zza m23632l() {
        return (zza) ((zzdob.zza) zzgvi.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final int mo29033j() {
        return this.zzgqk;
    }

    /* renamed from: k */
    public final zzdhg mo29034k() {
        zzdhg zzdhg = this.zzgvh;
        return zzdhg == null ? zzdhg.m23640k() : zzdhg;
    }

    /* renamed from: a */
    public static zzdhe m23627a(zzdmr zzdmr) throws zzdok {
        return (zzdhe) zzdob.m23996a(zzgvi, zzdmr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7445et.f15166a[i - 1]) {
            case 1:
                return new zzdhe();
            case 2:
                return new zza((C7445et) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvh"});
            case 4:
                return zzgvi;
            case 5:
                zzdpv<zzdhe> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdhe.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvi);
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
