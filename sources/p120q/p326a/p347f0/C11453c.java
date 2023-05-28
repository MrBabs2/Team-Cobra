package p120q.p326a.p347f0;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11433h;

/* renamed from: q.a.f0.c */
/* compiled from: DisposableObserver */
public abstract class C11453c<T> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final AtomicReference<C10842c> f30643f = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37212a() {
    }

    public final void dispose() {
        C10867d.m36773a(this.f30643f);
    }

    public final boolean isDisposed() {
        return this.f30643f.get() == C10867d.DISPOSED;
    }

    public final void onSubscribe(C10842c cVar) {
        if (C11433h.m37461a(this.f30643f, cVar, getClass())) {
            mo37212a();
        }
    }
}
