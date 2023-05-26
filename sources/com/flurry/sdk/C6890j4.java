package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.j4 */
public final class C6890j4 extends C6993q6 {

    /* renamed from: b */
    public final Map<String, Map<String, String>> f12891b;

    public C6890j4(Map<String, Map<String, String>> map) {
        this.f12891b = new HashMap(map);
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        Map<String, Map<String, String>> map = this.f12891b;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                for (Map.Entry entry : ((Map) next.getValue()).entrySet()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((String) entry.getKey(), entry.getValue());
                    jSONObject2 = jSONObject3;
                }
                jSONObject.put((String) next.getKey(), jSONObject2);
            }
        }
        a.put("fl.session.property", jSONObject);
        return a;
    }
}
