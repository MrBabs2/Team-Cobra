package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10117f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10118g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11952s;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11998g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10297f0;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0 */
/* compiled from: Visibilities */
public class C10397z0 {

    /* renamed from: a */
    public static final C10237a1 f28188a = new C10401d("private", false);

    /* renamed from: b */
    public static final C10237a1 f28189b = new C10402e("private_to_this", false);

    /* renamed from: c */
    public static final C10237a1 f28190c = new C10403f("protected", true);

    /* renamed from: d */
    public static final C10237a1 f28191d = new C10404g("internal", false);

    /* renamed from: e */
    public static final C10237a1 f28192e = new C10405h("public", true);

    /* renamed from: f */
    public static final C10237a1 f28193f = new C10406i("local", false);

    /* renamed from: g */
    public static final C10237a1 f28194g = new C10407j("inherited", false);

    /* renamed from: h */
    public static final C10237a1 f28195h = new C10408k("invisible_fake", false);

    /* renamed from: i */
    public static final C10237a1 f28196i = new C10409l("unknown", false);

    /* renamed from: j */
    private static final Map<C10237a1, Integer> f28197j;

    /* renamed from: k */
    public static final C10237a1 f28198k = f28192e;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C10116e f28199l = new C10398a();

    /* renamed from: m */
    public static final C10116e f28200m = new C10399b();
    @Deprecated

    /* renamed from: n */
    public static final C10116e f28201n = new C10400c();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C11998g f28202o;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$a */
    /* compiled from: Visibilities */
    static class C10398a implements C10116e {
        C10398a() {
        }

        public C11824b0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$b */
    /* compiled from: Visibilities */
    static class C10399b implements C10116e {
        C10399b() {
        }

        public C11824b0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$c */
    /* compiled from: Visibilities */
    static class C10400c implements C10116e {
        C10400c() {
        }

        public C11824b0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$e */
    /* compiled from: Visibilities */
    static class C10402e extends C10237a1 {
        C10402e(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35097a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public String mo34181a() {
            return "private/*private to this*/";
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            C10359m a;
            if (qVar == null) {
                m35097a(0);
                throw null;
            } else if (mVar != null) {
                if (C10397z0.f28188a.mo34182a(eVar, qVar, mVar)) {
                    if (eVar == C10397z0.f28200m) {
                        return true;
                    }
                    if (!(eVar == C10397z0.f28199l || (a = C9999c.m33662a((C10359m) qVar, C10342e.class)) == null || !(eVar instanceof C10118g))) {
                        return ((C10118g) eVar).mo35323n().mo35404a().equals(a.mo35404a());
                    }
                }
                return false;
            } else {
                m35097a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$g */
    /* compiled from: Visibilities */
    static class C10404g extends C10237a1 {
        C10404g(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35103a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35103a(0);
                throw null;
            } else if (mVar != null) {
                if (!C9999c.m33665a(mVar).mo35560a(C9999c.m33665a((C10359m) qVar))) {
                    return false;
                }
                return C10397z0.f28202o.mo38635a(qVar, mVar);
            } else {
                m35103a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$h */
    /* compiled from: Visibilities */
    static class C10405h extends C10237a1 {
        C10405h(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35105a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35105a(0);
                throw null;
            } else if (mVar != null) {
                return true;
            } else {
                m35105a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$i */
    /* compiled from: Visibilities */
    static class C10406i extends C10237a1 {
        C10406i(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35107a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35107a(0);
                throw null;
            } else if (mVar == null) {
                m35107a(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$j */
    /* compiled from: Visibilities */
    static class C10407j extends C10237a1 {
        C10407j(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35109a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35109a(0);
                throw null;
            } else if (mVar == null) {
                m35109a(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$k */
    /* compiled from: Visibilities */
    static class C10408k extends C10237a1 {
        C10408k(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35111a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35111a(0);
                throw null;
            } else if (mVar != null) {
                return false;
            } else {
                m35111a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$l */
    /* compiled from: Visibilities */
    static class C10409l extends C10237a1 {
        C10409l(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35113a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m35113a(0);
                throw null;
            } else if (mVar != null) {
                return false;
            } else {
                m35113a(1);
                throw null;
            }
        }
    }

    static {
        Class<C11998g> cls = C11998g.class;
        Collections.unmodifiableSet(C10530o0.m35749b(f28188a, f28189b, f28191d, f28193f));
        HashMap b = C12141a.m40134b(4);
        b.put(f28189b, 0);
        b.put(f28188a, 0);
        b.put(f28191d, 1);
        b.put(f28190c, 1);
        b.put(f28192e, 2);
        f28197j = Collections.unmodifiableMap(b);
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f28202o = it.hasNext() ? (C11998g) it.next() : C11998g.C11999a.f31707a;
    }

    /* renamed from: a */
    private static /* synthetic */ void m35088a(int i) {
        Object[] objArr = new Object[3];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$d */
    /* compiled from: Visibilities */
    static class C10401d extends C10237a1 {
        C10401d(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35094a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        private boolean m35095a(C10359m mVar) {
            if (mVar != null) {
                return C9999c.m33678c(mVar) != C10365o0.f28176a;
            }
            m35094a(0);
            throw null;
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            C10359m mVar2;
            if (qVar == null) {
                m35094a(1);
                throw null;
            } else if (mVar == null) {
                m35094a(2);
                throw null;
            } else if (C9999c.m33695t(qVar) && m35095a(mVar)) {
                return C10397z0.m35090a((C10359m) qVar, mVar);
            } else {
                if (qVar instanceof C10357l) {
                    C10351i b = ((C10357l) qVar).mo33762b();
                    if (C9999c.m33694s(b) && C9999c.m33695t(b) && (mVar instanceof C10357l) && C9999c.m33695t(mVar.mo33762b()) && C10397z0.m35090a((C10359m) qVar, mVar)) {
                        return true;
                    }
                }
                C10359m mVar3 = qVar;
                while (mVar3 != null) {
                    C10359m b2 = mVar3.mo33762b();
                    if ((b2 instanceof C10342e) && !C9999c.m33688m(b2)) {
                        mVar2 = b2;
                        break;
                    }
                    boolean z = b2 instanceof C10240b0;
                    mVar3 = b2;
                    if (z) {
                        mVar2 = b2;
                        break;
                    }
                }
                mVar2 = mVar3;
                if (mVar2 == null) {
                    return false;
                }
                while (mVar != null) {
                    if (mVar2 == mVar) {
                        return true;
                    }
                    if (!(mVar instanceof C10240b0)) {
                        mVar = mVar.mo33762b();
                    } else if (!(mVar2 instanceof C10240b0) || !((C10240b0) mVar2).mo35425c().equals(((C10240b0) mVar).mo35425c()) || !C9999c.m33671a(mVar, mVar2)) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m35091a(C10369q qVar, C10359m mVar) {
        if (qVar == null) {
            m35088a(2);
            throw null;
        } else if (mVar != null) {
            return m35087a(f28200m, qVar, mVar) == null;
        } else {
            m35088a(3);
            throw null;
        }
    }

    /* renamed from: b */
    static Integer m35092b(C10237a1 a1Var, C10237a1 a1Var2) {
        if (a1Var == null) {
            m35088a(10);
            throw null;
        } else if (a1Var2 == null) {
            m35088a(11);
            throw null;
        } else if (a1Var == a1Var2) {
            return 0;
        } else {
            Integer num = f28197j.get(a1Var);
            Integer num2 = f28197j.get(a1Var2);
            if (num == null || num2 == null || num.equals(num2)) {
                return null;
            }
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
    }

    /* renamed from: a */
    public static boolean m35090a(C10359m mVar, C10359m mVar2) {
        if (mVar == null) {
            m35088a(6);
            throw null;
        } else if (mVar2 != null) {
            C10365o0 c = C9999c.m33678c(mVar2);
            if (c != C10365o0.f28176a) {
                return c.equals(C9999c.m33678c(mVar));
            }
            return false;
        } else {
            m35088a(7);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10369q m35087a(C10116e eVar, C10369q qVar, C10359m mVar) {
        C10369q a;
        if (qVar == null) {
            m35088a(8);
            throw null;
        } else if (mVar != null) {
            C10369q qVar2 = (C10369q) qVar.mo35404a();
            while (qVar2 != null && qVar2.getVisibility() != f28193f) {
                if (!qVar2.getVisibility().mo34182a(eVar, qVar2, mVar)) {
                    return qVar2;
                }
                qVar2 = (C10369q) C9999c.m33662a((C10359m) qVar2, C10369q.class);
            }
            if (!(qVar instanceof C10297f0) || (a = m35087a(eVar, ((C10297f0) qVar).mo35474e0(), mVar)) == null) {
                return null;
            }
            return a;
        } else {
            m35088a(9);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$f */
    /* compiled from: Visibilities */
    static class C10403f extends C10237a1 {
        C10403f(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m35100a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            C10342e eVar2;
            Class<C10342e> cls = C10342e.class;
            if (qVar == null) {
                m35100a(0);
                throw null;
            } else if (mVar != null) {
                C10342e eVar3 = (C10342e) C9999c.m33662a((C10359m) qVar, cls);
                C10342e eVar4 = (C10342e) C9999c.m33663a(mVar, cls, false);
                if (eVar4 == null) {
                    return false;
                }
                if (eVar3 != null && C9999c.m33688m(eVar3) && (eVar2 = (C10342e) C9999c.m33662a((C10359m) eVar3, cls)) != null && C9999c.m33677b(eVar4, eVar2)) {
                    return true;
                }
                C10369q a = C9999c.m33664a(qVar);
                C10342e eVar5 = (C10342e) C9999c.m33662a((C10359m) a, cls);
                if (eVar5 == null) {
                    return false;
                }
                if (!C9999c.m33677b(eVar4, eVar5) || !m35101a(eVar, a, eVar4)) {
                    return mo34182a(eVar, qVar, eVar4.mo33762b());
                }
                return true;
            } else {
                m35100a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private boolean m35101a(C10116e eVar, C10369q qVar, C10342e eVar2) {
            if (qVar == null) {
                m35100a(2);
                throw null;
            } else if (eVar2 == null) {
                m35100a(3);
                throw null;
            } else if (eVar == C10397z0.f28201n) {
                return false;
            } else {
                if (!(qVar instanceof C10238b) || (qVar instanceof C10357l) || eVar == C10397z0.f28200m) {
                    return true;
                }
                if (eVar == C10397z0.f28199l || eVar == null) {
                    return false;
                }
                C11824b0 a = eVar instanceof C10117f ? ((C10117f) eVar).mo35325a() : eVar.getType();
                if (C9999c.m33676b(a, (C10359m) eVar2) || C11952s.m39520a(a)) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public static Integer m35085a(C10237a1 a1Var, C10237a1 a1Var2) {
        if (a1Var == null) {
            m35088a(12);
            throw null;
        } else if (a1Var2 != null) {
            Integer a = a1Var.mo34180a(a1Var2);
            if (a != null) {
                return a;
            }
            Integer a2 = a1Var2.mo34180a(a1Var);
            if (a2 != null) {
                return Integer.valueOf(-a2.intValue());
            }
            return null;
        } else {
            m35088a(13);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m35089a(C10237a1 a1Var) {
        if (a1Var != null) {
            return a1Var == f28188a || a1Var == f28189b;
        }
        m35088a(14);
        throw null;
    }
}
