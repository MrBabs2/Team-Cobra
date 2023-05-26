package com.facebook.p032t.p184x;

import android.app.Activity;
import com.facebook.C4716f;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p181u.C6643a;
import com.facebook.p032t.p182v.C6673c;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.t.x.d */
/* compiled from: SuggestedEventsManager */
public final class C6689d {

    /* renamed from: a */
    private static final AtomicBoolean f12477a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Set<String> f12478b = new HashSet();

    /* renamed from: c */
    private static final Set<String> f12479c = new HashSet();

    /* renamed from: a */
    public static synchronized void m14326a() {
        Class<C6689d> cls = C6689d.class;
        synchronized (cls) {
            if (!C6391a.m13260a((Object) cls)) {
                try {
                    if (!f12477a.get()) {
                        f12477a.set(true);
                        m14329b();
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m14329b() {
        String l;
        File a;
        Class<C6689d> cls = C6689d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6446m a2 = C6448n.m13378a(C4716f.m7697f(), false);
                if (a2 != null && (l = a2.mo20999l()) != null) {
                    JSONObject jSONObject = new JSONObject(l);
                    if (jSONObject.has("production_events")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            f12478b.add(jSONArray.getString(i));
                        }
                    }
                    if (jSONObject.has("eligible_for_prediction_events")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            f12479c.add(jSONArray2.getString(i2));
                        }
                    }
                    if ((!f12478b.isEmpty() || !f12479c.isEmpty()) && (a = C6673c.m14254a(C6673c.C6678e.MTML_APP_EVENT_PREDICTION)) != null) {
                        C6686a.m14305a(a);
                        Activity l2 = C6643a.m14176l();
                        if (l2 != null) {
                            m14327a(l2);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    public static void m14327a(Activity activity) {
        Class<C6689d> cls = C6689d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12477a.get() || !C6686a.m14308a() || (f12478b.isEmpty() && f12479c.isEmpty())) {
                    C6690e.m14335b(activity);
                } else {
                    C6690e.m14333a(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static boolean m14328a(String str) {
        Class<C6689d> cls = C6689d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return f12479c.contains(str);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    static boolean m14330b(String str) {
        Class<C6689d> cls = C6689d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return f12478b.contains(str);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }
}
