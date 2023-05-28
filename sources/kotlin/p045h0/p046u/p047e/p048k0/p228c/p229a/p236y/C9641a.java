package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10483v;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11777r;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9522i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9523j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9529p;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9530q;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9536v;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9539y;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10005g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.a */
/* compiled from: DescriptorResolverUtils */
public final class C9641a {
    /* renamed from: a */
    public static <D extends C10238b> Collection<D> m31093a(C9939f fVar, Collection<D> collection, Collection<D> collection2, C10342e eVar, C11777r rVar) {
        if (fVar == null) {
            m31096a(0);
            throw null;
        } else if (collection == null) {
            m31096a(1);
            throw null;
        } else if (collection2 == null) {
            m31096a(2);
            throw null;
        } else if (eVar == null) {
            m31096a(3);
            throw null;
        } else if (rVar != null) {
            return m31094a(fVar, collection, collection2, eVar, rVar, false);
        } else {
            m31096a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m31096a(int i) {
        String str = i != 15 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 15 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
            case 11:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 7:
            case 12:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 8:
            case 13:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 9:
            case 14:
                objArr[0] = "errorReporter";
                break;
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 17:
                objArr[0] = "annotationClass";
                break;
            case 18:
                objArr[0] = "member";
                break;
            case 19:
            case 20:
                objArr[0] = "method";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i != 15) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "resolveOverrides";
                break;
            case 15:
                break;
            case 16:
            case 17:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 18:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 19:
                objArr[2] = "isObjectMethod";
                break;
            case 20:
                objArr[2] = "isMethodWithOneObjectParameter";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 15 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static <D extends C10238b> Collection<D> m31099b(C9939f fVar, Collection<D> collection, Collection<D> collection2, C10342e eVar, C11777r rVar) {
        if (fVar == null) {
            m31096a(5);
            throw null;
        } else if (collection == null) {
            m31096a(6);
            throw null;
        } else if (collection2 == null) {
            m31096a(7);
            throw null;
        } else if (eVar == null) {
            m31096a(8);
            throw null;
        } else if (rVar != null) {
            return m31094a(fVar, collection, collection2, eVar, rVar, true);
        } else {
            m31096a(9);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.a$a */
    /* compiled from: DescriptorResolverUtils */
    static class C9642a extends C10005g {

        /* renamed from: a */
        final /* synthetic */ C11777r f26544a;

        /* renamed from: b */
        final /* synthetic */ Set f26545b;

        /* renamed from: c */
        final /* synthetic */ boolean f26546c;

        /* renamed from: kotlin.h0.u.e.k0.c.a.y.a$a$a */
        /* compiled from: DescriptorResolverUtils */
        class C9643a implements C9113l<C10238b, C10483v> {
            C9643a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m31105a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }

            /* renamed from: a */
            public C10483v invoke(C10238b bVar) {
                if (bVar != null) {
                    C9642a.this.f26544a.mo33674a(bVar);
                    return C10483v.f28357a;
                }
                m31105a(0);
                throw null;
            }
        }

        C9642a(C11777r rVar, Set set, boolean z) {
            this.f26544a = rVar;
            this.f26545b = set;
            this.f26546c = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m31101a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo34192a(C10238b bVar) {
            if (bVar != null) {
                C10007i.m33734a(bVar, (C9113l<C10238b, C10483v>) new C9643a());
                this.f26545b.add(bVar);
                return;
            }
            m31101a(0);
            throw null;
        }

        /* renamed from: c */
        public void mo34194c(C10238b bVar, C10238b bVar2) {
            if (bVar == null) {
                m31101a(1);
                throw null;
            } else if (bVar2 == null) {
                m31101a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34193a(C10238b bVar, Collection<? extends C10238b> collection) {
            if (bVar == null) {
                m31101a(3);
                throw null;
            } else if (collection == null) {
                m31101a(4);
                throw null;
            } else if (!this.f26546c || bVar.mo35423g() == C10238b.C10239a.FAKE_OVERRIDE) {
                super.mo34193a(bVar, collection);
            }
        }
    }

    /* renamed from: a */
    private static <D extends C10238b> Collection<D> m31094a(C9939f fVar, Collection<D> collection, Collection<D> collection2, C10342e eVar, C11777r rVar, boolean z) {
        if (fVar == null) {
            m31096a(10);
            throw null;
        } else if (collection == null) {
            m31096a(11);
            throw null;
        } else if (collection2 == null) {
            m31096a(12);
            throw null;
        } else if (eVar == null) {
            m31096a(13);
            throw null;
        } else if (rVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C10007i.m33732a(fVar, collection, collection2, eVar, new C9642a(rVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            m31096a(14);
            throw null;
        }
    }

    /* renamed from: b */
    private static boolean m31100b(C9530q qVar) {
        if (qVar != null) {
            String a = qVar.getName().mo35021a();
            if (a.equals("toString") || a.equals("hashCode")) {
                return qVar.mo34058f().isEmpty();
            }
            if (a.equals("equals")) {
                return m31098a(qVar);
            }
            return false;
        }
        m31096a(19);
        throw null;
    }

    /* renamed from: a */
    public static C10386v0 m31095a(C9939f fVar, C10342e eVar) {
        if (fVar == null) {
            m31096a(16);
            throw null;
        } else if (eVar != null) {
            Collection<C10273d> j = eVar.mo33769j();
            if (j.size() != 1) {
                return null;
            }
            for (C10386v0 next : j.iterator().next().mo35407f()) {
                if (next.getName().equals(fVar)) {
                    return next;
                }
            }
            return null;
        } else {
            m31096a(17);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m31097a(C9529p pVar) {
        if (pVar != null) {
            return pVar.mo34056H().mo34042z() && (pVar instanceof C9530q) && m31100b((C9530q) pVar);
        }
        m31096a(18);
        throw null;
    }

    /* renamed from: a */
    private static boolean m31098a(C9530q qVar) {
        C9934b c;
        if (qVar != null) {
            List<C9539y> f = qVar.mo34058f();
            if (f.size() == 1) {
                C9536v type = f.get(0).getType();
                if (type instanceof C9523j) {
                    C9522i b = ((C9523j) type).mo34044b();
                    if (!(b instanceof C9520g) || (c = ((C9520g) b).mo34036c()) == null || !c.mo34994a().equals("java.lang.Object")) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        m31096a(20);
        throw null;
    }
}
