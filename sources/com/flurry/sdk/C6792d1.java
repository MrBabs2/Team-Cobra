package com.flurry.sdk;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.flurry.sdk.d1 */
public final class C6792d1 {

    /* renamed from: a */
    private static boolean f12660a = false;

    /* renamed from: b */
    private static int f12661b = 5;

    /* renamed from: c */
    private static boolean f12662c = false;

    /* renamed from: a */
    public static void m14474a() {
        f12660a = true;
    }

    /* renamed from: b */
    public static void m14480b() {
        f12660a = false;
    }

    /* renamed from: c */
    private static void m14484c(int i, String str, String str2) {
        if (!f12662c) {
            str = "FlurryAgent";
        }
        int i2 = 0;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        while (i2 < length) {
            int i3 = 4000 > length - i2 ? length : i2 + 4000;
            if (Log.println(i, str, str2.substring(i2, i3)) > 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m14487d(String str, String str2) {
        m14481b(2, str, str2);
    }

    /* renamed from: e */
    public static void m14488e(String str, String str2) {
        m14481b(5, str, str2);
    }

    /* renamed from: a */
    public static void m14475a(int i) {
        f12661b = i;
    }

    /* renamed from: b */
    private static void m14482b(int i, String str, String str2, Throwable th) {
        m14481b(i, str, str2 + 10 + Log.getStackTraceString(th));
    }

    /* renamed from: d */
    private static void m14486d(int i, String str, String str2) {
        if (f12662c) {
            m14484c(i, str, str2);
        }
    }

    /* renamed from: a */
    public static void m14478a(String str, String str2) {
        m14481b(3, str, str2);
    }

    /* renamed from: b */
    private static void m14481b(int i, String str, String str2) {
        if (!f12660a && f12661b <= i) {
            m14484c(i, str, str2);
        }
    }

    /* renamed from: a */
    public static void m14479a(String str, String str2, Throwable th) {
        m14482b(6, str, str2, th);
    }

    /* renamed from: a */
    public static void m14476a(int i, String str, String str2) {
        m14486d(i, str, str2);
    }

    /* renamed from: b */
    public static void m14483b(String str, String str2) {
        m14481b(6, str, str2);
    }

    /* renamed from: c */
    public static void m14485c(String str, String str2) {
        m14481b(4, str, str2);
    }

    /* renamed from: a */
    public static void m14477a(int i, String str, String str2, Throwable th) {
        m14486d(i, str, str2 + 10 + Log.getStackTraceString(th));
    }
}
