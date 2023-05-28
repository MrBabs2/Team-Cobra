package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.yx */
final class C8192yx implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f17491a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f17492b;

    C8192yx(C7966st stVar, Activity activity, Bundle bundle) {
        this.f17491a = activity;
        this.f17492b = bundle;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f17491a, this.f17492b);
    }
}
