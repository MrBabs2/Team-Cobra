package kotlinx.coroutines;

import kotlin.C10483v;

/* renamed from: kotlinx.coroutines.l */
/* compiled from: JobSupport.kt */
public final class C12280l extends C12282l1<C12277k1> {

    /* renamed from: j */
    public final C12247i<?> f32095j;

    public C12280l(C12277k1 k1Var, C12247i<?> iVar) {
        super(k1Var);
        this.f32095j = iVar;
    }

    /* renamed from: b */
    public void mo38940b(Throwable th) {
        C12247i<?> iVar = this.f32095j;
        iVar.mo38932b(iVar.mo38926a((C12277k1) this.f32112i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38940b((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "ChildContinuation[" + this.f32095j + ']';
    }
}
