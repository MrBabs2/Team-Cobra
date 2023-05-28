package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: com.facebook.internal.l */
/* compiled from: FetchedAppGateKeepersManager */
public final class C6442l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f11841a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<C6445c> f11842b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private static final Map<String, JSONObject> f11843c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Long f11844d;

    /* renamed from: com.facebook.internal.l$a */
    /* compiled from: FetchedAppGateKeepersManager */
    static class C6443a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f11845f;

        /* renamed from: g */
        final /* synthetic */ Context f11846g;

        /* renamed from: h */
        final /* synthetic */ String f11847h;

        C6443a(String str, Context context, String str2) {
            this.f11845f = str;
            this.f11846g = context;
            this.f11847h = str2;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    JSONObject a = C6442l.m13355b(this.f11845f);
                    if (a != null) {
                        JSONObject unused = C6442l.m13356b(this.f11845f, a);
                        this.f11846g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f11847h, a.toString()).apply();
                        Long unused2 = C6442l.f11844d = Long.valueOf(System.currentTimeMillis());
                    }
                    C6442l.m13359d();
                    C6442l.f11841a.set(false);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.l$b */
    /* compiled from: FetchedAppGateKeepersManager */
    static class C6444b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6445c f11848f;

        C6444b(C6445c cVar) {
            this.f11848f = cVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    this.f11848f.onCompleted();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.l$c */
    /* compiled from: FetchedAppGateKeepersManager */
    public interface C6445c {
        void onCompleted();
    }

    /* renamed from: c */
    static void m13358c() {
        m13352a((C6445c) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m13359d() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (!f11842b.isEmpty()) {
            C6445c poll = f11842b.poll();
            if (poll != null) {
                handler.post(new C6444b(poll));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m13355b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C4716f.m7710s());
        bundle.putString("fields", "gatekeepers");
        GraphRequest a = GraphRequest.m13073a((AccessToken) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (GraphRequest.C6344f) null);
        a.mo20831a(true);
        a.mo20826a(bundle);
        return a.mo20825a().mo20919b();
    }

    /* renamed from: a */
    static synchronized void m13352a(C6445c cVar) {
        synchronized (C6442l.class) {
            if (cVar != null) {
                f11842b.add(cVar);
            }
            if (m13357b(f11844d)) {
                m13359d();
                return;
            }
            Context e = C4716f.m7696e();
            String f = C4716f.m7697f();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{f});
            if (e != null) {
                JSONObject jSONObject = null;
                String string = e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                if (!C6476x.m13533d(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        C6476x.m13507a("FacebookSDK", (Exception) e2);
                    }
                    if (jSONObject != null) {
                        m13356b(f, jSONObject);
                    }
                }
                Executor m = C4716f.m7704m();
                if (m != null) {
                    if (f11841a.compareAndSet(false, true)) {
                        m.execute(new C6443a(f, e, format));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized JSONObject m13356b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C6442l.class) {
            if (f11843c.containsKey(str)) {
                jSONObject2 = f11843c.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString(RoomNotification.KEY), jSONObject4.getBoolean(DonationsAnalytics.VALUE));
                    } catch (JSONException e) {
                        C6476x.m13507a("FacebookSDK", (Exception) e);
                    }
                }
            }
            f11843c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: b */
    private static boolean m13357b(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* renamed from: a */
    static JSONObject m13350a(String str, boolean z) {
        if (!z && f11843c.containsKey(str)) {
            return f11843c.get(str);
        }
        JSONObject b = m13355b(str);
        if (b == null) {
            return null;
        }
        Context e = C4716f.m7696e();
        e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b.toString()).apply();
        return m13356b(str, b);
    }

    /* renamed from: a */
    public static boolean m13353a(String str, String str2, boolean z) {
        m13358c();
        return (str2 == null || !f11843c.containsKey(str2)) ? z : f11843c.get(str2).optBoolean(str, z);
    }
}
