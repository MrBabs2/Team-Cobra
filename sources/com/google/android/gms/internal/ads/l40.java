package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class l40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f16080a;

    l40(g40 g40, Activity activity) {
        this.f16080a = activity;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f16080a);
    }
}
