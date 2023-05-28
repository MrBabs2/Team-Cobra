package p123rx.p401n.p404c;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5377a;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12791l;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.c.j */
/* compiled from: ScheduledAction */
public final class C12735j extends AtomicReference<Thread> implements Runnable, C5375k {

    /* renamed from: f */
    final C12791l f32899f;

    /* renamed from: g */
    final C5377a f32900g;

    /* renamed from: rx.n.c.j$a */
    /* compiled from: ScheduledAction */
    final class C12736a implements C5375k {

        /* renamed from: f */
        private final Future<?> f32901f;

        C12736a(Future<?> future) {
            this.f32901f = future;
        }

        public boolean isUnsubscribed() {
            return this.f32901f.isCancelled();
        }

        public void unsubscribe() {
            if (C12735j.this.get() != Thread.currentThread()) {
                this.f32901f.cancel(true);
            } else {
                this.f32901f.cancel(false);
            }
        }
    }

    /* renamed from: rx.n.c.j$b */
    /* compiled from: ScheduledAction */
    static final class C12737b extends AtomicBoolean implements C5375k {

        /* renamed from: f */
        final C12735j f32903f;

        /* renamed from: g */
        final C12791l f32904g;

        public C12737b(C12735j jVar, C12791l lVar) {
            this.f32903f = jVar;
            this.f32904g = lVar;
        }

        public boolean isUnsubscribed() {
            return this.f32903f.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f32904g.mo40915b(this.f32903f);
            }
        }
    }

    /* renamed from: rx.n.c.j$c */
    /* compiled from: ScheduledAction */
    static final class C12738c extends AtomicBoolean implements C5375k {

        /* renamed from: f */
        final C12735j f32905f;

        /* renamed from: g */
        final C5383b f32906g;

        public C12738c(C12735j jVar, C5383b bVar) {
            this.f32905f = jVar;
            this.f32906g = bVar;
        }

        public boolean isUnsubscribed() {
            return this.f32905f.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f32906g.mo18722b(this.f32905f);
            }
        }
    }

    public C12735j(C5377a aVar) {
        this.f32900g = aVar;
        this.f32899f = new C12791l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40867a(Throwable th) {
        C12844c.m41417b(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public boolean isUnsubscribed() {
        return this.f32899f.isUnsubscribed();
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.f32900g.call();
        } catch (OnErrorNotImplementedException e) {
            mo40867a((Throwable) new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            unsubscribe();
            throw th;
        }
        unsubscribe();
    }

    public void unsubscribe() {
        if (!this.f32899f.isUnsubscribed()) {
            this.f32899f.unsubscribe();
        }
    }

    public C12735j(C5377a aVar, C5383b bVar) {
        this.f32900g = aVar;
        this.f32899f = new C12791l((C5375k) new C12738c(this, bVar));
    }

    /* renamed from: a */
    public void mo40869a(C5375k kVar) {
        this.f32899f.mo40914a(kVar);
    }

    /* renamed from: a */
    public void mo40868a(Future<?> future) {
        this.f32899f.mo40914a((C5375k) new C12736a(future));
    }

    /* renamed from: a */
    public void mo40870a(C5383b bVar) {
        this.f32899f.mo40914a((C5375k) new C12738c(this, bVar));
    }

    public C12735j(C5377a aVar, C12791l lVar) {
        this.f32900g = aVar;
        this.f32899f = new C12791l((C5375k) new C12737b(this, lVar));
    }
}
