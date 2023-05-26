package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.r */
/* compiled from: CompletedExceptionally.kt */
public class C12303r {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f32122b = AtomicIntegerFieldUpdater.newUpdater(C12303r.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f32123a;

    public C12303r(Throwable th, boolean z) {
        this.f32123a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean mo39028a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo39029b() {
        return f32122b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C12256j0.m40409a((Object) this) + '[' + this.f32123a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12303r(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
