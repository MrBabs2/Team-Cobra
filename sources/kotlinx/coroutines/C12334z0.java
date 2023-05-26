package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C12327y0;

/* renamed from: kotlinx.coroutines.z0 */
/* compiled from: EventLoop.kt */
public abstract class C12334z0 extends C12322x0 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39060a(long j, C12327y0.C12329b bVar) {
        if (C12248i0.m40396a()) {
            if (!(this != C12276k0.f32092m)) {
                throw new AssertionError();
            }
        }
        C12276k0.f32092m.mo39049b(j, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract Thread mo38839t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo39061u() {
        Thread t = mo38839t();
        if (Thread.currentThread() != t) {
            C12177a2 a = C12182b2.m40222a();
            if (a != null) {
                a.mo38826a(t);
            } else {
                LockSupport.unpark(t);
            }
        }
    }
}
