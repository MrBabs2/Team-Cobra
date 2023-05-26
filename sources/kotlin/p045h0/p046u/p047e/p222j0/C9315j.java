package kotlin.p045h0.p046u.p047e.p222j0;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11777r;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.j0.j */
/* compiled from: RuntimeErrorReporter.kt */
public final class C9315j implements C11777r {

    /* renamed from: b */
    public static final C9315j f25882b = new C9315j();

    private C9315j() {
    }

    /* renamed from: a */
    public void mo33675a(C10342e eVar, List<String> list) {
        C10202j.m34178b(eVar, "descriptor");
        C10202j.m34178b(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }

    /* renamed from: a */
    public void mo33674a(C10238b bVar) {
        C10202j.m34178b(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }
}
