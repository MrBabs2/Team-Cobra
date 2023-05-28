package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10113b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10281a0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10283b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10285c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10289d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10296f;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10305i0;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.h.b */
/* compiled from: DescriptorFactory */
public class C9997b {

    /* renamed from: kotlin.h0.u.e.k0.h.b$a */
    /* compiled from: DescriptorFactory */
    private static class C9998a extends C10296f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9998a(C10342e eVar, C10362n0 n0Var) {
            super(eVar, (C10357l) null, C10249g.f27910c.mo35429a(), true, C10238b.C10239a.DECLARATION, n0Var);
            if (eVar == null) {
                m33656a(0);
                throw null;
            } else if (n0Var != null) {
                mo35470a((List<C10386v0>) Collections.emptyList(), C9999c.m33658a(eVar));
            } else {
                m33656a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m33656a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    public static C10283b0 m33645a(C10352i0 i0Var, C10249g gVar, C10249g gVar2) {
        if (i0Var == null) {
            m33651a(0);
            throw null;
        } else if (gVar == null) {
            m33651a(1);
            throw null;
        } else if (gVar2 != null) {
            return m33647a(i0Var, gVar, gVar2, true, false, false, i0Var.mo33773p());
        } else {
            m33651a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33651a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C10360m0 m33653b(C10342e eVar) {
        if (eVar != null) {
            C10289d0 a = C10289d0.m34416a((C10359m) eVar, C10249g.f27910c.mo35429a(), C9999c.f27577a, C10238b.C10239a.SYNTHESIZED, eVar.mo33773p()).m34423a((C10358l0) null, (C10358l0) null, (List<? extends C10375s0>) Collections.emptyList(), (List<C10386v0>) Collections.emptyList(), (C11824b0) C10071a.m33892b((C10359m) eVar).mo33698a(C11838f1.INVARIANT, (C11824b0) eVar.mo35445o()), C10388w.FINAL, C10397z0.f28192e);
            if (a != null) {
                return a;
            }
            m33651a(23);
            throw null;
        }
        m33651a(22);
        throw null;
    }

    /* renamed from: c */
    public static boolean m33655c(C10382u uVar) {
        if (uVar != null) {
            return uVar.getName().equals(C9999c.f27577a) && m33652a(uVar);
        }
        m33651a(26);
        throw null;
    }

    /* renamed from: a */
    public static C10283b0 m33647a(C10352i0 i0Var, C10249g gVar, C10249g gVar2, boolean z, boolean z2, boolean z3, C10362n0 n0Var) {
        if (i0Var == null) {
            m33651a(3);
            throw null;
        } else if (gVar == null) {
            m33651a(4);
            throw null;
        } else if (gVar2 == null) {
            m33651a(5);
            throw null;
        } else if (n0Var != null) {
            return m33646a(i0Var, gVar, gVar2, z, z2, z3, i0Var.getVisibility(), n0Var);
        } else {
            m33651a(6);
            throw null;
        }
    }

    /* renamed from: b */
    public static boolean m33654b(C10382u uVar) {
        if (uVar != null) {
            return uVar.getName().equals(C9999c.f27578b) && m33652a(uVar);
        }
        m33651a(27);
        throw null;
    }

    /* renamed from: a */
    public static C10283b0 m33646a(C10352i0 i0Var, C10249g gVar, C10249g gVar2, boolean z, boolean z2, boolean z3, C10237a1 a1Var, C10362n0 n0Var) {
        C10249g gVar3 = gVar2;
        if (i0Var == null) {
            m33651a(7);
            throw null;
        } else if (gVar == null) {
            m33651a(8);
            throw null;
        } else if (gVar3 == null) {
            m33651a(9);
            throw null;
        } else if (a1Var == null) {
            m33651a(10);
            throw null;
        } else if (n0Var != null) {
            C10283b0 b0Var = new C10283b0(i0Var, gVar, i0Var.mo33767i(), a1Var, z, z2, z3, C10238b.C10239a.DECLARATION, (C10356k0) null, n0Var);
            b0Var.mo35454a((C10386v0) C10283b0.m34364a(b0Var, i0Var.getType(), gVar2));
            return b0Var;
        } else {
            m33651a(11);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10281a0 m33642a(C10352i0 i0Var, C10249g gVar) {
        if (i0Var == null) {
            m33651a(13);
            throw null;
        } else if (gVar != null) {
            return m33643a(i0Var, gVar, true, false, false);
        } else {
            m33651a(14);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10281a0 m33643a(C10352i0 i0Var, C10249g gVar, boolean z, boolean z2, boolean z3) {
        if (i0Var == null) {
            m33651a(15);
            throw null;
        } else if (gVar != null) {
            return m33644a(i0Var, gVar, z, z2, z3, i0Var.mo33773p());
        } else {
            m33651a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10281a0 m33644a(C10352i0 i0Var, C10249g gVar, boolean z, boolean z2, boolean z3, C10362n0 n0Var) {
        if (i0Var == null) {
            m33651a(17);
            throw null;
        } else if (gVar == null) {
            m33651a(18);
            throw null;
        } else if (n0Var != null) {
            return new C10281a0(i0Var, gVar, i0Var.mo33767i(), i0Var.getVisibility(), z, z2, z3, C10238b.C10239a.DECLARATION, (C10354j0) null, n0Var);
        } else {
            m33651a(19);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10296f m33648a(C10342e eVar, C10362n0 n0Var) {
        if (eVar == null) {
            m33651a(20);
            throw null;
        } else if (n0Var != null) {
            return new C9998a(eVar, n0Var);
        } else {
            m33651a(21);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10360m0 m33650a(C10342e eVar) {
        C10342e eVar2 = eVar;
        if (eVar2 != null) {
            C10289d0 a = C10289d0.m34416a((C10359m) eVar2, C10249g.f27910c.mo35429a(), C9999c.f27578b, C10238b.C10239a.SYNTHESIZED, eVar.mo33773p());
            C10289d0 d0Var = a;
            C10289d0 a2 = d0Var.m34423a((C10358l0) null, (C10358l0) null, (List<? extends C10375s0>) Collections.emptyList(), (List<C10386v0>) Collections.singletonList(new C10305i0(a, (C10386v0) null, 0, C10249g.f27910c.mo35429a(), C9939f.m33302b(DonationsAnalytics.VALUE), C10071a.m33892b((C10359m) eVar).mo33693C(), false, false, false, (C11824b0) null, eVar.mo33773p())), (C11824b0) eVar.mo35445o(), C10388w.FINAL, C10397z0.f28192e);
            if (a2 != null) {
                return a2;
            }
            m33651a(25);
            throw null;
        }
        m33651a(24);
        throw null;
    }

    /* renamed from: a */
    private static boolean m33652a(C10382u uVar) {
        if (uVar != null) {
            return uVar.mo35423g() == C10238b.C10239a.SYNTHESIZED && C9999c.m33690o(uVar.mo33762b());
        }
        m33651a(28);
        throw null;
    }

    /* renamed from: a */
    public static C10358l0 m33649a(C10230a aVar, C11824b0 b0Var, C10249g gVar) {
        if (aVar == null) {
            m33651a(29);
            throw null;
        } else if (gVar == null) {
            m33651a(30);
            throw null;
        } else if (b0Var == null) {
            return null;
        } else {
            return new C10285c0(aVar, new C10113b(aVar, b0Var, (C10116e) null), gVar);
        }
    }
}
