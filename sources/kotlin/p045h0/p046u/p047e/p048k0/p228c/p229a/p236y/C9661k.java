package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9530q;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.k */
/* compiled from: SignaturePropagator */
public interface C9661k {

    /* renamed from: a */
    public static final C9661k f26582a = new C9662a();

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.k$b */
    /* compiled from: SignaturePropagator */
    public static class C9663b {

        /* renamed from: a */
        private final C11824b0 f26583a;

        /* renamed from: b */
        private final C11824b0 f26584b;

        /* renamed from: c */
        private final List<C10386v0> f26585c;

        /* renamed from: d */
        private final List<C10375s0> f26586d;

        /* renamed from: e */
        private final List<String> f26587e;

        /* renamed from: f */
        private final boolean f26588f;

        public C9663b(C11824b0 b0Var, C11824b0 b0Var2, List<C10386v0> list, List<C10375s0> list2, List<String> list3, boolean z) {
            if (b0Var == null) {
                m31142a(0);
                throw null;
            } else if (list == null) {
                m31142a(1);
                throw null;
            } else if (list2 == null) {
                m31142a(2);
                throw null;
            } else if (list3 != null) {
                this.f26583a = b0Var;
                this.f26584b = b0Var2;
                this.f26585c = list;
                this.f26586d = list2;
                this.f26587e = list3;
                this.f26588f = z;
            } else {
                m31142a(3);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m31142a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public List<String> mo34214a() {
            List<String> list = this.f26587e;
            if (list != null) {
                return list;
            }
            m31142a(7);
            throw null;
        }

        /* renamed from: b */
        public C11824b0 mo34215b() {
            return this.f26584b;
        }

        /* renamed from: c */
        public C11824b0 mo34216c() {
            C11824b0 b0Var = this.f26583a;
            if (b0Var != null) {
                return b0Var;
            }
            m31142a(4);
            throw null;
        }

        /* renamed from: d */
        public List<C10375s0> mo34217d() {
            List<C10375s0> list = this.f26586d;
            if (list != null) {
                return list;
            }
            m31142a(6);
            throw null;
        }

        /* renamed from: e */
        public List<C10386v0> mo34218e() {
            List<C10386v0> list = this.f26585c;
            if (list != null) {
                return list;
            }
            m31142a(5);
            throw null;
        }

        /* renamed from: f */
        public boolean mo34219f() {
            return this.f26588f;
        }
    }

    /* renamed from: a */
    C9663b mo34212a(C9530q qVar, C10342e eVar, C11824b0 b0Var, C11824b0 b0Var2, List<C10386v0> list, List<C10375s0> list2);

    /* renamed from: a */
    void mo34213a(C10238b bVar, List<String> list);

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.k$a */
    /* compiled from: SignaturePropagator */
    static class C9662a implements C9661k {
        C9662a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m31139a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public C9663b mo34212a(C9530q qVar, C10342e eVar, C11824b0 b0Var, C11824b0 b0Var2, List<C10386v0> list, List<C10375s0> list2) {
            if (qVar == null) {
                m31139a(0);
                throw null;
            } else if (eVar == null) {
                m31139a(1);
                throw null;
            } else if (b0Var == null) {
                m31139a(2);
                throw null;
            } else if (list == null) {
                m31139a(3);
                throw null;
            } else if (list2 != null) {
                return new C9663b(b0Var, b0Var2, list, list2, Collections.emptyList(), false);
            } else {
                m31139a(4);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34213a(C10238b bVar, List<String> list) {
            if (bVar == null) {
                m31139a(5);
                throw null;
            } else if (list == null) {
                m31139a(6);
                throw null;
            } else {
                throw new UnsupportedOperationException("Should not be called");
            }
        }
    }
}
