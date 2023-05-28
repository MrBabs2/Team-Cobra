package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.s */
final class C7202s implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ StatusPendingResult f13841f;

    C7202s(zaaw zaaw, StatusPendingResult statusPendingResult) {
        this.f13841f = statusPendingResult;
    }

    /* renamed from: a */
    public final void mo24962a(ConnectionResult connectionResult) {
        this.f13841f.mo25012a(new Status(8));
    }
}
