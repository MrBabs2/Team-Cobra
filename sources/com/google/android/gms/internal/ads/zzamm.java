package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzamm {

    /* renamed from: a */
    public final List<zzaml> f18200a;

    public zzamm(JSONObject jSONObject) throws JSONException {
        boolean z;
        if (zzbad.m20518a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzawz.m20167e(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzaml zzaml = new zzaml(jSONArray.getJSONObject(i2));
                boolean equalsIgnoreCase = "banner".equalsIgnoreCase(zzaml.f18199c);
                arrayList.add(zzaml);
                if (i < 0) {
                    Iterator<String> it = zzaml.f18197a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f18200a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "click_urls");
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "imp_urls");
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "downloaded_imp_urls");
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "nofill_urls");
            zzk.zzly();
            zzamn.m19421a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            int i3 = (optJSONObject.optLong("refresh", -1) > 0 ? 1 : (optJSONObject.optLong("refresh", -1) == 0 ? 0 : -1));
            zzato a = zzato.m19981a(optJSONObject.optJSONArray("rewards"));
            if (a != null) {
                String str = a.f18518f;
                int i4 = a.f18519g;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
