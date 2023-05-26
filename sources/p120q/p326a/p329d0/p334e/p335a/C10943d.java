package p120q.p326a.p329d0.p334e.p335a;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.a.d */
/* compiled from: CompletableSubscribeOn */
public final class C10943d extends C10839b {

    /* renamed from: f */
    final C11450f f29020f;

    /* renamed from: g */
    final C11491v f29021g;

    /* renamed from: q.a.d0.e.a.d$a */
    /* compiled from: CompletableSubscribeOn */
    static final class C10944a extends AtomicReference<C10842c> implements C10863d, C10842c, Runnable {

        /* renamed from: f */
        final C10863d f29022f;

        /* renamed from: g */
        final C10871h f29023g = new C10871h();

        /* renamed from: h */
        final C11450f f29024h;

        C10944a(C10863d dVar, C11450f fVar) {
            this.f29022f = dVar;
            this.f29024h = fVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f29023g.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            this.f29022f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29022f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void run() {
            this.f29024h.mo36640a(this);
        }
    }

    public C10943d(C11450f fVar, C11491v vVar) {
        this.f29020f = fVar;
        this.f29021g = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        C10944a aVar = new C10944a(dVar, this.f29020f);
        dVar.onSubscribe(aVar);
        aVar.f29023g.mo36672a(this.f29021g.mo37125a((Runnable) aVar));
    }
}
