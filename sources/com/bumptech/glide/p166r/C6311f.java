package com.bumptech.glide.p166r;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.r.f */
/* compiled from: LogTime */
public final class C6311f {

    /* renamed from: a */
    private static final double f11562a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f11562a = d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m12965a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static double m12964a(long j) {
        double a = (double) (m12965a() - j);
        double d = f11562a;
        Double.isNaN(a);
        return a * d;
    }
}
