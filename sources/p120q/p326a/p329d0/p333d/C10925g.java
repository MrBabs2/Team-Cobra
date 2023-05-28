package p120q.p326a.p329d0.p333d;

import java.util.concurrent.CountDownLatch;
import p120q.p326a.C10863d;
import p120q.p326a.C11479k;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;

/* renamed from: q.a.d0.d.g */
/* compiled from: BlockingMultiObserver */
public final class C10925g<T> extends CountDownLatch implements C11498y<T>, C10863d, C11479k<T> {

    /* renamed from: f */
    T f28981f;

    /* renamed from: g */
    Throwable f28982g;

    /* renamed from: h */
    C10842c f28983h;

    /* renamed from: i */
    volatile boolean f28984i;

    public C10925g() {
        super(1);
    }

    /* renamed from: a */
    public T mo36712a() {
        if (getCount() != 0) {
            try {
                C11430e.m37453a();
                await();
            } catch (InterruptedException e) {
                mo36713b();
                throw C11435j.m37463a((Throwable) e);
            }
        }
        Throwable th = this.f28982g;
        if (th == null) {
            return this.f28981f;
        }
        throw C11435j.m37463a(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36713b() {
        this.f28984i = true;
        C10842c cVar = this.f28983h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f28982g = th;
        countDown();
    }

    public void onSubscribe(C10842c cVar) {
        this.f28983h = cVar;
        if (this.f28984i) {
            cVar.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f28981f = t;
        countDown();
    }
}
