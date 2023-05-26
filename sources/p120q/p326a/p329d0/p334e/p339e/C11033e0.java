package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.e.e0 */
/* compiled from: ObservableDefer */
public final class C11033e0<T> extends C11482n<T> {

    /* renamed from: f */
    final Callable<? extends C11488s<? extends T>> f29319f;

    public C11033e0(Callable<? extends C11488s<? extends T>> callable) {
        this.f29319f = callable;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            Object call = this.f29319f.call();
            C10910b.m36861a(call, "null ObservableSource supplied");
            ((C11488s) call).subscribe(uVar);
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }
}
