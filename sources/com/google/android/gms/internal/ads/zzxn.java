package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

public final class zzxn extends zzdrr<zzxn> {

    /* renamed from: c */
    public String f22966c = null;

    /* renamed from: d */
    public long[] f22967d = zzdry.f21657b;

    /* renamed from: e */
    public zzxl f22968e = null;

    /* renamed from: f */
    public zzxj f22969f = null;

    /* renamed from: g */
    public zzwt.zzi f22970g = null;

    /* renamed from: h */
    public zzwt.zzv f22971h = null;

    public zzxn() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f22966c;
        if (str != null) {
            zzdrp.mo29193a(10, str);
        }
        long[] jArr = this.f22967d;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f22967d;
                if (i >= jArr2.length) {
                    break;
                }
                long j = jArr2[i];
                zzdrp.mo29190a(14, 0);
                zzdrp.mo29196a(j);
                i++;
            }
        }
        zzxl zzxl = this.f22968e;
        if (zzxl != null) {
            zzdrp.mo29192a(15, (zzdrw) zzxl);
        }
        zzxj zzxj = this.f22969f;
        if (zzxj != null) {
            zzdrp.mo29192a(18, (zzdrw) zzxj);
        }
        zzwt.zzi zzi = this.f22970g;
        if (zzi != null) {
            zzdrp.mo29191a(19, (zzdpk) zzi);
        }
        zzwt.zzv zzv = this.f22971h;
        if (zzv != null) {
            zzdrp.mo29191a(20, (zzdpk) zzv);
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        long[] jArr;
        int c = super.mo29200c();
        String str = this.f22966c;
        if (str != null) {
            c += zzdrp.m24119b(10, str);
        }
        long[] jArr2 = this.f22967d;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr = this.f22967d;
                if (i >= jArr.length) {
                    break;
                }
                i2 += zzdrp.m24121b(jArr[i]);
                i++;
            }
            c = c + i2 + (jArr.length * 1);
        }
        zzxl zzxl = this.f22968e;
        if (zzxl != null) {
            c += zzdrp.m24118b(15, (zzdrw) zzxl);
        }
        zzxj zzxj = this.f22969f;
        if (zzxj != null) {
            c += zzdrp.m24118b(18, (zzdrw) zzxj);
        }
        zzwt.zzi zzi = this.f22970g;
        if (zzi != null) {
            c += zzdni.m23827c(19, (zzdpk) zzi);
        }
        zzwt.zzv zzv = this.f22971h;
        return zzv != null ? c + zzdni.m23827c(20, (zzdpk) zzv) : c;
    }
}
