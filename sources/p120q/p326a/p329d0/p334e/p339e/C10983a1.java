package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.a1 */
/* compiled from: ObservableFlattenIterable */
public final class C10983a1<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends Iterable<? extends R>> f29155g;

    /* renamed from: q.a.d0.e.e.a1$a */
    /* compiled from: ObservableFlattenIterable */
    static final class C10984a<T, R> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29156f;

        /* renamed from: g */
        final C10861o<? super T, ? extends Iterable<? extends R>> f29157g;

        /* renamed from: h */
        C10842c f29158h;

        C10984a(C11490u<? super R> uVar, C10861o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f29156f = uVar;
            this.f29157g = oVar;
        }

        public void dispose() {
            this.f29158h.dispose();
            this.f29158h = C10867d.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f29158h.isDisposed();
        }

        public void onComplete() {
            C10842c cVar = this.f29158h;
            C10867d dVar = C10867d.DISPOSED;
            if (cVar != dVar) {
                this.f29158h = dVar;
                this.f29156f.onComplete();
            }
        }

        public void onError(Throwable th) {
            C10842c cVar = this.f29158h;
            C10867d dVar = C10867d.DISPOSED;
            if (cVar == dVar) {
                C11459a.m37531b(th);
                return;
            }
            this.f29158h = dVar;
            this.f29156f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29158h != C10867d.DISPOSED) {
                try {
                    C11490u<? super R> uVar = this.f29156f;
                    for (Object next : (Iterable) this.f29157g.apply(t)) {
                        try {
                            try {
                                C10910b.m36861a(next, "The iterator returned a null value");
                                uVar.onNext(next);
                            } catch (Throwable th) {
                                C9034a.m29708a(th);
                                this.f29158h.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C9034a.m29708a(th2);
                            this.f29158h.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C9034a.m29708a(th3);
                    this.f29158h.dispose();
                    onError(th3);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29158h, cVar)) {
                this.f29158h = cVar;
                this.f29156f.onSubscribe(this);
            }
        }
    }

    public C10983a1(C11488s<T> sVar, C10861o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(sVar);
        this.f29155g = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        this.f29150f.subscribe(new C10984a(uVar, this.f29155g));
    }
}
