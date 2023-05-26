package kotlinx.coroutines.p393g2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C12248i0;

/* renamed from: kotlinx.coroutines.g2.c */
/* compiled from: Atomic.kt */
public abstract class C12208c<T> extends C12226k {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f31974a = AtomicReferenceFieldUpdater.newUpdater(C12208c.class, Object.class, "_consensus");
    private volatile Object _consensus = C12207b.f31973a;

    /* renamed from: a */
    public final Object mo38859a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C12207b.f31973a) {
            obj2 = mo38863b(mo38864c(obj));
        }
        mo38861a(obj, obj2);
        return obj2;
    }

    /* renamed from: a */
    public C12208c<?> mo38860a() {
        return this;
    }

    /* renamed from: a */
    public abstract void mo38861a(T t, Object obj);

    /* renamed from: b */
    public long mo38862b() {
        return 0;
    }

    /* renamed from: b */
    public final Object mo38863b(Object obj) {
        if (C12248i0.m40396a()) {
            if (!(obj != C12207b.f31973a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        if (obj2 != C12207b.f31973a) {
            return obj2;
        }
        if (f31974a.compareAndSet(this, C12207b.f31973a, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: c */
    public abstract Object mo38864c(T t);
}
