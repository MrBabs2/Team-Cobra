package com.facebook.p032t.p181u;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.C6494l;
import com.facebook.internal.C6437k;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.p176q.C6603a;
import com.facebook.p032t.p177r.C6613b;
import com.facebook.p032t.p184x.C6689d;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.t.u.a */
/* compiled from: ActivityLifecycleTracker */
public class C6643a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12376a = "com.facebook.t.u.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f12377b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f12378c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f12379d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f12380e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C6666j f12381f;

    /* renamed from: g */
    private static AtomicBoolean f12382g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f12383h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f12384i;

    /* renamed from: j */
    private static int f12385j = 0;

    /* renamed from: k */
    private static WeakReference<Activity> f12386k;

    /* renamed from: com.facebook.t.u.a$a */
    /* compiled from: ActivityLifecycleTracker */
    static class C6644a implements C6437k.C6440c {
        C6644a() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6613b.m14071d();
            } else {
                C6613b.m14067c();
            }
        }
    }

    /* renamed from: com.facebook.t.u.a$b */
    /* compiled from: ActivityLifecycleTracker */
    static class C6645b implements Application.ActivityLifecycleCallbacks {
        C6645b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityCreated");
            C6650b.m14184a();
            C6643a.m14164c(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityDestroyed");
            C6643a.m14166d(activity);
        }

        public void onActivityPaused(Activity activity) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityPaused");
            C6650b.m14184a();
            C6643a.m14168e(activity);
        }

        public void onActivityResumed(Activity activity) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityResumed");
            C6650b.m14184a();
            C6643a.m14170f(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C6643a.m14163c();
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6643a.f12376a, "onActivityStopped");
            C4728g.m7732d();
            C6643a.m14165d();
        }
    }

    /* renamed from: com.facebook.t.u.a$c */
    /* compiled from: ActivityLifecycleTracker */
    static class C6646c implements Runnable {
        C6646c() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (C6643a.f12381f == null) {
                        C6666j unused = C6643a.f12381f = C6666j.m14227j();
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.u.a$d */
    /* compiled from: ActivityLifecycleTracker */
    static class C6647d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f12387f;

        /* renamed from: g */
        final /* synthetic */ String f12388g;

        /* renamed from: h */
        final /* synthetic */ Context f12389h;

        C6647d(long j, String str, Context context) {
            this.f12387f = j;
            this.f12388g = str;
            this.f12389h = context;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (C6643a.f12381f == null) {
                        C6666j unused = C6643a.f12381f = new C6666j(Long.valueOf(this.f12387f), (Long) null);
                        C6667k.m14241a(this.f12388g, (C6668l) null, C6643a.f12383h, this.f12389h);
                    } else if (C6643a.f12381f.mo21424d() != null) {
                        long longValue = this.f12387f - C6643a.f12381f.mo21424d().longValue();
                        if (longValue > ((long) (C6643a.m14178n() * 1000))) {
                            C6667k.m14240a(this.f12388g, C6643a.f12381f, C6643a.f12383h);
                            C6667k.m14241a(this.f12388g, (C6668l) null, C6643a.f12383h, this.f12389h);
                            C6666j unused2 = C6643a.f12381f = new C6666j(Long.valueOf(this.f12387f), (Long) null);
                        } else if (longValue > 1000) {
                            C6643a.f12381f.mo21427g();
                        }
                    }
                    C6643a.f12381f.mo21421a(Long.valueOf(this.f12387f));
                    C6643a.f12381f.mo21428h();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.u.a$e */
    /* compiled from: ActivityLifecycleTracker */
    static class C6648e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f12390f;

        /* renamed from: g */
        final /* synthetic */ String f12391g;

        /* renamed from: com.facebook.t.u.a$e$a */
        /* compiled from: ActivityLifecycleTracker */
        class C6649a implements Runnable {
            C6649a() {
            }

            public void run() {
                if (!C6391a.m13260a((Object) this)) {
                    try {
                        if (C6643a.f12381f == null) {
                            C6666j unused = C6643a.f12381f = new C6666j(Long.valueOf(C6648e.this.f12390f), (Long) null);
                        }
                        if (C6643a.f12380e.get() <= 0) {
                            C6667k.m14240a(C6648e.this.f12391g, C6643a.f12381f, C6643a.f12383h);
                            C6666j.m14226i();
                            C6666j unused2 = C6643a.f12381f = null;
                        }
                        synchronized (C6643a.f12379d) {
                            ScheduledFuture unused3 = C6643a.f12378c = null;
                        }
                    } catch (Throwable th) {
                        C6391a.m13259a(th, this);
                    }
                }
            }
        }

        C6648e(long j, String str) {
            this.f12390f = j;
            this.f12391g = str;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (C6643a.f12381f == null) {
                        C6666j unused = C6643a.f12381f = new C6666j(Long.valueOf(this.f12390f), (Long) null);
                    }
                    C6643a.f12381f.mo21421a(Long.valueOf(this.f12390f));
                    if (C6643a.f12380e.get() <= 0) {
                        C6649a aVar = new C6649a();
                        synchronized (C6643a.f12379d) {
                            ScheduledFuture unused2 = C6643a.f12378c = C6643a.f12377b.schedule(aVar, (long) C6643a.m14178n(), TimeUnit.SECONDS);
                        }
                    }
                    long e = C6643a.f12384i;
                    long j = 0;
                    if (e > 0) {
                        j = (this.f12390f - e) / 1000;
                    }
                    C6654d.m14191a(this.f12391g, j);
                    C6643a.f12381f.mo21428h();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m14163c() {
        int i = f12385j;
        f12385j = i + 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m14165d() {
        int i = f12385j;
        f12385j = i - 1;
        return i;
    }

    /* renamed from: k */
    private static void m14175k() {
        synchronized (f12379d) {
            if (f12378c != null) {
                f12378c.cancel(false);
            }
            f12378c = null;
        }
    }

    /* renamed from: l */
    public static Activity m14176l() {
        WeakReference<Activity> weakReference = f12386k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: m */
    public static UUID m14177m() {
        if (f12381f != null) {
            return f12381f.mo21423c();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static int m14178n() {
        C6446m c = C6448n.m13386c(C4716f.m7697f());
        if (c == null) {
            return C6656e.m14195a();
        }
        return c.mo20997j();
    }

    /* renamed from: o */
    public static boolean m14179o() {
        return f12385j == 0;
    }

    /* renamed from: c */
    public static void m14164c(Activity activity) {
        f12377b.execute(new C6646c());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m14166d(Activity activity) {
        C6613b.m14061a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m14168e(Activity activity) {
        if (f12380e.decrementAndGet() < 0) {
            f12380e.set(0);
            Log.w(f12376a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m14175k();
        long currentTimeMillis = System.currentTimeMillis();
        String b = C6476x.m13519b((Context) activity);
        C6613b.m14066b(activity);
        f12377b.execute(new C6648e(currentTimeMillis, b));
    }

    /* renamed from: f */
    public static void m14170f(Activity activity) {
        f12386k = new WeakReference<>(activity);
        f12380e.incrementAndGet();
        m14175k();
        long currentTimeMillis = System.currentTimeMillis();
        f12384i = currentTimeMillis;
        String b = C6476x.m13519b((Context) activity);
        C6613b.m14068c(activity);
        C6603a.m14029a(activity);
        C6689d.m14327a(activity);
        f12377b.execute(new C6647d(currentTimeMillis, b, activity.getApplicationContext()));
    }

    /* renamed from: a */
    public static void m14160a(Application application, String str) {
        if (f12382g.compareAndSet(false, true)) {
            C6437k.m13338a(C6437k.C6441d.CodelessEvents, new C6644a());
            f12383h = str;
            application.registerActivityLifecycleCallbacks(new C6645b());
        }
    }
}
