package com.google.zxing.p203k;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.C8814e;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import com.google.zxing.p203k.p204b.C8872a;
import com.google.zxing.p203k.p205c.C8878b;
import com.google.zxing.p203k.p205c.C8879c;
import com.google.zxing.p203k.p205c.C8883f;
import java.util.Map;

/* renamed from: com.google.zxing.k.a */
/* compiled from: QRCodeWriter */
public final class C8871a implements C8814e {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C8806a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            C8872a aVar2 = C8872a.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(C8808c.ERROR_CORRECTION)) {
                    aVar2 = C8872a.valueOf(map.get(C8808c.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C8808c.MARGIN)) {
                    i3 = Integer.parseInt(map.get(C8808c.MARGIN).toString());
                }
            }
            return m28984a(C8879c.m29018a(str, aVar2, map), i, i2, i3);
        }
    }

    /* renamed from: a */
    private static C8825b m28984a(C8883f fVar, int i, int i2, int i3) {
        C8878b a = fVar.mo32686a();
        if (a != null) {
            int c = a.mo32684c();
            int b = a.mo32683b();
            int i4 = i3 << 1;
            int i5 = c + i4;
            int i6 = i4 + b;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (c * min)) / 2;
            int i8 = (max2 - (b * min)) / 2;
            C8825b bVar = new C8825b(max, max2);
            int i9 = 0;
            while (i9 < b) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < c) {
                    if (a.mo32678a(i11, i9) == 1) {
                        bVar.mo32597a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
