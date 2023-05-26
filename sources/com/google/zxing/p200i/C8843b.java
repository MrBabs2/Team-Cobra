package com.google.zxing.p200i;

/* renamed from: com.google.zxing.i.b */
/* compiled from: CodaBarWriter */
public final class C8843b extends C8856n {

    /* renamed from: a */
    private static final char[] f25122a;

    /* renamed from: b */
    private static final char[] f25123b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f25124c = {'/', ':', '+', '.'};

    /* renamed from: d */
    private static final char f25125d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f25122a = cArr;
        f25125d = cArr[0];
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int i;
        if (str.length() < 2) {
            str = f25125d + str + f25125d;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a = C8842a.m28910a(f25122a, upperCase);
            boolean a2 = C8842a.m28910a(f25122a, upperCase2);
            boolean a3 = C8842a.m28910a(f25123b, upperCase);
            boolean a4 = C8842a.m28910a(f25123b, upperCase2);
            if (a) {
                if (!a2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (a3) {
                if (!a4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (a2 || a4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
            } else {
                str = f25125d + str + f25125d;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (C8842a.m28910a(f25124c, str.charAt(i3))) {
                i2 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr = C8842a.f25120a;
                if (i6 >= cArr.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr[i6]) {
                    i = C8842a.f25121b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
