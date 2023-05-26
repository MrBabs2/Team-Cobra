package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class InstantApps {

    /* renamed from: a */
    private static Context f14279a;

    /* renamed from: b */
    private static Boolean f14280b;

    @KeepForSdk
    /* renamed from: a */
    public static synchronized boolean m16309a(Context context) {
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            if (f14279a == null || f14280b == null || f14279a != applicationContext) {
                f14280b = null;
                if (PlatformVersion.m16295k()) {
                    f14280b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f14280b = true;
                    } catch (ClassNotFoundException unused) {
                        f14280b = false;
                    }
                }
                f14279a = applicationContext;
                boolean booleanValue = f14280b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f14280b.booleanValue();
            return booleanValue2;
        }
    }
}
