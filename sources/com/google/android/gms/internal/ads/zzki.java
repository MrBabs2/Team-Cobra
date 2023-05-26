package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzki {

    /* renamed from: a */
    private static final byte[] f22145a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f22146b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: a */
    public static Pair<Integer, Integer> m24660a(byte[] bArr) {
        boolean z = false;
        int i = (bArr[0] >> 3) & 31;
        int i2 = (i == 5 || i == 29) ? 1 : 0;
        int i3 = i2 + 1;
        int i4 = ((bArr[i2] & 7) << 1) | ((bArr[i3] >> 7) & 1);
        if (i4 < 13) {
            z = true;
        }
        zzkh.m24659b(z);
        return Pair.create(Integer.valueOf(f22146b[i4]), Integer.valueOf((bArr[i3] >> 3) & 15));
    }

    /* renamed from: a */
    public static byte[] m24661a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f22145a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f22145a.length, i2);
        return bArr3;
    }
}
