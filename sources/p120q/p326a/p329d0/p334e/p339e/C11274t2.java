package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10850d;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.e.t2 */
/* compiled from: ObservableRetryBiPredicate */
public final class C11274t2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10850d<? super Integer, ? super Throwable> f30140g;

    /* renamed from: q.a.d0.e.e.t2$a */
    /* compiled from: ObservableRetryBiPredicate */
    static final class C11275a<T> extends AtomicInteger implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f30141f;

        /* renamed from: g */
        final C10871h f30142g;

        /* renamed from: h */
        final C11488s<? extends T> f30143h;

        /* renamed from: i */
        final C10850d<? super Integer, ? super Throwable> f30144i;

        /* renamed from: j */
        int f30145j;

        C11275a(C11490u<? super T> uVar, C10850d<? super Integer, ? super Throwable> dVar, C10871h hVar, C11488s<? extends T> sVar) {
            this.f30141f = uVar;
            this.f30142g = hVar;
            this.f30143h = sVar;
            this.f30144i = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37010a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f30142g.isDisposed()) {
                    this.f30143h.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.f30141f.onComplete();
        }

        public void onError(Throwable th) {
            try {
                C10850d<? super Integer, ? super Throwable> dVar = this.f30144i;
                int i = this.f30145j + 1;
                this.f30145j = i;
                if (!dVar.mo36653a(Integer.valueOf(i), th)) {
                    this.f30141f.onError(th);
                } else {
                    mo37010a();
                }
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                this.f30141f.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f30141f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f30142g.mo36672a(cVar);
        }
    }

    public C11274t2(C11482n<T> nVar, C10850d<? super Integer, ? super Throwable> dVar) {
        super(nVar);
        this.f30140g = dVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10871h hVar = new C10871h();
        uVar.onSubscribe(hVar);
        new C11275a(uVar, this.f30140g, hVar, this.f29150f).mo37010a();
    }
}
