package p120q.p326a.p329d0.p343h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11471i;
import p120q.p326a.p329d0.p344i.C11424b;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11437k;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.h.a */
/* compiled from: StrictSubscriber */
public class C11422a<T> extends AtomicInteger implements C11471i<T>, C12936c {

    /* renamed from: f */
    final C12935b<? super T> f30600f;

    /* renamed from: g */
    final C11428c f30601g = new C11428c();

    /* renamed from: h */
    final AtomicLong f30602h = new AtomicLong();

    /* renamed from: i */
    final AtomicReference<C12936c> f30603i = new AtomicReference<>();

    /* renamed from: j */
    final AtomicBoolean f30604j = new AtomicBoolean();

    /* renamed from: k */
    volatile boolean f30605k;

    public C11422a(C12935b<? super T> bVar) {
        this.f30600f = bVar;
    }

    /* renamed from: a */
    public void mo36628a(C12936c cVar) {
        if (this.f30604j.compareAndSet(false, true)) {
            this.f30600f.mo36628a(this);
            C11424b.m37438a(this.f30603i, this.f30602h, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void cancel() {
        if (!this.f30605k) {
            C11424b.m37437a(this.f30603i);
        }
    }

    public void onComplete() {
        this.f30605k = true;
        C11437k.m37472a((C12935b<?>) this.f30600f, (AtomicInteger) this, this.f30601g);
    }

    public void onError(Throwable th) {
        this.f30605k = true;
        C11437k.m37471a((C12935b<?>) this.f30600f, th, (AtomicInteger) this, this.f30601g);
    }

    public void onNext(T t) {
        C11437k.m37470a(this.f30600f, t, (AtomicInteger) this, this.f30601g);
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C11424b.m37435a(this.f30603i, this.f30602h, j);
    }
}
