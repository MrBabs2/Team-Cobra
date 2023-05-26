package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.d4 */
public final class C6795d4 extends C6993q6 {

    /* renamed from: b */
    public final int f12665b;

    public C6795d4(int i) {
        this.f12665b = i;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.error.count", this.f12665b);
        return a;
    }
}
