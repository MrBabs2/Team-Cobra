package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9734s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9737u;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.c.a.d */
/* compiled from: specialBuiltinMembers.kt */
public final class C9541d {

    /* renamed from: a */
    private static final List<C9634u> f26371a;

    /* renamed from: b */
    private static final List<String> f26372b;

    /* renamed from: c */
    private static final Map<C9634u, C9543b> f26373c;

    /* renamed from: d */
    private static final Map<String, C9543b> f26374d;

    /* renamed from: e */
    private static final Set<C9939f> f26375e;

    /* renamed from: f */
    private static final Set<String> f26376f;

    /* renamed from: g */
    public static final C9541d f26377g = new C9541d();

    /* renamed from: kotlin.h0.u.e.k0.c.a.d$a */
    /* compiled from: specialBuiltinMembers.kt */
    public enum C9542a {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private C9542a(String str, boolean z) {
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d$b */
    /* compiled from: specialBuiltinMembers.kt */
    public enum C9543b {
        NULL((String) null),
        INDEX(-1),
        FALSE(false);
        

        /* renamed from: f */
        private final Object f26387f;

        /* renamed from: kotlin.h0.u.e.k0.c.a.d$b$a */
        /* compiled from: specialBuiltinMembers.kt */
        static final class C9544a extends C9543b {
            C9544a(String str, int i) {
                super(str, i, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        private C9543b(Object obj) {
            this.f26387f = obj;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d$c */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9545c extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9545c f26388f = new C9545c();

        C9545c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34078a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return C9541d.f26377g.m30873a(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34078a((C10238b) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d$d */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9546d extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9546d f26389f = new C9546d();

        C9546d() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34079a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return (bVar instanceof C10382u) && C9541d.f26377g.m30873a(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34079a((C10238b) obj));
        }
    }

    static {
        Set<String> b = C10530o0.m35749b("containsAll", "removeAll", "retainAll");
        ArrayList<C9634u> arrayList = new ArrayList<>(C10531p.m35750a(b, 10));
        for (String a : b) {
            String a2 = C10081d.BOOLEAN.mo35287a();
            C10202j.m34174a((Object) a2, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(C9636w.m31081b("java/util/Collection", a, "Ljava/util/Collection;", a2));
        }
        f26371a = arrayList;
        ArrayList arrayList2 = new ArrayList(C10531p.m35750a(arrayList, 10));
        for (C9634u b2 : arrayList) {
            arrayList2.add(b2.mo34185b());
        }
        f26372b = arrayList2;
        List<C9634u> list = f26371a;
        ArrayList arrayList3 = new ArrayList(C10531p.m35750a(list, 10));
        for (C9634u a3 : list) {
            arrayList3.add(a3.mo34184a().mo35021a());
        }
        C9737u uVar = C9737u.f26706a;
        String c = uVar.mo34342c("Collection");
        String a4 = C10081d.BOOLEAN.mo35287a();
        C10202j.m34174a((Object) a4, "JvmPrimitiveType.BOOLEAN.desc");
        String c2 = uVar.mo34342c("Collection");
        String a5 = C10081d.BOOLEAN.mo35287a();
        C10202j.m34174a((Object) a5, "JvmPrimitiveType.BOOLEAN.desc");
        String c3 = uVar.mo34342c("Map");
        String a6 = C10081d.BOOLEAN.mo35287a();
        C10202j.m34174a((Object) a6, "JvmPrimitiveType.BOOLEAN.desc");
        String c4 = uVar.mo34342c("Map");
        String a7 = C10081d.BOOLEAN.mo35287a();
        C10202j.m34174a((Object) a7, "JvmPrimitiveType.BOOLEAN.desc");
        String c5 = uVar.mo34342c("Map");
        String a8 = C10081d.BOOLEAN.mo35287a();
        C10202j.m34174a((Object) a8, "JvmPrimitiveType.BOOLEAN.desc");
        String c6 = uVar.mo34342c("List");
        String a9 = C10081d.INT.mo35287a();
        C10202j.m34174a((Object) a9, "JvmPrimitiveType.INT.desc");
        String c7 = uVar.mo34342c("List");
        String a10 = C10081d.INT.mo35287a();
        C10202j.m34174a((Object) a10, "JvmPrimitiveType.INT.desc");
        Map<C9634u, C9543b> a11 = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(C9636w.m31081b(c, "contains", "Ljava/lang/Object;", a4), C9543b.FALSE), C10481t.m35502a(C9636w.m31081b(c2, "remove", "Ljava/lang/Object;", a5), C9543b.FALSE), C10481t.m35502a(C9636w.m31081b(c3, "containsKey", "Ljava/lang/Object;", a6), C9543b.FALSE), C10481t.m35502a(C9636w.m31081b(c4, "containsValue", "Ljava/lang/Object;", a7), C9543b.FALSE), C10481t.m35502a(C9636w.m31081b(c5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", a8), C9543b.FALSE), C10481t.m35502a(C9636w.m31081b(uVar.mo34342c("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), C9543b.f26385j), C10481t.m35502a(C9636w.m31081b(uVar.mo34342c("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), C9543b.NULL), C10481t.m35502a(C9636w.m31081b(uVar.mo34342c("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), C9543b.NULL), C10481t.m35502a(C9636w.m31081b(c6, "indexOf", "Ljava/lang/Object;", a9), C9543b.INDEX), C10481t.m35502a(C9636w.m31081b(c7, "lastIndexOf", "Ljava/lang/Object;", a10), C9543b.INDEX)});
        f26373c = a11;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10515i0.m35582a(a11.size()));
        for (Map.Entry entry : a11.entrySet()) {
            linkedHashMap.put(((C9634u) entry.getKey()).mo34185b(), entry.getValue());
        }
        f26374d = linkedHashMap;
        Set<T> a12 = C10532p0.m35754a(f26373c.keySet(), f26371a);
        ArrayList arrayList4 = new ArrayList(C10531p.m35750a(a12, 10));
        for (T a13 : a12) {
            arrayList4.add(a13.mo34184a());
        }
        f26375e = C10539w.m35818q(arrayList4);
        ArrayList arrayList5 = new ArrayList(C10531p.m35750a(a12, 10));
        for (T b3 : a12) {
            arrayList5.add(b3.mo34185b());
        }
        f26376f = C10539w.m35818q(arrayList5);
    }

    private C9541d() {
    }

    /* renamed from: b */
    public static final C9542a m30874b(C10238b bVar) {
        C10238b a;
        String a2;
        C10202j.m34178b(bVar, "$this$getSpecialSignatureInfo");
        if (!f26375e.contains(bVar.getName()) || (a = C10071a.m33889a(bVar, false, C9546d.f26389f, 1, (Object) null)) == null || (a2 = C9734s.m31392a((C10230a) a)) == null) {
            return null;
        }
        if (f26372b.contains(a2)) {
            return C9542a.ONE_COLLECTION_PARAMETER;
        }
        if (((C9543b) C10518j0.m35608b(f26374d, a2)) == C9543b.NULL) {
            return C9542a.OBJECT_PARAMETER_GENERIC;
        }
        return C9542a.OBJECT_PARAMETER_NON_GENERIC;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m30873a(C10238b bVar) {
        return C10539w.m35777a(f26376f, C9734s.m31392a((C10230a) bVar));
    }

    /* renamed from: a */
    public static final C10382u m30871a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        C9541d dVar = f26377g;
        C9939f name = uVar.getName();
        C10202j.m34174a((Object) name, "functionDescriptor.name");
        if (!dVar.mo34077a(name)) {
            return null;
        }
        return (C10382u) C10071a.m33889a(uVar, false, C9545c.f26388f, 1, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo34077a(C9939f fVar) {
        C10202j.m34178b(fVar, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return f26375e.contains(fVar);
    }
}
