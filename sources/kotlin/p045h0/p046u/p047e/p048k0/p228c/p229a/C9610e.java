package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.c.a.e */
/* compiled from: specialBuiltinMembers.kt */
public final class C9610e {

    /* renamed from: a */
    private static final Map<C9934b, C9939f> f26495a;

    /* renamed from: b */
    private static final Map<C9939f, List<C9939f>> f26496b;

    /* renamed from: c */
    private static final Set<C9934b> f26497c;

    /* renamed from: d */
    private static final Set<C9939f> f26498d;

    /* renamed from: e */
    public static final C9610e f26499e = new C9610e();

    /* renamed from: kotlin.h0.u.e.k0.c.a.e$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9611a extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9611a f26500f = new C9611a();

        C9611a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34169a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return C9610e.f26499e.mo34168b(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34169a((C10238b) obj));
        }
    }

    static {
        C9935c cVar = C9333g.f25907k.f25971q;
        C10202j.m34174a((Object) cVar, "BUILTIN_NAMES._enum");
        C9935c cVar2 = C9333g.f25907k.f25971q;
        C10202j.m34174a((Object) cVar2, "BUILTIN_NAMES._enum");
        C9934b bVar = C9333g.f25907k.f25926I;
        C10202j.m34174a((Object) bVar, "BUILTIN_NAMES.collection");
        C9934b bVar2 = C9333g.f25907k.f25930M;
        C10202j.m34174a((Object) bVar2, "BUILTIN_NAMES.map");
        C9935c cVar3 = C9333g.f25907k.f25952e;
        C10202j.m34174a((Object) cVar3, "BUILTIN_NAMES.charSequence");
        C9934b bVar3 = C9333g.f25907k.f25930M;
        C10202j.m34174a((Object) bVar3, "BUILTIN_NAMES.map");
        C9934b bVar4 = C9333g.f25907k.f25930M;
        C10202j.m34174a((Object) bVar4, "BUILTIN_NAMES.map");
        C9934b bVar5 = C9333g.f25907k.f25930M;
        C10202j.m34174a((Object) bVar5, "BUILTIN_NAMES.map");
        Map<C9934b, C9939f> a = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(C9636w.m31083b(cVar, "name"), C9939f.m33302b("name")), C10481t.m35502a(C9636w.m31083b(cVar2, "ordinal"), C9939f.m33302b("ordinal")), C10481t.m35502a(C9636w.m31082b(bVar, "size"), C9939f.m33302b("size")), C10481t.m35502a(C9636w.m31082b(bVar2, "size"), C9939f.m33302b("size")), C10481t.m35502a(C9636w.m31083b(cVar3, "length"), C9939f.m33302b("length")), C10481t.m35502a(C9636w.m31082b(bVar3, "keys"), C9939f.m33302b("keySet")), C10481t.m35502a(C9636w.m31082b(bVar4, "values"), C9939f.m33302b("values")), C10481t.m35502a(C9636w.m31082b(bVar5, "entries"), C9939f.m33302b("entrySet"))});
        f26495a = a;
        Set<Map.Entry<C9934b, C9939f>> entrySet = a.entrySet();
        ArrayList<C10221n> arrayList = new ArrayList<>(C10531p.m35750a(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C10221n(((C9934b) entry.getKey()).mo35000e(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C10221n nVar : arrayList) {
            C9939f fVar = (C9939f) nVar.mo35392d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C9939f) nVar.mo35391c());
        }
        f26496b = linkedHashMap;
        Set<C9934b> keySet = f26495a.keySet();
        f26497c = keySet;
        ArrayList arrayList2 = new ArrayList(C10531p.m35750a(keySet, 10));
        for (C9934b e : keySet) {
            arrayList2.add(e.mo35000e());
        }
        f26498d = C10539w.m35818q(arrayList2);
    }

    private C9610e() {
    }

    /* renamed from: c */
    private final boolean m31002c(C10238b bVar) {
        if (C10539w.m35777a(f26497c, C10071a.m33885a((C10359m) bVar)) && bVar.mo35407f().isEmpty()) {
            return true;
        }
        if (!C9333g.m30184c((C10359m) bVar)) {
            return false;
        }
        Collection<? extends C10238b> d = bVar.mo35406d();
        C10202j.m34174a((Object) d, "overriddenDescriptors");
        if (!(d instanceof Collection) || !d.isEmpty()) {
            for (C10238b bVar2 : d) {
                C9610e eVar = f26499e;
                C10202j.m34174a((Object) bVar2, "it");
                if (eVar.mo34168b(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Set<C9939f> mo34167a() {
        return f26498d;
    }

    /* renamed from: b */
    public final boolean mo34168b(C10238b bVar) {
        C10202j.m34178b(bVar, "callableMemberDescriptor");
        if (!f26498d.contains(bVar.getName())) {
            return false;
        }
        return m31002c(bVar);
    }

    /* renamed from: a */
    public final List<C9939f> mo34166a(C9939f fVar) {
        C10202j.m34178b(fVar, "name1");
        List<C9939f> list = f26496b.get(fVar);
        return list != null ? list : C10529o.m35736a();
    }

    /* renamed from: a */
    public final String mo34165a(C10238b bVar) {
        C9939f fVar;
        C10202j.m34178b(bVar, "$this$getBuiltinSpecialPropertyGetterName");
        boolean c = C9333g.m30184c((C10359m) bVar);
        if (!C10485x.f28360a || c) {
            C10238b a = C10071a.m33889a(C10071a.m33887a(bVar), false, C9611a.f26500f, 1, (Object) null);
            if (a == null || (fVar = f26495a.get(C10071a.m33895c(a))) == null) {
                return null;
            }
            return fVar.mo35021a();
        }
        throw new AssertionError("This method is defined only for builtin members, but " + bVar + " found");
    }
}
