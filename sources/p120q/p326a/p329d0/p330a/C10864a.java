package p120q.p326a.p329d0.p330a;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.a.a */
/* compiled from: ArrayCompositeDisposable */
public final class C10864a extends AtomicReferenceArray<C10842c> implements C10842c {
    public C10864a(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo36664a(int i, C10842c cVar) {
        C10842c cVar2;
        do {
            cVar2 = (C10842c) get(i);
            if (cVar2 == C10867d.DISPOSED) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    public void dispose() {
        C10842c cVar;
        if (get(0) != C10867d.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                C10842c cVar2 = (C10842c) get(i);
                C10867d dVar = C10867d.DISPOSED;
                if (!(cVar2 == dVar || (cVar = (C10842c) getAndSet(i, dVar)) == C10867d.DISPOSED || cVar == null)) {
                    cVar.dispose();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == C10867d.DISPOSED;
    }
}
