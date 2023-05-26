package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.l6 */
public final class C6920l6 extends C6993q6 {

    /* renamed from: b */
    public final long f12965b;

    /* renamed from: c */
    public final long f12966c;

    /* renamed from: d */
    public final long f12967d;

    /* renamed from: e */
    public final int f12968e;

    public C6920l6(long j, long j2, long j3, int i) {
        this.f12965b = j;
        this.f12966c = j2;
        this.f12967d = j3;
        this.f12968e = i;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.session.id", this.f12965b);
        a.put("fl.session.elapsed.start.time", this.f12966c);
        long j = this.f12967d;
        if (j >= this.f12966c) {
            a.put("fl.session.elapsed.end.time", j);
        }
        a.put("fl.session.id.current.state", this.f12968e);
        return a;
    }
}
