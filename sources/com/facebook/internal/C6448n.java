package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.C6446m;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.p178g.C6638e;
import com.facebook.p032t.p181u.C6654d;
import com.facebook.p032t.p181u.C6656e;
import com.facebook.p032t.p181u.C6660h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
/* compiled from: FetchedAppSettingsManager */
public final class C6448n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11865a = "n";

    /* renamed from: b */
    private static final String[] f11866b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C6446m> f11867c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicReference<C6452d> f11868d = new AtomicReference<>(C6452d.NOT_LOADED);

    /* renamed from: e */
    private static final ConcurrentLinkedQueue<C6453e> f11869e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f11870f = false;

    /* renamed from: g */
    private static JSONArray f11871g = null;

    /* renamed from: com.facebook.internal.n$a */
    /* compiled from: FetchedAppSettingsManager */
    static class C6449a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f11872f;

        /* renamed from: g */
        final /* synthetic */ String f11873g;

        /* renamed from: h */
        final /* synthetic */ String f11874h;

        C6449a(Context context, String str, String str2) {
            this.f11872f = context;
            this.f11873g = str;
            this.f11874h = str2;
        }

        public void run() {
            SharedPreferences sharedPreferences;
            C6446m mVar;
            JSONObject jSONObject;
            if (!C6391a.m13260a((Object) this)) {
                try {
                    sharedPreferences = this.f11872f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    mVar = null;
                    String string = sharedPreferences.getString(this.f11873g, (String) null);
                    if (!C6476x.m13533d(string)) {
                        jSONObject = new JSONObject(string);
                        if (jSONObject != null) {
                            mVar = C6448n.m13383b(this.f11874h, jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    C6476x.m13507a("FacebookSDK", (Exception) e);
                    jSONObject = null;
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                    return;
                }
                JSONObject a = C6448n.m13385b(this.f11874h);
                if (a != null) {
                    C6446m unused = C6448n.m13383b(this.f11874h, a);
                    sharedPreferences.edit().putString(this.f11873g, a.toString()).apply();
                }
                if (mVar != null) {
                    String i = mVar.mo20996i();
                    if (!C6448n.f11870f && i != null && i.length() > 0) {
                        boolean unused2 = C6448n.f11870f = true;
                        Log.w(C6448n.f11865a, i);
                    }
                }
                C6442l.m13350a(this.f11874h, true);
                C6654d.m14194b();
                C6660h.m14208e();
                C6448n.f11868d.set(C6448n.f11867c.containsKey(this.f11874h) ? C6452d.SUCCESS : C6452d.ERROR);
                C6448n.m13391g();
            }
        }
    }

    /* renamed from: com.facebook.internal.n$b */
    /* compiled from: FetchedAppSettingsManager */
    static class C6450b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6453e f11875f;

        C6450b(C6453e eVar) {
            this.f11875f = eVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    this.f11875f.onError();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.n$c */
    /* compiled from: FetchedAppSettingsManager */
    static class C6451c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6453e f11876f;

        /* renamed from: g */
        final /* synthetic */ C6446m f11877g;

        C6451c(C6453e eVar, C6446m mVar) {
            this.f11876f = eVar;
            this.f11877g = mVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    this.f11876f.mo21006a(this.f11877g);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.n$d */
    /* compiled from: FetchedAppSettingsManager */
    enum C6452d {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.n$e */
    /* compiled from: FetchedAppSettingsManager */
    public interface C6453e {
        /* renamed from: a */
        void mo21006a(C6446m mVar);

        void onError();
    }

    /* renamed from: f */
    public static void m13390f() {
        Context e = C4716f.m7696e();
        String f = C4716f.m7697f();
        if (C6476x.m13533d(f)) {
            f11868d.set(C6452d.ERROR);
            m13391g();
        } else if (f11867c.containsKey(f)) {
            f11868d.set(C6452d.SUCCESS);
            m13391g();
        } else {
            if (!(f11868d.compareAndSet(C6452d.NOT_LOADED, C6452d.LOADING) || f11868d.compareAndSet(C6452d.ERROR, C6452d.LOADING))) {
                m13391g();
            } else {
                C4716f.m7704m().execute(new C6449a(e, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{f}), f));
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m13391g() {
        /*
            java.lang.Class<com.facebook.internal.n> r0 = com.facebook.internal.C6448n.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.n$d> r1 = f11868d     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$d r1 = (com.facebook.internal.C6448n.C6452d) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$d r2 = com.facebook.internal.C6448n.C6452d.NOT_LOADED     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            com.facebook.internal.n$d r2 = com.facebook.internal.C6448n.C6452d.LOADING     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.String r2 = com.facebook.C4716f.m7697f()     // Catch:{ all -> 0x0071 }
            java.util.Map<java.lang.String, com.facebook.internal.m> r3 = f11867c     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m r2 = (com.facebook.internal.C6446m) r2     // Catch:{ all -> 0x0071 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0071 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$d r4 = com.facebook.internal.C6448n.C6452d.ERROR     // Catch:{ all -> 0x0071 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f11869e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f11869e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$e r1 = (com.facebook.internal.C6448n.C6453e) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$b r2 = new com.facebook.internal.n$b     // Catch:{ all -> 0x0071 }
            r2.<init>(r1)     // Catch:{ all -> 0x0071 }
            r3.post(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0039
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f11869e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x006d
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.n$e> r1 = f11869e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$e r1 = (com.facebook.internal.C6448n.C6453e) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n$c r4 = new com.facebook.internal.n$c     // Catch:{ all -> 0x0071 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0071 }
            r3.post(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            return
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0075
        L_0x0074:
            throw r1
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6448n.m13391g():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6446m m13383b(String str, JSONObject jSONObject) {
        C6430h hVar;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            hVar = C6430h.m13325a();
        } else {
            hVar = C6430h.m13326a(optJSONArray);
        }
        C6430h hVar2 = hVar;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f11871g = optJSONArray2;
        if (optJSONArray2 != null && C6457p.m13402b()) {
            C6638e.m14127a(optJSONArray2.toString());
        }
        C6446m mVar = r2;
        C6446m mVar2 = new C6446m(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", C6656e.m14195a()), C6475w.m13476a(jSONObject2.optLong("seamless_login")), m13379a(jSONObject2.optJSONObject("android_dialog_configs")), z, hVar2, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4, z5, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"));
        C6446m mVar3 = mVar;
        f11867c.put(str, mVar3);
        return mVar3;
    }

    /* renamed from: c */
    public static C6446m m13386c(String str) {
        if (str != null) {
            return f11867c.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static C6446m m13378a(String str, boolean z) {
        if (!z && f11867c.containsKey(str)) {
            return f11867c.get(str);
        }
        JSONObject b = m13385b(str);
        if (b == null) {
            return null;
        }
        C6446m b2 = m13383b(str, b);
        if (str.equals(C4716f.m7697f())) {
            f11868d.set(C6452d.SUCCESS);
            m13391g();
        }
        return b2;
    }

    /* renamed from: a */
    private static Map<String, Map<String, C6446m.C6447a>> m13379a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C6446m.C6447a a = C6446m.C6447a.m13373a(optJSONArray.optJSONObject(i));
                if (a != null) {
                    String a2 = a.mo21001a();
                    Map map = (Map) hashMap.get(a2);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a2, map);
                    }
                    map.put(a.mo21002b(), a);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m13385b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f11866b))));
        GraphRequest a = GraphRequest.m13073a((AccessToken) null, str, (GraphRequest.C6344f) null);
        a.mo20831a(true);
        a.mo20826a(bundle);
        return a.mo20825a().mo20919b();
    }
}
