package p123rx.p401n.p402a;

import java.util.concurrent.Callable;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p401n.p403b.C12706b;

/* renamed from: rx.n.a.t */
/* compiled from: OnSubscribeFromCallable */
public final class C12654t<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    private final Callable<? extends T> f32680f;

    public C12654t(Callable<? extends T> callable) {
        this.f32680f = callable;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12706b bVar = new C12706b(jVar);
        jVar.setProducer(bVar);
        try {
            bVar.mo40846a(this.f32680f.call());
        } catch (Throwable th) {
            C12472a.m40939a(th, (C5372f<?>) jVar);
        }
    }
}
