package com.facebook.p032t.p177r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.C6494l;
import com.facebook.GraphRequest;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p181u.C6650b;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

/* renamed from: com.facebook.t.r.e */
/* compiled from: ViewIndexer */
public class C6623e {

    /* renamed from: e */
    private static final String f12322e = "com.facebook.t.r.e";

    /* renamed from: a */
    private final Handler f12323a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private WeakReference<Activity> f12324b;

    /* renamed from: c */
    private Timer f12325c;

    /* renamed from: d */
    private String f12326d = null;

    /* renamed from: com.facebook.t.r.e$a */
    /* compiled from: ViewIndexer */
    class C6624a extends TimerTask {
        C6624a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.facebook.t.r.e r0 = com.facebook.p032t.p177r.C6623e.this     // Catch:{ Exception -> 0x008f }
                java.lang.ref.WeakReference r0 = com.facebook.p032t.p177r.C6623e.m14099a((com.facebook.p032t.p177r.C6623e) r0)     // Catch:{ Exception -> 0x008f }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x008f }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x008f }
                android.view.View r1 = com.facebook.p032t.p181u.C6650b.m14182a((android.app.Activity) r0)     // Catch:{ Exception -> 0x008f }
                if (r0 == 0) goto L_0x008e
                if (r1 != 0) goto L_0x0016
                goto L_0x008e
            L_0x0016:
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x008f }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x008f }
                boolean r2 = com.facebook.p032t.p177r.C6613b.m14073f()     // Catch:{ Exception -> 0x008f }
                if (r2 != 0) goto L_0x0025
                return
            L_0x0025:
                boolean r2 = com.facebook.internal.C6457p.m13402b()     // Catch:{ Exception -> 0x008f }
                if (r2 == 0) goto L_0x002f
                com.facebook.p032t.p177r.p178g.C6638e.m14126a()     // Catch:{ Exception -> 0x008f }
                return
            L_0x002f:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x008f }
                com.facebook.t.r.e$e r3 = new com.facebook.t.r.e$e     // Catch:{ Exception -> 0x008f }
                r3.<init>(r1)     // Catch:{ Exception -> 0x008f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x008f }
                com.facebook.t.r.e r3 = com.facebook.p032t.p177r.C6623e.this     // Catch:{ Exception -> 0x008f }
                android.os.Handler r3 = com.facebook.p032t.p177r.C6623e.m14103b(r3)     // Catch:{ Exception -> 0x008f }
                r3.post(r2)     // Catch:{ Exception -> 0x008f }
                java.lang.String r3 = ""
                r4 = 1
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0050 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0050 }
                r3 = r2
                goto L_0x005a
            L_0x0050:
                r2 = move-exception
                java.lang.String r4 = com.facebook.p032t.p177r.C6623e.m14105c()     // Catch:{ Exception -> 0x008f }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x008f }
            L_0x005a:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
                r2.<init>()     // Catch:{ Exception -> 0x008f }
                java.lang.String r4 = "screenname"
                r2.put(r4, r0)     // Catch:{ JSONException -> 0x007b }
                java.lang.String r0 = "screenshot"
                r2.put(r0, r3)     // Catch:{ JSONException -> 0x007b }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007b }
                r0.<init>()     // Catch:{ JSONException -> 0x007b }
                org.json.JSONObject r1 = com.facebook.p032t.p177r.p178g.C6639f.m14138d(r1)     // Catch:{ JSONException -> 0x007b }
                r0.put(r1)     // Catch:{ JSONException -> 0x007b }
                java.lang.String r1 = "view"
                r2.put(r1, r0)     // Catch:{ JSONException -> 0x007b }
                goto L_0x0084
            L_0x007b:
                java.lang.String r0 = com.facebook.p032t.p177r.C6623e.m14105c()     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x008f }
            L_0x0084:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x008f }
                com.facebook.t.r.e r1 = com.facebook.p032t.p177r.C6623e.this     // Catch:{ Exception -> 0x008f }
                com.facebook.p032t.p177r.C6623e.m14101a((com.facebook.p032t.p177r.C6623e) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x008f }
                goto L_0x0099
            L_0x008e:
                return
            L_0x008f:
                r0 = move-exception
                java.lang.String r1 = com.facebook.p032t.p177r.C6623e.m14105c()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p177r.C6623e.C6624a.run():void");
        }
    }

    /* renamed from: com.facebook.t.r.e$b */
    /* compiled from: ViewIndexer */
    class C6625b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ TimerTask f12328f;

        C6625b(TimerTask timerTask) {
            this.f12328f = timerTask;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (C6623e.m14106c(C6623e.this) != null) {
                        C6623e.m14106c(C6623e.this).cancel();
                    }
                    C6623e.m14104b(C6623e.this, (String) null);
                    C6623e.m14100a(C6623e.this, new Timer());
                    C6623e.m14106c(C6623e.this).scheduleAtFixedRate(this.f12328f, 0, 1000);
                } catch (Exception e) {
                    Log.e(C6623e.m14105c(), "Error scheduling indexing job", e);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.r.e$c */
    /* compiled from: ViewIndexer */
    class C6626c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12330f;

        C6626c(String str) {
            this.f12330f = str;
        }

        public void run() {
            GraphRequest a;
            if (!C6391a.m13260a((Object) this)) {
                try {
                    String e = C6476x.m13534e(this.f12330f);
                    AccessToken r = AccessToken.m13036r();
                    if ((e == null || !e.equals(C6623e.m14107d(C6623e.this))) && (a = C6623e.m14098a(this.f12330f, r, C4716f.m7697f(), "app_indexing")) != null) {
                        C6371i a2 = a.mo20825a();
                        JSONObject b = a2.mo20919b();
                        if (b != null) {
                            if ("true".equals(b.optString(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION))) {
                                C6460r.m13407a(C6494l.APP_EVENTS, C6623e.m14105c(), "Successfully send UI component tree to server");
                                C6623e.m14104b(C6623e.this, e);
                            }
                            if (b.has("is_app_indexing_enabled")) {
                                C6613b.m14069c(Boolean.valueOf(b.getBoolean("is_app_indexing_enabled")));
                                return;
                            }
                            return;
                        }
                        String c = C6623e.m14105c();
                        Log.e(c, "Error sending UI component tree to Facebook: " + a2.mo20918a());
                    }
                } catch (JSONException e2) {
                    Log.e(C6623e.m14105c(), "Error decoding server response.", e2);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.r.e$d */
    /* compiled from: ViewIndexer */
    static class C6627d implements GraphRequest.C6344f {
        C6627d() {
        }

        public void onCompleted(C6371i iVar) {
            C6460r.m13407a(C6494l.APP_EVENTS, C6623e.m14105c(), "App index sent to FB!");
        }
    }

    /* renamed from: com.facebook.t.r.e$e */
    /* compiled from: ViewIndexer */
    private static class C6628e implements Callable<String> {

        /* renamed from: f */
        private WeakReference<View> f12332f;

        C6628e(View view) {
            this.f12332f = new WeakReference<>(view);
        }

        public String call() {
            View view = (View) this.f12332f.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public C6623e(Activity activity) {
        this.f12324b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m14099a(C6623e eVar) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return eVar.f12324b;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Handler m14103b(C6623e eVar) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return eVar.f12323a;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m14105c() {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12322e;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ String m14107d(C6623e eVar) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return eVar.f12326d;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14101a(C6623e eVar, String str) {
        Class<C6623e> cls = C6623e.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                eVar.m14102a(str);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m14104b(C6623e eVar, String str) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            eVar.f12326d = str;
            return str;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Timer m14106c(C6623e eVar) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return eVar.f12325c;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Timer m14100a(C6623e eVar, Timer timer) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            eVar.f12325c = timer;
            return timer;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public void mo21380b() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (((Activity) this.f12324b.get()) != null && this.f12325c != null) {
                    this.f12325c.cancel();
                    this.f12325c = null;
                }
            } catch (Exception e) {
                Log.e(f12322e, "Error unscheduling indexing job", e);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    public void mo21379a() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C4716f.m7704m().execute(new C6625b(new C6624a()));
            } catch (RejectedExecutionException e) {
                Log.e(f12322e, "Error scheduling indexing job", e);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private void m14102a(String str) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C4716f.m7704m().execute(new C6626c(str));
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    public static GraphRequest m14098a(String str, AccessToken accessToken, String str2, String str3) {
        Class<C6623e> cls = C6623e.class;
        if (C6391a.m13260a((Object) cls) || str == null) {
            return null;
        }
        try {
            GraphRequest a = GraphRequest.m13074a(accessToken, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (GraphRequest.C6344f) null);
            Bundle h = a.mo20838h();
            if (h == null) {
                h = new Bundle();
            }
            h.putString("tree", str);
            h.putString("app_version", C6650b.m14186c());
            h.putString("platform", "android");
            h.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                h.putString("device_session_id", C6613b.m14072e());
            }
            a.mo20826a(h);
            a.mo20827a((GraphRequest.C6344f) new C6627d());
            return a;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
