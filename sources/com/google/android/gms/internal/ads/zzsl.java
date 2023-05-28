package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzsl {

    /* renamed from: a */
    private static final byte[] f22645a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f22646b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f22647c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m25221a(byte[] bArr) {
        zzss zzss = new zzss(bArr);
        int a = m25220a(zzss);
        int b = m25223b(zzss);
        int a2 = zzss.mo29721a(4);
        if (a == 5 || a == 29) {
            b = m25223b(zzss);
            if (m25220a(zzss) == 22) {
                a2 = zzss.mo29721a(4);
            }
        }
        int i = f22647c[a2];
        zzsk.m25216a(i != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: b */
    private static int m25223b(zzss zzss) {
        int a = zzss.mo29721a(4);
        if (a == 15) {
            return zzss.mo29721a(24);
        }
        zzsk.m25216a(a < 13);
        return f22646b[a];
    }

    /* renamed from: a */
    public static byte[] m25222a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f22645a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f22645a.length, i2);
        return bArr3;
    }

    /* renamed from: a */
    private static int m25220a(zzss zzss) {
        int a = zzss.mo29721a(5);
        return a == 31 ? zzss.mo29721a(6) + 32 : a;
    }
}
