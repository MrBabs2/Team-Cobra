package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p342g.C11417p;

/* renamed from: q.a.d0.e.e.p1 */
/* compiled from: ObservableIntervalRange */
public final class C11216p1 extends C11482n<Long> {

    /* renamed from: f */
    final C11491v f29943f;

    /* renamed from: g */
    final long f29944g;

    /* renamed from: h */
    final long f29945h;

    /* renamed from: i */
    final long f29946i;

    /* renamed from: j */
    final long f29947j;

    /* renamed from: k */
    final TimeUnit f29948k;

    /* renamed from: q.a.d0.e.e.p1$a */
    /* compiled from: ObservableIntervalRange */
    static final class C11217a extends AtomicReference<C10842c> implements C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super Long> f29949f;

        /* renamed from: g */
        final long f29950g;

        /* renamed from: h */
        long f29951h;

        C11217a(C11490u<? super Long> uVar, long j, long j2) {
            this.f29949f = uVar;
            this.f29951h = j;
            this.f29950g = j2;
        }

        /* renamed from: a */
        public void mo36962a(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return get() == C10867d.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                long j = this.f29951h;
                this.f29949f.onNext(Long.valueOf(j));
                if (j == this.f29950g) {
                    C10867d.m36773a((AtomicReference<C10842c>) this);
                    this.f29949f.onComplete();
                    return;
                }
                this.f29951h = j + 1;
            }
        }
    }

    public C11216p1(long j, long j2, long j3, long j4, TimeUnit timeUnit, C11491v vVar) {
        this.f29946i = j3;
        this.f29947j = j4;
        this.f29948k = timeUnit;
        this.f29943f = vVar;
        this.f29944g = j;
        this.f29945h = j2;
    }

    public void subscribeActual(C11490u<? super Long> uVar) {
        C11217a aVar = new C11217a(uVar, this.f29944g, this.f29945h);
        uVar.onSubscribe(aVar);
        C11491v vVar = this.f29943f;
        if (vVar instanceof C11417p) {
            C11491v.C11494c a = vVar.mo37114a();
            aVar.mo36962a(a);
            a.mo37604a(aVar, this.f29946i, this.f29947j, this.f29948k);
            return;
        }
        aVar.mo36962a(vVar.mo37112a(aVar, this.f29946i, this.f29947j, this.f29948k));
    }
}
