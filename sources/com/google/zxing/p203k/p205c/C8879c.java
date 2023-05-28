package com.google.zxing.p203k.p205c;

import com.google.zxing.C8808c;
import com.google.zxing.WriterException;
import com.google.zxing.common.reedsolomon.C8809a;
import com.google.zxing.common.reedsolomon.C8811c;
import com.google.zxing.p197g.C8824a;
import com.google.zxing.p197g.C8826c;
import com.google.zxing.p203k.p204b.C8872a;
import com.google.zxing.p203k.p204b.C8873b;
import com.google.zxing.p203k.p204b.C8874c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.k.c.c */
/* compiled from: Encoder */
public final class C8879c {

    /* renamed from: a */
    private static final int[] f25208a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: com.google.zxing.k.c.c$a */
    /* compiled from: Encoder */
    static /* synthetic */ class C8880a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.k.b.b[] r0 = com.google.zxing.p203k.p204b.C8873b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25209a = r0
                com.google.zxing.k.b.b r1 = com.google.zxing.p203k.p204b.C8873b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25209a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.k.b.b r1 = com.google.zxing.p203k.p204b.C8873b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25209a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.k.b.b r1 = com.google.zxing.p203k.p204b.C8873b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25209a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.k.b.b r1 = com.google.zxing.p203k.p204b.C8873b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p203k.p205c.C8879c.C8880a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m29013a(C8878b bVar) {
        return C8881d.m29032a(bVar) + C8881d.m29037b(bVar) + C8881d.m29038c(bVar) + C8881d.m29039d(bVar);
    }

    /* renamed from: b */
    static void m29031b(CharSequence charSequence, C8824a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo32584a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo32584a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo32584a(charAt, 4);
                }
            }
        }
    }

    /* renamed from: a */
    public static C8883f m29018a(String str, C8872a aVar, Map<C8808c, ?> map) throws WriterException {
        C8874c cVar;
        C8826c a;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C8808c.CHARACTER_SET);
        String obj = z2 ? map.get(C8808c.CHARACTER_SET).toString() : "ISO-8859-1";
        C8873b a2 = m29015a(str, obj);
        C8824a aVar2 = new C8824a();
        if (a2 == C8873b.BYTE && z2 && (a = C8826c.m28819a(obj)) != null) {
            m29022a(a, aVar2);
        }
        if (map == null || !map.containsKey(C8808c.GS1_FORMAT)) {
            z = false;
        }
        if (z && Boolean.valueOf(map.get(C8808c.GS1_FORMAT).toString()).booleanValue()) {
            m29023a(C8873b.FNC1_FIRST_POSITION, aVar2);
        }
        m29023a(a2, aVar2);
        C8824a aVar3 = new C8824a();
        m29027a(str, a2, aVar3, obj);
        if (map == null || !map.containsKey(C8808c.QR_VERSION)) {
            cVar = m29017a(aVar, a2, aVar2, aVar3);
        } else {
            cVar = C8874c.m28989a(Integer.parseInt(map.get(C8808c.QR_VERSION).toString()));
            if (!m29028a(m29012a(a2, aVar2, aVar3, cVar), cVar, aVar)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        C8824a aVar4 = new C8824a();
        aVar4.mo32586a(aVar2);
        m29021a(a2 == C8873b.BYTE ? aVar3.mo32591c() : str.length(), cVar, a2, aVar4);
        aVar4.mo32586a(aVar3);
        C8874c.C8876b a3 = cVar.mo32666a(aVar);
        int b = cVar.mo32667b() - a3.mo32675d();
        m29020a(b, aVar4);
        C8824a a4 = m29014a(aVar4, cVar.mo32667b(), b, a3.mo32674c());
        C8883f fVar = new C8883f();
        fVar.mo32688a(aVar);
        fVar.mo32689a(a2);
        fVar.mo32690a(cVar);
        int a5 = cVar.mo32665a();
        C8878b bVar = new C8878b(a5, a5);
        int a6 = m29011a(a4, aVar, cVar, bVar);
        fVar.mo32687a(a6);
        C8882e.m29044a(a4, aVar, cVar, a6, bVar);
        fVar.mo32691a(bVar);
        return fVar;
    }

    /* renamed from: a */
    private static C8874c m29017a(C8872a aVar, C8873b bVar, C8824a aVar2, C8824a aVar3) throws WriterException {
        return m29016a(m29012a(bVar, aVar2, aVar3, m29016a(m29012a(bVar, aVar2, aVar3, C8874c.m28989a(1)), aVar)), aVar);
    }

    /* renamed from: a */
    private static int m29012a(C8873b bVar, C8824a aVar, C8824a aVar2, C8874c cVar) {
        return aVar.mo32589b() + bVar.mo32664a(cVar) + aVar2.mo32589b();
    }

    /* renamed from: a */
    static int m29010a(int i) {
        int[] iArr = f25208a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: a */
    private static C8873b m29015a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m29029a(str)) {
            return C8873b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m29010a((int) charAt) == -1) {
                return C8873b.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return C8873b.ALPHANUMERIC;
        }
        if (z2) {
            return C8873b.NUMERIC;
        }
        return C8873b.BYTE;
    }

    /* renamed from: a */
    private static boolean m29029a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static int m29011a(C8824a aVar, C8872a aVar2, C8874c cVar, C8878b bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C8882e.m29044a(aVar, aVar2, cVar, i3, bVar);
            int a = m29013a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static C8874c m29016a(int i, C8872a aVar) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C8874c a = C8874c.m28989a(i2);
            if (m29028a(i, a, aVar)) {
                return a;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: a */
    private static boolean m29028a(int i, C8874c cVar, C8872a aVar) {
        return cVar.mo32667b() - cVar.mo32666a(aVar).mo32675d() >= (i + 7) / 8;
    }

    /* renamed from: a */
    static void m29020a(int i, C8824a aVar) throws WriterException {
        int i2 = i << 3;
        if (aVar.mo32589b() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo32589b() < i2; i3++) {
                aVar.mo32587a(false);
            }
            int b = aVar.mo32589b() & 7;
            if (b > 0) {
                while (b < 8) {
                    aVar.mo32587a(false);
                    b++;
                }
            }
            int c = i - aVar.mo32591c();
            for (int i4 = 0; i4 < c; i4++) {
                aVar.mo32584a((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo32589b() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.mo32589b() + " > " + i2);
    }

    /* renamed from: a */
    static void m29019a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: a */
    static C8824a m29014a(C8824a aVar, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo32591c() == i5) {
            ArrayList<C8877a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m29019a(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo32585a(i7 << 3, bArr, 0, i11);
                byte[] a = m29030a(bArr, iArr2[0]);
                arrayList.add(new C8877a(bArr, a));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, a.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C8824a aVar2 = new C8824a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C8877a a2 : arrayList) {
                        byte[] a3 = a2.mo32676a();
                        if (i12 < a3.length) {
                            aVar2.mo32584a(a3[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C8877a b : arrayList) {
                        byte[] b2 = b.mo32677b();
                        if (i13 < b2.length) {
                            aVar2.mo32584a(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo32591c()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i4 + " and " + aVar2.mo32591c() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: a */
    static byte[] m29030a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C8811c(C8809a.f25021k).mo32557a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: a */
    static void m29023a(C8873b bVar, C8824a aVar) {
        aVar.mo32584a(bVar.mo32663a(), 4);
    }

    /* renamed from: a */
    static void m29021a(int i, C8874c cVar, C8873b bVar, C8824a aVar) throws WriterException {
        int a = bVar.mo32664a(cVar);
        int i2 = 1 << a;
        if (i < i2) {
            aVar.mo32584a(i, a);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: a */
    static void m29027a(String str, C8873b bVar, C8824a aVar, String str2) throws WriterException {
        int i = C8880a.f25209a[bVar.ordinal()];
        if (i == 1) {
            m29031b(str, aVar);
        } else if (i == 2) {
            m29024a((CharSequence) str, aVar);
        } else if (i == 3) {
            m29026a(str, aVar, str2);
        } else if (i == 4) {
            m29025a(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    /* renamed from: a */
    static void m29024a(CharSequence charSequence, C8824a aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = m29010a((int) charSequence.charAt(i));
            if (a != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a2 = m29010a((int) charSequence.charAt(i2));
                    if (a2 != -1) {
                        aVar.mo32584a((a * 45) + a2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo32584a(a, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: a */
    static void m29026a(String str, C8824a aVar, String str2) throws WriterException {
        try {
            for (byte a : str.getBytes(str2)) {
                aVar.mo32584a(a, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m29025a(java.lang.String r6, com.google.zxing.p197g.C8824a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo32584a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p203k.p205c.C8879c.m29025a(java.lang.String, com.google.zxing.g.a):void");
    }

    /* renamed from: a */
    private static void m29022a(C8826c cVar, C8824a aVar) {
        aVar.mo32584a(C8873b.ECI.mo32663a(), 4);
        aVar.mo32584a(cVar.mo32607a(), 8);
    }
}
