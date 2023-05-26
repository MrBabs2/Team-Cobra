package p120q.p326a.p329d0.p330a;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.a.h */
/* compiled from: SequentialDisposable */
public final class C10871h extends AtomicReference<C10842c> implements C10842c {
    public C10871h() {
    }

    /* renamed from: a */
    public boolean mo36672a(C10842c cVar) {
        return C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
    }

    /* renamed from: b */
    public boolean mo36673b(C10842c cVar) {
        return C10867d.m36777b(this, cVar);
    }

    public void dispose() {
        C10867d.m36773a((AtomicReference<C10842c>) this);
    }

    public boolean isDisposed() {
        return C10867d.m36775a((C10842c) get());
    }

    public C10871h(C10842c cVar) {
        lazySet(cVar);
    }
}
