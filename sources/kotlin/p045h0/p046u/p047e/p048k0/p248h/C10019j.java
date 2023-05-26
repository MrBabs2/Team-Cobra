package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.utils.C12169j;

/* renamed from: kotlin.h0.u.e.k0.h.j */
/* compiled from: overridingUtils.kt */
public final class C10019j {

    /* renamed from: kotlin.h0.u.e.k0.h.j$a */
    /* compiled from: overridingUtils.kt */
    static final class C10020a extends C10203k implements C9113l<D, D> {

        /* renamed from: f */
        public static final C10020a f27612f = new C10020a();

        C10020a() {
            super(1);
        }

        /* renamed from: a */
        public final D mo35221a(D d) {
            C10202j.m34178b(d, "$receiver");
            return d;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10230a aVar = (C10230a) obj;
            mo35221a(aVar);
            return aVar;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.j$b */
    /* compiled from: overridingUtils.kt */
    static final class C10021b extends C10203k implements C9113l<H, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C12169j f27613f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10021b(C12169j jVar) {
            super(1);
            this.f27613f = jVar;
        }

        public final void invoke(H h) {
            C12169j jVar = this.f27613f;
            C10202j.m34174a((Object) h, "it");
            jVar.add(h);
        }
    }

    /* renamed from: a */
    public static final <H> Collection<H> m33768a(Collection<? extends H> collection, C9113l<? super H, ? extends C10230a> lVar) {
        C10202j.m34178b(collection, "$this$selectMostSpecificInEachOverridableGroup");
        C10202j.m34178b(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C12169j a = C12169j.f31935h.mo38799a();
        while (!linkedList.isEmpty()) {
            Object e = C10539w.m35799e(linkedList);
            C12169j a2 = C12169j.f31935h.mo38799a();
            Collection<H> a3 = C10007i.m33716a(e, linkedList, lVar, new C10021b(a2));
            C10202j.m34174a((Object) a3, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            if (a3.size() != 1 || !a2.isEmpty()) {
                Object a4 = C10007i.m33715a(a3, lVar);
                C10202j.m34174a(a4, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                C10230a aVar = (C10230a) lVar.invoke(a4);
                for (T next : a3) {
                    C10202j.m34174a((Object) next, "it");
                    if (!C10007i.m33748d(aVar, (C10230a) lVar.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(a4);
            } else {
                Object j = C10539w.m35810j(a3);
                C10202j.m34174a(j, "overridableGroup.single()");
                a.add(j);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static final <D extends C10230a> void m33769a(Collection<D> collection) {
        C10202j.m34178b(collection, "$this$retainMostSpecificInEachOverridableGroup");
        Collection<H> a = m33768a(collection, C10020a.f27612f);
        if (collection.size() != a.size()) {
            collection.retainAll(a);
        }
    }
}
