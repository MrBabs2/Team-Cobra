package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.fv */
final class C7484fv implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f15243a;

    C7484fv(C7966st stVar, Activity activity) {
        this.f15243a = activity;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f15243a);
    }
}
