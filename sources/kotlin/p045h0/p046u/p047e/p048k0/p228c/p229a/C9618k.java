package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.k0.c.a.k */
/* compiled from: FakePureImplementationsProvider.kt */
public final class C9618k {

    /* renamed from: a */
    private static final HashMap<C9934b, C9934b> f26504a = new HashMap<>();

    /* renamed from: b */
    public static final C9618k f26505b;

    static {
        C9618k kVar = new C9618k();
        f26505b = kVar;
        C9934b bVar = C9333g.f25907k.f25935R;
        C10202j.m34174a((Object) bVar, "FQ_NAMES.mutableList");
        kVar.m31012a(bVar, kVar.m31011a("java.util.ArrayList", "java.util.LinkedList"));
        C9934b bVar2 = C9333g.f25907k.f25937T;
        C10202j.m34174a((Object) bVar2, "FQ_NAMES.mutableSet");
        kVar.m31012a(bVar2, kVar.m31011a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        C9934b bVar3 = C9333g.f25907k.f25938U;
        C10202j.m34174a((Object) bVar3, "FQ_NAMES.mutableMap");
        kVar.m31012a(bVar3, kVar.m31011a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        kVar.m31012a(new C9934b("java.util.function.Function"), kVar.m31011a("java.util.function.UnaryOperator"));
        kVar.m31012a(new C9934b("java.util.function.BiFunction"), kVar.m31011a("java.util.function.BinaryOperator"));
    }

    private C9618k() {
    }

    /* renamed from: a */
    public final C9934b mo34173a(C9934b bVar) {
        C10202j.m34178b(bVar, "classFqName");
        return f26504a.get(bVar);
    }

    /* renamed from: a */
    private final void m31012a(C9934b bVar, List<C9934b> list) {
        HashMap<C9934b, C9934b> hashMap = f26504a;
        for (T next : list) {
            C9934b bVar2 = (C9934b) next;
            hashMap.put(next, bVar);
        }
    }

    /* renamed from: a */
    private final List<C9934b> m31011a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new C9934b(bVar));
        }
        return arrayList;
    }
}
