package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcwt implements zzcuz<JSONObject> {

    /* renamed from: a */
    private Bundle f21083a;

    public zzcwt(Bundle bundle) {
        this.f21083a = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f21083a != null) {
            try {
                zzazc.m20430a(zzazc.m20430a(jSONObject, "device"), "play_store").put("parental_controls", zzk.zzlg().mo27795a(this.f21083a));
            } catch (JSONException unused) {
                zzawz.m20167e("Failed putting parental controls bundle.");
            }
        }
    }
}
