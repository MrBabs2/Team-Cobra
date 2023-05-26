package kotlinx.coroutines;

import kotlin.C10483v;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlinx.coroutines.j1 */
/* compiled from: JobSupport.kt */
final class C12257j1 extends C12296p1<C12277k1> {

    /* renamed from: j */
    private final C9113l<Throwable, C10483v> f32035j;

    public C12257j1(C12277k1 k1Var, C9113l<? super Throwable, C10483v> lVar) {
        super(k1Var);
        this.f32035j = lVar;
    }

    /* renamed from: b */
    public void mo38940b(Throwable th) {
        this.f32035j.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38940b((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "InvokeOnCompletion[" + C12256j0.m40409a((Object) this) + '@' + C12256j0.m40411b(this) + ']';
    }
}
