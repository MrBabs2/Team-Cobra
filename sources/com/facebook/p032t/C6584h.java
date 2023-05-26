package com.facebook.p032t;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6494l;
import com.facebook.FacebookException;
import com.facebook.internal.C6442l;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6454o;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.p181u.C6643a;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;

/* renamed from: com.facebook.t.h */
/* compiled from: AppEventsLoggerImpl */
class C6584h {

    /* renamed from: c */
    private static final String f12225c = "com.facebook.t.h";

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f12226d;

    /* renamed from: e */
    private static C4728g.C4729a f12227e = C4728g.C4729a.AUTO;

    /* renamed from: f */
    private static final Object f12228f = new Object();

    /* renamed from: g */
    private static String f12229g;

    /* renamed from: h */
    private static boolean f12230h;

    /* renamed from: i */
    private static String f12231i;

    /* renamed from: a */
    private final String f12232a;

    /* renamed from: b */
    private final C6564a f12233b;

    /* renamed from: com.facebook.t.h$a */
    /* compiled from: AppEventsLoggerImpl */
    static class C6585a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f12234f;

        /* renamed from: g */
        final /* synthetic */ C6584h f12235g;

        C6585a(Context context, C6584h hVar) {
            this.f12234f = context;
            this.f12235g = hVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.f12234f.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                        sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                        this.f12235g.mo21326a("fb_sdk_initialize", (Double) null, bundle);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.h$b */
    /* compiled from: AppEventsLoggerImpl */
    static class C6586b implements C6454o.C6456b {
        C6586b() {
        }

        /* renamed from: a */
        public void mo21008a(String str) {
            C6584h.m13972c(str);
        }
    }

    /* renamed from: com.facebook.t.h$c */
    /* compiled from: AppEventsLoggerImpl */
    static class C6587c implements Runnable {
        C6587c() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    HashSet<String> hashSet = new HashSet<>();
                    for (C6564a b : C6575e.m13959e()) {
                        hashSet.add(b.mo21301b());
                    }
                    for (String a : hashSet) {
                        C6448n.m13378a(a, true);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    C6584h(Context context, String str, AccessToken accessToken) {
        this(C6476x.m13519b(context), str, accessToken);
    }

    /* renamed from: a */
    static void m13966a(Application application, String str) {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (C4716f.m7713v()) {
                    C6567b.m13930f();
                    C6601p.m14026g();
                    if (str == null) {
                        str = C4716f.m7697f();
                    }
                    C4716f.m7692b(application, str);
                    C6643a.m14160a(application, str);
                    return;
                }
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    static void m13969b() {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (m13973d() != C4728g.C4729a.EXPLICIT_ONLY) {
                    C6575e.m13953a(C6593j.EAGER_FLUSHING_EVENT);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    static void m13972c(String str) {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                SharedPreferences sharedPreferences = C4716f.m7696e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (str != null) {
                    sharedPreferences.edit().putString("install_referrer", str).apply();
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: d */
    static C4728g.C4729a m13973d() {
        C4728g.C4729a aVar;
        Class<C6584h> cls = C6584h.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            synchronized (f12228f) {
                aVar = f12227e;
            }
            return aVar;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static String m13974e() {
        Class<C6584h> cls = C6584h.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            C6454o.m13395b(new C6586b());
            return C4716f.m7696e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static String m13975f() {
        String str;
        Class<C6584h> cls = C6584h.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            synchronized (f12228f) {
                str = f12231i;
            }
            return str;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    private static void m13976g() {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                synchronized (f12228f) {
                    if (f12226d == null) {
                        f12226d = new ScheduledThreadPoolExecutor(1);
                        f12226d.scheduleAtFixedRate(new C6587c(), 0, 86400, TimeUnit.SECONDS);
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: h */
    static void m13977h() {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6575e.m13960f();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    C6584h(String str, String str2, AccessToken accessToken) {
        C6481y.m13563c();
        this.f12232a = str;
        accessToken = accessToken == null ? AccessToken.m13036r() : accessToken;
        if (accessToken == null || accessToken.mo20790o() || (str2 != null && !str2.equals(accessToken.mo20776a()))) {
            this.f12233b = new C6564a((String) null, str2 == null ? C6476x.m13530d(C4716f.m7696e()) : str2);
        } else {
            this.f12233b = new C6564a(accessToken);
        }
        m13976g();
    }

    /* renamed from: b */
    private static void m13970b(String str) {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6460r.m13407a(C6494l.DEVELOPER_ERRORS, "AppEvents", str);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    static Executor m13971c() {
        Class<C6584h> cls = C6584h.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (f12226d == null) {
                m13976g();
            }
            return f12226d;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static void m13967a(Context context, String str) {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (C4716f.m7700i()) {
                    f12226d.execute(new C6585a(context, new C6584h(context, str, (AccessToken) null)));
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21323a(String str) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21325a(str, (Bundle) null);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21325a(String str, Bundle bundle) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21327a(str, (Double) null, bundle, false, C6643a.m14177m());
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21324a(String str, double d, Bundle bundle) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21327a(str, Double.valueOf(d), bundle, false, C6643a.m14177m());
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21328a(String str, String str2) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", DiskLruCache.VERSION_1);
                bundle.putString("_button_text", str2);
                mo21325a(str, bundle);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21330a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21331a(bigDecimal, currency, bundle, true);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21331a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!C6391a.m13260a((Object) this)) {
            if (bigDecimal == null) {
                try {
                    m13970b("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            } else if (currency == null) {
                m13970b("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                mo21327a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C6643a.m14177m());
                m13969b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21322a() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C6575e.m13953a(C6593j.EXPLICIT);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21326a(String str, Double d, Bundle bundle) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21327a(str, d, bundle, true, C6643a.m14177m());
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21329a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C6391a.m13260a((Object) this)) {
            if (bigDecimal == null || currency == null) {
                C6476x.m13528c(f12225c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            mo21327a(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C6643a.m14177m());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21327a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (!C6391a.m13260a((Object) this) && str != null) {
            try {
                if (!str.isEmpty()) {
                    if (C6442l.m13353a("app_events_killswitch", C4716f.m7697f(), false)) {
                        C6460r.m13408a(C6494l.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    m13968a(new C6570c(this.f12232a, str, d, bundle, z, C6643a.m14179o(), uuid), this.f12233b);
                }
            } catch (JSONException e) {
                C6460r.m13408a(C6494l.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C6460r.m13408a(C6494l.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private static void m13968a(C6570c cVar, C6564a aVar) {
        Class<C6584h> cls = C6584h.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6575e.m13952a(aVar, cVar);
                if (!cVar.mo21306a() && !f12230h) {
                    if (cVar.mo21308c().equals("fb_mobile_activate_app")) {
                        f12230h = true;
                    } else {
                        C6460r.m13407a(C6494l.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static String m13965a(Context context) {
        Class<C6584h> cls = C6584h.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (f12229g == null) {
                synchronized (f12228f) {
                    if (f12229g == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                        f12229g = string;
                        if (string == null) {
                            f12229g = "XZ" + UUID.randomUUID().toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f12229g).apply();
                        }
                    }
                }
            }
            return f12229g;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
