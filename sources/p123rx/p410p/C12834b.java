package p123rx.p410p;

import p123rx.C12464c;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.CompositeException;
import p123rx.exceptions.OnCompletedFailedException;
import p123rx.exceptions.OnErrorFailedException;
import p123rx.p411q.C12844c;

/* renamed from: rx.p.b */
/* compiled from: SafeCompletableSubscriber */
public final class C12834b implements C12464c, C5375k {

    /* renamed from: f */
    final C12464c f33050f;

    /* renamed from: g */
    C5375k f33051g;

    /* renamed from: h */
    boolean f33052h;

    public C12834b(C12464c cVar) {
        this.f33050f = cVar;
    }

    /* renamed from: a */
    public void mo18613a(C5375k kVar) {
        this.f33051g = kVar;
        try {
            this.f33050f.mo18613a(this);
        } catch (Throwable th) {
            C12472a.m40945c(th);
            kVar.unsubscribe();
            onError(th);
        }
    }

    public boolean isUnsubscribed() {
        return this.f33052h || this.f33051g.isUnsubscribed();
    }

    public void onCompleted() {
        if (!this.f33052h) {
            this.f33052h = true;
            try {
                this.f33050f.onCompleted();
            } catch (Throwable th) {
                C12472a.m40945c(th);
                throw new OnCompletedFailedException(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f33052h) {
            C12844c.m41417b(th);
            return;
        }
        this.f33052h = true;
        try {
            this.f33050f.onError(th);
        } catch (Throwable th2) {
            C12472a.m40945c(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    public void unsubscribe() {
        this.f33051g.unsubscribe();
    }
}
