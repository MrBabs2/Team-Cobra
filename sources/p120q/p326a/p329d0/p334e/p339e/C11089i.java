package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.i */
/* compiled from: ObservableAny */
public final class C11089i<T> extends C10980a<T, Boolean> {

    /* renamed from: g */
    final C10862p<? super T> f29494g;

    /* renamed from: q.a.d0.e.e.i$a */
    /* compiled from: ObservableAny */
    static final class C11090a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super Boolean> f29495f;

        /* renamed from: g */
        final C10862p<? super T> f29496g;

        /* renamed from: h */
        C10842c f29497h;

        /* renamed from: i */
        boolean f29498i;

        C11090a(C11490u<? super Boolean> uVar, C10862p<? super T> pVar) {
            this.f29495f = uVar;
            this.f29496g = pVar;
        }

        public void dispose() {
            this.f29497h.dispose();
        }

        public boolean isDisposed() {
            return this.f29497h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29498i) {
                this.f29498i = true;
                this.f29495f.onNext(false);
                this.f29495f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29498i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29498i = true;
            this.f29495f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29498i) {
                try {
                    if (this.f29496g.mo36663a(t)) {
                        this.f29498i = true;
                        this.f29497h.dispose();
                        this.f29495f.onNext(true);
                        this.f29495f.onComplete();
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29497h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29497h, cVar)) {
                this.f29497h = cVar;
                this.f29495f.onSubscribe(this);
            }
        }
    }

    public C11089i(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f29494g = pVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Boolean> uVar) {
        this.f29150f.subscribe(new C11090a(uVar, this.f29494g));
    }
}
