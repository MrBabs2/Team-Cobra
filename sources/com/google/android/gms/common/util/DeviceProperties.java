package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {

    /* renamed from: a */
    private static Boolean f14265a;

    /* renamed from: b */
    private static Boolean f14266b;

    /* renamed from: c */
    private static Boolean f14267c;

    /* renamed from: d */
    private static Boolean f14268d;

    private DeviceProperties() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16270a(Context context) {
        if (f14267c == null) {
            PackageManager packageManager = context.getPackageManager();
            f14267c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f14267c.booleanValue();
    }

    @TargetApi(21)
    @KeepForSdk
    /* renamed from: b */
    public static boolean m16271b(Context context) {
        if (f14266b == null) {
            f14266b = Boolean.valueOf(PlatformVersion.m16292h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f14266b.booleanValue();
    }

    @TargetApi(20)
    @KeepForSdk
    /* renamed from: c */
    public static boolean m16272c(Context context) {
        if (f14265a == null) {
            f14265a = Boolean.valueOf(PlatformVersion.m16291g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f14265a.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    /* renamed from: d */
    public static boolean m16273d(Context context) {
        if (!m16272c(context)) {
            return false;
        }
        if (PlatformVersion.m16294j()) {
            return m16271b(context) && !PlatformVersion.m16295k();
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m16274e(Context context) {
        if (f14268d == null) {
            f14268d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f14268d.booleanValue();
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16269a() {
        return "user".equals(Build.TYPE);
    }
}
