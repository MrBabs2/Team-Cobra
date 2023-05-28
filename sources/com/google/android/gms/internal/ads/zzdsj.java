package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsj extends zzdrr<zzdsj> {

    /* renamed from: c */
    public Integer f21688c = null;

    /* renamed from: d */
    public String f21689d = null;

    /* renamed from: e */
    public String f21690e = null;

    /* renamed from: f */
    public zzdsk f21691f = null;

    /* renamed from: g */
    public zzdsp[] f21692g = zzdsp.m24198d();

    /* renamed from: h */
    public String f21693h = null;

    /* renamed from: i */
    public zzdso f21694i = null;

    /* renamed from: j */
    private String[] f21695j;

    /* renamed from: k */
    public zzdsq f21696k;

    /* renamed from: l */
    public String[] f21697l;

    /* renamed from: m */
    public String[] f21698m;

    public zzdsj() {
        String[] strArr = zzdry.f21658c;
        this.f21695j = strArr;
        this.f21696k = null;
        this.f21697l = strArr;
        this.f21698m = strArr;
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f21689d;
        if (str != null) {
            zzdrp.mo29193a(1, str);
        }
        String str2 = this.f21690e;
        if (str2 != null) {
            zzdrp.mo29193a(2, str2);
        }
        zzdsp[] zzdspArr = this.f21692g;
        int i = 0;
        if (zzdspArr != null && zzdspArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdsp[] zzdspArr2 = this.f21692g;
                if (i2 >= zzdspArr2.length) {
                    break;
                }
                zzdsp zzdsp = zzdspArr2[i2];
                if (zzdsp != null) {
                    zzdrp.mo29192a(4, (zzdrw) zzdsp);
                }
                i2++;
            }
        }
        String[] strArr = this.f21695j;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f21695j;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    zzdrp.mo29193a(6, str3);
                }
                i3++;
            }
        }
        Integer num = this.f21688c;
        if (num != null) {
            zzdrp.mo29197b(10, num.intValue());
        }
        zzdsk zzdsk = this.f21691f;
        if (zzdsk != null) {
            zzdrp.mo29192a(12, (zzdrw) zzdsk);
        }
        String str4 = this.f21693h;
        if (str4 != null) {
            zzdrp.mo29193a(13, str4);
        }
        zzdso zzdso = this.f21694i;
        if (zzdso != null) {
            zzdrp.mo29192a(14, (zzdrw) zzdso);
        }
        zzdsq zzdsq = this.f21696k;
        if (zzdsq != null) {
            zzdrp.mo29192a(17, (zzdrw) zzdsq);
        }
        String[] strArr3 = this.f21697l;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f21697l;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i4];
                if (str5 != null) {
                    zzdrp.mo29193a(20, str5);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f21698m;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.f21698m;
                if (i >= strArr6.length) {
                    break;
                }
                String str6 = strArr6[i];
                if (str6 != null) {
                    zzdrp.mo29193a(21, str6);
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
        String str = this.f21689d;
        if (str != null) {
            c += zzdrp.m24119b(1, str);
        }
        String str2 = this.f21690e;
        if (str2 != null) {
            c += zzdrp.m24119b(2, str2);
        }
        zzdsp[] zzdspArr = this.f21692g;
        int i = 0;
        if (zzdspArr != null && zzdspArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdsp[] zzdspArr2 = this.f21692g;
                if (i2 >= zzdspArr2.length) {
                    break;
                }
                zzdsp zzdsp = zzdspArr2[i2];
                if (zzdsp != null) {
                    c += zzdrp.m24118b(4, (zzdrw) zzdsp);
                }
                i2++;
            }
        }
        String[] strArr = this.f21695j;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f21695j;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    i5++;
                    i4 += zzdrp.m24113a(str3);
                }
                i3++;
            }
            c = c + i4 + (i5 * 1);
        }
        Integer num = this.f21688c;
        if (num != null) {
            c += zzdrp.m24123c(10, num.intValue());
        }
        zzdsk zzdsk = this.f21691f;
        if (zzdsk != null) {
            c += zzdrp.m24118b(12, (zzdrw) zzdsk);
        }
        String str4 = this.f21693h;
        if (str4 != null) {
            c += zzdrp.m24119b(13, str4);
        }
        zzdso zzdso = this.f21694i;
        if (zzdso != null) {
            c += zzdrp.m24118b(14, (zzdrw) zzdso);
        }
        zzdsq zzdsq = this.f21696k;
        if (zzdsq != null) {
            c += zzdrp.m24118b(17, (zzdrw) zzdsq);
        }
        String[] strArr3 = this.f21697l;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.f21697l;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i6];
                if (str5 != null) {
                    i8++;
                    i7 += zzdrp.m24113a(str5);
                }
                i6++;
            }
            c = c + i7 + (i8 * 2);
        }
        String[] strArr5 = this.f21698m;
        if (strArr5 == null || strArr5.length <= 0) {
            return c;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            String[] strArr6 = this.f21698m;
            if (i >= strArr6.length) {
                return c + i9 + (i10 * 2);
            }
            String str6 = strArr6[i];
            if (str6 != null) {
                i10++;
                i9 += zzdrp.m24113a(str6);
            }
            i++;
        }
    }
}
