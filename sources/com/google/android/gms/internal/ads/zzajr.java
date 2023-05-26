package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class zzajr {
    /* renamed from: a */
    public static void m19306a(zzajq zzajq, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzajq.mo26359a(str, jSONObject.toString());
    }

    /* renamed from: b */
    public static void m19307b(zzajq zzajq, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzbad.m20516a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzajq.mo25660a(sb.toString());
    }

    /* renamed from: a */
    public static void m19304a(zzajq zzajq, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzajq.mo25660a(sb.toString());
    }

    /* renamed from: a */
    public static void m19305a(zzajq zzajq, String str, Map map) {
        try {
            zzajq.mo25666a(str, zzk.zzlg().mo27797a((Map<String, ?>) map));
        } catch (JSONException unused) {
            zzbad.m20523d("Could not convert parameters to JSON.");
        }
    }
}
