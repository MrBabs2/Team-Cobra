package com.google.zxing.p203k.p205c;

import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8824a;
import com.google.zxing.p203k.p204b.C8872a;
import com.google.zxing.p203k.p204b.C8874c;
import okhttp3.internal.p398ws.WebSocketProtocol;

/* renamed from: com.google.zxing.k.c.e */
/* compiled from: MatrixUtil */
final class C8882e {

    /* renamed from: a */
    private static final int[][] f25210a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f25211b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f25212c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f25213d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m29049a(C8878b bVar) {
        bVar.mo32679a((byte) -1);
    }

    /* renamed from: b */
    private static void m29052b(C8878b bVar) throws WriterException {
        if (bVar.mo32678a(8, bVar.mo32683b() - 8) != 0) {
            bVar.mo32680a(8, bVar.mo32683b() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: b */
    private static boolean m29053b(int i) {
        return i == -1;
    }

    /* renamed from: c */
    static void m29055c(C8874c cVar, C8878b bVar) throws WriterException {
        if (cVar.mo32668c() >= 7) {
            C8824a aVar = new C8824a();
            m29047a(cVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean a = aVar.mo32588a(i);
                    i--;
                    bVar.mo32681a(i2, (bVar.mo32683b() - 11) + i3, a);
                    bVar.mo32681a((bVar.mo32683b() - 11) + i3, i2, a);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m29058d(C8878b bVar) {
        int i = 8;
        while (i < bVar.mo32684c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m29053b((int) bVar.mo32678a(i, 6))) {
                bVar.mo32680a(i, 6, i3);
            }
            if (m29053b((int) bVar.mo32678a(6, i))) {
                bVar.mo32680a(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    static void m29044a(C8824a aVar, C8872a aVar2, C8874c cVar, int i, C8878b bVar) throws WriterException {
        m29049a(bVar);
        m29048a(cVar, bVar);
        m29046a(aVar2, i, bVar);
        m29055c(cVar, bVar);
        m29043a(aVar, i, bVar);
    }

    /* renamed from: b */
    private static void m29050b(int i, int i2, C8878b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f25211b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo32680a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: b */
    private static void m29051b(C8874c cVar, C8878b bVar) {
        if (cVar.mo32668c() >= 2) {
            int[] iArr = f25212c[cVar.mo32668c() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m29053b((int) bVar.mo32678a(i2, i))) {
                            m29050b(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m29048a(C8874c cVar, C8878b bVar) throws WriterException {
        m29056c(bVar);
        m29052b(bVar);
        m29051b(cVar, bVar);
        m29058d(bVar);
    }

    /* renamed from: c */
    private static void m29054c(int i, int i2, C8878b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f25210a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo32680a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m29057d(int i, int i2, C8878b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m29053b((int) bVar.mo32678a(i, i4))) {
                bVar.mo32680a(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    private static void m29056c(C8878b bVar) throws WriterException {
        int length = f25210a[0].length;
        m29054c(0, 0, bVar);
        m29054c(bVar.mo32684c() - length, 0, bVar);
        m29054c(0, bVar.mo32684c() - length, bVar);
        m29042a(0, 7, bVar);
        m29042a(bVar.mo32684c() - 8, 7, bVar);
        m29042a(0, bVar.mo32684c() - 8, bVar);
        m29057d(7, 0, bVar);
        m29057d((bVar.mo32683b() - 7) - 1, 0, bVar);
        m29057d(7, bVar.mo32683b() - 7, bVar);
    }

    /* renamed from: a */
    static void m29046a(C8872a aVar, int i, C8878b bVar) throws WriterException {
        C8824a aVar2 = new C8824a();
        m29045a(aVar, i, aVar2);
        for (int i2 = 0; i2 < aVar2.mo32589b(); i2++) {
            boolean a = aVar2.mo32588a((aVar2.mo32589b() - 1) - i2);
            int[] iArr = f25213d[i2];
            bVar.mo32681a(iArr[0], iArr[1], a);
            if (i2 < 8) {
                bVar.mo32681a((bVar.mo32684c() - i2) - 1, 8, a);
            } else {
                bVar.mo32681a(8, (bVar.mo32683b() - 7) + (i2 - 8), a);
            }
        }
    }

    /* renamed from: a */
    static void m29043a(C8824a aVar, int i, C8878b bVar) throws WriterException {
        boolean z;
        int c = bVar.mo32684c() - 1;
        int b = bVar.mo32683b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (c > 0) {
            if (c == 6) {
                c--;
            }
            while (b >= 0 && b < bVar.mo32683b()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = c - i4;
                    if (m29053b((int) bVar.mo32678a(i5, b))) {
                        if (i2 < aVar.mo32589b()) {
                            z = aVar.mo32588a(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C8881d.m29034a(i, i5, b)) {
                            z = !z;
                        }
                        bVar.mo32681a(i5, b, z);
                    }
                }
                b += i3;
            }
            i3 = -i3;
            b += i3;
            c -= 2;
        }
        if (i2 != aVar.mo32589b()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + aVar.mo32589b());
        }
    }

    /* renamed from: a */
    static int m29040a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    static int m29041a(int i, int i2) {
        if (i2 != 0) {
            int a = m29040a(i2);
            int i3 = i << (a - 1);
            while (m29040a(i3) >= a) {
                i3 ^= i2 << (m29040a(i3) - a);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: a */
    static void m29045a(C8872a aVar, int i, C8824a aVar2) throws WriterException {
        if (C8883f.m29059b(i)) {
            int a = (aVar.mo32662a() << 3) | i;
            aVar2.mo32584a(a, 5);
            aVar2.mo32584a(m29041a(a, 1335), 10);
            C8824a aVar3 = new C8824a();
            aVar3.mo32584a(21522, 15);
            aVar2.mo32590b(aVar3);
            if (aVar2.mo32589b() != 15) {
                throw new WriterException("should not happen but we got: " + aVar2.mo32589b());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m29047a(C8874c cVar, C8824a aVar) throws WriterException {
        aVar.mo32584a(cVar.mo32668c(), 6);
        aVar.mo32584a(m29041a(cVar.mo32668c(), 7973), 12);
        if (aVar.mo32589b() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.mo32589b());
        }
    }

    /* renamed from: a */
    private static void m29042a(int i, int i2, C8878b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m29053b((int) bVar.mo32678a(i4, i2))) {
                bVar.mo32680a(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }
}
