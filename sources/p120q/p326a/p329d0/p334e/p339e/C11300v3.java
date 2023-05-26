package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.v3 */
/* compiled from: ObservableThrottleFirstTimed */
public final class C11300v3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f30252g;

    /* renamed from: h */
    final TimeUnit f30253h;

    /* renamed from: i */
    final C11491v f30254i;

    /* renamed from: q.a.d0.e.e.v3$a */
    /* compiled from: ObservableThrottleFirstTimed */
    static final class C11301a<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super T> f30255f;

        /* renamed from: g */
        final long f30256g;

        /* renamed from: h */
        final TimeUnit f30257h;

        /* renamed from: i */
        final C11491v.C11494c f30258i;

        /* renamed from: j */
        C10842c f30259j;

        /* renamed from: k */
        volatile boolean f30260k;

        /* renamed from: l */
        boolean f30261l;

        C11301a(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar) {
            this.f30255f = uVar;
            this.f30256g = j;
            this.f30257h = timeUnit;
            this.f30258i = cVar;
        }

        public void dispose() {
            this.f30259j.dispose();
            this.f30258i.dispose();
        }

        public boolean isDisposed() {
            return this.f30258i.isDisposed();
        }

        public void onComplete() {
            if (!this.f30261l) {
                this.f30261l = true;
                this.f30255f.onComplete();
                this.f30258i.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f30261l) {
                C11459a.m37531b(th);
                return;
            }
            this.f30261l = true;
            this.f30255f.onError(th);
            this.f30258i.dispose();
        }

        public void onNext(T t) {
            if (!this.f30260k && !this.f30261l) {
                this.f30260k = true;
                this.f30255f.onNext(t);
                C10842c cVar = (C10842c) get();
                if (cVar != null) {
                    cVar.dispose();
                }
                C10867d.m36774a((AtomicReference<C10842c>) this, this.f30258i.mo37117a(this, this.f30256g, this.f30257h));
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30259j, cVar)) {
                this.f30259j = cVar;
                this.f30255f.onSubscribe(this);
            }
        }

        public void run() {
            this.f30260k = false;
        }
    }

    public C11300v3(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar) {
        super(sVar);
        this.f30252g = j;
        this.f30253h = timeUnit;
        this.f30254i = vVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11301a(new C11455e(uVar), this.f30252g, this.f30253h, this.f30254i.mo37114a()));
    }
}
