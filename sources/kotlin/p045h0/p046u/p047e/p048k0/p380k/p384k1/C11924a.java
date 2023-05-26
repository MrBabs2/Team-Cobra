package kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11940n0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11976y0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11872i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.k1.a */
/* compiled from: TypeUtils.kt */
public final class C11924a {
    /* renamed from: a */
    public static final boolean m39416a(C11824b0 b0Var, C11824b0 b0Var2) {
        C10202j.m34178b(b0Var, "$this$isSubtypeOf");
        C10202j.m34178b(b0Var2, "superType");
        return C11868g.f31579a.mo38536b(b0Var, b0Var2);
    }

    /* renamed from: b */
    public static final C9333g m39418b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$builtIns");
        C9333g l = b0Var.mo35227v0().mo35232l();
        C10202j.m34174a((Object) l, "constructor.builtIns");
        return l;
    }

    /* renamed from: c */
    public static final boolean m39419c(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isTypeParameter");
        return C11821a1.m38917h(b0Var);
    }

    /* renamed from: d */
    public static final C11824b0 m39420d(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$makeNotNullable");
        C11824b0 i = C11821a1.m38918i(b0Var);
        C10202j.m34174a((Object) i, "TypeUtils.makeNotNullable(this)");
        return i;
    }

    /* renamed from: e */
    public static final C11824b0 m39421e(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$makeNullable");
        C11824b0 j = C11821a1.m38919j(b0Var);
        C10202j.m34174a((Object) j, "TypeUtils.makeNullable(this)");
        return j;
    }

    /* renamed from: f */
    public static final C11824b0 m39422f(C11824b0 b0Var) {
        C11901j0 j0Var;
        C10202j.m34178b(b0Var, "$this$replaceArgumentsWithStarProjections");
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 instanceof C11966v) {
            C11966v vVar = (C11966v) x0;
            C11901j0 z0 = vVar.mo38609z0();
            if (!z0.mo35227v0().getParameters().isEmpty() && z0.mo35227v0().mo33781b() != null) {
                List<C10375s0> parameters = z0.mo35227v0().getParameters();
                C10202j.m34174a((Object) parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
                for (C10375s0 n0Var : parameters) {
                    arrayList.add(new C11940n0(n0Var));
                }
                z0 = C11976y0.m39651a(z0, (List) arrayList, (C10249g) null, 2, (Object) null);
            }
            C11901j0 A0 = vVar.mo38607A0();
            if (!A0.mo35227v0().getParameters().isEmpty() && A0.mo35227v0().mo33781b() != null) {
                List<C10375s0> parameters2 = A0.mo35227v0().getParameters();
                C10202j.m34174a((Object) parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C10531p.m35750a(parameters2, 10));
                for (C10375s0 n0Var2 : parameters2) {
                    arrayList2.add(new C11940n0(n0Var2));
                }
                A0 = C11976y0.m39651a(A0, (List) arrayList2, (C10249g) null, 2, (Object) null);
            }
            j0Var = C11827c0.m38946a(z0, A0);
        } else if (x0 instanceof C11901j0) {
            C11901j0 j0Var2 = (C11901j0) x0;
            boolean isEmpty = j0Var2.mo35227v0().getParameters().isEmpty();
            j0Var = j0Var2;
            if (!isEmpty) {
                C10349h b = j0Var2.mo35227v0().mo33781b();
                j0Var = j0Var2;
                if (b != null) {
                    List<C10375s0> parameters3 = j0Var2.mo35227v0().getParameters();
                    C10202j.m34174a((Object) parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C10531p.m35750a(parameters3, 10));
                    for (C10375s0 n0Var3 : parameters3) {
                        arrayList3.add(new C11940n0(n0Var3));
                    }
                    j0Var = C11976y0.m39651a(j0Var2, (List) arrayList3, (C10249g) null, 2, (Object) null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C11828c1.m38952a(j0Var, x0);
    }

    /* renamed from: a */
    public static final C11824b0 m39411a(C11824b0 b0Var, C10249g gVar) {
        C10202j.m34178b(b0Var, "$this$replaceAnnotations");
        C10202j.m34178b(gVar, "newAnnotations");
        if (!b0Var.getAnnotations().isEmpty() || !gVar.isEmpty()) {
            return b0Var.mo38439x0().mo34006a(gVar);
        }
        return b0Var;
    }

    /* renamed from: a */
    public static final C11965u0 m39414a(C11824b0 b0Var, C11838f1 f1Var, C10375s0 s0Var) {
        C10202j.m34178b(b0Var, "type");
        C10202j.m34178b(f1Var, "projectionKind");
        if ((s0Var != null ? s0Var.mo35439G() : null) == f1Var) {
            f1Var = C11838f1.INVARIANT;
        }
        return new C11970w0(f1Var, b0Var);
    }

    /* renamed from: a */
    public static final C11965u0 m39413a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$asTypeProjection");
        return new C11970w0(b0Var);
    }

    /* renamed from: a */
    public static final boolean m39415a(C11824b0 b0Var, C9113l<? super C11834e1, Boolean> lVar) {
        C10202j.m34178b(b0Var, "$this$contains");
        C10202j.m34178b(lVar, "predicate");
        return C11821a1.m38908a(b0Var, (C9113l<C11834e1, Boolean>) lVar);
    }

    /* renamed from: a */
    public static final boolean m39417a(C11834e1 e1Var) {
        C10202j.m34178b(e1Var, "$this$canHaveUndefinedNullability");
        e1Var.mo35227v0();
        return (e1Var.mo35227v0().mo33781b() instanceof C10375s0) || (e1Var instanceof C11872i);
    }

    /* renamed from: a */
    public static final C11824b0 m39412a(C10375s0 s0Var) {
        T t;
        C10202j.m34178b(s0Var, "$this$representativeUpperBound");
        List<C11824b0> upperBounds = s0Var.getUpperBounds();
        C10202j.m34174a((Object) upperBounds, "upperBounds");
        boolean z = !upperBounds.isEmpty();
        if (!C10485x.f28360a || z) {
            List<C11824b0> upperBounds2 = s0Var.getUpperBounds();
            C10202j.m34174a((Object) upperBounds2, "upperBounds");
            Iterator<T> it = upperBounds2.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T b = ((C11824b0) next).mo35227v0().mo33781b();
                if (b instanceof C10342e) {
                    t = b;
                }
                C10342e eVar = (C10342e) t;
                boolean z2 = false;
                if (!(eVar == null || eVar.mo33763g() == C10345f.INTERFACE || eVar.mo33763g() == C10345f.ANNOTATION_CLASS)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    t = next;
                    break;
                }
            }
            C11824b0 b0Var = (C11824b0) t;
            if (b0Var != null) {
                return b0Var;
            }
            List<C11824b0> upperBounds3 = s0Var.getUpperBounds();
            C10202j.m34174a((Object) upperBounds3, "upperBounds");
            Object e = C10539w.m35799e(upperBounds3);
            C10202j.m34174a(e, "upperBounds.first()");
            return (C11824b0) e;
        }
        throw new AssertionError("Upper bounds should not be empty: " + s0Var);
    }
}
