package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzbyy extends zzbyx {

    /* renamed from: b */
    private final JSONObject f19736b;

    /* renamed from: c */
    private final boolean f19737c;

    /* renamed from: d */
    private final boolean f19738d;

    /* renamed from: e */
    private final boolean f19739e;

    public zzbyy(zzcxm zzcxm, JSONObject jSONObject) {
        super(zzcxm);
        this.f19736b = zzazc.m20431a(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f19737c = zzazc.m20435a(false, jSONObject, "allow_pub_owned_ad_view");
        this.f19738d = zzazc.m20435a(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f19739e = zzazc.m20435a(false, jSONObject, "enable_omid");
    }

    /* renamed from: a */
    public final JSONObject mo28560a() {
        JSONObject jSONObject = this.f19736b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f19735a.f21139w);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo28561b() {
        return this.f19737c;
    }

    /* renamed from: c */
    public final boolean mo28562c() {
        return this.f19738d;
    }

    /* renamed from: d */
    public final boolean mo28563d() {
        return this.f19739e;
    }
}
