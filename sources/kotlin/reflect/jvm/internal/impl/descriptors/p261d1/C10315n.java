package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10483v;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10005g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10100i;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11811c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11900j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n */
/* compiled from: EnumEntrySyntheticClassDescriptor */
public class C10315n extends C10298g {

    /* renamed from: m */
    private final C11953s0 f28027m;

    /* renamed from: n */
    private final C10096h f28028n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C11814f<Set<C9939f>> f28029o;

    /* renamed from: p */
    private final C10249g f28030p;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n$a */
    /* compiled from: EnumEntrySyntheticClassDescriptor */
    private class C10316a extends C10100i {

        /* renamed from: b */
        private final C11811c<C9939f, Collection<? extends C10360m0>> f28031b;

        /* renamed from: c */
        private final C11811c<C9939f, Collection<? extends C10352i0>> f28032c;

        /* renamed from: d */
        private final C11814f<Collection<C10359m>> f28033d;

        /* renamed from: e */
        final /* synthetic */ C10315n f28034e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n$a$a */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C10317a implements C9113l<C9939f, Collection<? extends C10360m0>> {
            C10317a(C10315n nVar) {
            }

            /* renamed from: a */
            public Collection<? extends C10360m0> invoke(C9939f fVar) {
                return C10316a.this.m34622a(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n$a$b */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C10318b implements C9113l<C9939f, Collection<? extends C10352i0>> {
            C10318b(C10315n nVar) {
            }

            /* renamed from: a */
            public Collection<? extends C10352i0> invoke(C9939f fVar) {
                return C10316a.this.m34627b(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n$a$c */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C10319c implements C9102a<Collection<C10359m>> {
            C10319c(C10315n nVar) {
            }

            public Collection<C10359m> invoke() {
                return C10316a.this.m34629c();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.n$a$d */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C10320d extends C10005g {

            /* renamed from: a */
            final /* synthetic */ Set f28038a;

            C10320d(C10316a aVar, Set set) {
                this.f28038a = set;
            }

            /* renamed from: a */
            private static /* synthetic */ void m34638a(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* renamed from: a */
            public void mo34192a(C10238b bVar) {
                if (bVar != null) {
                    C10007i.m33734a(bVar, (C9113l<C10238b, C10483v>) null);
                    this.f28038a.add(bVar);
                    return;
                }
                m34638a(0);
                throw null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public void mo34194c(C10238b bVar, C10238b bVar2) {
                if (bVar == null) {
                    m34638a(1);
                    throw null;
                } else if (bVar2 == null) {
                    m34638a(2);
                    throw null;
                }
            }
        }

        public C10316a(C10315n nVar, C11817i iVar) {
            if (iVar != null) {
                this.f28034e = nVar;
                this.f28031b = iVar.mo38399a(new C10317a(nVar));
                this.f28032c = iVar.mo38399a(new C10318b(nVar));
                this.f28033d = iVar.mo38401a(new C10319c(nVar));
                return;
            }
            m34626a(0);
            throw null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m34626a(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: d */
        private C10096h m34630d() {
            C10096h m = this.f28034e.mo33766h().mo35229a().iterator().next().mo34008m();
            if (m != null) {
                return m;
            }
            m34626a(9);
            throw null;
        }

        /* renamed from: c */
        public Collection<? extends C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m34626a(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C10352i0> invoke = this.f28032c.invoke(fVar);
                if (invoke != null) {
                    return invoke;
                }
                m34626a(3);
                throw null;
            } else {
                m34626a(2);
                throw null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<? extends C10352i0> m34627b(C9939f fVar) {
            if (fVar != null) {
                return m34623a(fVar, m34630d().mo33918c(fVar, C9401d.FOR_NON_TRACKED_SCOPE));
            }
            m34626a(4);
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public Collection<C10359m> m34629c() {
            HashSet hashSet = new HashSet();
            for (C9939f fVar : (Set) this.f28034e.f28029o.invoke()) {
                hashSet.addAll(mo33913a(fVar, (C9398b) C9401d.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(mo33918c(fVar, C9401d.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        /* renamed from: a */
        public Collection<? extends C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
            if (fVar == null) {
                m34626a(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C10360m0> invoke = this.f28031b.invoke(fVar);
                if (invoke != null) {
                    return invoke;
                }
                m34626a(7);
                throw null;
            } else {
                m34626a(6);
                throw null;
            }
        }

        /* renamed from: b */
        public Set<C9939f> mo33916b() {
            Set<C9939f> set = (Set) this.f28034e.f28029o.invoke();
            if (set != null) {
                return set;
            }
            m34626a(19);
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<? extends C10360m0> m34622a(C9939f fVar) {
            if (fVar != null) {
                return m34623a(fVar, m34630d().mo33913a(fVar, C9401d.FOR_NON_TRACKED_SCOPE));
            }
            m34626a(8);
            throw null;
        }

        /* renamed from: a */
        private <D extends C10238b> Collection<? extends D> m34623a(C9939f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                m34626a(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C10007i.m33732a(fVar, collection, Collections.emptySet(), this.f28034e, new C10320d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                m34626a(11);
                throw null;
            }
        }

        /* renamed from: a */
        public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
            if (dVar == null) {
                m34626a(13);
                throw null;
            } else if (lVar != null) {
                Collection<C10359m> collection = (Collection) this.f28033d.invoke();
                if (collection != null) {
                    return collection;
                }
                m34626a(15);
                throw null;
            } else {
                m34626a(14);
                throw null;
            }
        }

        /* renamed from: a */
        public Set<C9939f> mo33915a() {
            Set<C9939f> set = (Set) this.f28034e.f28029o.invoke();
            if (set != null) {
                return set;
            }
            m34626a(17);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10315n(C11817i iVar, C10342e eVar, C11824b0 b0Var, C9939f fVar, C11814f<Set<C9939f>> fVar2, C10249g gVar, C10362n0 n0Var) {
        super(iVar, eVar, fVar, n0Var, false);
        if (iVar == null) {
            m34606a(6);
            throw null;
        } else if (eVar == null) {
            m34606a(7);
            throw null;
        } else if (b0Var == null) {
            m34606a(8);
            throw null;
        } else if (fVar == null) {
            m34606a(9);
            throw null;
        } else if (fVar2 == null) {
            m34606a(10);
            throw null;
        } else if (gVar == null) {
            m34606a(11);
            throw null;
        } else if (n0Var != null) {
            this.f28030p = gVar;
            this.f28027m = new C11900j(this, Collections.emptyList(), Collections.singleton(b0Var), iVar);
            this.f28028n = new C10316a(this, iVar);
            this.f28029o = fVar2;
        } else {
            m34606a(12);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34606a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getConstructors";
                break;
            case 16:
                objArr[1] = "getTypeConstructor";
                break;
            case 17:
                objArr[1] = "getKind";
                break;
            case 18:
                objArr[1] = "getModality";
                break;
            case 19:
                objArr[1] = "getVisibility";
                break;
            case 20:
                objArr[1] = "getAnnotations";
                break;
            case 21:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 22:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: E */
    public Collection<C10342e> mo33757E() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34606a(22);
        throw null;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* renamed from: L */
    public C10273d mo33759L() {
        return null;
    }

    /* renamed from: M */
    public C10096h mo33760M() {
        C10096h.C10099b bVar = C10096h.C10099b.f27722b;
        if (bVar != null) {
            return bVar;
        }
        m34606a(14);
        throw null;
    }

    /* renamed from: O */
    public C10342e mo33761O() {
        return null;
    }

    /* renamed from: g */
    public C10345f mo33763g() {
        C10345f fVar = C10345f.ENUM_ENTRY;
        if (fVar != null) {
            return fVar;
        }
        m34606a(17);
        throw null;
    }

    public C10249g getAnnotations() {
        C10249g gVar = this.f28030p;
        if (gVar != null) {
            return gVar;
        }
        m34606a(20);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = C10397z0.f28192e;
        if (a1Var != null) {
            return a1Var;
        }
        m34606a(19);
        throw null;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        C11953s0 s0Var = this.f28027m;
        if (s0Var != null) {
            return s0Var;
        }
        m34606a(16);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = C10388w.FINAL;
        if (wVar != null) {
            return wVar;
        }
        m34606a(18);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public Collection<C10273d> mo33769j() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34606a(15);
        throw null;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return false;
    }

    /* renamed from: n0 */
    public C10096h mo33771n0() {
        C10096h hVar = this.f28028n;
        if (hVar != null) {
            return hVar;
        }
        m34606a(13);
        throw null;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* renamed from: r0 */
    public boolean mo33775r0() {
        return false;
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        List<C10375s0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34606a(21);
        throw null;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    /* renamed from: v */
    public boolean mo33779v() {
        return false;
    }

    /* renamed from: a */
    public static C10315n m34605a(C11817i iVar, C10342e eVar, C9939f fVar, C11814f<Set<C9939f>> fVar2, C10249g gVar, C10362n0 n0Var) {
        if (iVar == null) {
            m34606a(0);
            throw null;
        } else if (eVar == null) {
            m34606a(1);
            throw null;
        } else if (fVar == null) {
            m34606a(2);
            throw null;
        } else if (fVar2 == null) {
            m34606a(3);
            throw null;
        } else if (gVar == null) {
            m34606a(4);
            throw null;
        } else if (n0Var != null) {
            return new C10315n(iVar, eVar, eVar.mo35445o(), fVar, fVar2, gVar, n0Var);
        } else {
            m34606a(5);
            throw null;
        }
    }
}
