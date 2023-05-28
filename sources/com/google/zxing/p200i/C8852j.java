package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.Map;

/* renamed from: com.google.zxing.i.j */
/* compiled from: EAN13Writer */
public final class C8852j extends C8859q {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (aVar == C8806a.EAN_13) {
            return super.mo32558a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + C8858p.m28938b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!C8858p.m28937a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = C8851i.f25134f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = C8856n.m28931a(zArr, 0, C8858p.f25139a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a += C8856n.m28931a(zArr, a, C8858p.f25143e[digit], false);
        }
        int a2 = a + C8856n.m28931a(zArr, a, C8858p.f25140b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            a2 += C8856n.m28931a(zArr, a2, C8858p.f25142d[Character.digit(str.charAt(i3), 10)], true);
        }
        C8856n.m28931a(zArr, a2, C8858p.f25139a, true);
        return zArr;
    }
}
