package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {

    /* renamed from: a */
    private final Bundle f10517a;

    public ReferrerDetails(Bundle bundle) {
        this.f10517a = bundle;
    }

    /* renamed from: a */
    public String mo19755a() {
        return this.f10517a.getString("install_referrer");
    }
}
