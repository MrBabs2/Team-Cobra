package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j */
    private static final BackgroundDetector f13692j = new BackgroundDetector();

    /* renamed from: f */
    private final AtomicBoolean f13693f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f13694g = new AtomicBoolean();

    /* renamed from: h */
    private final ArrayList<BackgroundStateChangeListener> f13695h = new ArrayList<>();

    /* renamed from: i */
    private boolean f13696i = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo25005a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m15382a(Application application) {
        synchronized (f13692j) {
            if (!f13692j.f13696i) {
                application.registerActivityLifecycleCallbacks(f13692j);
                application.registerComponentCallbacks(f13692j);
                f13692j.f13696i = true;
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static BackgroundDetector m15383b() {
        return f13692j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f13693f.compareAndSet(true, false);
        this.f13694g.set(true);
        if (compareAndSet) {
            m15384b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f13693f.compareAndSet(true, false);
        this.f13694g.set(true);
        if (compareAndSet) {
            m15384b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f13693f.compareAndSet(false, true)) {
            this.f13694g.set(true);
            m15384b(true);
        }
    }

    /* renamed from: b */
    private final void m15384b(boolean z) {
        synchronized (f13692j) {
            ArrayList<BackgroundStateChangeListener> arrayList = this.f13695h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                BackgroundStateChangeListener backgroundStateChangeListener = arrayList.get(i);
                i++;
                backgroundStateChangeListener.mo25005a(z);
            }
        }
    }

    @TargetApi(16)
    @KeepForSdk
    /* renamed from: a */
    public final boolean mo24994a(boolean z) {
        if (!this.f13694g.get()) {
            if (!PlatformVersion.m16287c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f13694g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f13693f.set(true);
            }
        }
        return mo24993a();
    }

    @KeepForSdk
    /* renamed from: a */
    public final boolean mo24993a() {
        return this.f13693f.get();
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo24992a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f13692j) {
            this.f13695h.add(backgroundStateChangeListener);
        }
    }
}
