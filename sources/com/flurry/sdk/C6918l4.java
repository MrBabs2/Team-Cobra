package com.flurry.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.l4 */
public final class C6918l4 extends C6993q6 {

    /* renamed from: b */
    public final String f12964b;

    public C6918l4(String str) {
        this.f12964b = str == null ? "" : str;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        if (!TextUtils.isEmpty(this.f12964b)) {
            a.put("fl.timezone.value", this.f12964b);
        }
        return a;
    }
}
