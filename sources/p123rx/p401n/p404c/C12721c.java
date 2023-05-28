package p123rx.p401n.p404c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12887c;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.c.c */
/* compiled from: ExecutorScheduler */
public final class C12721c extends C5373h {

    /* renamed from: a */
    final Executor f32857a;

    public C12721c(Executor executor) {
        this.f32857a = executor;
    }

    public C5373h.C5374a createWorker() {
        return new C12722a(this.f32857a);
    }

    /* renamed from: rx.n.c.c$a */
    /* compiled from: ExecutorScheduler */
    static final class C12722a extends C5373h.C5374a implements Runnable {

        /* renamed from: f */
        final Executor f32858f;

        /* renamed from: g */
        final C5383b f32859g = new C5383b();

        /* renamed from: h */
        final ConcurrentLinkedQueue<C12735j> f32860h = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        final AtomicInteger f32861i = new AtomicInteger();

        /* renamed from: j */
        final ScheduledExecutorService f32862j = C12725d.m41209a();

        /* renamed from: rx.n.c.c$a$a */
        /* compiled from: ExecutorScheduler */
        class C12723a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12887c f32863f;

            C12723a(C12887c cVar) {
                this.f32863f = cVar;
            }

            public void call() {
                C12722a.this.f32859g.mo18722b(this.f32863f);
            }
        }

        /* renamed from: rx.n.c.c$a$b */
        /* compiled from: ExecutorScheduler */
        class C12724b implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12887c f32865f;

            /* renamed from: g */
            final /* synthetic */ C5377a f32866g;

            /* renamed from: h */
            final /* synthetic */ C5375k f32867h;

            C12724b(C12887c cVar, C5377a aVar, C5375k kVar) {
                this.f32865f = cVar;
                this.f32866g = aVar;
                this.f32867h = kVar;
            }

            public void call() {
                if (!this.f32865f.isUnsubscribed()) {
                    C5375k a = C12722a.this.mo18710a(this.f32866g);
                    this.f32865f.mo41107a(a);
                    if (a.getClass() == C12735j.class) {
                        ((C12735j) a).mo40869a(this.f32867h);
                    }
                }
            }
        }

        public C12722a(Executor executor) {
            this.f32858f = executor;
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            if (isUnsubscribed()) {
                return C12889e.m41502b();
            }
            C12735j jVar = new C12735j(C12844c.m41412a(aVar), this.f32859g);
            this.f32859g.mo18721a((C5375k) jVar);
            this.f32860h.offer(jVar);
            if (this.f32861i.getAndIncrement() == 0) {
                try {
                    this.f32858f.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f32859g.mo18722b(jVar);
                    this.f32861i.decrementAndGet();
                    C12844c.m41417b((Throwable) e);
                    throw e;
                }
            }
            return jVar;
        }

        public boolean isUnsubscribed() {
            return this.f32859g.isUnsubscribed();
        }

        public void run() {
            while (!this.f32859g.isUnsubscribed()) {
                C12735j poll = this.f32860h.poll();
                if (poll != null) {
                    if (!poll.isUnsubscribed()) {
                        if (!this.f32859g.isUnsubscribed()) {
                            poll.run();
                        } else {
                            this.f32860h.clear();
                            return;
                        }
                    }
                    if (this.f32861i.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f32860h.clear();
        }

        public void unsubscribe() {
            this.f32859g.unsubscribe();
            this.f32860h.clear();
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo18710a(aVar);
            }
            if (isUnsubscribed()) {
                return C12889e.m41502b();
            }
            C5377a a = C12844c.m41412a(aVar);
            C12887c cVar = new C12887c();
            C12887c cVar2 = new C12887c();
            cVar2.mo41107a(cVar);
            this.f32859g.mo18721a((C5375k) cVar2);
            C5375k a2 = C12889e.m41501a(new C12723a(cVar2));
            C12735j jVar = new C12735j(new C12724b(cVar2, a, a2));
            cVar.mo41107a(jVar);
            try {
                jVar.mo40868a((Future<?>) this.f32862j.schedule(jVar, j, timeUnit));
                return a2;
            } catch (RejectedExecutionException e) {
                C12844c.m41417b((Throwable) e);
                throw e;
            }
        }
    }
}
