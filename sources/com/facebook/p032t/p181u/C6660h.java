package com.facebook.p032t.p181u;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.u.h */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
public class C6660h {

    /* renamed from: a */
    private static final String f12405a = "com.facebook.t.u.h";

    /* renamed from: b */
    private static final AtomicBoolean f12406b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f12407c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Boolean f12408d = null;

    /* renamed from: e */
    private static ServiceConnection f12409e;

    /* renamed from: f */
    private static Application.ActivityLifecycleCallbacks f12410f;

    /* renamed from: g */
    private static Intent f12411g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Object f12412h;

    /* renamed from: com.facebook.t.u.h$a */
    /* compiled from: InAppPurchaseActivityLifecycleTracker */
    static class C6661a implements ServiceConnection {
        C6661a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = C6660h.f12412h = C6665i.m14210a(C4716f.m7696e(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.facebook.t.u.h$b */
    /* compiled from: InAppPurchaseActivityLifecycleTracker */
    static class C6662b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: com.facebook.t.u.h$b$a */
        /* compiled from: InAppPurchaseActivityLifecycleTracker */
        class C6663a implements Runnable {
            C6663a(C6662b bVar) {
            }

            public void run() {
                if (!C6391a.m13260a((Object) this)) {
                    try {
                        Context e = C4716f.m7696e();
                        C6660h.m14205b(e, C6665i.m14220b(e, C6660h.f12412h), false);
                        C6660h.m14205b(e, C6665i.m14225c(e, C6660h.f12412h), true);
                    } catch (Throwable th) {
                        C6391a.m13259a(th, this);
                    }
                }
            }
        }

        /* renamed from: com.facebook.t.u.h$b$b */
        /* compiled from: InAppPurchaseActivityLifecycleTracker */
        class C6664b implements Runnable {
            C6664b(C6662b bVar) {
            }

            public void run() {
                if (!C6391a.m13260a((Object) this)) {
                    try {
                        Context e = C4716f.m7696e();
                        ArrayList<String> b = C6665i.m14220b(e, C6660h.f12412h);
                        if (b.isEmpty()) {
                            b = C6665i.m14213a(e, C6660h.f12412h);
                        }
                        C6660h.m14205b(e, b, false);
                    } catch (Throwable th) {
                        C6391a.m13259a(th, this);
                    }
                }
            }
        }

        C6662b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            try {
                C4716f.m7704m().execute(new C6663a(this));
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (C6660h.f12408d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C4716f.m7704m().execute(new C6664b(this));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m14206c() {
        if (f12407c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                f12407c = true;
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    f12408d = true;
                } catch (ClassNotFoundException unused) {
                    f12408d = false;
                }
                C6665i.m14217a();
                f12411g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                f12409e = new C6661a();
                f12410f = new C6662b();
            } catch (ClassNotFoundException unused2) {
                f12407c = false;
            }
        }
    }

    /* renamed from: d */
    private static void m14207d() {
        if (f12406b.compareAndSet(false, true)) {
            Context e = C4716f.m7696e();
            if (e instanceof Application) {
                ((Application) e).registerActivityLifecycleCallbacks(f12410f);
                e.bindService(f12411g, f12409e, 1);
            }
        }
    }

    /* renamed from: e */
    public static void m14208e() {
        m14206c();
        if (f12407c.booleanValue() && C6654d.m14193a()) {
            m14207d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m14205b(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f12405a, "Error parsing in-app purchase data.", e);
                }
            }
            for (Map.Entry next2 : C6665i.m14216a(context, arrayList2, f12412h, z).entrySet()) {
                C6654d.m14192a((String) hashMap.get(next2.getKey()), (String) next2.getValue(), z);
            }
        }
    }
}
