package com.facebook;

/* renamed from: com.facebook.c */
/* compiled from: AccessTokenSource */
public enum C6359c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    

    /* renamed from: f */
    private final boolean f11707f;

    private C6359c(boolean z) {
        this.f11707f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo20887a() {
        return this.f11707f;
    }
}
