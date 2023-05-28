package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.t3 */
/* compiled from: ObservableTakeUntilPredicate */
public final class C11276t3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10862p<? super T> f30146g;

    /* renamed from: q.a.d0.e.e.t3$a */
    /* compiled from: ObservableTakeUntilPredicate */
    static final class C11277a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30147f;

        /* renamed from: g */
        final C10862p<? super T> f30148g;

        /* renamed from: h */
        C10842c f30149h;

        /* renamed from: i */
        boolean f30150i;

        C11277a(C11490u<? super T> uVar, C10862p<? super T> pVar) {
            this.f30147f = uVar;
            this.f30148g = pVar;
        }

        public void dispose() {
            this.f30149h.dispose();
        }

        public boolean isDisposed() {
            return this.f30149h.isDisposed();
        }

        public void onComplete() {
            if (!this.f30150i) {
                this.f30150i = true;
                this.f30147f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f30150i) {
                this.f30150i = true;
                this.f30147f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (!this.f30150i) {
                this.f30147f.onNext(t);
                try {
                    if (this.f30148g.mo36663a(t)) {
                        this.f30150i = true;
                        this.f30149h.dispose();
                        this.f30147f.onComplete();
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30149h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30149h, cVar)) {
                this.f30149h = cVar;
                this.f30147f.onSubscribe(this);
            }
        }
    }

    public C11276t3(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f30146g = pVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11277a(uVar, this.f30146g));
    }
}
