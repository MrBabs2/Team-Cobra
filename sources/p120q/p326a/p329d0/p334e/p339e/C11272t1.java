package p120q.p326a.p329d0.p334e.p339e;

import java.util.NoSuchElementException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.t1 */
/* compiled from: ObservableLastSingle */
public final class C11272t1<T> extends C11496w<T> {

    /* renamed from: f */
    final C11488s<T> f30134f;

    /* renamed from: g */
    final T f30135g;

    /* renamed from: q.a.d0.e.e.t1$a */
    /* compiled from: ObservableLastSingle */
    static final class C11273a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super T> f30136f;

        /* renamed from: g */
        final T f30137g;

        /* renamed from: h */
        C10842c f30138h;

        /* renamed from: i */
        T f30139i;

        C11273a(C11498y<? super T> yVar, T t) {
            this.f30136f = yVar;
            this.f30137g = t;
        }

        public void dispose() {
            this.f30138h.dispose();
            this.f30138h = C10867d.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f30138h == C10867d.DISPOSED;
        }

        public void onComplete() {
            this.f30138h = C10867d.DISPOSED;
            T t = this.f30139i;
            if (t != null) {
                this.f30139i = null;
                this.f30136f.onSuccess(t);
                return;
            }
            T t2 = this.f30137g;
            if (t2 != null) {
                this.f30136f.onSuccess(t2);
            } else {
                this.f30136f.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f30138h = C10867d.DISPOSED;
            this.f30139i = null;
            this.f30136f.onError(th);
        }

        public void onNext(T t) {
            this.f30139i = t;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30138h, cVar)) {
                this.f30138h = cVar;
                this.f30136f.onSubscribe(this);
            }
        }
    }

    public C11272t1(C11488s<T> sVar, T t) {
        this.f30134f = sVar;
        this.f30135g = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        this.f30134f.subscribe(new C11273a(yVar, this.f30135g));
    }
}
