package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9739v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.c.b.w */
/* compiled from: methodSignatureMapping.kt */
public final class C9741w implements C9739v<C9713j> {

    /* renamed from: a */
    public static final C9741w f26708a = new C9741w();

    private C9741w() {
    }

    /* renamed from: a */
    public C9713j m31423a(C10342e eVar) {
        C10202j.m34178b(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: a */
    public void mo34348a(C11824b0 b0Var, C10342e eVar) {
        C10202j.m34178b(b0Var, "kotlinType");
        C10202j.m34178b(eVar, "descriptor");
    }

    /* renamed from: b */
    public String mo34350b(C10342e eVar) {
        C10202j.m34178b(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: a */
    public C11824b0 mo34347a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "kotlinType");
        return C9739v.C9740a.m31420a(this, b0Var);
    }

    /* renamed from: a */
    public boolean mo34349a() {
        return C9739v.C9740a.m31421a(this);
    }

    /* renamed from: a */
    public C11824b0 mo34346a(Collection<? extends C11824b0> collection) {
        C10202j.m34178b(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C10539w.m35773a(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null));
    }
}
