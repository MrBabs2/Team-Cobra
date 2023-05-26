package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.List;
import kotlin.C10221n;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9668d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9713j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9734s;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.c.a.p */
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class C9625p implements C10000d {

    /* renamed from: a */
    public static final C9626a f26510a = new C9626a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.c.a.p$a */
    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class C9626a {
        private C9626a() {
        }

        /* renamed from: a */
        public final boolean mo34179a(C10230a aVar, C10230a aVar2) {
            C10202j.m34178b(aVar, "superDescriptor");
            C10202j.m34178b(aVar2, "subDescriptor");
            if ((aVar2 instanceof C9670f) && (aVar instanceof C10382u)) {
                C9670f fVar = (C9670f) aVar2;
                C10382u uVar = (C10382u) aVar;
                boolean z = fVar.mo35407f().size() == uVar.mo35407f().size();
                if (!C10485x.f28360a || z) {
                    C10360m0 a = fVar.m34429a();
                    C10202j.m34174a((Object) a, "subDescriptor.original");
                    List<C10386v0> f = a.mo35407f();
                    C10202j.m34174a((Object) f, "subDescriptor.original.valueParameters");
                    C10382u a2 = uVar.mo35404a();
                    C10202j.m34174a((Object) a2, "superDescriptor.original");
                    List<C10386v0> f2 = a2.mo35407f();
                    C10202j.m34174a((Object) f2, "superDescriptor.original.valueParameters");
                    for (C10221n next : C10539w.m35800e(f, f2)) {
                        C10386v0 v0Var = (C10386v0) next.mo35389a();
                        C10386v0 v0Var2 = (C10386v0) next.mo35390b();
                        C10202j.m34174a((Object) v0Var, "subParameter");
                        boolean z2 = m31025a((C10382u) aVar2, v0Var) instanceof C9713j.C9716c;
                        C10202j.m34174a((Object) v0Var2, "superParameter");
                        if (z2 != (m31025a(uVar, v0Var2) instanceof C9713j.C9716c)) {
                            return true;
                        }
                    }
                } else {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
            }
            return false;
        }

        public /* synthetic */ C9626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C9713j m31025a(C10382u uVar, C10386v0 v0Var) {
            if (C9734s.m31398b(uVar) || m31026a(uVar)) {
                C11824b0 type = v0Var.getType();
                C10202j.m34174a((Object) type, "valueParameterDescriptor.type");
                return C9734s.m31396a(C11924a.m39421e(type));
            }
            C11824b0 type2 = v0Var.getType();
            C10202j.m34174a((Object) type2, "valueParameterDescriptor.type");
            return C9734s.m31396a(type2);
        }

        /* renamed from: a */
        private final boolean m31026a(C10382u uVar) {
            if (uVar.mo35407f().size() != 1) {
                return false;
            }
            C10359m b = uVar.mo33762b();
            C10342e eVar = null;
            if (!(b instanceof C10342e)) {
                b = null;
            }
            C10342e eVar2 = (C10342e) b;
            if (eVar2 != null) {
                List<C10386v0> f = uVar.mo35407f();
                C10202j.m34174a((Object) f, "f.valueParameters");
                Object i = C10539w.m35809i(f);
                C10202j.m34174a(i, "f.valueParameters.single()");
                C10349h b2 = ((C10386v0) i).getType().mo35227v0().mo33781b();
                if (b2 instanceof C10342e) {
                    eVar = b2;
                }
                C10342e eVar3 = eVar;
                if (eVar3 == null || !C9333g.m30188d(eVar2) || !C10202j.m34176a((Object) C10071a.m33895c(eVar2), (Object) C10071a.m33895c(eVar3))) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    private final boolean m31022b(C10230a aVar, C10230a aVar2, C10342e eVar) {
        if ((aVar instanceof C10238b) && (aVar2 instanceof C10382u) && !C9333g.m30184c((C10359m) aVar2)) {
            C9541d dVar = C9541d.f26377g;
            C10382u uVar = (C10382u) aVar2;
            C9939f name = uVar.getName();
            C10202j.m34174a((Object) name, "subDescriptor.name");
            if (!dVar.mo34077a(name)) {
                C9510c cVar = C9510c.f26366f;
                C9939f name2 = uVar.getName();
                C10202j.m34174a((Object) name2, "subDescriptor.name");
                if (!cVar.mo34017b(name2)) {
                    return false;
                }
            }
            C10238b e = C9636w.m31086e((C10238b) aVar);
            boolean j0 = uVar.mo35514j0();
            boolean z = aVar instanceof C10382u;
            C10382u uVar2 = (C10382u) (!z ? null : aVar);
            if ((uVar2 == null || j0 != uVar2.mo35514j0()) && (e == null || !uVar.mo35514j0())) {
                return true;
            }
            if ((eVar instanceof C9668d) && uVar.mo35500W() == null && e != null && !C9636w.m31079a(eVar, (C10230a) e)) {
                if ((e instanceof C10382u) && z && C9541d.m30871a((C10382u) e) != null) {
                    String a = C9734s.m31395a(uVar, false, false, 2, (Object) null);
                    C10382u a2 = ((C10382u) aVar).mo35404a();
                    C10202j.m34174a((Object) a2, "superDescriptor.original");
                    if (C10202j.m34176a((Object) a, (Object) C9734s.m31395a(a2, false, false, 2, (Object) null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C10000d.C10002b mo34171a(C10230a aVar, C10230a aVar2, C10342e eVar) {
        C10202j.m34178b(aVar, "superDescriptor");
        C10202j.m34178b(aVar2, "subDescriptor");
        if (m31022b(aVar, aVar2, eVar)) {
            return C10000d.C10002b.INCOMPATIBLE;
        }
        if (f26510a.mo34179a(aVar, aVar2)) {
            return C10000d.C10002b.INCOMPATIBLE;
        }
        return C10000d.C10002b.UNKNOWN;
    }

    /* renamed from: a */
    public C10000d.C10001a mo34170a() {
        return C10000d.C10001a.CONFLICTS_ONLY;
    }
}
