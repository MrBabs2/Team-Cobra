package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzcwi implements zzcuz<JSONObject> {

    /* renamed from: a */
    private String f21063a;

    /* renamed from: b */
    private String f21064b;

    public zzcwi(String str, String str2) {
        this.f21063a = str;
        this.f21064b = str2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            JSONObject a = zzazc.m20430a((JSONObject) obj, "pii");
            a.put("doritos", this.f21063a);
            a.put("doritos_v2", this.f21064b);
        } catch (JSONException unused) {
            zzawz.m20167e("Failed putting doritos string.");
        }
    }
}
