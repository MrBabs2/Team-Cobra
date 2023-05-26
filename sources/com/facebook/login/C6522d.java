package com.facebook.login;

/* renamed from: com.facebook.login.d */
/* compiled from: LoginBehavior */
public enum C6522d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: f */
    private final boolean f12085f;

    /* renamed from: g */
    private final boolean f12086g;

    /* renamed from: h */
    private final boolean f12087h;

    /* renamed from: i */
    private final boolean f12088i;

    /* renamed from: j */
    private final boolean f12089j;

    /* renamed from: k */
    private final boolean f12090k;

    private C6522d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f12085f = z;
        this.f12086g = z2;
        this.f12087h = z3;
        this.f12088i = z4;
        this.f12089j = z5;
        this.f12090k = z6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21194a() {
        return this.f12089j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo21195d() {
        return this.f12088i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo21196e() {
        return this.f12090k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo21197i() {
        return this.f12085f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo21198l() {
        return this.f12086g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo21199m() {
        return this.f12087h;
    }
}
