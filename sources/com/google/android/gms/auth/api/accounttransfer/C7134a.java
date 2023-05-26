package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzu;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
final class C7134a extends Api.AbstractClientBuilder<zzu, zzn> {
    C7134a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Api.Client mo24654a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzu(context, looper, clientSettings, (zzn) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
