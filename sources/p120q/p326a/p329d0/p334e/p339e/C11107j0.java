package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10919a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.j0 */
/* compiled from: ObservableDistinct */
public final class C11107j0<T, K> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super T, K> f29567g;

    /* renamed from: h */
    final Callable<? extends Collection<? super K>> f29568h;

    /* renamed from: q.a.d0.e.e.j0$a */
    /* compiled from: ObservableDistinct */
    static final class C11108a<T, K> extends C10919a<T, T> {

        /* renamed from: k */
        final Collection<? super K> f29569k;

        /* renamed from: l */
        final C10861o<? super T, K> f29570l;

        C11108a(C11490u<? super T> uVar, C10861o<? super T, K> oVar, Collection<? super K> collection) {
            super(uVar);
            this.f29570l = oVar;
            this.f29569k = collection;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return mo36705b(i);
        }

        public void clear() {
            this.f29569k.clear();
            super.clear();
        }

        public void onComplete() {
            if (!this.f28975i) {
                this.f28975i = true;
                this.f29569k.clear();
                this.f28972f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28975i) {
                C11459a.m37531b(th);
                return;
            }
            this.f28975i = true;
            this.f29569k.clear();
            this.f28972f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28975i) {
                if (this.f28976j == 0) {
                    try {
                        K apply = this.f29570l.apply(t);
                        C10910b.m36861a(apply, "The keySelector returned a null key");
                        if (this.f29569k.add(apply)) {
                            this.f28972f.onNext(t);
                        }
                    } catch (Throwable th) {
                        mo36704a(th);
                    }
                } else {
                    this.f28972f.onNext(null);
                }
            }
        }

        public T poll() throws Exception {
            T poll;
            Collection<? super K> collection;
            K apply;
            do {
                poll = this.f28974h.poll();
                if (poll == null) {
                    break;
                }
                collection = this.f29569k;
                apply = this.f29570l.apply(poll);
                C10910b.m36861a(apply, "The keySelector returned a null key");
            } while (!collection.add(apply));
            return poll;
        }
    }

    public C11107j0(C11488s<T> sVar, C10861o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(sVar);
        this.f29567g = oVar;
        this.f29568h = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            Object call = this.f29568h.call();
            C10910b.m36861a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f29150f.subscribe(new C11108a(uVar, this.f29567g, (Collection) call));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }
}
