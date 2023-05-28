package p120q.p326a;

import java.util.concurrent.TimeUnit;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p329d0.p342g.C11405h;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.v */
/* compiled from: Scheduler */
public abstract class C11491v {

    /* renamed from: a */
    static final long f30716a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: q.a.v$a */
    /* compiled from: Scheduler */
    static final class C11492a implements C10842c, Runnable {

        /* renamed from: f */
        final Runnable f30717f;

        /* renamed from: g */
        final C11494c f30718g;

        /* renamed from: h */
        Thread f30719h;

        C11492a(Runnable runnable, C11494c cVar) {
            this.f30717f = runnable;
            this.f30718g = cVar;
        }

        public void dispose() {
            if (this.f30719h == Thread.currentThread()) {
                C11494c cVar = this.f30718g;
                if (cVar instanceof C11405h) {
                    ((C11405h) cVar).mo37146a();
                    return;
                }
            }
            this.f30718g.dispose();
        }

        public boolean isDisposed() {
            return this.f30718g.isDisposed();
        }

        public void run() {
            this.f30719h = Thread.currentThread();
            try {
                this.f30717f.run();
            } finally {
                dispose();
                this.f30719h = null;
            }
        }
    }

    /* renamed from: q.a.v$b */
    /* compiled from: Scheduler */
    static final class C11493b implements C10842c, Runnable {

        /* renamed from: f */
        final Runnable f30720f;

        /* renamed from: g */
        final C11494c f30721g;

        /* renamed from: h */
        volatile boolean f30722h;

        C11493b(Runnable runnable, C11494c cVar) {
            this.f30720f = runnable;
            this.f30721g = cVar;
        }

        public void dispose() {
            this.f30722h = true;
            this.f30721g.dispose();
        }

        public boolean isDisposed() {
            return this.f30722h;
        }

        public void run() {
            if (!this.f30722h) {
                try {
                    this.f30720f.run();
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30721g.dispose();
                    throw C11435j.m37463a(th);
                }
            }
        }
    }

    /* renamed from: q.a.v$c */
    /* compiled from: Scheduler */
    public static abstract class C11494c implements C10842c {

        /* renamed from: q.a.v$c$a */
        /* compiled from: Scheduler */
        final class C11495a implements Runnable {

            /* renamed from: f */
            final Runnable f30723f;

            /* renamed from: g */
            final C10871h f30724g;

            /* renamed from: h */
            final long f30725h;

            /* renamed from: i */
            long f30726i;

            /* renamed from: j */
            long f30727j;

            /* renamed from: k */
            long f30728k;

            C11495a(long j, Runnable runnable, long j2, C10871h hVar, long j3) {
                this.f30723f = runnable;
                this.f30724g = hVar;
                this.f30725h = j3;
                this.f30727j = j2;
                this.f30728k = j;
            }

            public void run() {
                long j;
                this.f30723f.run();
                if (!this.f30724g.isDisposed()) {
                    long a = C11494c.this.mo37603a(TimeUnit.NANOSECONDS);
                    long j2 = C11491v.f30716a;
                    long j3 = this.f30727j;
                    if (a + j2 >= j3) {
                        long j4 = this.f30725h;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f30728k;
                            long j6 = this.f30726i + 1;
                            this.f30726i = j6;
                            j = j5 + (j6 * j4);
                            this.f30727j = a;
                            this.f30724g.mo36672a(C11494c.this.mo37117a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j7 = this.f30725h;
                    long j8 = a + j7;
                    long j9 = this.f30726i + 1;
                    this.f30726i = j9;
                    this.f30728k = j8 - (j7 * j9);
                    j = j8;
                    this.f30727j = a;
                    this.f30724g.mo36672a(C11494c.this.mo37117a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        /* renamed from: a */
        public C10842c mo37116a(Runnable runnable) {
            return mo37117a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public abstract C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public C10842c mo37604a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C10871h hVar = new C10871h();
            C10871h hVar2 = new C10871h(hVar);
            Runnable a = C11459a.m37512a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo37603a(TimeUnit.NANOSECONDS);
            C10871h hVar3 = hVar;
            C11495a aVar = r0;
            C11495a aVar2 = new C11495a(a2 + timeUnit2.toNanos(j3), a, a2, hVar2, nanos);
            C10842c a3 = mo37117a(aVar, j3, timeUnit2);
            if (a3 == C10868e.INSTANCE) {
                return a3;
            }
            hVar3.mo36672a(a3);
            return hVar2;
        }

        /* renamed from: a */
        public long mo37603a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public long mo37600a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public abstract C11494c mo37114a();

    /* renamed from: a */
    public C10842c mo37125a(Runnable runnable) {
        return mo37113a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C10842c mo37113a(Runnable runnable, long j, TimeUnit timeUnit) {
        C11494c a = mo37114a();
        C11492a aVar = new C11492a(C11459a.m37512a(runnable), a);
        a.mo37117a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public C10842c mo37112a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C11494c a = mo37114a();
        C11493b bVar = new C11493b(C11459a.m37512a(runnable), a);
        C10842c a2 = a.mo37604a(bVar, j, j2, timeUnit);
        return a2 == C10868e.INSTANCE ? a2 : bVar;
    }
}
