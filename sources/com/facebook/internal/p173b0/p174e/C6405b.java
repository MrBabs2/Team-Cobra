package com.facebook.internal.p173b0.p174e;

import android.os.Build;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6368h;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.internal.p173b0.C6399a;
import com.facebook.internal.p173b0.C6400b;
import com.facebook.internal.p173b0.C6401c;
import com.facebook.internal.p173b0.C6402d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b0.e.b */
/* compiled from: MonitorLoggingManager */
public class C6405b implements C6401c {

    /* renamed from: d */
    private static final Integer f11767d = 100;

    /* renamed from: e */
    private static C6405b f11768e;

    /* renamed from: f */
    private static String f11769f = Build.VERSION.RELEASE;

    /* renamed from: g */
    private static String f11770g = Build.MODEL;

    /* renamed from: a */
    private C6400b f11771a;

    /* renamed from: b */
    private C6402d f11772b;

    /* renamed from: c */
    private ScheduledFuture f11773c;

    /* renamed from: com.facebook.internal.b0.e.b$a */
    /* compiled from: MonitorLoggingManager */
    class C6406a implements Runnable {
        C6406a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6405b.this.mo20967b();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    private C6405b(C6400b bVar, C6402d dVar) {
        Executors.newSingleThreadScheduledExecutor();
        new C6406a();
        if (this.f11771a == null) {
            this.f11771a = bVar;
        }
        if (this.f11772b == null) {
            this.f11772b = dVar;
        }
    }

    /* renamed from: a */
    public static synchronized C6405b m13285a(C6400b bVar, C6402d dVar) {
        C6405b bVar2;
        synchronized (C6405b.class) {
            if (f11768e == null) {
                f11768e = new C6405b(bVar, dVar);
            }
            bVar2 = f11768e;
        }
        return bVar2;
    }

    /* renamed from: b */
    public void mo20967b() {
        ScheduledFuture scheduledFuture = this.f11773c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        try {
            new C6368h((Collection<GraphRequest>) m13286a(this.f11771a)).mo20904c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo20964a() {
        this.f11771a.mo20962a(this.f11772b.mo20965a());
        mo20967b();
    }

    /* renamed from: a */
    static List<GraphRequest> m13286a(C6400b bVar) {
        ArrayList arrayList = new ArrayList();
        if (C6476x.m13533d(C4716f.m7697f())) {
            return arrayList;
        }
        while (!bVar.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < f11767d.intValue() && !bVar.isEmpty(); i++) {
                arrayList2.add(bVar.mo20961a());
            }
            GraphRequest a = m13284a((List<? extends C6399a>) arrayList2);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static GraphRequest m13284a(List<? extends C6399a> list) {
        String packageName = C4716f.m7696e().getPackageName();
        JSONArray jSONArray = new JSONArray();
        for (C6399a x : list) {
            jSONArray.put(x.mo20960x());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", f11769f);
            jSONObject.put("device_model", f11770g);
            jSONObject.put("unique_application_identifier", packageName);
            jSONObject.put("entries", jSONArray);
            return GraphRequest.m13074a((AccessToken) null, String.format("%s/monitorings", new Object[]{C4716f.m7697f()}), jSONObject, (GraphRequest.C6344f) null);
        } catch (JSONException unused) {
            return null;
        }
    }
}
