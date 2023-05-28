package kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;

/* renamed from: kotlin.h0.u.e.k0.h.p.a */
/* compiled from: inlineClassManglingRules.kt */
public final class C10078a {
    /* renamed from: a */
    public static final boolean m33914a(C10238b bVar) {
        C10202j.m34178b(bVar, "descriptor");
        if (!(bVar instanceof C10273d)) {
            bVar = null;
        }
        C10273d dVar = (C10273d) bVar;
        if (dVar == null || C10397z0.m35089a(dVar.getVisibility())) {
            return false;
        }
        C10342e x = dVar.mo35473x();
        C10202j.m34174a((Object) x, "constructorDescriptor.constructedClass");
        if (x.isInline() || C9999c.m33694s(dVar.mo35473x())) {
            return false;
        }
        List<C10386v0> f = dVar.mo35407f();
        C10202j.m34174a((Object) f, "constructorDescriptor.valueParameters");
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        for (C10386v0 v0Var : f) {
            C10202j.m34174a((Object) v0Var, "it");
            C11824b0 type = v0Var.getType();
            C10202j.m34174a((Object) type, "it.type");
            if (m33918c(type)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m33917b(C11824b0 b0Var) {
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (!(b instanceof C10375s0)) {
            b = null;
        }
        C10375s0 s0Var = (C10375s0) b;
        if (s0Var != null) {
            return m33918c(C11924a.m39412a(s0Var));
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m33918c(C11824b0 b0Var) {
        return m33913a(b0Var) || m33917b(b0Var);
    }

    /* renamed from: a */
    public static final boolean m33916a(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$isInlineClassThatRequiresMangling");
        return C10003e.m33701a(mVar) && !m33915a((C10342e) mVar);
    }

    /* renamed from: a */
    public static final boolean m33913a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isInlineClassThatRequiresMangling");
        C10349h b = b0Var.mo35227v0().mo33781b();
        return b != null && m33916a((C10359m) b);
    }

    /* renamed from: a */
    private static final boolean m33915a(C10342e eVar) {
        return C10202j.m34176a((Object) C10071a.m33895c(eVar), (Object) C9999c.f27583g);
    }
}
