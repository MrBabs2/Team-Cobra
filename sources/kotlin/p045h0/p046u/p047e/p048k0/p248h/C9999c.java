package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9348m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9941h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10343e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10365o0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10367p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10369q;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;

/* renamed from: kotlin.h0.u.e.k0.h.c */
/* compiled from: DescriptorUtils */
public class C9999c {

    /* renamed from: a */
    public static final C9939f f27577a = C9939f.m33302b("values");

    /* renamed from: b */
    public static final C9939f f27578b = C9939f.m33302b("valueOf");

    /* renamed from: c */
    public static final C9934b f27579c;

    /* renamed from: d */
    public static final C9934b f27580d;

    /* renamed from: e */
    public static final C9934b f27581e = f27580d.mo34995a(C9939f.m33302b("Continuation"));

    /* renamed from: f */
    public static final C9934b f27582f = f27579c.mo34995a(C9939f.m33302b("Continuation"));

    /* renamed from: g */
    public static final C9934b f27583g = new C9934b("kotlin.Result");

    static {
        C9934b bVar = new C9934b("kotlin.coroutines");
        f27579c = bVar;
        C9934b a = bVar.mo34995a(C9939f.m33302b("experimental"));
        f27580d = a;
        a.mo34995a(C9939f.m33302b("intrinsics"));
        new C9934b("kotlin.jvm.JvmName");
    }

    /* renamed from: a */
    private static /* synthetic */ void m33666a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 53:
            case 54:
            case 55:
            case 57:
            case 74:
            case 87:
            case 89:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 60:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = "other";
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 50:
            case 61:
            case 62:
            case 63:
            case 70:
            case 71:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 51:
                objArr[0] = "innerClassName";
                break;
            case 52:
                objArr[0] = "location";
                break;
            case 59:
                objArr[0] = "variable";
                break;
            case 64:
                objArr[0] = "f";
                break;
            case 66:
                objArr[0] = "current";
                break;
            case 67:
                objArr[0] = "result";
                break;
            case 68:
                objArr[0] = "memberDescriptor";
                break;
            case 72:
            case 73:
                objArr[0] = "annotated";
                break;
            case 77:
            case 79:
            case 82:
            case 84:
                objArr[0] = "scope";
                break;
            case 80:
            case 83:
            case 85:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 20:
                objArr[1] = "getContainingModule";
                break;
            case 38:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 40:
            case 41:
                objArr[1] = "getSuperClassType";
                break;
            case 45:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 47:
            case 48:
            case 49:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 56:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 58:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 75:
            case 76:
                objArr[1] = "getContainingSourceFile";
                break;
            case 78:
                objArr[1] = "getAllDescriptors";
                break;
            case 81:
                objArr[1] = "getFunctionByName";
                break;
            case 86:
                objArr[1] = "getPropertyByName";
                break;
            case 88:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = "getContainingModule";
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 39:
                objArr[2] = "getSuperClassType";
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 46:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 50:
            case 51:
            case 52:
                objArr[2] = "getInnerClassByName";
                break;
            case 53:
                objArr[2] = "isStaticNestedClass";
                break;
            case 54:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 55:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 57:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 59:
            case 60:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 61:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 62:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 63:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 64:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 66:
            case 67:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 70:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 71:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 72:
                objArr[2] = "getJvmName";
                break;
            case 73:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 74:
                objArr[2] = "getContainingSourceFile";
                break;
            case 77:
                objArr[2] = "getAllDescriptors";
                break;
            case 79:
            case 80:
                objArr[2] = "getFunctionByName";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 84:
            case 85:
                objArr[2] = "getPropertyByName";
                break;
            case 87:
                objArr[2] = "getDirectMember";
                break;
            case 89:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: a */
    public static boolean m33671a(C10359m mVar, C10359m mVar2) {
        if (mVar == null) {
            m33666a(14);
            throw null;
        } else if (mVar2 != null) {
            return m33665a(mVar).equals(m33665a(mVar2));
        } else {
            m33666a(15);
            throw null;
        }
    }

    /* renamed from: b */
    public static C10393y m33674b(C11824b0 b0Var) {
        if (b0Var != null) {
            C10349h b = b0Var.mo35227v0().mo33781b();
            if (b == null) {
                return null;
            }
            return m33675b((C10359m) b);
        }
        m33666a(18);
        throw null;
    }

    /* renamed from: c */
    public static C10365o0 m33678c(C10359m mVar) {
        if (mVar != null) {
            if (mVar instanceof C10356k0) {
                mVar = ((C10356k0) mVar).mo35574l0();
            }
            if (mVar instanceof C10367p) {
                C10365o0 a = ((C10367p) mVar).mo33773p().mo33654a();
                if (a != null) {
                    return a;
                }
                m33666a(75);
                throw null;
            }
            C10365o0 o0Var = C10365o0.f28176a;
            if (o0Var != null) {
                return o0Var;
            }
            m33666a(76);
            throw null;
        }
        m33666a(74);
        throw null;
    }

    /* renamed from: d */
    public static C10358l0 m33679d(C10359m mVar) {
        if (mVar == null) {
            m33666a(0);
            throw null;
        } else if (mVar instanceof C10342e) {
            return ((C10342e) mVar).mo35452t0();
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static C9935c m33680e(C10359m mVar) {
        if (mVar != null) {
            C9934b g = m33682g(mVar);
            return g != null ? g.mo35003g() : m33683h(mVar);
        }
        m33666a(2);
        throw null;
    }

    /* renamed from: f */
    public static C9934b m33681f(C10359m mVar) {
        if (mVar != null) {
            C9934b g = m33682g(mVar);
            if (g == null) {
                g = m33683h(mVar).mo35016h();
            }
            if (g != null) {
                return g;
            }
            m33666a(4);
            throw null;
        }
        m33666a(3);
        throw null;
    }

    /* renamed from: g */
    private static C9934b m33682g(C10359m mVar) {
        if (mVar == null) {
            m33666a(5);
            throw null;
        } else if ((mVar instanceof C10393y) || C11958u.m39553a(mVar)) {
            return C9934b.f27424c;
        } else {
            if (mVar instanceof C10343e0) {
                return ((C10343e0) mVar).mo35540c();
            }
            if (mVar instanceof C10240b0) {
                return ((C10240b0) mVar).mo35425c();
            }
            return null;
        }
    }

    /* renamed from: h */
    private static C9935c m33683h(C10359m mVar) {
        if (mVar != null) {
            C9935c a = m33680e(mVar.mo33762b()).mo35007a(mVar.getName());
            if (a != null) {
                return a;
            }
            m33666a(7);
            throw null;
        }
        m33666a(6);
        throw null;
    }

    /* renamed from: i */
    public static boolean m33684i(C10359m mVar) {
        return m33670a(mVar, C10345f.ANNOTATION_CLASS);
    }

    /* renamed from: j */
    public static boolean m33685j(C10359m mVar) {
        if (mVar != null) {
            return m33686k(mVar) && mVar.getName().equals(C9941h.f27438a);
        }
        m33666a(32);
        throw null;
    }

    /* renamed from: k */
    public static boolean m33686k(C10359m mVar) {
        return m33670a(mVar, C10345f.CLASS);
    }

    /* renamed from: l */
    public static boolean m33687l(C10359m mVar) {
        return m33686k(mVar) || m33690o(mVar);
    }

    /* renamed from: m */
    public static boolean m33688m(C10359m mVar) {
        return m33670a(mVar, C10345f.OBJECT) && ((C10342e) mVar).mo33779v();
    }

    /* renamed from: n */
    public static boolean m33689n(C10359m mVar) {
        return (mVar instanceof C10369q) && ((C10369q) mVar).getVisibility() == C10397z0.f28193f;
    }

    /* renamed from: o */
    public static boolean m33690o(C10359m mVar) {
        return m33670a(mVar, C10345f.ENUM_CLASS);
    }

    /* renamed from: p */
    public static boolean m33691p(C10359m mVar) {
        if (mVar != null) {
            return m33670a(mVar, C10345f.ENUM_ENTRY);
        }
        m33666a(34);
        throw null;
    }

    /* renamed from: q */
    public static boolean m33692q(C10359m mVar) {
        return m33670a(mVar, C10345f.INTERFACE);
    }

    /* renamed from: r */
    public static boolean m33693r(C10359m mVar) {
        if (mVar != null) {
            while (mVar != null) {
                if (m33685j(mVar) || m33689n(mVar)) {
                    return true;
                }
                mVar = mVar.mo33762b();
            }
            return false;
        }
        m33666a(1);
        throw null;
    }

    /* renamed from: s */
    public static boolean m33694s(C10359m mVar) {
        return m33670a(mVar, C10345f.CLASS) && ((C10342e) mVar).mo33767i() == C10388w.SEALED;
    }

    /* renamed from: t */
    public static boolean m33695t(C10359m mVar) {
        return mVar != null && (mVar.mo33762b() instanceof C10240b0);
    }

    /* renamed from: a */
    public static <D extends C10359m> D m33662a(C10359m mVar, Class<D> cls) {
        if (cls != null) {
            return m33663a(mVar, cls, true);
        }
        m33666a(16);
        throw null;
    }

    /* renamed from: b */
    public static C10393y m33675b(C10359m mVar) {
        if (mVar != null) {
            while (mVar != null) {
                if (mVar instanceof C10393y) {
                    return (C10393y) mVar;
                }
                if (mVar instanceof C10343e0) {
                    return ((C10343e0) mVar).mo35543i0();
                }
                mVar = mVar.mo33762b();
            }
            return null;
        }
        m33666a(21);
        throw null;
    }

    /* renamed from: a */
    public static <D extends C10359m> D m33663a(D d, Class<D> cls, boolean z) {
        if (cls == null) {
            m33666a(17);
            throw null;
        } else if (d == null) {
            return null;
        } else {
            if (z) {
                d = d.mo33762b();
            }
            while (d != null) {
                if (cls.isInstance(d)) {
                    return d;
                }
                d = d.mo33762b();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C10393y m33665a(C10359m mVar) {
        if (mVar != null) {
            C10393y b = m33675b(mVar);
            if (b != null) {
                return b;
            }
            m33666a(20);
            throw null;
        }
        m33666a(19);
        throw null;
    }

    /* renamed from: b */
    public static boolean m33677b(C10342e eVar, C10342e eVar2) {
        if (eVar == null) {
            m33666a(26);
            throw null;
        } else if (eVar2 != null) {
            return m33676b((C11824b0) eVar.mo35445o(), (C10359m) eVar2.mo35404a());
        } else {
            m33666a(27);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m33669a(C10342e eVar, C10342e eVar2) {
        if (eVar == null) {
            m33666a(24);
            throw null;
        } else if (eVar2 != null) {
            for (C11824b0 a : eVar.mo33766h().mo35229a()) {
                if (m33668a(a, (C10359m) eVar2.mo35404a())) {
                    return true;
                }
            }
            return false;
        } else {
            m33666a(25);
            throw null;
        }
    }

    /* renamed from: b */
    public static boolean m33676b(C11824b0 b0Var, C10359m mVar) {
        if (b0Var == null) {
            m33666a(30);
            throw null;
        } else if (mVar == null) {
            m33666a(31);
            throw null;
        } else if (m33668a(b0Var, mVar)) {
            return true;
        } else {
            for (C11824b0 b : b0Var.mo35227v0().mo35229a()) {
                if (m33676b(b, mVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m33668a(C11824b0 b0Var, C10359m mVar) {
        if (b0Var == null) {
            m33666a(28);
            throw null;
        } else if (mVar != null) {
            C10349h b = b0Var.mo35227v0().mo33781b();
            if (b == null) {
                return false;
            }
            C10359m a = b.mo35404a();
            return (a instanceof C10349h) && (mVar instanceof C10349h) && ((C10349h) mVar).mo33766h().equals(((C10349h) a).mo33766h());
        } else {
            m33666a(29);
            throw null;
        }
    }

    /* renamed from: b */
    public static C10342e m33673b(C10342e eVar) {
        if (eVar != null) {
            for (C11824b0 a : eVar.mo33766h().mo35229a()) {
                C10342e a2 = m33660a(a);
                if (a2.mo33763g() != C10345f.INTERFACE) {
                    return a2;
                }
            }
            return null;
        }
        m33666a(42);
        throw null;
    }

    /* renamed from: a */
    private static boolean m33670a(C10359m mVar, C10345f fVar) {
        if (fVar != null) {
            return (mVar instanceof C10342e) && ((C10342e) mVar).mo33763g() == fVar;
        }
        m33666a(35);
        throw null;
    }

    /* renamed from: a */
    public static C10342e m33660a(C11824b0 b0Var) {
        if (b0Var != null) {
            return m33661a(b0Var.mo35227v0());
        }
        m33666a(43);
        throw null;
    }

    /* renamed from: a */
    public static C10342e m33661a(C11953s0 s0Var) {
        if (s0Var != null) {
            C10342e eVar = (C10342e) s0Var.mo33781b();
            if (eVar != null) {
                return eVar;
            }
            m33666a(45);
            throw null;
        }
        m33666a(44);
        throw null;
    }

    /* renamed from: a */
    public static C10237a1 m33658a(C10342e eVar) {
        if (eVar != null) {
            C10345f g = eVar.mo33763g();
            if (g == C10345f.ENUM_CLASS || g.mo35599a() || m33694s(eVar)) {
                C10237a1 a1Var = C10397z0.f28188a;
                if (a1Var != null) {
                    return a1Var;
                }
                m33666a(47);
                throw null;
            } else if (m33685j(eVar)) {
                C10237a1 a1Var2 = C10397z0.f28198k;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                m33666a(48);
                throw null;
            } else {
                C10237a1 a1Var3 = C10397z0.f28192e;
                if (a1Var3 != null) {
                    return a1Var3;
                }
                m33666a(49);
                throw null;
            }
        } else {
            m33666a(46);
            throw null;
        }
    }

    /* renamed from: a */
    public static <D extends C10238b> D m33659a(D d) {
        if (d != null) {
            while (d.mo35423g() == C10238b.C10239a.FAKE_OVERRIDE) {
                Collection d2 = d.mo35406d();
                if (!d2.isEmpty()) {
                    d = (C10238b) d2.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            if (d != null) {
                return d;
            }
            m33666a(56);
            throw null;
        }
        m33666a(55);
        throw null;
    }

    /* renamed from: a */
    public static <D extends C10369q> D m33664a(D d) {
        if (d == null) {
            m33666a(57);
            throw null;
        } else if (d instanceof C10238b) {
            return m33659a((C10238b) d);
        } else {
            if (d != null) {
                return d;
            }
            m33666a(58);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m33672a(C10392x0 x0Var, C11824b0 b0Var) {
        if (x0Var == null) {
            m33666a(59);
            throw null;
        } else if (b0Var == null) {
            m33666a(60);
            throw null;
        } else if (x0Var.mo35484Z() || C11830d0.m38958a(b0Var)) {
            return false;
        } else {
            if (C11821a1.m38907a(b0Var)) {
                return true;
            }
            C9333g b = C10071a.m33892b((C10359m) x0Var);
            if (C9333g.m30206r(b0Var) || C11868g.f31579a.mo38535a(b.mo33693C(), b0Var) || C11868g.f31579a.mo38535a(b.mo33727w().mo35445o(), b0Var) || C11868g.f31579a.mo38535a(b.mo33707c(), b0Var) || C9348m.f26019e.mo33744a(b0Var)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static <D extends C10230a> Set<D> m33657a(D d) {
        if (d != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m33667a(d.mo35404a(), linkedHashSet);
            return linkedHashSet;
        }
        m33666a(64);
        throw null;
    }

    /* renamed from: a */
    private static <D extends C10230a> void m33667a(D d, Set<D> set) {
        if (d == null) {
            m33666a(66);
            throw null;
        } else if (set == null) {
            m33666a(67);
            throw null;
        } else if (!set.contains(d)) {
            for (C10230a a : d.mo35404a().mo35406d()) {
                C10230a a2 = a.mo35404a();
                m33667a(a2, set);
                set.add(a2);
            }
        }
    }
}
