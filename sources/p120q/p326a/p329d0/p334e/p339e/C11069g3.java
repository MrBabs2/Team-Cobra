package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.g3 */
/* compiled from: ObservableSkip */
public final class C11069g3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29429g;

    /* renamed from: q.a.d0.e.e.g3$a */
    /* compiled from: ObservableSkip */
    static final class C11070a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29430f;

        /* renamed from: g */
        long f29431g;

        /* renamed from: h */
        C10842c f29432h;

        C11070a(C11490u<? super T> uVar, long j) {
            this.f29430f = uVar;
            this.f29431g = j;
        }

        public void dispose() {
            this.f29432h.dispose();
        }

        public boolean isDisposed() {
            return this.f29432h.isDisposed();
        }

        public void onComplete() {
            this.f29430f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29430f.onError(th);
        }

        public void onNext(T t) {
            long j = this.f29431g;
            if (j != 0) {
                this.f29431g = j - 1;
            } else {
                this.f29430f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29432h, cVar)) {
                this.f29432h = cVar;
                this.f29430f.onSubscribe(this);
            }
        }
    }

    public C11069g3(C11488s<T> sVar, long j) {
        super(sVar);
        this.f29429g = j;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11070a(uVar, this.f29429g));
    }
}
