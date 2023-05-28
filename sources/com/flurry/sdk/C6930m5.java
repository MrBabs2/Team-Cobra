package com.flurry.sdk;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.m5 */
public final class C6930m5 extends C6993q6 {

    /* renamed from: b */
    public boolean f12998b;

    /* renamed from: c */
    public Map<String, String> f12999c;

    public C6930m5(boolean z, Map<String, String> map) {
        this.f12998b = z;
        this.f12999c = map;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.consent.isGdprScope", this.f12998b);
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.f12999c;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        a.put("fl.consent.strings", jSONObject);
        return a;
    }
}
