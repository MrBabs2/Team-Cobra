package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;

/* renamed from: kotlin.h0.u.e.k0.i.b.o */
/* compiled from: DeserializedClassDataFinder.kt */
public final class C11772o implements C11759i {

    /* renamed from: a */
    private final C10265c0 f31455a;

    public C11772o(C10265c0 c0Var) {
        C10202j.m34178b(c0Var, "packageFragmentProvider");
        this.f31455a = c0Var;
    }

    /* renamed from: a */
    public C11758h mo34289a(C9933a aVar) {
        C11758h a;
        C10202j.m34178b(aVar, "classId");
        C10265c0 c0Var = this.f31455a;
        C9934b d = aVar.mo34986d();
        C10202j.m34174a((Object) d, "classId.packageFqName");
        for (C10240b0 next : c0Var.mo33891a(d)) {
            if ((next instanceof C11773p) && (a = ((C11773p) next).mo38386r().mo34289a(aVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
