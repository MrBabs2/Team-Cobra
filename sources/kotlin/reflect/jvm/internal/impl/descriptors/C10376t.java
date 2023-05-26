package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t */
/* compiled from: findClassInModule.kt */
public final class C10376t {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$a */
    /* compiled from: findClassInModule.kt */
    static final /* synthetic */ class C10377a extends C10200h implements C9113l<C9933a, C9933a> {

        /* renamed from: g */
        public static final C10377a f28178g = new C10377a();

        C10377a() {
            super(1);
        }

        /* renamed from: a */
        public final C9933a invoke(C9933a aVar) {
            C10202j.m34178b(aVar, "p1");
            return aVar.mo34985c();
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C9933a.class);
        }

        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$b */
    /* compiled from: findClassInModule.kt */
    static final class C10378b extends C10203k implements C9113l<C9933a, Integer> {

        /* renamed from: f */
        public static final C10378b f28179f = new C10378b();

        C10378b() {
            super(1);
        }

        /* renamed from: a */
        public final int mo35610a(C9933a aVar) {
            C10202j.m34178b(aVar, "it");
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(mo35610a((C9933a) obj));
        }
    }

    /* renamed from: a */
    public static final C10342e m35016a(C10393y yVar, C9933a aVar) {
        C10202j.m34178b(yVar, "$this$findClassAcrossModuleDependencies");
        C10202j.m34178b(aVar, "classId");
        C9934b d = aVar.mo34986d();
        C10202j.m34174a((Object) d, "classId.packageFqName");
        C10343e0 a = yVar.mo35554a(d);
        List<C9939f> d2 = aVar.mo34987e().mo34999d();
        C10202j.m34174a((Object) d2, "classId.relativeClassName.pathSegments()");
        C10096h m = a.mo35545m();
        Object e = C10539w.m35799e(d2);
        C10202j.m34174a(e, "segments.first()");
        C10349h b = m.mo33917b((C9939f) e, C9401d.FROM_DESERIALIZATION);
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar == null) {
            return null;
        }
        for (C9939f next : d2.subList(1, d2.size())) {
            C10096h k0 = eVar.mo33928k0();
            C10202j.m34174a((Object) next, "name");
            C10349h b2 = k0.mo33917b(next, C9401d.FROM_DESERIALIZATION);
            if (!(b2 instanceof C10342e)) {
                b2 = null;
            }
            eVar = (C10342e) b2;
            if (eVar == null) {
                return null;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public static final C10373r0 m35018b(C10393y yVar, C9933a aVar) {
        C10202j.m34178b(yVar, "$this$findTypeAliasAcrossModuleDependencies");
        C10202j.m34178b(aVar, "classId");
        C9934b d = aVar.mo34986d();
        C10202j.m34174a((Object) d, "classId.packageFqName");
        C10343e0 a = yVar.mo35554a(d);
        List<C9939f> d2 = aVar.mo34987e().mo34999d();
        C10202j.m34174a((Object) d2, "classId.relativeClassName.pathSegments()");
        int size = d2.size() - 1;
        C10096h m = a.mo35545m();
        Object e = C10539w.m35799e(d2);
        C10202j.m34174a(e, "segments.first()");
        C10349h b = m.mo33917b((C9939f) e, C9401d.FROM_DESERIALIZATION);
        C10373r0 r0Var = null;
        if (size == 0) {
            if (!(b instanceof C10373r0)) {
                b = null;
            }
            return (C10373r0) b;
        }
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar == null) {
            return null;
        }
        for (C9939f next : d2.subList(1, size)) {
            C10096h k0 = eVar.mo33928k0();
            C10202j.m34174a((Object) next, "name");
            C10349h b2 = k0.mo33917b(next, C9401d.FROM_DESERIALIZATION);
            if (!(b2 instanceof C10342e)) {
                b2 = null;
            }
            eVar = (C10342e) b2;
            if (eVar == null) {
                return null;
            }
        }
        C9939f fVar = d2.get(size);
        C10096h n0 = eVar.mo33771n0();
        C10202j.m34174a((Object) fVar, "lastName");
        C10349h b3 = n0.mo33917b(fVar, C9401d.FROM_DESERIALIZATION);
        if (b3 instanceof C10373r0) {
            r0Var = b3;
        }
        return r0Var;
    }

    /* renamed from: a */
    public static final C10342e m35017a(C10393y yVar, C9933a aVar, C10232a0 a0Var) {
        C10202j.m34178b(yVar, "$this$findNonGenericClassAcrossDependencies");
        C10202j.m34178b(aVar, "classId");
        C10202j.m34178b(a0Var, "notFoundClasses");
        C10342e a = m35016a(yVar, aVar);
        if (a != null) {
            return a;
        }
        return a0Var.mo35410a(aVar, C12090n.m39931g(C12090n.m39926d(C12083l.m39906a(aVar, C10377a.f28178g), C10378b.f28179f)));
    }
}
