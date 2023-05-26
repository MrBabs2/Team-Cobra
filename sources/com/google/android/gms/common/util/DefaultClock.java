package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class DefaultClock implements Clock {

    /* renamed from: a */
    private static final DefaultClock f14264a = new DefaultClock();

    private DefaultClock() {
    }

    @KeepForSdk
    /* renamed from: d */
    public static Clock m16265d() {
        return f14264a;
    }

    /* renamed from: a */
    public long mo25497a() {
        return System.nanoTime();
    }

    /* renamed from: b */
    public long mo25498b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public long mo25499c() {
        return SystemClock.elapsedRealtime();
    }
}
