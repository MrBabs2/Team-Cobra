package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m16250a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b = m16252b(context, str);
        if (b == null || (applicationInfo = b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16251a() {
        return false;
    }

    /* renamed from: b */
    private static PackageInfo m16252b(Context context, String str) {
        try {
            return Wrappers.m16317a(context).mo25510b(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m16253c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((Wrappers.m16317a(context).mo25507a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
