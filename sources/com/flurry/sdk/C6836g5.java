package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.g5 */
public final class C6836g5 extends C6993q6 {

    /* renamed from: b */
    public final int f12792b;

    public C6836g5(int i) {
        this.f12792b = i < 0 ? 0 : i;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.app.orientation", this.f12792b);
        return a;
    }
}
