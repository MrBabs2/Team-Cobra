package com.facebook.p032t.p181u;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.t.u.b */
/* compiled from: AppEventUtility */
public class C6650b {
    /* renamed from: a */
    public static double m14181a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C6476x.m13527c()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static void m14184a() {
    }

    /* renamed from: b */
    public static void m14185b() {
    }

    /* renamed from: c */
    public static String m14186c() {
        Context e = C4716f.m7696e();
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static boolean m14187d() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: a */
    public static String m14183a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static View m14182a(Activity activity) {
        Class<C6650b> cls = C6650b.class;
        if (C6391a.m13260a((Object) cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
