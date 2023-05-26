package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.d */
final class C7232d implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks f14167a;

    C7232d(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f14167a = connectionCallbacks;
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
        this.f14167a.mo24960a(i);
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        this.f14167a.mo24961d(bundle);
    }
}
