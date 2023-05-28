package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.w */
/* compiled from: ObservableConcatWithCompletable */
public final class C11302w<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11450f f30262g;

    /* renamed from: q.a.d0.e.e.w$a */
    /* compiled from: ObservableConcatWithCompletable */
    static final class C11303a<T> extends AtomicReference<C10842c> implements C11490u<T>, C10863d, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30263f;

        /* renamed from: g */
        C11450f f30264g;

        /* renamed from: h */
        boolean f30265h;

        C11303a(C11490u<? super T> uVar, C11450f fVar) {
            this.f30263f = uVar;
            this.f30264g = fVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            if (this.f30265h) {
                this.f30263f.onComplete();
                return;
            }
            this.f30265h = true;
            C10867d.m36774a((AtomicReference<C10842c>) this, (C10842c) null);
            C11450f fVar = this.f30264g;
            this.f30264g = null;
            fVar.mo36640a(this);
        }

        public void onError(Throwable th) {
            this.f30263f.onError(th);
        }

        public void onNext(T t) {
            this.f30263f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar) && !this.f30265h) {
                this.f30263f.onSubscribe(this);
            }
        }
    }

    public C11302w(C11482n<T> nVar, C11450f fVar) {
        super(nVar);
        this.f30262g = fVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11303a(uVar, this.f30262g));
    }
}
