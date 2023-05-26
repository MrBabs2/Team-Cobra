package com.flurry.sdk;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.p6 */
public final class C6976p6 extends C6993q6 {

    /* renamed from: b */
    public final int f13099b;

    /* renamed from: c */
    public final long f13100c;

    /* renamed from: d */
    public final String f13101d;

    /* renamed from: e */
    public final List<String> f13102e;

    /* renamed from: f */
    public final C6977a f13103f;

    /* renamed from: com.flurry.sdk.p6$a */
    public enum C6977a {
        Set(1),
        Add(2),
        Remove(3),
        Clear(4),
        Assign(5),
        Flag(6),
        Unknown(0);
        
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f13112f;

        private C6977a(int i) {
            this.f13112f = i;
        }
    }

    public C6976p6(int i, long j, String str, List<String> list, C6977a aVar) {
        this.f13099b = i;
        this.f13100c = j;
        this.f13101d = str;
        this.f13102e = list;
        this.f13103f = aVar;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.user.property.id", this.f13099b);
        a.put("fl.user.property.uptime", this.f13100c);
        a.put("fl.user.property.key", this.f13101d);
        List<String> list = this.f13102e;
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (String put : list) {
                jSONArray.put(put);
            }
        }
        a.put("fl.user.property.values", jSONArray);
        a.put("fl.user.property.call.type", this.f13103f.f13112f);
        return a;
    }
}
