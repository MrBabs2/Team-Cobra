package p120q.p326a.p329d0.p333d;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11439m;

/* renamed from: q.a.d0.d.h */
/* compiled from: BlockingObserver */
public final class C10926h<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

    /* renamed from: g */
    public static final Object f28985g = new Object();

    /* renamed from: f */
    final Queue<Object> f28986f;

    public C10926h(Queue<Object> queue) {
        this.f28986f = queue;
    }

    public void dispose() {
        if (C10867d.m36773a((AtomicReference<C10842c>) this)) {
            this.f28986f.offer(f28985g);
        }
    }

    public boolean isDisposed() {
        return get() == C10867d.DISPOSED;
    }

    public void onComplete() {
        this.f28986f.offer(C11439m.m37474a());
    }

    public void onError(Throwable th) {
        this.f28986f.offer(C11439m.m37475a(th));
    }

    public void onNext(T t) {
        Queue<Object> queue = this.f28986f;
        C11439m.m37483e(t);
        queue.offer(t);
    }

    public void onSubscribe(C10842c cVar) {
        C10867d.m36778c(this, cVar);
    }
}
