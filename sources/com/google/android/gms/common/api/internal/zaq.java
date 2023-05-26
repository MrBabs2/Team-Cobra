package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    public final Api<?> f13987f;

    /* renamed from: g */
    private final boolean f13988g;

    /* renamed from: h */
    private zar f13989h;

    public zaq(Api<?> api, boolean z) {
        this.f13987f = api;
        this.f13988g = z;
    }

    /* renamed from: a */
    public final void mo24960a(int i) {
        m15852a();
        this.f13989h.mo24960a(i);
    }

    /* renamed from: d */
    public final void mo24961d(Bundle bundle) {
        m15852a();
        this.f13989h.mo24961d(bundle);
    }

    /* renamed from: a */
    public final void mo24962a(ConnectionResult connectionResult) {
        m15852a();
        this.f13989h.mo25042a(connectionResult, this.f13987f, this.f13988g);
    }

    /* renamed from: a */
    public final void mo25196a(zar zar) {
        this.f13989h = zar;
    }

    /* renamed from: a */
    private final void m15852a() {
        Preconditions.m16038a(this.f13989h, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
