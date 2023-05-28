package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ku */
final class C7671ku implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f16020a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f16021b;

    C7671ku(C7966st stVar, Activity activity, Bundle bundle) {
        this.f16020a = activity;
        this.f16021b = bundle;
    }

    /* renamed from: a */
    public final void mo25935a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f16020a, this.f16021b);
    }
}
