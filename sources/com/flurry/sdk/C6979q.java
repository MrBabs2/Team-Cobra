package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.flurry.sdk.C6960p;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.q */
public final class C6979q extends C6798d7<C6960p> implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: q */
    private static String f13117q;

    /* renamed from: o */
    public int f13118o = 0;

    /* renamed from: p */
    private final Set<String> f13119p;

    public C6979q() {
        super("ApplicationLifecycleProvider");
        Application application = (Application) C6747b0.m14386a();
        if (application != null) {
            this.f13118o = application.getResources().getConfiguration().orientation;
            application.registerActivityLifecycleCallbacks(this);
            application.registerComponentCallbacks(this);
        } else {
            C6792d1.m14476a(6, "ApplicationLifecycleProvider", "Context is null when initializing.");
        }
        this.f13119p = new HashSet();
    }

    /* renamed from: a */
    private void m14827a(Activity activity, C6960p.C6961a aVar) {
        Bundle extras;
        Bundle bundle = new Bundle();
        bundle.putString("activity_name", activity.getLocalClassName());
        if (C6960p.C6961a.CREATED.equals(aVar)) {
            try {
                Intent intent = activity.getIntent();
                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                    bundle.putBundle("launch_options", extras);
                }
            } catch (Throwable unused) {
                C6792d1.m14476a(6, "ApplicationLifecycleProvider", "Error to get Launch Options from the Intent.");
            }
        }
        mo23583a(new C6960p(aVar, bundle));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m14827a(activity, C6960p.C6961a.CREATED);
        synchronized (this) {
            if (f13117q == null) {
                f13117q = activity.getClass().getName();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        m14827a(activity, C6960p.C6961a.DESTROYED);
    }

    public final void onActivityPaused(Activity activity) {
        m14827a(activity, C6960p.C6961a.PAUSED);
    }

    public final void onActivityResumed(Activity activity) {
        m14827a(activity, C6960p.C6961a.RESUMED);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m14827a(activity, C6960p.C6961a.SAVE_STATE);
    }

    public final void onActivityStarted(Activity activity) {
        this.f13119p.add(activity.toString());
        m14827a(activity, C6960p.C6961a.STARTED);
    }

    public final void onActivityStopped(Activity activity) {
        this.f13119p.remove(activity.toString());
        m14827a(activity, C6960p.C6961a.STOPPED);
        if (this.f13119p.isEmpty()) {
            m14827a(activity, C6960p.C6961a.APP_BACKGROUND);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (this.f13118o != i) {
            this.f13118o = i;
            Bundle bundle = new Bundle();
            bundle.putInt("orientation_name", this.f13118o);
            mo23583a(new C6960p(C6960p.C6961a.APP_ORIENTATION_CHANGE, bundle));
        }
    }

    public final void onLowMemory() {
        m14826a(80);
    }

    public final void onTrimMemory(int i) {
        m14826a(i);
    }

    /* renamed from: a */
    private void m14826a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("trim_memory_level", i);
        mo23583a(new C6960p(C6960p.C6961a.TRIM_MEMORY, bundle));
    }
}
