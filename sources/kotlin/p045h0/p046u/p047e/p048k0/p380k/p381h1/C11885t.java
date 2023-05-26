package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10485x;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10048n;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11938m0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.h1.t */
/* compiled from: IntersectionType.kt */
public final class C11885t {

    /* renamed from: a */
    public static final C11885t f31602a = new C11885t();

    /* renamed from: kotlin.h0.u.e.k0.k.h1.t$a */
    /* compiled from: IntersectionType.kt */
    private enum C11886a {
        ;

        /* renamed from: kotlin.h0.u.e.k0.k.h1.t$a$a */
        /* compiled from: IntersectionType.kt */
        static final class C11887a extends C11886a {
            C11887a(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11886a mo38558a(C11834e1 e1Var) {
                C10202j.m34178b(e1Var, "nextType");
                return mo38559b(e1Var);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h1.t$a$b */
        /* compiled from: IntersectionType.kt */
        static final class C11888b extends C11886a {
            C11888b(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11888b mo38558a(C11834e1 e1Var) {
                C10202j.m34178b(e1Var, "nextType");
                return this;
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h1.t$a$c */
        /* compiled from: IntersectionType.kt */
        static final class C11889c extends C11886a {
            C11889c(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11886a mo38558a(C11834e1 e1Var) {
                C10202j.m34178b(e1Var, "nextType");
                return mo38559b(e1Var);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h1.t$a$d */
        /* compiled from: IntersectionType.kt */
        static final class C11890d extends C11886a {
            C11890d(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11886a mo38558a(C11834e1 e1Var) {
                C10202j.m34178b(e1Var, "nextType");
                C11886a b = mo38559b(e1Var);
                return b == C11886a.f31604g ? this : b;
            }
        }

        /* renamed from: a */
        public abstract C11886a mo38558a(C11834e1 e1Var);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C11886a mo38559b(C11834e1 e1Var) {
            C10202j.m34178b(e1Var, "$this$resultNullability");
            if (e1Var.mo34094w0()) {
                return f31604g;
            }
            if (C11876m.f31590a.mo38545a(e1Var)) {
                return f31606i;
            }
            return f31605h;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h1.t$b */
    /* compiled from: IntersectionType.kt */
    static final class C11891b extends C10203k implements C9102a<String> {

        /* renamed from: f */
        final /* synthetic */ Set f31608f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11891b(Set set) {
            super(0);
            this.f31608f = set;
        }

        public final String invoke() {
            return "This collections cannot be empty! input types: " + C10539w.m35773a(this.f31608f, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h1.t$c */
    /* compiled from: IntersectionType.kt */
    static final /* synthetic */ class C11892c extends C10200h implements C9117p<C11824b0, C11824b0, Boolean> {
        C11892c(C11885t tVar) {
            super(2, tVar);
        }

        /* renamed from: a */
        public final boolean mo38560a(C11824b0 b0Var, C11824b0 b0Var2) {
            C10202j.m34178b(b0Var, "p1");
            C10202j.m34178b(b0Var2, "p2");
            return ((C11885t) this.receiver).m39273a(b0Var, b0Var2);
        }

        public final String getName() {
            return "isStrictSupertype";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11885t.class);
        }

        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo38560a((C11824b0) obj, (C11824b0) obj2));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h1.t$d */
    /* compiled from: IntersectionType.kt */
    static final /* synthetic */ class C11893d extends C10200h implements C9117p<C11824b0, C11824b0, Boolean> {
        C11893d(C11875l lVar) {
            super(2, lVar);
        }

        /* renamed from: a */
        public final boolean mo38561a(C11824b0 b0Var, C11824b0 b0Var2) {
            C10202j.m34178b(b0Var, "p1");
            C10202j.m34178b(b0Var2, "p2");
            return ((C11875l) this.receiver).mo38535a(b0Var, b0Var2);
        }

        public final String getName() {
            return "equalTypes";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11875l.class);
        }

        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo38561a((C11824b0) obj, (C11824b0) obj2));
        }
    }

    private C11885t() {
    }

    /* renamed from: a */
    public final C11901j0 mo38557a(List<? extends C11901j0> list) {
        C10202j.m34178b(list, "types");
        boolean z = list.size() > 1;
        if (!C10485x.f28360a || z) {
            ArrayList<C11834e1> arrayList = new ArrayList<>();
            for (C11901j0 j0Var : list) {
                if (j0Var.mo35227v0() instanceof C11819a0) {
                    Collection<C11824b0> a = j0Var.mo35227v0().mo35229a();
                    C10202j.m34174a((Object) a, "type.constructor.supertypes");
                    ArrayList arrayList2 = new ArrayList(C10531p.m35750a(a, 10));
                    for (C11824b0 b0Var : a) {
                        C10202j.m34174a((Object) b0Var, "it");
                        C11901j0 d = C11975y.m39646d(b0Var);
                        if (j0Var.mo34094w0()) {
                            d = d.mo34007a(true);
                        }
                        arrayList2.add(d);
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    arrayList.add(j0Var);
                }
            }
            C11886a aVar = C11886a.f31603f;
            for (C11834e1 a2 : arrayList) {
                aVar = aVar.mo38558a(a2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11901j0 j0Var2 = (C11901j0) it.next();
                if (aVar == C11886a.f31606i) {
                    j0Var2 = C11938m0.m39470a(j0Var2);
                }
                linkedHashSet.add(j0Var2);
            }
            return m39272a((Set<? extends C11901j0>) linkedHashSet);
        }
        throw new AssertionError("Size should be at least 2, but it is " + list.size());
    }

    /* renamed from: a */
    private final C11901j0 m39272a(Set<? extends C11901j0> set) {
        if (set.size() == 1) {
            return (C11901j0) C10539w.m35810j(set);
        }
        C11891b bVar = new C11891b(set);
        Collection<C11901j0> a = m39271a((Collection<? extends C11901j0>) set, (C9117p<? super C11901j0, ? super C11901j0, Boolean>) new C11892c(this));
        boolean z = !a.isEmpty();
        if (!C10485x.f28360a || z) {
            C11901j0 a2 = C10048n.f27634g.mo35256a(a);
            if (a2 != null) {
                return a2;
            }
            Collection<C11901j0> a3 = m39271a((Collection<? extends C11901j0>) a, (C9117p<? super C11901j0, ? super C11901j0, Boolean>) new C11893d(C11875l.f31589b));
            boolean isEmpty = true ^ a3.isEmpty();
            if (C10485x.f28360a && !isEmpty) {
                throw new AssertionError(bVar.invoke());
            } else if (a3.size() < 2) {
                return (C11901j0) C10539w.m35810j(a3);
            } else {
                C11819a0 a0Var = new C11819a0(set);
                return C11827c0.m38949a(C10249g.f27910c.mo35429a(), a0Var, C10529o.m35736a(), false, a0Var.mo38429e());
            }
        } else {
            throw new AssertionError(bVar.invoke());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:16:0x0051 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0> m39271a(java.util.Collection<? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0> r8, kotlin.p215c0.p216c.C9117p<? super kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0, ? super kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r8, (java.lang.String) r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            kotlin.h0.u.e.k0.k.j0 r1 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0024
        L_0x0022:
            r3 = 0
            goto L_0x0051
        L_0x0024:
            java.util.Iterator r2 = r0.iterator()
        L_0x0028:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r2.next()
            kotlin.h0.u.e.k0.k.j0 r5 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0) r5
            if (r5 == r1) goto L_0x004e
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0028
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11885t.m39271a(java.util.Collection, kotlin.c0.c.p):java.util.Collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m39273a(C11824b0 b0Var, C11824b0 b0Var2) {
        C11875l lVar = C11875l.f31589b;
        return lVar.mo38536b(b0Var, b0Var2) && !lVar.mo38536b(b0Var2, b0Var);
    }
}
