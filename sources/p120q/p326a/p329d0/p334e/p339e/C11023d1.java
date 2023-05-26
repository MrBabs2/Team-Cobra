package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10927i;

/* renamed from: q.a.d0.e.e.d1 */
/* compiled from: ObservableFromFuture */
public final class C11023d1<T> extends C11482n<T> {

    /* renamed from: f */
    final Future<? extends T> f29293f;

    /* renamed from: g */
    final long f29294g;

    /* renamed from: h */
    final TimeUnit f29295h;

    public C11023d1(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f29293f = future;
        this.f29294g = j;
        this.f29295h = timeUnit;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10927i iVar = new C10927i(uVar);
        uVar.onSubscribe(iVar);
        if (!iVar.isDisposed()) {
            try {
                Object obj = this.f29295h != null ? this.f29293f.get(this.f29294g, this.f29295h) : this.f29293f.get();
                C10910b.m36861a(obj, "Future returned null");
                iVar.mo36715a(obj);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                if (!iVar.isDisposed()) {
                    uVar.onError(th);
                }
            }
        }
    }
}
