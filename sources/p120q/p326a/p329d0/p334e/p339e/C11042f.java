package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.f */
/* compiled from: ObservableAll */
public final class C11042f<T> extends C10980a<T, Boolean> {

    /* renamed from: g */
    final C10862p<? super T> f29345g;

    /* renamed from: q.a.d0.e.e.f$a */
    /* compiled from: ObservableAll */
    static final class C11043a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super Boolean> f29346f;

        /* renamed from: g */
        final C10862p<? super T> f29347g;

        /* renamed from: h */
        C10842c f29348h;

        /* renamed from: i */
        boolean f29349i;

        C11043a(C11490u<? super Boolean> uVar, C10862p<? super T> pVar) {
            this.f29346f = uVar;
            this.f29347g = pVar;
        }

        public void dispose() {
            this.f29348h.dispose();
        }

        public boolean isDisposed() {
            return this.f29348h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29349i) {
                this.f29349i = true;
                this.f29346f.onNext(true);
                this.f29346f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29349i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29349i = true;
            this.f29346f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29349i) {
                try {
                    if (!this.f29347g.mo36663a(t)) {
                        this.f29349i = true;
                        this.f29348h.dispose();
                        this.f29346f.onNext(false);
                        this.f29346f.onComplete();
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29348h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29348h, cVar)) {
                this.f29348h = cVar;
                this.f29346f.onSubscribe(this);
            }
        }
    }

    public C11042f(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f29345g = pVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Boolean> uVar) {
        this.f29150f.subscribe(new C11043a(uVar, this.f29345g));
    }
}
