package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.x3 */
public final class C7081x3 extends C6993q6 {

    /* renamed from: b */
    public final int f13347b;

    /* renamed from: c */
    public final boolean f13348c;

    public C7081x3(int i, boolean z) {
        this.f13347b = i;
        this.f13348c = z;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.event.count", this.f13347b);
        a.put("fl.event.set.complete", this.f13348c);
        return a;
    }
}
