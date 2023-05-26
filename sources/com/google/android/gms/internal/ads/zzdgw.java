package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

public final class zzdgw extends zzdob<zzdgw, zza> implements zzdpm {
    private static volatile zzdpv<zzdgw> zzdv;
    /* access modifiers changed from: private */
    public static final zzdgw zzgur;
    private String zzgtz = "";
    private zzdmr zzgua = zzdmr.f21488g;
    private int zzguq;

    public static final class zza extends zzdob.zza<zzdgw, zza> implements zzdpm {
        private zza() {
            super(zzdgw.zzgur);
        }

        /* synthetic */ zza(C7297at atVar) {
            this();
        }
    }

    static {
        zzdgw zzdgw = new zzdgw();
        zzgur = zzdgw;
        zzdob.m24005a(zzdgw.class, zzdgw);
    }

    private zzdgw() {
    }

    /* renamed from: l */
    public static zzdgw m23555l() {
        return zzgur;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7297at.f14500a[i - 1]) {
            case 1:
                return new zzdgw();
            case 2:
                return new zza((C7297at) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgur, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzguq"});
            case 4:
                return zzgur;
            case 5:
                zzdpv<zzdgw> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdgw.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgur);
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
    public final String mo29002j() {
        return this.zzgtz;
    }

    /* renamed from: k */
    public final zzdmr mo29003k() {
        return this.zzgua;
    }
}
