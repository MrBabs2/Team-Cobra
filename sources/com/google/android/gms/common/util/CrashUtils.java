package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public final class CrashUtils {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m16263a(Context context, Throwable th) {
        return m16264a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m16264a(Context context, Throwable th, int i) {
        try {
            Preconditions.m16037a(context);
            Preconditions.m16037a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
