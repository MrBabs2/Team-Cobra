package kotlin;

import kotlin.C10222o;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.p */
/* compiled from: Result.kt */
public final class C10225p {
    /* renamed from: a */
    public static final Object m34213a(Throwable th) {
        C10202j.m34178b(th, "exception");
        return new C10222o.C10224b(th);
    }

    /* renamed from: a */
    public static final void m34214a(Object obj) {
        if (obj instanceof C10222o.C10224b) {
            throw ((C10222o.C10224b) obj).f27864f;
        }
    }
}
