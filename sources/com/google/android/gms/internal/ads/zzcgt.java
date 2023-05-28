package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzcgt {
    /* renamed from: a */
    public static PackageInfo m22532a(Context context, ApplicationInfo applicationInfo) {
        try {
            return Wrappers.m16317a(context).mo25510b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
