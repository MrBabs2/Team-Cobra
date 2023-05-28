package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.o5 */
public final class C6957o5 extends C6993q6 {

    /* renamed from: b */
    public final Map<String, String> f13056b;

    public C6957o5(Map<String, String> map) {
        this.f13056b = new HashMap(map);
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.device.properties", C6807e2.m14505a(this.f13056b));
        return a;
    }
}
