package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9328c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.p387m.C12019a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10374s;

/* renamed from: kotlin.h0.u.e.k0.c.a.r */
/* compiled from: JvmAbi */
public final class C9631r {

    /* renamed from: a */
    public static final C9934b f26514a = new C9934b("kotlin.jvm.JvmField");

    static {
        C9933a.m33260a(new C9934b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    /* renamed from: a */
    public static String m31047a(String str) {
        if (str != null) {
            if (!m31056e(str)) {
                str = "get" + C12019a.m39713a(str);
            }
            if (str != null) {
                return str;
            }
            m31048a(7);
            throw null;
        }
        m31048a(6);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m31048a(int i) {
        String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "propertyName";
                break;
        }
        if (i == 1) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedProperty";
        } else if (i == 3) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedTypeAlias";
        } else if (i == 7) {
            objArr[1] = "getterName";
        } else if (i != 9) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        } else {
            objArr[1] = "setterName";
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = "getSyntheticMethodNameForAnnotatedTypeAlias";
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = "getterName";
                break;
            case 8:
                objArr[2] = "setterName";
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = "getSyntheticMethodNameForAnnotatedProperty";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 3 || i == 7 || i == 9) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static boolean m31053b(String str) {
        if (str != null) {
            return str.startsWith("get") || str.startsWith("is");
        }
        m31048a(4);
        throw null;
    }

    /* renamed from: c */
    public static boolean m31054c(String str) {
        if (str != null) {
            return str.startsWith("set");
        }
        m31048a(5);
        throw null;
    }

    /* renamed from: d */
    public static String m31055d(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(m31056e(str) ? str.substring(2) : C12019a.m39713a(str));
            String sb2 = sb.toString();
            if (sb2 != null) {
                return sb2;
            }
            m31048a(9);
            throw null;
        }
        m31048a(8);
        throw null;
    }

    /* renamed from: e */
    public static boolean m31056e(String str) {
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if ('a' > charAt || charAt > 'z') {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m31051a(C10352i0 i0Var) {
        if (i0Var == null) {
            m31048a(10);
            throw null;
        } else if (i0Var.mo35423g() == C10238b.C10239a.FAKE_OVERRIDE) {
            return false;
        } else {
            if (m31052a(i0Var.mo33762b())) {
                return true;
            }
            if (!C9999c.m33688m(i0Var.mo33762b()) || !m31049a((C10238b) i0Var)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m31052a(C10359m mVar) {
        if (mVar != null) {
            return C9999c.m33688m(mVar) && C9999c.m33687l(mVar.mo33762b()) && !m31050a((C10342e) mVar);
        }
        m31048a(11);
        throw null;
    }

    /* renamed from: a */
    public static boolean m31050a(C10342e eVar) {
        if (eVar != null) {
            return C9328c.f25898b.mo33690a(eVar);
        }
        m31048a(12);
        throw null;
    }

    /* renamed from: a */
    public static boolean m31049a(C10238b bVar) {
        C10374s f0;
        if (bVar == null) {
            m31048a(13);
            throw null;
        } else if (!(bVar instanceof C10352i0) || (f0 = ((C10352i0) bVar).mo35583f0()) == null || !f0.getAnnotations().mo33886b(f26514a)) {
            return bVar.getAnnotations().mo33886b(f26514a);
        } else {
            return true;
        }
    }
}
