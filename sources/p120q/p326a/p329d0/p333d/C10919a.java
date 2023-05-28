package p120q.p326a.p329d0.p333d;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.a */
/* compiled from: BasicFuseableObserver */
public abstract class C10919a<T, R> implements C11490u<T>, C10913b<R> {

    /* renamed from: f */
    protected final C11490u<? super R> f28972f;

    /* renamed from: g */
    protected C10842c f28973g;

    /* renamed from: h */
    protected C10913b<T> f28974h;

    /* renamed from: i */
    protected boolean f28975i;

    /* renamed from: j */
    protected int f28976j;

    public C10919a(C11490u<? super R> uVar) {
        this.f28972f = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36703a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36704a(Throwable th) {
        C9034a.m29708a(th);
        this.f28973g.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo36705b(int i) {
        C10913b<T> bVar = this.f28974h;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = bVar.mo36665a(i);
        if (a != 0) {
            this.f28976j = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo36706b() {
        return true;
    }

    public void clear() {
        this.f28974h.clear();
    }

    public void dispose() {
        this.f28973g.dispose();
    }

    public boolean isDisposed() {
        return this.f28973g.isDisposed();
    }

    public boolean isEmpty() {
        return this.f28974h.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f28975i) {
            this.f28975i = true;
            this.f28972f.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f28975i) {
            C11459a.m37531b(th);
            return;
        }
        this.f28975i = true;
        this.f28972f.onError(th);
    }

    public final void onSubscribe(C10842c cVar) {
        if (C10867d.m36776a(this.f28973g, cVar)) {
            this.f28973g = cVar;
            if (cVar instanceof C10913b) {
                this.f28974h = (C10913b) cVar;
            }
            if (mo36706b()) {
                this.f28972f.onSubscribe(this);
                mo36703a();
            }
        }
    }
}
