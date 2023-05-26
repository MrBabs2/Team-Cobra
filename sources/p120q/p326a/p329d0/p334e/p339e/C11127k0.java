package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10850d;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p333d.C10919a;

/* renamed from: q.a.d0.e.e.k0 */
/* compiled from: ObservableDistinctUntilChanged */
public final class C11127k0<T, K> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super T, K> f29656g;

    /* renamed from: h */
    final C10850d<? super K, ? super K> f29657h;

    /* renamed from: q.a.d0.e.e.k0$a */
    /* compiled from: ObservableDistinctUntilChanged */
    static final class C11128a<T, K> extends C10919a<T, T> {

        /* renamed from: k */
        final C10861o<? super T, K> f29658k;

        /* renamed from: l */
        final C10850d<? super K, ? super K> f29659l;

        /* renamed from: m */
        K f29660m;

        /* renamed from: n */
        boolean f29661n;

        C11128a(C11490u<? super T> uVar, C10861o<? super T, K> oVar, C10850d<? super K, ? super K> dVar) {
            super(uVar);
            this.f29658k = oVar;
            this.f29659l = dVar;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return mo36705b(i);
        }

        public void onNext(T t) {
            if (!this.f28975i) {
                if (this.f28976j != 0) {
                    this.f28972f.onNext(t);
                    return;
                }
                try {
                    K apply = this.f29658k.apply(t);
                    if (this.f29661n) {
                        boolean a = this.f29659l.mo36653a(this.f29660m, apply);
                        this.f29660m = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f29661n = true;
                        this.f29660m = apply;
                    }
                    this.f28972f.onNext(t);
                } catch (Throwable th) {
                    mo36704a(th);
                }
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f28974h.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f29658k.apply(poll);
                if (!this.f29661n) {
                    this.f29661n = true;
                    this.f29660m = apply;
                    return poll;
                } else if (!this.f29659l.mo36653a(this.f29660m, apply)) {
                    this.f29660m = apply;
                    return poll;
                } else {
                    this.f29660m = apply;
                }
            }
        }
    }

    public C11127k0(C11488s<T> sVar, C10861o<? super T, K> oVar, C10850d<? super K, ? super K> dVar) {
        super(sVar);
        this.f29656g = oVar;
        this.f29657h = dVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11128a(uVar, this.f29656g, this.f29657h));
    }
}
