package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcxq implements zzazf {

    /* renamed from: a */
    public final String f21152a;

    /* renamed from: b */
    public final String f21153b = this.f21155d.optString("ad_base_url", (String) null);

    /* renamed from: c */
    public final JSONObject f21154c = this.f21155d.optJSONObject("ad_json");

    /* renamed from: d */
    private final JSONObject f21155d;

    zzcxq(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject c = zzazc.m20438c(jsonReader);
        this.f21155d = c;
        this.f21152a = c.optString("ad_html", (String) null);
    }

    /* renamed from: a */
    public final void mo27862a(JsonWriter jsonWriter) throws IOException {
        zzazc.m20434a(jsonWriter, this.f21155d);
    }
}
