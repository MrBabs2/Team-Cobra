package com.flurry.sdk;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.e2 */
public final class C6807e2 {
    /* renamed from: a */
    public static JSONObject m14505a(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        return jSONObject;
    }
}
