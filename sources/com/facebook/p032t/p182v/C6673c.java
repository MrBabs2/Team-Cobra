package com.facebook.p032t.p182v;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.C6437k;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p180t.C6642a;
import com.facebook.p032t.p181u.C6657f;
import com.facebook.p032t.p184x.C6689d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.v.c */
/* compiled from: ModelManager */
public final class C6673c {

    /* renamed from: a */
    private static final Map<String, C6679f> f12443a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Integer f12444b = 259200000;

    /* renamed from: c */
    private static final List<String> f12445c = Arrays.asList(new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* renamed from: d */
    private static final List<String> f12446d = Arrays.asList(new String[]{"none", "address", "health"});

    /* renamed from: com.facebook.t.v.c$a */
    /* compiled from: ModelManager */
    static class C6674a implements Runnable {
        C6674a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ Exception -> 0x0072, all -> 0x006e }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A[Catch:{ Exception -> 0x0072, all -> 0x006e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                android.content.Context r2 = com.facebook.C4716f.m7696e()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x002a
                boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 == 0) goto L_0x0024
                goto L_0x002a
            L_0x0024:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x002f
            L_0x002a:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x002f:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                com.facebook.internal.k$d r3 = com.facebook.internal.C6437k.C6441d.ModelRequest     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                boolean r3 = com.facebook.internal.C6437k.m13342d(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                int r3 = r4.length()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                boolean r3 = com.facebook.p032t.p182v.C6673c.m14257a((long) r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 != 0) goto L_0x0067
            L_0x0049:
                org.json.JSONObject r4 = com.facebook.p032t.p182v.C6673c.m14255a()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 != 0) goto L_0x0050
                return
            L_0x0050:
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r0.apply()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x0067:
                com.facebook.p032t.p182v.C6673c.m14256a((org.json.JSONObject) r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                com.facebook.p032t.p182v.C6673c.m14261b()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x0072
            L_0x006e:
                r0 = move-exception
                com.facebook.internal.p168a0.p170f.C6391a.m13259a(r0, r7)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p182v.C6673c.C6674a.run():void");
        }
    }

    /* renamed from: com.facebook.t.v.c$b */
    /* compiled from: ModelManager */
    static class C6675b implements Runnable {
        C6675b() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6689d.m14326a();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.v.c$c */
    /* compiled from: ModelManager */
    static class C6676c implements Runnable {
        C6676c() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6642a.m14153a();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.v.c$d */
    /* compiled from: ModelManager */
    static /* synthetic */ class C6677d {

        /* renamed from: a */
        static final /* synthetic */ int[] f12447a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.t.v.c$e[] r0 = com.facebook.p032t.p182v.C6673c.C6678e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12447a = r0
                com.facebook.t.v.c$e r1 = com.facebook.p032t.p182v.C6673c.C6678e.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12447a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.t.v.c$e r1 = com.facebook.p032t.p182v.C6673c.C6678e.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p182v.C6673c.C6677d.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.t.v.c$e */
    /* compiled from: ModelManager */
    public enum C6678e {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: a */
        public String mo21439a() {
            int i = C6677d.f12447a[ordinal()];
            if (i != 1) {
                return i != 2 ? "Unknown" : "app_event_pred";
            }
            return "integrity_detect";
        }

        /* renamed from: d */
        public String mo21440d() {
            int i = C6677d.f12447a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i != 2) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m14257a(long j) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return m14263b(j);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m14261b() {
        Class<C6673c> cls = C6673c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14268d();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static void m14267c() {
        Class<C6673c> cls = C6673c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6476x.m13505a((Runnable) new C6674a());
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: d */
    private static void m14268d() {
        Class<C6673c> cls = C6673c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i = 0;
                for (Map.Entry next : f12443a.entrySet()) {
                    String str2 = (String) next.getKey();
                    if (str2.equals(C6678e.MTML_APP_EVENT_PREDICTION.mo21440d())) {
                        C6679f fVar = (C6679f) next.getValue();
                        str = fVar.f12452b;
                        i = Math.max(i, fVar.f12454d);
                        if (C6437k.m13342d(C6437k.C6441d.SuggestedEvents) && m14270f()) {
                            fVar.mo21441a((Runnable) new C6675b());
                            arrayList.add(fVar);
                        }
                    }
                    if (str2.equals(C6678e.MTML_INTEGRITY_DETECT.mo21440d())) {
                        C6679f fVar2 = (C6679f) next.getValue();
                        String str3 = fVar2.f12452b;
                        int max = Math.max(i, fVar2.f12454d);
                        if (C6437k.m13342d(C6437k.C6441d.IntelligentIntegrity)) {
                            fVar2.mo21441a((Runnable) new C6676c());
                            arrayList.add(fVar2);
                        }
                        str = str3;
                        i = max;
                    }
                }
                if (str != null && i > 0 && !arrayList.isEmpty()) {
                    C6679f.m14275a(new C6679f("MTML", str, (String) null, i, (float[]) null), (List<C6679f>) arrayList);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: e */
    private static JSONObject m14269e() {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest a = GraphRequest.m13073a((AccessToken) null, String.format("%s/model_asset", new Object[]{C4716f.m7697f()}), (GraphRequest.C6344f) null);
            a.mo20831a(true);
            a.mo20826a(bundle);
            JSONObject b = a.mo20825a().mo20919b();
            if (b == null) {
                return null;
            }
            return m14266c(b);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m14270f() {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            Locale e = C6476x.m13535e();
            if (e == null || e.getLanguage().contains("en")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: com.facebook.t.v.c$f */
    /* compiled from: ModelManager */
    private static class C6679f {

        /* renamed from: a */
        String f12451a;

        /* renamed from: b */
        String f12452b;

        /* renamed from: c */
        String f12453c;

        /* renamed from: d */
        int f12454d;

        /* renamed from: e */
        float[] f12455e;

        /* renamed from: f */
        File f12456f;

        /* renamed from: g */
        C6670b f12457g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Runnable f12458h;

        /* renamed from: com.facebook.t.v.c$f$a */
        /* compiled from: ModelManager */
        static class C6680a implements C6657f.C6658a {

            /* renamed from: a */
            final /* synthetic */ List f12459a;

            /* renamed from: com.facebook.t.v.c$f$a$a */
            /* compiled from: ModelManager */
            class C6681a implements C6657f.C6658a {

                /* renamed from: a */
                final /* synthetic */ C6679f f12460a;

                /* renamed from: b */
                final /* synthetic */ C6670b f12461b;

                C6681a(C6680a aVar, C6679f fVar, C6670b bVar) {
                    this.f12460a = fVar;
                    this.f12461b = bVar;
                }

                /* renamed from: a */
                public void mo21408a(File file) {
                    C6679f fVar = this.f12460a;
                    fVar.f12457g = this.f12461b;
                    fVar.f12456f = file;
                    if (fVar.f12458h != null) {
                        this.f12460a.f12458h.run();
                    }
                }
            }

            C6680a(List list) {
                this.f12459a = list;
            }

            /* renamed from: a */
            public void mo21408a(File file) {
                C6670b a = C6670b.m14250a(file);
                if (a != null) {
                    for (C6679f fVar : this.f12459a) {
                        C6679f.m14278b(fVar.f12453c, fVar.f12451a + "_" + fVar.f12454d + "_rule", new C6681a(this, fVar, a));
                    }
                }
            }
        }

        C6679f(String str, String str2, String str3, int i, float[] fArr) {
            this.f12451a = str;
            this.f12452b = str2;
            this.f12453c = str3;
            this.f12454d = i;
            this.f12455e = fArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m14278b(String str, String str2, C6657f.C6658a aVar) {
            File file = new File(C6683e.m14294a(), str2);
            if (str == null || file.exists()) {
                aVar.mo21408a(file);
            } else {
                new C6657f(str, file, aVar).execute(new String[0]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6679f mo21441a(Runnable runnable) {
            this.f12458h = runnable;
            return this;
        }

        /* renamed from: a */
        static C6679f m14273a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                return new C6679f(jSONObject.getString("use_case"), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", (String) null), jSONObject.getInt("version_id"), C6673c.m14258a(jSONObject.getJSONArray("thresholds")));
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        static void m14275a(C6679f fVar, List<C6679f> list) {
            m14276a(fVar.f12451a, fVar.f12454d);
            m14278b(fVar.f12452b, fVar.f12451a + "_" + fVar.f12454d, new C6680a(list));
        }

        /* renamed from: a */
        private static void m14276a(String str, int i) {
            File[] listFiles;
            File a = C6683e.m14294a();
            if (a != null && (listFiles = a.listFiles()) != null && listFiles.length != 0) {
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(str) && !name.startsWith(str2)) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ JSONObject m14255a() {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return m14269e();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m14263b(long j) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < ((long) f12444b.intValue());
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14256a(JSONObject jSONObject) {
        Class<C6673c> cls = C6673c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14262b(jSONObject);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static void m14262b(JSONObject jSONObject) {
        Class<C6673c> cls = C6673c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        C6679f a = C6679f.m14273a(jSONObject.getJSONObject(keys.next()));
                        if (a != null) {
                            f12443a.put(a.f12451a, a);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0063 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m14266c(org.json.JSONObject r12) {
        /*
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.Class<com.facebook.t.v.c> r3 = com.facebook.p032t.p182v.C6673c.class
            java.lang.String r4 = "rules_uri"
            java.lang.String r5 = "use_case"
            boolean r6 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r3)
            r7 = 0
            if (r6 == 0) goto L_0x0014
            return r7
        L_0x0014:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0069 }
            r6.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = "data"
            org.json.JSONArray r12 = r12.getJSONArray(r8)     // Catch:{ JSONException -> 0x0063 }
            r8 = 0
        L_0x0020:
            int r9 = r12.length()     // Catch:{ JSONException -> 0x0063 }
            if (r8 >= r9) goto L_0x0062
            org.json.JSONObject r9 = r12.getJSONObject(r8)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0063 }
            r10.<init>()     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r5)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r5, r11)     // Catch:{ JSONException -> 0x0063 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0063 }
            boolean r11 = r9.has(r4)     // Catch:{ JSONException -> 0x0063 }
            if (r11 == 0) goto L_0x0058
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0063 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0063 }
        L_0x0058:
            java.lang.String r9 = r9.getString(r5)     // Catch:{ JSONException -> 0x0063 }
            r6.put(r9, r10)     // Catch:{ JSONException -> 0x0063 }
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0062:
            return r6
        L_0x0063:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0069 }
            r12.<init>()     // Catch:{ all -> 0x0069 }
            return r12
        L_0x0069:
            r12 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r12, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p182v.C6673c.m14266c(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    static /* synthetic */ float[] m14258a(JSONArray jSONArray) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return m14264b(jSONArray);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static File m14254a(C6678e eVar) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            C6679f fVar = f12443a.get(eVar.mo21440d());
            if (fVar == null) {
                return null;
            }
            return fVar.f12456f;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static String[] m14260a(C6678e eVar, float[][] fArr, String[] strArr) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            C6679f fVar = f12443a.get(eVar.mo21440d());
            if (fVar != null) {
                if (fVar.f12457g != null) {
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    C6669a aVar = new C6669a(new int[]{length, length2});
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(fArr[i], 0, aVar.mo21433a(), i * length2, length2);
                    }
                    C6669a a = fVar.f12457g.mo21435a(aVar, strArr, eVar.mo21439a());
                    float[] fArr2 = fVar.f12455e;
                    if (!(a == null || fArr2 == null || a.mo21433a().length == 0)) {
                        if (fArr2.length != 0) {
                            int i2 = C6677d.f12447a[eVar.ordinal()];
                            if (i2 == 1) {
                                return m14259a(a, fArr2);
                            }
                            if (i2 != 2) {
                                return null;
                            }
                            return m14265b(a, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static float[] m14264b(JSONArray jSONArray) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    fArr[i] = Float.parseFloat(jSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static String[] m14265b(C6669a aVar, float[] fArr) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar.mo21431a(1);
            float[] a3 = aVar.mo21433a();
            String[] strArr = new String[a];
            if (a2 != fArr.length) {
                return null;
            }
            for (int i = 0; i < a; i++) {
                strArr[i] = "other";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (a3[(i * a2) + i2] >= fArr[i2]) {
                        strArr[i] = f12445c.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    private static String[] m14259a(C6669a aVar, float[] fArr) {
        Class<C6673c> cls = C6673c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar.mo21431a(1);
            float[] a3 = aVar.mo21433a();
            String[] strArr = new String[a];
            if (a2 != fArr.length) {
                return null;
            }
            for (int i = 0; i < a; i++) {
                strArr[i] = "none";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (a3[(i * a2) + i2] >= fArr[i2]) {
                        strArr[i] = f12446d.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
