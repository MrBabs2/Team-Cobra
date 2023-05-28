package com.facebook.p032t;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p176q.C6606c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.t.p */
/* compiled from: UserDataStore */
public class C6601p {

    /* renamed from: a */
    private static final String f12258a = "p";

    /* renamed from: b */
    private static SharedPreferences f12259b;

    /* renamed from: c */
    private static AtomicBoolean f12260c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentHashMap<String, String> f12261d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f12262e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.t.p$a */
    /* compiled from: UserDataStore */
    static class C6602a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12263f;

        /* renamed from: g */
        final /* synthetic */ String f12264g;

        C6602a(String str, String str2) {
            this.f12263f = str;
            this.f12264g = str2;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (!C6601p.m14018a().get()) {
                        C6601p.m14020b();
                    }
                    C6601p.m14022c().edit().putString(this.f12263f, this.f12264g).apply();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ AtomicBoolean m14018a() {
        Class<C6601p> cls = C6601p.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12260c;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m14020b() {
        Class<C6601p> cls = C6601p.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14025f();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ SharedPreferences m14022c() {
        Class<C6601p> cls = C6601p.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12259b;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static String m14023d() {
        Class<C6601p> cls = C6601p.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (!f12260c.get()) {
                m14025f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f12261d);
            hashMap.putAll(m14024e());
            return C6476x.m13489a((Map<String, String>) hashMap);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    private static Map<String, String> m14024e() {
        Class<C6601p> cls = C6601p.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> d = C6606c.m14040d();
            for (String next : f12262e.keySet()) {
                if (d.contains(next)) {
                    hashMap.put(next, f12262e.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private static synchronized void m14025f() {
        Class<C6601p> cls = C6601p.class;
        synchronized (cls) {
            if (!C6391a.m13260a((Object) cls)) {
                try {
                    if (!f12260c.get()) {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e());
                        f12259b = defaultSharedPreferences;
                        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                        String string2 = f12259b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                        f12261d.putAll(C6476x.m13497a(string));
                        f12262e.putAll(C6476x.m13497a(string2));
                        f12260c.set(true);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                }
            }
        }
    }

    /* renamed from: g */
    static void m14026g() {
        Class<C6601p> cls = C6601p.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12260c.get()) {
                    m14025f();
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static void m14019a(Map<String, String> map) {
        Class<C6601p> cls = C6601p.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12260c.get()) {
                    m14025f();
                }
                for (Map.Entry<String, String> key : map.entrySet()) {
                    String str = (String) key.getKey();
                    String g = C6476x.m13540g(m14017a(str, map.get(str).trim()));
                    if (f12262e.containsKey(str)) {
                        String str2 = f12262e.get(str);
                        String[] split = str2 != null ? str2.split(",") : new String[0];
                        HashSet hashSet = new HashSet(Arrays.asList(split));
                        if (!hashSet.contains(g)) {
                            StringBuilder sb = new StringBuilder();
                            if (split.length == 0) {
                                sb.append(g);
                            } else if (split.length < 5) {
                                sb.append(str2);
                                sb.append(",");
                                sb.append(g);
                            } else {
                                for (int i = 1; i < 5; i++) {
                                    sb.append(split[i]);
                                    sb.append(",");
                                }
                                sb.append(g);
                                hashSet.remove(split[0]);
                            }
                            f12262e.put(str, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        f12262e.put(str, g);
                    }
                }
                m14021b("com.facebook.appevents.UserDataStore.internalUserData", C6476x.m13489a((Map<String, String>) f12262e));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static void m14021b(String str, String str2) {
        Class<C6601p> cls = C6601p.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C4716f.m7704m().execute(new C6602a(str, str2));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static String m14017a(String str, String str2) {
        String str3;
        Class<C6601p> cls = C6601p.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f12258a, "Setting email failure: this is not a valid email address");
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if (!"ge".equals(str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                } else {
                    str3 = "";
                }
                if (!"f".equals(str3)) {
                    if (!"m".equals(str3)) {
                        Log.e(f12258a, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                }
                return str3;
            }
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
