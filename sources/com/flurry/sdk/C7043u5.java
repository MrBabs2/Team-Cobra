package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.u5 */
public final class C7043u5 extends C6993q6 {

    /* renamed from: b */
    public final long f13243b;

    public C7043u5(long j) {
        this.f13243b = j;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.frame.log.counter", this.f13243b);
        return a;
    }
}
