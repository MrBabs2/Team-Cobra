package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.y0 */
/* compiled from: TypeSubstitution.kt */
public final class C11976y0 {
    /* renamed from: a */
    public static /* synthetic */ C11824b0 m39648a(C11824b0 b0Var, List<C11965u0> list, C10249g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = b0Var.mo35226u0();
        }
        if ((i & 2) != 0) {
            gVar = b0Var.getAnnotations();
        }
        return m39647a(b0Var, (List<? extends C11965u0>) list, gVar);
    }

    /* renamed from: a */
    public static final C11824b0 m39647a(C11824b0 b0Var, List<? extends C11965u0> list, C10249g gVar) {
        C10202j.m34178b(b0Var, "$this$replace");
        C10202j.m34178b(list, "newArguments");
        C10202j.m34178b(gVar, "newAnnotations");
        if ((list.isEmpty() || list == b0Var.mo35226u0()) && gVar == b0Var.getAnnotations()) {
            return b0Var;
        }
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 instanceof C11966v) {
            C11966v vVar = (C11966v) x0;
            return C11827c0.m38946a(m39650a(vVar.mo38609z0(), list, gVar), m39650a(vVar.mo38607A0(), list, gVar));
        } else if (x0 instanceof C11901j0) {
            return m39650a((C11901j0) x0, list, gVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C11901j0 m39651a(C11901j0 j0Var, List<C11965u0> list, C10249g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = j0Var.mo35226u0();
        }
        if ((i & 2) != 0) {
            gVar = j0Var.getAnnotations();
        }
        return m39650a(j0Var, (List<? extends C11965u0>) list, gVar);
    }

    /* renamed from: a */
    public static final C11901j0 m39650a(C11901j0 j0Var, List<? extends C11965u0> list, C10249g gVar) {
        C10202j.m34178b(j0Var, "$this$replace");
        C10202j.m34178b(list, "newArguments");
        C10202j.m34178b(gVar, "newAnnotations");
        if (list.isEmpty() && gVar == j0Var.getAnnotations()) {
            return j0Var;
        }
        if (list.isEmpty()) {
            return j0Var.mo34006a(gVar);
        }
        return C11827c0.m38948a(gVar, j0Var.mo35227v0(), list, j0Var.mo34094w0());
    }

    /* renamed from: a */
    public static final C11901j0 m39649a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$asSimpleType");
        C11834e1 x0 = b0Var.mo38439x0();
        if (!(x0 instanceof C11901j0)) {
            x0 = null;
        }
        C11901j0 j0Var = (C11901j0) x0;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + b0Var).toString());
    }
}
