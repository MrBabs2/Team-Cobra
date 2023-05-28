package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.c6 */
public final class C6776c6 extends C6993q6 {

    /* renamed from: b */
    public final String f12614b;

    /* renamed from: c */
    public final Map<String, String> f12615c;

    public C6776c6(String str, Map<String, String> map) {
        this.f12614b = str;
        this.f12615c = map == null ? new HashMap<>() : map;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        JSONObject a2 = C6807e2.m14505a(this.f12615c);
        a.put("fl.origin.attribute.name", this.f12614b);
        a.put("fl.origin.attribute.parameters", a2);
        return a;
    }
}
