package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11487r;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.u1 */
/* compiled from: ObservableLift */
public final class C11285u1<R, T> extends C10980a<T, R> {

    /* renamed from: g */
    final C11487r<? extends R, ? super T> f30182g;

    public C11285u1(C11488s<T> sVar, C11487r<? extends R, ? super T> rVar) {
        super(sVar);
        this.f30182g = rVar;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        try {
            C11490u<? super Object> a = this.f30182g.mo37598a(uVar);
            C10910b.m36861a(a, "Operator " + this.f30182g + " returned a null Observer");
            this.f29150f.subscribe(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C11459a.m37531b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
