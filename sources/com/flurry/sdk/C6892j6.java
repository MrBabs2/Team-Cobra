package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.j6 */
public final class C6892j6 extends C6993q6 {

    /* renamed from: b */
    public final Map<C6922m, String> f12892b;

    /* renamed from: c */
    public final boolean f12893c;

    public C6892j6(Map<C6922m, String> map, boolean z) {
        this.f12892b = new HashMap(map);
        this.f12893c = z;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.f12892b.entrySet()) {
            jSONObject.put(((C6922m) next.getKey()).name(), next.getValue());
        }
        a.put("fl.reported.id", jSONObject);
        a.put("fl.ad.tracking", this.f12893c);
        return a;
    }
}
