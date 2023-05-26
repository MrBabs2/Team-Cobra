package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.k4 */
/* compiled from: ObservableWithLatestFrom */
public final class C11135k4<T, U, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10849c<? super T, ? super U, ? extends R> f29675g;

    /* renamed from: h */
    final C11488s<? extends U> f29676h;

    /* renamed from: q.a.d0.e.e.k4$a */
    /* compiled from: ObservableWithLatestFrom */
    static final class C11136a<T, U, R> extends AtomicReference<U> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29677f;

        /* renamed from: g */
        final C10849c<? super T, ? super U, ? extends R> f29678g;

        /* renamed from: h */
        final AtomicReference<C10842c> f29679h = new AtomicReference<>();

        /* renamed from: i */
        final AtomicReference<C10842c> f29680i = new AtomicReference<>();

        C11136a(C11490u<? super R> uVar, C10849c<? super T, ? super U, ? extends R> cVar) {
            this.f29677f = uVar;
            this.f29678g = cVar;
        }

        /* renamed from: a */
        public boolean mo36901a(C10842c cVar) {
            return C10867d.m36778c(this.f29680i, cVar);
        }

        public void dispose() {
            C10867d.m36773a(this.f29679h);
            C10867d.m36773a(this.f29680i);
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f29679h.get());
        }

        public void onComplete() {
            C10867d.m36773a(this.f29680i);
            this.f29677f.onComplete();
        }

        public void onError(Throwable th) {
            C10867d.m36773a(this.f29680i);
            this.f29677f.onError(th);
        }

        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object a = this.f29678g.mo7653a(t, obj);
                    C10910b.m36861a(a, "The combiner returned a null value");
                    this.f29677f.onNext(a);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    dispose();
                    this.f29677f.onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29679h, cVar);
        }

        /* renamed from: a */
        public void mo36900a(Throwable th) {
            C10867d.m36773a(this.f29679h);
            this.f29677f.onError(th);
        }
    }

    /* renamed from: q.a.d0.e.e.k4$b */
    /* compiled from: ObservableWithLatestFrom */
    final class C11137b implements C11490u<U> {

        /* renamed from: f */
        private final C11136a<T, U, R> f29681f;

        C11137b(C11135k4 k4Var, C11136a<T, U, R> aVar) {
            this.f29681f = aVar;
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f29681f.mo36900a(th);
        }

        public void onNext(U u) {
            this.f29681f.lazySet(u);
        }

        public void onSubscribe(C10842c cVar) {
            this.f29681f.mo36901a(cVar);
        }
    }

    public C11135k4(C11488s<T> sVar, C10849c<? super T, ? super U, ? extends R> cVar, C11488s<? extends U> sVar2) {
        super(sVar);
        this.f29675g = cVar;
        this.f29676h = sVar2;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        C11455e eVar = new C11455e(uVar);
        C11136a aVar = new C11136a(eVar, this.f29675g);
        eVar.onSubscribe(aVar);
        this.f29676h.subscribe(new C11137b(this, aVar));
        this.f29150f.subscribe(aVar);
    }
}
