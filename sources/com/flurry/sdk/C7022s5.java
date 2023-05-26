package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.s5 */
public final class C7022s5 extends C6993q6 {

    /* renamed from: b */
    public int f13168b = 0;

    /* renamed from: c */
    public String f13169c = "Unknown";

    public C7022s5(int i, String str) {
        this.f13168b = i;
        this.f13169c = str;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.flush.frame.code", this.f13168b);
        a.put("fl.flush.frame.reason", this.f13169c);
        return a;
    }
}
