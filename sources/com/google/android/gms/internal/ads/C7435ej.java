package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ej */
final /* synthetic */ class C7435ej implements zzbal {

    /* renamed from: a */
    private final zzxt f15154a;

    C7435ej(zzchq zzchq, zzxt zzxt) {
        this.f15154a = zzxt;
    }

    public final zzbbh zzf(Object obj) {
        zzxt zzxt = this.f15154a;
        String str = (String) obj;
        String str2 = zzxt.f22977f;
        String str3 = zzxt.f22978g;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", "");
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return zzbar.m20539a(jSONObject);
    }
}
