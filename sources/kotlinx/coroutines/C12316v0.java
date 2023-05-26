package kotlinx.coroutines;

import kotlin.C10483v;

/* renamed from: kotlinx.coroutines.v0 */
/* compiled from: CancellableContinuation.kt */
final class C12316v0 extends C12199f {

    /* renamed from: f */
    private final C12313u0 f32139f;

    public C12316v0(C12313u0 u0Var) {
        this.f32139f = u0Var;
    }

    /* renamed from: a */
    public void mo38853a(Throwable th) {
        this.f32139f.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38853a((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f32139f + ']';
    }
}
