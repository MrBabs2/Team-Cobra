package com.flurry.sdk;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.q2 */
public final class C6988q2 {

    /* renamed from: com.flurry.sdk.q2$a */
    public static class C6989a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f13135a;

        public C6989a(Pattern pattern) {
            this.f13135a = pattern;
        }

        public final boolean accept(File file, String str) {
            return this.f13135a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static boolean m14841a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m14843b(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m14844c() {
        return m14845d() + File.separator + "fInProgress";
    }

    /* renamed from: d */
    private static String m14845d() {
        return C6749b2.m14389a().toString() + File.separator + ".fstreaming";
    }

    /* renamed from: a */
    public static boolean m14840a() {
        File file = new File(m14845d());
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /* renamed from: b */
    public static String m14842b() {
        return m14845d() + File.separator + "fCompleted";
    }
}
