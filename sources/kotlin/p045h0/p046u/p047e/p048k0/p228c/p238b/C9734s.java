package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9541d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9636w;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9713j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9118q;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.c.b.s */
/* compiled from: methodSignatureMapping.kt */
public final class C9734s {
    /* renamed from: a */
    public static final String m31394a(C10382u uVar, boolean z, boolean z2) {
        String str;
        C10202j.m34178b(uVar, "$this$computeJvmDescriptor");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (uVar instanceof C10357l) {
                str = "<init>";
            } else {
                str = uVar.getName().mo35021a();
                C10202j.m34174a((Object) str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        for (C10386v0 next : uVar.mo35407f()) {
            C10202j.m34174a((Object) next, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            C11824b0 type = next.getType();
            C10202j.m34174a((Object) type, "parameter.type");
            m31397a(sb, type);
        }
        sb.append(")");
        if (z) {
            if (C9745z.m31444a((C10230a) uVar)) {
                sb.append("V");
            } else {
                C11824b0 returnType = uVar.getReturnType();
                if (returnType != null) {
                    C10202j.m34174a((Object) returnType, "returnType!!");
                    m31397a(sb, returnType);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final boolean m31398b(C10230a aVar) {
        C10382u a;
        C10202j.m34178b(aVar, "f");
        if (!(aVar instanceof C10382u)) {
            return false;
        }
        C10382u uVar = (C10382u) aVar;
        if (uVar.mo35407f().size() != 1 || C9636w.m31088g((C10238b) aVar) || (!C10202j.m34176a((Object) uVar.getName().mo35021a(), (Object) "remove"))) {
            return false;
        }
        C10382u a2 = uVar.mo35404a();
        C10202j.m34174a((Object) a2, "f.original");
        List<C10386v0> f = a2.mo35407f();
        C10202j.m34174a((Object) f, "f.original.valueParameters");
        Object i = C10539w.m35809i(f);
        C10202j.m34174a(i, "f.original.valueParameters.single()");
        C11824b0 type = ((C10386v0) i).getType();
        C10202j.m34174a((Object) type, "f.original.valueParameters.single().type");
        C9713j a3 = m31396a(type);
        C10081d dVar = null;
        if (!(a3 instanceof C9713j.C9716c)) {
            a3 = null;
        }
        C9713j.C9716c cVar = (C9713j.C9716c) a3;
        if (cVar != null) {
            dVar = cVar.mo34304a();
        }
        if (dVar != C10081d.INT || (a = C9541d.m30871a(uVar)) == null) {
            return false;
        }
        C10382u a4 = a.mo35404a();
        C10202j.m34174a((Object) a4, "overridden.original");
        List<C10386v0> f2 = a4.mo35407f();
        C10202j.m34174a((Object) f2, "overridden.original.valueParameters");
        Object i2 = C10539w.m35809i(f2);
        C10202j.m34174a(i2, "overridden.original.valueParameters.single()");
        C11824b0 type2 = ((C10386v0) i2).getType();
        C10202j.m34174a((Object) type2, "overridden.original.valueParameters.single().type");
        C9713j a5 = m31396a(type2);
        C10359m b = a.mo33762b();
        C10202j.m34174a((Object) b, "overridden.containingDeclaration");
        if (!C10202j.m34176a((Object) C10071a.m33896d(b), (Object) C9333g.f25907k.f25934Q.mo35003g()) || !(a5 instanceof C9713j.C9715b) || !C10202j.m34176a((Object) ((C9713j.C9715b) a5).mo34303a(), (Object) "java/lang/Object")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ String m31395a(C10382u uVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m31394a(uVar, z, z2);
    }

    /* renamed from: a */
    public static final String m31393a(C10342e eVar) {
        C10202j.m34178b(eVar, "$this$internalName");
        C9367c cVar = C9367c.f26064m;
        C9935c g = C10071a.m33895c(eVar).mo35003g();
        C10202j.m34174a((Object) g, "fqNameSafe.toUnsafe()");
        C9933a c = cVar.mo33810c(g);
        if (c == null) {
            return C9745z.m31440a(eVar, (C9739v) null, false, 2, (Object) null);
        }
        C10080c a = C10080c.m33922a(c);
        C10202j.m34174a((Object) a, "JvmClassName.byClassId(it)");
        String b = a.mo35282b();
        C10202j.m34174a((Object) b, "JvmClassName.byClassId(it).internalName");
        return b;
    }

    /* renamed from: a */
    private static final void m31397a(StringBuilder sb, C11824b0 b0Var) {
        sb.append(m31396a(b0Var));
    }

    /* renamed from: a */
    public static final C9713j m31396a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$mapToJvmType");
        return (C9713j) C9745z.m31438a(b0Var, C9718l.f26698a, C9742x.f26710k, C9741w.f26708a, (C9711h) null, (C9118q) null, false, 32, (Object) null);
    }

    /* renamed from: a */
    public static final String m31392a(C10230a aVar) {
        C10202j.m34178b(aVar, "$this$computeJvmSignature");
        C9737u uVar = C9737u.f26706a;
        if (C9999c.m33693r(aVar)) {
            return null;
        }
        C10359m b = aVar.mo33762b();
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar != null) {
            C9939f name = eVar.getName();
            C10202j.m34174a((Object) name, "classDescriptor.name");
            if (name.mo35024e()) {
                return null;
            }
            C10230a a = aVar.mo35404a();
            if (!(a instanceof C10360m0)) {
                a = null;
            }
            C10360m0 m0Var = (C10360m0) a;
            if (m0Var != null) {
                return uVar.mo34337a(eVar, m31395a(m0Var, false, false, 3, (Object) null));
            }
        }
        return null;
    }
}
