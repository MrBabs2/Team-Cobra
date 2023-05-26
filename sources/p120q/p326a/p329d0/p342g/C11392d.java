package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10866c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p349h0.C11461a;

/* renamed from: q.a.d0.g.d */
/* compiled from: ExecutorScheduler */
public final class C11392d extends C11491v {

    /* renamed from: d */
    static final C11491v f30519d = C11461a.m37549c();

    /* renamed from: b */
    final boolean f30520b;

    /* renamed from: c */
    final Executor f30521c;

    /* renamed from: q.a.d0.g.d$a */
    /* compiled from: ExecutorScheduler */
    final class C11393a implements Runnable {

        /* renamed from: f */
        private final C11394b f30522f;

        C11393a(C11394b bVar) {
            this.f30522f = bVar;
        }

        public void run() {
            C11394b bVar = this.f30522f;
            bVar.f30525g.mo36672a(C11392d.this.mo37125a(bVar));
        }
    }

    /* renamed from: q.a.d0.g.d$b */
    /* compiled from: ExecutorScheduler */
    static final class C11394b extends AtomicReference<Runnable> implements Runnable, C10842c {

        /* renamed from: f */
        final C10871h f30524f = new C10871h();

        /* renamed from: g */
        final C10871h f30525g = new C10871h();

        C11394b(Runnable runnable) {
            super(runnable);
        }

        public void dispose() {
            if (getAndSet((Object) null) != null) {
                this.f30524f.dispose();
                this.f30525g.dispose();
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet((Object) null);
                    this.f30524f.lazySet(C10867d.DISPOSED);
                    this.f30525g.lazySet(C10867d.DISPOSED);
                }
            }
        }
    }

    public C11392d(Executor executor, boolean z) {
        this.f30521c = executor;
        this.f30520b = z;
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11395c(this.f30521c, this.f30520b);
    }

    /* renamed from: a */
    public C10842c mo37125a(Runnable runnable) {
        Runnable a = C11459a.m37512a(runnable);
        try {
            if (this.f30521c instanceof ExecutorService) {
                C11410l lVar = new C11410l(a);
                lVar.mo37111a(((ExecutorService) this.f30521c).submit(lVar));
                return lVar;
            } else if (this.f30520b) {
                C11395c.C11397b bVar = new C11395c.C11397b(a, (C10866c) null);
                this.f30521c.execute(bVar);
                return bVar;
            } else {
                C11395c.C11396a aVar = new C11395c.C11396a(a);
                this.f30521c.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e) {
            C11459a.m37531b((Throwable) e);
            return C10868e.INSTANCE;
        }
    }

    /* renamed from: q.a.d0.g.d$c */
    /* compiled from: ExecutorScheduler */
    public static final class C11395c extends C11491v.C11494c implements Runnable {

        /* renamed from: f */
        final boolean f30526f;

        /* renamed from: g */
        final Executor f30527g;

        /* renamed from: h */
        final C11382a<Runnable> f30528h;

        /* renamed from: i */
        volatile boolean f30529i;

        /* renamed from: j */
        final AtomicInteger f30530j = new AtomicInteger();

        /* renamed from: k */
        final C10841b f30531k = new C10841b();

        /* renamed from: q.a.d0.g.d$c$a */
        /* compiled from: ExecutorScheduler */
        static final class C11396a extends AtomicBoolean implements Runnable, C10842c {

            /* renamed from: f */
            final Runnable f30532f;

            C11396a(Runnable runnable) {
                this.f30532f = runnable;
            }

            public void dispose() {
                lazySet(true);
            }

            public boolean isDisposed() {
                return get();
            }

            public void run() {
                if (!get()) {
                    try {
                        this.f30532f.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: q.a.d0.g.d$c$b */
        /* compiled from: ExecutorScheduler */
        static final class C11397b extends AtomicInteger implements Runnable, C10842c {

            /* renamed from: f */
            final Runnable f30533f;

            /* renamed from: g */
            final C10866c f30534g;

            /* renamed from: h */
            volatile Thread f30535h;

            C11397b(Runnable runnable, C10866c cVar) {
                this.f30533f = runnable;
                this.f30534g = cVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo37130a() {
                C10866c cVar = this.f30534g;
                if (cVar != null) {
                    cVar.mo36647c(this);
                }
            }

            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                mo37130a();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.f30535h;
                            if (thread != null) {
                                thread.interrupt();
                                this.f30535h = null;
                            }
                            set(4);
                            mo37130a();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            public boolean isDisposed() {
                return get() >= 2;
            }

            public void run() {
                if (get() == 0) {
                    this.f30535h = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f30533f.run();
                            this.f30535h = null;
                            if (compareAndSet(1, 2)) {
                                mo37130a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.f30535h = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                mo37130a();
                            }
                            throw th;
                        }
                    } else {
                        this.f30535h = null;
                    }
                }
            }
        }

        /* renamed from: q.a.d0.g.d$c$c */
        /* compiled from: ExecutorScheduler */
        final class C11398c implements Runnable {

            /* renamed from: f */
            private final C10871h f30536f;

            /* renamed from: g */
            private final Runnable f30537g;

            C11398c(C10871h hVar, Runnable runnable) {
                this.f30536f = hVar;
                this.f30537g = runnable;
            }

            public void run() {
                this.f30536f.mo36672a(C11395c.this.mo37116a(this.f30537g));
            }
        }

        public C11395c(Executor executor, boolean z) {
            this.f30527g = executor;
            this.f30528h = new C11382a<>();
            this.f30526f = z;
        }

        /* renamed from: a */
        public C10842c mo37116a(Runnable runnable) {
            C10842c cVar;
            if (this.f30529i) {
                return C10868e.INSTANCE;
            }
            Runnable a = C11459a.m37512a(runnable);
            if (this.f30526f) {
                cVar = new C11397b(a, this.f30531k);
                this.f30531k.mo36646b(cVar);
            } else {
                cVar = new C11396a(a);
            }
            this.f30528h.offer(cVar);
            if (this.f30530j.getAndIncrement() == 0) {
                try {
                    this.f30527g.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f30529i = true;
                    this.f30528h.clear();
                    C11459a.m37531b((Throwable) e);
                    return C10868e.INSTANCE;
                }
            }
            return cVar;
        }

        public void dispose() {
            if (!this.f30529i) {
                this.f30529i = true;
                this.f30531k.dispose();
                if (this.f30530j.getAndIncrement() == 0) {
                    this.f30528h.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f30529i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f30530j.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f30529i == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                q.a.d0.f.a<java.lang.Runnable> r0 = r3.f30528h
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f30529i
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f30529i
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f30530j
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f30529i
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p342g.C11392d.C11395c.run():void");
        }

        /* renamed from: a */
        public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo37116a(runnable);
            }
            if (this.f30529i) {
                return C10868e.INSTANCE;
            }
            C10871h hVar = new C10871h();
            C10871h hVar2 = new C10871h(hVar);
            C11411m mVar = new C11411m(new C11398c(hVar2, C11459a.m37512a(runnable)), this.f30531k);
            this.f30531k.mo36646b(mVar);
            Executor executor = this.f30527g;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.mo37153a(((ScheduledExecutorService) executor).schedule(mVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f30529i = true;
                    C11459a.m37531b((Throwable) e);
                    return C10868e.INSTANCE;
                }
            } else {
                mVar.mo37153a(new C11391c(C11392d.f30519d.mo37113a(mVar, j, timeUnit)));
            }
            hVar.mo36672a(mVar);
            return hVar2;
        }
    }

    /* renamed from: a */
    public C10842c mo37113a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C11459a.m37512a(runnable);
        if (this.f30521c instanceof ScheduledExecutorService) {
            try {
                C11410l lVar = new C11410l(a);
                lVar.mo37111a(((ScheduledExecutorService) this.f30521c).schedule(lVar, j, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e) {
                C11459a.m37531b((Throwable) e);
                return C10868e.INSTANCE;
            }
        } else {
            C11394b bVar = new C11394b(a);
            bVar.f30524f.mo36672a(f30519d.mo37113a(new C11393a(bVar), j, timeUnit));
            return bVar;
        }
    }

    /* renamed from: a */
    public C10842c mo37112a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f30521c instanceof ScheduledExecutorService)) {
            return super.mo37112a(runnable, j, j2, timeUnit);
        }
        try {
            C11409k kVar = new C11409k(C11459a.m37512a(runnable));
            kVar.mo37111a(((ScheduledExecutorService) this.f30521c).scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e) {
            C11459a.m37531b((Throwable) e);
            return C10868e.INSTANCE;
        }
    }
}
