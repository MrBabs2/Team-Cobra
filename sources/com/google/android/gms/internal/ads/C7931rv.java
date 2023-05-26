package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.rv */
final class C7931rv implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f16782a;

    C7931rv(C7966st stVar, Activity activity) {
        this.f16782a = activity;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f16782a);
    }
}
