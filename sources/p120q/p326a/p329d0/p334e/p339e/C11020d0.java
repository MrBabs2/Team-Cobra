package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.d0 */
/* compiled from: ObservableDebounceTimed */
public final class C11020d0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29278g;

    /* renamed from: h */
    final TimeUnit f29279h;

    /* renamed from: i */
    final C11491v f29280i;

    /* renamed from: q.a.d0.e.e.d0$a */
    /* compiled from: ObservableDebounceTimed */
    static final class C11021a<T> extends AtomicReference<C10842c> implements Runnable, C10842c {

        /* renamed from: f */
        final T f29281f;

        /* renamed from: g */
        final long f29282g;

        /* renamed from: h */
        final C11022b<T> f29283h;

        /* renamed from: i */
        final AtomicBoolean f29284i = new AtomicBoolean();

        C11021a(T t, long j, C11022b<T> bVar) {
            this.f29281f = t;
            this.f29282g = j;
            this.f29283h = bVar;
        }

        /* renamed from: a */
        public void mo36821a(C10842c cVar) {
            C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return get() == C10867d.DISPOSED;
        }

        public void run() {
            if (this.f29284i.compareAndSet(false, true)) {
                this.f29283h.mo36823a(this.f29282g, this.f29281f, this);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.d0$b */
    /* compiled from: ObservableDebounceTimed */
    static final class C11022b<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29285f;

        /* renamed from: g */
        final long f29286g;

        /* renamed from: h */
        final TimeUnit f29287h;

        /* renamed from: i */
        final C11491v.C11494c f29288i;

        /* renamed from: j */
        C10842c f29289j;

        /* renamed from: k */
        C10842c f29290k;

        /* renamed from: l */
        volatile long f29291l;

        /* renamed from: m */
        boolean f29292m;

        C11022b(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar) {
            this.f29285f = uVar;
            this.f29286g = j;
            this.f29287h = timeUnit;
            this.f29288i = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36823a(long j, T t, C11021a<T> aVar) {
            if (j == this.f29291l) {
                this.f29285f.onNext(t);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f29289j.dispose();
            this.f29288i.dispose();
        }

        public boolean isDisposed() {
            return this.f29288i.isDisposed();
        }

        public void onComplete() {
            if (!this.f29292m) {
                this.f29292m = true;
                C10842c cVar = this.f29290k;
                if (cVar != null) {
                    cVar.dispose();
                }
                C11021a aVar = (C11021a) cVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f29285f.onComplete();
                this.f29288i.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f29292m) {
                C11459a.m37531b(th);
                return;
            }
            C10842c cVar = this.f29290k;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f29292m = true;
            this.f29285f.onError(th);
            this.f29288i.dispose();
        }

        public void onNext(T t) {
            if (!this.f29292m) {
                long j = this.f29291l + 1;
                this.f29291l = j;
                C10842c cVar = this.f29290k;
                if (cVar != null) {
                    cVar.dispose();
                }
                C11021a aVar = new C11021a(t, j, this);
                this.f29290k = aVar;
                aVar.mo36821a(this.f29288i.mo37117a(aVar, this.f29286g, this.f29287h));
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29289j, cVar)) {
                this.f29289j = cVar;
                this.f29285f.onSubscribe(this);
            }
        }
    }

    public C11020d0(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar) {
        super(sVar);
        this.f29278g = j;
        this.f29279h = timeUnit;
        this.f29280i = vVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11022b(new C11455e(uVar), this.f29278g, this.f29279h, this.f29280i.mo37114a()));
    }
}
