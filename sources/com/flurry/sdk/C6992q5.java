package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q5 */
public final class C6992q5 extends C6993q6 {

    /* renamed from: b */
    public final boolean f13136b = true;

    /* renamed from: c */
    public final String f13137c;

    public C6992q5(String str) {
        this.f13137c = str;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.background.enabled", this.f13136b);
        a.put("fl.sdk.version.code", this.f13137c);
        return a;
    }
}
