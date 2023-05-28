package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.e.p2 */
/* compiled from: ObservableRepeat */
public final class C11218p2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29952g;

    /* renamed from: q.a.d0.e.e.p2$a */
    /* compiled from: ObservableRepeat */
    static final class C11219a<T> extends AtomicInteger implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f29953f;

        /* renamed from: g */
        final C10871h f29954g;

        /* renamed from: h */
        final C11488s<? extends T> f29955h;

        /* renamed from: i */
        long f29956i;

        C11219a(C11490u<? super T> uVar, long j, C10871h hVar, C11488s<? extends T> sVar) {
            this.f29953f = uVar;
            this.f29954g = hVar;
            this.f29955h = sVar;
            this.f29956i = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36964a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f29954g.isDisposed()) {
                    this.f29955h.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            long j = this.f29956i;
            if (j != Long.MAX_VALUE) {
                this.f29956i = j - 1;
            }
            if (j != 0) {
                mo36964a();
            } else {
                this.f29953f.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f29953f.onError(th);
        }

        public void onNext(T t) {
            this.f29953f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f29954g.mo36672a(cVar);
        }
    }

    public C11218p2(C11482n<T> nVar, long j) {
        super(nVar);
        this.f29952g = j;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10871h hVar = new C10871h();
        uVar.onSubscribe(hVar);
        long j = this.f29952g;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C11219a(uVar, j2, hVar, this.f29150f).mo36964a();
    }
}
