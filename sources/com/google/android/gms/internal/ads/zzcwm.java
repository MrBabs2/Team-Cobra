package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcwm implements zzcuz<JSONObject> {

    /* renamed from: a */
    private List<String> f21070a;

    public zzcwm(List<String> list) {
        this.f21070a = list;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f21070a));
        } catch (JSONException unused) {
            zzawz.m20167e("Failed putting experiment ids.");
        }
    }
}
