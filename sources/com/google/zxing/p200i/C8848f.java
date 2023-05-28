package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.Map;

/* renamed from: com.google.zxing.i.f */
/* compiled from: Code39Writer */
public final class C8848f extends C8856n {
    /* renamed from: b */
    private static String m28917b(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb.append("%V");
                    } else if (charAt == '`') {
                        sb.append("%W");
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb.append('$');
                            sb.append((char) ((charAt - 1) + 65));
                        } else if (charAt < ' ') {
                            sb.append('%');
                            sb.append((char) ((charAt - 27) + 65));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            sb.append((char) ((charAt - '!') + 65));
                        } else if (charAt <= '9') {
                            sb.append((char) ((charAt - '0') + 48));
                        } else if (charAt <= '?') {
                            sb.append('%');
                            sb.append((char) ((charAt - ';') + 70));
                        } else if (charAt <= 'Z') {
                            sb.append((char) ((charAt - 'A') + 65));
                        } else if (charAt <= '_') {
                            sb.append('%');
                            sb.append((char) ((charAt - '[') + 75));
                        } else if (charAt <= 'z') {
                            sb.append('+');
                            sb.append((char) ((charAt - 'a') + 65));
                        } else if (charAt <= 127) {
                            sb.append('%');
                            sb.append((char) ((charAt - '{') + 80));
                        } else {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                        }
                    }
                }
                sb.append(charAt);
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (aVar == C8806a.CODE_39) {
            return super.mo32558a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    str = m28917b(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i2 = length + 25;
            for (int i3 = 0; i3 < length; i3++) {
                m28916a(C8847e.f25132a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            m28916a(148, iArr);
            int a = C8856n.m28931a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a2 = a + C8856n.m28931a(zArr, a, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                m28916a(C8847e.f25132a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
                int a3 = a2 + C8856n.m28931a(zArr, a2, iArr, true);
                a2 = a3 + C8856n.m28931a(zArr, a3, iArr2, false);
            }
            m28916a(148, iArr);
            C8856n.m28931a(zArr, a2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: a */
    private static void m28916a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
