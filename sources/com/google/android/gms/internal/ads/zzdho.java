package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.List;

public final class zzdho extends zzdob<zzdho, zza> implements zzdpm {
    private static volatile zzdpv<zzdho> zzdv;
    /* access modifiers changed from: private */
    public static final zzdho zzgvz;
    private int zzdj;
    private String zzgvx = "";
    private zzdoj<zzdgy> zzgvy = zzdob.m24008i();

    public static final class zza extends zzdob.zza<zzdho, zza> implements zzdpm {
        private zza() {
            super(zzdho.zzgvz);
        }

        /* renamed from: a */
        public final zza mo29046a(String str) {
            mo29140j();
            ((zzdho) this.f21572g).m23667a(str);
            return this;
        }

        /* synthetic */ zza(C7633jt jtVar) {
            this();
        }

        /* renamed from: a */
        public final zza mo29045a(zzdgy zzdgy) {
            mo29140j();
            ((zzdho) this.f21572g).m23664a(zzdgy);
            return this;
        }
    }

    static {
        zzdho zzdho = new zzdho();
        zzgvz = zzdho;
        zzdob.m24005a(zzdho.class, zzdho);
    }

    private zzdho() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23667a(String str) {
        if (str != null) {
            this.zzgvx = str;
            return;
        }
        throw null;
    }

    /* renamed from: k */
    public static zza m23668k() {
        return (zza) ((zzdob.zza) zzgvz.mo28168a(zzdob.zze.f21578e, (Object) null, (Object) null));
    }

    /* renamed from: j */
    public final List<zzdgy> mo29044j() {
        return this.zzgvy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23664a(zzdgy zzdgy) {
        if (zzdgy != null) {
            if (!this.zzgvy.mo26833q()) {
                zzdoj<zzdgy> zzdoj = this.zzgvy;
                int size = zzdoj.size();
                this.zzgvy = zzdoj.mo25790c(size == 0 ? 10 : size << 1);
            }
            this.zzgvy.add(zzdgy);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28168a(int i, Object obj, Object obj2) {
        switch (C7633jt.f15774a[i - 1]) {
            case 1:
                return new zzdho();
            case 2:
                return new zza((C7633jt) null);
            case 3:
                return zzdob.m24003a((zzdpk) zzgvz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzdj", "zzgvx", "zzgvy", zzdgy.class});
            case 4:
                return zzgvz;
            case 5:
                zzdpv<zzdho> zzdpv = zzdv;
                if (zzdpv == null) {
                    synchronized (zzdho.class) {
                        zzdpv = zzdv;
                        if (zzdpv == null) {
                            zzdpv = new zzdob.zzb<>(zzgvz);
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
