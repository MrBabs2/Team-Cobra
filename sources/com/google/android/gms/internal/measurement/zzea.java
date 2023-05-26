package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class zzea {

    /* renamed from: j */
    private static volatile zzea f23412j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f23413a;

    /* renamed from: b */
    protected final Clock f23414b;

    /* renamed from: c */
    private final ExecutorService f23415c;

    /* renamed from: d */
    private final AppMeasurementSdk f23416d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<zzcy, Object> f23417e;

    /* renamed from: f */
    private int f23418f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f23419g;

    /* renamed from: h */
    private String f23420h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzdn f23421i;

    /* renamed from: com.google.android.gms.internal.measurement.zzea$a */
    class C8376a extends zzdr {

        /* renamed from: f */
        private final AtomicReference<Bundle> f23422f = new AtomicReference<>();

        /* renamed from: g */
        private boolean f23423g;

        C8376a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final <T> T mo30350a(Bundle bundle, Class<T> cls) {
            Object obj;
            if (bundle == null || (obj = bundle.get("r")) == null) {
                return null;
            }
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                String canonicalName = cls.getCanonicalName();
                String canonicalName2 = obj.getClass().getCanonicalName();
                zzea.this.mo30335a(5, "Unexpected object type. Expected, Received", (Object) canonicalName, (Object) canonicalName2, (Object) e);
                Log.w(zzea.this.f23413a, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
                throw e;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final String mo30351e(long j) {
            return (String) mo30350a(mo30352f(j), String.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final Bundle mo30352f(long j) {
            Bundle bundle;
            synchronized (this.f23422f) {
                if (!this.f23423g) {
                    try {
                        this.f23422f.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.f23422f.get();
            }
            return bundle;
        }

        public final void zzb(Bundle bundle) {
            synchronized (this.f23422f) {
                try {
                    this.f23422f.set(bundle);
                    this.f23423g = true;
                    this.f23422f.notify();
                } catch (Throwable th) {
                    this.f23422f.notify();
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzea$b */
    abstract class C8377b implements Runnable {

        /* renamed from: f */
        final long f23425f;

        /* renamed from: g */
        final long f23426g;

        /* renamed from: h */
        private final boolean f23427h;

        C8377b(zzea zzea) {
            this(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo30061a() throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo30086b() {
        }

        public void run() {
            if (zzea.this.f23419g) {
                mo30086b();
                return;
            }
            try {
                mo30061a();
            } catch (Exception e) {
                zzea.this.m26463a(e, false, this.f23427h);
                mo30086b();
            }
        }

        C8377b(boolean z) {
            this.f23425f = zzea.this.f23414b.mo25498b();
            this.f23426g = zzea.this.f23414b.mo25499c();
            this.f23427h = z;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzea$c */
    class C8378c implements Application.ActivityLifecycleCallbacks {
        C8378c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzea.this.m26460a((C8377b) new C8344t(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            zzea.this.m26460a((C8377b) new C8372z(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            zzea.this.m26460a((C8377b) new C8356w(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            zzea.this.m26460a((C8377b) new C8352v(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C8376a aVar = new C8376a();
            zzea.this.m26460a((C8377b) new C8364y(this, activity, aVar));
            Bundle f = aVar.mo30352f(50);
            if (f != null) {
                bundle.putAll(f);
            }
        }

        public final void onActivityStarted(Activity activity) {
            zzea.this.m26460a((C8377b) new C8348u(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            zzea.this.m26460a((C8377b) new C8360x(this, activity));
        }
    }

    private zzea(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m26469b(str2, str3)) {
            this.f23413a = "FA";
        } else {
            this.f23413a = str;
        }
        this.f23414b = DefaultClock.m16265d();
        this.f23415c = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f23413a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C8378c());
        }
        this.f23416d = new AppMeasurementSdk(this);
        boolean z = false;
        if (!(!m26468b(context) || m26475h())) {
            this.f23420h = null;
            this.f23419g = true;
            Log.w(this.f23413a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m26469b(str2, str3)) {
            this.f23420h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f23413a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f23413a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.f23419g = true;
                return;
            }
        } else {
            this.f23420h = str2;
        }
        m26460a((C8377b) new C8260b(this, context, str2, str3, bundle));
    }

    /* renamed from: a */
    public static zzea m26458a(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.m16037a(context);
        if (f23412j == null) {
            synchronized (zzea.class) {
                if (f23412j == null) {
                    f23412j = new zzea(context, str, str2, str3, bundle);
                }
            }
        }
        return f23412j;
    }

    /* renamed from: b */
    private static boolean m26468b(Context context) {
        try {
            GoogleServices.m15494a(context);
            if (GoogleServices.m15496a() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m26470c(Context context) {
        return DynamiteModule.m16423b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m26472d(Context context) {
        return DynamiteModule.m16417a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* renamed from: h */
    private static boolean m26475h() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final String mo30347e() {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8290h(this, aVar));
        return aVar.mo30351e(500);
    }

    /* renamed from: f */
    public final AppMeasurementSdk mo30348f() {
        return this.f23416d;
    }

    /* renamed from: g */
    public final String mo30349g() {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8295i(this, aVar));
        return aVar.mo30351e(50);
    }

    /* renamed from: c */
    public final String mo30345c() {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8310l(this, aVar));
        return aVar.mo30351e(500);
    }

    /* renamed from: d */
    public final String mo30346d() {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8305k(this, aVar));
        return aVar.mo30351e(500);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m26469b(String str, String str2) {
        return (str2 == null || str == null || m26475h()) ? false : true;
    }

    /* renamed from: b */
    public final void mo30343b(String str, String str2, Bundle bundle) {
        m26464a(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: b */
    public final void mo30342b(String str) {
        m26460a((C8377b) new C8285g(this, str));
    }

    /* renamed from: c */
    public final int mo30344c(String str) {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8328p(this, str, aVar));
        Integer num = (Integer) aVar.mo30350a(aVar.mo30352f(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final String mo30341b() {
        return this.f23420h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m26460a(C8377b bVar) {
        this.f23415c.execute(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzdn mo30332a(Context context) {
        try {
            return zzdo.m26411a(DynamiteModule.m16419a(context, DynamiteModule.f14301j, "com.google.android.gms.measurement.dynamite").mo25547a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m26463a((Exception) e, true, false);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m26463a(Exception exc, boolean z, boolean z2) {
        this.f23419g |= z;
        if (z) {
            Log.w(this.f23413a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo30335a(5, "Error with data collection. Data lost.", (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.f23413a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: a */
    private final void m26464a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m26460a((C8377b) new C8332q(this, l, str, str2, bundle, true, z2));
    }

    /* renamed from: a */
    public final void mo30340a(String str, String str2, Object obj, boolean z) {
        m26460a((C8377b) new C8336r(this, str, str2, obj, true));
    }

    /* renamed from: a */
    public final void mo30337a(Bundle bundle) {
        m26460a((C8377b) new C8340s(this, bundle));
    }

    /* renamed from: a */
    public final void mo30339a(String str, String str2, Bundle bundle) {
        m26460a((C8377b) new C8265c(this, str, str2, bundle));
    }

    /* renamed from: a */
    public final List<Bundle> mo30333a(String str, String str2) {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8270d(this, str, str2, aVar));
        List<Bundle> list = (List) aVar.mo30350a(aVar.mo30352f(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo30336a(Activity activity, String str, String str2) {
        m26460a((C8377b) new C8275e(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo30338a(String str) {
        m26460a((C8377b) new C8280f(this, str));
    }

    /* renamed from: a */
    public final long mo30330a() {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8300j(this, aVar));
        Long l = (Long) aVar.mo30350a(aVar.mo30352f(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f23414b.mo25498b()).nextLong();
        int i = this.f23418f + 1;
        this.f23418f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: a */
    public final Map<String, Object> mo30334a(String str, String str2, boolean z) {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8315m(this, str, str2, z, aVar));
        Bundle f = aVar.mo30352f(5000);
        if (f == null || f.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(f.size());
        for (String str3 : f.keySet()) {
            Object obj = f.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo30335a(int i, String str, Object obj, Object obj2, Object obj3) {
        m26460a((C8377b) new C8320n(this, false, 5, str, obj, obj2, obj3));
    }

    /* renamed from: a */
    public final Bundle mo30331a(Bundle bundle, boolean z) {
        C8376a aVar = new C8376a();
        m26460a((C8377b) new C8324o(this, bundle, aVar));
        if (z) {
            return aVar.mo30352f(5000);
        }
        return null;
    }
}
