package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class h40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f15351a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f15352b;

    h40(g40 g40, Activity activity, Bundle bundle) {
        this.f15351a = activity;
        this.f15352b = bundle;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f15351a, this.f15352b);
    }
}
