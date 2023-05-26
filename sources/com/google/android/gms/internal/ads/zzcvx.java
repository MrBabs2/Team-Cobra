package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcvx implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final JSONObject f21046a;

    public zzcvx(JSONObject jSONObject) {
        this.f21046a = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            JSONObject a = zzazc.m20430a((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f21046a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zzawz.m20167e("Failed putting app indexing json.");
        }
    }
}
