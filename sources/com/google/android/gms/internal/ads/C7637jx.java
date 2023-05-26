package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jx */
final class C7637jx implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f15780a;

    C7637jx(C7966st stVar, Activity activity) {
        this.f15780a = activity;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f15780a);
    }
}
