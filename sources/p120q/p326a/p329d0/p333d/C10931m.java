package p120q.p326a.p329d0.p333d;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p345j.C11445q;

/* renamed from: q.a.d0.d.m */
/* compiled from: InnerQueuedObserver */
public final class C10931m<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C10932n<T> f29000f;

    /* renamed from: g */
    final int f29001g;

    /* renamed from: h */
    C10918g<T> f29002h;

    /* renamed from: i */
    volatile boolean f29003i;

    /* renamed from: j */
    int f29004j;

    public C10931m(C10932n<T> nVar, int i) {
        this.f29000f = nVar;
        this.f29001g = i;
    }

    /* renamed from: a */
    public boolean mo36722a() {
        return this.f29003i;
    }

    /* renamed from: b */
    public C10918g<T> mo36723b() {
        return this.f29002h;
    }

    /* renamed from: c */
    public void mo36724c() {
        this.f29003i = true;
    }

    public void dispose() {
        C10867d.m36773a((AtomicReference<C10842c>) this);
    }

    public boolean isDisposed() {
        return C10867d.m36775a((C10842c) get());
    }

    public void onComplete() {
        this.f29000f.mo36726a(this);
    }

    public void onError(Throwable th) {
        this.f29000f.mo36728a(this, th);
    }

    public void onNext(T t) {
        if (this.f29004j == 0) {
            this.f29000f.mo36727a(this, t);
        } else {
            this.f29000f.mo36725a();
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (C10867d.m36778c(this, cVar)) {
            if (cVar instanceof C10913b) {
                C10913b bVar = (C10913b) cVar;
                int a = bVar.mo36665a(3);
                if (a == 1) {
                    this.f29004j = a;
                    this.f29002h = bVar;
                    this.f29003i = true;
                    this.f29000f.mo36726a(this);
                    return;
                } else if (a == 2) {
                    this.f29004j = a;
                    this.f29002h = bVar;
                    return;
                }
            }
            this.f29002h = C11445q.m37497a(-this.f29001g);
        }
    }
}
