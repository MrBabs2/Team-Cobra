package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C10483v;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlinx.coroutines.i1 */
/* compiled from: JobSupport.kt */
final class C12249i1 extends C12282l1<C12277k1> {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f32028k = AtomicIntegerFieldUpdater.newUpdater(C12249i1.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: j */
    private final C9113l<Throwable, C10483v> f32029j;

    public C12249i1(C12277k1 k1Var, C9113l<? super Throwable, C10483v> lVar) {
        super(k1Var);
        this.f32029j = lVar;
    }

    /* renamed from: b */
    public void mo38940b(Throwable th) {
        if (f32028k.compareAndSet(this, 0, 1)) {
            this.f32029j.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38940b((Throwable) obj);
        return C10483v.f28357a;
    }

    public String toString() {
        return "InvokeOnCancelling[" + C12256j0.m40409a((Object) this) + '@' + C12256j0.m40411b(this) + ']';
    }
}
