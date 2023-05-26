package com.facebook.p032t.p183w;

import android.util.Log;
import com.facebook.C4716f;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.w.a */
/* compiled from: RestrictiveDataManager */
public final class C6684a {

    /* renamed from: a */
    private static boolean f12462a = false;

    /* renamed from: b */
    private static final String f12463b = "com.facebook.t.w.a";

    /* renamed from: c */
    private static final List<C6685a> f12464c = new ArrayList();

    /* renamed from: d */
    private static final Set<String> f12465d = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.t.w.a$a */
    /* compiled from: RestrictiveDataManager */
    static class C6685a {

        /* renamed from: a */
        String f12466a;

        /* renamed from: b */
        Map<String, String> f12467b;

        C6685a(String str, Map<String, String> map) {
            this.f12466a = str;
            this.f12467b = map;
        }
    }

    /* renamed from: a */
    public static void m14298a() {
        Class<C6684a> cls = C6684a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12462a = true;
                m14302b();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static void m14302b() {
        String h;
        Class<C6684a> cls = C6684a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6446m a = C6448n.m13378a(C4716f.m7697f(), false);
                if (a != null && (h = a.mo20995h()) != null) {
                    if (!h.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(h);
                        f12464c.clear();
                        f12465d.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C6685a aVar = new C6685a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.f12467b = C6476x.m13498a(optJSONObject);
                                    f12464c.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f12465d.add(aVar.f12466a);
                                }
                            }
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
    public static void m14299a(Map<String, String> map, String str) {
        Class<C6684a> cls = C6684a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12462a) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String a = m14297a(str, str2);
                        if (a != null) {
                            hashMap.put(str2, a);
                            map.remove(str2);
                        }
                    }
                    if (hashMap.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static String m14297a(String str, String str2) {
        Class<C6684a> cls = C6684a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            for (C6685a aVar : new ArrayList(f12464c)) {
                if (aVar != null) {
                    if (str.equals(aVar.f12466a)) {
                        for (String next : aVar.f12467b.keySet()) {
                            if (str2.equals(next)) {
                                return aVar.f12467b.get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w(f12463b, "getMatchedRuleType failed", e);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public static String m14301b(String str) {
        Class<C6684a> cls = C6684a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return (!f12462a || !m14300a(str)) ? str : "_removed_";
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m14300a(String str) {
        Class<C6684a> cls = C6684a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return f12465d.contains(str);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }
}
