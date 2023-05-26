package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@zzard
public final class zzaml {

    /* renamed from: a */
    public final List<String> f18197a;

    /* renamed from: b */
    public final String f18198b;

    /* renamed from: c */
    public final String f18199c;

    public zzaml(JSONObject jSONObject) throws JSONException {
        jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f18197a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", (String) null);
        zzk.zzly();
        zzamn.m19421a(jSONObject, "clickurl");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "imp_urls");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "downloaded_imp_urls");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "fill_urls");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "video_start_urls");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "video_complete_urls");
        zzk.zzly();
        zzamn.m19421a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f18198b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", (String) null);
        jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        zzk.zzly();
        zzamn.m19421a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f18199c = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
