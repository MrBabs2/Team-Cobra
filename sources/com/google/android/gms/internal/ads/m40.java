package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class m40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f16199a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f16200b;

    m40(g40 g40, Activity activity, Bundle bundle) {
        this.f16199a = activity;
        this.f16200b = bundle;
    }

    /* renamed from: a */
    public final void mo26012a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f16199a, this.f16200b);
    }
}
