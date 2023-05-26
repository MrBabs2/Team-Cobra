package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a3 */
final class C8259a3 {

    /* renamed from: a */
    private static final C8264b3 f23207a;

    static {
        C8264b3 b3Var;
        if (!(C8367y2.m26306b() && C8367y2.m26310c()) || C8281f0.m25931a()) {
            b3Var = new C8269c3();
        } else {
            b3Var = new C8279e3();
        }
        f23207a = b3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m25876a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m25877a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m25878a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m25881a(byte[] bArr) {
        return f23207a.mo30068a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m25886b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m25876a((int) b);
        }
        if (i3 == 1) {
            return m25877a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m25878a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static boolean m25882a(byte[] bArr, int i, int i2) {
        return f23207a.mo30068a(bArr, i, i2);
    }

    /* renamed from: a */
    static int m25879a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C8274d3(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m25880a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f23207a.mo30067a(charSequence, bArr, i, i2);
    }
}
