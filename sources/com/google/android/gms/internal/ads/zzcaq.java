package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public final class zzcaq {

    /* renamed from: a */
    private final zzbbl f19866a;

    /* renamed from: b */
    private final zzcau f19867b;

    /* renamed from: c */
    private final zzcbd f19868c;

    public zzcaq(zzbbl zzbbl, zzcau zzcau, zzcbd zzcbd) {
        this.f19866a = zzbbl;
        this.f19867b = zzcau;
        this.f19868c = zzcbd;
    }

    /* renamed from: a */
    public final zzbbh<zzbyt> mo28619a(zzcxu zzcxu, zzcxm zzcxm, JSONObject jSONObject) {
        zzbbh a;
        JSONObject jSONObject2 = jSONObject;
        zzcxu zzcxu2 = zzcxu;
        zzbbh a2 = this.f19866a.mo27892a(new C7694lg(this, zzcxu, zzcxm, jSONObject2));
        zzbbh<List<zzadw>> b = this.f19867b.mo28624b(jSONObject2, "images");
        zzbbh<zzadw> a3 = this.f19867b.mo28623a(jSONObject2, "secondary_image");
        zzbbh<zzadw> a4 = this.f19867b.mo28623a(jSONObject2, "app_icon");
        zzbbh<zzadt> c = this.f19867b.mo28625c(jSONObject2, "attribution");
        zzbbh<zzbgz> a5 = this.f19867b.mo28622a(jSONObject2);
        zzcau zzcau = this.f19867b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            a = zzbar.m20539a(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                a = zzbar.m20539a(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    a = zzbar.m20539a(null);
                } else {
                    a = zzbar.m20542a(zzbar.m20539a(null), new C7879qg(zzcau, optString), zzbbm.f18748a);
                }
            }
        }
        zzbbh zzbbh = a;
        zzbbh<List<zzcbg>> a6 = this.f19868c.mo28626a(jSONObject2, "custom_assets");
        return zzbar.m20540a((zzbbh<? extends V>[]) new zzbbh[]{a2, b, a3, a4, c, a5, zzbbh, a6}).mo27900a(new C7731mg(this, a2, b, a4, a3, c, jSONObject, a5, zzbbh, a6), this.f19866a);
    }
}
