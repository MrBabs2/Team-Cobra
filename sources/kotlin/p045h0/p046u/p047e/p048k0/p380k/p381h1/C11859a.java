package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10048n;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11863c;
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
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11921r;

/* renamed from: kotlin.h0.u.e.k0.k.h1.a */
/* compiled from: ClassicTypeCheckerContext.kt */
public class C11859a extends C11839g implements C11863c {

    /* renamed from: g */
    public static final C11860a f31573g = new C11860a((DefaultConstructorMarker) null);

    /* renamed from: e */
    private final boolean f31574e;

    /* renamed from: f */
    private final boolean f31575f;

    /* renamed from: kotlin.h0.u.e.k0.k.h1.a$a */
    /* compiled from: ClassicTypeCheckerContext.kt */
    public static final class C11860a {

        /* renamed from: kotlin.h0.u.e.k0.k.h1.a$a$a */
        /* compiled from: ClassicTypeCheckerContext.kt */
        public static final class C11861a extends C11839g.C11842c.C11843a {

            /* renamed from: a */
            final /* synthetic */ C11863c f31576a;

            /* renamed from: b */
            final /* synthetic */ C11978z0 f31577b;

            C11861a(C11863c cVar, C11978z0 z0Var) {
                this.f31576a = cVar;
                this.f31577b = z0Var;
            }

            /* renamed from: a */
            public C11910i mo38482a(C11839g gVar, C11908g gVar2) {
                C10202j.m34178b(gVar, "context");
                C10202j.m34178b(gVar2, "type");
                C11863c cVar = this.f31576a;
                C11978z0 z0Var = this.f31577b;
                C11910i h = cVar.mo38472h(gVar2);
                if (h != null) {
                    C11824b0 a = z0Var.mo38617a((C11824b0) h, C11838f1.INVARIANT);
                    C10202j.m34174a((Object) a, "substitutor.safeSubstitu…ANT\n                    )");
                    C11910i a2 = cVar.mo38499a((C11908g) a);
                    if (a2 != null) {
                        return a2;
                    }
                    C10202j.m34172a();
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
            }
        }

        private C11860a() {
        }

        /* renamed from: a */
        public final C11839g.C11842c.C11843a mo38534a(C11863c cVar, C11910i iVar) {
            C10202j.m34178b(cVar, "$this$classicSubstitutionSupertypePolicy");
            C10202j.m34178b(iVar, "type");
            if (iVar instanceof C11901j0) {
                return new C11861a(cVar, C11955t0.f31657b.mo38601a((C11824b0) iVar).mo38613c());
            }
            throw new IllegalArgumentException(C11862b.m39105b(iVar).toString());
        }

        public /* synthetic */ C11860a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11859a(boolean z, boolean z2) {
        this.f31574e = z;
        this.f31575f = z2;
    }

    /* renamed from: a */
    public C11910i mo38499a(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$asSimpleType");
        return C11863c.C11864a.m39134c((C11863c) this, gVar);
    }

    /* renamed from: b */
    public int mo38510b(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$argumentsCount");
        return C11863c.C11864a.m39108a((C11863c) this, gVar);
    }

    /* renamed from: c */
    public C11908g mo38517c(C11912k kVar) {
        C10202j.m34178b(kVar, "$this$getType");
        return C11863c.C11864a.m39115a((C11863c) this, kVar);
    }

    /* renamed from: d */
    public C11907f mo38519d(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$asFlexibleType");
        return C11863c.C11864a.m39128b((C11863c) this, gVar);
    }

    /* renamed from: e */
    public boolean mo38523e(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isClassTypeConstructor");
        return C11863c.C11864a.m39131b((C11863c) this, lVar);
    }

    /* renamed from: f */
    public C11904c mo38524f(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$asCapturedType");
        return C11863c.C11864a.m39127b((C11863c) this, iVar);
    }

    /* renamed from: g */
    public C11912k mo38527g(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$asTypeArgument");
        return C11863c.C11864a.m39137d((C11863c) this, gVar);
    }

    /* renamed from: h */
    public C11905d mo38530h(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$asDefinitelyNotNullType");
        return C11863c.C11864a.m39132c((C11863c) this, iVar);
    }

    /* renamed from: i */
    public boolean mo38473i(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$isClassType");
        return C11863c.C11864a.m39138d((C11863c) this, iVar);
    }

    /* renamed from: j */
    public boolean mo38474j(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$hasFlexibleNullability");
        return C11863c.C11864a.m39140e((C11863c) this, gVar);
    }

    /* renamed from: l */
    public boolean mo38478l(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isDefinitelyNotNullType");
        return C11863c.C11864a.m39143f((C11863c) this, gVar);
    }

    /* renamed from: m */
    public boolean mo38479m(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isDynamic");
        return C11863c.C11864a.m39146g((C11863c) this, gVar);
    }

    /* renamed from: n */
    public boolean mo38480n(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isNothing");
        return C11863c.C11864a.m39154i((C11863c) this, gVar);
    }

    /* renamed from: o */
    public C11908g mo38481o(C11908g gVar) {
        C10202j.m34178b(gVar, "type");
        return C11875l.f31589b.mo38541a(((C11824b0) gVar).mo38439x0());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11859a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2);
    }

    /* renamed from: a */
    public C11910i mo38500a(C11910i iVar, C11903b bVar) {
        C10202j.m34178b(iVar, "type");
        C10202j.m34178b(bVar, "status");
        return C11863c.C11864a.m39116a((C11863c) this, iVar, bVar);
    }

    /* renamed from: b */
    public C11911j mo38512b(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$asArgumentList");
        return C11863c.C11864a.m39118a((C11863c) this, iVar);
    }

    /* renamed from: c */
    public C11910i mo38518c(C11907f fVar) {
        C10202j.m34178b(fVar, "$this$lowerBound");
        return C11863c.C11864a.m39129b((C11863c) this, fVar);
    }

    /* renamed from: d */
    public boolean mo38521d(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isDenotable");
        return C11863c.C11864a.m39139d((C11863c) this, lVar);
    }

    /* renamed from: e */
    public boolean mo38522e(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$isMarkedNullable");
        return C11863c.C11864a.m39144f((C11863c) this, iVar);
    }

    /* renamed from: f */
    public boolean mo38525f(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isError");
        return C11863c.C11864a.m39150h((C11863c) this, gVar);
    }

    /* renamed from: g */
    public boolean mo38529g(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isAnyConstructor");
        return C11863c.C11864a.m39125a((C11863c) this, lVar);
    }

    /* renamed from: h */
    public boolean mo38531h(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isIntegerLiteralTypeConstructor");
        return C11863c.C11864a.m39142e((C11863c) this, lVar);
    }

    /* renamed from: i */
    public boolean mo38533i(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isCommonFinalClassConstructor");
        return C11863c.C11864a.m39136c((C11863c) this, lVar);
    }

    /* renamed from: j */
    public boolean mo38475j(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$isIntegerLiteralType");
        return C11863c.C11864a.m39141e((C11863c) this, iVar);
    }

    /* renamed from: k */
    public C11839g.C11842c.C11843a m39096k(C11910i iVar) {
        C10202j.m34178b(iVar, "type");
        return f31573g.mo38534a(this, iVar);
    }

    /* renamed from: a */
    public List<C11910i> mo38459a(C11910i iVar, C11913l lVar) {
        C10202j.m34178b(iVar, "$this$fastCorrespondingSupertypes");
        C10202j.m34178b(lVar, "constructor");
        return C11863c.C11864a.m39110a((C11863c) this, iVar, lVar);
    }

    /* renamed from: b */
    public C11906e mo38511b(C11907f fVar) {
        C10202j.m34178b(fVar, "$this$asDynamicType");
        return C11863c.C11864a.m39112a((C11863c) this, fVar);
    }

    /* renamed from: c */
    public Collection<C11908g> mo38515c(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$possibleIntegerTypes");
        return C11863c.C11864a.m39152i((C11863c) this, iVar);
    }

    /* renamed from: d */
    public boolean mo38520d(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$isSingleClassifierType");
        return C11863c.C11864a.m39147g((C11863c) this, iVar);
    }

    /* renamed from: e */
    public C11910i mo38469e(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$upperBoundIfFlexible");
        return C11863c.C11864a.m39159m(this, gVar);
    }

    /* renamed from: f */
    public boolean mo38526f(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isIntersection");
        return C11863c.C11864a.m39145f((C11863c) this, lVar);
    }

    /* renamed from: g */
    public boolean mo38528g(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$isStubType");
        return C11863c.C11864a.m39151h((C11863c) this, iVar);
    }

    /* renamed from: h */
    public C11910i mo38472h(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$lowerBoundIfFlexible");
        return C11863c.C11864a.m39157k(this, gVar);
    }

    /* renamed from: i */
    public boolean mo38532i(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isNullableType");
        return C11863c.C11864a.m39156j((C11863c) this, gVar);
    }

    /* renamed from: k */
    public boolean mo38477k(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$isAllowedTypeVariable");
        if (!(gVar instanceof C11834e1) || !this.f31575f) {
            return false;
        }
        ((C11834e1) gVar).mo35227v0();
        return false;
    }

    /* renamed from: a */
    public C11912k mo38462a(C11911j jVar, int i) {
        C10202j.m34178b(jVar, "$this$get");
        return C11863c.C11864a.m39121a((C11863c) this, jVar, i);
    }

    /* renamed from: b */
    public C11921r mo38513b(C11912k kVar) {
        C10202j.m34178b(kVar, "$this$getVariance");
        return C11863c.C11864a.m39130b((C11863c) this, kVar);
    }

    /* renamed from: c */
    public Collection<C11908g> mo38516c(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$supertypes");
        return C11863c.C11864a.m39153i((C11863c) this, lVar);
    }

    /* renamed from: f */
    public boolean mo38471f() {
        return this.f31574e;
    }

    /* renamed from: a */
    public C11912k mo38502a(C11908g gVar, int i) {
        C10202j.m34178b(gVar, "$this$getArgument");
        return C11863c.C11864a.m39119a((C11863c) this, gVar, i);
    }

    /* renamed from: b */
    public boolean mo38514b(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$isNothingConstructor");
        return C11863c.C11864a.m39148g((C11863c) this, lVar);
    }

    /* renamed from: c */
    public C11913l mo38467c(C11908g gVar) {
        C10202j.m34178b(gVar, "$this$typeConstructor");
        return C11863c.C11864a.m39158l(this, gVar);
    }

    /* renamed from: a */
    public C11912k mo38461a(C11910i iVar, int i) {
        C10202j.m34178b(iVar, "$this$getArgumentOrNull");
        return C11863c.C11864a.m39120a((C11863c) this, iVar, i);
    }

    /* renamed from: b */
    public boolean mo38465b(C11913l lVar, C11913l lVar2) {
        C10202j.m34178b(lVar, "a");
        C10202j.m34178b(lVar2, "b");
        if (!(lVar instanceof C11953s0)) {
            throw new IllegalArgumentException(C11862b.m39105b(lVar).toString());
        } else if (lVar2 instanceof C11953s0) {
            return mo38509a((C11953s0) lVar, (C11953s0) lVar2);
        } else {
            throw new IllegalArgumentException(C11862b.m39105b(lVar2).toString());
        }
    }

    /* renamed from: a */
    public C11914m mo38504a(C11913l lVar, int i) {
        C10202j.m34178b(lVar, "$this$getParameter");
        return C11863c.C11864a.m39122a((C11863c) this, lVar, i);
    }

    /* renamed from: a */
    public C11921r mo38505a(C11914m mVar) {
        C10202j.m34178b(mVar, "$this$getVariance");
        return C11863c.C11864a.m39123a((C11863c) this, mVar);
    }

    /* renamed from: a */
    public boolean mo38506a(C11910i iVar, C11910i iVar2) {
        C10202j.m34178b(iVar, "a");
        C10202j.m34178b(iVar2, "b");
        return C11863c.C11864a.m39124a((C11863c) this, iVar, iVar2);
    }

    /* renamed from: a */
    public C11908g mo38496a(List<? extends C11908g> list) {
        C10202j.m34178b(list, "types");
        return C11863c.C11864a.m39113a((C11863c) this, list);
    }

    /* renamed from: a */
    public boolean mo38508a(C11913l lVar, C11913l lVar2) {
        C10202j.m34178b(lVar, "c1");
        C10202j.m34178b(lVar2, "c2");
        return C11863c.C11864a.m39126a((C11863c) this, lVar, lVar2);
    }

    /* renamed from: a */
    public boolean mo38507a(C11912k kVar) {
        C10202j.m34178b(kVar, "$this$isStarProjection");
        return C11863c.C11864a.m39135c((C11863c) this, kVar);
    }

    /* renamed from: a */
    public C11908g mo38497a(C11904c cVar) {
        C10202j.m34178b(cVar, "$this$lowerType");
        return C11863c.C11864a.m39114a((C11863c) this, cVar);
    }

    /* renamed from: a */
    public int mo38495a(C11913l lVar) {
        C10202j.m34178b(lVar, "$this$parametersCount");
        return C11863c.C11864a.m39149h((C11863c) this, lVar);
    }

    /* renamed from: a */
    public int mo38494a(C11911j jVar) {
        C10202j.m34178b(jVar, "$this$size");
        return C11863c.C11864a.m39109a((C11863c) this, jVar);
    }

    /* renamed from: a */
    public C11913l mo38503a(C11910i iVar) {
        C10202j.m34178b(iVar, "$this$typeConstructor");
        return C11863c.C11864a.m39155j((C11863c) this, iVar);
    }

    /* renamed from: a */
    public C11910i mo38498a(C11907f fVar) {
        C10202j.m34178b(fVar, "$this$upperBound");
        return C11863c.C11864a.m39133c((C11863c) this, fVar);
    }

    /* renamed from: a */
    public C11910i mo38501a(C11910i iVar, boolean z) {
        C10202j.m34178b(iVar, "$this$withNullability");
        return C11863c.C11864a.m39117a((C11863c) this, iVar, z);
    }

    /* renamed from: a */
    public boolean mo38509a(C11953s0 s0Var, C11953s0 s0Var2) {
        C10202j.m34178b(s0Var, "a");
        C10202j.m34178b(s0Var2, "b");
        if (s0Var instanceof C10048n) {
            return ((C10048n) s0Var).mo35253a(s0Var2);
        }
        if (s0Var2 instanceof C10048n) {
            return ((C10048n) s0Var2).mo35253a(s0Var);
        }
        return C10202j.m34176a((Object) s0Var, (Object) s0Var2);
    }
}
