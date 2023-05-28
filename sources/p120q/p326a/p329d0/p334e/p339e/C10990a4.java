package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;

/* renamed from: q.a.d0.e.e.a4 */
/* compiled from: ObservableTimer */
public final class C10990a4 extends C11482n<Long> {

    /* renamed from: f */
    final C11491v f29177f;

    /* renamed from: g */
    final long f29178g;

    /* renamed from: h */
    final TimeUnit f29179h;

    /* renamed from: q.a.d0.e.e.a4$a */
    /* compiled from: ObservableTimer */
    static final class C10991a extends AtomicReference<C10842c> implements C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super Long> f29180f;

        C10991a(C11490u<? super Long> uVar) {
            this.f29180f = uVar;
        }

        /* renamed from: a */
        public void mo36782a(C10842c cVar) {
            C10867d.m36779d(this, cVar);
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return get() == C10867d.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.f29180f.onNext(0L);
                lazySet(C10868e.INSTANCE);
                this.f29180f.onComplete();
            }
        }
    }

    public C10990a4(long j, TimeUnit timeUnit, C11491v vVar) {
        this.f29178g = j;
        this.f29179h = timeUnit;
        this.f29177f = vVar;
    }

    public void subscribeActual(C11490u<? super Long> uVar) {
        C10991a aVar = new C10991a(uVar);
        uVar.onSubscribe(aVar);
        aVar.mo36782a(this.f29177f.mo37113a(aVar, this.f29178g, this.f29179h));
    }
}
