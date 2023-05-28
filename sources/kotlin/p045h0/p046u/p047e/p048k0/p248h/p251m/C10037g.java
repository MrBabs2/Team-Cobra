package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.h.m.g */
/* compiled from: constantValues.kt */
public abstract class C10037g<T> {

    /* renamed from: a */
    private final T f27625a;

    public C10037g(T t) {
        this.f27625a = t;
    }

    /* renamed from: a */
    public T mo35244a() {
        return this.f27625a;
    }

    /* renamed from: a */
    public abstract C11824b0 mo35235a(C10393y yVar);

    public boolean equals(Object obj) {
        if (this != obj) {
            Object a = mo35244a();
            Object obj2 = null;
            if (!(obj instanceof C10037g)) {
                obj = null;
            }
            C10037g gVar = (C10037g) obj;
            if (gVar != null) {
                obj2 = gVar.mo35244a();
            }
            return C10202j.m34176a(a, obj2);
        }
    }

    public int hashCode() {
        Object a = mo35244a();
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo35244a());
    }
}
