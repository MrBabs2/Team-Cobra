package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p333d.C10931m;
import p120q.p326a.p329d0.p333d.C10932n;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.v */
/* compiled from: ObservableConcatMapEager */
public final class C11290v<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<? extends R>> f30195g;

    /* renamed from: h */
    final C11434i f30196h;

    /* renamed from: i */
    final int f30197i;

    /* renamed from: j */
    final int f30198j;

    public C11290v(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, C11434i iVar, int i, int i2) {
        super(sVar);
        this.f30195g = oVar;
        this.f30196h = iVar;
        this.f30197i = i;
        this.f30198j = i2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        this.f29150f.subscribe(new C11291a(uVar, this.f30195g, this.f30197i, this.f30198j, this.f30196h));
    }

    /* renamed from: q.a.d0.e.e.v$a */
    /* compiled from: ObservableConcatMapEager */
    static final class C11291a<T, R> extends AtomicInteger implements C11490u<T>, C10842c, C10932n<R> {

        /* renamed from: f */
        final C11490u<? super R> f30199f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends R>> f30200g;

        /* renamed from: h */
        final int f30201h;

        /* renamed from: i */
        final int f30202i;

        /* renamed from: j */
        final C11434i f30203j;

        /* renamed from: k */
        final C11428c f30204k = new C11428c();

        /* renamed from: l */
        final ArrayDeque<C10931m<R>> f30205l = new ArrayDeque<>();

        /* renamed from: m */
        C10918g<T> f30206m;

        /* renamed from: n */
        C10842c f30207n;

        /* renamed from: o */
        volatile boolean f30208o;

        /* renamed from: p */
        int f30209p;

        /* renamed from: q */
        volatile boolean f30210q;

        /* renamed from: r */
        C10931m<R> f30211r;

        /* renamed from: s */
        int f30212s;

        C11291a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, int i2, C11434i iVar) {
            this.f30199f = uVar;
            this.f30200g = oVar;
            this.f30201h = i;
            this.f30202i = i2;
            this.f30203j = iVar;
        }

        /* renamed from: a */
        public void mo36727a(C10931m<R> mVar, R r) {
            mVar.mo36723b().offer(r);
            mo36725a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37017b() {
            C10931m<R> mVar = this.f30211r;
            if (mVar != null) {
                mVar.dispose();
            }
            while (true) {
                C10931m poll = this.f30205l.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37018c() {
            if (getAndIncrement() == 0) {
                do {
                    this.f30206m.clear();
                    mo37017b();
                } while (decrementAndGet() != 0);
            }
        }

        public void dispose() {
            if (!this.f30210q) {
                this.f30210q = true;
                this.f30207n.dispose();
                mo37018c();
            }
        }

        public boolean isDisposed() {
            return this.f30210q;
        }

        public void onComplete() {
            this.f30208o = true;
            mo36725a();
        }

        public void onError(Throwable th) {
            if (this.f30204k.mo37169a(th)) {
                this.f30208o = true;
                mo36725a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (this.f30209p == 0) {
                this.f30206m.offer(t);
            }
            mo36725a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30207n, cVar)) {
                this.f30207n = cVar;
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(3);
                    if (a == 1) {
                        this.f30209p = a;
                        this.f30206m = bVar;
                        this.f30208o = true;
                        this.f30199f.onSubscribe(this);
                        mo36725a();
                        return;
                    } else if (a == 2) {
                        this.f30209p = a;
                        this.f30206m = bVar;
                        this.f30199f.onSubscribe(this);
                        return;
                    }
                }
                this.f30206m = new C11385c(this.f30202i);
                this.f30199f.onSubscribe(this);
            }
        }

        /* renamed from: a */
        public void mo36728a(C10931m<R> mVar, Throwable th) {
            if (this.f30204k.mo37169a(th)) {
                if (this.f30203j == C11434i.IMMEDIATE) {
                    this.f30207n.dispose();
                }
                mVar.mo36724c();
                mo36725a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* renamed from: a */
        public void mo36726a(C10931m<R> mVar) {
            mVar.mo36724c();
            mo36725a();
        }

        /* renamed from: a */
        public void mo36725a() {
            if (getAndIncrement() == 0) {
                C10918g<T> gVar = this.f30206m;
                ArrayDeque<C10931m<R>> arrayDeque = this.f30205l;
                C11490u<? super R> uVar = this.f30199f;
                C11434i iVar = this.f30203j;
                int i = 1;
                while (true) {
                    int i2 = this.f30212s;
                    while (true) {
                        if (i2 == this.f30201h) {
                            break;
                        } else if (this.f30210q) {
                            gVar.clear();
                            mo37017b();
                            return;
                        } else if (iVar != C11434i.IMMEDIATE || ((Throwable) this.f30204k.get()) == null) {
                            try {
                                T poll = gVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                Object apply = this.f30200g.apply(poll);
                                C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                                C11488s sVar = (C11488s) apply;
                                C10931m mVar = new C10931m(this, this.f30202i);
                                arrayDeque.offer(mVar);
                                sVar.subscribe(mVar);
                                i2++;
                            } catch (Throwable th) {
                                C9034a.m29708a(th);
                                this.f30207n.dispose();
                                gVar.clear();
                                mo37017b();
                                this.f30204k.mo37169a(th);
                                uVar.onError(this.f30204k.mo37168a());
                                return;
                            }
                        } else {
                            gVar.clear();
                            mo37017b();
                            uVar.onError(this.f30204k.mo37168a());
                            return;
                        }
                    }
                    this.f30212s = i2;
                    if (this.f30210q) {
                        gVar.clear();
                        mo37017b();
                        return;
                    } else if (iVar != C11434i.IMMEDIATE || ((Throwable) this.f30204k.get()) == null) {
                        C10931m<R> mVar2 = this.f30211r;
                        if (mVar2 == null) {
                            if (iVar != C11434i.BOUNDARY || ((Throwable) this.f30204k.get()) == null) {
                                boolean z = this.f30208o;
                                C10931m<R> poll2 = arrayDeque.poll();
                                boolean z2 = poll2 == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.f30211r = poll2;
                                    }
                                    mVar2 = poll2;
                                } else if (((Throwable) this.f30204k.get()) != null) {
                                    gVar.clear();
                                    mo37017b();
                                    uVar.onError(this.f30204k.mo37168a());
                                    return;
                                } else {
                                    uVar.onComplete();
                                    return;
                                }
                            } else {
                                gVar.clear();
                                mo37017b();
                                uVar.onError(this.f30204k.mo37168a());
                                return;
                            }
                        }
                        if (mVar2 != null) {
                            C10918g<R> b = mVar2.mo36723b();
                            while (!this.f30210q) {
                                boolean a = mVar2.mo36722a();
                                if (iVar != C11434i.IMMEDIATE || ((Throwable) this.f30204k.get()) == null) {
                                    try {
                                        R poll3 = b.poll();
                                        boolean z3 = poll3 == null;
                                        if (a && z3) {
                                            this.f30211r = null;
                                            this.f30212s--;
                                        } else if (!z3) {
                                            uVar.onNext(poll3);
                                        }
                                    } catch (Throwable th2) {
                                        C9034a.m29708a(th2);
                                        this.f30204k.mo37169a(th2);
                                        this.f30211r = null;
                                        this.f30212s--;
                                    }
                                } else {
                                    gVar.clear();
                                    mo37017b();
                                    uVar.onError(this.f30204k.mo37168a());
                                    return;
                                }
                            }
                            gVar.clear();
                            mo37017b();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        gVar.clear();
                        mo37017b();
                        uVar.onError(this.f30204k.mo37168a());
                        return;
                    }
                }
            }
        }
    }
}
