package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.i5 */
public final class C6875i5 extends C6993q6 {

    /* renamed from: b */
    public final int f12860b;

    /* renamed from: c */
    public final int f12861c;

    public C6875i5(int i, int i2) {
        this.f12861c = i < 0 ? C6838g7.UNKNOWN.f12797f : i;
        this.f12860b = i2 < 0 ? C6838g7.UNKNOWN.f12797f : i2;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.app.current.state", this.f12860b);
        a.put("fl.app.previous.state", this.f12861c);
        return a;
    }
}
