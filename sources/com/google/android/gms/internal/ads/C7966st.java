package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.st */
final class C7966st implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f16864f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f16865g;

    /* renamed from: h */
    private boolean f16866h = false;

    public C7966st(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f16865g = new WeakReference<>(activityLifecycleCallbacks);
        this.f16864f = application;
    }

    /* renamed from: a */
    private final void m18179a(zzdu zzdu) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f16865g.get();
            if (activityLifecycleCallbacks != null) {
                zzdu.mo25935a(activityLifecycleCallbacks);
            } else if (!this.f16866h) {
                this.f16864f.unregisterActivityLifecycleCallbacks(this);
                this.f16866h = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m18179a(new C7671ku(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m18179a(new C7638jy(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m18179a(new C7710lw(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m18179a(new C7931rv(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m18179a(new C8192yx(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m18179a(new C7484fv(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m18179a(new C7637jx(this, activity));
    }
}
