package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;

@zzard
public final class zzawl {

    /* renamed from: a */
    private final long f18584a;

    /* renamed from: b */
    private final List<String> f18585b = new ArrayList();

    /* renamed from: c */
    private final List<String> f18586c = new ArrayList();

    /* renamed from: d */
    private final Map<String, zzamm> f18587d = new HashMap();

    /* renamed from: e */
    private String f18588e;

    /* renamed from: f */
    private String f18589f;

    /* renamed from: g */
    private JSONObject f18590g;

    /* renamed from: h */
    private boolean f18591h;

    public zzawl(String str, long j) {
        JSONObject optJSONObject;
        this.f18591h = false;
        this.f18589f = str;
        this.f18584a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f18590g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f18591h = false;
                    zzbad.m20523d("App settings could not be fetched successfully.");
                    return;
                }
                this.f18591h = true;
                this.f18588e = this.f18590g.optString(RateAndReviewsFragment.BundleCons.APP_ID);
                JSONArray optJSONArray = this.f18590g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f18586c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f18587d.put(optString2, new zzamm(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f18590g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f18585b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                zzbad.m20522c("Exception occurred while processing app setting json", e);
                zzk.zzlk().mo27734a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo27725a() {
        return this.f18584a;
    }

    /* renamed from: b */
    public final boolean mo27726b() {
        return this.f18591h;
    }

    /* renamed from: c */
    public final String mo27727c() {
        return this.f18589f;
    }

    /* renamed from: d */
    public final String mo27728d() {
        return this.f18588e;
    }

    /* renamed from: e */
    public final Map<String, zzamm> mo27729e() {
        return this.f18587d;
    }

    /* renamed from: f */
    public final JSONObject mo27730f() {
        return this.f18590g;
    }
}
