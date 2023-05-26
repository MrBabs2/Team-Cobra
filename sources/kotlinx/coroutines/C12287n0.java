package kotlinx.coroutines;

import kotlin.C10483v;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9065e;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9087g;

/* renamed from: kotlinx.coroutines.n0 */
/* compiled from: Delay.kt */
public final class C12287n0 {
    /* renamed from: a */
    public static final Object m40508a(long j, C9064d<? super C10483v> dVar) {
        if (j <= 0) {
            return C10483v.f28357a;
        }
        C12247i iVar = new C12247i(C9078c.m29783a(dVar), 1);
        iVar.mo38936f();
        m40509a(iVar.getContext()).mo38987a(j, iVar);
        Object d = iVar.mo38934d();
        if (d == C9081d.m29785a()) {
            C9087g.m29792c(dVar);
        }
        return d;
    }

    /* renamed from: a */
    public static final C12284m0 m40509a(C9069g gVar) {
        C9069g.C9072b bVar = gVar.get(C9065e.f25651b);
        if (!(bVar instanceof C12284m0)) {
            bVar = null;
        }
        C12284m0 m0Var = (C12284m0) bVar;
        return m0Var != null ? m0Var : C12281l0.m40500a();
    }
}
