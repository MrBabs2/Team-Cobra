package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.w */
/* compiled from: Lazy.kt */
public final class C10484w<T> implements C9134f<T>, Serializable {

    /* renamed from: f */
    private C9102a<? extends T> f28358f;

    /* renamed from: g */
    private Object f28359g = C10482u.f28356a;

    public C10484w(C9102a<? extends T> aVar) {
        C10202j.m34178b(aVar, "initializer");
        this.f28358f = aVar;
    }

    private final Object writeReplace() {
        return new C9129e(getValue());
    }

    /* renamed from: a */
    public boolean mo35895a() {
        return this.f28359g != C10482u.f28356a;
    }

    public T getValue() {
        if (this.f28359g == C10482u.f28356a) {
            C9102a<? extends T> aVar = this.f28358f;
            if (aVar != null) {
                this.f28359g = aVar.invoke();
                this.f28358f = null;
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        return this.f28359g;
    }

    public String toString() {
        return mo35895a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
