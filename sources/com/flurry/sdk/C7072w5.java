package com.flurry.sdk;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.w5 */
public final class C7072w5 extends C6993q6 {

    /* renamed from: b */
    public final String f13334b;

    /* renamed from: c */
    public final List<String> f13335c;

    public C7072w5(String str, List<String> list) {
        this.f13334b = str;
        this.f13335c = list;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        JSONArray jSONArray = new JSONArray();
        for (String put : this.f13335c) {
            jSONArray.put(put);
        }
        a.put("fl.launch.options.key", this.f13334b);
        a.put("fl.launch.options.values", jSONArray);
        return a;
    }
}
