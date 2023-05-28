package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcsc implements zzcuz<Bundle> {

    /* renamed from: a */
    private final int f20884a;

    /* renamed from: b */
    private final boolean f20885b;

    /* renamed from: c */
    private final boolean f20886c;

    /* renamed from: d */
    private final int f20887d;

    /* renamed from: e */
    private final int f20888e;

    /* renamed from: f */
    private final int f20889f;

    /* renamed from: g */
    private final float f20890g;

    /* renamed from: h */
    private final boolean f20891h;

    public zzcsc(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.f20884a = i;
        this.f20885b = z;
        this.f20886c = z2;
        this.f20887d = i2;
        this.f20888e = i3;
        this.f20889f = i4;
        this.f20890g = f;
        this.f20891h = z3;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f20884a);
        bundle.putBoolean("ma", this.f20885b);
        bundle.putBoolean("sp", this.f20886c);
        bundle.putInt("muv", this.f20887d);
        bundle.putInt("rm", this.f20888e);
        bundle.putInt("riv", this.f20889f);
        bundle.putFloat("android_app_volume", this.f20890g);
        bundle.putBoolean("android_app_muted", this.f20891h);
    }
}
