package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import java.util.List;
import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9632s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9502g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10257k;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.t */
/* compiled from: typeEnhancement.kt */
public final class C9609t {

    /* renamed from: a */
    private static final C9548b f26493a;

    /* renamed from: b */
    private static final C9548b f26494b;

    static {
        C9934b bVar = C9632s.f26524j;
        C10202j.m34174a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        f26493a = new C9548b(bVar);
        C9934b bVar2 = C9632s.f26525k;
        C10202j.m34174a((Object) bVar2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        f26494b = new C9548b(bVar2);
    }

    /* renamed from: a */
    public static final C11824b0 m30996a(C11824b0 b0Var, C9113l<? super Integer, C9550d> lVar) {
        C10202j.m34178b(b0Var, "$this$enhance");
        C10202j.m34178b(lVar, "qualifiers");
        return m30994a(b0Var.mo38439x0(), lVar, 0).mo34134c();
    }

    /* renamed from: b */
    private static final <T> C9549c<T> m31000b(T t) {
        return new C9549c<>(t, f26493a);
    }

    /* renamed from: c */
    private static final <T> C9549c<T> m31001c(T t) {
        return new C9549c<>(t, (C10249g) null);
    }

    /* renamed from: a */
    public static final boolean m30999a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$hasEnhancedNullability");
        C10249g annotations = b0Var.getAnnotations();
        C9934b bVar = C9632s.f26524j;
        C10202j.m34174a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return annotations.mo33885a(bVar) != null;
    }

    /* renamed from: a */
    private static final C9586k m30994a(C11834e1 e1Var, C9113l<? super Integer, C9550d> lVar, int i) {
        C11834e1 e1Var2;
        boolean z = false;
        if (C11830d0.m38958a(e1Var)) {
            return new C9586k(e1Var, 1, false);
        }
        if (e1Var instanceof C11966v) {
            C11966v vVar = (C11966v) e1Var;
            C9604o a = m30995a(vVar.mo38609z0(), lVar, i, C9606q.FLEXIBLE_LOWER);
            C9604o a2 = m30995a(vVar.mo38607A0(), lVar, i, C9606q.FLEXIBLE_UPPER);
            boolean z2 = a.mo34132a() == a2.mo34132a();
            if (!C10485x.f28360a || z2) {
                if (a.mo34135d() || a2.mo34135d()) {
                    z = true;
                }
                C11824b0 a3 = C11828c1.m38951a(a.mo34133b());
                if (a3 == null) {
                    a3 = C11828c1.m38951a(a2.mo34133b());
                }
                if (z) {
                    if (e1Var instanceof C9502g) {
                        e1Var2 = new C9502g(a.mo34133b(), a2.mo34133b());
                    } else {
                        e1Var2 = C11827c0.m38946a(a.mo34133b(), a2.mo34133b());
                    }
                    e1Var = C11828c1.m38954b(e1Var2, a3);
                }
                return new C9586k(e1Var, a.mo34132a(), z);
            }
            throw new AssertionError("Different tree sizes of bounds: " + "lower = (" + vVar.mo38609z0() + ", " + a.mo34132a() + "), " + "upper = (" + vVar.mo38607A0() + ", " + a2.mo34132a() + ')');
        } else if (e1Var instanceof C11901j0) {
            return m30995a((C11901j0) e1Var, lVar, i, C9606q.INFLEXIBLE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9604o m30995a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0 r18, kotlin.p215c0.p216c.C9113l<? super java.lang.Integer, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d> r19, int r20, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9606q r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = m30998a((kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9606q) r21)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001e
            java.util.List r3 = r18.mo35226u0()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001e
            kotlin.h0.u.e.k0.c.a.d0.o r1 = new kotlin.h0.u.e.k0.c.a.d0.o
            r1.<init>(r0, r5, r4)
            return r1
        L_0x001e:
            kotlin.h0.u.e.k0.k.s0 r3 = r18.mo35227v0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.mo33781b()
            if (r3 == 0) goto L_0x014e
            java.lang.String r6 = "constructor.declarationD…pleResult(this, 1, false)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            java.lang.Object r6 = r1.invoke(r6)
            kotlin.h0.u.e.k0.c.a.d0.d r6 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r6
            kotlin.h0.u.e.k0.c.a.d0.c r3 = m30993a((kotlin.reflect.jvm.internal.impl.descriptors.C10349h) r3, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r6, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9606q) r2)
            java.lang.Object r7 = r3.mo34082a()
            kotlin.reflect.jvm.internal.impl.descriptors.h r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C10349h) r7
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r3 = r3.mo34083b()
            kotlin.h0.u.e.k0.k.s0 r8 = r7.mo33766h()
            java.lang.String r9 = "enhancedClassifier.typeConstructor"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r8, (java.lang.String) r9)
            int r10 = r20 + 1
            if (r3 == 0) goto L_0x0054
            r11 = 1
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            java.util.List r12 = r18.mo35226u0()
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = kotlin.p262y.C10531p.m35750a(r12, (int) r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
            r14 = 0
        L_0x0069:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x00dd
            java.lang.Object r15 = r12.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x00d8
            kotlin.h0.u.e.k0.k.u0 r15 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0) r15
            boolean r17 = r15.mo38597b()
            if (r17 == 0) goto L_0x0097
            int r10 = r10 + 1
            kotlin.h0.u.e.k0.k.s0 r15 = r7.mo33766h()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r15, (java.lang.String) r9)
            java.util.List r15 = r15.getParameters()
            java.lang.Object r14 = r15.get(r14)
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r14 = (kotlin.reflect.jvm.internal.impl.descriptors.C10375s0) r14
            kotlin.h0.u.e.k0.k.u0 r14 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1.m38905a((kotlin.reflect.jvm.internal.impl.descriptors.C10375s0) r14)
            goto L_0x00d0
        L_0x0097:
            kotlin.h0.u.e.k0.k.b0 r17 = r15.getType()
            kotlin.h0.u.e.k0.k.e1 r5 = r17.mo38439x0()
            kotlin.h0.u.e.k0.c.a.d0.k r5 = m30994a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1) r5, (kotlin.p215c0.p216c.C9113l<? super java.lang.Integer, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d>) r1, (int) r10)
            if (r11 != 0) goto L_0x00ae
            boolean r11 = r5.mo34135d()
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r11 = 0
            goto L_0x00af
        L_0x00ae:
            r11 = 1
        L_0x00af:
            int r17 = r5.mo34132a()
            int r10 = r10 + r17
            kotlin.h0.u.e.k0.k.b0 r5 = r5.mo34133b()
            kotlin.h0.u.e.k0.k.f1 r15 = r15.mo38596a()
            java.lang.String r4 = "arg.projectionKind"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r15, (java.lang.String) r4)
            java.util.List r4 = r8.getParameters()
            java.lang.Object r4 = r4.get(r14)
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C10375s0) r4
            kotlin.h0.u.e.k0.k.u0 r14 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a.m39414a(r5, r15, r4)
        L_0x00d0:
            r13.add(r14)
            r14 = r16
            r4 = 0
            r5 = 1
            goto L_0x0069
        L_0x00d8:
            kotlin.p262y.C10525m.m35693c()
            r0 = 0
            throw r0
        L_0x00dd:
            kotlin.h0.u.e.k0.c.a.d0.c r1 = m30992a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r6, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9606q) r2)
            java.lang.Object r2 = r1.mo34082a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r1 = r1.mo34083b()
            if (r11 != 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r4 = 0
            goto L_0x00f7
        L_0x00f6:
            r4 = 1
        L_0x00f7:
            int r10 = r10 - r20
            if (r4 != 0) goto L_0x0102
            kotlin.h0.u.e.k0.c.a.d0.o r1 = new kotlin.h0.u.e.k0.c.a.d0.o
            r4 = 0
            r1.<init>(r0, r10, r4)
            return r1
        L_0x0102:
            r4 = 0
            r5 = 3
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g[] r5 = new kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g[r5]
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r7 = r18.getAnnotations()
            r5[r4] = r7
            r4 = 1
            r5[r4] = r3
            r3 = 2
            r5[r3] = r1
            java.util.List r3 = kotlin.p262y.C10529o.m35743c(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r3 = m30997a((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g>) r3)
            kotlin.h0.u.e.k0.k.j0 r2 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0.m38948a(r3, r8, r13, r2)
            boolean r3 = r6.mo34089c()
            if (r3 == 0) goto L_0x012a
            kotlin.h0.u.e.k0.c.a.d0.f r3 = new kotlin.h0.u.e.k0.c.a.d0.f
            r3.<init>(r2)
            r2 = r3
        L_0x012a:
            if (r1 == 0) goto L_0x0134
            boolean r1 = r6.mo34090d()
            if (r1 == 0) goto L_0x0134
            r4 = 1
            goto L_0x0135
        L_0x0134:
            r4 = 0
        L_0x0135:
            if (r4 == 0) goto L_0x013b
            kotlin.h0.u.e.k0.k.e1 r2 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1.m38954b(r0, r2)
        L_0x013b:
            kotlin.h0.u.e.k0.c.a.d0.o r0 = new kotlin.h0.u.e.k0.c.a.d0.o
            if (r2 == 0) goto L_0x0146
            kotlin.h0.u.e.k0.k.j0 r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0) r2
            r1 = 1
            r0.<init>(r2, r10, r1)
            return r0
        L_0x0146:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            r0.<init>(r1)
            throw r0
        L_0x014e:
            r1 = 1
            kotlin.h0.u.e.k0.c.a.d0.o r2 = new kotlin.h0.u.e.k0.c.a.d0.o
            r3 = 0
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9609t.m30995a(kotlin.h0.u.e.k0.k.j0, kotlin.c0.c.l, int, kotlin.h0.u.e.k0.c.a.d0.q):kotlin.h0.u.e.k0.c.a.d0.o");
    }

    /* renamed from: a */
    private static final C10249g m30997a(List<? extends C10249g> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            return new C10257k((List<? extends C10249g>) C10539w.m35815n(list));
        } else {
            return (C10249g) C10539w.m35809i(list);
        }
    }

    /* renamed from: a */
    public static final boolean m30998a(C9606q qVar) {
        C10202j.m34178b(qVar, "$this$shouldEnhance");
        return qVar != C9606q.INFLEXIBLE;
    }

    /* renamed from: a */
    private static final <T> C9549c<T> m30991a(T t) {
        return new C9549c<>(t, f26494b);
    }

    /* renamed from: a */
    private static final C9549c<C10349h> m30993a(C10349h hVar, C9550d dVar, C9606q qVar) {
        if (!m30998a(qVar)) {
            return m31001c(hVar);
        }
        if (!(hVar instanceof C10342e)) {
            return m31001c(hVar);
        }
        C9367c cVar = C9367c.f26064m;
        C9552e a = dVar.mo34087a();
        if (a != null) {
            int i = C9608s.f26491a[a.ordinal()];
            if (i != 1) {
                if (i == 2 && qVar == C9606q.FLEXIBLE_UPPER) {
                    C10342e eVar = (C10342e) hVar;
                    if (cVar.mo33812d(eVar)) {
                        return m30991a(cVar.mo33807b(eVar));
                    }
                }
            } else if (qVar == C9606q.FLEXIBLE_LOWER) {
                C10342e eVar2 = (C10342e) hVar;
                if (cVar.mo33811c(eVar2)) {
                    return m30991a(cVar.mo33803a(eVar2));
                }
            }
        }
        return m31001c(hVar);
    }

    /* renamed from: a */
    private static final C9549c<Boolean> m30992a(C11824b0 b0Var, C9550d dVar, C9606q qVar) {
        if (!m30998a(qVar)) {
            return m31001c(Boolean.valueOf(b0Var.mo34094w0()));
        }
        C9554g b = dVar.mo34088b();
        if (b != null) {
            int i = C9608s.f26492b[b.ordinal()];
            if (i == 1) {
                return m31000b(true);
            }
            if (i == 2) {
                return m31000b(false);
            }
        }
        return m31001c(Boolean.valueOf(b0Var.mo34094w0()));
    }
}
