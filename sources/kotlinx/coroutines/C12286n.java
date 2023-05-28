package kotlinx.coroutines;

import kotlin.C10483v;

/* renamed from: kotlinx.coroutines.n */
/* compiled from: JobSupport.kt */
public final class C12286n extends C12282l1<C12299q1> implements C12283m {

    /* renamed from: j */
    public final C12289o f32098j;

    public C12286n(C12299q1 q1Var, C12289o oVar) {
        super(q1Var);
        this.f32098j = oVar;
    }

    /* renamed from: a */
    public boolean mo38986a(Throwable th) {
        return ((C12299q1) this.f32112i).mo39008b(th);
    }

    /* renamed from: b */
    public void mo38940b(Throwable th) {
        this.f32098j.mo38990a((C12320w1) this.f32112i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38940b((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "ChildHandle[" + this.f32098j + ']';
    }
}
