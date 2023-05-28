package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

public final class zzxj extends zzdrr<zzxj> {

    /* renamed from: c */
    public Integer f22958c = null;

    /* renamed from: d */
    public zzxk f22959d = null;

    /* renamed from: e */
    private zzwt.zza[] f22960e = new zzwt.zza[0];

    /* renamed from: f */
    private zzxp[] f22961f = zzxp.m25631d();

    public zzxj() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        Integer num = this.f22958c;
        if (num != null) {
            zzdrp.mo29197b(7, num.intValue());
        }
        zzxk zzxk = this.f22959d;
        if (zzxk != null) {
            zzdrp.mo29192a(10, (zzdrw) zzxk);
        }
        zzwt.zza[] zzaArr = this.f22960e;
        int i = 0;
        if (zzaArr != null && zzaArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaArr2 = this.f22960e;
                if (i2 >= zzaArr2.length) {
                    break;
                }
                zzwt.zza zza = zzaArr2[i2];
                if (zza != null) {
                    zzdrp.mo29191a(11, (zzdpk) zza);
                }
                i2++;
            }
        }
        zzxp[] zzxpArr = this.f22961f;
        if (zzxpArr != null && zzxpArr.length > 0) {
            while (true) {
                zzxp[] zzxpArr2 = this.f22961f;
                if (i >= zzxpArr2.length) {
                    break;
                }
                zzxp zzxp = zzxpArr2[i];
                if (zzxp != null) {
                    zzdrp.mo29192a(17, (zzdrw) zzxp);
                }
                i++;
            }
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        Integer num = this.f22958c;
        if (num != null) {
            c += zzdrp.m24123c(7, num.intValue());
        }
        zzxk zzxk = this.f22959d;
        if (zzxk != null) {
            c += zzdrp.m24118b(10, (zzdrw) zzxk);
        }
        zzwt.zza[] zzaArr = this.f22960e;
        int i = 0;
        if (zzaArr != null && zzaArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaArr2 = this.f22960e;
                if (i2 >= zzaArr2.length) {
                    break;
                }
                zzwt.zza zza = zzaArr2[i2];
                if (zza != null) {
                    c += zzdni.m23827c(11, (zzdpk) zza);
                }
                i2++;
            }
        }
        zzxp[] zzxpArr = this.f22961f;
        if (zzxpArr != null && zzxpArr.length > 0) {
            while (true) {
                zzxp[] zzxpArr2 = this.f22961f;
                if (i >= zzxpArr2.length) {
                    break;
                }
                zzxp zzxp = zzxpArr2[i];
                if (zzxp != null) {
                    c += zzdrp.m24118b(17, (zzdrw) zzxp);
                }
                i++;
            }
        }
        return c;
    }
}
