package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.u3 */
/* compiled from: ObservableTakeWhile */
public final class C11288u3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10862p<? super T> f30190g;

    /* renamed from: q.a.d0.e.e.u3$a */
    /* compiled from: ObservableTakeWhile */
    static final class C11289a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30191f;

        /* renamed from: g */
        final C10862p<? super T> f30192g;

        /* renamed from: h */
        C10842c f30193h;

        /* renamed from: i */
        boolean f30194i;

        C11289a(C11490u<? super T> uVar, C10862p<? super T> pVar) {
            this.f30191f = uVar;
            this.f30192g = pVar;
        }

        public void dispose() {
            this.f30193h.dispose();
        }

        public boolean isDisposed() {
            return this.f30193h.isDisposed();
        }

        public void onComplete() {
            if (!this.f30194i) {
                this.f30194i = true;
                this.f30191f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f30194i) {
                C11459a.m37531b(th);
                return;
            }
            this.f30194i = true;
            this.f30191f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30194i) {
                try {
                    if (!this.f30192g.mo36663a(t)) {
                        this.f30194i = true;
                        this.f30193h.dispose();
                        this.f30191f.onComplete();
                        return;
                    }
                    this.f30191f.onNext(t);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30193h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30193h, cVar)) {
                this.f30193h = cVar;
                this.f30191f.onSubscribe(this);
            }
        }
    }

    public C11288u3(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f30190g = pVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11289a(uVar, this.f30190g));
    }
}
