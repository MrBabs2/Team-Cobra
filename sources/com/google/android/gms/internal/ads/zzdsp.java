package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsp extends zzdrr<zzdsp> {

    /* renamed from: i */
    private static volatile zzdsp[] f21707i;

    /* renamed from: c */
    public Integer f21708c = null;

    /* renamed from: d */
    public String f21709d = null;

    /* renamed from: e */
    public zzdsm f21710e = null;

    /* renamed from: f */
    private int[] f21711f = zzdry.f21656a;

    /* renamed from: g */
    public Integer f21712g = null;

    /* renamed from: h */
    public String[] f21713h = zzdry.f21658c;

    public zzdsp() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: d */
    public static zzdsp[] m24198d() {
        if (f21707i == null) {
            synchronized (zzdrv.f21654a) {
                if (f21707i == null) {
                    f21707i = new zzdsp[0];
                }
            }
        }
        return f21707i;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        zzdrp.mo29197b(1, this.f21708c.intValue());
        String str = this.f21709d;
        if (str != null) {
            zzdrp.mo29193a(2, str);
        }
        zzdsm zzdsm = this.f21710e;
        if (zzdsm != null) {
            zzdrp.mo29192a(3, (zzdrw) zzdsm);
        }
        int[] iArr = this.f21711f;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f21711f;
                if (i2 >= iArr2.length) {
                    break;
                }
                zzdrp.mo29197b(6, iArr2[i2]);
                i2++;
            }
        }
        Integer num = this.f21712g;
        if (num != null) {
            zzdrp.mo29197b(8, num.intValue());
        }
        String[] strArr = this.f21713h;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f21713h;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    zzdrp.mo29193a(9, str2);
                }
                i++;
            }
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int[] iArr;
        int c = super.mo29200c() + zzdrp.m24123c(1, this.f21708c.intValue());
        String str = this.f21709d;
        if (str != null) {
            c += zzdrp.m24119b(2, str);
        }
        zzdsm zzdsm = this.f21710e;
        if (zzdsm != null) {
            c += zzdrp.m24118b(3, (zzdrw) zzdsm);
        }
        int[] iArr2 = this.f21711f;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.f21711f;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += zzdrp.m24117b(iArr[i2]);
                i2++;
            }
            c = c + i3 + (iArr.length * 1);
        }
        Integer num = this.f21712g;
        if (num != null) {
            c += zzdrp.m24123c(8, num.intValue());
        }
        String[] strArr = this.f21713h;
        if (strArr == null || strArr.length <= 0) {
            return c;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f21713h;
            if (i >= strArr2.length) {
                return c + i4 + (i5 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i5++;
                i4 += zzdrp.m24113a(str2);
            }
            i++;
        }
    }
}
