package p120q.p326a.p329d0.p333d;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.o */
/* compiled from: LambdaObserver */
public final class C10933o<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C10853g<? super T> f29005f;

    /* renamed from: g */
    final C10853g<? super Throwable> f29006g;

    /* renamed from: h */
    final C10847a f29007h;

    /* renamed from: i */
    final C10853g<? super C10842c> f29008i;

    public C10933o(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar, C10853g<? super C10842c> gVar3) {
        this.f29005f = gVar;
        this.f29006g = gVar2;
        this.f29007h = aVar;
        this.f29008i = gVar3;
    }

    public void dispose() {
        C10867d.m36773a((AtomicReference<C10842c>) this);
    }

    public boolean isDisposed() {
        return get() == C10867d.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(C10867d.DISPOSED);
            try {
                this.f29007h.run();
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C10867d.DISPOSED);
            try {
                this.f29006g.mo8098a(th);
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                C11459a.m37531b((Throwable) new CompositeException(th, th2));
            }
        } else {
            C11459a.m37531b(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f29005f.mo8098a(t);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                ((C10842c) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (C10867d.m36778c(this, cVar)) {
            try {
                this.f29008i.mo8098a(this);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                cVar.dispose();
                onError(th);
            }
        }
    }
}
