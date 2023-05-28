package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

public final class zzcxo {

    /* renamed from: a */
    public final List<String> f21146a;

    /* renamed from: b */
    public final String f21147b;

    /* renamed from: c */
    public final int f21148c;

    /* renamed from: d */
    public final String f21149d;

    /* renamed from: e */
    public final int f21150e;

    /* renamed from: f */
    public final long f21151f;

    zzcxo(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = "";
        String str2 = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzazc.m20427a(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f21146a = emptyList;
        this.f21148c = i;
        this.f21147b = str;
        this.f21149d = str2;
        this.f21150e = i2;
        this.f21151f = j;
    }
}
