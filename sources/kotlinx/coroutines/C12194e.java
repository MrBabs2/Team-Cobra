package kotlinx.coroutines;

import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9065e;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.C9075h;
import kotlin.p042a0.p043j.p044a.C9087g;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.p393g2.C12228m;
import kotlinx.coroutines.p393g2.C12234s;
import kotlinx.coroutines.p394h2.C12245a;
import kotlinx.coroutines.p394h2.C12246b;

/* renamed from: kotlinx.coroutines.e */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C12194e {
    /* renamed from: a */
    public static /* synthetic */ C12277k1 m40236a(C12191d0 d0Var, C9069g gVar, C12204g0 g0Var, C9117p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C9075h.f25654f;
        }
        if ((i & 2) != 0) {
            g0Var = C12204g0.DEFAULT;
        }
        return C12190d.m40229a(d0Var, gVar, g0Var, pVar);
    }

    /* renamed from: a */
    public static final C12277k1 m40235a(C12191d0 d0Var, C9069g gVar, C12204g0 g0Var, C9117p<? super C12191d0, ? super C9064d<? super C10483v>, ? extends Object> pVar) {
        C12174a aVar;
        C9069g a = C12321x.m40653a(d0Var, gVar);
        if (g0Var.mo38855a()) {
            aVar = new C12308s1(a, pVar);
        } else {
            aVar = new C12323x1(a, true);
        }
        aVar.mo38812a(g0Var, aVar, pVar);
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m40234a(C9069g gVar, C9117p<? super C12191d0, ? super C9064d<? super T>, ? extends Object> pVar, C9064d<? super T> dVar) {
        Object obj;
        C9069g context = dVar.getContext();
        C9069g plus = context.plus(gVar);
        C12202f2.m40242a(plus);
        if (plus == context) {
            C12228m mVar = new C12228m(plus, dVar);
            obj = C12246b.m40365a(mVar, mVar, pVar);
        } else if (C10202j.m34176a((Object) (C9065e) plus.get(C9065e.f25651b), (Object) (C9065e) context.get(C9065e.f25651b))) {
            C12193d2 d2Var = new C12193d2(plus, dVar);
            Object b = C12234s.m40334b(plus, (Object) null);
            try {
                Object a = C12246b.m40365a(d2Var, d2Var, pVar);
                C12234s.m40333a(plus, b);
                obj = a;
            } catch (Throwable th) {
                C12234s.m40333a(plus, b);
                throw th;
            }
        } else {
            C12298q0 q0Var = new C12298q0(plus, dVar);
            q0Var.mo38821o();
            C12245a.m40364a(pVar, q0Var, q0Var);
            obj = q0Var.mo39001q();
        }
        if (obj == C9081d.m29785a()) {
            C9087g.m29792c(dVar);
        }
        return obj;
    }
}
