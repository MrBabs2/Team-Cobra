package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p393g2.C12228m;

/* renamed from: kotlinx.coroutines.q0 */
/* compiled from: Builders.common.kt */
final class C12298q0<T> extends C12228m<T> {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f32113j = AtomicIntegerFieldUpdater.newUpdater(C12298q0.class, "_decision");
    private volatile int _decision = 0;

    public C12298q0(C9069g gVar, C9064d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* renamed from: r */
    private final boolean m40535r() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f32113j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: s */
    private final boolean m40536s() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f32113j.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38900a(Object obj) {
        mo38817e(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38817e(Object obj) {
        if (!m40535r()) {
            C12295p0.m40532a(C9078c.m29783a(this.f32002i), C12306s.m40632a(obj, this.f32002i));
        }
    }

    /* renamed from: q */
    public final Object mo39001q() {
        if (m40536s()) {
            return C9081d.m29785a();
        }
        Object b = C12305r1.m40625b(mo39013h());
        if (!(b instanceof C12303r)) {
            return b;
        }
        throw ((C12303r) b).f32123a;
    }
}
