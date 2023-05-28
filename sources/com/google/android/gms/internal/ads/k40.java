package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class k40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f15817a;

    k40(g40 g40, Activity activity) {
        this.f15817a = activity;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f15817a);
    }
}
