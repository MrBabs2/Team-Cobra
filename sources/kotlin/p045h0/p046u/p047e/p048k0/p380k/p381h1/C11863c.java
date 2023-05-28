package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10023a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10048n;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11925l;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11950r;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11903b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11904c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11905d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11906e;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11907f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11914m;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11918p;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11921r;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10391x;

/* renamed from: kotlin.h0.u.e.k0.k.h1.c */
/* compiled from: ClassicTypeSystemContext.kt */
public interface C11863c extends C11918p {
    /* renamed from: a */
    C11910i mo38499a(C11908g gVar);

    /* renamed from: a */
    C11913l mo38503a(C11910i iVar);

    /* renamed from: kotlin.h0.u.e.k0.k.h1.c$a */
    /* compiled from: ClassicTypeSystemContext.kt */
    public static final class C11864a {
        /* renamed from: a */
        public static int m39109a(C11863c cVar, C11911j jVar) {
            C10202j.m34178b(jVar, "$this$size");
            return C11918p.C11919a.m39387a((C11918p) cVar, jVar);
        }

        /* renamed from: a */
        public static List<C11910i> m39110a(C11863c cVar, C11910i iVar, C11913l lVar) {
            C10202j.m34178b(iVar, "$this$fastCorrespondingSupertypes");
            C10202j.m34178b(lVar, "constructor");
            return C11918p.C11919a.m39388a((C11918p) cVar, iVar, lVar);
        }

        /* renamed from: a */
        public static C11910i m39117a(C11863c cVar, C11910i iVar, boolean z) {
            C10202j.m34178b(iVar, "$this$withNullability");
            if (iVar instanceof C11901j0) {
                return ((C11901j0) iVar).mo34007a(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11912k m39120a(C11863c cVar, C11910i iVar, int i) {
            C10202j.m34178b(iVar, "$this$getArgumentOrNull");
            return C11918p.C11919a.m39389a((C11918p) cVar, iVar, i);
        }

        /* renamed from: a */
        public static C11912k m39121a(C11863c cVar, C11911j jVar, int i) {
            C10202j.m34178b(jVar, "$this$get");
            return C11918p.C11919a.m39390a((C11918p) cVar, jVar, i);
        }

        /* renamed from: b */
        public static C11907f m39128b(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$asFlexibleType");
            if (gVar instanceof C11824b0) {
                C11834e1 x0 = ((C11824b0) gVar).mo38439x0();
                if (!(x0 instanceof C11966v)) {
                    x0 = null;
                }
                return (C11966v) x0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C11910i m39134c(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$asSimpleType");
            if (gVar instanceof C11824b0) {
                C11834e1 x0 = ((C11824b0) gVar).mo38439x0();
                if (!(x0 instanceof C11901j0)) {
                    x0 = null;
                }
                return (C11901j0) x0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: d */
        public static boolean m39138d(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isClassType");
            return C11918p.C11919a.m39392a((C11918p) cVar, iVar);
        }

        /* renamed from: d */
        public static boolean m39139d(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isDenotable");
            if (lVar instanceof C11953s0) {
                return ((C11953s0) lVar).mo33782c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: e */
        public static boolean m39140e(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$hasFlexibleNullability");
            return C11918p.C11919a.m39391a((C11918p) cVar, gVar);
        }

        /* renamed from: e */
        public static boolean m39141e(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isIntegerLiteralType");
            return C11918p.C11919a.m39394b((C11918p) cVar, iVar);
        }

        /* renamed from: e */
        public static boolean m39142e(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isIntegerLiteralTypeConstructor");
            if (lVar instanceof C11953s0) {
                return lVar instanceof C10048n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: f */
        public static boolean m39143f(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isDefinitelyNotNullType");
            return C11918p.C11919a.m39393b((C11918p) cVar, gVar);
        }

        /* renamed from: f */
        public static boolean m39145f(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isIntersection");
            if (lVar instanceof C11953s0) {
                return lVar instanceof C11819a0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: g */
        public static boolean m39146g(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isDynamic");
            return C11918p.C11919a.m39395c(cVar, gVar);
        }

        /* renamed from: g */
        public static boolean m39148g(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isNothingConstructor");
            if (lVar instanceof C11953s0) {
                return C9333g.m30171a((C11953s0) lVar, C9333g.f25907k.f25946b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: h */
        public static boolean m39150h(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isError");
            if (gVar instanceof C11824b0) {
                return C11830d0.m38958a((C11824b0) gVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: i */
        public static Collection<C11908g> m39152i(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$possibleIntegerTypes");
            C11913l a = cVar.mo38503a(iVar);
            if (a instanceof C10048n) {
                return ((C10048n) a).mo35254e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: i */
        public static boolean m39154i(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isNothing");
            return C11918p.C11919a.m39396d(cVar, gVar);
        }

        /* renamed from: j */
        public static C11913l m39155j(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$typeConstructor");
            if (iVar instanceof C11901j0) {
                return ((C11901j0) iVar).mo35227v0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: k */
        public static C11910i m39157k(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$lowerBoundIfFlexible");
            return C11918p.C11919a.m39397e(cVar, gVar);
        }

        /* renamed from: l */
        public static C11913l m39158l(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$typeConstructor");
            return C11918p.C11919a.m39398f(cVar, gVar);
        }

        /* renamed from: m */
        public static C11910i m39159m(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$upperBoundIfFlexible");
            return C11918p.C11919a.m39399g(cVar, gVar);
        }

        /* renamed from: a */
        public static C11908g m39114a(C11863c cVar, C11904c cVar2) {
            C10202j.m34178b(cVar2, "$this$lowerType");
            if (cVar2 instanceof C11872i) {
                return ((C11872i) cVar2).mo38538y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar2 + ", " + C10216x.m34186a((Class) cVar2.getClass())).toString());
        }

        /* renamed from: b */
        public static C11910i m39129b(C11863c cVar, C11907f fVar) {
            C10202j.m34178b(fVar, "$this$lowerBound");
            if (fVar instanceof C11966v) {
                return ((C11966v) fVar).mo38609z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C10216x.m34186a((Class) fVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C11910i m39133c(C11863c cVar, C11907f fVar) {
            C10202j.m34178b(fVar, "$this$upperBound");
            if (fVar instanceof C11966v) {
                return ((C11966v) fVar).mo38607A0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C10216x.m34186a((Class) fVar.getClass())).toString());
        }

        /* renamed from: d */
        public static C11912k m39137d(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$asTypeArgument");
            if (gVar instanceof C11824b0) {
                return C11924a.m39413a((C11824b0) gVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: f */
        public static boolean m39144f(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isMarkedNullable");
            if (iVar instanceof C11901j0) {
                return ((C11901j0) iVar).mo34094w0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: g */
        public static boolean m39147g(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isSingleClassifierType");
            if (iVar instanceof C11901j0) {
                if (!C11830d0.m38958a((C11824b0) iVar)) {
                    C11901j0 j0Var = (C11901j0) iVar;
                    return !(j0Var.mo35227v0().mo33781b() instanceof C10373r0) && (j0Var.mo35227v0().mo33781b() != null || (iVar instanceof C10023a) || (iVar instanceof C11872i) || (iVar instanceof C11925l) || (j0Var.mo35227v0() instanceof C10048n));
                }
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: h */
        public static boolean m39151h(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isStubType");
            if (iVar instanceof C11901j0) {
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: j */
        public static boolean m39156j(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isNullableType");
            if (gVar instanceof C11824b0) {
                return C11821a1.m38916g((C11824b0) gVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: i */
        public static Collection<C11908g> m39153i(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$supertypes");
            if (lVar instanceof C11953s0) {
                Collection<C11824b0> a = ((C11953s0) lVar).mo35229a();
                C10202j.m34174a((Object) a, "this.supertypes");
                return a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: h */
        public static int m39149h(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$parametersCount");
            if (lVar instanceof C11953s0) {
                return ((C11953s0) lVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m39124a(C11863c cVar, C11910i iVar, C11910i iVar2) {
            C10202j.m34178b(iVar, "a");
            C10202j.m34178b(iVar2, "b");
            if (!(iVar instanceof C11901j0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
            } else if (iVar2 instanceof C11901j0) {
                return ((C11901j0) iVar).mo35226u0() == ((C11901j0) iVar2).mo35226u0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar2 + ", " + C10216x.m34186a((Class) iVar2.getClass())).toString());
            }
        }

        /* renamed from: b */
        public static C11904c m39127b(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$asCapturedType");
            if (iVar instanceof C11901j0) {
                if (!(iVar instanceof C11872i)) {
                    iVar = null;
                }
                return (C11872i) iVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C11905d m39132c(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$asDefinitelyNotNullType");
            if (iVar instanceof C11901j0) {
                if (!(iVar instanceof C11925l)) {
                    iVar = null;
                }
                return (C11925l) iVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: b */
        public static C11921r m39130b(C11863c cVar, C11912k kVar) {
            C10202j.m34178b(kVar, "$this$getVariance");
            if (kVar instanceof C11965u0) {
                C11838f1 a = ((C11965u0) kVar).mo38596a();
                C10202j.m34174a((Object) a, "this.projectionKind");
                return C11866e.m39160a(a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C10216x.m34186a((Class) kVar.getClass())).toString());
        }

        /* renamed from: c */
        public static boolean m39135c(C11863c cVar, C11912k kVar) {
            C10202j.m34178b(kVar, "$this$isStarProjection");
            if (kVar instanceof C11965u0) {
                return ((C11965u0) kVar).mo38597b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C10216x.m34186a((Class) kVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11906e m39112a(C11863c cVar, C11907f fVar) {
            C10202j.m34178b(fVar, "$this$asDynamicType");
            if (fVar instanceof C11966v) {
                if (!(fVar instanceof C11950r)) {
                    fVar = null;
                }
                return (C11950r) fVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C10216x.m34186a((Class) fVar.getClass())).toString());
        }

        /* renamed from: b */
        public static boolean m39131b(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isClassTypeConstructor");
            if (lVar instanceof C11953s0) {
                return ((C11953s0) lVar).mo33781b() instanceof C10342e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: c */
        public static boolean m39136c(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isCommonFinalClassConstructor");
            if (lVar instanceof C11953s0) {
                C10349h b = ((C11953s0) lVar).mo33781b();
                if (!(b instanceof C10342e)) {
                    b = null;
                }
                C10342e eVar = (C10342e) b;
                if (eVar == null || !C10391x.m35074a(eVar) || eVar.mo33763g() == C10345f.ENUM_ENTRY || eVar.mo33763g() == C10345f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: a */
        public static int m39108a(C11863c cVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$argumentsCount");
            if (gVar instanceof C11824b0) {
                return ((C11824b0) gVar).mo35226u0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11912k m39119a(C11863c cVar, C11908g gVar, int i) {
            C10202j.m34178b(gVar, "$this$getArgument");
            if (gVar instanceof C11824b0) {
                return ((C11824b0) gVar).mo35226u0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C10216x.m34186a((Class) gVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11908g m39115a(C11863c cVar, C11912k kVar) {
            C10202j.m34178b(kVar, "$this$getType");
            if (kVar instanceof C11965u0) {
                return ((C11965u0) kVar).getType().mo38439x0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C10216x.m34186a((Class) kVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11914m m39122a(C11863c cVar, C11913l lVar, int i) {
            C10202j.m34178b(lVar, "$this$getParameter");
            if (lVar instanceof C11953s0) {
                C10375s0 s0Var = ((C11953s0) lVar).getParameters().get(i);
                C10202j.m34174a((Object) s0Var, "this.parameters[index]");
                return s0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11921r m39123a(C11863c cVar, C11914m mVar) {
            C10202j.m34178b(mVar, "$this$getVariance");
            if (mVar instanceof C10375s0) {
                C11838f1 G = ((C10375s0) mVar).mo35439G();
                C10202j.m34174a((Object) G, "this.variance");
                return C11866e.m39160a(G);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C10216x.m34186a((Class) mVar.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m39126a(C11863c cVar, C11913l lVar, C11913l lVar2) {
            C10202j.m34178b(lVar, "c1");
            C10202j.m34178b(lVar2, "c2");
            if (!(lVar instanceof C11953s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
            } else if (lVar2 instanceof C11953s0) {
                return C10202j.m34176a((Object) lVar, (Object) lVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar2 + ", " + C10216x.m34186a((Class) lVar2.getClass())).toString());
            }
        }

        /* renamed from: a */
        public static C11911j m39118a(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$asArgumentList");
            if (iVar instanceof C11901j0) {
                return (C11911j) iVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11910i m39116a(C11863c cVar, C11910i iVar, C11903b bVar) {
            C10202j.m34178b(iVar, "type");
            C10202j.m34178b(bVar, "status");
            if (iVar instanceof C11901j0) {
                return C11874k.m39191a((C11901j0) iVar, bVar, (C9117p) null, 4, (Object) null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C10216x.m34186a((Class) iVar.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m39125a(C11863c cVar, C11913l lVar) {
            C10202j.m34178b(lVar, "$this$isAnyConstructor");
            if (lVar instanceof C11953s0) {
                return C9333g.m30171a((C11953s0) lVar, C9333g.f25907k.f25944a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + C10216x.m34186a((Class) lVar.getClass())).toString());
        }

        /* renamed from: a */
        public static C11908g m39113a(C11863c cVar, List<? extends C11908g> list) {
            C10202j.m34178b(list, "types");
            return C11867f.m39161a(list);
        }

        /* renamed from: a */
        public static C11839g m39111a(C11863c cVar, boolean z) {
            return new C11859a(z, false, 2, (DefaultConstructorMarker) null);
        }
    }
}
