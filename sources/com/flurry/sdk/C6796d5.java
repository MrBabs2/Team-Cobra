package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: com.flurry.sdk.d5 */
public final class C6796d5 extends C7008r6 {
    private C6796d5(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: h */
    public static void m14493h() {
        String a = C6934n0.m14722b().mo23656a();
        String str = C6934n0.m14722b().f13006a;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Context a2 = C6747b0.m14386a();
        int i = 0;
        try {
            i = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        C6925m2.m14707a().mo23649a(new C6796d5(new C6810e5(a, str, String.valueOf(i), C6737a2.m14372a(C6747b0.m14386a()))));
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.APP_INFO;
    }
}
