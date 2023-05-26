package p120q.p326a.p329d0.p333d;

import java.util.concurrent.CountDownLatch;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;

/* renamed from: q.a.d0.d.d */
/* compiled from: BlockingBaseObserver */
public abstract class C10922d<T> extends CountDownLatch implements C11490u<T>, C10842c {

    /* renamed from: f */
    T f28977f;

    /* renamed from: g */
    Throwable f28978g;

    /* renamed from: h */
    C10842c f28979h;

    /* renamed from: i */
    volatile boolean f28980i;

    public C10922d() {
        super(1);
    }

    /* renamed from: a */
    public final T mo36710a() {
        if (getCount() != 0) {
            try {
                C11430e.m37453a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C11435j.m37463a((Throwable) e);
            }
        }
        Throwable th = this.f28978g;
        if (th == null) {
            return this.f28977f;
        }
        throw C11435j.m37463a(th);
    }

    public final void dispose() {
        this.f28980i = true;
        C10842c cVar = this.f28979h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.f28980i;
    }

    public final void onComplete() {
        countDown();
    }

    public final void onSubscribe(C10842c cVar) {
        this.f28979h = cVar;
        if (this.f28980i) {
            cVar.dispose();
        }
    }
}
