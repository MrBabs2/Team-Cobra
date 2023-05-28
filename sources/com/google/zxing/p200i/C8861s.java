package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.Map;

/* renamed from: com.google.zxing.i.s */
/* compiled from: UPCEWriter */
public final class C8861s extends C8859q {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (aVar == C8806a.UPC_E) {
            return super.mo32558a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + C8858p.m28938b(C8860r.m28940a(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = C8860r.f25144f[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int a = C8856n.m28931a(zArr, 0, C8858p.f25139a, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                a += C8856n.m28931a(zArr, a, C8858p.f25143e[digit2], false);
            }
            C8856n.m28931a(zArr, a, C8858p.f25141c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
