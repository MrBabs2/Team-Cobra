package kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;

/* renamed from: kotlin.h0.u.e.k0.k.j1.o */
/* compiled from: TypeSystemContext.kt */
public interface C11916o extends C11920q {

    /* renamed from: kotlin.h0.u.e.k0.k.j1.o$a */
    /* compiled from: TypeSystemContext.kt */
    public static final class C11917a {
        /* renamed from: a */
        public static List<C11910i> m39375a(C11916o oVar, C11910i iVar, C11913l lVar) {
            C10202j.m34178b(iVar, "$this$fastCorrespondingSupertypes");
            C10202j.m34178b(lVar, "constructor");
            return null;
        }

        /* renamed from: a */
        public static C11912k m39376a(C11916o oVar, C11910i iVar, int i) {
            C10202j.m34178b(iVar, "$this$getArgumentOrNull");
            int b = oVar.mo38510b((C11908g) iVar);
            if (i >= 0 && b > i) {
                return oVar.mo38502a((C11908g) iVar, i);
            }
            return null;
        }

        /* renamed from: b */
        public static boolean m39380b(C11916o oVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isDefinitelyNotNullType");
            C11910i a = oVar.mo38499a(gVar);
            return (a != null ? oVar.mo38530h(a) : null) != null;
        }

        /* renamed from: c */
        public static boolean m39382c(C11916o oVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isDynamic");
            C11907f d = oVar.mo38519d(gVar);
            return (d != null ? oVar.mo38511b(d) : null) != null;
        }

        /* renamed from: d */
        public static boolean m39383d(C11916o oVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$isNothing");
            return oVar.mo38514b(oVar.mo38467c(gVar)) && !oVar.mo38532i(gVar);
        }

        /* renamed from: e */
        public static C11910i m39384e(C11916o oVar, C11908g gVar) {
            C11910i iVar;
            C10202j.m34178b(gVar, "$this$lowerBoundIfFlexible");
            C11907f d = oVar.mo38519d(gVar);
            if ((d != null && (iVar = oVar.mo38518c(d)) != null) || (iVar = oVar.mo38499a(gVar)) != null) {
                return iVar;
            }
            C10202j.m34172a();
            throw null;
        }

        /* renamed from: f */
        public static C11913l m39385f(C11916o oVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$typeConstructor");
            C11910i a = oVar.mo38499a(gVar);
            if (a == null) {
                a = oVar.mo38472h(gVar);
            }
            return oVar.mo38503a(a);
        }

        /* renamed from: g */
        public static C11910i m39386g(C11916o oVar, C11908g gVar) {
            C11910i iVar;
            C10202j.m34178b(gVar, "$this$upperBoundIfFlexible");
            C11907f d = oVar.mo38519d(gVar);
            if ((d != null && (iVar = oVar.mo38498a(d)) != null) || (iVar = oVar.mo38499a(gVar)) != null) {
                return iVar;
            }
            C10202j.m34172a();
            throw null;
        }

        /* renamed from: a */
        public static boolean m39378a(C11916o oVar, C11908g gVar) {
            C10202j.m34178b(gVar, "$this$hasFlexibleNullability");
            return oVar.mo38522e(oVar.mo38472h(gVar)) != oVar.mo38522e(oVar.mo38469e(gVar));
        }

        /* renamed from: b */
        public static boolean m39381b(C11916o oVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isIntegerLiteralType");
            return oVar.mo38531h(oVar.mo38503a(iVar));
        }

        /* renamed from: a */
        public static boolean m39379a(C11916o oVar, C11910i iVar) {
            C10202j.m34178b(iVar, "$this$isClassType");
            return oVar.mo38523e(oVar.mo38503a(iVar));
        }

        /* renamed from: a */
        public static C11912k m39377a(C11916o oVar, C11911j jVar, int i) {
            C10202j.m34178b(jVar, "$this$get");
            if (jVar instanceof C11910i) {
                return oVar.mo38502a((C11908g) jVar, i);
            }
            if (jVar instanceof C11902a) {
                Object obj = ((C11902a) jVar).get(i);
                C10202j.m34174a(obj, "get(index)");
                return (C11912k) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + C10216x.m34186a((Class) jVar.getClass())).toString());
        }

        /* renamed from: a */
        public static int m39374a(C11916o oVar, C11911j jVar) {
            C10202j.m34178b(jVar, "$this$size");
            if (jVar instanceof C11910i) {
                return oVar.mo38510b((C11908g) jVar);
            }
            if (jVar instanceof C11902a) {
                return ((C11902a) jVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + C10216x.m34186a((Class) jVar.getClass())).toString());
        }
    }

    /* renamed from: a */
    int mo38494a(C11911j jVar);

    /* renamed from: a */
    int mo38495a(C11913l lVar);

    /* renamed from: a */
    C11908g mo38496a(List<? extends C11908g> list);

    /* renamed from: a */
    C11908g mo38497a(C11904c cVar);

    /* renamed from: a */
    C11910i mo38498a(C11907f fVar);

    /* renamed from: a */
    C11910i mo38499a(C11908g gVar);

    /* renamed from: a */
    C11910i mo38500a(C11910i iVar, C11903b bVar);

    /* renamed from: a */
    C11910i mo38501a(C11910i iVar, boolean z);

    /* renamed from: a */
    C11912k mo38502a(C11908g gVar, int i);

    /* renamed from: a */
    C11912k mo38462a(C11911j jVar, int i);

    /* renamed from: a */
    C11913l mo38503a(C11910i iVar);

    /* renamed from: a */
    C11914m mo38504a(C11913l lVar, int i);

    /* renamed from: a */
    C11921r mo38505a(C11914m mVar);

    /* renamed from: a */
    boolean mo38507a(C11912k kVar);

    /* renamed from: a */
    boolean mo38508a(C11913l lVar, C11913l lVar2);

    /* renamed from: b */
    int mo38510b(C11908g gVar);

    /* renamed from: b */
    C11906e mo38511b(C11907f fVar);

    /* renamed from: b */
    C11911j mo38512b(C11910i iVar);

    /* renamed from: b */
    C11921r mo38513b(C11912k kVar);

    /* renamed from: b */
    boolean mo38514b(C11913l lVar);

    /* renamed from: c */
    Collection<C11908g> mo38515c(C11910i iVar);

    /* renamed from: c */
    Collection<C11908g> mo38516c(C11913l lVar);

    /* renamed from: c */
    C11908g mo38517c(C11912k kVar);

    /* renamed from: c */
    C11910i mo38518c(C11907f fVar);

    /* renamed from: c */
    C11913l mo38467c(C11908g gVar);

    /* renamed from: d */
    C11907f mo38519d(C11908g gVar);

    /* renamed from: d */
    boolean mo38520d(C11910i iVar);

    /* renamed from: d */
    boolean mo38521d(C11913l lVar);

    /* renamed from: e */
    C11910i mo38469e(C11908g gVar);

    /* renamed from: e */
    boolean mo38522e(C11910i iVar);

    /* renamed from: e */
    boolean mo38523e(C11913l lVar);

    /* renamed from: f */
    C11904c mo38524f(C11910i iVar);

    /* renamed from: f */
    boolean mo38525f(C11908g gVar);

    /* renamed from: f */
    boolean mo38526f(C11913l lVar);

    /* renamed from: g */
    C11912k mo38527g(C11908g gVar);

    /* renamed from: g */
    boolean mo38528g(C11910i iVar);

    /* renamed from: g */
    boolean mo38529g(C11913l lVar);

    /* renamed from: h */
    C11905d mo38530h(C11910i iVar);

    /* renamed from: h */
    C11910i mo38472h(C11908g gVar);

    /* renamed from: h */
    boolean mo38531h(C11913l lVar);

    /* renamed from: i */
    boolean mo38532i(C11908g gVar);

    /* renamed from: i */
    boolean mo38533i(C11913l lVar);
}
