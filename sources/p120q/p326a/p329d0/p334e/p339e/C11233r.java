package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10848b;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.r */
/* compiled from: ObservableCollect */
public final class C11233r<T, U> extends C10980a<T, U> {

    /* renamed from: g */
    final Callable<? extends U> f30017g;

    /* renamed from: h */
    final C10848b<? super U, ? super T> f30018h;

    /* renamed from: q.a.d0.e.e.r$a */
    /* compiled from: ObservableCollect */
    static final class C11234a<T, U> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super U> f30019f;

        /* renamed from: g */
        final C10848b<? super U, ? super T> f30020g;

        /* renamed from: h */
        final U f30021h;

        /* renamed from: i */
        C10842c f30022i;

        /* renamed from: j */
        boolean f30023j;

        C11234a(C11490u<? super U> uVar, U u, C10848b<? super U, ? super T> bVar) {
            this.f30019f = uVar;
            this.f30020g = bVar;
            this.f30021h = u;
        }

        public void dispose() {
            this.f30022i.dispose();
        }

        public boolean isDisposed() {
            return this.f30022i.isDisposed();
        }

        public void onComplete() {
            if (!this.f30023j) {
                this.f30023j = true;
                this.f30019f.onNext(this.f30021h);
                this.f30019f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f30023j) {
                C11459a.m37531b(th);
                return;
            }
            this.f30023j = true;
            this.f30019f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30023j) {
                try {
                    this.f30020g.mo36652a(this.f30021h, t);
                } catch (Throwable th) {
                    this.f30022i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30022i, cVar)) {
                this.f30022i = cVar;
                this.f30019f.onSubscribe(this);
            }
        }
    }

    public C11233r(C11488s<T> sVar, Callable<? extends U> callable, C10848b<? super U, ? super T> bVar) {
        super(sVar);
        this.f30017g = callable;
        this.f30018h = bVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        try {
            Object call = this.f30017g.call();
            C10910b.m36861a(call, "The initialSupplier returned a null value");
            this.f29150f.subscribe(new C11234a(uVar, call, this.f30018h));
        } catch (Throwable th) {
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }
}
