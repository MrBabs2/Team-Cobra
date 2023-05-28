package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.a0 */
/* compiled from: ObservableCountSingle */
public final class C10981a0<T> extends C11496w<Long> implements C10912a<Long> {

    /* renamed from: f */
    final C11488s<T> f29151f;

    /* renamed from: q.a.d0.e.e.a0$a */
    /* compiled from: ObservableCountSingle */
    static final class C10982a implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11498y<? super Long> f29152f;

        /* renamed from: g */
        C10842c f29153g;

        /* renamed from: h */
        long f29154h;

        C10982a(C11498y<? super Long> yVar) {
            this.f29152f = yVar;
        }

        public void dispose() {
            this.f29153g.dispose();
            this.f29153g = C10867d.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f29153g.isDisposed();
        }

        public void onComplete() {
            this.f29153g = C10867d.DISPOSED;
            this.f29152f.onSuccess(Long.valueOf(this.f29154h));
        }

        public void onError(Throwable th) {
            this.f29153g = C10867d.DISPOSED;
            this.f29152f.onError(th);
        }

        public void onNext(Object obj) {
            this.f29154h++;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29153g, cVar)) {
                this.f29153g = cVar;
                this.f29152f.onSubscribe(this);
            }
        }
    }

    public C10981a0(C11488s<T> sVar) {
        this.f29151f = sVar;
    }

    /* renamed from: a */
    public C11482n<Long> mo36701a() {
        return C11459a.m37519a(new C11345z(this.f29151f));
    }

    /* renamed from: b */
    public void mo36633b(C11498y<? super Long> yVar) {
        this.f29151f.subscribe(new C10982a(yVar));
    }
}
