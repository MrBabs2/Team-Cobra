package com.facebook.p032t.p177r.p178g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.r.g.a */
/* compiled from: EventBinding */
public class C6631a {

    /* renamed from: a */
    private final String f12334a;

    /* renamed from: b */
    private final List<C6635c> f12335b;

    /* renamed from: c */
    private final List<C6634b> f12336c;

    /* renamed from: d */
    private final String f12337d;

    /* renamed from: com.facebook.t.r.g.a$a */
    /* compiled from: EventBinding */
    public enum C6632a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: com.facebook.t.r.g.a$b */
    /* compiled from: EventBinding */
    public enum C6633b {
        MANUAL,
        INFERENCE
    }

    public C6631a(String str, C6633b bVar, C6632a aVar, String str2, List<C6635c> list, List<C6634b> list2, String str3, String str4, String str5) {
        this.f12334a = str;
        this.f12335b = list;
        this.f12336c = list2;
        this.f12337d = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.p032t.p177r.p178g.C6631a> m14113a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.t.r.g.a r3 = m14112a((org.json.JSONObject) r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p177r.p178g.C6631a.m14113a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: b */
    public String mo21389b() {
        return this.f12334a;
    }

    /* renamed from: c */
    public List<C6634b> mo21390c() {
        return Collections.unmodifiableList(this.f12336c);
    }

    /* renamed from: d */
    public List<C6635c> mo21391d() {
        return Collections.unmodifiableList(this.f12335b);
    }

    /* renamed from: a */
    public static C6631a m14112a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        C6633b valueOf = C6633b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        C6632a valueOf2 = C6632a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C6635c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C6634b(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C6631a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    /* renamed from: a */
    public String mo21388a() {
        return this.f12337d;
    }
}
