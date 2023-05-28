package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.flurry.sdk.n0 */
public final class C6934n0 {

    /* renamed from: c */
    private static C6934n0 f13005c;

    /* renamed from: a */
    public String f13006a;

    /* renamed from: b */
    private String f13007b;

    private C6934n0() {
        String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", new Object[]{328, 13, 0, 1, "", ""});
    }

    /* renamed from: b */
    public static synchronized C6934n0 m14722b() {
        C6934n0 n0Var;
        synchronized (C6934n0.class) {
            if (f13005c == null) {
                f13005c = new C6934n0();
            }
            n0Var = f13005c;
        }
        return n0Var;
    }

    /* renamed from: c */
    private static String m14723c() {
        try {
            Context a = C6747b0.m14386a();
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
            if (packageInfo.versionCode != 0) {
                return Integer.toString(packageInfo.versionCode);
            }
            return "Unknown";
        } catch (Throwable th) {
            C6792d1.m14477a(6, "VersionProvider", "", th);
            return "Unknown";
        }
    }

    /* renamed from: a */
    public final synchronized String mo23656a() {
        if (!TextUtils.isEmpty(this.f13006a)) {
            return this.f13006a;
        } else if (!TextUtils.isEmpty(this.f13007b)) {
            return this.f13007b;
        } else {
            String c = m14723c();
            this.f13007b = c;
            return c;
        }
    }
}
