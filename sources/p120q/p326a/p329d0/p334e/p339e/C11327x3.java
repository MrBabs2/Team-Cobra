package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p349h0.C11470b;

/* renamed from: q.a.d0.e.e.x3 */
/* compiled from: ObservableTimeInterval */
public final class C11327x3<T> extends C10980a<T, C11470b<T>> {

    /* renamed from: g */
    final C11491v f30337g;

    /* renamed from: h */
    final TimeUnit f30338h;

    /* renamed from: q.a.d0.e.e.x3$a */
    /* compiled from: ObservableTimeInterval */
    static final class C11328a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super C11470b<T>> f30339f;

        /* renamed from: g */
        final TimeUnit f30340g;

        /* renamed from: h */
        final C11491v f30341h;

        /* renamed from: i */
        long f30342i;

        /* renamed from: j */
        C10842c f30343j;

        C11328a(C11490u<? super C11470b<T>> uVar, TimeUnit timeUnit, C11491v vVar) {
            this.f30339f = uVar;
            this.f30341h = vVar;
            this.f30340g = timeUnit;
        }

        public void dispose() {
            this.f30343j.dispose();
        }

        public boolean isDisposed() {
            return this.f30343j.isDisposed();
        }

        public void onComplete() {
            this.f30339f.onComplete();
        }

        public void onError(Throwable th) {
            this.f30339f.onError(th);
        }

        public void onNext(T t) {
            long a = this.f30341h.mo37600a(this.f30340g);
            long j = this.f30342i;
            this.f30342i = a;
            this.f30339f.onNext(new C11470b(t, a - j, this.f30340g));
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30343j, cVar)) {
                this.f30343j = cVar;
                this.f30342i = this.f30341h.mo37600a(this.f30340g);
                this.f30339f.onSubscribe(this);
            }
        }
    }

    public C11327x3(C11488s<T> sVar, TimeUnit timeUnit, C11491v vVar) {
        super(sVar);
        this.f30337g = vVar;
        this.f30338h = timeUnit;
    }

    public void subscribeActual(C11490u<? super C11470b<T>> uVar) {
        this.f29150f.subscribe(new C11328a(uVar, this.f30338h, this.f30337g));
    }
}
