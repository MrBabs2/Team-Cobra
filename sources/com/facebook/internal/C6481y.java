package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.y */
/* compiled from: Validate */
public final class C6481y {

    /* renamed from: a */
    private static final String f11933a = "com.facebook.internal.y";

    /* renamed from: a */
    public static void m13556a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* renamed from: b */
    public static <T> void m13562b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }

    /* renamed from: c */
    public static <T> void m13564c(Collection<T> collection, String str) {
        m13558a(collection, str);
        m13562b(collection, str);
    }

    /* renamed from: a */
    public static <T> void m13558a(Collection<T> collection, String str) {
        m13556a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: b */
    public static String m13560b() {
        String k = C4716f.m7702k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: c */
    public static void m13563c() {
        if (!C4716f.m7713v()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: a */
    public static void m13557a(String str, String str2) {
        if (C6476x.m13533d(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    /* renamed from: b */
    public static void m13561b(Context context, boolean z) {
        m13556a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z) {
            Log.w(f11933a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    /* renamed from: a */
    public static String m13554a() {
        String f = C4716f.m7697f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13555a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            m13556a((java.lang.Object) r3, (java.lang.String) r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 != 0) goto L_0x0025
            java.lang.String r4 = f11933a
            android.util.Log.w(r4, r3)
            goto L_0x002b
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6481y.m13555a(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public static boolean m13559a(Context context, String str) {
        List<ResolveInfo> list;
        m13556a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
