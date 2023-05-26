package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
final class C7171c0 implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a */
    final /* synthetic */ GoogleApiManager.zaa f13783a;

    C7171c0(GoogleApiManager.zaa zaa) {
        this.f13783a = zaa;
    }

    /* renamed from: a */
    public final void mo25096a() {
        GoogleApiManager.this.f13734r.post(new C7173d0(this));
    }
}
