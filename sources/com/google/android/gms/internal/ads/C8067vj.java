package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vj */
final class C8067vj implements zzalm<zzcir> {
    C8067vj() {
    }

    /* renamed from: a */
    public final /* synthetic */ JSONObject mo25813a(Object obj) throws JSONException {
        zzcir zzcir = (zzcir) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcir.f20241c.mo27606b());
        jSONObject2.put("signals", zzcir.f20240b);
        jSONObject3.put("body", zzcir.f20239a.f20255c);
        jSONObject3.put("headers", zzk.zzlg().mo27797a((Map<String, ?>) zzcir.f20239a.f20254b));
        jSONObject3.put("response_code", zzcir.f20239a.f20253a);
        jSONObject3.put("latency", zzcir.f20239a.f20256d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcir.f20241c.mo27609e());
        return jSONObject;
    }
}
