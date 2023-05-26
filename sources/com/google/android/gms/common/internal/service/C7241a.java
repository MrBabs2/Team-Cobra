package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.common.internal.service.a */
final class C7241a extends Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> {
    C7241a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Api.Client mo24654a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zai(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
