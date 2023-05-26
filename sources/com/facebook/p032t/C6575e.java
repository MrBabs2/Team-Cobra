package com.facebook.p032t;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.C6494l;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6460r;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C4728g;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.account.AccountAnalytics;

/* renamed from: com.facebook.t.e */
/* compiled from: AppEventQueue */
class C6575e {

    /* renamed from: a */
    private static final String f12210a = "com.facebook.t.e";

    /* renamed from: b */
    private static volatile C6574d f12211b = new C6574d();

    /* renamed from: c */
    private static final ScheduledExecutorService f12212c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d */
    private static ScheduledFuture f12213d;

    /* renamed from: e */
    private static final Runnable f12214e = new C6576a();

    /* renamed from: com.facebook.t.e$a */
    /* compiled from: AppEventQueue */
    static class C6576a implements Runnable {
        C6576a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6575e.m13950a((ScheduledFuture) null);
                    if (C4728g.m7728b() != C4728g.C4729a.EXPLICIT_ONLY) {
                        C6575e.m13956b(C6593j.TIMER);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.e$b */
    /* compiled from: AppEventQueue */
    static class C6577b implements Runnable {
        C6577b() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6582f.m13963a(C6575e.m13954b());
                    C6575e.m13947a(new C6574d());
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.e$c */
    /* compiled from: AppEventQueue */
    static class C6578c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6593j f12215f;

        C6578c(C6593j jVar) {
            this.f12215f = jVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6575e.m13956b(this.f12215f);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.e$d */
    /* compiled from: AppEventQueue */
    static class C6579d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6564a f12216f;

        /* renamed from: g */
        final /* synthetic */ C6570c f12217g;

        C6579d(C6564a aVar, C6570c cVar) {
            this.f12216f = aVar;
            this.f12217g = cVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6575e.m13954b().mo21313a(this.f12216f, this.f12217g);
                    if (C4728g.m7728b() != C4728g.C4729a.EXPLICIT_ONLY && C6575e.m13954b().mo21311a() > 100) {
                        C6575e.m13956b(C6593j.EVENT_THRESHOLD);
                    } else if (C6575e.m13949a() == null) {
                        C6575e.m13950a((ScheduledFuture) C6575e.m13958d().schedule(C6575e.m13957c(), 15, TimeUnit.SECONDS));
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.e$e */
    /* compiled from: AppEventQueue */
    static class C6580e implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ C6564a f12218a;

        /* renamed from: b */
        final /* synthetic */ GraphRequest f12219b;

        /* renamed from: c */
        final /* synthetic */ C6600o f12220c;

        /* renamed from: d */
        final /* synthetic */ C6595l f12221d;

        C6580e(C6564a aVar, GraphRequest graphRequest, C6600o oVar, C6595l lVar) {
            this.f12218a = aVar;
            this.f12219b = graphRequest;
            this.f12220c = oVar;
            this.f12221d = lVar;
        }

        public void onCompleted(C6371i iVar) {
            C6575e.m13951a(this.f12218a, this.f12219b, iVar, this.f12220c, this.f12221d);
        }
    }

    /* renamed from: com.facebook.t.e$f */
    /* compiled from: AppEventQueue */
    static class C6581f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6564a f12222f;

        /* renamed from: g */
        final /* synthetic */ C6600o f12223g;

        C6581f(C6564a aVar, C6600o oVar) {
            this.f12222f = aVar;
            this.f12223g = oVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6582f.m13962a(this.f12222f, this.f12223g);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    C6575e() {
    }

    /* renamed from: a */
    static /* synthetic */ ScheduledFuture m13949a() {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12213d;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ C6574d m13954b() {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12211b;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Runnable m13957c() {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12214e;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ ScheduledExecutorService m13958d() {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12212c;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static Set<C6564a> m13959e() {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12211b.mo21315b();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static void m13960f() {
        Class<C6575e> cls = C6575e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12212c.execute(new C6577b());
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ ScheduledFuture m13950a(ScheduledFuture scheduledFuture) {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12213d = scheduledFuture;
            return scheduledFuture;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13956b(com.facebook.p032t.C6593j r4) {
        /*
            java.lang.Class<com.facebook.t.e> r0 = com.facebook.p032t.C6575e.class
            boolean r1 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            com.facebook.t.n r1 = com.facebook.p032t.C6582f.m13961a()     // Catch:{ all -> 0x0044 }
            com.facebook.t.d r2 = f12211b     // Catch:{ all -> 0x0044 }
            r2.mo21314a((com.facebook.p032t.C6597n) r1)     // Catch:{ all -> 0x0044 }
            com.facebook.t.d r1 = f12211b     // Catch:{ Exception -> 0x003b }
            com.facebook.t.l r4 = m13948a((com.facebook.p032t.C6593j) r4, (com.facebook.p032t.C6574d) r1)     // Catch:{ Exception -> 0x003b }
            if (r4 == 0) goto L_0x003a
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.f12248a     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            com.facebook.t.k r4 = r4.f12249b     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x0044 }
            android.content.Context r4 = com.facebook.C4716f.m7696e()     // Catch:{ all -> 0x0044 }
            l.m.a.a r4 = p050l.p097m.p098a.C5133a.m9478a((android.content.Context) r4)     // Catch:{ all -> 0x0044 }
            r4.mo17802a((android.content.Intent) r1)     // Catch:{ all -> 0x0044 }
        L_0x003a:
            return
        L_0x003b:
            r4 = move-exception
            java.lang.String r1 = f12210a     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r4 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.C6575e.m13956b(com.facebook.t.j):void");
    }

    /* renamed from: a */
    static /* synthetic */ C6574d m13947a(C6574d dVar) {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12211b = dVar;
            return dVar;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m13951a(C6564a aVar, GraphRequest graphRequest, C6371i iVar, C6600o oVar, C6595l lVar) {
        Class<C6575e> cls = C6575e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m13955b(aVar, graphRequest, iVar, oVar, lVar);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    public static void m13953a(C6593j jVar) {
        Class<C6575e> cls = C6575e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12212c.execute(new C6578c(jVar));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    public static void m13952a(C6564a aVar, C6570c cVar) {
        Class<C6575e> cls = C6575e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12212c.execute(new C6579d(aVar, cVar));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static C6595l m13948a(C6593j jVar, C6574d dVar) {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            C6595l lVar = new C6595l();
            boolean a = C4716f.m7688a(C4716f.m7696e());
            ArrayList<GraphRequest> arrayList = new ArrayList<>();
            for (C6564a next : dVar.mo21315b()) {
                GraphRequest a2 = m13946a(next, dVar.mo21312a(next), a, lVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            C6460r.m13408a(C6494l.APP_EVENTS, f12210a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f12248a), jVar.toString());
            for (GraphRequest a3 : arrayList) {
                a3.mo20825a();
            }
            return lVar;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static void m13955b(C6564a aVar, GraphRequest graphRequest, C6371i iVar, C6600o oVar, C6595l lVar) {
        String str;
        Class<C6575e> cls = C6575e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                FacebookRequestError a = iVar.mo20918a();
                String str2 = AccountAnalytics.SUCCESS;
                C6594k kVar = C6594k.SUCCESS;
                boolean z = true;
                if (a != null) {
                    if (a.mo20812a() == -1) {
                        str2 = "Failed: No Connectivity";
                        kVar = C6594k.NO_CONNECTIVITY;
                    } else {
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{iVar.toString(), a.toString()});
                        kVar = C6594k.SERVER_ERROR;
                    }
                }
                if (C4716f.m7689a(C6494l.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) graphRequest.mo20840j()).toString(2);
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    C6460r.m13408a(C6494l.APP_EVENTS, f12210a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo20835e().toString(), str2, str);
                }
                if (a == null) {
                    z = false;
                }
                oVar.mo21350a(z);
                if (kVar == C6594k.NO_CONNECTIVITY) {
                    C4716f.m7704m().execute(new C6581f(aVar, oVar));
                }
                if (kVar != C6594k.SUCCESS && lVar.f12249b != C6594k.NO_CONNECTIVITY) {
                    lVar.f12249b = kVar;
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static GraphRequest m13946a(C6564a aVar, C6600o oVar, boolean z, C6595l lVar) {
        Class<C6575e> cls = C6575e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            String b = aVar.mo21301b();
            boolean z2 = false;
            C6446m a = C6448n.m13378a(b, false);
            GraphRequest a2 = GraphRequest.m13074a((AccessToken) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (GraphRequest.C6344f) null);
            Bundle h = a2.mo20838h();
            if (h == null) {
                h = new Bundle();
            }
            h.putString("access_token", aVar.mo21300a());
            String d = C6596m.m13997d();
            if (d != null) {
                h.putString("device_token", d);
            }
            String e = C6584h.m13974e();
            if (e != null) {
                h.putString("install_referrer", e);
            }
            a2.mo20826a(h);
            if (a != null) {
                z2 = a.mo21000m();
            }
            int a3 = oVar.mo21348a(a2, C4716f.m7696e(), z2, z);
            if (a3 == 0) {
                return null;
            }
            lVar.f12248a += a3;
            a2.mo20827a((GraphRequest.C6344f) new C6580e(aVar, a2, oVar, lVar));
            return a2;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
