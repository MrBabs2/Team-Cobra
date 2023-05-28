package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mp */
final class C7740mp implements zzcva<zzcuz<JSONObject>> {

    /* renamed from: a */
    private final JSONObject f16254a;

    C7740mp(Context context) {
        this.f16254a = zzasj.m19906a(context);
    }

    /* renamed from: a */
    public final zzbbh<zzcuz<JSONObject>> mo25785a() {
        return zzbar.m20539a(new C7777np(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo26244a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f16254a);
        } catch (JSONException unused) {
            zzawz.m20167e("Failed putting version constants.");
        }
    }
}
