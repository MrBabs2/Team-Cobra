package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* renamed from: com.google.android.gms.common.api.internal.y */
final class C7214y implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ GoogleApiManager f13857a;

    C7214y(GoogleApiManager googleApiManager) {
        this.f13857a = googleApiManager;
    }

    /* renamed from: a */
    public final void mo25005a(boolean z) {
        this.f13857a.f13734r.sendMessage(this.f13857a.f13734r.obtainMessage(1, Boolean.valueOf(z)));
    }
}
