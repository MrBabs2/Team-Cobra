package p036io.rakam.api;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.Thread;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowFragment;

/* renamed from: io.rakam.api.h */
/* compiled from: RakamClient */
public class C4760h {

    /* renamed from: M */
    public static final MediaType f8055M = MediaType.parse("application/json; charset=utf-8");
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final C9026i f8056N = C9026i.m29670a();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f8057A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f8058B;

    /* renamed from: C */
    private boolean f8059C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f8060D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f8061E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public JSONObject f8062F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f8063G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public AtomicBoolean f8064H;

    /* renamed from: I */
    AtomicBoolean f8065I;

    /* renamed from: J */
    private String f8066J;

    /* renamed from: K */
    C9029l f8067K;

    /* renamed from: L */
    C9029l f8068L;

    /* renamed from: a */
    protected Context f8069a;

    /* renamed from: b */
    protected OkHttpClient f8070b;

    /* renamed from: c */
    protected C9017b f8071c;

    /* renamed from: d */
    protected String f8072d;

    /* renamed from: e */
    protected String f8073e;

    /* renamed from: f */
    protected String f8074f;

    /* renamed from: g */
    protected String f8075g;

    /* renamed from: h */
    private boolean f8076h;

    /* renamed from: i */
    private boolean f8077i;

    /* renamed from: j */
    protected boolean f8078j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f8079k;

    /* renamed from: l */
    private boolean f8080l;

    /* renamed from: m */
    C9027j f8081m;

    /* renamed from: n */
    protected String f8082n;

    /* renamed from: o */
    long f8083o;

    /* renamed from: p */
    long f8084p;

    /* renamed from: q */
    long f8085q;

    /* renamed from: r */
    long f8086r;

    /* renamed from: s */
    long f8087s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9019d f8088t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f8089u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f8090v;

    /* renamed from: w */
    private int f8091w;

    /* renamed from: x */
    private long f8092x;

    /* renamed from: y */
    private long f8093y;

    /* renamed from: z */
    private long f8094z;

    /* renamed from: io.rakam.api.h$a */
    /* compiled from: RakamClient */
    class C4761a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4760h f8095f;

        /* renamed from: g */
        final /* synthetic */ boolean f8096g;

        /* renamed from: h */
        final /* synthetic */ String f8097h;

        C4761a(C4760h hVar, boolean z, String str) {
            this.f8095f = hVar;
            this.f8096g = z;
            this.f8097h = str;
        }

        public void run() {
            if (!C9028k.m29695a(this.f8095f.f8072d)) {
                if (this.f8096g && C4760h.this.f8060D) {
                    C4760h.this.m7834g("_session_end");
                }
                C4760h hVar = this.f8095f;
                String str = this.f8097h;
                hVar.f8074f = str;
                C4760h.this.f8071c.mo33328c(TimeLineFollowFragment.BundleKeys.USER_ID, str);
                if (this.f8096g) {
                    long a = C4760h.this.mo16558a();
                    C4760h.this.m7842j(a);
                    C4760h.this.mo16586c(a);
                    if (C4760h.this.f8060D) {
                        C4760h.this.m7834g("_session_start");
                    }
                }
            }
        }
    }

    /* renamed from: io.rakam.api.h$b */
    /* compiled from: RakamClient */
    class C4762b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4760h f8099f;

        /* renamed from: g */
        final /* synthetic */ String f8100g;

        C4762b(C4760h hVar, String str) {
            this.f8099f = hVar;
            this.f8100g = str;
        }

        public void run() {
            if (!C9028k.m29695a(this.f8099f.f8072d)) {
                C4760h hVar = this.f8099f;
                String str = this.f8100g;
                hVar.f8075g = str;
                C4760h.this.m7832f(str);
            }
        }
    }

    /* renamed from: io.rakam.api.h$c */
    /* compiled from: RakamClient */
    class C4763c implements Runnable {
        C4763c() {
        }

        public void run() {
            C4760h.this.f8064H.set(false);
            C4760h.this.mo16585c();
        }
    }

    /* renamed from: io.rakam.api.h$d */
    /* compiled from: RakamClient */
    class C4764d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f8103f;

        /* renamed from: g */
        final /* synthetic */ long f8104g;

        /* renamed from: h */
        final /* synthetic */ long f8105h;

        C4764d(String str, long j, long j2) {
            this.f8103f = str;
            this.f8104g = j;
            this.f8105h = j2;
        }

        public void run() {
            C4760h hVar = C4760h.this;
            hVar.mo16575a(hVar.f8070b, this.f8103f, this.f8104g, this.f8105h);
        }
    }

    /* renamed from: io.rakam.api.h$e */
    /* compiled from: RakamClient */
    class C4765e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f8107f;

        /* renamed from: g */
        final /* synthetic */ long f8108g;

        /* renamed from: io.rakam.api.h$e$a */
        /* compiled from: RakamClient */
        class C4766a implements Runnable {
            C4766a() {
            }

            public void run() {
                C4760h hVar = C4760h.this;
                hVar.mo16583b(hVar.f8057A);
            }
        }

        C4765e(long j, long j2) {
            this.f8107f = j;
            this.f8108g = j2;
        }

        public void run() {
            long j = this.f8107f;
            if (j >= 0) {
                C4760h.this.f8071c.mo33332d(j);
            }
            long j2 = this.f8108g;
            if (j2 >= 0) {
                C4760h.this.f8071c.mo33334f(j2);
            }
            C4760h.this.f8065I.set(false);
            if (C4760h.this.f8071c.mo33327c() > ((long) C4760h.this.f8089u)) {
                C4760h.this.f8067K.mo33388a(new C4766a());
                return;
            }
            boolean unused = C4760h.this.f8057A = false;
            C4760h hVar = C4760h.this;
            int unused2 = hVar.f8058B = hVar.f8090v;
        }
    }

    /* renamed from: io.rakam.api.h$f */
    /* compiled from: RakamClient */
    class C4767f implements Runnable {
        C4767f() {
        }

        public void run() {
            C4760h.this.f8065I.set(false);
            C4760h.this.mo16583b(true);
        }
    }

    /* renamed from: io.rakam.api.h$g */
    /* compiled from: RakamClient */
    class C4768g implements Thread.UncaughtExceptionHandler {
        C4768g(C4760h hVar) {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C4760h.f8056N.mo33370a("RakamClient", "Unknown exception thrown from log thread.", th);
        }
    }

    /* renamed from: io.rakam.api.h$h */
    /* compiled from: RakamClient */
    class C4769h implements Thread.UncaughtExceptionHandler {
        C4769h(C4760h hVar) {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C4760h.f8056N.mo33370a("RakamClient", "Unknown exception thrown from HTTP thread.", th);
        }
    }

    /* renamed from: io.rakam.api.h$i */
    /* compiled from: RakamClient */
    class C4770i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f8112f;

        /* renamed from: g */
        final /* synthetic */ boolean f8113g;

        /* renamed from: h */
        final /* synthetic */ String f8114h;

        /* renamed from: i */
        final /* synthetic */ String f8115i;

        /* renamed from: j */
        final /* synthetic */ C4760h f8116j;

        /* renamed from: io.rakam.api.h$i$a */
        /* compiled from: RakamClient */
        class C4771a implements C9018c {
            C4771a() {
            }

            /* renamed from: a */
            public void mo16605a(SQLiteDatabase sQLiteDatabase) {
                C4770i iVar = C4770i.this;
                C4760h.this.f8071c.mo33312a(sQLiteDatabase, AccountAnalytics.STORE, "device_id", iVar.f8116j.f8075g);
                C4770i iVar2 = C4770i.this;
                C4760h.this.f8071c.mo33312a(sQLiteDatabase, AccountAnalytics.STORE, TimeLineFollowFragment.BundleKeys.USER_ID, iVar2.f8116j.f8074f);
                C4770i iVar3 = C4770i.this;
                C4760h.this.f8071c.mo33312a(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(iVar3.f8116j.f8079k ? 1 : 0));
                C4770i iVar4 = C4770i.this;
                C4760h.this.f8071c.mo33312a(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(iVar4.f8116j.f8083o));
                C4770i iVar5 = C4770i.this;
                C4760h.this.f8071c.mo33312a(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(iVar5.f8116j.f8086r));
            }
        }

        C4770i(Context context, boolean z, String str, String str2, C4760h hVar) {
            this.f8112f = context;
            this.f8113g = z;
            this.f8114h = str;
            this.f8115i = str2;
            this.f8116j = hVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|37) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0105 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.lang.String r0 = "super_properties"
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this
                boolean r2 = r1.f8078j
                if (r2 != 0) goto L_0x0132
                r2 = 0
                r3 = 0
                r4 = 1
                java.lang.String r1 = r1.f8073e     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r5 = "$default_instance"
                boolean r1 = r1.equals(r5)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                if (r1 == 0) goto L_0x001f
                android.content.Context r1 = r11.f8112f     // Catch:{ CursorWindowAllocationException -> 0x010d }
                p036io.rakam.api.C4760h.m7817a((android.content.Context) r1)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                android.content.Context r1 = r11.f8112f     // Catch:{ CursorWindowAllocationException -> 0x010d }
                p036io.rakam.api.C4760h.m7823b((android.content.Context) r1)     // Catch:{ CursorWindowAllocationException -> 0x010d }
            L_0x001f:
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                okhttp3.OkHttpClient r5 = new okhttp3.OkHttpClient     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r5.<init>()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8070b = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.d r5 = new io.rakam.api.d     // Catch:{ CursorWindowAllocationException -> 0x010d }
                android.content.Context r6 = r11.f8112f     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r5.<init>(r6)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                p036io.rakam.api.C9019d unused = r1.f8088t = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r5 = r5.m7839i()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8075g = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                boolean r1 = r11.f8113g     // Catch:{ CursorWindowAllocationException -> 0x010d }
                if (r1 == 0) goto L_0x0053
                io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                okhttp3.OkHttpClient r5 = r5.f8070b     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = r11.f8114h     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r7 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r7 = r7.f8075g     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.mo33356a(r5, r6, r7)     // Catch:{ CursorWindowAllocationException -> 0x010d }
            L_0x0053:
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.d r1 = r1.f8088t     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.mo33352p()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r1 = r11.f8115i     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r5 = "user_id"
                if (r1 == 0) goto L_0x0072
                io.rakam.api.h r1 = r11.f8116j     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = r11.f8115i     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8074f = r6     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r1 = r1.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = r11.f8115i     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.mo33328c((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                goto L_0x007e
            L_0x0072:
                io.rakam.api.h r1 = r11.f8116j     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r6 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r6 = r6.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r5 = r6.mo33331d((java.lang.String) r5)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8074f = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
            L_0x007e:
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r1 = r1.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r5 = "opt_out"
                java.lang.Long r1 = r1.mo33329c((java.lang.String) r5)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                if (r1 == 0) goto L_0x0098
                long r6 = r1.longValue()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r8 = 1
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 != 0) goto L_0x0098
                r1 = 1
                goto L_0x0099
            L_0x0098:
                r1 = 0
            L_0x0099:
                boolean unused = r5.f8079k = r1     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = "previous_session_id"
                r7 = -1
                long r5 = r5.m7807a((java.lang.String) r6, (long) r7)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8087s = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                long r5 = r1.f8087s     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r9 = 0
                int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r1 < 0) goto L_0x00bc
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                long r5 = r5.f8087s     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8083o = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
            L_0x00bc:
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = "last_event_id"
                long r5 = r5.m7807a((java.lang.String) r6, (long) r7)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8084p = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = "last_identify_id"
                long r5 = r5.m7807a((java.lang.String) r6, (long) r7)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8085q = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r6 = "last_event_time"
                long r5 = r5.m7807a((java.lang.String) r6, (long) r7)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8086r = r5     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r1 = r1.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h$i$a r5 = new io.rakam.api.h$i$a     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r5.<init>()     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.mo33320a((p036io.rakam.api.C9018c) r5)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.f8078j = r4     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r1 = r1.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                java.lang.String r1 = r1.mo33331d((java.lang.String) r0)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                if (r1 == 0) goto L_0x0132
                io.rakam.api.h r5 = p036io.rakam.api.C4760h.this     // Catch:{ JSONException -> 0x0105 }
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0105 }
                r6.<init>(r1)     // Catch:{ JSONException -> 0x0105 }
                org.json.JSONObject unused = r5.f8062F = r6     // Catch:{ JSONException -> 0x0105 }
                goto L_0x0132
            L_0x0105:
                io.rakam.api.h r1 = p036io.rakam.api.C4760h.this     // Catch:{ CursorWindowAllocationException -> 0x010d }
                io.rakam.api.b r1 = r1.f8071c     // Catch:{ CursorWindowAllocationException -> 0x010d }
                r1.mo33328c((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ CursorWindowAllocationException -> 0x010d }
                goto L_0x0132
            L_0x010d:
                r0 = move-exception
                io.rakam.api.i r1 = p036io.rakam.api.C4760h.f8056N
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = r0.getMessage()
                r4[r3] = r5
                java.lang.String r3 = "Failed to initialize Rakam SDK due to: %s"
                java.lang.String r3 = java.lang.String.format(r3, r4)
                java.lang.String r4 = "RakamClient"
                r1.mo33373b(r4, r3)
                io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
                java.lang.String r3 = "Failed to initialize Rakam SDK"
                r1.mo33355a(r3, r0)
                io.rakam.api.h r0 = r11.f8116j
                r0.f8072d = r2
            L_0x0132:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C4760h.C4770i.run():void");
        }
    }

    /* renamed from: io.rakam.api.h$j */
    /* compiled from: RakamClient */
    class C4772j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f8119f;

        C4772j(long j) {
            this.f8119f = j;
        }

        public void run() {
            if (!C9028k.m29695a(C4760h.this.f8072d)) {
                C4760h.this.mo16586c(this.f8119f);
                boolean unused = C4760h.this.f8061E = false;
                if (C4760h.this.f8063G) {
                    C4760h.this.mo16585c();
                }
                C4760h hVar = C4760h.this;
                hVar.f8071c.mo33328c("device_id", hVar.f8075g);
                C4760h hVar2 = C4760h.this;
                hVar2.f8071c.mo33328c(TimeLineFollowFragment.BundleKeys.USER_ID, hVar2.f8074f);
                C4760h hVar3 = C4760h.this;
                hVar3.f8071c.mo33314a("opt_out", Long.valueOf(hVar3.f8079k ? 1 : 0));
                C4760h hVar4 = C4760h.this;
                hVar4.f8071c.mo33314a("previous_session_id", Long.valueOf(hVar4.f8083o));
                C4760h hVar5 = C4760h.this;
                hVar5.f8071c.mo33314a("last_event_time", Long.valueOf(hVar5.f8086r));
            }
        }
    }

    /* renamed from: io.rakam.api.h$k */
    /* compiled from: RakamClient */
    class C4773k implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f8121f;

        C4773k(long j) {
            this.f8121f = j;
        }

        public void run() {
            if (!C9028k.m29695a(C4760h.this.f8072d)) {
                C4760h.this.mo16594h(this.f8121f);
                boolean unused = C4760h.this.f8061E = true;
            }
        }
    }

    public C4760h() {
        this((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m7842j(long j) {
        this.f8083o = j;
        mo16593g(j);
    }

    /* renamed from: k */
    private void m7843k(long j) {
        if (this.f8060D) {
            m7834g("_session_end");
        }
        m7842j(j);
        mo16586c(j);
        if (this.f8060D) {
            m7834g("_session_start");
        }
    }

    /* renamed from: l */
    private void m7844l(long j) {
        if (!this.f8064H.getAndSet(true)) {
            this.f8067K.mo33389a(new C4763c(), j);
        }
    }

    public C4760h(String str) {
        this.f8076h = false;
        this.f8077i = false;
        this.f8078j = false;
        this.f8079k = false;
        this.f8080l = false;
        this.f8081m = new C9027j();
        this.f8083o = -1;
        this.f8084p = -1;
        this.f8085q = -1;
        this.f8086r = -1;
        this.f8087s = -1;
        this.f8089u = 30;
        this.f8090v = 100;
        this.f8091w = 1000;
        this.f8092x = 30000;
        this.f8093y = LocalNotificationSyncManager.FIVE_MINUTES;
        this.f8094z = BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS;
        this.f8057A = false;
        this.f8058B = 100;
        this.f8059C = false;
        this.f8060D = false;
        this.f8061E = false;
        this.f8063G = true;
        this.f8064H = new AtomicBoolean(false);
        this.f8065I = new AtomicBoolean(false);
        this.f8067K = new C9029l("logThread");
        this.f8068L = new C9029l("httpThread");
        this.f8073e = C9028k.m29696b(str);
        this.f8067K.start();
        this.f8068L.start();
        this.f8067K.setUncaughtExceptionHandler(new C4768g(this));
        this.f8068L.setUncaughtExceptionHandler(new C4769h(this));
    }

    /* renamed from: i */
    private boolean m7840i(long j) {
        return j - this.f8086r < (this.f8059C ? this.f8093y : this.f8094z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16588d() {
        this.f8059C = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16592f(long j) {
        this.f8085q = j;
        this.f8071c.mo33314a("last_identify_id", Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16593g(long j) {
        this.f8087s = j;
        this.f8071c.mo33314a("previous_session_id", Long.valueOf(j));
    }

    /* renamed from: h */
    public boolean mo16594h(long j) {
        if (m7837h()) {
            if (m7840i(j)) {
                mo16586c(j);
                return false;
            }
            m7843k(j);
            return true;
        } else if (m7840i(j)) {
            long j2 = this.f8087s;
            if (j2 == -1) {
                m7843k(j);
                return true;
            }
            m7842j(j2);
            mo16586c(j);
            return false;
        } else {
            m7843k(j);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16586c(long j) {
        if (m7837h()) {
            mo16590e(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16589d(long j) {
        this.f8084p = j;
        this.f8071c.mo33314a("last_event_id", Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo16591e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mo16576a("logEvent()");
        }
        f8056N.mo33373b("RakamClient", "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    /* renamed from: f */
    private JSONObject m7831f() throws JSONException {
        return new JSONObject().put("api_key", this.f8072d).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", mo16558a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m7834g(String str) {
        if (mo16576a(String.format("sendSessionEvent('%s')", new Object[]{str})) && m7837h()) {
            mo16559a(str, (JSONObject) null, this.f8086r, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m7839i() {
        Set<String> g = m7833g();
        String d = this.f8071c.mo33331d("device_id");
        String a = C9028k.m29692a(this.f8069a, this.f8073e, "device_id");
        if (!C9028k.m29695a(d) && !g.contains(d)) {
            if (!d.equals(a)) {
                m7832f(d);
            }
            return d;
        } else if (C9028k.m29695a(a) || g.contains(a)) {
            if (!this.f8076h && this.f8077i && !this.f8088t.mo33350n()) {
                String a2 = this.f8088t.mo33337a();
                if (!C9028k.m29695a(a2) && !g.contains(a2)) {
                    m7832f(a2);
                    return a2;
                }
            }
            String str = C9019d.m29614q() + "R";
            m7832f(str);
            return str;
        } else {
            m7832f(a);
            return a;
        }
    }

    /* renamed from: b */
    public JSONObject mo16579b() {
        return C9028k.m29693a(this.f8062F);
    }

    /* renamed from: b */
    public C4760h mo16578b(int i) {
        f8056N.mo33372a(i);
        return this;
    }

    /* renamed from: c */
    public C4760h mo16584c(String str) {
        Set<String> g = m7833g();
        if (mo16576a("setDeviceId()") && !C9028k.m29695a(str) && !g.contains(str)) {
            m7816a((Runnable) new C4762b(this, str));
        }
        return this;
    }

    /* renamed from: d */
    public C4760h mo16587d(String str) {
        mo16566a(str, false);
        return this;
    }

    /* renamed from: b */
    public void mo16582b(String str) {
        mo16572a(str, (JSONObject) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16590e(long j) {
        this.f8086r = j;
        this.f8071c.mo33314a("last_event_time", Long.valueOf(j));
    }

    /* renamed from: g */
    private Set<String> m7833g() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo16577b(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (C9028k.m29695a(jSONObject2)) {
            f8056N.mo33373b("RakamClient", String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        if (str.equals("$identify")) {
            long b = this.f8071c.mo33324b(jSONObject2);
            this.f8085q = b;
            mo16592f(b);
        } else {
            long a = this.f8071c.mo33313a(jSONObject2);
            this.f8084p = a;
            mo16589d(a);
        }
        int min = Math.min(Math.max(1, this.f8091w / 10), 20);
        if (this.f8071c.mo33309a() > ((long) this.f8091w)) {
            C9017b bVar = this.f8071c;
            bVar.mo33332d(bVar.mo33310a((long) min));
        }
        if (this.f8071c.mo33321b() > ((long) this.f8091w)) {
            C9017b bVar2 = this.f8071c;
            bVar2.mo33334f(bVar2.mo33322b((long) min));
        }
        long c = this.f8071c.mo33327c();
        int i = this.f8089u;
        if (c % ((long) i) != 0 || c < ((long) i)) {
            m7844l(this.f8092x);
        } else {
            mo16585c();
        }
        return str.equals("$identify") ? this.f8085q : this.f8084p;
    }

    /* renamed from: a */
    public C4760h mo16563a(Context context, URL url, String str) {
        mo16564a(context, url, str, (String) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16585c() {
        mo16583b(false);
        C9022e.m29662c().mo33353a();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m7832f(String str) {
        this.f8071c.mo33328c("device_id", str);
        C9028k.m29694a(this.f8069a, this.f8073e, "device_id", str);
    }

    /* renamed from: a */
    public synchronized C4760h mo16564a(Context context, URL url, String str, String str2) {
        mo16565a(context, url, str, str2, (String) null, true);
        return this;
    }

    /* renamed from: a */
    public synchronized C4760h mo16565a(Context context, URL url, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f8056N.mo33373b("RakamClient", "Argument context cannot be null in initialize()");
            return this;
        }
        mo16574a(url);
        if (TextUtils.isEmpty(str)) {
            f8056N.mo33373b("RakamClient", "Argument apiKey cannot be null or blank in initialize()");
            return this;
        }
        Context applicationContext = context.getApplicationContext();
        this.f8069a = applicationContext;
        this.f8072d = str;
        this.f8071c = C9017b.m29577a(applicationContext, this.f8073e);
        if (C9028k.m29695a(str3)) {
            str3 = "Android";
        }
        this.f8082n = str3;
        m7816a((Runnable) new C4770i(context, z, str, str2, this));
        return this;
    }

    /* renamed from: h */
    private boolean m7837h() {
        return this.f8083o >= 0;
    }

    /* renamed from: h */
    static String m7836h(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    /* renamed from: a */
    public C4760h mo16567a(JSONObject jSONObject) {
        this.f8062F = jSONObject;
        this.f8071c.mo33328c("super_properties", jSONObject.toString());
        return this;
    }

    /* renamed from: a */
    public C4760h mo16562a(Application application) {
        if (!this.f8059C && mo16576a("enableForegroundTracking()") && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new C9025g(this));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16581b(long j) {
        m7816a((Runnable) new C4772j(j));
    }

    /* renamed from: a */
    public C4760h mo16561a(int i) {
        this.f8092x = (long) i;
        return this;
    }

    /* renamed from: b */
    public JSONObject mo16580b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            f8056N.mo33375d("RakamClient", "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj.getClass().equals(String.class)) {
                    jSONObject.put(next, m7836h((String) obj));
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(next, mo16580b((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    jSONObject.put(next, mo16570a((JSONArray) obj));
                }
            } catch (JSONException e) {
                f8056N.mo33373b("RakamClient", e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C4760h mo16568a(boolean z) {
        this.f8060D = z;
        return this;
    }

    /* renamed from: a */
    public void mo16572a(String str, JSONObject jSONObject) {
        mo16573a(str, jSONObject, false);
    }

    /* renamed from: a */
    public void mo16573a(String str, JSONObject jSONObject, boolean z) {
        if (mo16591e(str)) {
            mo16559a(str, jSONObject, mo16558a(), z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo16559a(String str, JSONObject jSONObject, long j, boolean z) {
        long j2;
        Location i;
        f8056N.mo33369a("RakamClient", "Logged event to Rakam: " + str);
        if (this.f8079k) {
            return -1;
        }
        if (!(this.f8060D && (str.equals("_session_start") || str.equals("_session_end"))) && !z) {
            if (!this.f8061E) {
                mo16594h(j);
            } else {
                mo16586c(j);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("_id", UUID.randomUUID().toString());
            jSONObject2.put("_local_id", this.f8084p);
            jSONObject2.put("_time", j);
            jSONObject2.put("_user", mo16569a((Object) this.f8074f));
            jSONObject2.put("_device_id", mo16569a((Object) this.f8075g));
            if (z) {
                j2 = -1;
            } else {
                j2 = this.f8083o;
            }
            jSONObject2.put("_session_id", j2);
            if (this.f8081m.mo33387l()) {
                jSONObject2.put("_version_name", mo16569a((Object) this.f8088t.mo33348l()));
            }
            if (this.f8081m.mo33384i()) {
                jSONObject2.put("_os_name", mo16569a((Object) this.f8088t.mo33346j()));
            }
            if (this.f8081m.mo33385j()) {
                jSONObject2.put("_os_version", mo16569a((Object) this.f8088t.mo33347k()));
            }
            if (this.f8081m.mo33379d()) {
                jSONObject2.put("_device_brand", mo16569a((Object) this.f8088t.mo33338b()));
            }
            if (this.f8081m.mo33380e()) {
                jSONObject2.put("_device_manufacturer", mo16569a((Object) this.f8088t.mo33343g()));
            }
            if (this.f8081m.mo33381f()) {
                jSONObject2.put("_device_model", mo16569a((Object) this.f8088t.mo33344h()));
            }
            if (this.f8081m.mo33377b()) {
                jSONObject2.put("_carrier", mo16569a((Object) this.f8088t.mo33339c()));
            }
            if (this.f8081m.mo33378c()) {
                jSONObject2.put("_country_code", mo16569a((Object) this.f8088t.mo33340d()));
            }
            if (this.f8081m.mo33382g()) {
                jSONObject2.put("_language", mo16569a((Object) this.f8088t.mo33342f()));
            }
            if (this.f8081m.mo33386k()) {
                jSONObject2.put("_platform", this.f8082n);
            }
            jSONObject2.put("_library_name", "rakam-android");
            jSONObject2.put("_library_version", "2.7.14");
            jSONObject2.put("_ip", true);
            if (this.f8081m.mo33383h() && (i = this.f8088t.mo33345i()) != null) {
                jSONObject2.put("_latitude", i.getLatitude());
                jSONObject2.put("_longitude", i.getLongitude());
            }
            if (this.f8081m.mo33376a() && this.f8088t.mo33337a() != null) {
                jSONObject2.put("_android_adid", this.f8088t.mo33337a());
            }
            jSONObject2.put("_limit_ad_tracking", this.f8088t.mo33350n());
            jSONObject2.put("_gps_enabled", this.f8088t.mo33349m());
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            if (this.f8062F != null) {
                Iterator<String> keys2 = this.f8062F.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (jSONObject == null || !jSONObject.has(next2)) {
                        jSONObject2.put(next2, this.f8062F.get(next2));
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("properties", mo16580b(jSONObject2));
            jSONObject3.put("collection", mo16569a((Object) str));
            return mo16577b(str, jSONObject3);
        } catch (JSONException e) {
            f8056N.mo33373b("RakamClient", String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str, e.toString()}));
            C9022e.m29662c().mo33355a(String.format("Failed to JSON serialize event type %s", new Object[]{str}), e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r12.f8065I.set(false);
        f8056N.mo33373b("RakamClient", java.lang.String.format("Caught Cursor window exception during event upload, deferring upload: %s", new java.lang.Object[]{r2.getMessage()}));
        p036io.rakam.api.C9022e.m29662c().mo33355a("Failed to update server", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cb, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r12.f8065I.set(false);
        f8056N.mo33373b("RakamClient", r2.toString());
        p036io.rakam.api.C9022e.m29662c().mo33355a("Failed to update server", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa A[ExcHandler: CursorWindowAllocationException (r2v7 'e' io.rakam.api.CursorWindowAllocationException A[CUSTOM_DECLARE]), Splitter:B:14:0x0036] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16583b(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Failed to update server"
            java.lang.String r1 = "RakamClient"
            boolean r2 = r12.f8079k
            if (r2 != 0) goto L_0x00e1
            boolean r2 = r12.f8080l
            if (r2 == 0) goto L_0x000e
            goto L_0x00e1
        L_0x000e:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f8065I
            r3 = 1
            boolean r2 = r2.getAndSet(r3)
            if (r2 != 0) goto L_0x00e1
            io.rakam.api.b r2 = r12.f8071c
            long r4 = r2.mo33327c()
            if (r13 == 0) goto L_0x0022
            int r13 = r12.f8058B
            goto L_0x0024
        L_0x0022:
            int r13 = r12.f8090v
        L_0x0024:
            long r6 = (long) r13
            long r4 = java.lang.Math.min(r6, r4)
            r6 = 0
            r13 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f8065I
            r0.set(r13)
            return
        L_0x0036:
            io.rakam.api.b r2 = r12.f8071c     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            long r6 = r12.f8084p     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.util.List r2 = r2.mo33318a((long) r6, (long) r4)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            io.rakam.api.b r6 = r12.f8071c     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            long r7 = r12.f8085q     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.util.List r6 = r6.mo33326b((long) r7, (long) r4)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            android.util.Pair r2 = r12.mo16560a((java.util.List<org.json.JSONObject>) r2, (java.util.List<org.json.JSONObject>) r6, (long) r4)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Object r4 = r2.second     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            int r4 = r4.length()     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            if (r4 != 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f8065I     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            r2.set(r13)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            return
        L_0x005a:
            java.lang.Object r4 = r2.first     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Object r4 = r4.first     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            long r8 = r4.longValue()     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Object r4 = r2.first     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Object r4 = r4.second     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            long r10 = r4.longValue()     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            r4.<init>()     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            java.lang.String r5 = "api"
            org.json.JSONObject r6 = r12.m7831f()     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            java.lang.String r5 = "events"
            java.lang.Object r2 = r2.second     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            org.json.JSONObject r2 = r4.put(r5, r2)     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            java.lang.String r7 = r2.toString()     // Catch:{ JSONException -> 0x009a, CursorWindowAllocationException -> 0x00aa }
            io.rakam.api.l r2 = r12.f8068L     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            io.rakam.api.h$d r4 = new io.rakam.api.h$d     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            r5 = r4
            r6 = r12
            r5.<init>(r7, r8, r10)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            r2.mo33388a(r4)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            goto L_0x00e1
        L_0x009a:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r4 = r12.f8065I     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            r4.set(r13)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            io.rakam.api.i r4 = f8056N     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            r4.mo33373b(r1, r2)     // Catch:{ JSONException -> 0x00cb, CursorWindowAllocationException -> 0x00aa }
            return
        L_0x00aa:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r4 = r12.f8065I
            r4.set(r13)
            io.rakam.api.i r4 = f8056N
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r2.getMessage()
            r3[r13] = r5
            java.lang.String r13 = "Caught Cursor window exception during event upload, deferring upload: %s"
            java.lang.String r13 = java.lang.String.format(r13, r3)
            r4.mo33373b(r1, r13)
            io.rakam.api.e r13 = p036io.rakam.api.C9022e.m29662c()
            r13.mo33355a(r0, r2)
            goto L_0x00e1
        L_0x00cb:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f8065I
            r3.set(r13)
            io.rakam.api.i r13 = f8056N
            java.lang.String r3 = r2.toString()
            r13.mo33373b(r1, r3)
            io.rakam.api.e r13 = p036io.rakam.api.C9022e.m29662c()
            r13.mo33355a(r0, r2)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C4760h.mo16583b(boolean):void");
    }

    /* renamed from: b */
    static boolean m7823b(Context context) {
        return m7818a(context, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m7807a(String str, long j) {
        Long c = this.f8071c.mo33329c(str);
        return c == null ? j : c.longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16571a(long j) {
        m7816a((Runnable) new C4773k(j));
    }

    /* renamed from: a */
    public JSONArray mo16570a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i, m7836h((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i, mo16580b((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i, mo16570a((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public C4760h mo16566a(String str, boolean z) {
        if (!mo16576a("setUserId()")) {
            return this;
        }
        m7816a((Runnable) new C4761a(this, z, str));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Pair<Long, Long>, JSONArray> mo16560a(List<JSONObject> list, List<JSONObject> list2, long j) throws JSONException {
        long j2;
        long j3;
        List<JSONObject> list3 = list;
        List<JSONObject> list4 = list2;
        JSONArray jSONArray = new JSONArray();
        long j4 = -1;
        long j5 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                f8056N.mo33375d("RakamClient", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j - ((long) jSONArray.length()))}));
                break;
            }
            if (isEmpty2) {
                JSONObject remove = list.remove(0);
                j2 = remove.getLong("event_id");
                jSONArray.put(remove);
            } else {
                if (isEmpty) {
                    JSONObject remove2 = list4.remove(0);
                    j3 = remove2.getLong("event_id");
                    jSONArray.put(remove2);
                } else if (!list.get(0).has("event_id") || list.get(0).getLong("event_id") < list4.get(0).getLong("event_id")) {
                    JSONObject remove3 = list.remove(0);
                    j2 = remove3.getLong("event_id");
                    jSONArray.put(remove3);
                } else {
                    JSONObject remove4 = list4.remove(0);
                    j3 = remove4.getLong("event_id");
                    jSONArray.put(remove4);
                }
                j5 = j3;
            }
            j4 = j2;
        }
        return new Pair<>(new Pair(Long.valueOf(j4), Long.valueOf(j5)), jSONArray);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16575a(okhttp3.OkHttpClient r15, java.lang.String r16, long r17, long r19) {
        /*
            r14 = this;
            r7 = r14
            r3 = r17
            r5 = r19
            java.lang.String r8 = "Exception:"
            java.lang.String r9 = "Failed to post upload request"
            java.lang.String r10 = "RakamClient"
            r11 = 0
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder     // Catch:{ IllegalArgumentException -> 0x018b }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x018b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x018b }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x018b }
            java.lang.String r2 = r7.f8066J     // Catch:{ IllegalArgumentException -> 0x018b }
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x018b }
            java.lang.String r2 = "/event/batch"
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x018b }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x018b }
            okhttp3.Request$Builder r0 = r0.url((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x018b }
            okhttp3.MediaType r1 = f8055M     // Catch:{ IllegalArgumentException -> 0x018b }
            r2 = r16
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create((okhttp3.MediaType) r1, (java.lang.String) r2)     // Catch:{ IllegalArgumentException -> 0x018b }
            okhttp3.Request$Builder r0 = r0.post(r1)     // Catch:{ IllegalArgumentException -> 0x018b }
            okhttp3.Request r0 = r0.build()     // Catch:{ IllegalArgumentException -> 0x018b }
            r12 = 1
            r1 = r15
            okhttp3.Call r0 = r15.newCall(r0)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            okhttp3.Response r0 = r0.execute()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            okhttp3.ResponseBody r1 = r0.body()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = r1.string()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r2 = "1"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            if (r2 == 0) goto L_0x0073
            io.rakam.api.l r0 = r7.f8067K     // Catch:{ ConnectException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x006a, AssertionError -> 0x0067, Exception -> 0x0064 }
            io.rakam.api.h$e r13 = new io.rakam.api.h$e     // Catch:{ ConnectException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x006a, AssertionError -> 0x0067, Exception -> 0x0064 }
            r1 = r13
            r2 = r14
            r3 = r17
            r5 = r19
            r1.<init>(r3, r5)     // Catch:{ ConnectException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x006a, AssertionError -> 0x0067, Exception -> 0x0064 }
            r0.mo33388a(r13)     // Catch:{ ConnectException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x006a, AssertionError -> 0x0067, Exception -> 0x0064 }
            goto L_0x0183
        L_0x0064:
            r0 = move-exception
            goto L_0x0141
        L_0x0067:
            r0 = move-exception
            goto L_0x0150
        L_0x006a:
            r0 = move-exception
            goto L_0x015f
        L_0x006d:
            r0 = move-exception
            goto L_0x0172
        L_0x0070:
            r0 = move-exception
            goto L_0x017c
        L_0x0073:
            int r2 = r0.code()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r13 = 403(0x193, float:5.65E-43)
            if (r2 != r13) goto L_0x0084
            io.rakam.api.i r0 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = "Invalid API key, make sure your API key is correct in initialize()"
            r0.mo33373b(r10, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            goto L_0x013d
        L_0x0084:
            java.lang.String r2 = "bad_checksum"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            if (r2 == 0) goto L_0x0095
            io.rakam.api.i r0 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
            r0.mo33375d(r10, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            goto L_0x013d
        L_0x0095:
            java.lang.String r2 = "request_db_write_failed"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            if (r2 == 0) goto L_0x00a6
            io.rakam.api.i r0 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = "Couldn't write to request database on server, will attempt to reupload later"
            r0.mo33375d(r10, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            goto L_0x013d
        L_0x00a6:
            int r2 = r0.code()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r13 = 413(0x19d, float:5.79E-43)
            if (r2 == r13) goto L_0x00e3
            int r2 = r0.code()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r13 = 400(0x190, float:5.6E-43)
            if (r2 != r13) goto L_0x00b7
            goto L_0x00e3
        L_0x00b7:
            int r0 = r0.code()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 != r2) goto L_0x00c7
            io.rakam.api.i r0 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = "A server error occurred, will attempt to reupload later"
            r0.mo33375d(r10, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            goto L_0x013d
        L_0x00c7:
            io.rakam.api.i r0 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r2.<init>()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r3 = "Upload failed, "
            r2.append(r3)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r2.append(r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = ", will attempt to reupload later"
            r2.append(r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r1 = r2.toString()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r0.mo33375d(r10, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            goto L_0x013d
        L_0x00e3:
            boolean r1 = r7.f8057A     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            if (r1 == 0) goto L_0x00ff
            int r1 = r7.f8058B     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            if (r1 != r12) goto L_0x00ff
            r1 = 0
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 < 0) goto L_0x00f6
            io.rakam.api.b r13 = r7.f8071c     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r13.mo33330c((long) r3)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
        L_0x00f6:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x00ff
            io.rakam.api.b r1 = r7.f8071c     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r1.mo33333e((long) r5)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
        L_0x00ff:
            r7.f8057A = r12     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            io.rakam.api.b r1 = r7.f8071c     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            long r1 = r1.mo33309a()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            int r2 = (int) r1     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            int r1 = r7.f8058B     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            int r1 = java.lang.Math.min(r2, r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            int r1 = (int) r1     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r7.f8058B = r1     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            io.rakam.api.i r1 = f8056N     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r2 = "Request too large or invalid: %s, will decrease size and attempt to reupload"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            int r0 = r0.code()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r3[r11] = r0     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r1.mo33375d(r10, r0)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            io.rakam.api.l r0 = r7.f8067K     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            io.rakam.api.h$f r1 = new io.rakam.api.h$f     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r1.<init>()     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
            r0.mo33388a(r1)     // Catch:{ ConnectException -> 0x017a, UnknownHostException -> 0x0170, IOException -> 0x015d, AssertionError -> 0x014e, Exception -> 0x013f }
        L_0x013d:
            r12 = 0
            goto L_0x0183
        L_0x013f:
            r0 = move-exception
            r12 = 0
        L_0x0141:
            io.rakam.api.i r1 = f8056N
            r1.mo33370a(r10, r8, r0)
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            r1.mo33355a(r9, r0)
            goto L_0x0183
        L_0x014e:
            r0 = move-exception
            r12 = 0
        L_0x0150:
            io.rakam.api.i r1 = f8056N
            r1.mo33370a(r10, r8, r0)
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            r1.mo33355a(r9, r0)
            goto L_0x0183
        L_0x015d:
            r0 = move-exception
            r12 = 0
        L_0x015f:
            io.rakam.api.i r1 = f8056N
            java.lang.String r2 = r0.toString()
            r1.mo33373b(r10, r2)
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            r1.mo33355a(r9, r0)
            goto L_0x0183
        L_0x0170:
            r0 = move-exception
            r12 = 0
        L_0x0172:
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            r1.mo33355a(r9, r0)
            goto L_0x0183
        L_0x017a:
            r0 = move-exception
            r12 = 0
        L_0x017c:
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            r1.mo33355a(r9, r0)
        L_0x0183:
            if (r12 != 0) goto L_0x018a
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f8065I
            r0.set(r11)
        L_0x018a:
            return
        L_0x018b:
            r0 = move-exception
            io.rakam.api.i r1 = f8056N
            java.lang.String r2 = r0.toString()
            r1.mo33373b(r10, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f8065I
            r1.set(r11)
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()
            java.lang.String r2 = "Failed to build upload request"
            r1.mo33355a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C4760h.mo16575a(okhttp3.OkHttpClient, java.lang.String, long, long):void");
    }

    /* renamed from: a */
    private void m7816a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C9029l lVar = this.f8067K;
        if (currentThread != lVar) {
            lVar.mo33388a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo16574a(URL url) {
        if (url == null) {
            f8056N.mo33373b("RakamClient", "apiUrl can't be null");
            return;
        }
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String str = protocol + "://" + host;
        if (url.getPath() == null || url.getPath().equals("/") || url.getPath().isEmpty()) {
            if (port > -1) {
                str = str + ":" + port;
            }
            this.f8066J = str;
            return;
        }
        throw new IllegalStateException(String.format("Please set root address of the API address. A valid example is %s, %s is not valid.", new Object[]{str, url.toString()}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo16569a(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized boolean mo16576a(String str) {
        if (this.f8069a == null) {
            C9026i iVar = f8056N;
            iVar.mo33373b("RakamClient", "context cannot be null, set context with initialize() before calling " + str);
            return false;
        } else if (!TextUtils.isEmpty(this.f8072d)) {
            return true;
        } else {
            C9026i iVar2 = f8056N;
            iVar2.mo33373b("RakamClient", "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m7817a(Context context) {
        return m7819a(context, (String) null, (String) null);
    }

    /* renamed from: a */
    static boolean m7819a(Context context, String str, String str2) {
        if (str == null) {
            try {
                str = C9016a.class.getPackage().getName();
            } catch (Exception unused) {
                str = "io.rakam.api";
            }
        }
        if (str2 == null) {
            str2 = "io.rakam.api";
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            String str3 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str4 = str2 + "." + context.getPackageName();
            SharedPreferences.Editor edit = context.getSharedPreferences(str4, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                edit.putLong("io.rakam.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                edit.putString("io.rakam.api.deviceId", sharedPreferences.getString(str + ".deviceId", (String) null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                edit.putString("io.rakam.api.userId", sharedPreferences.getString(str + ".userId", (String) null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                edit.putBoolean("io.rakam.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            f8056N.mo33374c("RakamClient", "Upgraded shared preferences from " + str3 + " to " + str4);
            return true;
        } catch (Exception e) {
            f8056N.mo33370a("RakamClient", "Error upgrading shared preferences", e);
            C9022e.m29662c().mo33355a("Failed to upgrade shared prefs", e);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m7818a(Context context, String str) {
        if (str == null) {
            str = "io.rakam.api";
        }
        C9017b a = C9017b.m29576a(context);
        String d = a.mo33331d("device_id");
        Long c = a.mo33329c("previous_session_id");
        Long c2 = a.mo33329c("last_event_time");
        if (!C9028k.m29695a(d) && c != null && c2 != null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str + "." + context.getPackageName(), 0);
        m7812a(sharedPreferences, "io.rakam.api.deviceId", (String) null, a, "device_id");
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C9017b bVar = a;
        m7811a(sharedPreferences2, "io.rakam.api.lastEventTime", -1, bVar, "last_event_time");
        m7811a(sharedPreferences2, "io.rakam.api.lastEventId", -1, bVar, "last_event_id");
        m7811a(sharedPreferences2, "io.rakam.api.lastIdentifyId", -1, bVar, "last_identify_id");
        m7811a(sharedPreferences2, "io.rakam.api.previousSessionId", -1, bVar, "previous_session_id");
        m7812a(sharedPreferences, "io.rakam.api.userId", (String) null, a, TimeLineFollowFragment.BundleKeys.USER_ID);
        m7813a(sharedPreferences, "io.rakam.api.optOut", false, a, "opt_out");
        return true;
    }

    /* renamed from: a */
    private static void m7811a(SharedPreferences sharedPreferences, String str, long j, C9017b bVar, String str2) {
        if (bVar.mo33329c(str2) == null) {
            bVar.mo33314a(str2, Long.valueOf(sharedPreferences.getLong(str, j)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: a */
    private static void m7812a(SharedPreferences sharedPreferences, String str, String str2, C9017b bVar, String str3) {
        if (C9028k.m29695a(bVar.mo33331d(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (!C9028k.m29695a(string)) {
                bVar.mo33328c(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    /* renamed from: a */
    private static void m7813a(SharedPreferences sharedPreferences, String str, boolean z, C9017b bVar, String str2) {
        if (bVar.mo33329c(str2) == null) {
            bVar.mo33314a(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1 : 0));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo16558a() {
        return System.currentTimeMillis();
    }
}
