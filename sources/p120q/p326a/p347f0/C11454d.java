package p120q.p326a.p347f0;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.f0.d */
/* compiled from: SafeObserver */
public final class C11454d<T> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C11490u<? super T> f30644f;

    /* renamed from: g */
    C10842c f30645g;

    /* renamed from: h */
    boolean f30646h;

    public C11454d(C11490u<? super T> uVar) {
        this.f30644f = uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37213a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f30644f.onSubscribe(C10868e.INSTANCE);
            try {
                this.f30644f.onError(nullPointerException);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b((Throwable) new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C11459a.m37531b((Throwable) new CompositeException(nullPointerException, th2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37214b() {
        this.f30646h = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f30644f.onSubscribe(C10868e.INSTANCE);
            try {
                this.f30644f.onError(nullPointerException);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b((Throwable) new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C11459a.m37531b((Throwable) new CompositeException(nullPointerException, th2));
        }
    }

    public void dispose() {
        this.f30645g.dispose();
    }

    public boolean isDisposed() {
        return this.f30645g.isDisposed();
    }

    public void onComplete() {
        if (!this.f30646h) {
            this.f30646h = true;
            if (this.f30645g == null) {
                mo37213a();
                return;
            }
            try {
                this.f30644f.onComplete();
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f30646h) {
            C11459a.m37531b(th);
            return;
        }
        this.f30646h = true;
        if (this.f30645g == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f30644f.onSubscribe(C10868e.INSTANCE);
                try {
                    this.f30644f.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    C11459a.m37531b((Throwable) new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                C9034a.m29708a(th3);
                C11459a.m37531b((Throwable) new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f30644f.onError(th);
            } catch (Throwable th4) {
                C9034a.m29708a(th4);
                C11459a.m37531b((Throwable) new CompositeException(th, th4));
            }
        }
    }

    public void onNext(T t) {
        if (!this.f30646h) {
            if (this.f30645g == null) {
                mo37214b();
            } else if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f30645g.dispose();
                    onError(nullPointerException);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    onError(new CompositeException(nullPointerException, th));
                }
            } else {
                try {
                    this.f30644f.onNext(t);
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    onError(new CompositeException(th, th2));
                }
            }
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (C10867d.m36776a(this.f30645g, cVar)) {
            this.f30645g = cVar;
            try {
                this.f30644f.onSubscribe(this);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b((Throwable) new CompositeException(th, th));
            }
        }
    }
}
