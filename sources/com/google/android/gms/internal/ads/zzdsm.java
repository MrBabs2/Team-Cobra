package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsm extends zzdrr<zzdsm> {

    /* renamed from: c */
    public zzdsl[] f21703c = zzdsl.m24189d();

    public zzdsm() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        zzdsl[] zzdslArr = this.f21703c;
        if (zzdslArr != null && zzdslArr.length > 0) {
            int i = 0;
            while (true) {
                zzdsl[] zzdslArr2 = this.f21703c;
                if (i >= zzdslArr2.length) {
                    break;
                }
                zzdsl zzdsl = zzdslArr2[i];
                if (zzdsl != null) {
                    zzdrp.mo29192a(2, (zzdrw) zzdsl);
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
        zzdsl[] zzdslArr = this.f21703c;
        if (zzdslArr != null && zzdslArr.length > 0) {
            int i = 0;
            while (true) {
                zzdsl[] zzdslArr2 = this.f21703c;
                if (i >= zzdslArr2.length) {
                    break;
                }
                zzdsl zzdsl = zzdslArr2[i];
                if (zzdsl != null) {
                    c += zzdrp.m24118b(2, (zzdrw) zzdsl);
                }
                i++;
            }
        }
        return c;
    }
}
