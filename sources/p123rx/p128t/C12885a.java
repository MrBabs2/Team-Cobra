package p123rx.p128t;

import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5375k;
import p123rx.p126m.C5377a;

/* renamed from: rx.t.a */
/* compiled from: BooleanSubscription */
public final class C12885a implements C5375k {

    /* renamed from: g */
    static final C5377a f33135g = new C12886a();

    /* renamed from: f */
    final AtomicReference<C5377a> f33136f;

    /* renamed from: rx.t.a$a */
    /* compiled from: BooleanSubscription */
    static class C12886a implements C5377a {
        C12886a() {
        }

        public void call() {
        }
    }

    public C12885a() {
        this.f33136f = new AtomicReference<>();
    }

    /* renamed from: a */
    public static C12885a m41495a() {
        return new C12885a();
    }

    public boolean isUnsubscribed() {
        return this.f33136f.get() == f33135g;
    }

    public void unsubscribe() {
        C5377a andSet;
        C5377a aVar = this.f33136f.get();
        C5377a aVar2 = f33135g;
        if (aVar != aVar2 && (andSet = this.f33136f.getAndSet(aVar2)) != null && andSet != f33135g) {
            andSet.call();
        }
    }

    /* renamed from: a */
    public static C12885a m41496a(C5377a aVar) {
        return new C12885a(aVar);
    }

    private C12885a(C5377a aVar) {
        this.f33136f = new AtomicReference<>(aVar);
    }
}
