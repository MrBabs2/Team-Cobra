package com.facebook.p032t.p177r.p178g;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: com.facebook.t.r.g.b */
/* compiled from: ParameterComponent */
public final class C6634b {

    /* renamed from: a */
    public final String f12345a;

    /* renamed from: b */
    public final String f12346b;

    /* renamed from: c */
    public final List<C6635c> f12347c;

    /* renamed from: d */
    public final String f12348d;

    public C6634b(JSONObject jSONObject) throws JSONException {
        this.f12345a = jSONObject.getString("name");
        this.f12346b = jSONObject.optString(DonationsAnalytics.VALUE);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C6635c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f12347c = arrayList;
        this.f12348d = jSONObject.optString("path_type", "absolute");
    }
}
