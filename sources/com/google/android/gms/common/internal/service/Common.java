package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk

    /* renamed from: a */
    public static final Api.ClientKey<zai> f14187a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> f14188b;
    @KeepForSdk

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f14189c;

    /* renamed from: d */
    public static final zac f14190d = new zad();

    static {
        C7241a aVar = new C7241a();
        f14188b = aVar;
        f14189c = new Api<>("Common.API", aVar, f14187a);
    }
}
