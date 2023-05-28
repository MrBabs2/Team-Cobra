package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzctg implements zzcuz<Bundle> {

    /* renamed from: a */
    private final Bundle f20928a;

    public zzctg(Bundle bundle) {
        this.f20928a = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzcxz.m23101a(bundle, "device");
        a.putBundle("android_mem_info", this.f20928a);
        bundle.putBundle("device", a);
    }
}
