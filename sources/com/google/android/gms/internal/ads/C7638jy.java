package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jy */
final class C7638jy implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f15781a;

    C7638jy(C7966st stVar, Activity activity) {
        this.f15781a = activity;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f15781a);
    }
}
