package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9329d;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11795b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p382i1.C11898a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10343e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10296f;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10302h;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10340z;

/* renamed from: kotlin.h0.u.e.k0.k.u */
/* compiled from: ErrorUtils */
public class C11958u {

    /* renamed from: a */
    private static final C10393y f31660a = new C11959a();

    /* renamed from: b */
    private static final C11961c f31661b = new C11961c(C9939f.m33304d("<ERROR CLASS>"));

    /* renamed from: c */
    public static final C11901j0 f31662c = m39559c("<LOOP IN SUPERTYPES>");

    /* renamed from: d */
    private static final C11824b0 f31663d = m39559c("<ERROR PROPERTY TYPE>");

    /* renamed from: e */
    private static final C10352i0 f31664e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Set<C10352i0> f31665f;

    /* renamed from: kotlin.h0.u.e.k0.k.u$b */
    /* compiled from: ErrorUtils */
    static class C11960b implements C11953s0 {

        /* renamed from: a */
        final /* synthetic */ C11961c f31666a;

        /* renamed from: b */
        final /* synthetic */ String f31667b;

        C11960b(C11961c cVar, String str) {
            this.f31666a = cVar;
            this.f31667b = str;
        }

        /* renamed from: a */
        private static /* synthetic */ void m39572a(int i) {
            Object[] objArr = new Object[2];
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            if (i == 1) {
                objArr[1] = "getSupertypes";
            } else if (i != 2) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "getBuiltIns";
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
        }

        /* renamed from: a */
        public Collection<C11824b0> mo35229a() {
            List a = C10529o.m35736a();
            if (a != null) {
                return a;
            }
            m39572a(1);
            throw null;
        }

        /* renamed from: b */
        public C10349h mo33781b() {
            return this.f31666a;
        }

        /* renamed from: c */
        public boolean mo33782c() {
            return false;
        }

        public List<C10375s0> getParameters() {
            List<C10375s0> a = C10529o.m35736a();
            if (a != null) {
                return a;
            }
            m39572a(0);
            throw null;
        }

        /* renamed from: l */
        public C9333g mo35232l() {
            C9329d G = C9329d.m30147G();
            if (G != null) {
                return G;
            }
            m39572a(2);
            throw null;
        }

        public String toString() {
            return this.f31667b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.u$c */
    /* compiled from: ErrorUtils */
    private static class C11961c extends C10302h {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11961c(C9939f fVar) {
            super(C11958u.m39560c(), fVar, C10388w.OPEN, C10345f.CLASS, Collections.emptyList(), C10362n0.f28175a, false, C11795b.f31497e);
            if (fVar != null) {
                C10296f a = C10296f.m34456a(this, C10249g.f27910c.mo35429a(), true, C10362n0.f28175a);
                a.mo35470a((List<C10386v0>) Collections.emptyList(), C10397z0.f28191d);
                C10096h b = C11958u.m39554b(getName().mo35021a());
                a.mo35501a((C11824b0) new C11954t(C11958u.m39555b("<ERROR>", this), b));
                mo35477a(b, Collections.singleton(a), a);
                return;
            }
            m39577a(0);
            throw null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m39577a(int i) {
            String str = (i == 2 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 4 || i == 6) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 5:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 4 || i == 6) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public C10342e mo35448a(C11978z0 z0Var) {
            if (z0Var != null) {
                return this;
            }
            m39577a(1);
            throw null;
        }

        public String toString() {
            return getName().mo35021a();
        }

        /* renamed from: a */
        public C10096h mo35451a(C11972x0 x0Var) {
            if (x0Var != null) {
                C10096h b = C11958u.m39554b("Error scope for class " + getName() + " with arguments: " + x0Var);
                if (b != null) {
                    return b;
                }
                m39577a(6);
                throw null;
            }
            m39577a(5);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.u$d */
    /* compiled from: ErrorUtils */
    public static class C11962d implements C10096h {

        /* renamed from: b */
        private final String f31668b;

        /* synthetic */ C11962d(String str, C11959a aVar) {
            this(str);
        }

        /* renamed from: a */
        private static /* synthetic */ void m39581a(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
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
        public C10349h mo33917b(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39581a(1);
                throw null;
            } else if (bVar != null) {
                return C11958u.m39549a(fVar.mo35021a());
            } else {
                m39581a(2);
                throw null;
            }
        }

        public String toString() {
            return "ErrorScope{" + this.f31668b + '}';
        }

        private C11962d(String str) {
            if (str != null) {
                this.f31668b = str;
            } else {
                m39581a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public Set<? extends C10360m0> m39585a(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39581a(8);
                throw null;
            } else if (bVar != null) {
                Set<? extends C10360m0> singleton = Collections.singleton(C11958u.m39557b(this));
                if (singleton != null) {
                    return singleton;
                }
                m39581a(10);
                throw null;
            } else {
                m39581a(9);
                throw null;
            }
        }

        /* renamed from: c */
        public Set<? extends C10352i0> m39589c(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39581a(5);
                throw null;
            } else if (bVar != null) {
                Set<? extends C10352i0> a = C11958u.f31665f;
                if (a != null) {
                    return a;
                }
                m39581a(7);
                throw null;
            } else {
                m39581a(6);
                throw null;
            }
        }

        /* renamed from: b */
        public Set<C9939f> mo33916b() {
            Set<C9939f> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m39581a(12);
            throw null;
        }

        /* renamed from: a */
        public Set<C9939f> mo33915a() {
            Set<C9939f> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m39581a(11);
            throw null;
        }

        /* renamed from: a */
        public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
            if (dVar == null) {
                m39581a(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                m39581a(18);
                throw null;
            } else {
                m39581a(17);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.u$e */
    /* compiled from: ErrorUtils */
    private static class C11963e implements C10096h {

        /* renamed from: b */
        private final String f31669b;

        /* synthetic */ C11963e(String str, C11959a aVar) {
            this(str);
        }

        /* renamed from: a */
        private static /* synthetic */ void m39590a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public Collection<? extends C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39590a(7);
                throw null;
            } else if (bVar == null) {
                m39590a(8);
                throw null;
            } else {
                throw new IllegalStateException(this.f31669b + ", required name: " + fVar);
            }
        }

        /* renamed from: b */
        public C10349h mo33917b(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39590a(1);
                throw null;
            } else if (bVar == null) {
                m39590a(2);
                throw null;
            } else {
                throw new IllegalStateException(this.f31669b + ", required name: " + fVar);
            }
        }

        /* renamed from: c */
        public Collection<? extends C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m39590a(5);
                throw null;
            } else if (bVar == null) {
                m39590a(6);
                throw null;
            } else {
                throw new IllegalStateException(this.f31669b + ", required name: " + fVar);
            }
        }

        public String toString() {
            return "ThrowingScope{" + this.f31669b + '}';
        }

        private C11963e(String str) {
            if (str != null) {
                this.f31669b = str;
            } else {
                m39590a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
            if (dVar == null) {
                m39590a(9);
                throw null;
            } else if (lVar == null) {
                m39590a(10);
                throw null;
            } else {
                throw new IllegalStateException(this.f31669b);
            }
        }

        /* renamed from: b */
        public Set<C9939f> mo33916b() {
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public Set<C9939f> mo33915a() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.u$f */
    /* compiled from: ErrorUtils */
    public static class C11964f implements C11953s0 {

        /* renamed from: a */
        private final C10375s0 f31670a;

        /* renamed from: b */
        private final C11953s0 f31671b;

        /* renamed from: a */
        private static /* synthetic */ void m39597a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[0] = "descriptor";
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public Collection<C11824b0> mo35229a() {
            Collection<C11824b0> a = this.f31671b.mo35229a();
            if (a != null) {
                return a;
            }
            m39597a(3);
            throw null;
        }

        /* renamed from: b */
        public C10349h mo33781b() {
            return this.f31671b.mo33781b();
        }

        /* renamed from: c */
        public boolean mo33782c() {
            return this.f31671b.mo33782c();
        }

        /* renamed from: e */
        public C10375s0 mo38606e() {
            C10375s0 s0Var = this.f31670a;
            if (s0Var != null) {
                return s0Var;
            }
            m39597a(1);
            throw null;
        }

        public List<C10375s0> getParameters() {
            List<C10375s0> parameters = this.f31671b.getParameters();
            if (parameters != null) {
                return parameters;
            }
            m39597a(2);
            throw null;
        }

        /* renamed from: l */
        public C9333g mo35232l() {
            C9333g b = C10071a.m33892b((C10359m) this.f31670a);
            if (b != null) {
                return b;
            }
            m39597a(4);
            throw null;
        }
    }

    static {
        C10340z b = m39556b();
        f31664e = b;
        f31665f = Collections.singleton(b);
    }

    /* renamed from: a */
    private static /* synthetic */ void m39551a(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 6 || i == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C10096h m39554b(String str) {
        if (str != null) {
            return m39545a(str, false);
        }
        m39551a(2);
        throw null;
    }

    /* renamed from: c */
    public static C11901j0 m39559c(String str) {
        if (str != null) {
            return m39546a(str, (List<C11965u0>) Collections.emptyList());
        }
        m39551a(7);
        throw null;
    }

    /* renamed from: d */
    public static C11953s0 m39561d(String str) {
        if (str != null) {
            return m39555b("[ERROR : " + str + "]", f31661b);
        }
        m39551a(15);
        throw null;
    }

    /* renamed from: e */
    public static C11953s0 m39562e(String str) {
        if (str != null) {
            return m39555b(str, f31661b);
        }
        m39551a(16);
        throw null;
    }

    /* renamed from: f */
    public static C11901j0 m39563f(String str) {
        if (str != null) {
            return m39547a(str, m39562e(str));
        }
        m39551a(8);
        throw null;
    }

    /* renamed from: kotlin.h0.u.e.k0.k.u$a */
    /* compiled from: ErrorUtils */
    static class C11959a implements C10393y {
        C11959a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m39564a(int i) {
            String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3)];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i == 12) {
                objArr[1] = "getOriginal";
            } else if (i != 13) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
            if (oVar != null) {
                return null;
            }
            m39564a(10);
            throw null;
        }

        /* renamed from: a */
        public Collection<C9934b> mo35553a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
            if (bVar == null) {
                m39564a(2);
                throw null;
            } else if (lVar != null) {
                List a = C10529o.m35736a();
                if (a != null) {
                    return a;
                }
                m39564a(4);
                throw null;
            } else {
                m39564a(3);
                throw null;
            }
        }

        /* renamed from: a */
        public C10359m mo35404a() {
            return this;
        }

        /* renamed from: a */
        public boolean mo35560a(C10393y yVar) {
            if (yVar != null) {
                return false;
            }
            m39564a(11);
            throw null;
        }

        /* renamed from: b */
        public C10359m mo33762b() {
            return null;
        }

        public C10249g getAnnotations() {
            C10249g a = C10249g.f27910c.mo35429a();
            if (a != null) {
                return a;
            }
            m39564a(1);
            throw null;
        }

        public C9939f getName() {
            C9939f d = C9939f.m33304d("<ERROR MODULE>");
            if (d != null) {
                return d;
            }
            m39564a(5);
            throw null;
        }

        /* renamed from: l */
        public C9333g mo35561l() {
            C9329d G = C9329d.m30147G();
            if (G != null) {
                return G;
            }
            m39564a(13);
            throw null;
        }

        /* renamed from: a */
        public C10343e0 mo35554a(C9934b bVar) {
            if (bVar == null) {
                m39564a(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }
    }

    /* renamed from: b */
    private static C10340z m39556b() {
        C10340z a = C10340z.m34876a(f31661b, C10249g.f27910c.mo35429a(), C10388w.OPEN, C10397z0.f28192e, true, C9939f.m33304d("<ERROR PROPERTY>"), C10238b.C10239a.DECLARATION, C10362n0.f28175a, false, false, false, false, false, false);
        a.mo35577a(f31663d, (List<? extends C10375s0>) Collections.emptyList(), (C10358l0) null, (C10358l0) null);
        if (a != null) {
            return a;
        }
        m39551a(4);
        throw null;
    }

    /* renamed from: c */
    public static C10393y m39560c() {
        C10393y yVar = f31660a;
        if (yVar != null) {
            return yVar;
        }
        m39551a(19);
        throw null;
    }

    /* renamed from: a */
    public static C10342e m39549a(String str) {
        if (str != null) {
            return new C11961c(C9939f.m33304d("<ERROR CLASS: " + str + ">"));
        }
        m39551a(1);
        throw null;
    }

    /* renamed from: a */
    public static C10096h m39545a(String str, boolean z) {
        if (str == null) {
            m39551a(3);
            throw null;
        } else if (z) {
            return new C11963e(str, (C11959a) null);
        } else {
            return new C11962d(str, (C11959a) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C10360m0 m39557b(C11962d dVar) {
        if (dVar != null) {
            C11898a aVar = new C11898a(f31661b, dVar);
            aVar.m34423a((C10358l0) null, (C10358l0) null, (List<? extends C10375s0>) Collections.emptyList(), (List<C10386v0>) Collections.emptyList(), (C11824b0) m39559c("<ERROR FUNCTION RETURN TYPE>"), C10388w.OPEN, C10397z0.f28192e);
            return aVar;
        }
        m39551a(5);
        throw null;
    }

    /* renamed from: a */
    public static C11901j0 m39547a(String str, C11953s0 s0Var) {
        if (str == null) {
            m39551a(9);
            throw null;
        } else if (s0Var != null) {
            return new C11954t(s0Var, m39554b(str));
        } else {
            m39551a(10);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C11953s0 m39555b(String str, C11961c cVar) {
        if (str == null) {
            m39551a(17);
            throw null;
        } else if (cVar != null) {
            return new C11960b(cVar, str);
        } else {
            m39551a(18);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11901j0 m39546a(String str, List<C11965u0> list) {
        if (str == null) {
            m39551a(11);
            throw null;
        } else if (list != null) {
            return new C11954t(m39561d(str), m39554b(str), list, false);
        } else {
            m39551a(12);
            throw null;
        }
    }

    /* renamed from: b */
    private static boolean m39558b(C10359m mVar) {
        return mVar instanceof C11961c;
    }

    /* renamed from: a */
    public static boolean m39553a(C10359m mVar) {
        if (mVar == null) {
            return false;
        }
        return m39558b(mVar) || m39558b(mVar.mo33762b()) || mVar == f31660a;
    }

    /* renamed from: a */
    public static boolean m39552a(C11824b0 b0Var) {
        return b0Var != null && (b0Var.mo35227v0() instanceof C11964f);
    }
}
