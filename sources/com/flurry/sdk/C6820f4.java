package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f4 */
public final class C6820f4 extends C6993q6 {

    /* renamed from: b */
    public final C6814f0 f12748b;

    /* renamed from: c */
    public final long f12749c;

    /* renamed from: d */
    public final long f12750d;

    /* renamed from: e */
    public final long f12751e;

    /* renamed from: f */
    public final C6805e0 f12752f;

    /* renamed from: g */
    public final boolean f12753g;

    public C6820f4(C6759c0 c0Var) {
        this.f12748b = c0Var.f12586a;
        this.f12749c = c0Var.f12587b;
        this.f12750d = c0Var.f12588c;
        this.f12751e = c0Var.f12589d;
        this.f12752f = c0Var.f12590e;
        this.f12753g = c0Var.f12591f;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.session.timestamp", this.f12749c);
        a.put("fl.initial.timestamp", this.f12750d);
        a.put("fl.continue.session.millis", this.f12751e);
        a.put("fl.session.state", this.f12748b.f12719f);
        a.put("fl.session.event", this.f12752f.name());
        a.put("fl.session.manual", this.f12753g);
        return a;
    }
}
