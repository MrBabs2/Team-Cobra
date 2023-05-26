package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10850d;
import p120q.p326a.p329d0.p330a.C10864a;
import p120q.p326a.p329d0.p341f.C11385c;

/* renamed from: q.a.d0.e.e.b3 */
/* compiled from: ObservableSequenceEqual */
public final class C10999b3<T> extends C11482n<Boolean> {

    /* renamed from: f */
    final C11488s<? extends T> f29197f;

    /* renamed from: g */
    final C11488s<? extends T> f29198g;

    /* renamed from: h */
    final C10850d<? super T, ? super T> f29199h;

    /* renamed from: i */
    final int f29200i;

    /* renamed from: q.a.d0.e.e.b3$a */
    /* compiled from: ObservableSequenceEqual */
    static final class C11000a<T> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11490u<? super Boolean> f29201f;

        /* renamed from: g */
        final C10850d<? super T, ? super T> f29202g;

        /* renamed from: h */
        final C10864a f29203h = new C10864a(2);

        /* renamed from: i */
        final C11488s<? extends T> f29204i;

        /* renamed from: j */
        final C11488s<? extends T> f29205j;

        /* renamed from: k */
        final C11001b<T>[] f29206k;

        /* renamed from: l */
        volatile boolean f29207l;

        /* renamed from: m */
        T f29208m;

        /* renamed from: n */
        T f29209n;

        C11000a(C11490u<? super Boolean> uVar, int i, C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar) {
            this.f29201f = uVar;
            this.f29204i = sVar;
            this.f29205j = sVar2;
            this.f29202g = dVar;
            C11001b<T>[] bVarArr = new C11001b[2];
            this.f29206k = bVarArr;
            bVarArr[0] = new C11001b<>(this, 0, i);
            bVarArr[1] = new C11001b<>(this, 1, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36797a(C10842c cVar, int i) {
            return this.f29203h.mo36664a(i, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36798b() {
            C11001b<T>[] bVarArr = this.f29206k;
            this.f29204i.subscribe(bVarArr[0]);
            this.f29205j.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.f29207l) {
                this.f29207l = true;
                this.f29203h.dispose();
                if (getAndIncrement() == 0) {
                    C11001b<T>[] bVarArr = this.f29206k;
                    bVarArr[0].f29211g.clear();
                    bVarArr[1].f29211g.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29207l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36796a(C11385c<T> cVar, C11385c<T> cVar2) {
            this.f29207l = true;
            cVar.clear();
            cVar2.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36795a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                C11001b<T>[] bVarArr = this.f29206k;
                C11001b<T> bVar = bVarArr[0];
                C11385c<T> cVar = bVar.f29211g;
                C11001b<T> bVar2 = bVarArr[1];
                C11385c<T> cVar2 = bVar2.f29211g;
                int i = 1;
                while (!this.f29207l) {
                    boolean z = bVar.f29213i;
                    if (!z || (th2 = bVar.f29214j) == null) {
                        boolean z2 = bVar2.f29213i;
                        if (!z2 || (th = bVar2.f29214j) == null) {
                            if (this.f29208m == null) {
                                this.f29208m = cVar.poll();
                            }
                            boolean z3 = this.f29208m == null;
                            if (this.f29209n == null) {
                                this.f29209n = cVar2.poll();
                            }
                            boolean z4 = this.f29209n == null;
                            if (z && z2 && z3 && z4) {
                                this.f29201f.onNext(true);
                                this.f29201f.onComplete();
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f29202g.mo36653a(this.f29208m, this.f29209n)) {
                                            mo36796a(cVar, cVar2);
                                            this.f29201f.onNext(false);
                                            this.f29201f.onComplete();
                                            return;
                                        }
                                        this.f29208m = null;
                                        this.f29209n = null;
                                    } catch (Throwable th3) {
                                        C9034a.m29708a(th3);
                                        mo36796a(cVar, cVar2);
                                        this.f29201f.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                    return;
                                }
                            } else {
                                mo36796a(cVar, cVar2);
                                this.f29201f.onNext(false);
                                this.f29201f.onComplete();
                                return;
                            }
                        } else {
                            mo36796a(cVar, cVar2);
                            this.f29201f.onError(th);
                            return;
                        }
                    } else {
                        mo36796a(cVar, cVar2);
                        this.f29201f.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.b3$b */
    /* compiled from: ObservableSequenceEqual */
    static final class C11001b<T> implements C11490u<T> {

        /* renamed from: f */
        final C11000a<T> f29210f;

        /* renamed from: g */
        final C11385c<T> f29211g;

        /* renamed from: h */
        final int f29212h;

        /* renamed from: i */
        volatile boolean f29213i;

        /* renamed from: j */
        Throwable f29214j;

        C11001b(C11000a<T> aVar, int i, int i2) {
            this.f29210f = aVar;
            this.f29212h = i;
            this.f29211g = new C11385c<>(i2);
        }

        public void onComplete() {
            this.f29213i = true;
            this.f29210f.mo36795a();
        }

        public void onError(Throwable th) {
            this.f29214j = th;
            this.f29213i = true;
            this.f29210f.mo36795a();
        }

        public void onNext(T t) {
            this.f29211g.offer(t);
            this.f29210f.mo36795a();
        }

        public void onSubscribe(C10842c cVar) {
            this.f29210f.mo36797a(cVar, this.f29212h);
        }
    }

    public C10999b3(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar, int i) {
        this.f29197f = sVar;
        this.f29198g = sVar2;
        this.f29199h = dVar;
        this.f29200i = i;
    }

    public void subscribeActual(C11490u<? super Boolean> uVar) {
        C11000a aVar = new C11000a(uVar, this.f29200i, this.f29197f, this.f29198g, this.f29199h);
        uVar.onSubscribe(aVar);
        aVar.mo36798b();
    }
}
