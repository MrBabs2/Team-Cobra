package com.google.zxing.p195f.p196b;

import com.google.zxing.common.reedsolomon.C8809a;
import com.google.zxing.common.reedsolomon.C8811c;
import com.google.zxing.p197g.C8824a;
import com.google.zxing.p197g.C8825b;

/* renamed from: com.google.zxing.f.b.c */
/* compiled from: Encoder */
public final class C8818c {

    /* renamed from: a */
    private static final int[] f25037a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int m28771a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: a */
    public static C8816a m28773a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C8824a aVar;
        int i6;
        C8824a a = new C8819d(bArr).mo32567a();
        int i7 = 11;
        int b = ((a.mo32589b() * i) / 100) + 11;
        int b2 = a.mo32589b() + b;
        int i8 = 32;
        int i9 = 0;
        int i10 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i4 <= i8) {
                i5 = m28771a(i4, z);
                i3 = f25037a[i4];
                int i11 = i5 - (i5 % i3);
                aVar = m28774a(a, i3);
                if (aVar.mo32589b() + b > i11) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.mo32589b() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C8824a aVar2 = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 32) {
                boolean z2 = i12 <= 3;
                int i14 = z2 ? i12 + 1 : i12;
                int a2 = m28771a(i14, z2);
                if (b2 <= a2) {
                    if (aVar2 == null || i13 != f25037a[i14]) {
                        int i15 = f25037a[i14];
                        i13 = i15;
                        aVar2 = m28774a(a, i15);
                    }
                    int i16 = a2 - (a2 % i13);
                    if ((!z2 || aVar2.mo32589b() <= (i13 << 6)) && aVar2.mo32589b() + b <= i16) {
                        aVar = aVar2;
                        i3 = i13;
                        z = z2;
                        i4 = i14;
                        i5 = a2;
                    }
                }
                i12++;
                i9 = 0;
                i10 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C8824a b3 = m28779b(aVar, i5, i3);
        int b4 = aVar.mo32589b() / i3;
        C8824a a3 = m28775a(z, i4, b4);
        if (!z) {
            i7 = 14;
        }
        int i17 = i7 + (i4 << 2);
        int[] iArr = new int[i17];
        int i18 = 2;
        if (z) {
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[i19] = i19;
            }
            i6 = i17;
        } else {
            int i20 = i17 / 2;
            i6 = i17 + 1 + (((i20 - 1) / 15) * 2);
            int i21 = i6 / 2;
            for (int i22 = 0; i22 < i20; i22++) {
                int i23 = (i22 / 15) + i22;
                iArr[(i20 - i22) - i10] = (i21 - i23) - 1;
                iArr[i20 + i22] = i23 + i21 + i10;
            }
        }
        C8825b bVar = new C8825b(i6);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i4) {
            int i26 = ((i4 - i24) << i18) + (z ? 9 : 12);
            int i27 = 0;
            while (i27 < i26) {
                int i28 = i27 << 1;
                while (i9 < i18) {
                    if (b3.mo32588a(i25 + i28 + i9)) {
                        int i29 = i24 << 1;
                        bVar.mo32600b(iArr[i29 + i9], iArr[i29 + i27]);
                    }
                    if (b3.mo32588a((i26 << 1) + i25 + i28 + i9)) {
                        int i30 = i24 << 1;
                        bVar.mo32600b(iArr[i30 + i27], iArr[((i17 - 1) - i30) - i9]);
                    }
                    if (b3.mo32588a((i26 << 2) + i25 + i28 + i9)) {
                        int i31 = (i17 - 1) - (i24 << 1);
                        bVar.mo32600b(iArr[i31 - i9], iArr[i31 - i27]);
                    }
                    if (b3.mo32588a((i26 * 6) + i25 + i28 + i9)) {
                        int i32 = i24 << 1;
                        bVar.mo32600b(iArr[((i17 - 1) - i32) - i27], iArr[i32 + i9]);
                    }
                    i9++;
                    i18 = 2;
                }
                i27++;
                i9 = 0;
                i18 = 2;
            }
            i25 += i26 << 3;
            i24++;
            i9 = 0;
            i18 = 2;
        }
        m28777a(bVar, z, i6, a3);
        if (z) {
            m28776a(bVar, i6 / 2, 5);
        } else {
            int i33 = i6 / 2;
            m28776a(bVar, i33, 7);
            int i34 = 0;
            int i35 = 0;
            while (i35 < (i17 / 2) - 1) {
                for (int i36 = i33 & 1; i36 < i6; i36 += 2) {
                    int i37 = i33 - i34;
                    bVar.mo32600b(i37, i36);
                    int i38 = i33 + i34;
                    bVar.mo32600b(i38, i36);
                    bVar.mo32600b(i36, i37);
                    bVar.mo32600b(i36, i38);
                }
                i35 += 15;
                i34 += 16;
            }
        }
        C8816a aVar3 = new C8816a();
        aVar3.mo32562a(z);
        aVar3.mo32564c(i6);
        aVar3.mo32563b(i4);
        aVar3.mo32560a(b4);
        aVar3.mo32561a(bVar);
        return aVar3;
    }

    /* renamed from: b */
    private static C8824a m28779b(C8824a aVar, int i, int i2) {
        C8811c cVar = new C8811c(m28772a(i2));
        int i3 = i / i2;
        int[] a = m28778a(aVar, i2, i3);
        cVar.mo32557a(a, i3 - (aVar.mo32589b() / i2));
        C8824a aVar2 = new C8824a();
        aVar2.mo32584a(0, i % i2);
        for (int a2 : a) {
            aVar2.mo32584a(a2, i2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static void m28776a(C8825b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo32600b(i5, i4);
                bVar.mo32600b(i5, i6);
                bVar.mo32600b(i4, i5);
                bVar.mo32600b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo32600b(i7, i7);
        int i8 = i7 + 1;
        bVar.mo32600b(i8, i7);
        bVar.mo32600b(i7, i8);
        int i9 = i + i2;
        bVar.mo32600b(i9, i7);
        bVar.mo32600b(i9, i8);
        bVar.mo32600b(i9, i9 - 1);
    }

    /* renamed from: a */
    static C8824a m28775a(boolean z, int i, int i2) {
        C8824a aVar = new C8824a();
        if (z) {
            aVar.mo32584a(i - 1, 2);
            aVar.mo32584a(i2 - 1, 6);
            return m28779b(aVar, 28, 4);
        }
        aVar.mo32584a(i - 1, 5);
        aVar.mo32584a(i2 - 1, 11);
        return m28779b(aVar, 40, 4);
    }

    /* renamed from: a */
    private static void m28777a(C8825b bVar, boolean z, int i, C8824a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo32588a(i3)) {
                    bVar.mo32600b(i4, i2 - 5);
                }
                if (aVar.mo32588a(i3 + 7)) {
                    bVar.mo32600b(i2 + 5, i4);
                }
                if (aVar.mo32588a(20 - i3)) {
                    bVar.mo32600b(i4, i2 + 5);
                }
                if (aVar.mo32588a(27 - i3)) {
                    bVar.mo32600b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo32588a(i3)) {
                bVar.mo32600b(i5, i2 - 7);
            }
            if (aVar.mo32588a(i3 + 10)) {
                bVar.mo32600b(i2 + 7, i5);
            }
            if (aVar.mo32588a(29 - i3)) {
                bVar.mo32600b(i5, i2 + 7);
            }
            if (aVar.mo32588a(39 - i3)) {
                bVar.mo32600b(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: a */
    private static int[] m28778a(C8824a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int b = aVar.mo32589b() / i;
        for (int i3 = 0; i3 < b; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.mo32588a((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: a */
    private static C8809a m28772a(int i) {
        if (i == 4) {
            return C8809a.f25020j;
        }
        if (i == 6) {
            return C8809a.f25019i;
        }
        if (i == 8) {
            return C8809a.f25022l;
        }
        if (i == 10) {
            return C8809a.f25018h;
        }
        if (i == 12) {
            return C8809a.f25017g;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    static C8824a m28774a(C8824a aVar, int i) {
        C8824a aVar2 = new C8824a();
        int b = aVar.mo32589b();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < b) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= b || aVar.mo32588a(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.mo32584a(i7, i);
            } else if (i7 == 0) {
                aVar2.mo32584a(i4 | 1, i);
            } else {
                aVar2.mo32584a(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }
}
