package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10483v;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11903b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.utils.C12150d;

/* renamed from: kotlin.h0.u.e.k0.k.h1.k */
/* compiled from: NewCapturedType.kt */
public final class C11874k {
    /* renamed from: a */
    public static /* synthetic */ C11901j0 m39191a(C11901j0 j0Var, C11903b bVar, C9117p<Object, Object, C10483v> pVar, int i, Object obj) {
        if ((i & 4) != 0) {
            pVar = C12150d.m40156b();
        }
        return m39190a(j0Var, bVar, pVar);
    }

    /* renamed from: a */
    public static final C11901j0 m39190a(C11901j0 j0Var, C11903b bVar, C9117p<? super Integer, ? super C11872i, C10483v> pVar) {
        boolean z;
        C10202j.m34178b(j0Var, "type");
        C10202j.m34178b(bVar, "status");
        C10202j.m34178b(pVar, "acceptNewCapturedType");
        if (j0Var.mo35226u0().size() != j0Var.mo35227v0().getParameters().size()) {
            return null;
        }
        List<C11965u0> u0 = j0Var.mo35226u0();
        boolean z2 = true;
        if (!(u0 instanceof Collection) || !u0.isEmpty()) {
            Iterator<T> it = u0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C11965u0) it.next()).mo38596a() == C11838f1.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(u0, 10));
        for (C11965u0 u0Var : u0) {
            if (u0Var.mo38596a() != C11838f1.INVARIANT) {
                u0Var = C11924a.m39413a((C11824b0) new C11872i(bVar, (u0Var.mo38597b() || u0Var.mo38596a() != C11838f1.IN_VARIANCE) ? null : u0Var.getType().mo38439x0(), u0Var));
            }
            arrayList.add(u0Var);
        }
        C11978z0 c = C11955t0.f31657b.mo38602a(j0Var.mo35227v0(), (List<? extends C11965u0>) arrayList).mo38613c();
        int size = u0.size();
        for (int i = 0; i < size; i++) {
            C11965u0 u0Var2 = u0.get(i);
            C11965u0 u0Var3 = (C11965u0) arrayList.get(i);
            if (u0Var2.mo38596a() != C11838f1.INVARIANT) {
                C10375s0 s0Var = j0Var.mo35227v0().getParameters().get(i);
                C10202j.m34174a((Object) s0Var, "type.constructor.parameters[index]");
                List<C11824b0> upperBounds = s0Var.getUpperBounds();
                C10202j.m34174a((Object) upperBounds, "type.constructor.parameters[index].upperBounds");
                List arrayList2 = new ArrayList(C10531p.m35750a(upperBounds, 10));
                for (C11824b0 a : upperBounds) {
                    arrayList2.add(C11875l.f31589b.mo38541a(c.mo38617a(a, C11838f1.INVARIANT).mo38439x0()));
                }
                if (!u0Var2.mo38597b() && u0Var2.mo38596a() == C11838f1.OUT_VARIANCE) {
                    arrayList2 = C10539w.m35776a(arrayList2, C11875l.f31589b.mo38541a(u0Var2.getType().mo38439x0()));
                }
                C11824b0 type = u0Var3.getType();
                if (type != null) {
                    C11872i iVar = (C11872i) type;
                    iVar.m39180v0().mo38539a(arrayList2);
                    pVar.invoke(Integer.valueOf(i), iVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
            }
        }
        return C11827c0.m38948a(j0Var.getAnnotations(), j0Var.mo35227v0(), arrayList, j0Var.mo34094w0());
    }
}
