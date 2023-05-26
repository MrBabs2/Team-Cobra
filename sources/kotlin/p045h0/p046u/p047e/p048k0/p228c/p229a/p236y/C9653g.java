package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9525l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9527n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9530q;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.g */
/* compiled from: JavaResolverCache */
public interface C9653g {

    /* renamed from: a */
    public static final C9653g f26574a = new C9654a();

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.g$a */
    /* compiled from: JavaResolverCache */
    static class C9654a implements C9653g {
        C9654a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m31129a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "method";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public C10342e mo34207a(C9934b bVar) {
            if (bVar != null) {
                return null;
            }
            m31129a(0);
            throw null;
        }

        /* renamed from: a */
        public void mo34208a(C9520g gVar, C10342e eVar) {
            if (gVar == null) {
                m31129a(7);
                throw null;
            } else if (eVar == null) {
                m31129a(8);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34209a(C9525l lVar, C10357l lVar2) {
            if (lVar == null) {
                m31129a(3);
                throw null;
            } else if (lVar2 == null) {
                m31129a(4);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34210a(C9527n nVar, C10352i0 i0Var) {
            if (nVar == null) {
                m31129a(5);
                throw null;
            } else if (i0Var == null) {
                m31129a(6);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34211a(C9530q qVar, C10360m0 m0Var) {
            if (qVar == null) {
                m31129a(1);
                throw null;
            } else if (m0Var == null) {
                m31129a(2);
                throw null;
            }
        }
    }

    /* renamed from: a */
    C10342e mo34207a(C9934b bVar);

    /* renamed from: a */
    void mo34208a(C9520g gVar, C10342e eVar);

    /* renamed from: a */
    void mo34209a(C9525l lVar, C10357l lVar2);

    /* renamed from: a */
    void mo34210a(C9527n nVar, C10352i0 i0Var);

    /* renamed from: a */
    void mo34211a(C9530q qVar, C10360m0 m0Var);
}
