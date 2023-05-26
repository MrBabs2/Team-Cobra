package com.facebook.internal.p173b0.p174e;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.internal.p173b0.C6401c;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: com.facebook.internal.b0.e.a */
/* compiled from: Monitor */
public class C6403a {

    /* renamed from: a */
    private static boolean f11764a;

    /* renamed from: b */
    private static final C6401c f11765b = C6405b.m13285a(C6407c.m13289b(), C6408d.m13293b());

    /* renamed from: c */
    private static final Map<String, Integer> f11766c = new HashMap();

    /* renamed from: com.facebook.internal.b0.e.a$a */
    /* compiled from: Monitor */
    static class C6404a implements Runnable {
        C6404a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    JSONObject b = C6403a.m13282b();
                    if (b != null) {
                        C6403a.m13281a(b);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    static {
        new Random();
    }

    /* renamed from: a */
    protected static void m13280a() {
        if (!f11764a) {
            f11764a = true;
            m13283c();
            f11765b.mo20964a();
        }
    }

    /* renamed from: b */
    static JSONObject m13282b() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "monitoring_config");
        GraphRequest a = GraphRequest.m13073a((AccessToken) null, C4716f.m7697f(), (GraphRequest.C6344f) null);
        a.mo20831a(true);
        a.mo20826a(bundle);
        return a.mo20825a().mo20919b();
    }

    /* renamed from: c */
    protected static void m13283c() {
        C4716f.m7704m().execute(new C6404a());
    }

    /* renamed from: a */
    static void m13281a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("monitoring_config").getJSONArray("sample_rates");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(RoomNotification.KEY);
                int i2 = jSONObject2.getInt(DonationsAnalytics.VALUE);
                if (!BuildConfig.APTOIDE_THEME.equals(string)) {
                    f11766c.put(string, Integer.valueOf(i2));
                }
            }
        } catch (JSONException unused) {
        }
    }
}
