package com.google.zxing.p198h.p199b;

import com.google.zxing.C8807b;
import java.util.Arrays;

/* renamed from: com.google.zxing.h.b.j */
/* compiled from: HighLevelEncoder */
public final class C8837j {
    /* renamed from: a */
    private static char m28877a(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* renamed from: b */
    static boolean m28884b(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: c */
    static boolean m28885c(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: d */
    private static boolean m28886d(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m28887e(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: f */
    private static boolean m28888f(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m28889g(char c) {
        if (m28891i(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m28890h(char c) {
        return false;
    }

    /* renamed from: i */
    private static boolean m28891i(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: a */
    public static String m28882a(String str, C8839l lVar, C8807b bVar, C8807b bVar2) {
        int i = 0;
        C8834g[] gVarArr = {new C8828a(), new C8830c(), new C8840m(), new C8841n(), new C8833f(), new C8829b()};
        C8835h hVar = new C8835h(str);
        hVar.mo32623a(lVar);
        hVar.mo32622a(bVar, bVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.mo32620a(236);
            hVar.mo32621a(2);
            hVar.f25099f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.mo32620a(237);
            hVar.mo32621a(2);
            hVar.f25099f += 7;
        }
        while (hVar.mo32633h()) {
            gVarArr[i].mo32609a(hVar);
            if (hVar.mo32630e() >= 0) {
                i = hVar.mo32630e();
                hVar.mo32634i();
            }
        }
        int a = hVar.mo32619a();
        hVar.mo32636k();
        int a2 = hVar.mo32632g().mo32637a();
        if (!(a >= a2 || i == 0 || i == 5 || i == 4)) {
            hVar.mo32620a(254);
        }
        StringBuilder b = hVar.mo32625b();
        if (b.length() < a2) {
            b.append(129);
        }
        while (b.length() < a2) {
            b.append(m28877a(129, b.length() + 1));
        }
        return hVar.mo32625b().toString();
    }

    /* renamed from: a */
    static int m28879a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = m28881a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = m28880a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 != 1 || bArr[2] <= 0) {
                    return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m28884b(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m28885c(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m28886d(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m28885c(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m28888f(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m28885c(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m28889g(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m28885c(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m28887e(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m28885c(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m28890h(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m28881a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = m28880a(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (a3 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (a3 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (a3 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i6 = i3 + i4 + 1;
                        while (i6 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i6);
                            if (!m28891i(charAt2)) {
                                if (!m28889g(charAt2)) {
                                    break;
                                }
                                i6++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static int m28881a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: a */
    private static int m28880a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: a */
    public static int m28878a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m28884b(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    static void m28883a(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }
}
