package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.l3 */
/* compiled from: ObservableSubscribeOn */
public final class C11147l3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11491v f29709g;

    /* renamed from: q.a.d0.e.e.l3$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C11148a<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29710f;

        /* renamed from: g */
        final AtomicReference<C10842c> f29711g = new AtomicReference<>();

        C11148a(C11490u<? super T> uVar) {
            this.f29710f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36903a(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void dispose() {
            C10867d.m36773a(this.f29711g);
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            this.f29710f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29710f.onError(th);
        }

        public void onNext(T t) {
            this.f29710f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29711g, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.l3$b */
    /* compiled from: ObservableSubscribeOn */
    final class C11149b implements Runnable {

        /* renamed from: f */
        private final C11148a<T> f29712f;

        C11149b(C11148a<T> aVar) {
            this.f29712f = aVar;
        }

        public void run() {
            C11147l3.this.f29150f.subscribe(this.f29712f);
        }
    }

    public C11147l3(C11488s<T> sVar, C11491v vVar) {
        super(sVar);
        this.f29709g = vVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11148a aVar = new C11148a(uVar);
        uVar.onSubscribe(aVar);
        aVar.mo36903a(this.f29709g.mo37125a((Runnable) new C11149b(aVar)));
    }
}
