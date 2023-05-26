package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.k0.k.c */
/* compiled from: AbstractTypeChecker.kt */
public final class C11826c {

    /* renamed from: a */
    public static final C11826c f31530a = new C11826c();

    private C11826c() {
    }

    /* renamed from: b */
    private final boolean m38941b(C11839g gVar, C11910i iVar, C11910i iVar2) {
        if (C11835f.f31538a) {
            boolean z = gVar.mo38520d(iVar) || gVar.mo38526f(gVar.mo38503a(iVar)) || gVar.mo38477k((C11908g) iVar);
            if (!C10485x.f28360a || z) {
                boolean z2 = gVar.mo38520d(iVar2) || gVar.mo38477k((C11908g) iVar2);
                if (C10485x.f28360a && !z2) {
                    throw new AssertionError("Not singleClassifierType superType: " + iVar2);
                }
            } else {
                throw new AssertionError("Not singleClassifierType and not intersection subType: " + iVar);
            }
        }
        if (gVar.mo38522e(iVar2) || gVar.mo38478l(iVar) || mo38442a(gVar, iVar, (C11839g.C11842c) C11839g.C11842c.C11844b.f31560a)) {
            return true;
        }
        if (!gVar.mo38478l(iVar2) && !mo38442a(gVar, iVar2, (C11839g.C11842c) C11839g.C11842c.C11846d.f31562a) && !gVar.mo38473i(iVar)) {
            return mo38444a(gVar, iVar, gVar.mo38503a(iVar2));
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo38443a(C11839g gVar, C11910i iVar, C11910i iVar2) {
        C10202j.m34178b(gVar, "context");
        C10202j.m34178b(iVar, "subType");
        C10202j.m34178b(iVar2, "superType");
        return m38941b(gVar, iVar, iVar2);
    }

    /* renamed from: a */
    public final boolean mo38442a(C11839g gVar, C11910i iVar, C11839g.C11842c cVar) {
        C11839g gVar2 = gVar;
        C11910i iVar2 = iVar;
        C10202j.m34178b(gVar2, "$this$hasNotNullSupertype");
        C10202j.m34178b(iVar2, "type");
        C11839g.C11842c cVar2 = cVar;
        C10202j.m34178b(cVar2, "supertypesPolicy");
        if (!((gVar.mo38473i(iVar) && !gVar.mo38522e(iVar)) || gVar.mo38478l(iVar))) {
            gVar.mo38470e();
            ArrayDeque<C11910i> c = gVar.mo38466c();
            if (c != null) {
                Set<C11910i> d = gVar.mo38468d();
                if (d != null) {
                    c.push(iVar2);
                    while (!c.isEmpty()) {
                        if (d.size() <= 1000) {
                            C11910i pop = c.pop();
                            C10202j.m34174a((Object) pop, "current");
                            if (d.add(pop)) {
                                C11839g.C11842c cVar3 = gVar2.mo38522e(pop) ? C11839g.C11842c.C11845c.f31561a : cVar2;
                                if (!(!C10202j.m34176a((Object) cVar3, (Object) C11839g.C11842c.C11845c.f31561a))) {
                                    cVar3 = null;
                                }
                                if (cVar3 != null) {
                                    for (C11908g a : gVar2.mo38516c(gVar2.mo38503a(pop))) {
                                        C11910i a2 = cVar3.mo38482a(gVar2, a);
                                        if ((gVar2.mo38473i(a2) && !gVar2.mo38522e(a2)) || gVar2.mo38478l(a2)) {
                                            gVar.mo38463a();
                                        } else {
                                            c.add(a2);
                                        }
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            throw new IllegalStateException(("Too many supertypes for type: " + iVar2 + ". Supertypes = " + C10539w.m35773a(d, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null)).toString());
                        }
                    }
                    gVar.mo38463a();
                    return false;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo38444a(C11839g gVar, C11910i iVar, C11913l lVar) {
        C11839g gVar2 = gVar;
        C11910i iVar2 = iVar;
        C11913l lVar2 = lVar;
        C10202j.m34178b(gVar2, "$this$hasPathByNotMarkedNullableNodes");
        C10202j.m34178b(iVar2, "start");
        C10202j.m34178b(lVar2, "end");
        if (!(gVar.mo38480n(iVar) || (!gVar.mo38522e(iVar) && gVar2.mo38508a(gVar.mo38503a(iVar), lVar2)))) {
            gVar.mo38470e();
            ArrayDeque<C11910i> c = gVar.mo38466c();
            if (c != null) {
                Set<C11910i> d = gVar.mo38468d();
                if (d != null) {
                    c.push(iVar2);
                    while (!c.isEmpty()) {
                        if (d.size() <= 1000) {
                            C11910i pop = c.pop();
                            C10202j.m34174a((Object) pop, "current");
                            if (d.add(pop)) {
                                C11839g.C11842c cVar = gVar2.mo38522e(pop) ? C11839g.C11842c.C11845c.f31561a : C11839g.C11842c.C11844b.f31560a;
                                if (!(!C10202j.m34176a((Object) cVar, (Object) C11839g.C11842c.C11845c.f31561a))) {
                                    cVar = null;
                                }
                                if (cVar != null) {
                                    for (C11908g a : gVar2.mo38516c(gVar2.mo38503a(pop))) {
                                        C11910i a2 = cVar.mo38482a(gVar2, a);
                                        if (gVar2.mo38480n(a2) || (!gVar2.mo38522e(a2) && gVar2.mo38508a(gVar2.mo38503a(a2), lVar2))) {
                                            gVar.mo38463a();
                                        } else {
                                            c.add(a2);
                                        }
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            throw new IllegalStateException(("Too many supertypes for type: " + iVar2 + ". Supertypes = " + C10539w.m35773a(d, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null)).toString());
                        }
                    }
                    gVar.mo38463a();
                    return false;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        return true;
    }
}
