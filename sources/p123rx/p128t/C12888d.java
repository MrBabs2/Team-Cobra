package p123rx.p128t;

import p123rx.C5375k;
import p123rx.p401n.p405d.C12754a;

/* renamed from: rx.t.d */
/* compiled from: SerialSubscription */
public final class C12888d implements C5375k {

    /* renamed from: f */
    final C12754a f33138f = new C12754a();

    /* renamed from: a */
    public void mo41109a(C5375k kVar) {
        if (kVar != null) {
            this.f33138f.mo40879b(kVar);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    public boolean isUnsubscribed() {
        return this.f33138f.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f33138f.unsubscribe();
    }

    /* renamed from: a */
    public C5375k mo41108a() {
        return this.f33138f.mo40877a();
    }
}
