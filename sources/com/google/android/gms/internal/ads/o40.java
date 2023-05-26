package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class o40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private Activity f16430f;

    /* renamed from: g */
    private Context f16431g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f16432h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f16433i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f16434j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List<zzut> f16435k = new ArrayList();

    /* renamed from: l */
    private final List<zzvg> f16436l = new ArrayList();

    /* renamed from: m */
    private Runnable f16437m;

    /* renamed from: n */
    private boolean f16438n = false;

    /* renamed from: o */
    private long f16439o;

    o40() {
    }

    /* renamed from: a */
    public final void mo26343a(Application application, Context context) {
        if (!this.f16438n) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m17728a((Activity) context);
            }
            this.f16431g = application;
            this.f16439o = ((Long) zzyt.m25670e().mo27163a(zzacu.f17786D0)).longValue();
            this.f16438n = true;
        }
    }

    /* renamed from: b */
    public final Context mo26345b() {
        return this.f16431g;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f16432h) {
            if (this.f16430f != null) {
                if (this.f16430f.equals(activity)) {
                    this.f16430f = null;
                }
                Iterator<zzvg> it = this.f16436l.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().mo29835a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzk.zzlk().mo27734a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbad.m20520b("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m17728a(activity);
        synchronized (this.f16432h) {
            for (zzvg onActivityPaused : this.f16436l) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e) {
                    zzk.zzlk().mo27734a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbad.m20520b("", e);
                }
            }
        }
        this.f16434j = true;
        Runnable runnable = this.f16437m;
        if (runnable != null) {
            zzaxi.f18651h.removeCallbacks(runnable);
        }
        Handler handler = zzaxi.f18651h;
        p40 p40 = new p40(this);
        this.f16437m = p40;
        handler.postDelayed(p40, this.f16439o);
    }

    public final void onActivityResumed(Activity activity) {
        m17728a(activity);
        this.f16434j = false;
        boolean z = !this.f16433i;
        this.f16433i = true;
        Runnable runnable = this.f16437m;
        if (runnable != null) {
            zzaxi.f18651h.removeCallbacks(runnable);
        }
        synchronized (this.f16432h) {
            for (zzvg onActivityResumed : this.f16436l) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e) {
                    zzk.zzlk().mo27734a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbad.m20520b("", e);
                }
            }
            if (z) {
                for (zzut a : this.f16435k) {
                    try {
                        a.mo26760a(true);
                    } catch (Exception e2) {
                        zzbad.m20520b("", e2);
                    }
                }
            } else {
                zzbad.m20516a("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m17728a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void mo26344a(zzut zzut) {
        synchronized (this.f16432h) {
            this.f16435k.add(zzut);
        }
    }

    /* renamed from: a */
    public final Activity mo26342a() {
        return this.f16430f;
    }

    /* renamed from: a */
    private final void m17728a(Activity activity) {
        synchronized (this.f16432h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f16430f = activity;
            }
        }
    }
}
