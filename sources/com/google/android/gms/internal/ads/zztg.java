package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zztg {

    /* renamed from: a */
    public final List<byte[]> f22688a;

    /* renamed from: b */
    public final int f22689b;

    private zztg(List<byte[]> list, int i) {
        this.f22688a = list;
        this.f22689b = i;
    }

    /* renamed from: a */
    public static zztg m25301a(zzst zzst) throws zzlm {
        List list;
        try {
            zzst.mo29729c(21);
            int g = zzst.mo29735g() & 3;
            int g2 = zzst.mo29735g();
            int b = zzst.mo29726b();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                zzst.mo29729c(1);
                int h = zzst.mo29736h();
                for (int i3 = 0; i3 < h; i3++) {
                    int h2 = zzst.mo29736h();
                    i += h2 + 4;
                    zzst.mo29729c(h2);
                }
            }
            zzst.mo29727b(b);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                zzst.mo29729c(1);
                int h3 = zzst.mo29736h();
                for (int i6 = 0; i6 < h3; i6++) {
                    int h4 = zzst.mo29736h();
                    System.arraycopy(zzsq.f22651a, 0, bArr, i4, zzsq.f22651a.length);
                    int length = i4 + zzsq.f22651a.length;
                    System.arraycopy(zzst.f22660a, zzst.mo29726b(), bArr, length, h4);
                    i4 = length + h4;
                    zzst.mo29729c(h4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zztg(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzlm("Error parsing HEVC config", e);
        }
    }
}
