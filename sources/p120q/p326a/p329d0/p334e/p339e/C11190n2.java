package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p339e.C11162m2;

/* renamed from: q.a.d0.e.e.n2 */
/* compiled from: ObservableReduceWithSingle */
public final class C11190n2<T, R> extends C11496w<R> {

    /* renamed from: f */
    final C11488s<T> f29829f;

    /* renamed from: g */
    final Callable<R> f29830g;

    /* renamed from: h */
    final C10849c<R, ? super T, R> f29831h;

    public C11190n2(C11488s<T> sVar, Callable<R> callable, C10849c<R, ? super T, R> cVar) {
        this.f29829f = sVar;
        this.f29830g = callable;
        this.f29831h = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super R> yVar) {
        try {
            R call = this.f29830g.call();
            C10910b.m36861a(call, "The seedSupplier returned a null value");
            this.f29829f.subscribe(new C11162m2.C11163a(yVar, this.f29831h, call));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36782a(th, (C11498y<?>) yVar);
        }
    }
}
