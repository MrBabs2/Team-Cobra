package com.flurry.sdk;

import com.flurry.sdk.C6778d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.n6 */
public final class C6944n6 extends C6993q6 {

    /* renamed from: b */
    public final int f13028b = 3;

    /* renamed from: c */
    public final int f13029c = 328;

    /* renamed from: d */
    public final String f13030d;

    /* renamed from: e */
    public final int f13031e;

    /* renamed from: f */
    public final boolean f13032f;

    /* renamed from: g */
    public final C6778d.C6783d f13033g;

    public C6944n6(String str, int i, boolean z, C6778d.C6783d dVar) {
        this.f13030d = str;
        this.f13031e = i;
        this.f13032f = z;
        this.f13033g = dVar;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.agent.version", this.f13029c);
        a.put("fl.agent.platform", this.f13028b);
        a.put("fl.apikey", this.f13030d);
        a.put("fl.agent.report.key", this.f13031e);
        a.put("fl.background.session.metrics", this.f13032f);
        a.put("fl.play.service.availability", this.f13033g.f12640f);
        return a;
    }
}
