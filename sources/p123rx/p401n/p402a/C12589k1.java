package p123rx.p401n.p402a;

import java.util.concurrent.Callable;
import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;

/* renamed from: rx.n.a.k1 */
/* compiled from: SingleFromCallable */
public final class C12589k1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Callable<? extends T> f32480f;

    public C12589k1(Callable<? extends T> callable) {
        this.f32480f = callable;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        try {
            iVar.mo18573a(this.f32480f.call());
        } catch (Throwable th) {
            C12472a.m40945c(th);
            iVar.onError(th);
        }
    }
}
