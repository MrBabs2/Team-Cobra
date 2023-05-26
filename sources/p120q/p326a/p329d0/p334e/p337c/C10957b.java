package p120q.p326a.p329d0.p334e.p337c;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p327b0.C10843d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.c.b */
/* compiled from: MaybeFromCallable */
public final class C10957b<T> extends C11478j<T> implements Callable<T> {

    /* renamed from: f */
    final Callable<? extends T> f29059f;

    public C10957b(Callable<? extends T> callable) {
        this.f29059f = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        C10842c b = C10843d.m36751b();
        kVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f29059f.call();
                if (b.isDisposed()) {
                    return;
                }
                if (call == null) {
                    kVar.onComplete();
                } else {
                    kVar.onSuccess(call);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                if (!b.isDisposed()) {
                    kVar.onError(th);
                } else {
                    C11459a.m37531b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return this.f29059f.call();
    }
}
