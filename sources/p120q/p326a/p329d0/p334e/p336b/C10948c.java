package p120q.p326a.p329d0.p334e.p336b;

import java.util.concurrent.atomic.AtomicLong;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.MissingBackpressureException;
import p120q.p326a.C11460h;
import p120q.p326a.C11471i;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p341f.C11384b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p344i.C11423a;
import p120q.p326a.p329d0.p344i.C11424b;
import p120q.p326a.p329d0.p345j.C11429d;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.b.c */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C10948c<T> extends C10945a<T, T> {

    /* renamed from: h */
    final int f29029h;

    /* renamed from: i */
    final boolean f29030i;

    /* renamed from: j */
    final boolean f29031j;

    /* renamed from: k */
    final C10847a f29032k;

    public C10948c(C11460h<T> hVar, int i, boolean z, boolean z2, C10847a aVar) {
        super(hVar);
        this.f29029h = i;
        this.f29030i = z;
        this.f29031j = z2;
        this.f29032k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36741b(C12935b<? super T> bVar) {
        this.f29025g.mo37218a(new C10949a(bVar, this.f29029h, this.f29030i, this.f29031j, this.f29032k));
    }

    /* renamed from: q.a.d0.e.b.c$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class C10949a<T> extends C11423a<T> implements C11471i<T> {

        /* renamed from: f */
        final C12935b<? super T> f29033f;

        /* renamed from: g */
        final C10917f<T> f29034g;

        /* renamed from: h */
        final boolean f29035h;

        /* renamed from: i */
        final C10847a f29036i;

        /* renamed from: j */
        C12936c f29037j;

        /* renamed from: k */
        volatile boolean f29038k;

        /* renamed from: l */
        volatile boolean f29039l;

        /* renamed from: m */
        Throwable f29040m;

        /* renamed from: n */
        final AtomicLong f29041n = new AtomicLong();

        /* renamed from: o */
        boolean f29042o;

        C10949a(C12935b<? super T> bVar, int i, boolean z, boolean z2, C10847a aVar) {
            C10917f<T> fVar;
            this.f29033f = bVar;
            this.f29036i = aVar;
            this.f29035h = z2;
            if (z) {
                fVar = new C11385c<>(i);
            } else {
                fVar = new C11384b<>(i);
            }
            this.f29034g = fVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            if (C11424b.m37440a(this.f29037j, cVar)) {
                this.f29037j = cVar;
                this.f29033f.mo36628a(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            if (!this.f29038k) {
                this.f29038k = true;
                this.f29037j.cancel();
                if (!this.f29042o && getAndIncrement() == 0) {
                    this.f29034g.clear();
                }
            }
        }

        public void clear() {
            this.f29034g.clear();
        }

        public boolean isEmpty() {
            return this.f29034g.isEmpty();
        }

        public void onComplete() {
            this.f29039l = true;
            if (this.f29042o) {
                this.f29033f.onComplete();
            } else {
                mo36744a();
            }
        }

        public void onError(Throwable th) {
            this.f29040m = th;
            this.f29039l = true;
            if (this.f29042o) {
                this.f29033f.onError(th);
            } else {
                mo36744a();
            }
        }

        public void onNext(T t) {
            if (!this.f29034g.offer(t)) {
                this.f29037j.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f29036i.run();
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f29042o) {
                this.f29033f.onNext(null);
            } else {
                mo36744a();
            }
        }

        public T poll() throws Exception {
            return this.f29034g.poll();
        }

        public void request(long j) {
            if (!this.f29042o && C11424b.m37436a(j)) {
                C11429d.m37451a(this.f29041n, j);
                mo36744a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36744a() {
            if (getAndIncrement() == 0) {
                C10917f<T> fVar = this.f29034g;
                C12935b<? super T> bVar = this.f29033f;
                int i = 1;
                while (!mo36745a(this.f29039l, fVar.isEmpty(), bVar)) {
                    long j = this.f29041n.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f29039l;
                        T poll = fVar.poll();
                        boolean z2 = poll == null;
                        if (!mo36745a(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !mo36745a(this.f29039l, fVar.isEmpty(), bVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f29041n.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36745a(boolean z, boolean z2, C12935b<? super T> bVar) {
            if (this.f29038k) {
                this.f29034g.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f29035h) {
                    Throwable th = this.f29040m;
                    if (th != null) {
                        this.f29034g.clear();
                        bVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f29040m;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f29042o = true;
            return 2;
        }
    }
}
