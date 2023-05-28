package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* renamed from: com.google.android.gms.signin.a */
final class C8396a extends Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    C8396a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Api.Client mo24654a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        SignInOptions signInOptions = (SignInOptions) obj;
        if (signInOptions == null) {
            signInOptions = SignInOptions.f23678n;
        }
        return new SignInClientImpl(context, looper, true, clientSettings, signInOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
