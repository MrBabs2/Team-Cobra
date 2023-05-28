package com.google.zxing.p200i;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.i.d */
/* compiled from: Code128Writer */
public final class C8845d extends C8856n {

    /* renamed from: com.google.zxing.i.d$a */
    /* compiled from: Code128Writer */
    private enum C8846a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        if (aVar == C8806a.CODE_128) {
            return super.mo32558a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo32645a(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int a = m28912a(str, i3, i5);
                int i8 = 100;
                if (a == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = a;
                    } else if (a == 100) {
                        i7 = 104;
                    } else if (a != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = a;
                }
                arrayList.add(C8844c.f25126a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(C8844c.f25126a[i4 % 103]);
                arrayList.add(C8844c.f25126a[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : (int[]) r13.next()) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] a2 : arrayList) {
                    i += C8856n.m28931a(zArr, i, a2, true);
                }
                return zArr;
            }
        }
    }

    /* renamed from: a */
    private static C8846a m28913a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C8846a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C8846a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C8846a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C8846a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return C8846a.ONE_DIGIT;
        }
        return C8846a.TWO_DIGITS;
    }

    /* renamed from: a */
    private static int m28912a(CharSequence charSequence, int i, int i2) {
        C8846a a;
        C8846a a2;
        char charAt;
        C8846a a3 = m28913a(charSequence, i);
        if (a3 == C8846a.ONE_DIGIT) {
            return 100;
        }
        if (a3 == C8846a.UNCODABLE) {
            if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 != 100) {
                if (a3 == C8846a.FNC_1) {
                    a3 = m28913a(charSequence, i + 1);
                }
                if (a3 == C8846a.TWO_DIGITS) {
                    return 99;
                }
                return 100;
            } else if (a3 == C8846a.FNC_1 || (a = m28913a(charSequence, i + 2)) == C8846a.UNCODABLE || a == C8846a.ONE_DIGIT) {
                return 100;
            } else {
                if (a != C8846a.FNC_1) {
                    int i3 = i + 4;
                    while (true) {
                        a2 = m28913a(charSequence, i3);
                        if (a2 != C8846a.TWO_DIGITS) {
                            break;
                        }
                        i3 += 2;
                    }
                    if (a2 == C8846a.ONE_DIGIT) {
                        return 100;
                    }
                    return 99;
                } else if (m28913a(charSequence, i + 3) == C8846a.TWO_DIGITS) {
                    return 99;
                } else {
                    return 100;
                }
            }
        }
    }
}
