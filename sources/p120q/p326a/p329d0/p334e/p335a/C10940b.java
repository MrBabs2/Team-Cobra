package p120q.p326a.p329d0.p334e.p335a;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p327b0.C10843d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.a.b */
/* compiled from: CompletableFromCallable */
public final class C10940b extends C10839b {

    /* renamed from: f */
    final Callable<?> f29017f;

    public C10940b(Callable<?> callable) {
        this.f29017f = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        C10842c b = C10843d.m36751b();
        dVar.onSubscribe(b);
        try {
            this.f29017f.call();
            if (!b.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            C9034a.m29708a(th);
            if (!b.isDisposed()) {
                dVar.onError(th);
            } else {
                C11459a.m37531b(th);
            }
        }
    }
}
