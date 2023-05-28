package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcuv implements zzcuz<Bundle> {

    /* renamed from: a */
    private final boolean f20991a;

    /* renamed from: b */
    private final boolean f20992b;

    /* renamed from: c */
    private final String f20993c;

    /* renamed from: d */
    private final boolean f20994d;

    /* renamed from: e */
    private final int f20995e;

    /* renamed from: f */
    private final int f20996f;

    public zzcuv(boolean z, boolean z2, String str, boolean z3, int i, int i2) {
        this.f20991a = z;
        this.f20992b = z2;
        this.f20993c = str;
        this.f20994d = z3;
        this.f20995e = i;
        this.f20996f = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f20993c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzyt.m25670e().mo27163a(zzacu.f17991z1));
        bundle.putInt("target_api", this.f20995e);
        bundle.putInt("dv", this.f20996f);
        Bundle a = zzcxz.m23101a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17779B1)).booleanValue());
        a.putBoolean("instant_app", this.f20991a);
        a.putBoolean("lite", this.f20992b);
        a.putBoolean("is_privileged_process", this.f20994d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = zzcxz.m23101a(a, "build_meta");
        a2.putString("cl", "248613007");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
