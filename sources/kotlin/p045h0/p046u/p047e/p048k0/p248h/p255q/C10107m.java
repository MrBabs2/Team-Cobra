package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C10221n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10019j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.h.q.m */
/* compiled from: TypeIntersectionScope.kt */
public final class C10107m extends C10082a {

    /* renamed from: c */
    public static final C10108a f27733c = new C10108a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C10083b f27734b;

    /* renamed from: kotlin.h0.u.e.k0.h.q.m$a */
    /* compiled from: TypeIntersectionScope.kt */
    public static final class C10108a {
        private C10108a() {
        }

        /* renamed from: a */
        public final C10096h mo35315a(String str, Collection<? extends C11824b0> collection) {
            C10202j.m34178b(str, "message");
            C10202j.m34178b(collection, "types");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(collection, 10));
            for (C11824b0 m : collection) {
                arrayList.add(m.mo34008m());
            }
            C10083b bVar = new C10083b(str, arrayList);
            if (collection.size() <= 1) {
                return bVar;
            }
            return new C10107m(bVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C10108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.q.m$b */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C10109b extends C10203k implements C9113l<C10230a, C10230a> {

        /* renamed from: f */
        public static final C10109b f27735f = new C10109b();

        C10109b() {
            super(1);
        }

        /* renamed from: a */
        public final C10230a mo35316a(C10230a aVar) {
            C10202j.m34178b(aVar, "$receiver");
            return aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10230a aVar = (C10230a) obj;
            mo35316a(aVar);
            return aVar;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.q.m$c */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C10110c extends C10203k implements C9113l<C10360m0, C10360m0> {

        /* renamed from: f */
        public static final C10110c f27736f = new C10110c();

        C10110c() {
            super(1);
        }

        /* renamed from: a */
        public final C10360m0 mo35317a(C10360m0 m0Var) {
            C10202j.m34178b(m0Var, "$receiver");
            return m0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10360m0 m0Var = (C10360m0) obj;
            mo35317a(m0Var);
            return m0Var;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.q.m$d */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C10111d extends C10203k implements C9113l<C10352i0, C10352i0> {

        /* renamed from: f */
        public static final C10111d f27737f = new C10111d();

        C10111d() {
            super(1);
        }

        /* renamed from: a */
        public final C10352i0 mo35318a(C10352i0 i0Var) {
            C10202j.m34178b(i0Var, "$receiver");
            return i0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10352i0 i0Var = (C10352i0) obj;
            mo35318a(i0Var);
            return i0Var;
        }
    }

    private C10107m(C10083b bVar) {
        this.f27734b = bVar;
    }

    /* renamed from: a */
    public static final C10096h m34030a(String str, Collection<? extends C11824b0> collection) {
        return f27733c.mo35315a(str, collection);
    }

    /* renamed from: a */
    public Collection<C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return C10019j.m33768a(super.mo33913a(fVar, bVar), C10110c.f27736f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10083b m34035c() {
        return this.f27734b;
    }

    public /* synthetic */ C10107m(C10083b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        Collection<C10359m> a = super.mo33914a(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : a) {
            if (((C10359m) next) instanceof C10230a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C10221n nVar = new C10221n(arrayList, arrayList2);
        List list = (List) nVar.mo35389a();
        List list2 = (List) nVar.mo35390b();
        if (list != null) {
            return C10539w.m35796d(C10019j.m33768a(list, C10109b.f27735f), list2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return C10019j.m33768a(super.mo33918c(fVar, bVar), C10111d.f27737f);
    }
}
