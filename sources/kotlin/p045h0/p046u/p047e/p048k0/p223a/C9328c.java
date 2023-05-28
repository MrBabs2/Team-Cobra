package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;

/* renamed from: kotlin.h0.u.e.k0.a.c */
/* compiled from: CompanionObjectMapping.kt */
public final class C9328c {

    /* renamed from: a */
    private static final LinkedHashSet<C9933a> f25897a;

    /* renamed from: b */
    public static final C9328c f25898b = new C9328c();

    static {
        Set<C9340h> set = C9340h.f25991r;
        C10202j.m34174a((Object) set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(set, 10));
        for (C9340h d : set) {
            arrayList.add(C9333g.m30186d(d));
        }
        List<C9934b> a = C10539w.m35776a(C10539w.m35776a(C10539w.m35776a(arrayList, C9333g.f25907k.f25954f.mo35016h()), C9333g.f25907k.f25958h.mo35016h()), C9333g.f25907k.f25971q.mo35016h());
        LinkedHashSet<C9933a> linkedHashSet = new LinkedHashSet<>();
        for (C9934b a2 : a) {
            linkedHashSet.add(C9933a.m33260a(a2));
        }
        f25897a = linkedHashSet;
    }

    private C9328c() {
    }

    /* renamed from: a */
    public final Set<C9933a> mo33689a() {
        Set<C9933a> unmodifiableSet = Collections.unmodifiableSet(f25897a);
        C10202j.m34174a((Object) unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    /* renamed from: a */
    public final boolean mo33690a(C10342e eVar) {
        C10202j.m34178b(eVar, "classDescriptor");
        if (C9999c.m33688m(eVar)) {
            LinkedHashSet<C9933a> linkedHashSet = f25897a;
            C9933a a = C10071a.m33884a((C10349h) eVar);
            if (C10539w.m35777a(linkedHashSet, a != null ? a.mo34985c() : null)) {
                return true;
            }
        }
        return false;
    }
}
