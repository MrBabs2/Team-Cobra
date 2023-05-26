package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h */
/* compiled from: FacebookRequestErrorClassification */
public final class C6430h {

    /* renamed from: g */
    private static C6430h f11801g;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f11802a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f11803b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f11804c;

    /* renamed from: d */
    private final String f11805d;

    /* renamed from: e */
    private final String f11806e;

    /* renamed from: f */
    private final String f11807f;

    /* renamed from: com.facebook.internal.h$a */
    /* compiled from: FacebookRequestErrorClassification */
    static class C6431a extends HashMap<Integer, Set<Integer>> {
        C6431a() {
            put(2, (Object) null);
            put(4, (Object) null);
            put(9, (Object) null);
            put(17, (Object) null);
            put(341, (Object) null);
        }
    }

    /* renamed from: com.facebook.internal.h$b */
    /* compiled from: FacebookRequestErrorClassification */
    static class C6432b extends HashMap<Integer, Set<Integer>> {
        C6432b() {
            put(102, (Object) null);
            put(190, (Object) null);
            put(412, (Object) null);
        }
    }

    /* renamed from: com.facebook.internal.h$c */
    /* compiled from: FacebookRequestErrorClassification */
    static /* synthetic */ class C6433c {

        /* renamed from: a */
        static final /* synthetic */ int[] f11808a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.FacebookRequestError$b[] r0 = com.facebook.FacebookRequestError.C6336b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11808a = r0
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C6336b.OTHER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11808a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C6336b.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11808a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.FacebookRequestError$b r1 = com.facebook.FacebookRequestError.C6336b.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6430h.C6433c.<clinit>():void");
        }
    }

    C6430h(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f11802a = map;
        this.f11803b = map2;
        this.f11804c = map3;
        this.f11805d = str;
        this.f11806e = str2;
        this.f11807f = str3;
    }

    /* renamed from: b */
    private static C6430h m13328b() {
        return new C6430h((Map<Integer, Set<Integer>>) null, new C6431a(), new C6432b(), (String) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public String mo20978a(FacebookRequestError.C6336b bVar) {
        int i = C6433c.f11808a[bVar.ordinal()];
        if (i == 1) {
            return this.f11805d;
        }
        if (i == 2) {
            return this.f11807f;
        }
        if (i != 3) {
            return null;
        }
        return this.f11806e;
    }

    /* renamed from: a */
    public FacebookRequestError.C6336b mo20977a(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return FacebookRequestError.C6336b.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f11802a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.f11802a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C6336b.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f11804c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.f11804c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C6336b.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f11803b;
        if (map3 == null || !map3.containsKey(Integer.valueOf(i)) || ((set = this.f11803b.get(Integer.valueOf(i))) != null && !set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.C6336b.OTHER;
        }
        return FacebookRequestError.C6336b.TRANSIENT;
    }

    /* renamed from: a */
    public static synchronized C6430h m13325a() {
        C6430h hVar;
        synchronized (C6430h.class) {
            if (f11801g == null) {
                f11801g = m13328b();
            }
            hVar = f11801g;
        }
        return hVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m13327a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C6430h m13326a(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", (String) null);
                    map = m13327a(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", (String) null);
                    map2 = m13327a(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", (String) null);
                    map3 = m13327a(optJSONObject);
                }
            }
        }
        return new C6430h(map, map2, map3, str, str2, str3);
    }
}
