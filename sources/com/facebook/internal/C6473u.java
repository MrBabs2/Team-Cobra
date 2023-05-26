package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.u */
/* compiled from: ProfileInformationCache */
class C6473u {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f11912a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m13470a(String str) {
        return f11912a.get(str);
    }

    /* renamed from: a */
    public static void m13471a(String str, JSONObject jSONObject) {
        f11912a.put(str, jSONObject);
    }
}
