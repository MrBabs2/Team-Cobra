package p120q.p326a.p329d0.p342g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p330a.C10869f;

/* renamed from: q.a.d0.g.b */
/* compiled from: ComputationScheduler */
public final class C11387b extends C11491v {

    /* renamed from: d */
    static final C11389b f30504d;

    /* renamed from: e */
    static final C11407j f30505e;

    /* renamed from: f */
    static final int f30506f = m37377a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C11390c f30507g;

    /* renamed from: b */
    final ThreadFactory f30508b;

    /* renamed from: c */
    final AtomicReference<C11389b> f30509c;

    /* renamed from: q.a.d0.g.b$b */
    /* compiled from: ComputationScheduler */
    static final class C11389b {

        /* renamed from: a */
        final int f30515a;

        /* renamed from: b */
        final C11390c[] f30516b;

        /* renamed from: c */
        long f30517c;

        C11389b(int i, ThreadFactory threadFactory) {
            this.f30515a = i;
            this.f30516b = new C11390c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f30516b[i2] = new C11390c(threadFactory);
            }
        }

        /* renamed from: a */
        public C11390c mo37118a() {
            int i = this.f30515a;
            if (i == 0) {
                return C11387b.f30507g;
            }
            C11390c[] cVarArr = this.f30516b;
            long j = this.f30517c;
            this.f30517c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo37119b() {
            for (C11390c dispose : this.f30516b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: q.a.d0.g.b$c */
    /* compiled from: ComputationScheduler */
    static final class C11390c extends C11405h {
        C11390c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C11390c cVar = new C11390c(new C11407j("RxComputationShutdown"));
        f30507g = cVar;
        cVar.dispose();
        C11407j jVar = new C11407j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f30505e = jVar;
        C11389b bVar = new C11389b(0, jVar);
        f30504d = bVar;
        bVar.mo37119b();
    }

    public C11387b() {
        this(f30505e);
    }

    /* renamed from: a */
    static int m37377a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11388a(this.f30509c.get().mo37118a());
    }

    /* renamed from: b */
    public void mo37115b() {
        C11389b bVar = new C11389b(f30506f, this.f30508b);
        if (!this.f30509c.compareAndSet(f30504d, bVar)) {
            bVar.mo37119b();
        }
    }

    public C11387b(ThreadFactory threadFactory) {
        this.f30508b = threadFactory;
        this.f30509c = new AtomicReference<>(f30504d);
        mo37115b();
    }

    /* renamed from: a */
    public C10842c mo37113a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f30509c.get().mo37118a().mo37148b(runnable, j, timeUnit);
    }

    /* renamed from: q.a.d0.g.b$a */
    /* compiled from: ComputationScheduler */
    static final class C11388a extends C11491v.C11494c {

        /* renamed from: f */
        private final C10869f f30510f = new C10869f();

        /* renamed from: g */
        private final C10841b f30511g = new C10841b();

        /* renamed from: h */
        private final C10869f f30512h;

        /* renamed from: i */
        private final C11390c f30513i;

        /* renamed from: j */
        volatile boolean f30514j;

        C11388a(C11390c cVar) {
            this.f30513i = cVar;
            C10869f fVar = new C10869f();
            this.f30512h = fVar;
            fVar.mo36646b(this.f30510f);
            this.f30512h.mo36646b(this.f30511g);
        }

        /* renamed from: a */
        public C10842c mo37116a(Runnable runnable) {
            if (this.f30514j) {
                return C10868e.INSTANCE;
            }
            return this.f30513i.mo37145a(runnable, 0, TimeUnit.MILLISECONDS, this.f30510f);
        }

        public void dispose() {
            if (!this.f30514j) {
                this.f30514j = true;
                this.f30512h.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f30514j;
        }

        /* renamed from: a */
        public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f30514j) {
                return C10868e.INSTANCE;
            }
            return this.f30513i.mo37145a(runnable, j, timeUnit, this.f30511g);
        }
    }

    /* renamed from: a */
    public C10842c mo37112a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f30509c.get().mo37118a().mo37147b(runnable, j, j2, timeUnit);
    }
}
