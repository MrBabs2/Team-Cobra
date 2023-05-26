package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzcvj implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f21021a;

    /* renamed from: b */
    private final int f21022b;

    /* renamed from: c */
    private final int f21023c;

    /* renamed from: d */
    private final int f21024d;

    /* renamed from: e */
    private final boolean f21025e;

    /* renamed from: f */
    private final int f21026f;

    public zzcvj(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f21021a = str;
        this.f21022b = i;
        this.f21023c = i2;
        this.f21024d = i3;
        this.f21025e = z;
        this.f21026f = i4;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f21021a;
        boolean z = true;
        zzcxz.m23106a(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f21022b);
        if (this.f21022b == -2) {
            z = false;
        }
        zzcxz.m23104a(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f21023c);
        bundle.putInt("pt", this.f21024d);
        Bundle a = zzcxz.m23101a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzcxz.m23101a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f21026f);
        a2.putBoolean("active_network_metered", this.f21025e);
    }
}
