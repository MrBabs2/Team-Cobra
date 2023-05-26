package p120q.p326a.p329d0.p330a;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10852f;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.a.b */
/* compiled from: CancellableDisposable */
public final class C10865b extends AtomicReference<C10852f> implements C10842c {
    public C10865b(C10852f fVar) {
        super(fVar);
    }

    public void dispose() {
        C10852f fVar;
        if (get() != null && (fVar = (C10852f) getAndSet((Object) null)) != null) {
            try {
                fVar.cancel();
            } catch (Exception e) {
                C9034a.m29708a(e);
                C11459a.m37531b((Throwable) e);
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
