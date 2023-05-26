package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.e.t0 */
/* compiled from: ObservableError */
public final class C11271t0<T> extends C11482n<T> {

    /* renamed from: f */
    final Callable<? extends Throwable> f30133f;

    public C11271t0(Callable<? extends Throwable> callable) {
        this.f30133f = callable;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            Object call = this.f30133f.call();
            C10910b.m36861a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C9034a.m29708a(th);
        }
        C10868e.m36781a(th, (C11490u<?>) uVar);
    }
}
