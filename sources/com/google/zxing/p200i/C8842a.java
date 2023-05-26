package com.google.zxing.p200i;

/* renamed from: com.google.zxing.i.a */
/* compiled from: CodaBarReader */
public final class C8842a extends C8855m {

    /* renamed from: a */
    static final char[] f25120a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f25121b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: a */
    static boolean m28910a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
