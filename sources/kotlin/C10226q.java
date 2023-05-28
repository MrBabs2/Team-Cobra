package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo16641d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.q */
/* compiled from: LazyJVM.kt */
final class C10226q<T> implements C9134f<T>, Serializable {

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater<C10226q<?>, Object> f27865h = AtomicReferenceFieldUpdater.newUpdater(C10226q.class, Object.class, "g");

    /* renamed from: f */
    private volatile C9102a<? extends T> f27866f;

    /* renamed from: g */
    private volatile Object f27867g = C10482u.f28356a;

    /* renamed from: kotlin.q$a */
    /* compiled from: LazyJVM.kt */
    public static final class C10227a {
        private C10227a() {
        }

        public /* synthetic */ C10227a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10227a((DefaultConstructorMarker) null);
    }

    public C10226q(C9102a<? extends T> aVar) {
        C10202j.m34178b(aVar, "initializer");
        this.f27866f = aVar;
        C10482u uVar = C10482u.f28356a;
    }

    private final Object writeReplace() {
        return new C9129e(getValue());
    }

    /* renamed from: a */
    public boolean mo35399a() {
        return this.f27867g != C10482u.f28356a;
    }

    public T getValue() {
        T t = this.f27867g;
        if (t != C10482u.f28356a) {
            return t;
        }
        C9102a<? extends T> aVar = this.f27866f;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f27865h.compareAndSet(this, C10482u.f28356a, invoke)) {
                this.f27866f = null;
                return invoke;
            }
        }
        return this.f27867g;
    }

    public String toString() {
        return mo35399a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
