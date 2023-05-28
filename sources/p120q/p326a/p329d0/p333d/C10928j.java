package p120q.p326a.p329d0.p333d;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.j */
/* compiled from: DisposableLambdaObserver */
public final class C10928j<T> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C11490u<? super T> f28989f;

    /* renamed from: g */
    final C10853g<? super C10842c> f28990g;

    /* renamed from: h */
    final C10847a f28991h;

    /* renamed from: i */
    C10842c f28992i;

    public C10928j(C11490u<? super T> uVar, C10853g<? super C10842c> gVar, C10847a aVar) {
        this.f28989f = uVar;
        this.f28990g = gVar;
        this.f28991h = aVar;
    }

    public void dispose() {
        C10842c cVar = this.f28992i;
        C10867d dVar = C10867d.DISPOSED;
        if (cVar != dVar) {
            this.f28992i = dVar;
            try {
                this.f28991h.run();
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b(th);
            }
            cVar.dispose();
        }
    }

    public boolean isDisposed() {
        return this.f28992i.isDisposed();
    }

    public void onComplete() {
        C10842c cVar = this.f28992i;
        C10867d dVar = C10867d.DISPOSED;
        if (cVar != dVar) {
            this.f28992i = dVar;
            this.f28989f.onComplete();
        }
    }

    public void onError(Throwable th) {
        C10842c cVar = this.f28992i;
        C10867d dVar = C10867d.DISPOSED;
        if (cVar != dVar) {
            this.f28992i = dVar;
            this.f28989f.onError(th);
            return;
        }
        C11459a.m37531b(th);
    }

    public void onNext(T t) {
        this.f28989f.onNext(t);
    }

    public void onSubscribe(C10842c cVar) {
        try {
            this.f28990g.mo8098a(cVar);
            if (C10867d.m36776a(this.f28992i, cVar)) {
                this.f28992i = cVar;
                this.f28989f.onSubscribe(this);
            }
        } catch (Throwable th) {
            C9034a.m29708a(th);
            cVar.dispose();
            this.f28992i = C10867d.DISPOSED;
            C10868e.m36781a(th, (C11490u<?>) this.f28989f);
        }
    }
}
