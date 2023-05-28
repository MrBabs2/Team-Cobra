package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p342g.C11417p;

/* renamed from: q.a.d0.e.e.o1 */
/* compiled from: ObservableInterval */
public final class C11200o1 extends C11482n<Long> {

    /* renamed from: f */
    final C11491v f29869f;

    /* renamed from: g */
    final long f29870g;

    /* renamed from: h */
    final long f29871h;

    /* renamed from: i */
    final TimeUnit f29872i;

    /* renamed from: q.a.d0.e.e.o1$a */
    /* compiled from: ObservableInterval */
    static final class C11201a extends AtomicReference<C10842c> implements C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super Long> f29873f;

        /* renamed from: g */
        long f29874g;

        C11201a(C11490u<? super Long> uVar) {
            this.f29873f = uVar;
        }

        /* renamed from: a */
        public void mo36943a(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return get() == C10867d.DISPOSED;
        }

        public void run() {
            if (get() != C10867d.DISPOSED) {
                C11490u<? super Long> uVar = this.f29873f;
                long j = this.f29874g;
                this.f29874g = 1 + j;
                uVar.onNext(Long.valueOf(j));
            }
        }
    }

    public C11200o1(long j, long j2, TimeUnit timeUnit, C11491v vVar) {
        this.f29870g = j;
        this.f29871h = j2;
        this.f29872i = timeUnit;
        this.f29869f = vVar;
    }

    public void subscribeActual(C11490u<? super Long> uVar) {
        C11201a aVar = new C11201a(uVar);
        uVar.onSubscribe(aVar);
        C11491v vVar = this.f29869f;
        if (vVar instanceof C11417p) {
            C11491v.C11494c a = vVar.mo37114a();
            aVar.mo36943a(a);
            a.mo37604a(aVar, this.f29870g, this.f29871h, this.f29872i);
            return;
        }
        aVar.mo36943a(vVar.mo37112a(aVar, this.f29870g, this.f29871h, this.f29872i));
    }
}
