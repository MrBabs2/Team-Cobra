package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzp {

    /* renamed from: a */
    private static Object f14199a = new Object();

    /* renamed from: b */
    private static boolean f14200b;

    /* renamed from: c */
    private static String f14201c;

    /* renamed from: d */
    private static int f14202d;

    /* renamed from: a */
    public static String m16183a(Context context) {
        m16185c(context);
        return f14201c;
    }

    /* renamed from: b */
    public static int m16184b(Context context) {
        m16185c(context);
        return f14202d;
    }

    /* renamed from: c */
    private static void m16185c(Context context) {
        synchronized (f14199a) {
            if (!f14200b) {
                f14200b = true;
                try {
                    Bundle bundle = Wrappers.m16317a(context).mo25507a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f14201c = bundle.getString("com.google.app.id");
                        f14202d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
