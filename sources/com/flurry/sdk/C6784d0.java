package com.flurry.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p112n.p113d.p114a.C10564c;

/* renamed from: com.flurry.sdk.d0 */
public final class C6784d0 extends C6798d7<C6759c0> {

    /* renamed from: o */
    public AtomicLong f12641o = new AtomicLong(0);

    /* renamed from: p */
    public AtomicLong f12642p = new AtomicLong(0);

    /* renamed from: q */
    public AtomicBoolean f12643q = new AtomicBoolean(true);

    /* renamed from: r */
    public long f12644r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f12645s;

    /* renamed from: t */
    public List<C10564c> f12646t = new ArrayList();

    /* renamed from: u */
    private C6852h7 f12647u;

    /* renamed from: v */
    private C6823f7<C6877i7> f12648v = new C6785a();

    /* renamed from: com.flurry.sdk.d0$a */
    class C6785a implements C6823f7<C6877i7> {
        C6785a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            int i = C6791g.f12659a[((C6877i7) obj).f12863b.ordinal()];
            if (i == 1) {
                C6784d0.this.mo23572a(C6814f0.FOREGROUND, false);
            } else if (i == 2) {
                C6784d0.this.mo23574b(C6814f0.FOREGROUND, false);
            }
        }
    }

    /* renamed from: com.flurry.sdk.d0$b */
    class C6786b extends C6816f2 {
        C6786b() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            long unused = C6784d0.this.f12645s = C6971p2.m14812b("initial_run_time", Long.MIN_VALUE);
        }
    }

    /* renamed from: com.flurry.sdk.d0$c */
    public class C6787c extends C6816f2 {
        public C6787c() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            long unused = C6784d0.this.f12645s = Long.MIN_VALUE;
        }
    }

    /* renamed from: com.flurry.sdk.d0$d */
    class C6788d extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ List f12652h;

        C6788d(C6784d0 d0Var, List list) {
            this.f12652h = list;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            for (C10564c cVar : this.f12652h) {
                if (cVar != null) {
                    cVar.mo36112a();
                }
            }
        }
    }

    /* renamed from: com.flurry.sdk.d0$e */
    class C6789e extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6814f0 f12653h;

        /* renamed from: i */
        final /* synthetic */ boolean f12654i;

        C6789e(C6814f0 f0Var, boolean z) {
            this.f12653h = f0Var;
            this.f12654i = z;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6792d1.m14476a(3, "ReportingProvider", "Start session: " + this.f12653h.name() + ", isManualSession: " + this.f12654i);
            C6784d0.m14462a(C6784d0.this, this.f12653h, C6805e0.SESSION_START, this.f12654i);
        }
    }

    /* renamed from: com.flurry.sdk.d0$f */
    class C6790f extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6814f0 f12656h;

        /* renamed from: i */
        final /* synthetic */ boolean f12657i;

        C6790f(C6814f0 f0Var, boolean z) {
            this.f12656h = f0Var;
            this.f12657i = z;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6792d1.m14476a(3, "ReportingProvider", "End session: " + this.f12656h.name() + ", isManualSession: " + this.f12657i);
            C6784d0.m14462a(C6784d0.this, this.f12656h, C6805e0.SESSION_END, this.f12657i);
        }
    }

    /* renamed from: com.flurry.sdk.d0$g */
    static /* synthetic */ class C6791g {

        /* renamed from: a */
        static final /* synthetic */ int[] f12659a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.flurry.sdk.g7[] r0 = com.flurry.sdk.C6838g7.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12659a = r0
                com.flurry.sdk.g7 r1 = com.flurry.sdk.C6838g7.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12659a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.g7 r1 = com.flurry.sdk.C6838g7.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6784d0.C6791g.<clinit>():void");
        }
    }

    public C6784d0(C6852h7 h7Var) {
        super("ReportingProvider");
        this.f12647u = h7Var;
        h7Var.mo23582a(this.f12648v);
        mo23563c(new C6786b());
    }

    /* renamed from: b */
    public final void mo23574b(C6814f0 f0Var, boolean z) {
        mo23563c(new C6790f(f0Var, z));
    }

    /* renamed from: a */
    public final void mo23573a(C10564c cVar) {
        if (cVar == null) {
            C6792d1.m14476a(2, "ReportingProvider", "Cannot register with null listener");
        } else {
            this.f12646t.add(cVar);
        }
    }

    /* renamed from: a */
    public final String mo23570a() {
        return String.valueOf(this.f12641o.get());
    }

    /* renamed from: a */
    public final void mo23571a(long j, long j2) {
        this.f12641o.set(j);
        this.f12642p.set(j2);
        if (!this.f12646t.isEmpty()) {
            mo23647g(new C6788d(this, new ArrayList(this.f12646t)));
        }
    }

    /* renamed from: a */
    public final void mo23572a(C6814f0 f0Var, boolean z) {
        mo23563c(new C6789e(f0Var, z));
    }

    /* renamed from: a */
    static /* synthetic */ void m14462a(C6784d0 d0Var, C6814f0 f0Var, C6805e0 e0Var, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (d0Var.f12645s == Long.MIN_VALUE) {
            d0Var.f12645s = currentTimeMillis;
            C6971p2.m14809a("initial_run_time", currentTimeMillis);
            C6792d1.m14476a(3, "ReportingProvider", "Refresh initial timestamp");
        }
        d0Var.mo23583a(new C6759c0(f0Var, currentTimeMillis, d0Var.f12645s, f0Var.equals(C6814f0.FOREGROUND) ? d0Var.f12644r : 60000, e0Var, z));
    }
}
