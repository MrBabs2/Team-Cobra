package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.n4 */
/* compiled from: ObservableZipIterable */
public final class C11194n4<T, U, V> extends C11482n<V> {

    /* renamed from: f */
    final C11482n<? extends T> f29851f;

    /* renamed from: g */
    final Iterable<U> f29852g;

    /* renamed from: h */
    final C10849c<? super T, ? super U, ? extends V> f29853h;

    /* renamed from: q.a.d0.e.e.n4$a */
    /* compiled from: ObservableZipIterable */
    static final class C11195a<T, U, V> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super V> f29854f;

        /* renamed from: g */
        final Iterator<U> f29855g;

        /* renamed from: h */
        final C10849c<? super T, ? super U, ? extends V> f29856h;

        /* renamed from: i */
        C10842c f29857i;

        /* renamed from: j */
        boolean f29858j;

        C11195a(C11490u<? super V> uVar, Iterator<U> it, C10849c<? super T, ? super U, ? extends V> cVar) {
            this.f29854f = uVar;
            this.f29855g = it;
            this.f29856h = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36940a(Throwable th) {
            this.f29858j = true;
            this.f29857i.dispose();
            this.f29854f.onError(th);
        }

        public void dispose() {
            this.f29857i.dispose();
        }

        public boolean isDisposed() {
            return this.f29857i.isDisposed();
        }

        public void onComplete() {
            if (!this.f29858j) {
                this.f29858j = true;
                this.f29854f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29858j) {
                C11459a.m37531b(th);
                return;
            }
            this.f29858j = true;
            this.f29854f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29858j) {
                try {
                    U next = this.f29855g.next();
                    C10910b.m36861a(next, "The iterator returned a null value");
                    try {
                        Object a = this.f29856h.mo7653a(t, next);
                        C10910b.m36861a(a, "The zipper function returned a null value");
                        this.f29854f.onNext(a);
                        try {
                            if (!this.f29855g.hasNext()) {
                                this.f29858j = true;
                                this.f29857i.dispose();
                                this.f29854f.onComplete();
                            }
                        } catch (Throwable th) {
                            C9034a.m29708a(th);
                            mo36940a(th);
                        }
                    } catch (Throwable th2) {
                        C9034a.m29708a(th2);
                        mo36940a(th2);
                    }
                } catch (Throwable th3) {
                    C9034a.m29708a(th3);
                    mo36940a(th3);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29857i, cVar)) {
                this.f29857i = cVar;
                this.f29854f.onSubscribe(this);
            }
        }
    }

    public C11194n4(C11482n<? extends T> nVar, Iterable<U> iterable, C10849c<? super T, ? super U, ? extends V> cVar) {
        this.f29851f = nVar;
        this.f29852g = iterable;
        this.f29853h = cVar;
    }

    public void subscribeActual(C11490u<? super V> uVar) {
        try {
            Iterator<U> it = this.f29852g.iterator();
            C10910b.m36861a(it, "The iterator returned by other is null");
            Iterator it2 = it;
            try {
                if (!it2.hasNext()) {
                    C10868e.m36785a((C11490u<?>) uVar);
                } else {
                    this.f29851f.subscribe(new C11195a(uVar, it2, this.f29853h));
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10868e.m36781a(th, (C11490u<?>) uVar);
            }
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C10868e.m36781a(th2, (C11490u<?>) uVar);
        }
    }
}
