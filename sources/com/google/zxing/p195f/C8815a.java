package com.google.zxing.p195f;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.C8814e;
import com.google.zxing.p195f.p196b.C8816a;
import com.google.zxing.p195f.p196b.C8818c;
import com.google.zxing.p197g.C8825b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: com.google.zxing.f.a */
/* compiled from: AztecWriter */
public final class C8815a implements C8814e {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(C8808c.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(C8808c.CHARACTER_SET).toString());
            }
            if (map.containsKey(C8808c.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(C8808c.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(C8808c.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(C8808c.AZTEC_LAYERS).toString());
                return m28762a(str, aVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m28762a(str, aVar, i, i2, charset, i4, i3);
    }

    /* renamed from: a */
    private static C8825b m28762a(String str, C8806a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == C8806a.AZTEC) {
            return m28761a(C8818c.m28773a(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    private static C8825b m28761a(C8816a aVar, int i, int i2) {
        C8825b a = aVar.mo32559a();
        if (a != null) {
            int e = a.mo32603e();
            int c = a.mo32601c();
            int max = Math.max(i, e);
            int max2 = Math.max(i2, c);
            int min = Math.min(max / e, max2 / c);
            int i3 = (max - (e * min)) / 2;
            int i4 = (max2 - (c * min)) / 2;
            C8825b bVar = new C8825b(max, max2);
            int i5 = 0;
            while (i5 < c) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < e) {
                    if (a.mo32598a(i7, i5)) {
                        bVar.mo32597a(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
