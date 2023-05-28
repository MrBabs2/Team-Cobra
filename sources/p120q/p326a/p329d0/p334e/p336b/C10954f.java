package p120q.p326a.p329d0.p334e.p336b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11460h;
import p120q.p326a.C11471i;
import p120q.p326a.p329d0.p344i.C11424b;
import p120q.p326a.p329d0.p345j.C11429d;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.b.f */
/* compiled from: FlowableOnBackpressureLatest */
public final class C10954f<T> extends C10945a<T, T> {
    public C10954f(C11460h<T> hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36741b(C12935b<? super T> bVar) {
        this.f29025g.mo37218a(new C10955a(bVar));
    }

    /* renamed from: q.a.d0.e.b.f$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class C10955a<T> extends AtomicInteger implements C11471i<T>, C12936c {

        /* renamed from: f */
        final C12935b<? super T> f29051f;

        /* renamed from: g */
        C12936c f29052g;

        /* renamed from: h */
        volatile boolean f29053h;

        /* renamed from: i */
        Throwable f29054i;

        /* renamed from: j */
        volatile boolean f29055j;

        /* renamed from: k */
        final AtomicLong f29056k = new AtomicLong();

        /* renamed from: l */
        final AtomicReference<T> f29057l = new AtomicReference<>();

        C10955a(C12935b<? super T> bVar) {
            this.f29051f = bVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            if (C11424b.m37440a(this.f29052g, cVar)) {
                this.f29052g = cVar;
                this.f29051f.mo36628a(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            if (!this.f29055j) {
                this.f29055j = true;
                this.f29052g.cancel();
                if (getAndIncrement() == 0) {
                    this.f29057l.lazySet((Object) null);
                }
            }
        }

        public void onComplete() {
            this.f29053h = true;
            mo36746a();
        }

        public void onError(Throwable th) {
            this.f29054i = th;
            this.f29053h = true;
            mo36746a();
        }

        public void onNext(T t) {
            this.f29057l.lazySet(t);
            mo36746a();
        }

        public void request(long j) {
            if (C11424b.m37436a(j)) {
                C11429d.m37451a(this.f29056k, j);
                mo36746a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36746a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C12935b<? super T> bVar = this.f29051f;
                AtomicLong atomicLong = this.f29056k;
                AtomicReference<T> atomicReference = this.f29057l;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f29053h;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!mo36747a(z2, z3, bVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            bVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f29053h;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo36747a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C11429d.m37452b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36747a(boolean z, boolean z2, C12935b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f29055j) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f29054i;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.onComplete();
                    return true;
                }
            }
        }
    }
}
