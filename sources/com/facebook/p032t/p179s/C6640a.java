package com.facebook.p032t.p179s;

import com.facebook.C4716f;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6570c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.t.s.a */
/* compiled from: EventDeactivationManager */
public final class C6640a {

    /* renamed from: a */
    private static boolean f12369a = false;

    /* renamed from: b */
    private static final List<C6641a> f12370b = new ArrayList();

    /* renamed from: c */
    private static final Set<String> f12371c = new HashSet();

    /* renamed from: com.facebook.t.s.a$a */
    /* compiled from: EventDeactivationManager */
    static class C6641a {

        /* renamed from: a */
        String f12372a;

        /* renamed from: b */
        List<String> f12373b;

        C6641a(String str, List<String> list) {
            this.f12372a = str;
            this.f12373b = list;
        }
    }

    /* renamed from: a */
    public static void m14148a() {
        Class<C6640a> cls = C6640a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12369a = true;
                m14151b();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m14151b() {
        Class<C6640a> cls = C6640a.class;
        synchronized (cls) {
            if (!C6391a.m13260a((Object) cls)) {
                try {
                    C6446m a = C6448n.m13378a(C4716f.m7697f(), false);
                    if (a != null) {
                        String h = a.mo20995h();
                        if (!h.isEmpty()) {
                            JSONObject jSONObject = new JSONObject(h);
                            f12370b.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        f12371c.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C6641a aVar = new C6641a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            aVar.f12373b = C6476x.m13494a(optJSONArray);
                                        }
                                        f12370b.add(aVar);
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
    }

    /* renamed from: a */
    public static void m14149a(List<C6570c> list) {
        Class<C6640a> cls = C6640a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12369a) {
                    Iterator<C6570c> it = list.iterator();
                    while (it.hasNext()) {
                        if (f12371c.contains(it.next().mo21308c())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    public static void m14150a(Map<String, String> map, String str) {
        Class<C6640a> cls = C6640a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12369a) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (C6641a aVar : new ArrayList(f12370b)) {
                        if (aVar.f12372a.equals(str)) {
                            for (String str2 : arrayList) {
                                if (aVar.f12373b.contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }
}
