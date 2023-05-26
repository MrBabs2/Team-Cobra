package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.o4 */
/* compiled from: ObserverResourceWrapper */
public final class C11207o4<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C11490u<? super T> f29895f;

    /* renamed from: g */
    final AtomicReference<C10842c> f29896g = new AtomicReference<>();

    public C11207o4(C11490u<? super T> uVar) {
        this.f29895f = uVar;
    }

    /* renamed from: a */
    public void mo36952a(C10842c cVar) {
        C10867d.m36777b(this, cVar);
    }

    public void dispose() {
        C10867d.m36773a(this.f29896g);
        C10867d.m36773a((AtomicReference<C10842c>) this);
    }

    public boolean isDisposed() {
        return this.f29896g.get() == C10867d.DISPOSED;
    }

    public void onComplete() {
        dispose();
        this.f29895f.onComplete();
    }

    public void onError(Throwable th) {
        dispose();
        this.f29895f.onError(th);
    }

    public void onNext(T t) {
        this.f29895f.onNext(t);
    }

    public void onSubscribe(C10842c cVar) {
        if (C10867d.m36778c(this.f29896g, cVar)) {
            this.f29895f.onSubscribe(this);
        }
    }
}
