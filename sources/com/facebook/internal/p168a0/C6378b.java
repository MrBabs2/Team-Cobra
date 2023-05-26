package com.facebook.internal.p168a0;

import android.os.Build;
import com.facebook.internal.C6476x;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a0.b */
/* compiled from: InstrumentData */
public final class C6378b {

    /* renamed from: a */
    private String f11738a;

    /* renamed from: b */
    private C6381c f11739b;

    /* renamed from: c */
    private JSONArray f11740c;

    /* renamed from: d */
    private String f11741d;

    /* renamed from: e */
    private String f11742e;

    /* renamed from: f */
    private String f11743f;

    /* renamed from: g */
    private Long f11744g;

    /* renamed from: com.facebook.internal.a0.b$a */
    /* compiled from: InstrumentData */
    static /* synthetic */ class C6379a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11745a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.internal.a0.b$c[] r0 = com.facebook.internal.p168a0.C6378b.C6381c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11745a = r0
                com.facebook.internal.a0.b$c r1 = com.facebook.internal.p168a0.C6378b.C6381c.Analysis     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11745a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.internal.a0.b$c r1 = com.facebook.internal.p168a0.C6378b.C6381c.CrashReport     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11745a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.internal.a0.b$c r1 = com.facebook.internal.p168a0.C6378b.C6381c.CrashShield     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11745a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.internal.a0.b$c r1 = com.facebook.internal.p168a0.C6378b.C6381c.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p168a0.C6378b.C6379a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.a0.b$b */
    /* compiled from: InstrumentData */
    public static class C6380b {
        /* renamed from: a */
        public static C6378b m13237a(File file) {
            return new C6378b(file, (C6379a) null);
        }

        /* renamed from: a */
        public static C6378b m13238a(Throwable th, C6381c cVar) {
            return new C6378b(th, cVar, (C6379a) null);
        }

        /* renamed from: a */
        public static C6378b m13239a(JSONArray jSONArray) {
            return new C6378b(jSONArray, (C6379a) null);
        }
    }

    /* renamed from: com.facebook.internal.a0.b$c */
    /* compiled from: InstrumentData */
    public enum C6381c {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: a */
        public String mo20942a() {
            int i = C6379a.f11745a[ordinal()];
            if (i == 1) {
                return "analysis_log_";
            }
            if (i == 2) {
                return "crash_log_";
            }
            if (i != 3) {
                return i != 4 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        public String toString() {
            int i = C6379a.f11745a[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "CrashReport";
            }
            if (i != 3) {
                return i != 4 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* synthetic */ C6378b(File file, C6379a aVar) {
        this(file);
    }

    /* renamed from: a */
    private static C6381c m13229a(String str) {
        if (str.startsWith("crash_log_")) {
            return C6381c.CrashReport;
        }
        if (str.startsWith("shield_log_")) {
            return C6381c.CrashShield;
        }
        if (str.startsWith("thread_check_log_")) {
            return C6381c.ThreadCheck;
        }
        if (str.startsWith("analysis_log_")) {
            return C6381c.Analysis;
        }
        return C6381c.Unknown;
    }

    /* renamed from: d */
    private JSONObject m13230d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11740c != null) {
                jSONObject.put("feature_names", this.f11740c);
            }
            if (this.f11744g != null) {
                jSONObject.put("timestamp", this.f11744g);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private JSONObject m13231e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            if (this.f11741d != null) {
                jSONObject.put("app_version", this.f11741d);
            }
            if (this.f11744g != null) {
                jSONObject.put("timestamp", this.f11744g);
            }
            if (this.f11742e != null) {
                jSONObject.put("reason", this.f11742e);
            }
            if (this.f11743f != null) {
                jSONObject.put("callstack", this.f11743f);
            }
            if (this.f11739b != null) {
                jSONObject.put("type", this.f11739b);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private JSONObject m13232f() {
        int i = C6379a.f11745a[this.f11739b.ordinal()];
        if (i == 1) {
            return m13230d();
        }
        if (i == 2 || i == 3 || i == 4) {
            return m13231e();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo20939b() {
        int i = C6379a.f11745a[this.f11739b.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3 && i != 4) || this.f11743f == null || this.f11744g == null) {
                return false;
            }
            return true;
        } else if (this.f11740c == null || this.f11744g == null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public void mo20940c() {
        if (mo20939b()) {
            C6385d.m13247a(this.f11738a, toString());
        }
    }

    public String toString() {
        JSONObject f = m13232f();
        if (f == null) {
            return null;
        }
        return f.toString();
    }

    /* synthetic */ C6378b(Throwable th, C6381c cVar, C6379a aVar) {
        this(th, cVar);
    }

    /* synthetic */ C6378b(JSONArray jSONArray, C6379a aVar) {
        this(jSONArray);
    }

    private C6378b(JSONArray jSONArray) {
        this.f11739b = C6381c.Analysis;
        this.f11744g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f11740c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(this.f11744g.toString());
        stringBuffer.append(".json");
        this.f11738a = stringBuffer.toString();
    }

    /* renamed from: a */
    public int mo20937a(C6378b bVar) {
        Long l = this.f11744g;
        if (l == null) {
            return -1;
        }
        Long l2 = bVar.f11744g;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    private C6378b(Throwable th, C6381c cVar) {
        this.f11739b = cVar;
        this.f11741d = C6476x.m13518b();
        this.f11742e = C6385d.m13245a(th);
        this.f11743f = C6385d.m13250b(th);
        this.f11744g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.mo20942a());
        stringBuffer.append(this.f11744g.toString());
        stringBuffer.append(".json");
        this.f11738a = stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo20938a() {
        C6385d.m13249a(this.f11738a);
    }

    private C6378b(File file) {
        String name = file.getName();
        this.f11738a = name;
        this.f11739b = m13229a(name);
        JSONObject a = C6385d.m13246a(this.f11738a, true);
        if (a != null) {
            this.f11744g = Long.valueOf(a.optLong("timestamp", 0));
            this.f11741d = a.optString("app_version", (String) null);
            this.f11742e = a.optString("reason", (String) null);
            this.f11743f = a.optString("callstack", (String) null);
            this.f11740c = a.optJSONArray("feature_names");
        }
    }
}
