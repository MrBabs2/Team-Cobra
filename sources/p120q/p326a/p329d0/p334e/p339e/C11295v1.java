package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10919a;

/* renamed from: q.a.d0.e.e.v1 */
/* compiled from: ObservableMap */
public final class C11295v1<T, U> extends C10980a<T, U> {

    /* renamed from: g */
    final C10861o<? super T, ? extends U> f30240g;

    /* renamed from: q.a.d0.e.e.v1$a */
    /* compiled from: ObservableMap */
    static final class C11296a<T, U> extends C10919a<T, U> {

        /* renamed from: k */
        final C10861o<? super T, ? extends U> f30241k;

        C11296a(C11490u<? super U> uVar, C10861o<? super T, ? extends U> oVar) {
            super(uVar);
            this.f30241k = oVar;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return mo36705b(i);
        }

        public void onNext(T t) {
            if (!this.f28975i) {
                if (this.f28976j != 0) {
                    this.f28972f.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f30241k.apply(t);
                    C10910b.m36861a(apply, "The mapper function returned a null value.");
                    this.f28972f.onNext(apply);
                } catch (Throwable th) {
                    mo36704a(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.f28974h.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f30241k.apply(poll);
            C10910b.m36861a(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public C11295v1(C11488s<T> sVar, C10861o<? super T, ? extends U> oVar) {
        super(sVar);
        this.f30240g = oVar;
    }

    public void subscribeActual(C11490u<? super U> uVar) {
        this.f29150f.subscribe(new C11296a(uVar, this.f30240g));
    }
}
