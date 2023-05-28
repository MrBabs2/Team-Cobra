package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q6 */
public abstract class C6993q6 implements C7031t6 {

    /* renamed from: a */
    protected int f13138a = 1;

    /* renamed from: a */
    public JSONObject mo23540a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fl.frame.version", this.f13138a);
        return jSONObject;
    }
}
