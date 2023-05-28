package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.k5 */
public final class C6910k5 extends C6993q6 {

    /* renamed from: b */
    public final boolean f12956b;

    public C6910k5(boolean z) {
        this.f12956b = z;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.ccpa.optout", this.f12956b);
        return a;
    }
}
