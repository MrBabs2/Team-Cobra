package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.Map;

/* renamed from: com.google.zxing.i.k */
/* compiled from: EAN8Writer */
public final class C8853k extends C8859q {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (aVar == C8806a.EAN_8) {
            return super.mo32558a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + C8858p.m28938b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C8858p.m28937a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int a = C8856n.m28931a(zArr, 0, C8858p.f25139a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            a += C8856n.m28931a(zArr, a, C8858p.f25142d[Character.digit(str.charAt(i), 10)], false);
        }
        int a2 = a + C8856n.m28931a(zArr, a, C8858p.f25140b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            a2 += C8856n.m28931a(zArr, a2, C8858p.f25142d[Character.digit(str.charAt(i2), 10)], true);
        }
        C8856n.m28931a(zArr, a2, C8858p.f25139a, true);
        return zArr;
    }
}
