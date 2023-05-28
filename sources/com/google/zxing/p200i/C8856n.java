package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.C8814e;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.Map;

/* renamed from: com.google.zxing.i.n */
/* compiled from: OneDimensionalCodeWriter */
public abstract class C8856n implements C8814e {
    /* renamed from: a */
    public int mo32646a() {
        return 10;
    }

    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int a = mo32646a();
            if (map != null && map.containsKey(C8808c.MARGIN)) {
                a = Integer.parseInt(map.get(C8808c.MARGIN).toString());
            }
            return m28932a(mo32645a(str), i, i2, a);
        }
    }

    /* renamed from: a */
    public abstract boolean[] mo32645a(String str);

    /* renamed from: a */
    private static C8825b m28932a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C8825b bVar = new C8825b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo32597a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    protected static int m28931a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
