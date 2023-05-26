package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9734s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9737u;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.c.a.c */
/* compiled from: specialBuiltinMembers.kt */
public final class C9510c {

    /* renamed from: a */
    private static final C9634u f26361a;

    /* renamed from: b */
    private static final Map<C9634u, C9939f> f26362b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C9939f> f26363c;

    /* renamed from: d */
    private static final List<C9939f> f26364d;

    /* renamed from: e */
    private static final Map<C9939f, List<C9939f>> f26365e;

    /* renamed from: f */
    public static final C9510c f26366f = new C9510c();

    /* renamed from: kotlin.h0.u.e.k0.c.a.c$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9511a extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10360m0 f26367f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9511a(C10360m0 m0Var) {
            super(1);
            this.f26367f = m0Var;
        }

        /* renamed from: a */
        public final boolean mo34020a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            Map a = C9510c.f26363c;
            String a2 = C9734s.m31392a((C10230a) this.f26367f);
            if (a != null) {
                return a.containsKey(a2);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34020a((C10238b) obj));
        }
    }

    static {
        String a = C10081d.INT.mo35287a();
        C10202j.m34174a((Object) a, "JvmPrimitiveType.INT.desc");
        f26361a = C9636w.m31081b("java/util/List", "removeAt", a, "Ljava/lang/Object;");
        C9737u uVar = C9737u.f26706a;
        String b = uVar.mo34340b("Number");
        String a2 = C10081d.BYTE.mo35287a();
        C10202j.m34174a((Object) a2, "JvmPrimitiveType.BYTE.desc");
        String b2 = uVar.mo34340b("Number");
        String a3 = C10081d.SHORT.mo35287a();
        C10202j.m34174a((Object) a3, "JvmPrimitiveType.SHORT.desc");
        String b3 = uVar.mo34340b("Number");
        String a4 = C10081d.INT.mo35287a();
        C10202j.m34174a((Object) a4, "JvmPrimitiveType.INT.desc");
        String b4 = uVar.mo34340b("Number");
        String a5 = C10081d.LONG.mo35287a();
        C10202j.m34174a((Object) a5, "JvmPrimitiveType.LONG.desc");
        String b5 = uVar.mo34340b("Number");
        String a6 = C10081d.FLOAT.mo35287a();
        C10202j.m34174a((Object) a6, "JvmPrimitiveType.FLOAT.desc");
        String b6 = uVar.mo34340b("Number");
        String a7 = C10081d.DOUBLE.mo35287a();
        C10202j.m34174a((Object) a7, "JvmPrimitiveType.DOUBLE.desc");
        String b7 = uVar.mo34340b("CharSequence");
        String a8 = C10081d.INT.mo35287a();
        C10202j.m34174a((Object) a8, "JvmPrimitiveType.INT.desc");
        String a9 = C10081d.CHAR.mo35287a();
        C10202j.m34174a((Object) a9, "JvmPrimitiveType.CHAR.desc");
        Map<C9634u, C9939f> a10 = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(C9636w.m31081b(b, "toByte", "", a2), C9939f.m33302b("byteValue")), C10481t.m35502a(C9636w.m31081b(b2, "toShort", "", a3), C9939f.m33302b("shortValue")), C10481t.m35502a(C9636w.m31081b(b3, "toInt", "", a4), C9939f.m33302b("intValue")), C10481t.m35502a(C9636w.m31081b(b4, "toLong", "", a5), C9939f.m33302b("longValue")), C10481t.m35502a(C9636w.m31081b(b5, "toFloat", "", a6), C9939f.m33302b("floatValue")), C10481t.m35502a(C9636w.m31081b(b6, "toDouble", "", a7), C9939f.m33302b("doubleValue")), C10481t.m35502a(f26361a, C9939f.m33302b("remove")), C10481t.m35502a(C9636w.m31081b(b7, "get", a8, a9), C9939f.m33302b("charAt"))});
        f26362b = a10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10515i0.m35582a(a10.size()));
        for (Map.Entry entry : a10.entrySet()) {
            linkedHashMap.put(((C9634u) entry.getKey()).mo34185b(), entry.getValue());
        }
        f26363c = linkedHashMap;
        Set<C9634u> keySet = f26362b.keySet();
        ArrayList arrayList = new ArrayList(C10531p.m35750a(keySet, 10));
        for (C9634u a11 : keySet) {
            arrayList.add(a11.mo34184a());
        }
        f26364d = arrayList;
        Set<Map.Entry<C9634u, C9939f>> entrySet = f26362b.entrySet();
        ArrayList<C10221n> arrayList2 = new ArrayList<>(C10531p.m35750a(entrySet, 10));
        for (Map.Entry entry2 : entrySet) {
            arrayList2.add(new C10221n(((C9634u) entry2.getKey()).mo34184a(), entry2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C10221n nVar : arrayList2) {
            C9939f fVar = (C9939f) nVar.mo35392d();
            Object obj = linkedHashMap2.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(fVar, obj);
            }
            ((List) obj).add((C9939f) nVar.mo35391c());
        }
        f26365e = linkedHashMap2;
    }

    private C9510c() {
    }

    /* renamed from: b */
    public final boolean mo34017b(C9939f fVar) {
        C10202j.m34178b(fVar, "$this$sameAsRenamedInJvmBuiltin");
        return f26364d.contains(fVar);
    }

    /* renamed from: c */
    public final boolean mo34019c(C10360m0 m0Var) {
        C10202j.m34178b(m0Var, "$this$isRemoveAtByIndex");
        return C10202j.m34176a((Object) m0Var.getName().mo35021a(), (Object) "removeAt") && C10202j.m34176a((Object) C9734s.m31392a((C10230a) m0Var), (Object) f26361a.mo34185b());
    }

    /* renamed from: a */
    public final List<C9939f> mo34014a() {
        return f26364d;
    }

    /* renamed from: b */
    public final boolean mo34018b(C10360m0 m0Var) {
        C10202j.m34178b(m0Var, "functionDescriptor");
        return C9333g.m30184c((C10359m) m0Var) && C10071a.m33889a(m0Var, false, new C9511a(m0Var), 1, (Object) null) != null;
    }

    /* renamed from: a */
    public final C9939f mo34016a(C10360m0 m0Var) {
        C10202j.m34178b(m0Var, "functionDescriptor");
        Map<String, C9939f> map = f26363c;
        String a = C9734s.m31392a((C10230a) m0Var);
        if (a != null) {
            return map.get(a);
        }
        return null;
    }

    /* renamed from: a */
    public final List<C9939f> mo34015a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        List<C9939f> list = f26365e.get(fVar);
        return list != null ? list : C10529o.m35736a();
    }
}
