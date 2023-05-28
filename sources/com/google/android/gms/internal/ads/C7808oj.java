package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oj */
final /* synthetic */ class C7808oj implements zzczc {

    /* renamed from: a */
    static final zzczc f16497a = new C7808oj();

    private C7808oj() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optInt("error_code") == 6) {
            return zzalo.f18181c.mo25760a(jSONObject.getJSONObject("response"));
        }
        throw new zzcif(jSONObject.getString("error_reason"), jSONObject.optInt("error_code", 0));
    }
}
