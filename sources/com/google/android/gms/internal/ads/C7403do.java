package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.do */
final class C7403do implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f15021a;

    /* renamed from: b */
    private final Bundle f15022b;

    private C7403do(String str, Bundle bundle) {
        this.f15021a = str;
        this.f15022b = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f15021a);
        bundle.putBundle("iab_consent_info", this.f15022b);
    }
}
