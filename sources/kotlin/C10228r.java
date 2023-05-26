package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.r */
/* compiled from: LazyJVM.kt */
final class C10228r<T> implements C9134f<T>, Serializable {

    /* renamed from: f */
    private C9102a<? extends T> f27868f;

    /* renamed from: g */
    private volatile Object f27869g;

    /* renamed from: h */
    private final Object f27870h;

    public C10228r(C9102a<? extends T> aVar, Object obj) {
        C10202j.m34178b(aVar, "initializer");
        this.f27868f = aVar;
        this.f27869g = C10482u.f28356a;
        this.f27870h = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C9129e(getValue());
    }

    /* renamed from: a */
    public boolean mo35401a() {
        return this.f27869g != C10482u.f28356a;
    }

    public T getValue() {
        T t;
        T t2 = this.f27869g;
        if (t2 != C10482u.f28356a) {
            return t2;
        }
        synchronized (this.f27870h) {
            t = this.f27869g;
            if (t == C10482u.f28356a) {
                C9102a aVar = this.f27868f;
                if (aVar != null) {
                    t = aVar.invoke();
                    this.f27869g = t;
                    this.f27868f = null;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return mo35401a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10228r(C9102a aVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
