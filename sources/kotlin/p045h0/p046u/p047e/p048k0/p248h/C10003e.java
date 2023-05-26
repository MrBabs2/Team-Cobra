package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;

/* renamed from: kotlin.h0.u.e.k0.h.e */
/* compiled from: inlineClassesUtils.kt */
public final class C10003e {
    /* renamed from: a */
    public static final C10386v0 m33698a(C10342e eVar) {
        C10273d L;
        List<C10386v0> f;
        C10202j.m34178b(eVar, "$this$underlyingRepresentation");
        if (!eVar.isInline() || (L = eVar.mo33759L()) == null || (f = L.mo35407f()) == null) {
            return null;
        }
        return (C10386v0) C10539w.m35811j(f);
    }

    /* renamed from: b */
    public static final C11824b0 m33703b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$substitutedUnderlyingType");
        C10386v0 c = m33704c(b0Var);
        if (c == null) {
            return null;
        }
        C10096h m = b0Var.mo34008m();
        C9939f name = c.getName();
        C10202j.m34174a((Object) name, "parameter.name");
        C10352i0 i0Var = (C10352i0) C10539w.m35812k(m.mo33918c(name, C9401d.FOR_ALREADY_TRACKED));
        if (i0Var != null) {
            return i0Var.getType();
        }
        return null;
    }

    /* renamed from: c */
    public static final C10386v0 m33704c(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$unsubstitutedUnderlyingParameter");
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar != null) {
            return m33698a(eVar);
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m33701a(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$isInlineClass");
        return (mVar instanceof C10342e) && ((C10342e) mVar).isInline();
    }

    /* renamed from: a */
    public static final boolean m33699a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isInlineClassType");
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (b != null) {
            return m33701a((C10359m) b);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m33700a(C10230a aVar) {
        C10202j.m34178b(aVar, "$this$isGetterOfUnderlyingPropertyOfInlineClass");
        if (aVar instanceof C10354j0) {
            C10352i0 l0 = ((C10354j0) aVar).mo35574l0();
            C10202j.m34174a((Object) l0, "correspondingProperty");
            if (m33702a((C10392x0) l0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m33702a(C10392x0 x0Var) {
        C10202j.m34178b(x0Var, "$this$isUnderlyingPropertyOfInlineClass");
        C10359m b = x0Var.mo33762b();
        C10202j.m34174a((Object) b, "this.containingDeclaration");
        if (!m33701a(b)) {
            return false;
        }
        if (b != null) {
            C10386v0 a = m33698a((C10342e) b);
            return C10202j.m34176a((Object) a != null ? a.getName() : null, (Object) x0Var.getName());
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }
}
