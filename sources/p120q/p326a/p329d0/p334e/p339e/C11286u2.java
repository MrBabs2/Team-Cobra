package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.e.u2 */
/* compiled from: ObservableRetryPredicate */
public final class C11286u2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10862p<? super Throwable> f30183g;

    /* renamed from: h */
    final long f30184h;

    /* renamed from: q.a.d0.e.e.u2$a */
    /* compiled from: ObservableRetryPredicate */
    static final class C11287a<T> extends AtomicInteger implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f30185f;

        /* renamed from: g */
        final C10871h f30186g;

        /* renamed from: h */
        final C11488s<? extends T> f30187h;

        /* renamed from: i */
        final C10862p<? super Throwable> f30188i;

        /* renamed from: j */
        long f30189j;

        C11287a(C11490u<? super T> uVar, long j, C10862p<? super Throwable> pVar, C10871h hVar, C11488s<? extends T> sVar) {
            this.f30185f = uVar;
            this.f30186g = hVar;
            this.f30187h = sVar;
            this.f30188i = pVar;
            this.f30189j = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37016a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f30186g.isDisposed()) {
                    this.f30187h.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f30185f.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.f30189j;
            if (j != Long.MAX_VALUE) {
                this.f30189j = j - 1;
            }
            if (j == 0) {
                this.f30185f.onError(th);
                return;
            }
            try {
                if (!this.f30188i.mo36663a(th)) {
                    this.f30185f.onError(th);
                } else {
                    mo37016a();
                }
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                this.f30185f.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f30185f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f30186g.mo36672a(cVar);
        }
    }

    public C11286u2(C11482n<T> nVar, long j, C10862p<? super Throwable> pVar) {
        super(nVar);
        this.f30183g = pVar;
        this.f30184h = j;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10871h hVar = new C10871h();
        uVar.onSubscribe(hVar);
        new C11287a(uVar, this.f30184h, this.f30183g, hVar, this.f29150f).mo37016a();
    }
}
