package p123rx;

import p123rx.p401n.p406e.C12791l;

/* renamed from: rx.j */
/* compiled from: Subscriber */
public abstract class C12475j<T> implements C5372f<T>, C5375k {
    private static final long NOT_SET = Long.MIN_VALUE;
    private C12473g producer;
    private long requested;
    private final C12475j<?> subscriber;
    private final C12791l subscriptions;

    protected C12475j() {
        this((C12475j<?>) null, false);
    }

    private void addToRequested(long j) {
        long j2 = this.requested;
        if (j2 == NOT_SET) {
            this.requested = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j3;
        }
    }

    public final void add(C5375k kVar) {
        this.subscriptions.mo40914a(kVar);
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    /* access modifiers changed from: protected */
    public final void request(long j) {
        if (j >= 0) {
            synchronized (this) {
                if (this.producer != null) {
                    C12473g gVar = this.producer;
                    gVar.request(j);
                    return;
                }
                addToRequested(j);
                return;
            }
        }
        throw new IllegalArgumentException("number requested cannot be negative: " + j);
    }

    public void setProducer(C12473g gVar) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = gVar;
            z = this.subscriber != null && j == NOT_SET;
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET) {
            this.producer.request(Long.MAX_VALUE);
        } else {
            this.producer.request(j);
        }
    }

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected C12475j(C12475j<?> jVar) {
        this(jVar, true);
    }

    protected C12475j(C12475j<?> jVar, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = jVar;
        this.subscriptions = (!z || jVar == null) ? new C12791l() : jVar.subscriptions;
    }
}
