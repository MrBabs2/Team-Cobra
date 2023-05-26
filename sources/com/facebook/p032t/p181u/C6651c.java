package com.facebook.p032t.p181u;

import android.content.Context;
import com.facebook.C6494l;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.p032t.C4728g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.u.c */
/* compiled from: AppEventsLoggerUtility */
public class C6651c {

    /* renamed from: a */
    private static final Map<C6653b, String> f12393a = new C6652a();

    /* renamed from: com.facebook.t.u.c$a */
    /* compiled from: AppEventsLoggerUtility */
    static class C6652a extends HashMap<C6653b, String> {
        C6652a() {
            put(C6653b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C6653b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* renamed from: com.facebook.t.u.c$b */
    /* compiled from: AppEventsLoggerUtility */
    public enum C6653b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m14188a(C6653b bVar, C6372a aVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f12393a.get(bVar));
        String c = C4728g.m7731c();
        if (c != null) {
            jSONObject.put("app_user_id", c);
        }
        C6476x.m13511a(jSONObject, aVar, str, z);
        try {
            C6476x.m13510a(jSONObject, context);
        } catch (Exception e) {
            C6460r.m13408a(C6494l.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject d = C6476x.m13531d();
        if (d != null) {
            Iterator<String> keys = d.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, d.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
