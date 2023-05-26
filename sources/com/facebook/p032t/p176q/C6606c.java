package com.facebook.p032t.p176q;

import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.q.c */
/* compiled from: MetadataRule */
public final class C6606c {

    /* renamed from: d */
    private static final Set<C6606c> f12267d = new HashSet();

    /* renamed from: a */
    private String f12268a;

    /* renamed from: b */
    private List<String> f12269b;

    /* renamed from: c */
    private String f12270c;

    private C6606c(String str, List<String> list, String str2) {
        this.f12268a = str;
        this.f12269b = list;
        this.f12270c = str2;
    }

    /* renamed from: d */
    public static Set<String> m14040d() {
        Class<C6606c> cls = C6606c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (C6606c b : f12267d) {
                hashSet.add(b.mo21355b());
            }
            return hashSet;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static Set<C6606c> m14041e() {
        Class<C6606c> cls = C6606c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return new HashSet(f12267d);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<String> mo21354a() {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            return new ArrayList(this.f12269b);
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21355b() {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            return this.f12268a;
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo21356c() {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            return this.f12270c;
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* renamed from: a */
    static void m14038a(String str) {
        Class<C6606c> cls = C6606c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12267d.clear();
                m14039a(new JSONObject(str));
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static void m14039a(JSONObject jSONObject) {
        Class<C6606c> cls = C6606c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("k");
                        String optString2 = optJSONObject.optString("v");
                        if (!optString.isEmpty()) {
                            f12267d.add(new C6606c(next, Arrays.asList(optString.split(",")), optString2));
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }
}
