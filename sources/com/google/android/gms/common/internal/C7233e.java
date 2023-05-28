package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.e */
final class C7233e implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener f14168a;

    C7233e(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f14168a = onConnectionFailedListener;
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
        this.f14168a.mo24962a(connectionResult);
    }
}
