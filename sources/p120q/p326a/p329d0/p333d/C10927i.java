package p120q.p326a.p329d0.p333d;

import p120q.p326a.C11490u;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.i */
/* compiled from: DeferredScalarDisposable */
public class C10927i<T> extends C10920b<T> {

    /* renamed from: f */
    protected final C11490u<? super T> f28987f;

    /* renamed from: g */
    protected T f28988g;

    public C10927i(C11490u<? super T> uVar) {
        this.f28987f = uVar;
    }

    /* renamed from: a */
    public final int mo36665a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void clear() {
        lazySet(32);
        this.f28988g = null;
    }

    public void dispose() {
        set(4);
        this.f28988g = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f28988g;
        this.f28988g = null;
        lazySet(32);
        return t;
    }

    /* renamed from: a */
    public final void mo36715a(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C11490u<? super T> uVar = this.f28987f;
            if (i == 8) {
                this.f28988g = t;
                lazySet(16);
                uVar.onNext(null);
            } else {
                lazySet(2);
                uVar.onNext(t);
            }
            if (get() != 4) {
                uVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public final void mo36716a(Throwable th) {
        if ((get() & 54) != 0) {
            C11459a.m37531b(th);
            return;
        }
        lazySet(2);
        this.f28987f.onError(th);
    }

    /* renamed from: a */
    public final void mo36714a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f28987f.onComplete();
        }
    }
}
