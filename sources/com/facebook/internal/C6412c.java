package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
/* compiled from: BundleJSONConverter */
public class C6412c {

    /* renamed from: a */
    private static final Map<Class<?>, C6420h> f11780a;

    /* renamed from: com.facebook.internal.c$a */
    /* compiled from: BundleJSONConverter */
    static class C6413a implements C6420h {
        C6413a() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    /* compiled from: BundleJSONConverter */
    static class C6414b implements C6420h {
        C6414b() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c */
    /* compiled from: BundleJSONConverter */
    static class C6415c implements C6420h {
        C6415c() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    /* compiled from: BundleJSONConverter */
    static class C6416d implements C6420h {
        C6416d() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    /* compiled from: BundleJSONConverter */
    static class C6417e implements C6420h {
        C6417e() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    /* compiled from: BundleJSONConverter */
    static class C6418f implements C6420h {
        C6418f() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    /* compiled from: BundleJSONConverter */
    static class C6419g implements C6420h {
        C6419g() {
        }

        /* renamed from: a */
        public void mo20970a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.c$h */
    /* compiled from: BundleJSONConverter */
    public interface C6420h {
        /* renamed from: a */
        void mo20970a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f11780a = hashMap;
        hashMap.put(Boolean.class, new C6413a());
        f11780a.put(Integer.class, new C6414b());
        f11780a.put(Long.class, new C6415c());
        f11780a.put(Double.class, new C6416d());
        f11780a.put(String.class, new C6417e());
        f11780a.put(String[].class, new C6418f());
        f11780a.put(JSONArray.class, new C6419g());
    }

    /* renamed from: a */
    public static Bundle m13298a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m13298a((JSONObject) obj));
                } else {
                    C6420h hVar = f11780a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.mo20970a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
