package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class j40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f15730a;

    j40(g40 g40, Activity activity) {
        this.f15730a = activity;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f15730a);
    }
}
