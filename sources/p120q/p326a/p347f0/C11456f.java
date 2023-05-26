package p120q.p326a.p347f0;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10863d;
import p120q.p326a.C11479k;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10913b;

/* renamed from: q.a.f0.f */
/* compiled from: TestObserver */
public class C11456f<T> extends C11451a<T, C11456f<T>> implements C11490u<T>, C10842c, C11479k<T>, C11498y<T>, C10863d {

    /* renamed from: m */
    private final C11490u<? super T> f30653m;

    /* renamed from: n */
    private final AtomicReference<C10842c> f30654n;

    /* renamed from: o */
    private C10913b<T> f30655o;

    /* renamed from: q.a.f0.f$a */
    /* compiled from: TestObserver */
    enum C11457a implements C11490u<Object> {
        INSTANCE;

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(C10842c cVar) {
        }
    }

    public C11456f() {
        this(C11457a.INSTANCE);
    }

    public final void dispose() {
        C10867d.m36773a(this.f30654n);
    }

    public final boolean isDisposed() {
        return C10867d.m36775a(this.f30654n.get());
    }

    public void onComplete() {
        if (!this.f30639j) {
            this.f30639j = true;
            if (this.f30654n.get() == null) {
                this.f30637h.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f30638i++;
            this.f30653m.onComplete();
        } finally {
            this.f30635f.countDown();
        }
    }

    public void onError(Throwable th) {
        if (!this.f30639j) {
            this.f30639j = true;
            if (this.f30654n.get() == null) {
                this.f30637h.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th == null) {
                this.f30637h.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f30637h.add(th);
            }
            this.f30653m.onError(th);
        } finally {
            this.f30635f.countDown();
        }
    }

    public void onNext(T t) {
        if (!this.f30639j) {
            this.f30639j = true;
            if (this.f30654n.get() == null) {
                this.f30637h.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        if (this.f30641l == 2) {
            while (true) {
                try {
                    T poll = this.f30655o.poll();
                    if (poll != null) {
                        this.f30636g.add(poll);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    this.f30637h.add(th);
                    this.f30655o.dispose();
                    return;
                }
            }
        } else {
            this.f30636g.add(t);
            if (t == null) {
                this.f30637h.add(new NullPointerException("onNext received a null value"));
            }
            this.f30653m.onNext(t);
        }
    }

    public void onSubscribe(C10842c cVar) {
        Thread.currentThread();
        if (cVar == null) {
            this.f30637h.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.f30654n.compareAndSet((Object) null, cVar)) {
            cVar.dispose();
            if (this.f30654n.get() != C10867d.DISPOSED) {
                this.f30637h.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + cVar));
            }
        } else {
            int i = this.f30640k;
            if (i != 0 && (cVar instanceof C10913b)) {
                C10913b<T> bVar = (C10913b) cVar;
                this.f30655o = bVar;
                int a = bVar.mo36665a(i);
                this.f30641l = a;
                if (a == 1) {
                    this.f30639j = true;
                    Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.f30655o.poll();
                            if (poll != null) {
                                this.f30636g.add(poll);
                            } else {
                                this.f30638i++;
                                this.f30654n.lazySet(C10867d.DISPOSED);
                                return;
                            }
                        } catch (Throwable th) {
                            this.f30637h.add(th);
                            return;
                        }
                    }
                }
            }
            this.f30653m.onSubscribe(cVar);
        }
    }

    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    public C11456f(C11490u<? super T> uVar) {
        this.f30654n = new AtomicReference<>();
        this.f30653m = uVar;
    }
}
