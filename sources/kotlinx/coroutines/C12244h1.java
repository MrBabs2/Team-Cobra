package kotlinx.coroutines;

import kotlin.C10483v;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlinx.coroutines.h1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C12244h1 extends C12199f {

    /* renamed from: f */
    private final C9113l<Throwable, C10483v> f32019f;

    public C12244h1(C9113l<? super Throwable, C10483v> lVar) {
        this.f32019f = lVar;
    }

    /* renamed from: a */
    public void mo38853a(Throwable th) {
        this.f32019f.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38853a((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C12256j0.m40409a((Object) this.f32019f) + '@' + C12256j0.m40411b(this) + ']';
    }
}
