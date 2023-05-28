package com.google.android.gms.internal.ads;

import java.util.Arrays;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONObject;

@zzard
public final class zzasd {

    /* renamed from: a */
    private final String f18448a;

    /* renamed from: b */
    private final String f18449b;

    /* renamed from: c */
    private final boolean f18450c;

    /* renamed from: d */
    private String f18451d;

    /* renamed from: e */
    private final JSONObject f18452e;

    public zzasd(JSONObject jSONObject) {
        this.f18451d = jSONObject.optString("url");
        this.f18448a = jSONObject.optString("base_uri");
        this.f18449b = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        this.f18450c = optString != null && (optString.equals(DiskLruCache.VERSION_1) || optString.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 != null) {
            Arrays.asList(optString2.split(","));
        }
        int optInt = jSONObject.optInt("valid", 0);
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f18452e = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    /* renamed from: a */
    public final String mo27605a() {
        return this.f18451d;
    }

    /* renamed from: b */
    public final String mo27606b() {
        return this.f18448a;
    }

    /* renamed from: c */
    public final String mo27607c() {
        return this.f18449b;
    }

    /* renamed from: d */
    public final boolean mo27608d() {
        return this.f18450c;
    }

    /* renamed from: e */
    public final JSONObject mo27609e() {
        return this.f18452e;
    }
}
