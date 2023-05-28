package com.flurry.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.a6 */
public final class C6744a6 extends C6993q6 {

    /* renamed from: b */
    public final String f12548b;

    /* renamed from: c */
    public final boolean f12549c;

    public C6744a6(String str, boolean z) {
        this.f12548b = str;
        this.f12549c = z;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        if (!TextUtils.isEmpty(this.f12548b)) {
            a.put("fl.notification.key", this.f12548b);
        }
        a.put("fl.notification.enabled", this.f12549c);
        return a;
    }
}
