package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.t3 */
public final class C7028t3 extends C6993q6 {

    /* renamed from: b */
    public final int f13216b;

    /* renamed from: c */
    public final String f13217c;

    /* renamed from: d */
    public final long f13218d;

    /* renamed from: e */
    public final String f13219e;

    /* renamed from: f */
    public final String f13220f;

    /* renamed from: g */
    public final String f13221g;

    /* renamed from: h */
    public final int f13222h;

    /* renamed from: i */
    public final int f13223i;

    /* renamed from: j */
    public final String f13224j;

    /* renamed from: k */
    public final String f13225k;

    /* renamed from: l */
    public final Map<String, String> f13226l;

    /* renamed from: m */
    public final Map<String, String> f13227m;

    /* renamed from: n */
    public int f13228n;

    /* renamed from: o */
    public List<C6932m7> f13229o;

    public C7028t3(int i, String str, long j, String str2, String str3, String str4, int i2, int i3, Map<String, String> map, Map<String, String> map2, int i4, List<C6932m7> list, String str5, String str6) {
        String str7;
        this.f13216b = i;
        this.f13217c = str;
        this.f13218d = j;
        this.f13219e = str2 == null ? "" : str2;
        this.f13220f = str3 == null ? "" : str3;
        this.f13221g = str4 == null ? "" : str4;
        this.f13222h = i2;
        this.f13223i = i3;
        this.f13226l = map == null ? new HashMap<>() : map;
        this.f13227m = map2 == null ? new HashMap<>() : map2;
        this.f13228n = i4;
        this.f13229o = list == null ? new ArrayList<>() : list;
        if (str5 != null) {
            str7 = C6766c2.m14422b(str5);
        } else {
            str7 = "";
        }
        this.f13224j = str7;
        this.f13225k = str6 == null ? "" : str6;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.error.id", this.f13216b);
        a.put("fl.error.name", this.f13217c);
        a.put("fl.error.timestamp", this.f13218d);
        a.put("fl.error.message", this.f13219e);
        a.put("fl.error.class", this.f13220f);
        a.put("fl.error.type", this.f13222h);
        a.put("fl.crash.report", this.f13221g);
        a.put("fl.crash.platform", this.f13223i);
        a.put("fl.error.user.crash.parameter", C6807e2.m14505a(this.f13227m));
        a.put("fl.error.sdk.crash.parameter", C6807e2.m14505a(this.f13226l));
        a.put("fl.breadcrumb.version", this.f13228n);
        JSONArray jSONArray = new JSONArray();
        List<C6932m7> list = this.f13229o;
        if (list != null) {
            for (C6932m7 next : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fl.breadcrumb.message", next.f13001a);
                jSONObject.put("fl.breadcrumb.timestamp", next.f13002b);
                jSONArray.put(jSONObject);
            }
        }
        a.put("fl.breadcrumb", jSONArray);
        a.put("fl.nativecrash.minidump", this.f13224j);
        a.put("fl.nativecrash.logcat", this.f13225k);
        return a;
    }
}
