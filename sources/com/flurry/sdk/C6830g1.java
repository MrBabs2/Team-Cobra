package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.g1 */
public final class C6830g1 {

    /* renamed from: a */
    private static List<C6846h1> f12778a = new ArrayList();

    /* renamed from: b */
    private static final Map<Class<? extends C6846h1>, C6806e1> f12779b = new LinkedHashMap();

    /* renamed from: c */
    private static List<C6806e1> f12780c;

    /* renamed from: d */
    private static final Map<Class<? extends C6846h1>, C6846h1> f12781d = new LinkedHashMap();

    /* renamed from: e */
    private static List<String> f12782e;

    static {
        ArrayList arrayList = new ArrayList();
        f12782e = arrayList;
        arrayList.add("com.flurry.android.marketing.core.FlurryMarketingCoreModule");
        f12782e.add("com.flurry.android.marketing.FlurryMarketingModule");
        f12782e.add("com.flurry.android.config.killswitch.FlurryKillSwitchModule");
        f12782e.add("com.flurry.android.nativecrash.FlurryNativeCrashModule");
        f12782e.add("com.flurry.android.nativecrash.internal.FlurryNativeCrashModuleStreamingImpl");
        f12782e.add("com.flurry.android.FlurryAdModule");
        f12782e.add("com.flurry.android.ymadlite.YahooAdModule");
    }

    /* renamed from: a */
    public static void m14542a(Class<? extends C6846h1> cls) {
        C6792d1.m14476a(3, "FlurryModuleManager", "Register Ads ".concat(String.valueOf(cls)));
        if (cls != null) {
            synchronized (f12779b) {
                f12779b.put(cls, new C6806e1(cls));
            }
        }
    }

    /* renamed from: b */
    public static void m14543b(Context context) {
        C6792d1.m14476a(2, "FlurryModuleManager", "Init Add on modules");
        synchronized (f12781d) {
            for (C6846h1 next : f12778a) {
                try {
                    C6792d1.m14476a(2, "FlurryModuleManager", "Module list: ".concat(String.valueOf(next)));
                    if (f12781d.containsKey(next.getClass())) {
                        C6792d1.m14476a(5, "FlurryModuleManager", next.getClass() + " has been initialized");
                    } else {
                        next.mo23602a(context);
                        f12781d.put(next.getClass(), next);
                        C6792d1.m14476a(3, "FlurryModuleManager", "Initialized modules: " + next.getClass());
                    }
                } catch (C6803da e) {
                    C6792d1.m14483b("FlurryModuleManager", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14541a(C6846h1 h1Var) {
        C6792d1.m14476a(3, "FlurryModuleManager", "Register Add-On ".concat(String.valueOf(h1Var)));
        if (h1Var != null) {
            boolean z = false;
            Iterator<C6846h1> it = f12778a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getClass().getSimpleName().equals(h1Var.getClass().getSimpleName())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                f12778a.add(h1Var);
                return;
            }
            C6792d1.m14476a(3, "FlurryModuleManager", h1Var + " has been register already as addOn module");
            return;
        }
        C6792d1.m14476a(5, "FlurryModuleManager", "Module is null, cannot register it");
    }

    /* renamed from: a */
    public static void m14540a(Context context) {
        ArrayList<C6806e1> arrayList;
        C6792d1.m14476a(3, "FlurryModuleManager", "Init Ads");
        synchronized (f12779b) {
            arrayList = new ArrayList<>(f12779b.values());
            f12780c = arrayList;
        }
        for (C6806e1 e1Var : arrayList) {
            C6792d1.m14476a(5, "FlurryModuleManager", "registration ".concat(String.valueOf(e1Var)));
            try {
                if (e1Var.f12683a != null && Build.VERSION.SDK_INT >= e1Var.f12684b) {
                    C6846h1 h1Var = (C6846h1) e1Var.f12683a.newInstance();
                    h1Var.mo23602a(context);
                    f12781d.put(e1Var.f12683a, h1Var);
                }
            } catch (Exception e) {
                C6792d1.m14477a(5, "FlurryModuleManager", "Flurry Module for class " + e1Var.f12683a + " is not available:", e);
            }
        }
    }
}
