package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10303h0;

/* renamed from: kotlin.h0.u.e.k0.k.p */
/* compiled from: DescriptorSubstitutor */
public class C11945p {
    /* renamed from: a */
    public static C11978z0 m39492a(List<C10375s0> list, C11972x0 x0Var, C10359m mVar, List<C10375s0> list2) {
        if (list == null) {
            m39494a(0);
            throw null;
        } else if (x0Var == null) {
            m39494a(1);
            throw null;
        } else if (mVar == null) {
            m39494a(2);
            throw null;
        } else if (list2 != null) {
            C11978z0 a = m39493a(list, x0Var, mVar, list2, (boolean[]) null);
            if (a == null) {
                throw new AssertionError("Substitution failed");
            } else if (a != null) {
                return a;
            } else {
                m39494a(4);
                throw null;
            }
        } else {
            m39494a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m39494a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: a */
    public static C11978z0 m39493a(List<C10375s0> list, C11972x0 x0Var, C10359m mVar, List<C10375s0> list2, boolean[] zArr) {
        C11972x0 x0Var2 = x0Var;
        List<C10375s0> list3 = list2;
        if (list == null) {
            m39494a(5);
            throw null;
        } else if (x0Var2 == null) {
            m39494a(6);
            throw null;
        } else if (mVar == null) {
            m39494a(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (C10375s0 next : list) {
                C10303h0 a = C10303h0.m34534a(mVar, next.getAnnotations(), next.mo35447z(), next.mo35439G(), next.getName(), i, C10362n0.f28175a);
                hashMap.put(next.mo33766h(), new C11970w0(a.mo35445o()));
                hashMap2.put(next, a);
                list3.add(a);
                i++;
            }
            C11978z0 a2 = C11978z0.m39664a(x0Var2, (C11972x0) C11955t0.m39533a((Map<C11953s0, ? extends C11965u0>) hashMap));
            for (C10375s0 next2 : list) {
                C10303h0 h0Var = (C10303h0) hashMap2.get(next2);
                for (C11824b0 next3 : next2.getUpperBounds()) {
                    C11824b0 b = a2.mo38620b(next3, C11838f1.IN_VARIANCE);
                    if (b == null) {
                        return null;
                    }
                    if (!(b == next3 || zArr == null)) {
                        zArr[0] = true;
                    }
                    h0Var.mo35480b(b);
                }
                h0Var.mo35479B();
            }
            return a2;
        } else {
            m39494a(8);
            throw null;
        }
    }
}
