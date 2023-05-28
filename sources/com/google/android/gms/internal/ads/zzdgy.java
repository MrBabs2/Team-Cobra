package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgy extends zzdob<zzdgy, zza> implements zzdpm {
    private static volatile zzdpv<zzdgy> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgy zzguw;
    private String zzgtz = "";
    private String zzgus = "";
    private int zzgut;
    private boolean zzguu;
    private String zzguv = "";

    public static final class zza extends zzdob.zza<zzdgy, zza> implements zzdpm {
        private zza() {
            super(zzdgy.zzguw);
        }

        /* renamed from: a */
        public final zza mo29010a(String str) {
            mo29140j();
            ((zzdgy) this.f21572g).m23567b(str);
            return this;
        }

        /* renamed from: b */
        public final zza mo29012b(String str) {
            mo29140j();
            ((zzdgy) this.f21572g).m23563a(str);
            return this;
        }

        /* renamed from: c */
        public final zza mo29013c(String str) {
            mo29140j();
            ((zzdgy) this.f21572g).m23569c(str);
            return this;
        }

        /* synthetic */ zza(C7334bt btVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29009a(int i) {
            mo29140j();
            ((zzdgy) this.f21572g).m23565b(0);
            return this;
        }

        /* renamed from: a */
        public final zza mo29011a(boolean z) {
            mo29140j();
            ((zzdgy) this.f21572g).m23564a(true);
            return this;
        }
    }

    static {
        zzdgy zzdgy = new zzdgy();
        zzguw = zzdgy;
        zzdob.m24005a(zzdgy.class, zzdgy);
    }

    private zzdgy() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23563a(String str) {
        if (str != null) {
            this.zzgtz = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23567b(String str) {
        if (str != null) {
            this.zzgus = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23569c(String str) {
        if (str != null) {
            this.zzguv = str;
            return;
        }
        throw null;
    }

    /* renamed from: p */
    public static zza m23570p() {
        return (zza) ((zzdob.zza) zzguw.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final String mo29004j() {
        return this.zzgtz;
    }

    /* renamed from: k */
    public final String mo29005k() {
        return this.zzgus;
    }

    /* renamed from: l */
    public final int mo29006l() {
        return this.zzgut;
    }

    /* renamed from: m */
    public final boolean mo29007m() {
        return this.zzguu;
    }

    /* renamed from: n */
    public final String mo29008n() {
        return this.zzguv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23564a(boolean z) {
        this.zzguu = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23565b(int i) {
        this.zzgut = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7334bt.f14658a[i - 1]) {
            case 1:
                return new zzdgy();
            case 2:
                return new zza((C7334bt) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzguw, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzgus", "zzgtz", "zzgut", "zzguu", "zzguv"});
            case 4:
                return zzguw;
            case 5:
                zzdpv<zzdgy> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgy.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzguw);
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
