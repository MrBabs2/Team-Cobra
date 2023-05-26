package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

public final class zzxk extends zzdrr<zzxk> {

    /* renamed from: c */
    public String f22962c = null;

    /* renamed from: d */
    private zzwt.zza[] f22963d = new zzwt.zza[0];

    public zzxk() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f22962c;
        if (str != null) {
            zzdrp.mo29193a(1, str);
        }
        zzwt.zza[] zzaArr = this.f22963d;
        if (zzaArr != null && zzaArr.length > 0) {
            int i = 0;
            while (true) {
                zzwt.zza[] zzaArr2 = this.f22963d;
                if (i >= zzaArr2.length) {
                    break;
                }
                zzwt.zza zza = zzaArr2[i];
                if (zza != null) {
                    zzdrp.mo29191a(2, (zzdpk) zza);
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
        String str = this.f22962c;
        if (str != null) {
            c += zzdrp.m24119b(1, str);
        }
        zzwt.zza[] zzaArr = this.f22963d;
        if (zzaArr != null && zzaArr.length > 0) {
            int i = 0;
            while (true) {
                zzwt.zza[] zzaArr2 = this.f22963d;
                if (i >= zzaArr2.length) {
                    break;
                }
                zzwt.zza zza = zzaArr2[i];
                if (zza != null) {
                    c += zzdni.m23827c(2, (zzdpk) zza);
                }
                i++;
            }
        }
        return c;
    }
}
