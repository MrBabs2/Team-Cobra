package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C7200r implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f13824f;

    /* renamed from: g */
    private final /* synthetic */ StatusPendingResult f13825g;

    /* renamed from: h */
    private final /* synthetic */ zaaw f13826h;

    C7200r(zaaw zaaw, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f13826h = zaaw;
        this.f13824f = atomicReference;
        this.f13825g = statusPendingResult;
    }

    /* renamed from: a */
    public final void mo24960a(int i) {
    }

    /* renamed from: d */
    public final void mo24961d(Bundle bundle) {
        this.f13826h.m15689a((GoogleApiClient) this.f13824f.get(), this.f13825g, true);
    }
}
