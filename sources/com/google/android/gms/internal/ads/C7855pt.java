package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pt */
final class C7855pt {
    /* renamed from: a */
    private static long m17877a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: a */
    private static long m17878a(byte[] bArr, int i, int i2) {
        return (m17877a(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    private static void m17879a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    static byte[] m17880a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long a = m17878a(bArr3, 0, 0) & 67108863;
            int i = 2;
            long a2 = m17878a(bArr3, 3, 2) & 67108611;
            long a3 = m17878a(bArr3, 6, 4) & 67092735;
            long a4 = m17878a(bArr3, 9, 6) & 66076671;
            long a5 = m17878a(bArr3, 12, 8) & 1048575;
            long j = a2 * 5;
            long j2 = a3 * 5;
            long j3 = a4 * 5;
            long j4 = a5 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (i3 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i3);
                System.arraycopy(bArr4, i3, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, (byte) 0);
                }
                long a6 = j9 + m17878a(bArr5, 0, 0);
                long a7 = j5 + m17878a(bArr5, 3, i);
                long a8 = j6 + m17878a(bArr5, 6, 4);
                long a9 = j7 + m17878a(bArr5, 9, 6);
                long a10 = j8 + (m17878a(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (a6 * a) + (a7 * j4) + (a8 * j3) + (a9 * j2) + (a10 * j);
                long j11 = (a6 * a2) + (a7 * a) + (a8 * j4) + (a9 * j3) + (a10 * j2) + (j10 >> 26);
                long j12 = (a6 * a3) + (a7 * a2) + (a8 * a) + (a9 * j4) + (a10 * j3) + (j11 >> 26);
                long j13 = (a6 * a4) + (a7 * a3) + (a8 * a2) + (a9 * a) + (a10 * j4) + (j12 >> 26);
                long j14 = (a6 * a5) + (a7 * a4) + (a8 * a3) + (a9 * a2) + (a10 * a) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                i2 = 17;
                i = 2;
                j9 = j15 & 67108863;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = j29 & 67108863;
            long j31 = (j21 + (j29 >> 26)) - 67108864;
            long j32 = j31 >> 63;
            long j33 = j23 & j32;
            long j34 = j24 & j32;
            long j35 = j17 & j32;
            long j36 = j19 & j32;
            long j37 = j21 & j32;
            long j38 = j32 ^ -1;
            long j39 = (j27 & 67108863 & j38) | j34;
            long j40 = (j28 & 67108863 & j38) | j35;
            long j41 = (j30 & j38) | j36;
            long j42 = (j31 & j38) | j37;
            long a11 = (((j39 << 26) | j33 | (j26 & j38)) & 4294967295L) + m17877a(bArr3, 16);
            long a12 = (((j39 >> 6) | (j40 << 20)) & 4294967295L) + m17877a(bArr3, 20) + (a11 >> 32);
            long a13 = (((j40 >> 12) | (j41 << 14)) & 4294967295L) + m17877a(bArr3, 24) + (a12 >> 32);
            byte[] bArr6 = new byte[16];
            m17879a(bArr6, a11 & 4294967295L, 0);
            m17879a(bArr6, a12 & 4294967295L, 4);
            m17879a(bArr6, a13 & 4294967295L, 8);
            m17879a(bArr6, ((((j41 >> 18) | (j42 << 8)) & 4294967295L) + m17877a(bArr3, 28) + (a13 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
