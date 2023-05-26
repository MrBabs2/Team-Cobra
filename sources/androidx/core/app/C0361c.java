package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
/* compiled from: ActivityRecreator */
final class C0361c {

    /* renamed from: a */
    protected static final Class<?> f1649a = m1785a();

    /* renamed from: b */
    protected static final Field f1650b = m1789b();

    /* renamed from: c */
    protected static final Field f1651c = m1791c();

    /* renamed from: d */
    protected static final Method f1652d = m1790b(f1649a);

    /* renamed from: e */
    protected static final Method f1653e = m1786a(f1649a);

    /* renamed from: f */
    protected static final Method f1654f = m1792c(f1649a);

    /* renamed from: g */
    private static final Handler f1655g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    /* compiled from: ActivityRecreator */
    class C0362a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0365d f1656f;

        /* renamed from: g */
        final /* synthetic */ Object f1657g;

        C0362a(C0365d dVar, Object obj) {
            this.f1656f = dVar;
            this.f1657g = obj;
        }

        public void run() {
            this.f1656f.f1662f = this.f1657g;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* compiled from: ActivityRecreator */
    class C0363b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f1658f;

        /* renamed from: g */
        final /* synthetic */ C0365d f1659g;

        C0363b(Application application, C0365d dVar) {
            this.f1658f = application;
            this.f1659g = dVar;
        }

        public void run() {
            this.f1658f.unregisterActivityLifecycleCallbacks(this.f1659g);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    /* compiled from: ActivityRecreator */
    class C0364c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f1660f;

        /* renamed from: g */
        final /* synthetic */ Object f1661g;

        C0364c(Object obj, Object obj2) {
            this.f1660f = obj;
            this.f1661g = obj2;
        }

        public void run() {
            try {
                if (C0361c.f1652d != null) {
                    C0361c.f1652d.invoke(this.f1660f, new Object[]{this.f1661g, false, "AppCompat recreation"});
                    return;
                }
                C0361c.f1653e.invoke(this.f1660f, new Object[]{this.f1661g, false});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    /* compiled from: ActivityRecreator */
    private static final class C0365d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f1662f;

        /* renamed from: g */
        private Activity f1663g;

        /* renamed from: h */
        private boolean f1664h = false;

        /* renamed from: i */
        private boolean f1665i = false;

        /* renamed from: j */
        private boolean f1666j = false;

        C0365d(Activity activity) {
            this.f1663g = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1663g == activity) {
                this.f1663g = null;
                this.f1665i = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1665i && !this.f1666j && !this.f1664h && C0361c.m1788a(this.f1662f, activity)) {
                this.f1666j = true;
                this.f1662f = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1663g == activity) {
                this.f1664h = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static boolean m1787a(Activity activity) {
        Object obj;
        Application application;
        C0365d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1793d() && f1654f == null) {
            return false;
        } else {
            if (f1653e == null && f1652d == null) {
                return false;
            }
            try {
                Object obj2 = f1651c.get(activity);
                if (obj2 == null || (obj = f1650b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0365d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f1655g.post(new C0362a(dVar, obj2));
                if (m1793d()) {
                    f1654f.invoke(obj, new Object[]{obj2, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                f1655g.post(new C0363b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: b */
    private static Method m1790b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1792c(Class<?> cls) {
        if (m1793d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m1793d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    private static Field m1789b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m1791c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static boolean m1788a(Object obj, Activity activity) {
        try {
            Object obj2 = f1651c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f1655g.postAtFrontOfQueue(new C0364c(f1650b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: a */
    private static Method m1786a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Class<?> m1785a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
