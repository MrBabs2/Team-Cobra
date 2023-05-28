package p123rx.p401n.p405d;

import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5375k;
import p123rx.p128t.C12889e;

/* renamed from: rx.n.d.a */
/* compiled from: SequentialSubscription */
public final class C12754a extends AtomicReference<C5375k> implements C5375k {
    public C12754a() {
    }

    /* renamed from: a */
    public C5375k mo40877a() {
        C5375k kVar = (C5375k) super.get();
        return kVar == C12755b.INSTANCE ? C12889e.m41502b() : kVar;
    }

    /* renamed from: b */
    public boolean mo40879b(C5375k kVar) {
        C5375k kVar2;
        do {
            kVar2 = (C5375k) get();
            if (kVar2 == C12755b.INSTANCE) {
                if (kVar == null) {
                    return false;
                }
                kVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(kVar2, kVar));
        if (kVar2 == null) {
            return true;
        }
        kVar2.unsubscribe();
        return true;
    }

    public boolean isUnsubscribed() {
        return get() == C12755b.INSTANCE;
    }

    public void unsubscribe() {
        C5375k kVar;
        C5375k kVar2 = (C5375k) get();
        C12755b bVar = C12755b.INSTANCE;
        if (kVar2 != bVar && (kVar = (C5375k) getAndSet(bVar)) != null && kVar != C12755b.INSTANCE) {
            kVar.unsubscribe();
        }
    }

    public C12754a(C5375k kVar) {
        lazySet(kVar);
    }

    /* renamed from: a */
    public boolean mo40878a(C5375k kVar) {
        C5375k kVar2;
        do {
            kVar2 = (C5375k) get();
            if (kVar2 == C12755b.INSTANCE) {
                if (kVar == null) {
                    return false;
                }
                kVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(kVar2, kVar));
        return true;
    }
}
