package com.google.zxing.p198h;

import com.google.zxing.C8806a;
import com.google.zxing.C8807b;
import com.google.zxing.C8808c;
import com.google.zxing.C8814e;
import com.google.zxing.p197g.C8825b;
import com.google.zxing.p198h.p199b.C8832e;
import com.google.zxing.p198h.p199b.C8836i;
import com.google.zxing.p198h.p199b.C8837j;
import com.google.zxing.p198h.p199b.C8838k;
import com.google.zxing.p198h.p199b.C8839l;
import com.google.zxing.p203k.p205c.C8878b;
import java.util.Map;

/* renamed from: com.google.zxing.h.a */
/* compiled from: DataMatrixWriter */
public final class C8827a implements C8814e {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) {
        C8807b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C8806a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            C8839l lVar = C8839l.FORCE_NONE;
            C8807b bVar2 = null;
            if (map != null) {
                C8839l lVar2 = (C8839l) map.get(C8808c.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                C8807b bVar3 = (C8807b) map.get(C8808c.MIN_SIZE);
                if (bVar3 == null) {
                    bVar3 = null;
                }
                bVar = (C8807b) map.get(C8808c.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                bVar2 = bVar3;
            } else {
                bVar = null;
            }
            String a = C8837j.m28882a(str, lVar, bVar2, bVar);
            C8838k a2 = C8838k.m28892a(a.length(), lVar, bVar2, bVar, true);
            C8832e eVar = new C8832e(C8836i.m28876a(a, a2), a2.mo32641e(), a2.mo32640d());
            eVar.mo32616a();
            return m28821a(eVar, a2, i, i2);
        }
    }

    /* renamed from: a */
    private static C8825b m28821a(C8832e eVar, C8838k kVar, int i, int i2) {
        int e = kVar.mo32641e();
        int d = kVar.mo32640d();
        C8878b bVar = new C8878b(kVar.mo32643g(), kVar.mo32642f());
        int i3 = 0;
        for (int i4 = 0; i4 < d; i4++) {
            if (i4 % kVar.f25112e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.mo32643g(); i6++) {
                    bVar.mo32681a(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < e; i8++) {
                if (i8 % kVar.f25111d == 0) {
                    bVar.mo32681a(i7, i3, true);
                    i7++;
                }
                bVar.mo32681a(i7, i3, eVar.mo32617a(i8, i4));
                i7++;
                int i9 = kVar.f25111d;
                if (i8 % i9 == i9 - 1) {
                    bVar.mo32681a(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = kVar.f25112e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.mo32643g(); i12++) {
                    bVar.mo32681a(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m28822a(bVar, i, i2);
    }

    /* renamed from: a */
    private static C8825b m28822a(C8878b bVar, int i, int i2) {
        C8825b bVar2;
        int c = bVar.mo32684c();
        int b = bVar.mo32683b();
        int max = Math.max(i, c);
        int max2 = Math.max(i2, b);
        int min = Math.min(max / c, max2 / b);
        int i3 = (max - (c * min)) / 2;
        int i4 = (max2 - (b * min)) / 2;
        if (i2 < b || i < c) {
            bVar2 = new C8825b(c, b);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new C8825b(i, i2);
        }
        bVar2.mo32599b();
        int i5 = 0;
        while (i5 < b) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < c) {
                if (bVar.mo32678a(i7, i5) == 1) {
                    bVar2.mo32597a(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }
}
