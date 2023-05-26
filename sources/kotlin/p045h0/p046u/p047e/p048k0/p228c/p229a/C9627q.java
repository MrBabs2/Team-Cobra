package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10369q;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import p015cm.aptoide.p016pt.downloadmanager.Constants;

/* renamed from: kotlin.h0.u.e.k0.c.a.q */
/* compiled from: JavaVisibilities */
public class C9627q {

    /* renamed from: a */
    public static final C10237a1 f26511a = new C9628a(Constants.PACKAGE, false);

    /* renamed from: b */
    public static final C10237a1 f26512b = new C9629b("protected_static", true);

    /* renamed from: c */
    public static final C10237a1 f26513c = new C9630c("protected_and_package", true);

    /* renamed from: kotlin.h0.u.e.k0.c.a.q$b */
    /* compiled from: JavaVisibilities */
    static class C9629b extends C10237a1 {
        C9629b(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m31038a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            } else {
                objArr[1] = "normalize";
            }
            if (i != 2) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public String mo34181a() {
            return "protected/*protected static*/";
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m31038a(0);
                throw null;
            } else if (mVar != null) {
                return C9627q.m31031b(eVar, qVar, mVar);
            } else {
                m31038a(1);
                throw null;
            }
        }

        /* renamed from: c */
        public C10237a1 mo34183c() {
            C10237a1 a1Var = C10397z0.f28190c;
            if (a1Var != null) {
                return a1Var;
            }
            m31038a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m31028a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m31031b(C10116e eVar, C10369q qVar, C10359m mVar) {
        if (qVar == null) {
            m31028a(0);
            throw null;
        } else if (mVar == null) {
            m31028a(1);
            throw null;
        } else if (m31032b(C9999c.m33664a(qVar), mVar)) {
            return true;
        } else {
            return C10397z0.f28190c.mo34182a(eVar, qVar, mVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.q$a */
    /* compiled from: JavaVisibilities */
    static class C9628a extends C10237a1 {
        C9628a(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m31033a(int i) {
            String str = (i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 5) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        objArr[0] = "classDescriptor";
                    } else if (i != 5) {
                        objArr[0] = "what";
                    }
                }
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[0] = "visibility";
            }
            if (i == 3) {
                objArr[1] = "normalize";
            } else if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[1] = "effectiveVisibility";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                if (i == 4) {
                    objArr[2] = "effectiveVisibility";
                } else if (i != 5) {
                    objArr[2] = "isVisible";
                }
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public String mo34181a() {
            return "public/*package*/";
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m31033a(0);
                throw null;
            } else if (mVar != null) {
                return C9627q.m31032b(qVar, mVar);
            } else {
                m31033a(1);
                throw null;
            }
        }

        /* renamed from: c */
        public C10237a1 mo34183c() {
            C10237a1 a1Var = C10397z0.f28190c;
            if (a1Var != null) {
                return a1Var;
            }
            m31033a(3);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer mo34180a(C10237a1 a1Var) {
            if (a1Var == null) {
                m31033a(2);
                throw null;
            } else if (this == a1Var) {
                return 0;
            } else {
                if (C10397z0.m35089a(a1Var)) {
                    return 1;
                }
                return -1;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.q$c */
    /* compiled from: JavaVisibilities */
    static class C9630c extends C10237a1 {
        C9630c(String str, boolean z) {
            super(str, z);
        }

        /* renamed from: a */
        private static /* synthetic */ void m31042a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "visibility";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            } else {
                objArr[1] = "normalize";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public String mo34181a() {
            return "protected/*protected and package*/";
        }

        /* renamed from: a */
        public boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar) {
            if (qVar == null) {
                m31042a(0);
                throw null;
            } else if (mVar != null) {
                return C9627q.m31031b(eVar, qVar, mVar);
            } else {
                m31042a(1);
                throw null;
            }
        }

        /* renamed from: c */
        public C10237a1 mo34183c() {
            C10237a1 a1Var = C10397z0.f28190c;
            if (a1Var != null) {
                return a1Var;
            }
            m31042a(3);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer mo34180a(C10237a1 a1Var) {
            if (a1Var == null) {
                m31042a(2);
                throw null;
            } else if (this == a1Var) {
                return 0;
            } else {
                if (a1Var == C10397z0.f28191d) {
                    return null;
                }
                if (C10397z0.m35089a(a1Var)) {
                    return 1;
                }
                return -1;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m31032b(C10359m mVar, C10359m mVar2) {
        Class<C10240b0> cls = C10240b0.class;
        if (mVar == null) {
            m31028a(2);
            throw null;
        } else if (mVar2 != null) {
            C10240b0 b0Var = (C10240b0) C9999c.m33663a(mVar, cls, false);
            C10240b0 b0Var2 = (C10240b0) C9999c.m33663a(mVar2, cls, false);
            if (b0Var2 == null || b0Var == null || !b0Var.mo35425c().equals(b0Var2.mo35425c())) {
                return false;
            }
            return true;
        } else {
            m31028a(3);
            throw null;
        }
    }
}
