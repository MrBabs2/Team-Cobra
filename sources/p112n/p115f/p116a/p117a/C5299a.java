package p112n.p115f.p116a.p117a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n.f.a.a.a */
/* compiled from: Indicative */
public class C5299a {

    /* renamed from: c */
    private static C5299a f9499c;

    /* renamed from: a */
    private Context f9500a;

    /* renamed from: b */
    private String f9501b;

    /* renamed from: n.f.a.a.a$a */
    /* compiled from: Indicative */
    public static class C5300a {

        /* renamed from: a */
        private String f9502a;

        /* renamed from: b */
        private String f9503b;

        /* renamed from: c */
        private long f9504c = System.currentTimeMillis();

        /* renamed from: d */
        private String f9505d;

        /* renamed from: e */
        private Map<String, Object> f9506e;

        public C5300a(String str, String str2, String str3, Map<String, Object> map) {
            this.f9502a = str;
            this.f9503b = str2;
            this.f9505d = str3;
            this.f9506e = map;
        }

        /* renamed from: a */
        public JSONObject mo18295a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("apiKey", this.f9502a);
                jSONObject.put("eventName", this.f9503b);
                jSONObject.put("eventTime", this.f9504c);
                jSONObject.put("eventUniqueId", this.f9505d);
                if (this.f9506e != null && !this.f9506e.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : this.f9506e.entrySet()) {
                        jSONObject2.put((String) next.getKey(), next.getValue());
                    }
                    jSONObject.put("properties", jSONObject2);
                }
            } catch (JSONException e) {
                Log.v("Indicative", "Event" + e.getMessage(), e.fillInStackTrace());
            }
            return jSONObject;
        }
    }

    /* renamed from: n.f.a.a.a$c */
    /* compiled from: Indicative */
    public class C5302c extends Thread {

        /* renamed from: f */
        private Context f9508f;

        /* renamed from: g */
        private Handler f9509g;

        C5302c(Context context, Handler handler) {
            this.f9508f = context;
            this.f9509g = handler;
            setName("SendEventsTimer");
        }

        public void run() {
            C5299a.this.mo18294a(this.f9508f);
            this.f9509g.postDelayed(this, 60000);
        }
    }

    private C5299a() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m10026b(String str) {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not recording event");
                return;
            }
            SharedPreferences sharedPreferences = m10030c().f9500a.getSharedPreferences("indicative_events", 0);
            sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).commit();
        }
    }

    /* renamed from: c */
    public static C5299a m10030c() {
        if (f9499c == null) {
            f9499c = new C5299a();
        }
        return f9499c;
    }

    /* renamed from: d */
    private void m10033d(String str) {
        if (str != null && !str.isEmpty()) {
            new C5301b(this, m10030c().f9500a, str).execute(new Void[0]);
        }
    }

    /* renamed from: e */
    public static void m10035e(String str) {
        m10036f(str);
    }

    /* renamed from: f */
    private static synchronized void m10036f(String str) {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not setting up unique id");
            } else {
                m10030c().f9500a.getSharedPreferences("indicative_unique", 0).edit().putString("indicative_unique", str).commit();
            }
        }
    }

    /* renamed from: a */
    public static C5299a m10016a(Context context, String str) {
        C5299a c = m10030c();
        c.f9501b = str;
        c.f9500a = context;
        m10034e();
        c.mo18293a();
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m10034e() {
        /*
            java.lang.Class<n.f.a.a.a> r0 = p112n.p115f.p116a.p117a.C5299a.class
            monitor-enter(r0)
            n.f.a.a.a r1 = m10030c()     // Catch:{ all -> 0x0041 }
            android.content.Context r1 = r1.f9500a     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0014
            java.lang.String r1 = "Indicative"
            java.lang.String r2 = "Indicative instance has not been initialized; not setting up unique id"
            android.util.Log.v(r1, r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)
            return
        L_0x0014:
            n.f.a.a.a r1 = m10030c()     // Catch:{ all -> 0x0041 }
            android.content.Context r1 = r1.f9500a     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "indicative_unique"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "uuid"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x003f
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "uuid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)     // Catch:{ all -> 0x0041 }
            r1.commit()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p115f.p116a.p117a.C5299a.m10034e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        return r3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m10032d() {
        /*
            java.lang.Class<n.f.a.a.a> r0 = p112n.p115f.p116a.p117a.C5299a.class
            monitor-enter(r0)
            n.f.a.a.a r1 = m10030c()     // Catch:{ all -> 0x0038 }
            android.content.Context r1 = r1.f9500a     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "Indicative"
            java.lang.String r3 = "Indicative instance has not been initialized; not setting up unique id"
            android.util.Log.v(r1, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)
            return r2
        L_0x0015:
            n.f.a.a.a r1 = m10030c()     // Catch:{ all -> 0x0038 }
            android.content.Context r1 = r1.f9500a     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "indicative_unique"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "indicative_unique"
            java.lang.String r3 = r1.getString(r3, r2)     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0030
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r4 == 0) goto L_0x0036
        L_0x0030:
            java.lang.String r3 = "uuid"
            java.lang.String r3 = r1.getString(r3, r2)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r0)
            return r3
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p115f.p116a.p117a.C5299a.m10032d():java.lang.String");
    }

    /* renamed from: c */
    public static void m10031c(String str) {
        m10020a(str, (String) null, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void mo18293a() {
        Handler handler = new Handler();
        handler.post(new C5302c(this.f9500a, handler));
    }

    /* renamed from: b */
    private static synchronized void m10028b(String str, String str2) {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
            } else {
                m10030c().f9500a.getSharedPreferences("indicative_prop_cache", 0).edit().putString(str, str2).commit();
            }
        }
    }

    /* renamed from: a */
    public static void m10021a(String str, String str2, Map<String, Object> map, boolean z) {
        Map<String, Object> b = m10025b();
        if (map != null) {
            b.putAll(map);
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = m10032d();
        }
        String jSONObject = new C5300a(m10030c().f9501b, str, str2, b).mo18295a().toString();
        if (z) {
            m10030c().m10033d(jSONObject);
        } else {
            m10026b(jSONObject);
        }
    }

    /* renamed from: n.f.a.a.a$b */
    /* compiled from: Indicative */
    public class C5301b extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private String f9507a;

        public C5301b(C5299a aVar, Context context, String str) {
            this.f9507a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                BasicHttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
                HttpPost httpPost = new HttpPost("https://api.indicative.com/service/event");
                httpPost.setHeader("Content-Type", "application/json");
                httpPost.addHeader("Indicative-Client", "Android");
                httpPost.setEntity(new StringEntity(this.f9507a, "UTF-8"));
                return Integer.valueOf(defaultHttpClient.execute(httpPost).getStatusLine().getStatusCode());
            } catch (Exception e) {
                Log.v("Indicative", "AsyncTask: " + e.getMessage(), e);
                return 400;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0 || num.intValue() == 408 || num.intValue() == 500) {
                C5299a.m10026b(this.f9507a);
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m10027b(String str, int i) {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
            } else {
                m10030c().f9500a.getSharedPreferences("indicative_prop_cache", 0).edit().putInt(str, i).commit();
            }
        }
    }

    /* renamed from: a */
    public static void m10020a(String str, String str2, Map<String, Object> map) {
        m10021a(str, str2, map, false);
    }

    /* renamed from: a */
    public static void m10022a(String str, Map<String, Object> map) {
        m10020a(str, (String) null, map);
    }

    /* renamed from: a */
    public static void m10019a(String str, String str2) {
        m10028b(str, str2);
    }

    /* renamed from: a */
    public static void m10018a(String str, int i) {
        m10027b(str, i);
    }

    /* renamed from: b */
    private static synchronized void m10029b(String str, boolean z) {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
            } else {
                m10030c().f9500a.getSharedPreferences("indicative_prop_cache", 0).edit().putBoolean(str, z).commit();
            }
        }
    }

    /* renamed from: a */
    public static void m10023a(String str, boolean z) {
        m10029b(str, z);
    }

    /* renamed from: a */
    public static void m10024a(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() instanceof Boolean) {
                m10023a((String) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            } else if (next.getValue() instanceof String) {
                m10019a((String) next.getKey(), (String) next.getValue());
            } else if (next.getValue() instanceof Integer) {
                m10018a((String) next.getKey(), ((Integer) next.getValue()).intValue());
            }
        }
    }

    /* renamed from: b */
    private static synchronized Map<String, Object> m10025b() {
        synchronized (C5299a.class) {
            if (m10030c().f9500a == null) {
                Log.v("Indicative", "Indicative instance has not been initialized; not getting common props");
                HashMap hashMap = new HashMap();
                return hashMap;
            }
            Map<String, ?> all = m10030c().f9500a.getSharedPreferences("indicative_prop_cache", 0).getAll();
            return all;
        }
    }

    /* renamed from: a */
    public synchronized void mo18294a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("indicative_events", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            for (String next : all.keySet()) {
                for (int i = 0; i < ((Integer) all.get(next)).intValue(); i++) {
                    new C5301b(this, context, next).execute(new Void[0]);
                    int i2 = sharedPreferences.getInt(next, 0);
                    if (i2 > 1) {
                        sharedPreferences.edit().putInt(next, i2 - 1).commit();
                    } else {
                        sharedPreferences.edit().remove(next).commit();
                    }
                }
            }
        }
    }
}
