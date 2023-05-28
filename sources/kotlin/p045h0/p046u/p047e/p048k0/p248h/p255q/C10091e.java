package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10005g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10101j;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.h0.u.e.k0.h.q.e */
/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class C10091e extends C10100i {

    /* renamed from: d */
    static final /* synthetic */ C9168l[] f27710d = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10091e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    private final C11814f f27711b;

    /* renamed from: c */
    private final C10342e f27712c;

    /* renamed from: kotlin.h0.u.e.k0.h.q.e$a */
    /* compiled from: GivenFunctionsMemberScope.kt */
    static final class C10092a extends C10203k implements C9102a<List<? extends C10359m>> {

        /* renamed from: f */
        final /* synthetic */ C10091e f27713f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10092a(C10091e eVar) {
            super(0);
            this.f27713f = eVar;
        }

        public final List<C10359m> invoke() {
            List<C10382u> c = this.f27713f.mo33791c();
            return C10539w.m35796d(c, this.f27713f.m33978a(c));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.q.e$b */
    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class C10093b extends C10005g {

        /* renamed from: a */
        final /* synthetic */ C10091e f27714a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f27715b;

        C10093b(C10091e eVar, ArrayList arrayList) {
            this.f27714a = eVar;
            this.f27715b = arrayList;
        }

        /* renamed from: a */
        public void mo34192a(C10238b bVar) {
            C10202j.m34178b(bVar, "fakeOverride");
            C10007i.m33734a(bVar, (C9113l<C10238b, C10483v>) null);
            this.f27715b.add(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo34194c(C10238b bVar, C10238b bVar2) {
            C10202j.m34178b(bVar, "fromSuper");
            C10202j.m34178b(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f27714a.mo35311d() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public C10091e(C11817i iVar, C10342e eVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(eVar, "containingClass");
        this.f27712c = eVar;
        this.f27711b = iVar.mo38401a(new C10092a(this));
    }

    /* renamed from: e */
    private final List<C10359m> m33980e() {
        return (List) C11816h.m38876a(this.f27711b, (Object) this, (C9168l<?>) f27710d[0]);
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        List<C10359m> e = m33980e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (next instanceof C10352i0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C10202j.m34176a((Object) ((C10352i0) next2).getName(), (Object) fVar)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C10382u> mo33791c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C10342e mo35311d() {
        return this.f27712c;
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        if (!dVar.mo35297a(C10088d.f27699o.mo35298b())) {
            return C10529o.m35736a();
        }
        return m33980e();
    }

    /* renamed from: a */
    public Collection<C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        List<C10359m> e = m33980e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (next instanceof C10360m0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C10202j.m34176a((Object) ((C10360m0) next2).getName(), (Object) fVar)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C10359m> m33978a(List<? extends C10382u> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        C11953s0 h = this.f27712c.mo33766h();
        C10202j.m34174a((Object) h, "containingClass.typeConstructor");
        Collection<C11824b0> a = h.mo35229a();
        C10202j.m34174a((Object) a, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (C11824b0 m : a) {
            boolean unused = C10536t.m35760a(arrayList2, C10101j.C10102a.m34010a(m.mo34008m(), (C10088d) null, (C9113l) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C10238b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            C9939f name = ((C10238b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C9939f fVar = (C9939f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((C10238b) next3) instanceof C10382u);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                if (booleanValue) {
                    collection = new ArrayList();
                    for (T next4 : list) {
                        if (C10202j.m34176a((Object) ((C10382u) next4).getName(), (Object) fVar)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C10529o.m35736a();
                }
                C10007i.m33732a(fVar, list2, collection, this.f27712c, new C10093b(this, arrayList));
            }
        }
        return C12141a.m40131a(arrayList);
    }
}
