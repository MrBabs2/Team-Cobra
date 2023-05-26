package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11986c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.l.a */
/* compiled from: modifierChecks.kt */
public abstract class C11983a {
    /* renamed from: a */
    public abstract List<C11990d> mo38624a();

    /* renamed from: a */
    public final C11986c mo38625a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        for (C11990d next : mo38624a()) {
            if (next.mo38631b(uVar)) {
                return next.mo38630a(uVar);
            }
        }
        return C11986c.C11987a.f31692b;
    }
}
