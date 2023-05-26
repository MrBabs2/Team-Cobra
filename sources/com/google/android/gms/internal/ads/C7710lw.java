package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.lw */
final class C7710lw implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f16182a;

    C7710lw(C7966st stVar, Activity activity) {
        this.f16182a = activity;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f16182a);
    }
}
