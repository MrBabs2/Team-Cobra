package p036io.rakam.api;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.rakam.api.e */
/* compiled from: Diagnostics */
public class C9022e {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C9026i f25540j = C9026i.m29670a();

    /* renamed from: k */
    protected static C9022e f25541k;

    /* renamed from: a */
    volatile boolean f25542a = false;

    /* renamed from: b */
    private volatile String f25543b;

    /* renamed from: c */
    private volatile OkHttpClient f25544c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile String f25545d;

    /* renamed from: e */
    int f25546e = 50;

    /* renamed from: f */
    String f25547f = "https://diagnostics.rakam.io/event/batch";

    /* renamed from: g */
    C9029l f25548g = new C9029l("diagnosticThread");

    /* renamed from: h */
    List<String> f25549h = new ArrayList(this.f25546e);

    /* renamed from: i */
    Map<String, JSONObject> f25550i = new HashMap(this.f25546e);

    /* renamed from: io.rakam.api.e$a */
    /* compiled from: Diagnostics */
    class C9023a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f25551f;

        /* renamed from: g */
        final /* synthetic */ Throwable f25552g;

        C9023a(String str, Throwable th) {
            this.f25551f = str;
            this.f25552g = th;
        }

        public void run() {
            JSONObject jSONObject = C9022e.this.f25550i.get(this.f25551f);
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("error", C4760h.m7836h(this.f25551f));
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONObject2.put("device_id", C9022e.this.f25545d);
                    jSONObject2.put("count", 1);
                    if (this.f25552g != null) {
                        String stackTraceString = Log.getStackTraceString(this.f25552g);
                        if (!C9028k.m29695a(stackTraceString)) {
                            jSONObject2.put("stack_trace", C4760h.m7836h(stackTraceString));
                        }
                    }
                    if (C9022e.this.f25549h.size() >= C9022e.this.f25546e) {
                        for (int i = 0; i < 5; i++) {
                            C9022e.this.f25550i.remove(C9022e.this.f25549h.remove(0));
                        }
                    }
                    C9022e.this.f25550i.put(this.f25551f, jSONObject2);
                    C9022e.this.f25549h.add(this.f25551f);
                } catch (JSONException unused) {
                }
            } else {
                jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
            }
        }
    }

    /* renamed from: io.rakam.api.e$b */
    /* compiled from: Diagnostics */
    class C9024b implements Runnable {
        C9024b() {
        }

        public void run() {
            if (!C9022e.this.f25549h.isEmpty()) {
                ArrayList arrayList = new ArrayList(C9022e.this.f25549h.size());
                for (String str : C9022e.this.f25549h) {
                    try {
                        arrayList.add(new JSONObject().put("properties", C9022e.this.f25550i.get(str)).put("collection", "android_sdk_error"));
                    } catch (JSONException e) {
                        C9026i b = C9022e.f25540j;
                        b.mo33373b("RakamDiagnostics", "Unable to serialize events: " + e.getMessage());
                    }
                }
                if (new JSONArray(arrayList).length() > 0) {
                    C9022e.this.mo33358a(new JSONArray(arrayList));
                }
            }
        }
    }

    private C9022e() {
        this.f25548g.start();
    }

    /* renamed from: c */
    static synchronized C9022e m29662c() {
        C9022e eVar;
        synchronized (C9022e.class) {
            if (f25541k == null) {
                f25541k = new C9022e();
            }
            eVar = f25541k;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9022e mo33356a(OkHttpClient okHttpClient, String str, String str2) {
        this.f25542a = true;
        this.f25543b = str;
        this.f25544c = okHttpClient;
        this.f25545d = str2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9022e mo33354a(String str) {
        mo33355a(str, (Throwable) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9022e mo33355a(String str, Throwable th) {
        if (this.f25542a && !C9028k.m29695a(str) && !C9028k.m29695a(this.f25545d)) {
            mo33357a((Runnable) new C9023a(str, th));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9022e mo33353a() {
        if (this.f25542a && !C9028k.m29695a(this.f25543b) && this.f25544c != null && !C9028k.m29695a(this.f25545d)) {
            mo33357a((Runnable) new C9024b());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33358a(JSONArray jSONArray) {
        try {
            try {
                if (this.f25544c.newCall(new Request.Builder().url(this.f25547f).post(RequestBody.create(C4760h.f8055M, new JSONObject().put("api", new JSONObject().put("api_key", this.f25543b).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", System.currentTimeMillis())).put("events", jSONArray).toString())).build()).execute().body().string().equals(DiskLruCache.VERSION_1)) {
                    this.f25550i.clear();
                    this.f25549h.clear();
                }
            } catch (IOException | AssertionError | Exception unused) {
            }
        } catch (JSONException e) {
            f25540j.mo33373b("RakamDiagnostics", String.format("Failed to convert revenue object to JSON: %s", new Object[]{e.toString()}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33357a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C9029l lVar = this.f25548g;
        if (currentThread != lVar) {
            lVar.mo33388a(runnable);
        } else {
            runnable.run();
        }
    }
}
