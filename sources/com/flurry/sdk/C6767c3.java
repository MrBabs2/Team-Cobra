package com.flurry.sdk;

import com.flurry.sdk.C6868i2;
import com.flurry.sdk.C7079x2;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.c3 */
public abstract class C6767c3 extends C6916l2 implements C7079x2 {

    /* renamed from: n */
    private C7079x2 f12598n;

    /* renamed from: o */
    volatile int f12599o = C6772c.f12606f;

    /* renamed from: p */
    protected Queue<C7044u6> f12600p;

    /* renamed from: q */
    protected C7090y2 f12601q;

    /* renamed from: com.flurry.sdk.c3$a */
    static /* synthetic */ class C6768a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.flurry.sdk.C6767c3.C6772c.m14438a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12602a = r0
                r1 = 1
                int r2 = com.flurry.sdk.C6767c3.C6772c.f12606f     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f12602a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C6767c3.C6772c.f12610j     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f12602a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C6767c3.C6772c.f12607g     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12602a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.flurry.sdk.C6767c3.C6772c.f12608h     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = f12602a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.flurry.sdk.C6767c3.C6772c.f12609i     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r1 = 5
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6767c3.C6768a.<clinit>():void");
        }
    }

    /* renamed from: com.flurry.sdk.c3$b */
    class C6769b implements C7090y2 {

        /* renamed from: com.flurry.sdk.c3$b$a */
        class C6770a extends C6816f2 {

            /* renamed from: com.flurry.sdk.c3$b$a$a */
            class C6771a extends C6816f2 {
                C6771a() {
                }

                /* renamed from: a */
                public final void mo23531a() {
                    C7090y2 y2Var = C6767c3.this.f12601q;
                    if (y2Var != null) {
                        y2Var.mo23560a();
                    }
                }
            }

            C6770a() {
            }

            /* renamed from: a */
            public final void mo23531a() {
                C6767c3.this.mo23559e();
                C6767c3.this.f12599o = C6772c.f12609i;
                Future unused = C6767c3.this.mo23563c(new C6771a());
            }
        }

        private C6769b() {
        }

        /* renamed from: a */
        public final void mo23560a() {
            Future unused = C6767c3.this.mo23563c(new C6770a());
        }

        /* synthetic */ C6769b(C6767c3 c3Var, byte b) {
            this();
        }
    }

    /* renamed from: com.flurry.sdk.c3$c */
    public enum C6772c {
        ;
        

        /* renamed from: f */
        public static final int f12606f = 1;

        /* renamed from: g */
        public static final int f12607g = 2;

        /* renamed from: h */
        public static final int f12608h = 3;

        /* renamed from: i */
        public static final int f12609i = 4;

        /* renamed from: j */
        public static final int f12610j = 5;

        static {
            f12611k = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m14438a() {
            return (int[]) f12611k.clone();
        }
    }

    C6767c3(String str, C7079x2 x2Var) {
        super(str, C6868i2.m14604a(C6868i2.C6870b.CORE));
        this.f12598n = x2Var;
        this.f12600p = new ConcurrentLinkedQueue();
        this.f12599o = C6772c.f12607g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23533a(C7044u6 u6Var);

    /* renamed from: c */
    public final C7079x2.C7080a mo23556c(C7044u6 u6Var) {
        C7079x2.C7080a aVar = C7079x2.C7080a.ERROR;
        int i = C6768a.f12602a[this.f12599o - 1];
        if (i == 3 || i == 4) {
            C7079x2.C7080a aVar2 = C7079x2.C7080a.DEFERRED;
            this.f12600p.add(u6Var);
            C6792d1.m14476a(4, "StreamingCoreModule", "Adding frame to deferred queue:" + u6Var.mo23712d());
            return aVar2;
        } else if (i != 5) {
            return aVar;
        } else {
            C7079x2.C7080a aVar3 = C7079x2.C7080a.QUEUED;
            mo23533a(u6Var);
            return aVar3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo23557d() {
    }

    /* renamed from: d */
    public final void mo23558d(C7044u6 u6Var) {
        C7079x2 x2Var = this.f12598n;
        if (x2Var != null) {
            C7079x2.C7080a c = x2Var.mo23556c(u6Var);
            C6792d1.m14476a(4, "StreamingCoreModule", "Enqueue message status for module: " + this.f12598n + " is: " + c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo23559e() {
        while (this.f12600p.peek() != null) {
            C7044u6 poll = this.f12600p.poll();
            C6792d1.m14476a(4, "StreamingCoreModule", "Processing deferred message status for module: " + poll.mo23712d());
            mo23533a(poll);
        }
    }

    /* renamed from: a */
    public final void mo23555a(C7090y2 y2Var) {
        this.f12599o = C6772c.f12608h;
        this.f12601q = y2Var;
        mo23557d();
        C7079x2 x2Var = this.f12598n;
        if (x2Var != null) {
            x2Var.mo23555a(new C6769b(this, (byte) 0));
            return;
        }
        if (y2Var != null) {
            y2Var.mo23560a();
        }
        this.f12599o = C6772c.f12609i;
    }

    /* renamed from: b */
    public C7079x2.C7080a mo23534b(C7044u6 u6Var) {
        C7079x2.C7080a aVar = C7079x2.C7080a.ERROR;
        C7079x2 x2Var = this.f12598n;
        return x2Var != null ? x2Var.mo23534b(u6Var) : aVar;
    }
}
