package p123rx.p128t;

import p123rx.C5375k;
import p123rx.p401n.p405d.C12754a;

/* renamed from: rx.t.c */
/* compiled from: MultipleAssignmentSubscription */
public final class C12887c implements C5375k {

    /* renamed from: f */
    final C12754a f33137f = new C12754a();

    /* renamed from: a */
    public void mo41107a(C5375k kVar) {
        if (kVar != null) {
            this.f33137f.mo40878a(kVar);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    public boolean isUnsubscribed() {
        return this.f33137f.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f33137f.unsubscribe();
    }
}
