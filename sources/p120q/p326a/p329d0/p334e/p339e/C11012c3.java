package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10850d;
import p120q.p326a.p329d0.p330a.C10864a;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c3 */
/* compiled from: ObservableSequenceEqualSingle */
public final class C11012c3<T> extends C11496w<Boolean> implements C10912a<Boolean> {

    /* renamed from: f */
    final C11488s<? extends T> f29250f;

    /* renamed from: g */
    final C11488s<? extends T> f29251g;

    /* renamed from: h */
    final C10850d<? super T, ? super T> f29252h;

    /* renamed from: i */
    final int f29253i;

    /* renamed from: q.a.d0.e.e.c3$a */
    /* compiled from: ObservableSequenceEqualSingle */
    static final class C11013a<T> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11498y<? super Boolean> f29254f;

        /* renamed from: g */
        final C10850d<? super T, ? super T> f29255g;

        /* renamed from: h */
        final C10864a f29256h = new C10864a(2);

        /* renamed from: i */
        final C11488s<? extends T> f29257i;

        /* renamed from: j */
        final C11488s<? extends T> f29258j;

        /* renamed from: k */
        final C11014b<T>[] f29259k;

        /* renamed from: l */
        volatile boolean f29260l;

        /* renamed from: m */
        T f29261m;

        /* renamed from: n */
        T f29262n;

        C11013a(C11498y<? super Boolean> yVar, int i, C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar) {
            this.f29254f = yVar;
            this.f29257i = sVar;
            this.f29258j = sVar2;
            this.f29255g = dVar;
            C11014b<T>[] bVarArr = new C11014b[2];
            this.f29259k = bVarArr;
            bVarArr[0] = new C11014b<>(this, 0, i);
            bVarArr[1] = new C11014b<>(this, 1, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36814a(C10842c cVar, int i) {
            return this.f29256h.mo36664a(i, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36815b() {
            C11014b<T>[] bVarArr = this.f29259k;
            this.f29257i.subscribe(bVarArr[0]);
            this.f29258j.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.f29260l) {
                this.f29260l = true;
                this.f29256h.dispose();
                if (getAndIncrement() == 0) {
                    C11014b<T>[] bVarArr = this.f29259k;
                    bVarArr[0].f29264g.clear();
                    bVarArr[1].f29264g.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29260l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36813a(C11385c<T> cVar, C11385c<T> cVar2) {
            this.f29260l = true;
            cVar.clear();
            cVar2.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36812a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                C11014b<T>[] bVarArr = this.f29259k;
                C11014b<T> bVar = bVarArr[0];
                C11385c<T> cVar = bVar.f29264g;
                C11014b<T> bVar2 = bVarArr[1];
                C11385c<T> cVar2 = bVar2.f29264g;
                int i = 1;
                while (!this.f29260l) {
                    boolean z = bVar.f29266i;
                    if (!z || (th2 = bVar.f29267j) == null) {
                        boolean z2 = bVar2.f29266i;
                        if (!z2 || (th = bVar2.f29267j) == null) {
                            if (this.f29261m == null) {
                                this.f29261m = cVar.poll();
                            }
                            boolean z3 = this.f29261m == null;
                            if (this.f29262n == null) {
                                this.f29262n = cVar2.poll();
                            }
                            boolean z4 = this.f29262n == null;
                            if (z && z2 && z3 && z4) {
                                this.f29254f.onSuccess(true);
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f29255g.mo36653a(this.f29261m, this.f29262n)) {
                                            mo36813a(cVar, cVar2);
                                            this.f29254f.onSuccess(false);
                                            return;
                                        }
                                        this.f29261m = null;
                                        this.f29262n = null;
                                    } catch (Throwable th3) {
                                        C9034a.m29708a(th3);
                                        mo36813a(cVar, cVar2);
                                        this.f29254f.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                    return;
                                }
                            } else {
                                mo36813a(cVar, cVar2);
                                this.f29254f.onSuccess(false);
                                return;
                            }
                        } else {
                            mo36813a(cVar, cVar2);
                            this.f29254f.onError(th);
                            return;
                        }
                    } else {
                        mo36813a(cVar, cVar2);
                        this.f29254f.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.c3$b */
    /* compiled from: ObservableSequenceEqualSingle */
    static final class C11014b<T> implements C11490u<T> {

        /* renamed from: f */
        final C11013a<T> f29263f;

        /* renamed from: g */
        final C11385c<T> f29264g;

        /* renamed from: h */
        final int f29265h;

        /* renamed from: i */
        volatile boolean f29266i;

        /* renamed from: j */
        Throwable f29267j;

        C11014b(C11013a<T> aVar, int i, int i2) {
            this.f29263f = aVar;
            this.f29265h = i;
            this.f29264g = new C11385c<>(i2);
        }

        public void onComplete() {
            this.f29266i = true;
            this.f29263f.mo36812a();
        }

        public void onError(Throwable th) {
            this.f29267j = th;
            this.f29266i = true;
            this.f29263f.mo36812a();
        }

        public void onNext(T t) {
            this.f29264g.offer(t);
            this.f29263f.mo36812a();
        }

        public void onSubscribe(C10842c cVar) {
            this.f29263f.mo36814a(cVar, this.f29265h);
        }
    }

    public C11012c3(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar, int i) {
        this.f29250f = sVar;
        this.f29251g = sVar2;
        this.f29252h = dVar;
        this.f29253i = i;
    }

    /* renamed from: a */
    public C11482n<Boolean> mo36701a() {
        return C11459a.m37519a(new C10999b3(this.f29250f, this.f29251g, this.f29252h, this.f29253i));
    }

    /* renamed from: b */
    public void mo36633b(C11498y<? super Boolean> yVar) {
        C11013a aVar = new C11013a(yVar, this.f29253i, this.f29250f, this.f29251g, this.f29252h);
        yVar.onSubscribe(aVar);
        aVar.mo36815b();
    }
}
