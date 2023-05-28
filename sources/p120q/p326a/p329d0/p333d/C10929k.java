package p120q.p326a.p329d0.p333d;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.k */
/* compiled from: ForEachWhileObserver */
public final class C10929k<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C10862p<? super T> f28993f;

    /* renamed from: g */
    final C10853g<? super Throwable> f28994g;

    /* renamed from: h */
    final C10847a f28995h;

    /* renamed from: i */
    boolean f28996i;

    public C10929k(C10862p<? super T> pVar, C10853g<? super Throwable> gVar, C10847a aVar) {
        this.f28993f = pVar;
        this.f28994g = gVar;
        this.f28995h = aVar;
    }

    public void dispose() {
        C10867d.m36773a((AtomicReference<C10842c>) this);
    }

    public boolean isDisposed() {
        return C10867d.m36775a((C10842c) get());
    }

    public void onComplete() {
        if (!this.f28996i) {
            this.f28996i = true;
            try {
                this.f28995h.run();
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f28996i) {
            C11459a.m37531b(th);
            return;
        }
        this.f28996i = true;
        try {
            this.f28994g.mo8098a(th);
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C11459a.m37531b((Throwable) new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        if (!this.f28996i) {
            try {
                if (!this.f28993f.mo36663a(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C10842c cVar) {
        C10867d.m36778c(this, cVar);
    }
}
