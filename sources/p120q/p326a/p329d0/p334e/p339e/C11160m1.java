package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.m1 */
/* compiled from: ObservableIgnoreElementsCompletable */
public final class C11160m1<T> extends C10839b implements C10912a<T> {

    /* renamed from: f */
    final C11488s<T> f29752f;

    /* renamed from: q.a.d0.e.e.m1$a */
    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class C11161a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C10863d f29753f;

        /* renamed from: g */
        C10842c f29754g;

        C11161a(C10863d dVar) {
            this.f29753f = dVar;
        }

        public void dispose() {
            this.f29754g.dispose();
        }

        public boolean isDisposed() {
            return this.f29754g.isDisposed();
        }

        public void onComplete() {
            this.f29753f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29753f.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(C10842c cVar) {
            this.f29754g = cVar;
            this.f29753f.onSubscribe(this);
        }
    }

    public C11160m1(C11488s<T> sVar) {
        this.f29752f = sVar;
    }

    /* renamed from: a */
    public C11482n<T> mo36701a() {
        return C11459a.m37519a(new C11143l1(this.f29752f));
    }

    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        this.f29752f.subscribe(new C11161a(dVar));
    }
}
