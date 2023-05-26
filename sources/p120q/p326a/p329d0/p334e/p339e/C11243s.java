package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10848b;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.s */
/* compiled from: ObservableCollectSingle */
public final class C11243s<T, U> extends C11496w<U> implements C10912a<U> {

    /* renamed from: f */
    final C11488s<T> f30060f;

    /* renamed from: g */
    final Callable<? extends U> f30061g;

    /* renamed from: h */
    final C10848b<? super U, ? super T> f30062h;

    /* renamed from: q.a.d0.e.e.s$a */
    /* compiled from: ObservableCollectSingle */
    static final class C11244a<T, U> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super U> f30063f;

        /* renamed from: g */
        final C10848b<? super U, ? super T> f30064g;

        /* renamed from: h */
        final U f30065h;

        /* renamed from: i */
        C10842c f30066i;

        /* renamed from: j */
        boolean f30067j;

        C11244a(C11498y<? super U> yVar, U u, C10848b<? super U, ? super T> bVar) {
            this.f30063f = yVar;
            this.f30064g = bVar;
            this.f30065h = u;
        }

        public void dispose() {
            this.f30066i.dispose();
        }

        public boolean isDisposed() {
            return this.f30066i.isDisposed();
        }

        public void onComplete() {
            if (!this.f30067j) {
                this.f30067j = true;
                this.f30063f.onSuccess(this.f30065h);
            }
        }

        public void onError(Throwable th) {
            if (this.f30067j) {
                C11459a.m37531b(th);
                return;
            }
            this.f30067j = true;
            this.f30063f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30067j) {
                try {
                    this.f30064g.mo36652a(this.f30065h, t);
                } catch (Throwable th) {
                    this.f30066i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30066i, cVar)) {
                this.f30066i = cVar;
                this.f30063f.onSubscribe(this);
            }
        }
    }

    public C11243s(C11488s<T> sVar, Callable<? extends U> callable, C10848b<? super U, ? super T> bVar) {
        this.f30060f = sVar;
        this.f30061g = callable;
        this.f30062h = bVar;
    }

    /* renamed from: a */
    public C11482n<U> mo36701a() {
        return C11459a.m37519a(new C11233r(this.f30060f, this.f30061g, this.f30062h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super U> yVar) {
        try {
            Object call = this.f30061g.call();
            C10910b.m36861a(call, "The initialSupplier returned a null value");
            this.f30060f.subscribe(new C11244a(yVar, call, this.f30062h));
        } catch (Throwable th) {
            C10868e.m36782a(th, (C11498y<?>) yVar);
        }
    }
}
