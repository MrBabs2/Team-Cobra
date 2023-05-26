package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9632s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9482l;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10065w;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10305i0;

/* renamed from: kotlin.h0.u.e.k0.c.a.z.k */
/* compiled from: util.kt */
public final class C9677k {
    /* renamed from: a */
    public static final List<C10386v0> m31182a(Collection<C9678l> collection, Collection<? extends C10386v0> collection2, C10230a aVar) {
        C10202j.m34178b(collection, "newValueParametersTypes");
        C10202j.m34178b(collection2, "oldValueParameters");
        C10202j.m34178b(aVar, "newOwner");
        boolean z = collection.size() == collection2.size();
        if (!C10485x.f28360a || z) {
            List<C10221n<T, R>> e = C10539w.m35800e(collection, collection2);
            ArrayList arrayList = new ArrayList(C10531p.m35750a(e, 10));
            for (C10221n nVar : e) {
                C9678l lVar = (C9678l) nVar.mo35389a();
                C10386v0 v0Var = (C10386v0) nVar.mo35390b();
                int e2 = v0Var.mo35487e();
                C10249g annotations = v0Var.getAnnotations();
                C9939f name = v0Var.getName();
                C10202j.m34174a((Object) name, "oldParameter.name");
                C11824b0 b = lVar.mo34234b();
                boolean a = lVar.mo34233a();
                boolean V = v0Var.mo35483V();
                boolean S = v0Var.mo35482S();
                C11824b0 a2 = v0Var.mo35486a0() != null ? C10071a.m33897e(aVar).mo35561l().mo33696a(lVar.mo34234b()) : null;
                C10362n0 p = v0Var.mo33773p();
                C10202j.m34174a((Object) p, "oldParameter.source");
                arrayList.add(new C10305i0(aVar, (C10386v0) null, e2, annotations, name, b, a, V, S, a2, p));
            }
            return arrayList;
        }
        throw new AssertionError("Different value parameters sizes: Enhanced = " + collection.size() + ", Old = " + collection2.size());
    }

    /* renamed from: a */
    public static final C9482l m31183a(C10342e eVar) {
        C10202j.m34178b(eVar, "$this$getParentJavaStaticClassScope");
        C10342e b = C10071a.m33894b(eVar);
        C9482l lVar = null;
        if (b == null) {
            return null;
        }
        C10096h M = b.mo33760M();
        if (M instanceof C9482l) {
            lVar = M;
        }
        C9482l lVar2 = lVar;
        return lVar2 != null ? lVar2 : m31183a(b);
    }

    /* renamed from: a */
    public static final C9665a m31184a(C10386v0 v0Var) {
        C10037g<?> a;
        String str;
        C10202j.m34178b(v0Var, "$this$getDefaultValueFromAnnotation");
        C10249g annotations = v0Var.getAnnotations();
        C9934b bVar = C9632s.f26527m;
        C10202j.m34174a((Object) bVar, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        C10243c a2 = annotations.mo33885a(bVar);
        if (!(a2 == null || (a = C10071a.m33886a(a2)) == null)) {
            if (!(a instanceof C10065w)) {
                a = null;
            }
            C10065w wVar = (C10065w) a;
            if (!(wVar == null || (str = (String) wVar.mo35244a()) == null)) {
                return new C9676j(str);
            }
        }
        C10249g annotations2 = v0Var.getAnnotations();
        C9934b bVar2 = C9632s.f26528n;
        C10202j.m34174a((Object) bVar2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (annotations2.mo33886b(bVar2)) {
            return C9674h.f26605a;
        }
        return null;
    }
}
