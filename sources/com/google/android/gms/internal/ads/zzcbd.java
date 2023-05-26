package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzcbd {

    /* renamed from: a */
    private final Executor f19892a;

    /* renamed from: b */
    private final zzcau f19893b;

    public zzcbd(Executor executor, zzcau zzcau) {
        this.f19892a = executor;
        this.f19893b = zzcau;
    }

    /* renamed from: a */
    public final zzbbh<List<zzcbg>> mo28626a(JSONObject jSONObject, String str) {
        zzbbh<B> zzbbh;
        String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzbar.m20539a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : 0;
                }
                if (c == 1) {
                    zzbbh = zzbar.m20539a(new zzcbg(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzbbh = zzbar.m20543a(this.f19893b.mo28623a(optJSONObject, "image_value"), new C8101wg(optString), this.f19892a);
                }
                arrayList.add(zzbbh);
            }
            zzbbh = zzbar.m20539a(null);
            arrayList.add(zzbbh);
        }
        return zzbar.m20543a(zzbar.m20545a(arrayList), C8064vg.f17024a, this.f19892a);
    }
}
