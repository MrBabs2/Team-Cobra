package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzta {

    /* renamed from: a */
    public final List<byte[]> f22676a;

    /* renamed from: b */
    public final int f22677b;

    /* renamed from: c */
    public final float f22678c;

    private zzta(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f22676a = list;
        this.f22677b = i;
        this.f22678c = f;
    }

    /* renamed from: a */
    public static zzta m25297a(zzst zzst) throws zzlm {
        float f;
        int i;
        int i2;
        try {
            zzst.mo29729c(4);
            int g = (zzst.mo29735g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = zzst.mo29735g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(m25298b(zzst));
                }
                int g3 = zzst.mo29735g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(m25298b(zzst));
                }
                if (g2 > 0) {
                    zzsr a = zzsq.m25236a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f22653a;
                    int i6 = a.f22654b;
                    f = a.f22655c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new zzta(arrayList, g, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzlm("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m25298b(zzst zzst) {
        int h = zzst.mo29736h();
        int b = zzst.mo29726b();
        zzst.mo29729c(h);
        return zzsl.m25222a(zzst.f22660a, b, h);
    }
}
