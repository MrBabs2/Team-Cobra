package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10851e;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.e.q2 */
/* compiled from: ObservableRepeatUntil */
public final class C11229q2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10851e f30009g;

    /* renamed from: q.a.d0.e.e.q2$a */
    /* compiled from: ObservableRepeatUntil */
    static final class C11230a<T> extends AtomicInteger implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f30010f;

        /* renamed from: g */
        final C10871h f30011g;

        /* renamed from: h */
        final C11488s<? extends T> f30012h;

        /* renamed from: i */
        final C10851e f30013i;

        C11230a(C11490u<? super T> uVar, C10851e eVar, C10871h hVar, C11488s<? extends T> sVar) {
            this.f30010f = uVar;
            this.f30011g = hVar;
            this.f30012h = sVar;
            this.f30013i = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36972a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f30012h.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            try {
                if (this.f30013i.mo36654a()) {
                    this.f30010f.onComplete();
                } else {
                    mo36972a();
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30010f.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f30010f.onError(th);
        }

        public void onNext(T t) {
            this.f30010f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f30011g.mo36672a(cVar);
        }
    }

    public C11229q2(C11482n<T> nVar, C10851e eVar) {
        super(nVar);
        this.f30009g = eVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10871h hVar = new C10871h();
        uVar.onSubscribe(hVar);
        new C11230a(uVar, this.f30009g, hVar, this.f29150f).mo36972a();
    }
}
