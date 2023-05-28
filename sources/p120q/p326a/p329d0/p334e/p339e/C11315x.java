package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11479k;
import p120q.p326a.C11480l;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.x */
/* compiled from: ObservableConcatWithMaybe */
public final class C11315x<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11480l<? extends T> f30311g;

    /* renamed from: q.a.d0.e.e.x$a */
    /* compiled from: ObservableConcatWithMaybe */
    static final class C11316a<T> extends AtomicReference<C10842c> implements C11490u<T>, C11479k<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30312f;

        /* renamed from: g */
        C11480l<? extends T> f30313g;

        /* renamed from: h */
        boolean f30314h;

        C11316a(C11490u<? super T> uVar, C11480l<? extends T> lVar) {
            this.f30312f = uVar;
            this.f30313g = lVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            if (this.f30314h) {
                this.f30312f.onComplete();
                return;
            }
            this.f30314h = true;
            C10867d.m36774a((AtomicReference<C10842c>) this, (C10842c) null);
            C11480l<? extends T> lVar = this.f30313g;
            this.f30313g = null;
            lVar.mo37244a(this);
        }

        public void onError(Throwable th) {
            this.f30312f.onError(th);
        }

        public void onNext(T t) {
            this.f30312f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar) && !this.f30314h) {
                this.f30312f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f30312f.onNext(t);
            this.f30312f.onComplete();
        }
    }

    public C11315x(C11482n<T> nVar, C11480l<? extends T> lVar) {
        super(nVar);
        this.f30311g = lVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11316a(uVar, this.f30311g));
    }
}
