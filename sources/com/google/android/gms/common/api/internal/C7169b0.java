package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
final class C7169b0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ConnectionResult f13779f;

    /* renamed from: g */
    private final /* synthetic */ GoogleApiManager.zaa f13780g;

    C7169b0(GoogleApiManager.zaa zaa, ConnectionResult connectionResult) {
        this.f13780g = zaa;
        this.f13779f = connectionResult;
    }

    public final void run() {
        this.f13780g.mo24962a(this.f13779f);
    }
}
