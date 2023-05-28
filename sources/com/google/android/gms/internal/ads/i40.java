package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class i40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f15571a;

    i40(g40 g40, Activity activity) {
        this.f15571a = activity;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f15571a);
    }
}
