package com.flurry.sdk;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: com.flurry.sdk.p2 */
public final class C6971p2 {
    /* renamed from: a */
    public static void m14809a(String str, long j) {
        SharedPreferences.Editor edit = C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putLong(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), j);
        edit.apply();
    }

    /* renamed from: b */
    public static String m14813b(String str, String str2) {
        return C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getString(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), str2);
    }

    /* renamed from: b */
    public static long m14812b(String str, long j) {
        return C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), j);
    }

    /* renamed from: a */
    public static void m14810a(String str, String str2) {
        SharedPreferences.Editor edit = C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putString(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), str2);
        edit.apply();
    }

    /* renamed from: b */
    public static int m14811b(String str, int i) {
        return C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getInt(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), i);
    }

    /* renamed from: a */
    public static void m14808a(String str, int i) {
        SharedPreferences.Editor edit = C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putInt(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{str}), i);
        edit.apply();
    }

    /* renamed from: a */
    public static void m14807a(String str) {
        C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit().remove(str).apply();
    }
}
