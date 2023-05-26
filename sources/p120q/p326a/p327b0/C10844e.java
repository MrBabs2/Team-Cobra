package p120q.p326a.p327b0;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.b0.e */
/* compiled from: ReferenceDisposable */
abstract class C10844e<T> extends AtomicReference<T> implements C10842c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10844e(T t) {
        super(t);
        C10910b.m36861a(t, "value is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36641a(T t);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo36641a(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
