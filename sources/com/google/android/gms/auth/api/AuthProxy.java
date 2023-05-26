package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
public final class AuthProxy {

    /* renamed from: a */
    private static final Api.ClientKey<zzak> f13435a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> f13436b;
    @KeepForSdk

    /* renamed from: c */
    public static final Api<AuthProxyOptions> f13437c;
    @KeepForSdk

    /* renamed from: d */
    public static final ProxyApi f13438d = new zzar();

    static {
        C7133a aVar = new C7133a();
        f13436b = aVar;
        f13437c = new Api<>("Auth.PROXY_API", aVar, f13435a);
    }
}
