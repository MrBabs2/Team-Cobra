package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.b4 */
public final class C6753b4 extends C6993q6 {

    /* renamed from: b */
    public final int f12570b;

    /* renamed from: c */
    public final String f12571c;

    /* renamed from: d */
    public final String f12572d;

    /* renamed from: e */
    public final String f12573e;

    /* renamed from: f */
    public final String f12574f;

    /* renamed from: g */
    public final String f12575g;

    /* renamed from: h */
    public final String f12576h;

    /* renamed from: i */
    public final int f12577i;

    public C6753b4(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        this.f13138a = 2;
        this.f12570b = i < 0 ? -1 : i;
        this.f12571c = str;
        this.f12572d = str2;
        this.f12573e = str3;
        this.f12574f = str4;
        this.f12575g = str5;
        this.f12576h = str6;
        this.f12577i = i2;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.network.status", this.f12570b);
        String str = this.f12571c;
        if (str != null) {
            a.put("fl.cellular.name", str);
            a.put("fl.cellular.operator", this.f12572d);
            a.put("fl.cellular.sim.operator", this.f12573e);
            a.put("fl.cellular.sim.id", this.f12574f);
            a.put("fl.cellular.sim.name", this.f12575g);
            a.put("fl.cellular.band", this.f12576h);
            a.put("fl.cellular.signal.strength", this.f12577i);
        }
        return a;
    }
}
