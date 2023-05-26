package com.facebook.p032t;

import android.os.Build;
import android.os.Bundle;
import com.facebook.C6494l;
import com.facebook.FacebookException;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.p032t.p179s.C6640a;
import com.facebook.p032t.p180t.C6642a;
import com.facebook.p032t.p181u.C6650b;
import com.facebook.p032t.p183w.C6684a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.c */
/* compiled from: AppEvent */
public class C6570c implements Serializable {

    /* renamed from: k */
    private static final HashSet<String> f12196k = new HashSet<>();

    /* renamed from: f */
    private final JSONObject f12197f;

    /* renamed from: g */
    private final boolean f12198g;

    /* renamed from: h */
    private final boolean f12199h;

    /* renamed from: i */
    private final String f12200i;

    /* renamed from: j */
    private final String f12201j;

    /* renamed from: com.facebook.t.c$b */
    /* compiled from: AppEvent */
    static class C6572b implements Serializable {

        /* renamed from: f */
        private final String f12202f;

        /* renamed from: g */
        private final boolean f12203g;

        /* renamed from: h */
        private final boolean f12204h;

        private Object readResolve() throws JSONException {
            return new C6570c(this.f12202f, this.f12203g, this.f12204h, (String) null);
        }
    }

    /* renamed from: com.facebook.t.c$c */
    /* compiled from: AppEvent */
    static class C6573c implements Serializable {

        /* renamed from: f */
        private final String f12205f;

        /* renamed from: g */
        private final boolean f12206g;

        /* renamed from: h */
        private final boolean f12207h;

        /* renamed from: i */
        private final String f12208i;

        private Object readResolve() throws JSONException {
            return new C6570c(this.f12205f, this.f12206g, this.f12207h, this.f12208i);
        }

        private C6573c(String str, boolean z, boolean z2, String str2) {
            this.f12205f = str;
            this.f12206g = z;
            this.f12207h = z2;
            this.f12208i = str2;
        }
    }

    /* renamed from: e */
    private String m13935e() {
        if (Build.VERSION.SDK_INT > 19) {
            return m13931a(this.f12197f.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f12197f.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f12197f.optString(str));
            sb.append(10);
        }
        return m13931a(sb.toString());
    }

    private Object writeReplace() {
        return new C6573c(this.f12197f.toString(), this.f12198g, this.f12199h, this.f12201j);
    }

    /* renamed from: a */
    public boolean mo21306a() {
        return this.f12198g;
    }

    /* renamed from: b */
    public JSONObject mo21307b() {
        return this.f12197f;
    }

    /* renamed from: c */
    public String mo21308c() {
        return this.f12200i;
    }

    /* renamed from: d */
    public boolean mo21309d() {
        if (this.f12201j == null) {
            return true;
        }
        return m13935e().equals(this.f12201j);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f12197f.optString("_eventName"), Boolean.valueOf(this.f12198g), this.f12197f.toString()});
    }

    public C6570c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        this.f12198g = z;
        this.f12199h = z2;
        this.f12200i = str2;
        this.f12197f = m13933a(str, str2, d, bundle, uuid);
        this.f12201j = m13935e();
    }

    /* renamed from: a */
    private JSONObject m13933a(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        m13934b(str2);
        JSONObject jSONObject = new JSONObject();
        String b = C6684a.m14301b(str2);
        jSONObject.put("_eventName", b);
        jSONObject.put("_eventName_md5", m13931a(b));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> a = m13932a(bundle);
            for (String next : a.keySet()) {
                jSONObject.put(next, a.get(next));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f12199h) {
            jSONObject.put("_inBackground", DiskLruCache.VERSION_1);
        }
        if (this.f12198g) {
            jSONObject.put("_implicitlyLogged", DiskLruCache.VERSION_1);
        } else {
            C6460r.m13408a(C6494l.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m13934b(String str) throws FacebookException {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        }
        synchronized (f12196k) {
            contains = f12196k.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f12196k) {
                f12196k.add(str);
            }
            return;
        }
        throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    private C6570c(String str, boolean z, boolean z2, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f12197f = jSONObject;
        this.f12198g = z;
        this.f12200i = jSONObject.optString("_eventName");
        this.f12201j = str2;
        this.f12199h = z2;
    }

    /* renamed from: a */
    private Map<String, String> m13932a(Bundle bundle) throws FacebookException {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            m13934b(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str}));
            }
        }
        C6642a.m14154a((Map<String, String>) hashMap);
        C6684a.m14299a((Map<String, String>) hashMap, this.f12200i);
        C6640a.m14150a(hashMap, this.f12200i);
        return hashMap;
    }

    /* renamed from: a */
    private static String m13931a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return C6650b.m14183a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C6476x.m13507a("Failed to generate checksum: ", (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C6476x.m13507a("Failed to generate checksum: ", (Exception) e2);
            return DiskLruCache.VERSION_1;
        }
    }
}
