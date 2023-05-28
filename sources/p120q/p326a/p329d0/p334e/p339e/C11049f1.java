package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11471i;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p344i.C11424b;
import p415t.p416a.C12934a;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.e.f1 */
/* compiled from: ObservableFromPublisher */
public final class C11049f1<T> extends C11482n<T> {

    /* renamed from: f */
    final C12934a<? extends T> f29365f;

    /* renamed from: q.a.d0.e.e.f1$a */
    /* compiled from: ObservableFromPublisher */
    static final class C11050a<T> implements C11471i<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29366f;

        /* renamed from: g */
        C12936c f29367g;

        C11050a(C11490u<? super T> uVar) {
            this.f29366f = uVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            if (C11424b.m37440a(this.f29367g, cVar)) {
                this.f29367g = cVar;
                this.f29366f.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f29367g.cancel();
            this.f29367g = C11424b.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f29367g == C11424b.CANCELLED;
        }

        public void onComplete() {
            this.f29366f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29366f.onError(th);
        }

        public void onNext(T t) {
            this.f29366f.onNext(t);
        }
    }

    public C11049f1(C12934a<? extends T> aVar) {
        this.f29365f = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29365f.mo37219a(new C11050a(uVar));
    }
}
