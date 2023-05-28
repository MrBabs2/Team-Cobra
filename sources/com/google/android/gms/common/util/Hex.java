package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public class Hex {

    /* renamed from: a */
    private static final char[] f14269a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @KeepForSdk
    /* renamed from: a */
    public static String m16275a(byte[] bArr) {
        return m16276a(bArr, false);
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m16276a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            sb.append(f14269a[(bArr[i] & 240) >>> 4]);
            sb.append(f14269a[bArr[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
