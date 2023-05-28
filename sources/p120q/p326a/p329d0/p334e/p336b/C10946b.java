package p120q.p326a.p329d0.p334e.p336b;

import p120q.p326a.C11460h;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.b.b */
/* compiled from: FlowableFromObservable */
public final class C10946b<T> extends C11460h<T> {

    /* renamed from: g */
    private final C11482n<T> f29026g;

    /* renamed from: q.a.d0.e.b.b$a */
    /* compiled from: FlowableFromObservable */
    static final class C10947a<T> implements C11490u<T>, C12936c {

        /* renamed from: f */
        final C12935b<? super T> f29027f;

        /* renamed from: g */
        C10842c f29028g;

        C10947a(C12935b<? super T> bVar) {
            this.f29027f = bVar;
        }

        public void cancel() {
            this.f29028g.dispose();
        }

        public void onComplete() {
            this.f29027f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29027f.onError(th);
        }

        public void onNext(T t) {
            this.f29027f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f29028g = cVar;
            this.f29027f.mo36628a(this);
        }

        public void request(long j) {
        }
    }

    public C10946b(C11482n<T> nVar) {
        this.f29026g = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36741b(C12935b<? super T> bVar) {
        this.f29026g.subscribe(new C10947a(bVar));
    }
}
