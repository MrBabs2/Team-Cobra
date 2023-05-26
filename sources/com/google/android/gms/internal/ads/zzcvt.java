package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzcvt implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final String f21041a;

    public zzcvt(String str) {
        this.f21041a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f21041a);
        } catch (JSONException e) {
            zzawz.m20168e("Failed putting Ad ID.", e);
        }
    }
}
