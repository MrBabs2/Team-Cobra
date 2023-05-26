package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.e.b4 */
/* compiled from: ObservableToList */
public final class C11002b4<T, U extends Collection<? super T>> extends C10980a<T, U> {

    /* renamed from: g */
    final Callable<U> f29215g;

    /* renamed from: q.a.d0.e.e.b4$a */
    /* compiled from: ObservableToList */
    static final class C11003a<T, U extends Collection<? super T>> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super U> f29216f;

        /* renamed from: g */
        C10842c f29217g;

        /* renamed from: h */
        U f29218h;

        C11003a(C11490u<? super U> uVar, U u) {
            this.f29216f = uVar;
            this.f29218h = u;
        }

        public void dispose() {
            this.f29217g.dispose();
        }

        public boolean isDisposed() {
            return this.f29217g.isDisposed();
        }

        public void onComplete() {
            U u = this.f29218h;
            this.f29218h = null;
            this.f29216f.onNext(u);
            this.f29216f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29218h = null;
            this.f29216f.onError(th);
        }

        public void onNext(T t) {
            this.f29218h.add(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29217g, cVar)) {
                this.f29217g = cVar;
                this.f29216f.onSubscribe(this);
            }
        }
    }

    public C11002b4(C11488s<T> sVar, int i) {
        super(sVar);
        this.f29215g = C10872a.m36794a(i);
    }

    public void subscribeActual(C11490u<? super U> uVar) {
        try {
            U call = this.f29215g.call();
            C10910b.m36861a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f29150f.subscribe(new C11003a(uVar, (Collection) call));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }

    public C11002b4(C11488s<T> sVar, Callable<U> callable) {
        super(sVar);
        this.f29215g = callable;
    }
}
