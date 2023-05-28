package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p189authapi.zzi;
import com.google.android.gms.internal.p189authapi.zzr;

public final class Auth {

    /* renamed from: a */
    public static final Api.ClientKey<zzr> f13427a = new Api.ClientKey<>();

    /* renamed from: b */
    public static final Api.ClientKey<zzg> f13428b = new Api.ClientKey<>();

    /* renamed from: c */
    private static final Api.AbstractClientBuilder<zzr, AuthCredentialsOptions> f13429c = new C7136b();

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<zzg, GoogleSignInOptions> f13430d = new C7137c();

    /* renamed from: e */
    public static final Api<GoogleSignInOptions> f13431e = new Api<>("Auth.GOOGLE_SIGN_IN_API", f13430d, f13428b);

    /* renamed from: f */
    public static final GoogleSignInApi f13432f = new zzf();

    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {

        /* renamed from: f */
        private final boolean f13433f;

        @Deprecated
        public static class Builder {

            /* renamed from: a */
            protected Boolean f13434a = false;

            /* renamed from: a */
            public AuthCredentialsOptions mo24659a() {
                return new AuthCredentialsOptions(this);
            }
        }

        static {
            new Builder().mo24659a();
        }

        public AuthCredentialsOptions(Builder builder) {
            this.f13433f = builder.f13434a.booleanValue();
        }

        /* renamed from: b */
        public final Bundle mo24658b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.f13433f);
            return bundle;
        }
    }

    static {
        Api<AuthProxyOptions> api = AuthProxy.f13437c;
        new Api("Auth.CREDENTIALS_API", f13429c, f13427a);
        ProxyApi proxyApi = AuthProxy.f13438d;
        new zzi();
    }

    private Auth() {
    }
}
