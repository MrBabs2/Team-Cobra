package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzak;

/* renamed from: com.google.android.gms.auth.api.a */
final class C7133a extends Api.AbstractClientBuilder<zzak, AuthProxyOptions> {
    C7133a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Api.Client mo24654a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzak(context, looper, clientSettings, (AuthProxyOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
