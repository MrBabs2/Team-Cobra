package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.r2 */
public final class C7004r2 {
    /* renamed from: a */
    public static boolean m14873a(String... strArr) {
        for (int i = 0; i < 4; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m14872a(Object... objArr) {
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                return false;
            }
        }
        return true;
    }
}
