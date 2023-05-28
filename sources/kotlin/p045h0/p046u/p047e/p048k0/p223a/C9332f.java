package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10481t;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9349a;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9352b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10065w;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p262y.C10525m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10255j;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.h0.u.e.k0.a.f */
/* compiled from: functionTypes.kt */
public final class C9332f {
    /* renamed from: a */
    public static final C9352b.C9356d m30150a(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$getFunctionalClassKind");
        if ((mVar instanceof C10342e) && C9333g.m30193e(mVar)) {
            return m30149a(C10071a.m33896d(mVar));
        }
        return null;
    }

    /* renamed from: b */
    public static final C11824b0 m30154b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getReceiverTypeFromFunctionType");
        boolean f = m30158f(b0Var);
        if (C10485x.f28360a && !f) {
            throw new AssertionError("Not a function type: " + b0Var);
        } else if (m30161i(b0Var)) {
            return ((C11965u0) C10539w.m35799e(b0Var.mo35226u0())).getType();
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static final C11824b0 m30155c(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getReturnTypeFromFunctionType");
        boolean f = m30158f(b0Var);
        if (!C10485x.f28360a || f) {
            C11824b0 type = ((C11965u0) C10539w.m35805g(b0Var.mo35226u0())).getType();
            C10202j.m34174a((Object) type, "arguments.last().type");
            return type;
        }
        throw new AssertionError("Not a function type: " + b0Var);
    }

    /* renamed from: d */
    public static final List<C11965u0> m30156d(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getValueParameterTypesFromFunctionType");
        boolean f = m30158f(b0Var);
        if (!C10485x.f28360a || f) {
            List<C11965u0> u0 = b0Var.mo35226u0();
            int e = m30157e(b0Var);
            boolean z = true;
            int size = u0.size() - 1;
            if (e > size) {
                z = false;
            }
            if (!C10485x.f28360a || z) {
                return u0.subList(e, size);
            }
            throw new AssertionError("Not an exact function type: " + b0Var);
        }
        throw new AssertionError("Not a function type: " + b0Var);
    }

    /* renamed from: e */
    public static final boolean m30157e(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isBuiltinExtensionFunctionalType");
        return m30158f(b0Var) && m30161i(b0Var);
    }

    /* renamed from: f */
    public static final boolean m30158f(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isBuiltinFunctionalType");
        C10349h b = b0Var.mo35227v0().mo33781b();
        C9352b.C9356d a = b != null ? m30150a((C10359m) b) : null;
        return a == C9352b.C9356d.Function || a == C9352b.C9356d.SuspendFunction;
    }

    /* renamed from: g */
    public static final boolean m30159g(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isFunctionType");
        C10349h b = b0Var.mo35227v0().mo33781b();
        return (b != null ? m30150a((C10359m) b) : null) == C9352b.C9356d.Function;
    }

    /* renamed from: h */
    public static final boolean m30160h(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isSuspendFunctionType");
        C10349h b = b0Var.mo35227v0().mo33781b();
        return (b != null ? m30150a((C10359m) b) : null) == C9352b.C9356d.SuspendFunction;
    }

    /* renamed from: i */
    private static final boolean m30161i(C11824b0 b0Var) {
        C10249g annotations = b0Var.getAnnotations();
        C9934b bVar = C9333g.f25907k.f25977w;
        C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return annotations.mo33885a(bVar) != null;
    }

    /* renamed from: a */
    private static final C9352b.C9356d m30149a(C9935c cVar) {
        if (!cVar.mo35010c() || cVar.mo35008b()) {
            return null;
        }
        C9349a.C9350a aVar = C9349a.f26020c;
        String a = cVar.mo35014f().mo35021a();
        C10202j.m34174a((Object) a, "shortName().asString()");
        C9934b c = cVar.mo35016h().mo34998c();
        C10202j.m34174a((Object) c, "toSafe().parent()");
        return aVar.mo33749a(a, c);
    }

    /* renamed from: a */
    public static final C9939f m30151a(C11824b0 b0Var) {
        String str;
        C10202j.m34178b(b0Var, "$this$extractParameterNameFromFunctionTypeArgument");
        C10249g annotations = b0Var.getAnnotations();
        C9934b bVar = C9333g.f25907k.f25978x;
        C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
        C10243c a = annotations.mo33885a(bVar);
        if (a != null) {
            Object k = C10539w.m35812k(a.mo33921a().values());
            if (!(k instanceof C10065w)) {
                k = null;
            }
            C10065w wVar = (C10065w) k;
            if (!(wVar == null || (str = (String) wVar.mo35244a()) == null)) {
                if (!C9939f.m33303c(str)) {
                    str = null;
                }
                if (str != null) {
                    return C9939f.m33302b(str);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final List<C11965u0> m30148a(C11824b0 b0Var, List<? extends C11824b0> list, List<C9939f> list2, C11824b0 b0Var2, C9333g gVar) {
        C9939f fVar;
        C10202j.m34178b(list, "parameterTypes");
        C10202j.m34178b(b0Var2, "returnType");
        C10202j.m34178b(gVar, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + (b0Var != null ? 1 : 0) + 1);
        C12141a.m40133a(arrayList, b0Var != null ? C11924a.m39413a(b0Var) : null);
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C11824b0 b0Var3 = (C11824b0) next;
                if (list2 == null || (fVar = list2.get(i)) == null || fVar.mo35024e()) {
                    fVar = null;
                }
                if (fVar != null) {
                    C9934b bVar = C9333g.f25907k.f25978x;
                    C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
                    C9939f b = C9939f.m33302b("name");
                    String a = fVar.mo35021a();
                    C10202j.m34174a((Object) a, "name.asString()");
                    b0Var3 = C11924a.m39411a(b0Var3, C10249g.f27910c.mo35430a(C10539w.m35794d(b0Var3.getAnnotations(), new C10255j(gVar, bVar, C10515i0.m35584a(C10481t.m35502a(b, new C10065w(a)))))));
                }
                arrayList.add(C11924a.m39413a(b0Var3));
                i = i2;
            } else {
                C10525m.m35693c();
                throw null;
            }
        }
        arrayList.add(C11924a.m39413a(b0Var2));
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ C11901j0 m30153a(C9333g gVar, C10249g gVar2, C11824b0 b0Var, List list, List list2, C11824b0 b0Var2, boolean z, int i, Object obj) {
        return m30152a(gVar, gVar2, b0Var, list, list2, b0Var2, (i & 64) != 0 ? false : z);
    }

    /* renamed from: a */
    public static final C11901j0 m30152a(C9333g gVar, C10249g gVar2, C11824b0 b0Var, List<? extends C11824b0> list, List<C9939f> list2, C11824b0 b0Var2, boolean z) {
        C10202j.m34178b(gVar, "builtIns");
        C10202j.m34178b(gVar2, "annotations");
        C10202j.m34178b(list, "parameterTypes");
        C10202j.m34178b(b0Var2, "returnType");
        List<C11965u0> a = m30148a(b0Var, list, list2, b0Var2, gVar);
        int size = list.size();
        if (b0Var != null) {
            size++;
        }
        C10342e b = z ? gVar.mo33706b(size) : gVar.mo33700a(size);
        C10202j.m34174a((Object) b, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (b0Var != null) {
            C9934b bVar = C9333g.f25907k.f25977w;
            C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (gVar2.mo33885a(bVar) == null) {
                C10249g.C10250a aVar = C10249g.f27910c;
                C9934b bVar2 = C9333g.f25907k.f25977w;
                C10202j.m34174a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                gVar2 = aVar.mo35430a(C10539w.m35794d(gVar2, new C10255j(gVar, bVar2, C10518j0.m35601a())));
            }
        }
        return C11827c0.m38950a(gVar2, b, (List<? extends C11965u0>) a);
    }
}
