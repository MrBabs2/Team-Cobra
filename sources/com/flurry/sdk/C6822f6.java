package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f6 */
public final class C6822f6 extends C6993q6 {

    /* renamed from: b */
    public final boolean f12755b;

    public C6822f6(boolean z) {
        this.f12755b = z;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.report.previous.success", this.f12755b);
        return a;
    }
}
