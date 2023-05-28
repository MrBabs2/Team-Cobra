package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10927i;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c1 */
/* compiled from: ObservableFromCallable */
public final class C11009c1<T> extends C11482n<T> implements Callable<T> {

    /* renamed from: f */
    final Callable<? extends T> f29235f;

    public C11009c1(Callable<? extends T> callable) {
        this.f29235f = callable;
    }

    public T call() throws Exception {
        T call = this.f29235f.call();
        C10910b.m36861a(call, "The callable returned a null value");
        return call;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10927i iVar = new C10927i(uVar);
        uVar.onSubscribe(iVar);
        if (!iVar.isDisposed()) {
            try {
                Object call = this.f29235f.call();
                C10910b.m36861a(call, "Callable returned null");
                iVar.mo36715a(call);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                if (!iVar.isDisposed()) {
                    uVar.onError(th);
                } else {
                    C11459a.m37531b(th);
                }
            }
        }
    }
}
