package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.h4 */
public final class C6849h4 extends C6993q6 {

    /* renamed from: b */
    public final String f12817b;

    /* renamed from: c */
    public final String f12818c;

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.session.property.param.name", this.f12817b);
        a.put("fl.session.property.param.value", this.f12818c);
        return a;
    }
}
