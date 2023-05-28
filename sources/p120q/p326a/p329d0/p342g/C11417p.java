package p120q.p326a.p329d0.p342g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p327b0.C10843d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.g.p */
/* compiled from: TrampolineScheduler */
public final class C11417p extends C11491v {

    /* renamed from: b */
    private static final C11417p f30586b = new C11417p();

    /* renamed from: q.a.d0.g.p$a */
    /* compiled from: TrampolineScheduler */
    static final class C11418a implements Runnable {

        /* renamed from: f */
        private final Runnable f30587f;

        /* renamed from: g */
        private final C11420c f30588g;

        /* renamed from: h */
        private final long f30589h;

        C11418a(Runnable runnable, C11420c cVar, long j) {
            this.f30587f = runnable;
            this.f30588g = cVar;
            this.f30589h = j;
        }

        public void run() {
            if (!this.f30588g.f30597i) {
                long a = this.f30588g.mo37603a(TimeUnit.MILLISECONDS);
                long j = this.f30589h;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C11459a.m37531b((Throwable) e);
                        return;
                    }
                }
                if (!this.f30588g.f30597i) {
                    this.f30587f.run();
                }
            }
        }
    }

    /* renamed from: q.a.d0.g.p$b */
    /* compiled from: TrampolineScheduler */
    static final class C11419b implements Comparable<C11419b> {

        /* renamed from: f */
        final Runnable f30590f;

        /* renamed from: g */
        final long f30591g;

        /* renamed from: h */
        final int f30592h;

        /* renamed from: i */
        volatile boolean f30593i;

        C11419b(Runnable runnable, Long l, int i) {
            this.f30590f = runnable;
            this.f30591g = l.longValue();
            this.f30592h = i;
        }

        /* renamed from: a */
        public int compareTo(C11419b bVar) {
            int a = C10910b.m36859a(this.f30591g, bVar.f30591g);
            return a == 0 ? C10910b.m36857a(this.f30592h, bVar.f30592h) : a;
        }
    }

    /* renamed from: q.a.d0.g.p$c */
    /* compiled from: TrampolineScheduler */
    static final class C11420c extends C11491v.C11494c implements C10842c {

        /* renamed from: f */
        final PriorityBlockingQueue<C11419b> f30594f = new PriorityBlockingQueue<>();

        /* renamed from: g */
        private final AtomicInteger f30595g = new AtomicInteger();

        /* renamed from: h */
        final AtomicInteger f30596h = new AtomicInteger();

        /* renamed from: i */
        volatile boolean f30597i;

        /* renamed from: q.a.d0.g.p$c$a */
        /* compiled from: TrampolineScheduler */
        final class C11421a implements Runnable {

            /* renamed from: f */
            final C11419b f30598f;

            C11421a(C11419b bVar) {
                this.f30598f = bVar;
            }

            public void run() {
                this.f30598f.f30593i = true;
                C11420c.this.f30594f.remove(this.f30598f);
            }
        }

        C11420c() {
        }

        /* renamed from: a */
        public C10842c mo37116a(Runnable runnable) {
            return mo37161a(runnable, mo37603a(TimeUnit.MILLISECONDS));
        }

        public void dispose() {
            this.f30597i = true;
        }

        public boolean isDisposed() {
            return this.f30597i;
        }

        /* renamed from: a */
        public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo37603a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo37161a(new C11418a(runnable, this, a), a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10842c mo37161a(Runnable runnable, long j) {
            if (this.f30597i) {
                return C10868e.INSTANCE;
            }
            C11419b bVar = new C11419b(runnable, Long.valueOf(j), this.f30596h.incrementAndGet());
            this.f30594f.add(bVar);
            if (this.f30595g.getAndIncrement() != 0) {
                return C10843d.m36749a((Runnable) new C11421a(bVar));
            }
            int i = 1;
            while (!this.f30597i) {
                C11419b poll = this.f30594f.poll();
                if (poll == null) {
                    i = this.f30595g.addAndGet(-i);
                    if (i == 0) {
                        return C10868e.INSTANCE;
                    }
                } else if (!poll.f30593i) {
                    poll.f30590f.run();
                }
            }
            this.f30594f.clear();
            return C10868e.INSTANCE;
        }
    }

    C11417p() {
    }

    /* renamed from: b */
    public static C11417p m37425b() {
        return f30586b;
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11420c();
    }

    /* renamed from: a */
    public C10842c mo37125a(Runnable runnable) {
        C11459a.m37512a(runnable).run();
        return C10868e.INSTANCE;
    }

    /* renamed from: a */
    public C10842c mo37113a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C11459a.m37512a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C11459a.m37531b((Throwable) e);
        }
        return C10868e.INSTANCE;
    }
}
