package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11481m;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.h0 */
/* compiled from: ObservableDematerialize */
public final class C11077h0<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11481m<R>> f29457g;

    /* renamed from: q.a.d0.e.e.h0$a */
    /* compiled from: ObservableDematerialize */
    static final class C11078a<T, R> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29458f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11481m<R>> f29459g;

        /* renamed from: h */
        boolean f29460h;

        /* renamed from: i */
        C10842c f29461i;

        C11078a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11481m<R>> oVar) {
            this.f29458f = uVar;
            this.f29459g = oVar;
        }

        public void dispose() {
            this.f29461i.dispose();
        }

        public boolean isDisposed() {
            return this.f29461i.isDisposed();
        }

        public void onComplete() {
            if (!this.f29460h) {
                this.f29460h = true;
                this.f29458f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29460h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29460h = true;
            this.f29458f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29460h) {
                try {
                    Object apply = this.f29459g.apply(t);
                    C10910b.m36861a(apply, "The selector returned a null Notification");
                    C11481m mVar = (C11481m) apply;
                    if (mVar.mo37249d()) {
                        this.f29461i.dispose();
                        onError(mVar.mo37246a());
                    } else if (mVar.mo37248c()) {
                        this.f29461i.dispose();
                        onComplete();
                    } else {
                        this.f29458f.onNext(mVar.mo37247b());
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29461i.dispose();
                    onError(th);
                }
            } else if (t instanceof C11481m) {
                C11481m mVar2 = (C11481m) t;
                if (mVar2.mo37249d()) {
                    C11459a.m37531b(mVar2.mo37246a());
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29461i, cVar)) {
                this.f29461i = cVar;
                this.f29458f.onSubscribe(this);
            }
        }
    }

    public C11077h0(C11488s<T> sVar, C10861o<? super T, ? extends C11481m<R>> oVar) {
        super(sVar);
        this.f29457g = oVar;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        this.f29150f.subscribe(new C11078a(uVar, this.f29457g));
    }
}
