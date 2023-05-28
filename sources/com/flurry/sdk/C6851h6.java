package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.h6 */
public final class C6851h6 extends C6993q6 {

    /* renamed from: b */
    public final Map<String, List<String>> f12819b;

    public C6851h6(Map<String, List<String>> map) {
        this.f12819b = map == null ? new HashMap<>() : map;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.f12819b.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : (List) next.getValue()) {
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.put(str);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) next.getKey(), jSONArray);
            }
        }
        if (jSONObject.length() > 0) {
            a.put("fl.referrer.map", jSONObject);
        }
        return a;
    }
}
