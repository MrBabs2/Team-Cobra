package com.flurry.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.z3 */
public final class C7099z3 extends C6993q6 {

    /* renamed from: b */
    public final String f13373b;

    /* renamed from: c */
    public final String f13374c;

    public C7099z3(String str, String str2) {
        this.f13373b = str == null ? "" : str;
        this.f13374c = str2 == null ? "" : str2;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        if (!TextUtils.isEmpty(this.f13373b)) {
            a.put("fl.language", this.f13373b);
        }
        if (!TextUtils.isEmpty(this.f13374c)) {
            a.put("fl.country", this.f13374c);
        }
        return a;
    }
}
