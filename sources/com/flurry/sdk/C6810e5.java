package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.e5 */
public final class C6810e5 extends C6993q6 {

    /* renamed from: b */
    public final String f12690b;

    /* renamed from: c */
    public final String f12691c;

    /* renamed from: d */
    public final String f12692d;

    /* renamed from: e */
    public final String f12693e;

    /* renamed from: f */
    public final int f12694f;

    public C6810e5(String str, String str2, String str3, String str4) {
        this.f12690b = str;
        this.f12691c = str2 == null ? "" : str2;
        this.f12692d = str3;
        this.f12693e = str4;
        this.f12694f = 3;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        m14510a(a, "fl.app.version", this.f12690b);
        m14510a(a, "fl.app.version.override", this.f12691c);
        m14510a(a, "fl.app.version.code", this.f12692d);
        m14510a(a, "fl.bundle.id", this.f12693e);
        a.put("fl.build.environment", this.f12694f);
        return a;
    }

    /* renamed from: a */
    private static void m14510a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }
}
