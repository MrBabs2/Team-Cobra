package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.k0 */
public final class C6896k0 {

    /* renamed from: c */
    private static C6896k0 f12900c;

    /* renamed from: a */
    public String f12901a;

    /* renamed from: b */
    public String f12902b;

    private C6896k0() {
    }

    /* renamed from: c */
    public static C6896k0 m14646c() {
        if (f12900c == null) {
            f12900c = new C6896k0();
        }
        return f12900c;
    }

    /* renamed from: d */
    private static boolean m14647d() {
        return C6815f1.m14516a() == 0;
    }

    /* renamed from: a */
    public final String mo23630a() {
        if (TextUtils.isEmpty(this.f12901a)) {
            mo23631b();
        }
        C6792d1.m14476a(3, "APIKeyProvider", "Getting streaming apikey: " + this.f12901a);
        return this.f12901a;
    }

    /* renamed from: b */
    public final void mo23631b() {
        if (TextUtils.isEmpty(this.f12901a)) {
            this.f12901a = this.f12902b;
            if (!m14647d()) {
                this.f12901a += "0";
            }
            C6792d1.m14476a(3, "APIKeyProvider", "Generating a streaming apikey: " + this.f12901a);
        }
    }
}
