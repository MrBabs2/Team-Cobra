package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class n40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f16282a;

    n40(g40 g40, Activity activity) {
        this.f16282a = activity;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f16282a);
    }
}
