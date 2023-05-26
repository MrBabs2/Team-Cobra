package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10048n;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.c0 */
/* compiled from: KotlinTypeFactory.kt */
public final class C11827c0 {

    /* renamed from: a */
    public static final C11827c0 f31531a = new C11827c0();

    private C11827c0() {
    }

    /* renamed from: a */
    private final C10096h m38945a(C11953s0 s0Var, List<? extends C11965u0> list) {
        C10349h b = s0Var.mo33781b();
        if (b instanceof C10375s0) {
            return b.mo35445o().mo34008m();
        }
        if (b instanceof C10342e) {
            if (list.isEmpty()) {
                return ((C10342e) b).mo35445o().mo34008m();
            }
            C10096h a = ((C10342e) b).mo35451a(C11955t0.f31657b.mo38602a(s0Var, list));
            C10202j.m34174a((Object) a, "descriptor.getMemberScop…(constructor, arguments))");
            return a;
        } else if (b instanceof C10373r0) {
            C10096h a2 = C11958u.m39545a("Scope for abbreviation: " + ((C10373r0) b).getName(), true);
            C10202j.m34174a((Object) a2, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return a2;
        } else {
            throw new IllegalStateException("Unsupported classifier: " + b + " for constructor: " + s0Var);
        }
    }

    /* renamed from: a */
    public static final C11901j0 m38948a(C10249g gVar, C11953s0 s0Var, List<? extends C11965u0> list, boolean z) {
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(s0Var, "constructor");
        C10202j.m34178b(list, "arguments");
        if (!gVar.isEmpty() || !list.isEmpty() || z || s0Var.mo33781b() == null) {
            return m38949a(gVar, s0Var, list, z, f31531a.m38945a(s0Var, list));
        }
        C10349h b = s0Var.mo33781b();
        if (b != null) {
            C10202j.m34174a((Object) b, "constructor.declarationDescriptor!!");
            C11901j0 o = b.mo35445o();
            C10202j.m34174a((Object) o, "constructor.declarationDescriptor!!.defaultType");
            return o;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: a */
    public static final C11901j0 m38949a(C10249g gVar, C11953s0 s0Var, List<? extends C11965u0> list, boolean z, C10096h hVar) {
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(s0Var, "constructor");
        C10202j.m34178b(list, "arguments");
        C10202j.m34178b(hVar, "memberScope");
        C11923k0 k0Var = new C11923k0(s0Var, list, z, hVar);
        return gVar.isEmpty() ? k0Var : new C11896i(k0Var, gVar);
    }

    /* renamed from: a */
    public static final C11901j0 m38950a(C10249g gVar, C10342e eVar, List<? extends C11965u0> list) {
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(eVar, "descriptor");
        C10202j.m34178b(list, "arguments");
        C11953s0 h = eVar.mo33766h();
        C10202j.m34174a((Object) h, "descriptor.typeConstructor");
        return m38948a(gVar, h, list, false);
    }

    /* renamed from: a */
    public static final C11834e1 m38946a(C11901j0 j0Var, C11901j0 j0Var2) {
        C10202j.m34178b(j0Var, "lowerBound");
        C10202j.m34178b(j0Var2, "upperBound");
        if (C10202j.m34176a((Object) j0Var, (Object) j0Var2)) {
            return j0Var;
        }
        return new C11968w(j0Var, j0Var2);
    }

    /* renamed from: a */
    public static final C11901j0 m38947a(C10249g gVar, C10048n nVar, boolean z) {
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(nVar, "constructor");
        List a = C10529o.m35736a();
        C10096h a2 = C11958u.m39545a("Scope for integer literal type", true);
        C10202j.m34174a((Object) a2, "ErrorUtils.createErrorSc…eger literal type\", true)");
        return m38949a(gVar, nVar, a, z, a2);
    }
}
