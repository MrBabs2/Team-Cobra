package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.j */
/* compiled from: utfEncoding.kt */
public final class C9929j {
    /* renamed from: a */
    public static final byte[] m33167a(String[] strArr) {
        int i;
        C10202j.m34178b(strArr, "strings");
        boolean z = false;
        int i2 = 0;
        for (String length : strArr) {
            i2 += length.length();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (String str : strArr) {
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    bArr[i3] = (byte) str.charAt(i4);
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
                i3 = i;
            }
        }
        if (i3 == i2) {
            z = true;
        }
        if (!C10485x.f28360a || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
