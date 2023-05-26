package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzctk implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzcxk f20931a;

    public zzctk(zzcxk zzcxk) {
        this.f20931a = zzcxk;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzcxk zzcxk = this.f20931a;
        if (zzcxk != null) {
            bundle.putBoolean("render_in_browser", zzcxk.mo28813a());
            bundle.putBoolean("disable_ml", this.f20931a.mo28814b());
        }
    }
}
