package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {

    /* renamed from: a */
    private static final Api.ClientKey<SignInClientImpl> f23699a = new Api.ClientKey<>();
    @ShowFirstParty

    /* renamed from: b */
    private static final Api.ClientKey<SignInClientImpl> f23700b = new Api.ClientKey<>();

    /* renamed from: c */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f23701c = new C8396a();

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<SignInClientImpl, Object> f23702d = new C8397b();

    /* renamed from: e */
    public static final Api<SignInOptions> f23703e = new Api<>("SignIn.API", f23701c, f23699a);

    static {
        new Scope("profile");
        new Scope("email");
        new Api("SignIn.INTERNAL_API", f23702d, f23700b);
    }
}
