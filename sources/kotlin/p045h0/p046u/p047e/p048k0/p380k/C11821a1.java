package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.a1 */
/* compiled from: TypeUtils */
public class C11821a1 {

    /* renamed from: a */
    public static final C11901j0 f31524a = C11958u.m39563f("DONT_CARE");

    /* renamed from: b */
    public static final C11901j0 f31525b = C11958u.m39559c("Cannot be inferred");

    /* renamed from: c */
    public static final C11901j0 f31526c = new C11822a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C11901j0 f31527d = new C11822a("UNIT_EXPECTED_TYPE");

    /* renamed from: a */
    public static C11824b0 m38903a(C11824b0 b0Var, boolean z) {
        if (b0Var != null) {
            C11834e1 a = b0Var.mo38439x0().mo34007a(z);
            if (a != null) {
                return a;
            }
            m38906a(4);
            throw null;
        }
        m38906a(3);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m38906a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 13:
                objArr[0] = "parameters";
                break;
            case 17:
                objArr[0] = "subType";
                break;
            case 18:
                objArr[0] = "superType";
                break;
            case 19:
                objArr[0] = "substitutor";
                break;
            case 21:
                objArr[0] = "result";
                break;
            case 28:
            case 30:
                objArr[0] = "clazz";
                break;
            case 29:
                objArr[0] = "typeArguments";
                break;
            case 31:
                objArr[0] = "projections";
                break;
            case 33:
                objArr[0] = "a";
                break;
            case 34:
                objArr[0] = "b";
                break;
            case 36:
                objArr[0] = "typeParameters";
                break;
            case 38:
                objArr[0] = "typeParameterConstructors";
                break;
            case 39:
                objArr[0] = "specialType";
                break;
            case 40:
            case 41:
                objArr[0] = "isSpecialType";
                break;
            case 42:
                objArr[0] = "parameterDescriptor";
                break;
            case 43:
            case 47:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 45:
            case 46:
                objArr[0] = "supertypes";
                break;
            case 48:
            case 51:
                objArr[0] = "expectedType";
                break;
            case 50:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 14) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 16) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 23) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 32) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 44) {
                    if (i3 != 49) {
                        if (!(i3 == 6 || i3 == 7)) {
                            if (i3 != 11 && i3 != 12) {
                                switch (i3) {
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                        break;
                                }
                            } else {
                                objArr[1] = "makeUnsubstitutedType";
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 13:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 15:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 17:
            case 18:
            case 19:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 20:
            case 21:
                objArr[2] = "collectAllSupertypes";
                break;
            case 22:
                objArr[2] = "getAllSupertypes";
                break;
            case 24:
                objArr[2] = "isNullableType";
                break;
            case 25:
                objArr[2] = "acceptsNullable";
                break;
            case 26:
                objArr[2] = "hasNullableSuperType";
                break;
            case 27:
                objArr[2] = "getClassDescriptor";
                break;
            case 28:
            case 29:
                objArr[2] = "substituteParameters";
                break;
            case 30:
            case 31:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "equalTypes";
                break;
            case 35:
            case 36:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 37:
            case 38:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "contains";
                break;
            case 42:
                objArr[2] = "makeStarProjection";
                break;
            case 43:
            case 45:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 46:
                objArr[2] = "findByFqName";
                break;
            case 47:
            case 48:
            case 50:
            case 51:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 56:
                objArr[2] = "isTypeParameter";
                break;
            case 57:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 58:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 59:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static C11824b0 m38910b(C11824b0 b0Var, boolean z) {
        if (b0Var == null) {
            m38906a(8);
            throw null;
        } else if (z) {
            return m38919j(b0Var);
        } else {
            if (b0Var != null) {
                return b0Var;
            }
            m38906a(9);
            throw null;
        }
    }

    /* renamed from: c */
    public static List<C11824b0> m38912c(C11824b0 b0Var) {
        if (b0Var != null) {
            C11978z0 a = C11978z0.m39662a(b0Var);
            Collection<C11824b0> a2 = b0Var.mo35227v0().mo35229a();
            ArrayList arrayList = new ArrayList(a2.size());
            for (C11824b0 a3 : a2) {
                C11824b0 a4 = m38902a(b0Var, a3, a);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            return arrayList;
        }
        m38906a(15);
        throw null;
    }

    /* renamed from: d */
    public static C10375s0 m38913d(C11824b0 b0Var) {
        if (b0Var == null) {
            m38906a(59);
            throw null;
        } else if (b0Var.mo35227v0().mo33781b() instanceof C10375s0) {
            return (C10375s0) b0Var.mo35227v0().mo33781b();
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m38914e(C11824b0 b0Var) {
        if (b0Var == null) {
            m38906a(26);
            throw null;
        } else if (b0Var.mo35227v0().mo33781b() instanceof C10342e) {
            return false;
        } else {
            for (C11824b0 g : m38912c(b0Var)) {
                if (m38916g(g)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m38915f(C11824b0 b0Var) {
        return b0Var != null && b0Var.mo35227v0() == f31524a.mo35227v0();
    }

    /* renamed from: g */
    public static boolean m38916g(C11824b0 b0Var) {
        if (b0Var == null) {
            m38906a(24);
            throw null;
        } else if (b0Var.mo34094w0()) {
            return true;
        } else {
            if (C11975y.m39644b(b0Var) && m38916g(C11975y.m39643a(b0Var).mo38607A0())) {
                return true;
            }
            if (m38917h(b0Var)) {
                return m38914e(b0Var);
            }
            C11953s0 v0 = b0Var.mo35227v0();
            if (!(v0 instanceof C11819a0)) {
                return false;
            }
            for (C11824b0 g : v0.mo35229a()) {
                if (m38916g(g)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m38917h(C11824b0 b0Var) {
        if (b0Var == null) {
            m38906a(56);
            throw null;
        } else if (m38913d(b0Var) != null) {
            return true;
        } else {
            b0Var.mo35227v0();
            return false;
        }
    }

    /* renamed from: i */
    public static C11824b0 m38918i(C11824b0 b0Var) {
        if (b0Var != null) {
            return m38903a(b0Var, false);
        }
        m38906a(2);
        throw null;
    }

    /* renamed from: j */
    public static C11824b0 m38919j(C11824b0 b0Var) {
        if (b0Var != null) {
            return m38903a(b0Var, true);
        }
        m38906a(1);
        throw null;
    }

    /* renamed from: k */
    public static boolean m38920k(C11824b0 b0Var) {
        if (b0Var != null) {
            return b0Var == f31526c || b0Var == f31527d;
        }
        m38906a(0);
        throw null;
    }

    /* renamed from: kotlin.h0.u.e.k0.k.a1$a */
    /* compiled from: TypeUtils */
    public static class C11822a extends C11939n {

        /* renamed from: f */
        private final String f31528f;

        public C11822a(String str) {
            this.f31528f = str;
        }

        /* renamed from: a */
        private static /* synthetic */ void m38921a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "newAnnotations";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "toString";
            }
            if (i != 1) {
                objArr[2] = "replaceAnnotations";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String toString() {
            String str = this.f31528f;
            if (str != null) {
                return str;
            }
            m38921a(1);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y0 */
        public C11901j0 mo34095y0() {
            throw new IllegalStateException(this.f31528f);
        }

        /* renamed from: a */
        public C11901j0 m38924a(C10249g gVar) {
            if (gVar == null) {
                m38921a(0);
                throw null;
            }
            throw new IllegalStateException(this.f31528f);
        }

        /* renamed from: a */
        public C11901j0 m38925a(boolean z) {
            throw new IllegalStateException(this.f31528f);
        }
    }

    /* renamed from: a */
    public static C11901j0 m38904a(C10349h hVar, C10096h hVar2) {
        if (C11958u.m39553a((C10359m) hVar)) {
            C11901j0 c = C11958u.m39559c("Unsubstituted type for " + hVar);
            if (c != null) {
                return c;
            }
            m38906a(11);
            throw null;
        }
        C11953s0 h = hVar.mo33766h();
        C11901j0 a = C11827c0.m38949a(C10249g.f27910c.mo35429a(), h, m38901a(h.getParameters()), false, hVar2);
        if (a != null) {
            return a;
        }
        m38906a(12);
        throw null;
    }

    /* renamed from: b */
    public static C10342e m38911b(C11824b0 b0Var) {
        if (b0Var != null) {
            C10349h b = b0Var.mo35227v0().mo33781b();
            if (b instanceof C10342e) {
                return (C10342e) b;
            }
            return null;
        }
        m38906a(27);
        throw null;
    }

    /* renamed from: a */
    public static List<C11965u0> m38901a(List<C10375s0> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C10375s0 o : list) {
                arrayList.add(new C11970w0(o.mo35445o()));
            }
            List<C11965u0> n = C10539w.m35815n(arrayList);
            if (n != null) {
                return n;
            }
            m38906a(14);
            throw null;
        }
        m38906a(13);
        throw null;
    }

    /* renamed from: a */
    public static C11824b0 m38902a(C11824b0 b0Var, C11824b0 b0Var2, C11978z0 z0Var) {
        if (b0Var == null) {
            m38906a(17);
            throw null;
        } else if (b0Var2 == null) {
            m38906a(18);
            throw null;
        } else if (z0Var != null) {
            C11824b0 b = z0Var.mo38620b(b0Var2, C11838f1.INVARIANT);
            if (b != null) {
                return m38910b(b, b0Var.mo34094w0());
            }
            return null;
        } else {
            m38906a(19);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m38907a(C11824b0 b0Var) {
        if (b0Var == null) {
            m38906a(25);
            throw null;
        } else if (b0Var.mo34094w0()) {
            return true;
        } else {
            if (!C11975y.m39644b(b0Var) || !m38907a((C11824b0) C11975y.m39643a(b0Var).mo38607A0())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m38908a(C11824b0 b0Var, C9113l<C11834e1, Boolean> lVar) {
        if (lVar != null) {
            return m38909a(b0Var, lVar, (HashSet<C11824b0>) new HashSet());
        }
        m38906a(40);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, kotlin.h0.u.e.k0.k.e1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m38909a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r5, kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean> r6, java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x009e
            r1 = 0
            if (r5 != 0) goto L_0x0007
            return r1
        L_0x0007:
            boolean r2 = r7.contains(r5)
            if (r2 == 0) goto L_0x000e
            return r1
        L_0x000e:
            r7.add(r5)
            kotlin.h0.u.e.k0.k.e1 r2 = r5.mo38439x0()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            if (r3 == 0) goto L_0x0023
            return r4
        L_0x0023:
            boolean r3 = r2 instanceof kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v
            if (r3 == 0) goto L_0x002a
            r0 = r2
            kotlin.h0.u.e.k0.k.v r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v) r0
        L_0x002a:
            if (r0 == 0) goto L_0x0041
            kotlin.h0.u.e.k0.k.j0 r3 = r0.mo38609z0()
            boolean r3 = m38909a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r3, (kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean>) r6, (java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r7)
            if (r3 != 0) goto L_0x0040
            kotlin.h0.u.e.k0.k.j0 r0 = r0.mo38607A0()
            boolean r0 = m38909a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0, (kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean>) r6, (java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r7)
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            return r4
        L_0x0041:
            boolean r0 = r2 instanceof kotlin.p045h0.p046u.p047e.p048k0.p380k.C11925l
            if (r0 == 0) goto L_0x0052
            kotlin.h0.u.e.k0.k.l r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11925l) r2
            kotlin.h0.u.e.k0.k.j0 r0 = r2.mo38575a()
            boolean r0 = m38909a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0, (kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean>) r6, (java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r7)
            if (r0 == 0) goto L_0x0052
            return r4
        L_0x0052:
            kotlin.h0.u.e.k0.k.s0 r0 = r5.mo35227v0()
            boolean r2 = r0 instanceof kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0
            if (r2 == 0) goto L_0x0078
            kotlin.h0.u.e.k0.k.a0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0) r0
            java.util.Collection r5 = r0.mo35229a()
            java.util.Iterator r5 = r5.iterator()
        L_0x0064:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r5.next()
            kotlin.h0.u.e.k0.k.b0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0
            boolean r0 = m38909a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0, (kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean>) r6, (java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r7)
            if (r0 == 0) goto L_0x0064
            return r4
        L_0x0077:
            return r1
        L_0x0078:
            java.util.List r5 = r5.mo35226u0()
            java.util.Iterator r5 = r5.iterator()
        L_0x0080:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r5.next()
            kotlin.h0.u.e.k0.k.u0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0) r0
            boolean r2 = r0.mo38597b()
            if (r2 != 0) goto L_0x0080
            kotlin.h0.u.e.k0.k.b0 r0 = r0.getType()
            boolean r0 = m38909a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0, (kotlin.p215c0.p216c.C9113l<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1, java.lang.Boolean>) r6, (java.util.HashSet<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r7)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0080
            return r4
        L_0x009d:
            return r1
        L_0x009e:
            r5 = 41
            m38906a((int) r5)
            throw r0
        L_0x00a4:
            r5 = move-exception
            goto L_0x00a7
        L_0x00a6:
            throw r5
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1.m38909a(kotlin.h0.u.e.k0.k.b0, kotlin.c0.c.l, java.util.HashSet):boolean");
    }

    /* renamed from: a */
    public static C11965u0 m38905a(C10375s0 s0Var) {
        if (s0Var != null) {
            return new C11940n0(s0Var);
        }
        m38906a(42);
        throw null;
    }
}
