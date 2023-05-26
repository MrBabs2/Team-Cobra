package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzcvf implements zzcuz<Bundle> {

    /* renamed from: a */
    private final boolean f21007a;

    /* renamed from: b */
    private final boolean f21008b;

    /* renamed from: c */
    private final String f21009c;

    /* renamed from: d */
    private final boolean f21010d;

    /* renamed from: e */
    private final boolean f21011e;

    /* renamed from: f */
    private final boolean f21012f;

    /* renamed from: g */
    private final String f21013g;

    /* renamed from: h */
    private final String f21014h;

    /* renamed from: i */
    private final String f21015i;

    /* renamed from: j */
    private final String f21016j;

    /* renamed from: k */
    private final boolean f21017k;

    /* renamed from: l */
    private final String f21018l;

    public zzcvf(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, String str6) {
        this.f21007a = z;
        this.f21008b = z2;
        this.f21009c = str;
        this.f21010d = z3;
        this.f21011e = z4;
        this.f21012f = z5;
        this.f21013g = str2;
        this.f21014h = str3;
        this.f21015i = str4;
        this.f21016j = str5;
        this.f21017k = z6;
        this.f21018l = str6;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f21007a);
        bundle.putBoolean("coh", this.f21008b);
        bundle.putString("gl", this.f21009c);
        bundle.putBoolean("simulator", this.f21010d);
        bundle.putBoolean("is_latchsky", this.f21011e);
        bundle.putBoolean("is_sidewinder", this.f21012f);
        bundle.putString("hl", this.f21013g);
        bundle.putString("mv", this.f21014h);
        bundle.putString("submodel", this.f21018l);
        Bundle a = zzcxz.m23101a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f21016j);
        Bundle a2 = zzcxz.m23101a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f21017k);
        if (!TextUtils.isEmpty(this.f21015i)) {
            Bundle a3 = zzcxz.m23101a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f21015i);
        }
    }
}
