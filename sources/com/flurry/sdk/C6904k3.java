package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6888j3;
import com.flurry.sdk.C7018s3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.k3 */
public final class C6904k3 implements C6888j3 {

    /* renamed from: a */
    Map<C7023s6, C7044u6> f12935a;

    /* renamed from: b */
    private AtomicBoolean f12936b;

    /* renamed from: c */
    private C6873i3 f12937c;

    /* renamed from: d */
    private boolean f12938d = false;

    /* renamed from: e */
    private Timer f12939e = null;

    /* renamed from: f */
    private TimerTask f12940f = null;

    /* renamed from: g */
    long f12941g = Long.MIN_VALUE;

    /* renamed from: h */
    long f12942h = Long.MIN_VALUE;

    /* renamed from: i */
    long f12943i = Long.MIN_VALUE;

    /* renamed from: j */
    int f12944j = C6814f0.BACKGROUND.f12719f;

    /* renamed from: k */
    private C6908d f12945k = C6908d.INACTIVE;

    /* renamed from: com.flurry.sdk.k3$a */
    class C6905a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f12946h;

        C6905a(boolean z) {
            this.f12946h = z;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            if (this.f12946h) {
                C6784d0 d0Var = C6812e7.m14513a().f12706k;
                C6904k3 k3Var = C6904k3.this;
                d0Var.mo23571a(k3Var.f12941g, k3Var.f12942h);
            }
            C6784d0 d0Var2 = C6812e7.m14513a().f12706k;
            d0Var2.f12643q.set(this.f12946h);
        }
    }

    /* renamed from: com.flurry.sdk.k3$b */
    static /* synthetic */ class C6906b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12948a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.flurry.sdk.k3$d[] r0 = com.flurry.sdk.C6904k3.C6908d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12948a = r0
                com.flurry.sdk.k3$d r1 = com.flurry.sdk.C6904k3.C6908d.FOREGROUND_RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12948a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.k3$d r1 = com.flurry.sdk.C6904k3.C6908d.FOREGROUND_ENDING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12948a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.k3$d r1 = com.flurry.sdk.C6904k3.C6908d.BACKGROUND_RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12948a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.k3$d r1 = com.flurry.sdk.C6904k3.C6908d.BACKGROUND_ENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12948a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.flurry.sdk.k3$d r1 = com.flurry.sdk.C6904k3.C6908d.INACTIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6904k3.C6906b.<clinit>():void");
        }
    }

    /* renamed from: com.flurry.sdk.k3$c */
    public class C6907c extends TimerTask {
        protected C6907c() {
        }

        public final void run() {
            C6904k3.this.mo23637a();
            C6904k3 k3Var = C6904k3.this;
            C6826g0.m14532b().mo23589a();
            if (k3Var.f12943i <= 0) {
                k3Var.f12943i = SystemClock.elapsedRealtime();
            }
            if (C6904k3.m14670a(k3Var.f12941g)) {
                k3Var.mo23640b((C7044u6) C6911k6.m14686a(k3Var.f12941g, k3Var.f12942h, k3Var.f12943i, k3Var.f12944j));
            } else {
                C6792d1.m14476a(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            C6888j3.C6889a aVar = C6888j3.C6889a.REASON_SESSION_FINALIZE;
            k3Var.mo23640b((C7044u6) C7007r5.m14877a(aVar.ordinal(), aVar.f12890f));
            k3Var.mo23638a(false);
            k3Var.mo23639b();
        }
    }

    /* renamed from: com.flurry.sdk.k3$d */
    enum C6908d {
        INACTIVE,
        FOREGROUND_RUNNING,
        FOREGROUND_ENDING,
        BACKGROUND_RUNNING,
        BACKGROUND_ENDING
    }

    public C6904k3(C6873i3 i3Var) {
        this.f12937c = i3Var;
        if (this.f12935a == null) {
            this.f12935a = new HashMap();
        }
        this.f12935a.clear();
        this.f12935a.put(C7023s6.SESSION_INFO, (Object) null);
        this.f12935a.put(C7023s6.APP_STATE, (Object) null);
        this.f12935a.put(C7023s6.APP_INFO, (Object) null);
        this.f12935a.put(C7023s6.REPORTED_ID, (Object) null);
        this.f12935a.put(C7023s6.DEVICE_PROPERTIES, (Object) null);
        this.f12935a.put(C7023s6.SESSION_ID, (Object) null);
        this.f12935a = this.f12935a;
        this.f12936b = new AtomicBoolean(false);
    }

    /* renamed from: a */
    static boolean m14670a(long j) {
        return j > 0;
    }

    /* renamed from: c */
    private boolean m14675c() {
        boolean z = true;
        for (Map.Entry<C7023s6, C7044u6> value : this.f12935a.entrySet()) {
            if (value.getValue() == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m14677d() {
        if (this.f12941g <= 0) {
            C6792d1.m14476a(6, "SessionRule", "Finalize session " + this.f12941g);
            return;
        }
        mo23637a();
        C6826g0.m14532b().mo23589a();
        this.f12943i = SystemClock.elapsedRealtime();
        if (m14670a(this.f12941g)) {
            mo23640b((C7044u6) C6911k6.m14686a(this.f12941g, this.f12942h, this.f12943i, this.f12944j));
        } else {
            C6792d1.m14476a(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        C6888j3.C6889a aVar = C6888j3.C6889a.REASON_SESSION_FINALIZE;
        mo23640b((C7044u6) C7007r5.m14877a(aVar.ordinal(), aVar.f12890f));
        mo23638a(false);
        mo23639b();
    }

    /* renamed from: a */
    public final void mo23628a(C7044u6 u6Var) {
        if (u6Var.mo23538a().equals(C7023s6.FLUSH_FRAME)) {
            C7022s5 s5Var = (C7022s5) u6Var.mo23714f();
            if (!C6888j3.C6889a.REASON_SESSION_FINALIZE.f12890f.equals(s5Var.f13169c)) {
                if (!C6888j3.C6889a.REASON_STICKY_SET_COMPLETE.f12890f.equals(s5Var.f13169c)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    m14667a(this.f12942h, elapsedRealtime, "Flush In Middle");
                    mo23640b((C7044u6) C6911k6.m14686a(this.f12941g, this.f12942h, elapsedRealtime, this.f12944j));
                }
                C7044u6 u6Var2 = this.f12935a.get(C7023s6.SESSION_ID);
                if (u6Var2 != null) {
                    m14674c(u6Var2);
                    return;
                }
                return;
            }
            return;
        }
        if (u6Var.mo23538a().equals(C7023s6.REPORTING)) {
            C6820f4 f4Var = (C6820f4) u6Var.mo23714f();
            int i = C6906b.f12948a[this.f12945k.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                C6792d1.m14476a(6, "SessionRule", "Unreachable Code");
                            } else if (m14672b(f4Var)) {
                                this.f12938d = f4Var.f12753g;
                                m14669a(C6908d.FOREGROUND_RUNNING);
                                m14668a(f4Var);
                            } else if (m14676c(f4Var)) {
                                m14669a(C6908d.BACKGROUND_RUNNING);
                                m14668a(f4Var);
                            }
                        } else if (m14672b(f4Var)) {
                            m14677d();
                            m14669a(C6908d.FOREGROUND_RUNNING);
                            m14668a(f4Var);
                        } else if (m14676c(f4Var)) {
                            mo23637a();
                            this.f12943i = Long.MIN_VALUE;
                            m14669a(C6908d.BACKGROUND_RUNNING);
                        }
                    } else if (m14672b(f4Var)) {
                        m14677d();
                        m14669a(C6908d.FOREGROUND_RUNNING);
                        m14668a(f4Var);
                    } else {
                        if (f4Var.f12748b.equals(C6814f0.BACKGROUND) && f4Var.f12752f.equals(C6805e0.SESSION_END)) {
                            m14671b(f4Var.f12751e);
                            m14669a(C6908d.BACKGROUND_ENDING);
                        }
                    }
                } else if (m14672b(f4Var)) {
                    mo23637a();
                    this.f12943i = Long.MIN_VALUE;
                    m14669a(C6908d.FOREGROUND_RUNNING);
                }
            } else if (f4Var.f12748b.equals(C6814f0.FOREGROUND)) {
                if (this.f12938d && !f4Var.f12753g) {
                    this.f12938d = false;
                }
                if ((f4Var.f12748b.equals(C6814f0.FOREGROUND) && f4Var.f12752f.equals(C6805e0.SESSION_END)) && (this.f12938d || !f4Var.f12753g)) {
                    m14671b(f4Var.f12751e);
                    m14669a(C6908d.FOREGROUND_ENDING);
                }
            }
        }
        if (u6Var.mo23538a().equals(C7023s6.ANALYTICS_ERROR) && ((C7028t3) u6Var.mo23714f()).f13222h == C7018s3.C7019a.UNRECOVERABLE_CRASH.f13162f) {
            mo23637a();
            this.f12943i = SystemClock.elapsedRealtime();
            if (m14670a(this.f12941g)) {
                m14667a(this.f12942h, this.f12943i, "Process Crash");
                mo23640b((C7044u6) C6911k6.m14686a(this.f12941g, this.f12942h, this.f12943i, this.f12944j));
            } else {
                C6792d1.m14476a(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
        }
        if (u6Var.mo23538a().equals(C7023s6.CCPA_DELETION)) {
            C6888j3.C6889a aVar = C6888j3.C6889a.REASON_DATA_DELETION;
            m14674c((C7044u6) C7007r5.m14877a(aVar.ordinal(), aVar.f12890f));
        }
        C7023s6 a = u6Var.mo23538a();
        if (this.f12935a.containsKey(a)) {
            C6792d1.m14476a(3, "SessionRule", "Adding Sticky Frame:" + u6Var.mo23712d());
            this.f12935a.put(a, u6Var);
        } else {
            C7044u6 u6Var3 = u6Var;
        }
        if (!this.f12936b.get() && m14675c()) {
            this.f12936b.set(true);
            C6888j3.C6889a aVar2 = C6888j3.C6889a.REASON_STICKY_SET_COMPLETE;
            m14674c((C7044u6) C7007r5.m14877a(aVar2.ordinal(), aVar2.f12890f));
            int b = C6971p2.m14811b("last_streaming_http_error_code", Integer.MIN_VALUE);
            String b2 = C6971p2.m14813b("last_streaming_http_error_message", "");
            String b3 = C6971p2.m14813b("last_streaming_http_report_identifier", "");
            if (b != Integer.MIN_VALUE) {
                C6766c2.m14419a(b, b2, b3, false);
                C6971p2.m14807a("last_streaming_http_error_code");
                C6971p2.m14807a("last_streaming_http_error_message");
                C6971p2.m14807a("last_streaming_http_report_identifier");
            }
            int b4 = C6971p2.m14811b("last_legacy_http_error_code", Integer.MIN_VALUE);
            String b5 = C6971p2.m14813b("last_legacy_http_error_message", "");
            String b6 = C6971p2.m14813b("last_legacy_http_report_identifier", "");
            if (b4 != Integer.MIN_VALUE) {
                C6766c2.m14419a(b4, b5, b6, false);
                C6971p2.m14807a("last_legacy_http_error_code");
                C6971p2.m14807a("last_legacy_http_error_message");
                C6971p2.m14807a("last_legacy_http_report_identifier");
            }
            C6971p2.m14809a("last_streaming_session_id", this.f12941g);
            HashMap hashMap = new HashMap();
            hashMap.put("streaming.session.id", String.valueOf(this.f12941g));
            C6826g0.m14532b();
            C6826g0.m14533b("Session Ids", hashMap);
            C6826g0.m14532b().mo23589a();
        } else if (this.f12936b.get() && u6Var.mo23538a().equals(C7023s6.f13174E)) {
            C6826g0.m14532b();
            C6826g0.m14533b("Flush Token Refreshed", Collections.emptyMap());
            C6888j3.C6889a aVar3 = C6888j3.C6889a.REASON_PUSH_TOKEN_REFRESH;
            m14674c((C7044u6) C7007r5.m14877a(aVar3.ordinal(), aVar3.f12890f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23640b(C7044u6 u6Var) {
        if (this.f12937c != null) {
            C6792d1.m14476a(3, "SessionRule", "Forwarding Frame:" + u6Var.mo23712d());
            this.f12937c.mo23537b(u6Var);
        }
    }

    /* renamed from: c */
    private void m14674c(C7044u6 u6Var) {
        if (this.f12937c != null) {
            C6792d1.m14476a(3, "SessionRule", "Appending Frame:" + u6Var.mo23712d());
            this.f12937c.mo23535a(u6Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23639b() {
        C6792d1.m14476a(3, "SessionRule", "Reset session rule");
        this.f12935a.put(C7023s6.SESSION_ID, (Object) null);
        this.f12936b.set(false);
        this.f12941g = Long.MIN_VALUE;
        this.f12942h = Long.MIN_VALUE;
        this.f12943i = Long.MIN_VALUE;
        this.f12945k = C6908d.INACTIVE;
        this.f12938d = false;
    }

    /* renamed from: c */
    private static boolean m14676c(C6820f4 f4Var) {
        return f4Var.f12748b.equals(C6814f0.BACKGROUND) && f4Var.f12752f.equals(C6805e0.SESSION_START);
    }

    /* renamed from: c */
    private synchronized void m14673c(long j) {
        if (this.f12939e != null) {
            mo23637a();
        }
        this.f12939e = new Timer("FlurrySessionTimer");
        C6907c cVar = new C6907c();
        this.f12940f = cVar;
        this.f12939e.schedule(cVar, j);
    }

    /* renamed from: b */
    private static boolean m14672b(C6820f4 f4Var) {
        return f4Var.f12748b.equals(C6814f0.FOREGROUND) && f4Var.f12752f.equals(C6805e0.SESSION_START);
    }

    /* renamed from: b */
    private void m14671b(long j) {
        mo23637a();
        this.f12943i = SystemClock.elapsedRealtime();
        if (m14670a(this.f12941g)) {
            m14667a(this.f12942h, this.f12943i, "Start Session Finalize Timer");
            m14674c((C7044u6) C6911k6.m14686a(this.f12941g, this.f12942h, this.f12943i, this.f12944j));
        } else {
            C6792d1.m14476a(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        m14673c(j);
    }

    /* renamed from: a */
    private void m14669a(C6908d dVar) {
        if (this.f12945k.equals(dVar)) {
            C6792d1.m14476a(3, "SessionRule", "Invalid state transition.");
            return;
        }
        C6792d1.m14476a(3, "SessionRule", "Previous session state: " + this.f12945k.name());
        this.f12945k = dVar;
        C6792d1.m14476a(3, "SessionRule", "Current session state: " + this.f12945k.name());
    }

    /* renamed from: a */
    private void m14668a(C6820f4 f4Var) {
        if (!f4Var.f12752f.equals(C6805e0.SESSION_START)) {
            C6792d1.m14476a(3, "SessionRule", "Only generate session id during session start");
        } else if (this.f12941g == Long.MIN_VALUE && this.f12935a.get(C7023s6.SESSION_ID) == null) {
            C6792d1.m14476a(3, "SessionRule", "Generating Session Id:" + f4Var.f12749c);
            this.f12941g = f4Var.f12749c;
            this.f12942h = SystemClock.elapsedRealtime();
            this.f12944j = f4Var.f12748b.f12719f == 1 ? 2 : 0;
            if (m14670a(this.f12941g)) {
                m14667a(this.f12942h, this.f12943i, "Generate Session Id");
                m14674c((C7044u6) C6911k6.m14686a(this.f12941g, this.f12942h, this.f12943i, this.f12944j));
            } else {
                C6792d1.m14476a(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            mo23638a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo23637a() {
        if (this.f12939e != null) {
            this.f12939e.cancel();
            this.f12939e = null;
        }
        if (this.f12940f != null) {
            this.f12940f.cancel();
            this.f12940f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23638a(boolean z) {
        C6873i3 i3Var = this.f12937c;
        if (i3Var != null) {
            i3Var.mo23536a((Runnable) new C6905a(z));
        }
    }

    /* renamed from: a */
    private static void m14667a(long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.session.elapsed.start.time", String.valueOf(j));
        if (j2 != Long.MIN_VALUE) {
            hashMap.put("fl.session.elapsed.end.time", String.valueOf(j2));
            hashMap.put("fl.session.duration", String.valueOf(j2 - j));
        }
        hashMap.put("fl.session.message", str);
        C6826g0.m14532b();
        C6826g0.m14533b("Session Duration", hashMap);
    }
}
