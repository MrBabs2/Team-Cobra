package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6437k;
import com.facebook.internal.C6474v;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.C6382c;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.internal.p173b0.p174e.C6409e;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.C6588i;
import com.facebook.p032t.p181u.C6651c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f */
/* compiled from: FacebookSdk */
public final class C4716f {

    /* renamed from: a */
    private static final String f7994a = "com.facebook.f";

    /* renamed from: b */
    private static final HashSet<C6494l> f7995b = new HashSet<>(Arrays.asList(new C6494l[]{C6494l.DEVELOPER_ERRORS}));

    /* renamed from: c */
    private static Executor f7996c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f7997d;

    /* renamed from: e */
    private static volatile String f7998e;

    /* renamed from: f */
    private static volatile String f7999f;

    /* renamed from: g */
    private static volatile Boolean f8000g;

    /* renamed from: h */
    private static volatile String f8001h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f8002i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f8003j = false;

    /* renamed from: k */
    private static boolean f8004k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static Context f8005l;

    /* renamed from: m */
    private static int f8006m = 64206;

    /* renamed from: n */
    private static final Object f8007n = new Object();

    /* renamed from: o */
    private static String f8008o = C6474v.m13472a();

    /* renamed from: p */
    public static boolean f8009p = false;

    /* renamed from: q */
    public static boolean f8010q = false;

    /* renamed from: r */
    private static Boolean f8011r = false;

    /* renamed from: s */
    private static Boolean f8012s = false;

    /* renamed from: t */
    private static C4726j f8013t = new C4717a();

    /* renamed from: com.facebook.f$a */
    /* compiled from: FacebookSdk */
    static class C4717a implements C4726j {
        C4717a() {
        }

        /* renamed from: a */
        public GraphRequest mo15771a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.C6344f fVar) {
            return GraphRequest.m13074a(accessToken, str, jSONObject, fVar);
        }
    }

    /* renamed from: com.facebook.f$b */
    /* compiled from: FacebookSdk */
    static class C4718b implements Callable<File> {
        C4718b() {
        }

        public File call() throws Exception {
            return C4716f.f8005l.getCacheDir();
        }
    }

    /* renamed from: com.facebook.f$c */
    /* compiled from: FacebookSdk */
    static class C4719c implements C6437k.C6440c {
        C4719c() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6382c.m13241a();
            }
        }
    }

    /* renamed from: com.facebook.f$d */
    /* compiled from: FacebookSdk */
    static class C4720d implements C6437k.C6440c {
        C4720d() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6588i.m13989a();
            }
        }
    }

    /* renamed from: com.facebook.f$e */
    /* compiled from: FacebookSdk */
    static class C4721e implements C6437k.C6440c {
        C4721e() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C4716f.f8009p = true;
            }
        }
    }

    /* renamed from: com.facebook.f$f */
    /* compiled from: FacebookSdk */
    static class C4722f implements C6437k.C6440c {
        C4722f() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C4716f.f8010q = true;
            }
        }
    }

    /* renamed from: com.facebook.f$g */
    /* compiled from: FacebookSdk */
    static class C4723g implements C6437k.C6440c {
        C4723g() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6409e.m13295a();
            }
        }
    }

    /* renamed from: com.facebook.f$h */
    /* compiled from: FacebookSdk */
    static class C4724h implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ C4727k f8014f;

        /* renamed from: g */
        final /* synthetic */ Context f8015g;

        C4724h(C4727k kVar, Context context) {
            this.f8014f = kVar;
            this.f8015g = context;
        }

        public Void call() throws Exception {
            C6353b.m13173e().mo20884d();
            C6536n.m13829c().mo21228b();
            if (AccessToken.m13037s() && Profile.m13153d() == null) {
                Profile.m13152c();
            }
            C4727k kVar = this.f8014f;
            if (kVar != null) {
                kVar.mo15776a();
            }
            C4728g.m7726a(C4716f.f8005l, C4716f.f7997d);
            C6543s.m13862k();
            C4728g.m7729b(this.f8015g.getApplicationContext()).mo15777a();
            return null;
        }
    }

    /* renamed from: com.facebook.f$i */
    /* compiled from: FacebookSdk */
    static class C4725i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f8016f;

        /* renamed from: g */
        final /* synthetic */ String f8017g;

        C4725i(Context context, String str) {
            this.f8016f = context;
            this.f8017g = str;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C4716f.m7687a(this.f8016f, this.f8017g);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.f$j */
    /* compiled from: FacebookSdk */
    public interface C4726j {
        /* renamed from: a */
        GraphRequest mo15771a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.C6344f fVar);
    }

    /* renamed from: com.facebook.f$k */
    /* compiled from: FacebookSdk */
    public interface C4727k {
        /* renamed from: a */
        void mo15776a();
    }

    @Deprecated
    /* renamed from: c */
    public static synchronized void m7694c(Context context) {
        synchronized (C4716f.class) {
            m7686a(context, (C4727k) null);
        }
    }

    /* renamed from: d */
    public static boolean m7695d() {
        return C6543s.m13855d();
    }

    /* renamed from: e */
    public static Context m7696e() {
        C6481y.m13563c();
        return f8005l;
    }

    /* renamed from: f */
    public static String m7697f() {
        C6481y.m13563c();
        return f7997d;
    }

    /* renamed from: g */
    public static String m7698g() {
        C6481y.m13563c();
        return f7998e;
    }

    /* renamed from: h */
    public static boolean m7699h() {
        return C6543s.m13856e();
    }

    /* renamed from: i */
    public static boolean m7700i() {
        return C6543s.m13857f();
    }

    /* renamed from: j */
    public static int m7701j() {
        C6481y.m13563c();
        return f8006m;
    }

    /* renamed from: k */
    public static String m7702k() {
        C6481y.m13563c();
        return f7999f;
    }

    /* renamed from: l */
    public static boolean m7703l() {
        return C6543s.m13858g();
    }

    /* renamed from: m */
    public static Executor m7704m() {
        synchronized (f8007n) {
            if (f7996c == null) {
                f7996c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f7996c;
    }

    /* renamed from: n */
    public static String m7705n() {
        return f8001h;
    }

    /* renamed from: o */
    public static String m7706o() {
        C6476x.m13528c(f7994a, String.format("getGraphApiVersion: %s", new Object[]{f8008o}));
        return f8008o;
    }

    /* renamed from: p */
    public static String m7707p() {
        AccessToken r = AccessToken.m13036r();
        String f = r != null ? r.mo20783f() : null;
        if (f == null) {
            return f8001h;
        }
        if (f.equals("gaming")) {
            return f8001h.replace("facebook.com", "fb.gg");
        }
        return f8001h;
    }

    /* renamed from: q */
    public static boolean m7708q() {
        return C6543s.m13859h();
    }

    /* renamed from: r */
    public static long m7709r() {
        C6481y.m13563c();
        return f8002i.get();
    }

    /* renamed from: s */
    public static String m7710s() {
        return "7.1.0";
    }

    /* renamed from: t */
    public static boolean m7711t() {
        return f8003j;
    }

    /* renamed from: u */
    public static synchronized boolean m7712u() {
        boolean booleanValue;
        synchronized (C4716f.class) {
            booleanValue = f8012s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: v */
    public static synchronized boolean m7713v() {
        boolean booleanValue;
        synchronized (C4716f.class) {
            booleanValue = f8011r.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: w */
    public static boolean m7714w() {
        return f8004k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m7686a(android.content.Context r3, com.facebook.C4716f.C4727k r4) {
        /*
            java.lang.Class<com.facebook.f> r0 = com.facebook.C4716f.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f8011r     // Catch:{ all -> 0x00bb }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo15776a()     // Catch:{ all -> 0x00bb }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C6481y.m13556a((java.lang.Object) r3, (java.lang.String) r1)     // Catch:{ all -> 0x00bb }
            r1 = 0
            com.facebook.internal.C6481y.m13555a((android.content.Context) r3, (boolean) r1)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6481y.m13561b((android.content.Context) r3, (boolean) r1)     // Catch:{ all -> 0x00bb }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x00bb }
            f8005l = r1     // Catch:{ all -> 0x00bb }
            com.facebook.p032t.C4728g.m7723a((android.content.Context) r3)     // Catch:{ all -> 0x00bb }
            android.content.Context r1 = f8005l     // Catch:{ all -> 0x00bb }
            m7691b(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = f7997d     // Catch:{ all -> 0x00bb }
            boolean r1 = com.facebook.internal.C6476x.m13533d((java.lang.String) r1)     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x00b3
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00bb }
            f8011r = r1     // Catch:{ all -> 0x00bb }
            boolean r1 = m7699h()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0044
            m7693c()     // Catch:{ all -> 0x00bb }
        L_0x0044:
            android.content.Context r1 = f8005l     // Catch:{ all -> 0x00bb }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0059
            boolean r1 = com.facebook.C6543s.m13857f()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0059
            android.content.Context r1 = f8005l     // Catch:{ all -> 0x00bb }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = f7997d     // Catch:{ all -> 0x00bb }
            com.facebook.p032t.p181u.C6643a.m14160a(r1, r2)     // Catch:{ all -> 0x00bb }
        L_0x0059:
            com.facebook.internal.C6448n.m13390f()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6461s.m13443g()     // Catch:{ all -> 0x00bb }
            android.content.Context r1 = f8005l     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6398b.m13272a(r1)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.q r1 = new com.facebook.internal.q     // Catch:{ all -> 0x00bb }
            com.facebook.f$b r2 = new com.facebook.f$b     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            r1.<init>(r2)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Instrument     // Catch:{ all -> 0x00bb }
            com.facebook.f$c r2 = new com.facebook.f$c     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6437k.m13338a(r1, r2)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.AppEvents     // Catch:{ all -> 0x00bb }
            com.facebook.f$d r2 = new com.facebook.f$d     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6437k.m13338a(r1, r2)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x00bb }
            com.facebook.f$e r2 = new com.facebook.f$e     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6437k.m13338a(r1, r2)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x00bb }
            com.facebook.f$f r2 = new com.facebook.f$f     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6437k.m13338a(r1, r2)     // Catch:{ all -> 0x00bb }
            com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Monitoring     // Catch:{ all -> 0x00bb }
            com.facebook.f$g r2 = new com.facebook.f$g     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            com.facebook.internal.C6437k.m13338a(r1, r2)     // Catch:{ all -> 0x00bb }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x00bb }
            com.facebook.f$h r2 = new com.facebook.f$h     // Catch:{ all -> 0x00bb }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00bb }
            r1.<init>(r2)     // Catch:{ all -> 0x00bb }
            java.util.concurrent.Executor r3 = m7704m()     // Catch:{ all -> 0x00bb }
            r3.execute(r1)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)
            return
        L_0x00b3:
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x00bb }
            throw r3     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4716f.m7686a(android.content.Context, com.facebook.f$k):void");
    }

    /* renamed from: b */
    public static void m7692b(Context context, String str) {
        Class<C4716f> cls = C4716f.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m7704m().execute(new C4725i(context.getApplicationContext(), str));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static void m7693c() {
        f8012s = true;
    }

    /* renamed from: b */
    static void m7691b(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (f7997d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                f7997d = str.substring(2);
                            } else {
                                f7997d = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f7998e == null) {
                        f7998e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f7999f == null) {
                        f7999f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f8006m == 64206) {
                        f8006m = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f8000g == null) {
                        f8000g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m7689a(C6494l lVar) {
        boolean z;
        synchronized (f7995b) {
            z = m7711t() && f7995b.contains(lVar);
        }
        return z;
    }

    /* renamed from: a */
    static void m7687a(Context context, String str) {
        Class<C4716f> cls = C4716f.class;
        if (!C6391a.m13260a((Object) cls)) {
            if (context == null || str == null) {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            try {
                C6372a d = C6372a.m13215d(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0);
                GraphRequest a = f8013t.mo15771a((AccessToken) null, String.format("%s/activities", new Object[]{str}), C6651c.m14188a(C6651c.C6653b.MOBILE_INSTALL_EVENT, d, C4728g.m7723a(context), m7688a(context), context), (GraphRequest.C6344f) null);
                if (j == 0 && a.mo20825a().mo20918a() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e) {
                throw new FacebookException("An error occurred while publishing install.", e);
            } catch (Exception e2) {
                try {
                    C6476x.m13507a("Facebook-publish", e2);
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m7688a(Context context) {
        C6481y.m13563c();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
