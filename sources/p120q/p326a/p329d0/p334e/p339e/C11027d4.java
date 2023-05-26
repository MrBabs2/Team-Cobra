package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.d4 */
/* compiled from: ObservableUnsubscribeOn */
public final class C11027d4<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11491v f29304g;

    /* renamed from: q.a.d0.e.e.d4$a */
    /* compiled from: ObservableUnsubscribeOn */
    static final class C11028a<T> extends AtomicBoolean implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29305f;

        /* renamed from: g */
        final C11491v f29306g;

        /* renamed from: h */
        C10842c f29307h;

        /* renamed from: q.a.d0.e.e.d4$a$a */
        /* compiled from: ObservableUnsubscribeOn */
        final class C11029a implements Runnable {
            C11029a() {
            }

            public void run() {
                C11028a.this.f29307h.dispose();
            }
        }

        C11028a(C11490u<? super T> uVar, C11491v vVar) {
            this.f29305f = uVar;
            this.f29306g = vVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f29306g.mo37125a((Runnable) new C11029a());
            }
        }

        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.f29305f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C11459a.m37531b(th);
            } else {
                this.f29305f.onError(th);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.f29305f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29307h, cVar)) {
                this.f29307h = cVar;
                this.f29305f.onSubscribe(this);
            }
        }
    }

    public C11027d4(C11488s<T> sVar, C11491v vVar) {
        super(sVar);
        this.f29304g = vVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11028a(uVar, this.f29304g));
    }
}
