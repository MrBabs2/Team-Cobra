package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@VisibleForTesting
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16285a() {
        return true;
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m16286b() {
        return true;
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m16287c() {
        return true;
    }

    @KeepForSdk
    /* renamed from: d */
    public static boolean m16288d() {
        return Build.VERSION.SDK_INT >= 17;
    }

    @KeepForSdk
    /* renamed from: e */
    public static boolean m16289e() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @KeepForSdk
    /* renamed from: f */
    public static boolean m16290f() {
        return Build.VERSION.SDK_INT >= 19;
    }

    @KeepForSdk
    /* renamed from: g */
    public static boolean m16291g() {
        return Build.VERSION.SDK_INT >= 20;
    }

    @KeepForSdk
    /* renamed from: h */
    public static boolean m16292h() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @KeepForSdk
    /* renamed from: i */
    public static boolean m16293i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    /* renamed from: j */
    public static boolean m16294j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    /* renamed from: k */
    public static boolean m16295k() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    /* renamed from: l */
    public static boolean m16296l() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
