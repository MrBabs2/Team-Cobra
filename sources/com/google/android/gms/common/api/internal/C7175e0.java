package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
final class C7175e0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ConnectionResult f13788f;

    /* renamed from: g */
    private final /* synthetic */ GoogleApiManager.C7164b f13789g;

    C7175e0(GoogleApiManager.C7164b bVar, ConnectionResult connectionResult) {
        this.f13789g = bVar;
        this.f13788f = connectionResult;
    }

    public final void run() {
        if (this.f13788f.mo24846t()) {
            boolean unused = this.f13789g.f13741e = true;
            if (this.f13789g.f13737a.requiresSignIn()) {
                this.f13789g.m15447a();
                return;
            }
            try {
                this.f13789g.f13737a.getRemoteService((IAccountAccessor) null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((GoogleApiManager.zaa) GoogleApiManager.this.f13730n.get(this.f13789g.f13738b)).mo24962a(new ConnectionResult(10));
            }
        } else {
            ((GoogleApiManager.zaa) GoogleApiManager.this.f13730n.get(this.f13789g.f13738b)).mo24962a(this.f13788f);
        }
    }
}
