package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcsg implements zzcuz<Bundle> {

    /* renamed from: a */
    private final double f20896a;

    /* renamed from: b */
    private final boolean f20897b;

    public zzcsg(double d, boolean z) {
        this.f20896a = d;
        this.f20897b = z;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzcxz.m23101a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzcxz.m23101a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f20897b);
        a2.putDouble("battery_level", this.f20896a);
    }
}
