package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class g40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f15273f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f15274g;

    /* renamed from: h */
    private boolean f15275h = false;

    public g40(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f15274g = new WeakReference<>(activityLifecycleCallbacks);
        this.f15273f = application;
    }

    /* renamed from: a */
    private final void m16998a(zzun zzun) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f15274g.get();
            if (activityLifecycleCallbacks != null) {
                zzun.mo26012a(activityLifecycleCallbacks);
            } else if (!this.f15275h) {
                this.f15273f.unregisterActivityLifecycleCallbacks(this);
                this.f15275h = true;
            }
        } catch (Exception e) {
            zzbad.m20520b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16998a(new h40(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m16998a(new n40(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m16998a(new k40(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m16998a(new j40(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16998a(new m40(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m16998a(new i40(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m16998a(new l40(this, activity));
    }
}
