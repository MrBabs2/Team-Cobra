package com.google.zxing.p203k.p205c;

/* renamed from: com.google.zxing.k.c.d */
/* compiled from: MaskUtil */
final class C8881d {
    /* renamed from: a */
    static int m29032a(C8878b bVar) {
        return m29033a(bVar, true) + m29033a(bVar, false);
    }

    /* renamed from: b */
    static int m29037b(C8878b bVar) {
        byte[][] a = bVar.mo32682a();
        int c = bVar.mo32684c();
        int b = bVar.mo32683b();
        int i = 0;
        for (int i2 = 0; i2 < b - 1; i2++) {
            byte[] bArr = a[i2];
            int i3 = 0;
            while (i3 < c - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b2 == a[i5][i3] && b2 == a[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: c */
    static int m29038c(C8878b bVar) {
        byte[][] a = bVar.mo32682a();
        int c = bVar.mo32684c();
        int b = bVar.mo32683b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            for (int i3 = 0; i3 < c; i3++) {
                byte[] bArr = a[i2];
                int i4 = i3 + 6;
                if (i4 < c && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m29035a(bArr, i3 - 4, i3) || m29035a(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < b && a[i2][i3] == 1 && a[i2 + 1][i3] == 0 && a[i2 + 2][i3] == 1 && a[i2 + 3][i3] == 1 && a[i2 + 4][i3] == 1 && a[i2 + 5][i3] == 0 && a[i5][i3] == 1 && (m29036a(a, i3, i2 - 4, i2) || m29036a(a, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: d */
    static int m29039d(C8878b bVar) {
        byte[][] a = bVar.mo32682a();
        int c = bVar.mo32684c();
        int b = bVar.mo32683b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            byte[] bArr = a[i2];
            for (int i3 = 0; i3 < c; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int b2 = bVar.mo32683b() * bVar.mo32684c();
        return ((Math.abs((i << 1) - b2) * 10) / b2) * 10;
    }

    /* renamed from: a */
    private static boolean m29035a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m29036a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r1 != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r1 & 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m29034a(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x003b;
                case 2: goto L_0x0037;
                case 3: goto L_0x0033;
                case 4: goto L_0x002e;
                case 5: goto L_0x0026;
                case 6: goto L_0x001d;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0024
        L_0x001d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0024:
            r1 = r1 & r0
            goto L_0x003d
        L_0x0026:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003d
        L_0x002e:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x003a
        L_0x0033:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003d
        L_0x0037:
            int r1 = r2 % 3
            goto L_0x003d
        L_0x003a:
            int r3 = r3 + r2
        L_0x003b:
            r1 = r3 & 1
        L_0x003d:
            if (r1 != 0) goto L_0x0040
            return r0
        L_0x0040:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p203k.p205c.C8881d.m29034a(int, int, int):boolean");
    }

    /* renamed from: a */
    private static int m29033a(C8878b bVar, boolean z) {
        int b = z ? bVar.mo32683b() : bVar.mo32684c();
        int c = z ? bVar.mo32684c() : bVar.mo32683b();
        byte[][] a = bVar.mo32682a();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < c; i4++) {
                byte b3 = z ? a[i2][i4] : a[i4][i2];
                if (b3 == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b2 = b3;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }
}
