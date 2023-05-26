package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.o1 */
public final class C6951o1 {

    /* renamed from: c */
    private static C6951o1 f13052c;

    /* renamed from: a */
    private Application.ActivityLifecycleCallbacks f13053a;

    /* renamed from: b */
    final List<C6953b> f13054b = new ArrayList();

    /* renamed from: com.flurry.sdk.o1$a */
    class C6952a implements Application.ActivityLifecycleCallbacks {
        C6952a() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
            C6792d1.m14476a(3, "PerformanceMonitor", "onActivityPaused for activity: " + activity.toString());
            for (C6953b a : C6951o1.this.f13054b) {
                a.mo23660a();
            }
        }

        public final void onActivityResumed(Activity activity) {
            C6792d1.m14476a(3, "PerformanceMonitor", "onActivityResumed for activity: " + activity.toString());
            for (C6953b c : C6951o1.this.f13054b) {
                c.mo23663c(activity);
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            C6792d1.m14476a(3, "PerformanceMonitor", "onActivityStarted for activity: " + activity.toString());
            for (C6953b a : C6951o1.this.f13054b) {
                a.mo23661a(activity);
            }
        }

        public final void onActivityStopped(Activity activity) {
            C6792d1.m14476a(3, "PerformanceMonitor", "onActivityStopped for activity: " + activity.toString());
            for (C6953b b : C6951o1.this.f13054b) {
                b.mo23662b(activity);
            }
        }
    }

    /* renamed from: com.flurry.sdk.o1$b */
    public interface C6953b {
        /* renamed from: a */
        void mo23660a();

        /* renamed from: a */
        void mo23661a(Activity activity);

        /* renamed from: b */
        void mo23662b(Activity activity);

        /* renamed from: c */
        void mo23663c(Activity activity);
    }

    private C6951o1() {
    }

    /* renamed from: a */
    public static synchronized C6951o1 m14763a() {
        C6951o1 o1Var;
        synchronized (C6951o1.class) {
            if (f13052c == null) {
                f13052c = new C6951o1();
            }
            o1Var = f13052c;
        }
        return o1Var;
    }

    /* renamed from: a */
    public final void mo23669a(C6953b bVar) {
        synchronized (this.f13054b) {
            this.f13054b.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo23668a(Context context, Cursor cursor) {
        if (this.f13053a == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                if (context instanceof Application) {
                    C6935n1.m14727b().mo23658a(applicationContext, cursor);
                }
                C6985q1.m14834b().mo23698a();
                C6952a aVar = new C6952a();
                this.f13053a = aVar;
                ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar);
            }
        }
    }
}
