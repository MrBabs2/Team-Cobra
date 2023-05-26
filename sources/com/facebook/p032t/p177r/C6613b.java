package com.facebook.p032t.p177r;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.C6629f;
import com.facebook.p032t.p181u.C6650b;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.t.r.b */
/* compiled from: CodelessManager */
public final class C6613b {

    /* renamed from: a */
    private static final C6629f f12290a = new C6629f();

    /* renamed from: b */
    private static SensorManager f12291b;

    /* renamed from: c */
    private static C6623e f12292c;

    /* renamed from: d */
    private static String f12293d;

    /* renamed from: e */
    private static final AtomicBoolean f12294e = new AtomicBoolean(true);

    /* renamed from: f */
    private static Boolean f12295f = false;

    /* renamed from: g */
    private static volatile Boolean f12296g = false;

    /* renamed from: com.facebook.t.r.b$a */
    /* compiled from: CodelessManager */
    static class C6614a implements C6629f.C6630a {

        /* renamed from: a */
        final /* synthetic */ C6446m f12297a;

        /* renamed from: b */
        final /* synthetic */ String f12298b;

        C6614a(C6446m mVar, String str) {
            this.f12297a = mVar;
            this.f12298b = str;
        }

        /* renamed from: a */
        public void mo21364a() {
            C6446m mVar = this.f12297a;
            boolean z = true;
            boolean z2 = mVar != null && mVar.mo20989b();
            if (!C4716f.m7703l()) {
                z = false;
            }
            if (z2 && z) {
                C6613b.m14062a(this.f12298b);
            }
        }
    }

    /* renamed from: com.facebook.t.r.b$b */
    /* compiled from: CodelessManager */
    static class C6615b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12299f;

        C6615b(String str) {
            this.f12299f = str;
        }

        public void run() {
            String str = "0";
            if (!C6391a.m13260a((Object) this)) {
                try {
                    boolean z = true;
                    GraphRequest a = GraphRequest.m13074a((AccessToken) null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{this.f12299f}), (JSONObject) null, (GraphRequest.C6344f) null);
                    Bundle h = a.mo20838h();
                    if (h == null) {
                        h = new Bundle();
                    }
                    C6372a d = C6372a.m13215d(C4716f.m7696e());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(Build.MODEL != null ? Build.MODEL : "");
                    if (d == null || d.mo20927a() == null) {
                        jSONArray.put("");
                    } else {
                        jSONArray.put(d.mo20927a());
                    }
                    jSONArray.put(str);
                    if (C6650b.m14187d()) {
                        str = DiskLruCache.VERSION_1;
                    }
                    jSONArray.put(str);
                    Locale c = C6476x.m13527c();
                    jSONArray.put(c.getLanguage() + "_" + c.getCountry());
                    String jSONArray2 = jSONArray.toString();
                    h.putString("device_session_id", C6613b.m14072e());
                    h.putString("extinfo", jSONArray2);
                    a.mo20826a(h);
                    JSONObject b = a.mo20825a().mo20919b();
                    if (b == null || !b.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    C6613b.m14060a(Boolean.valueOf(z));
                    if (!C6613b.m14059a().booleanValue()) {
                        C6613b.m14065b((String) null);
                    } else if (C6613b.m14063b() != null) {
                        C6613b.m14063b().mo21379a();
                    }
                    C6613b.m14064b((Boolean) false);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14062a(String str) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14070c(str);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m14065b(String str) {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12293d = str;
            return str;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static void m14068c(Activity activity) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12294e.get()) {
                    C6616c.m14078b().mo21366a(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String f = C4716f.m7697f();
                    C6446m c = C6448n.m13386c(f);
                    if (c == null) {
                        return;
                    }
                    if (c.mo20989b()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        f12291b = sensorManager;
                        if (sensorManager != null) {
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            f12292c = new C6623e(activity);
                            f12290a.mo21385a(new C6614a(c, f));
                            f12291b.registerListener(f12290a, defaultSensor, 2);
                            if (c != null && c.mo20989b()) {
                                f12292c.mo21379a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static void m14071d() {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12294e.set(true);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: e */
    static String m14072e() {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (f12293d == null) {
                f12293d = UUID.randomUUID().toString();
            }
            return f12293d;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static boolean m14073f() {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return f12295f.booleanValue();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m14059a() {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12295f;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ C6623e m14063b() {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12292c;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m14060a(Boolean bool) {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12295f = bool;
            return bool;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m14064b(Boolean bool) {
        Class<C6613b> cls = C6613b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12296g = bool;
            return bool;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static void m14061a(Activity activity) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6616c.m14078b().mo21367b(activity);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static void m14066b(Activity activity) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12294e.get()) {
                    C6616c.m14078b().mo21368c(activity);
                    if (f12292c != null) {
                        f12292c.mo21380b();
                    }
                    if (f12291b != null) {
                        f12291b.unregisterListener(f12290a);
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static void m14067c() {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12294e.set(false);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    private static void m14070c(String str) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12296g.booleanValue()) {
                    f12296g = true;
                    C4716f.m7704m().execute(new C6615b(str));
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    static void m14069c(Boolean bool) {
        Class<C6613b> cls = C6613b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12295f = bool;
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }
}
