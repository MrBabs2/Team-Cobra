package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzcwb implements zzcuz<JSONObject> {

    /* renamed from: a */
    private JSONObject f21055a;

    public zzcwb(JSONObject jSONObject) {
        this.f21055a = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f21055a);
        } catch (JSONException unused) {
            zzawz.m20167e("Unable to get cache_state");
        }
    }
}
