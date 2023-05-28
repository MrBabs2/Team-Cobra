package com.flurry.sdk;

import android.content.Context;

/* renamed from: com.flurry.sdk.o2 */
public final class C6954o2 {
    /* renamed from: a */
    public static boolean m14770a(String str) {
        Context a = C6747b0.m14386a();
        if (a == null) {
            C6792d1.m14476a(6, "PermissionUtil", "Context is null when checking permission.");
            return false;
        } else if (a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
