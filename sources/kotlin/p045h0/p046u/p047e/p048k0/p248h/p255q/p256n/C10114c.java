package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.h.q.n.c */
/* compiled from: ImplicitClassReceiver.kt */
public class C10114c implements C10115d, C10118g {

    /* renamed from: a */
    private final C10342e f27740a;

    public C10114c(C10342e eVar, C10114c cVar) {
        C10202j.m34178b(eVar, "classDescriptor");
        this.f27740a = eVar;
    }

    public boolean equals(Object obj) {
        C10342e eVar = this.f27740a;
        C10342e eVar2 = null;
        if (!(obj instanceof C10114c)) {
            obj = null;
        }
        C10114c cVar = (C10114c) obj;
        if (cVar != null) {
            eVar2 = cVar.f27740a;
        }
        return C10202j.m34176a((Object) eVar, (Object) eVar2);
    }

    public int hashCode() {
        return this.f27740a.hashCode();
    }

    /* renamed from: n */
    public final C10342e mo35323n() {
        return this.f27740a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    public C11901j0 getType() {
        C11901j0 o = this.f27740a.mo35445o();
        C10202j.m34174a((Object) o, "classDescriptor.defaultType");
        return o;
    }
}
