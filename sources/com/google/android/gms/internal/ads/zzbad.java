package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public class zzbad {
    /* renamed from: a */
    public static void m20516a(String str) {
        if (m20518a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m20519b(String str) {
        if (m20518a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m20521c(String str) {
        if (m20518a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: d */
    public static void m20523d(String str) {
        if (m20518a(5)) {
            Log.w("Ads", str);
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    private static String m20525e(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: f */
    public static void m20526f(String str) {
        m20524d(str, (Throwable) null);
    }

    /* renamed from: a */
    public static void m20517a(String str, Throwable th) {
        if (m20518a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: b */
    public static void m20520b(String str, Throwable th) {
        if (m20518a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m20522c(String str, Throwable th) {
        if (m20518a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m20524d(String str, Throwable th) {
        if (!m20518a(5)) {
            return;
        }
        if (th != null) {
            m20522c(m20525e(str), th);
        } else {
            m20523d(m20525e(str));
        }
    }

    /* renamed from: a */
    public static boolean m20518a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
