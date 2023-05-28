package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.k3 */
/* compiled from: ObservableSkipWhile */
public final class C11133k3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10862p<? super T> f29670g;

    /* renamed from: q.a.d0.e.e.k3$a */
    /* compiled from: ObservableSkipWhile */
    static final class C11134a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29671f;

        /* renamed from: g */
        final C10862p<? super T> f29672g;

        /* renamed from: h */
        C10842c f29673h;

        /* renamed from: i */
        boolean f29674i;

        C11134a(C11490u<? super T> uVar, C10862p<? super T> pVar) {
            this.f29671f = uVar;
            this.f29672g = pVar;
        }

        public void dispose() {
            this.f29673h.dispose();
        }

        public boolean isDisposed() {
            return this.f29673h.isDisposed();
        }

        public void onComplete() {
            this.f29671f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29671f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29674i) {
                this.f29671f.onNext(t);
                return;
            }
            try {
                if (!this.f29672g.mo36663a(t)) {
                    this.f29674i = true;
                    this.f29671f.onNext(t);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29673h.dispose();
                this.f29671f.onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29673h, cVar)) {
                this.f29673h = cVar;
                this.f29671f.onSubscribe(this);
            }
        }
    }

    public C11133k3(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f29670g = pVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11134a(uVar, this.f29670g));
    }
}
