package com.facebook.p032t.p184x;

import android.content.SharedPreferences;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.t.x.b */
/* compiled from: PredictionHistoryManager */
final class C6687b {

    /* renamed from: a */
    private static final Map<String, String> f12473a = new HashMap();

    /* renamed from: b */
    private static SharedPreferences f12474b;

    /* renamed from: c */
    private static final AtomicBoolean f12475c = new AtomicBoolean(false);

    C6687b() {
    }

    /* renamed from: a */
    private static void m14319a() {
        Class<C6687b> cls = C6687b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12475c.get()) {
                    SharedPreferences sharedPreferences = C4716f.m7696e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    f12474b = sharedPreferences;
                    f12473a.putAll(C6476x.m13497a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
                    f12475c.set(true);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static void m14320a(String str, String str2) {
        Class<C6687b> cls = C6687b.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12475c.get()) {
                    m14319a();
                }
                f12473a.put(str, str2);
                f12474b.edit().putString("SUGGESTED_EVENTS_HISTORY", C6476x.m13489a(f12473a)).apply();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|(1:9)|17|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m14317a(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.Class<com.facebook.t.x.b> r0 = com.facebook.p032t.p184x.C6687b.class
            boolean r1 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r1.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "text"
            r1.put(r3, r5)     // Catch:{ JSONException -> 0x0030 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0030 }
            r5.<init>()     // Catch:{ JSONException -> 0x0030 }
        L_0x0019:
            if (r4 == 0) goto L_0x002b
            java.lang.Class r3 = r4.getClass()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ JSONException -> 0x0030 }
            r5.put(r3)     // Catch:{ JSONException -> 0x0030 }
            android.view.ViewGroup r4 = com.facebook.p032t.p177r.p178g.C6639f.m14143i(r4)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0019
        L_0x002b:
            java.lang.String r4 = "classname"
            r1.put(r4, r5)     // Catch:{ JSONException -> 0x0030 }
        L_0x0030:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = com.facebook.internal.C6476x.m13540g((java.lang.String) r4)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0039:
            r4 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p184x.C6687b.m14317a(android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    static String m14318a(String str) {
        Class<C6687b> cls = C6687b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (f12473a.containsKey(str)) {
                return f12473a.get(str);
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
