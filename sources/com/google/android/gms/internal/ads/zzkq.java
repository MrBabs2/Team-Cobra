package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class zzkq {

    /* renamed from: a */
    public static final int f22154a = Build.VERSION.SDK_INT;

    static {
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    /* renamed from: a */
    public static boolean m24690a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m24692b(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        return binarySearch < 0 ? binarySearch ^ -1 : binarySearch;
    }

    /* renamed from: a */
    public static ExecutorService m24688a(String str) {
        return Executors.newSingleThreadExecutor(new o00(str));
    }

    /* renamed from: b */
    public static int m24691b(String str) {
        int length = str.length();
        zzkh.m24657a(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: a */
    public static int m24685a(int i, int i2) {
        return ((i2 + 0) - 1) / i2;
    }

    /* renamed from: a */
    public static int m24686a(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        return z2 ? Math.max(0, binarySearch) : binarySearch;
    }

    /* renamed from: a */
    public static long m24687a(long j, long j2, long j3) {
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            return j / (j3 / 1000000);
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            return j * (1000000 / j3);
        }
        double d = (double) j3;
        Double.isNaN(d);
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) (d2 * (1000000.0d / d));
    }

    /* renamed from: a */
    public static void m24689a(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 >= 1000000 || 1000000 % j2 != 0) {
            double d = (double) j2;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = (double) jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }
}
