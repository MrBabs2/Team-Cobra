package p120q.p326a.p329d0.p334e.p339e;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p339e.C11109j1;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.q1 */
/* compiled from: ObservableJoin */
public final class C11227q1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C10980a<TLeft, R> {

    /* renamed from: g */
    final C11488s<? extends TRight> f29988g;

    /* renamed from: h */
    final C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> f29989h;

    /* renamed from: i */
    final C10861o<? super TRight, ? extends C11488s<TRightEnd>> f29990i;

    /* renamed from: j */
    final C10849c<? super TLeft, ? super TRight, ? extends R> f29991j;

    /* renamed from: q.a.d0.e.e.q1$a */
    /* compiled from: ObservableJoin */
    static final class C11228a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C10842c, C11109j1.C11111b {

        /* renamed from: s */
        static final Integer f29992s = 1;

        /* renamed from: t */
        static final Integer f29993t = 2;

        /* renamed from: u */
        static final Integer f29994u = 3;

        /* renamed from: v */
        static final Integer f29995v = 4;

        /* renamed from: f */
        final C11490u<? super R> f29996f;

        /* renamed from: g */
        final C11385c<Object> f29997g = new C11385c<>(C11482n.bufferSize());

        /* renamed from: h */
        final C10841b f29998h = new C10841b();

        /* renamed from: i */
        final Map<Integer, TLeft> f29999i = new LinkedHashMap();

        /* renamed from: j */
        final Map<Integer, TRight> f30000j = new LinkedHashMap();

        /* renamed from: k */
        final AtomicReference<Throwable> f30001k = new AtomicReference<>();

        /* renamed from: l */
        final C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> f30002l;

        /* renamed from: m */
        final C10861o<? super TRight, ? extends C11488s<TRightEnd>> f30003m;

        /* renamed from: n */
        final C10849c<? super TLeft, ? super TRight, ? extends R> f30004n;

        /* renamed from: o */
        final AtomicInteger f30005o;

        /* renamed from: p */
        int f30006p;

        /* renamed from: q */
        int f30007q;

        /* renamed from: r */
        volatile boolean f30008r;

        C11228a(C11490u<? super R> uVar, C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f29996f = uVar;
            this.f30002l = oVar;
            this.f30003m = oVar2;
            this.f30004n = cVar;
            this.f30005o = new AtomicInteger(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36968a() {
            this.f29998h.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36971b() {
            if (getAndIncrement() == 0) {
                C11385c<Object> cVar = this.f29997g;
                C11490u<? super R> uVar = this.f29996f;
                int i = 1;
                while (!this.f30008r) {
                    if (this.f30001k.get() != null) {
                        cVar.clear();
                        mo36968a();
                        mo36970a((C11490u<?>) uVar);
                        return;
                    }
                    boolean z = this.f30005o.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.f29999i.clear();
                        this.f30000j.clear();
                        this.f29998h.dispose();
                        uVar.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        if (num == f29992s) {
                            int i2 = this.f30006p;
                            this.f30006p = i2 + 1;
                            this.f29999i.put(Integer.valueOf(i2), poll);
                            try {
                                Object apply = this.f30002l.apply(poll);
                                C10910b.m36861a(apply, "The leftEnd returned a null ObservableSource");
                                C11488s sVar = (C11488s) apply;
                                C11109j1.C11112c cVar2 = new C11109j1.C11112c(this, true, i2);
                                this.f29998h.mo36646b(cVar2);
                                sVar.subscribe(cVar2);
                                if (this.f30001k.get() != null) {
                                    cVar.clear();
                                    mo36968a();
                                    mo36970a((C11490u<?>) uVar);
                                    return;
                                }
                                for (TRight a : this.f30000j.values()) {
                                    try {
                                        Object a2 = this.f30004n.mo7653a(poll, a);
                                        C10910b.m36861a(a2, "The resultSelector returned a null value");
                                        uVar.onNext(a2);
                                    } catch (Throwable th) {
                                        mo36969a(th, uVar, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                mo36969a(th2, uVar, cVar);
                                return;
                            }
                        } else if (num == f29993t) {
                            int i3 = this.f30007q;
                            this.f30007q = i3 + 1;
                            this.f30000j.put(Integer.valueOf(i3), poll);
                            try {
                                Object apply2 = this.f30003m.apply(poll);
                                C10910b.m36861a(apply2, "The rightEnd returned a null ObservableSource");
                                C11488s sVar2 = (C11488s) apply2;
                                C11109j1.C11112c cVar3 = new C11109j1.C11112c(this, false, i3);
                                this.f29998h.mo36646b(cVar3);
                                sVar2.subscribe(cVar3);
                                if (this.f30001k.get() != null) {
                                    cVar.clear();
                                    mo36968a();
                                    mo36970a((C11490u<?>) uVar);
                                    return;
                                }
                                for (TLeft a3 : this.f29999i.values()) {
                                    try {
                                        Object a4 = this.f30004n.mo7653a(a3, poll);
                                        C10910b.m36861a(a4, "The resultSelector returned a null value");
                                        uVar.onNext(a4);
                                    } catch (Throwable th3) {
                                        mo36969a(th3, uVar, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                mo36969a(th4, uVar, cVar);
                                return;
                            }
                        } else if (num == f29994u) {
                            C11109j1.C11112c cVar4 = (C11109j1.C11112c) poll;
                            this.f29999i.remove(Integer.valueOf(cVar4.f29594h));
                            this.f29998h.mo36645a((C10842c) cVar4);
                        } else {
                            C11109j1.C11112c cVar5 = (C11109j1.C11112c) poll;
                            this.f30000j.remove(Integer.valueOf(cVar5.f29594h));
                            this.f29998h.mo36645a((C10842c) cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        public void dispose() {
            if (!this.f30008r) {
                this.f30008r = true;
                mo36968a();
                if (getAndIncrement() == 0) {
                    this.f29997g.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f30008r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36970a(C11490u<?> uVar) {
            Throwable a = C11435j.m37465a(this.f30001k);
            this.f29999i.clear();
            this.f30000j.clear();
            uVar.onError(a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36969a(Throwable th, C11490u<?> uVar, C11385c<?> cVar) {
            C9034a.m29708a(th);
            C11435j.m37466a(this.f30001k, th);
            cVar.clear();
            mo36968a();
            mo36970a(uVar);
        }

        /* renamed from: a */
        public void mo36883a(C11109j1.C11113d dVar) {
            this.f29998h.mo36647c(dVar);
            this.f30005o.decrementAndGet();
            mo36971b();
        }

        /* renamed from: a */
        public void mo36885a(boolean z, Object obj) {
            synchronized (this) {
                this.f29997g.mo37109a(z ? f29992s : f29993t, obj);
            }
            mo36971b();
        }

        /* renamed from: a */
        public void mo36886a(boolean z, C11109j1.C11112c cVar) {
            synchronized (this) {
                this.f29997g.mo37109a(z ? f29994u : f29995v, cVar);
            }
            mo36971b();
        }

        /* renamed from: a */
        public void mo36881a(Throwable th) {
            if (C11435j.m37466a(this.f30001k, th)) {
                mo36971b();
            } else {
                C11459a.m37531b(th);
            }
        }

        /* renamed from: b */
        public void mo36888b(Throwable th) {
            if (C11435j.m37466a(this.f30001k, th)) {
                this.f30005o.decrementAndGet();
                mo36971b();
                return;
            }
            C11459a.m37531b(th);
        }
    }

    public C11227q1(C11488s<TLeft> sVar, C11488s<? extends TRight> sVar2, C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(sVar);
        this.f29988g = sVar2;
        this.f29989h = oVar;
        this.f29990i = oVar2;
        this.f29991j = cVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        C11228a aVar = new C11228a(uVar, this.f29989h, this.f29990i, this.f29991j);
        uVar.onSubscribe(aVar);
        C11109j1.C11113d dVar = new C11109j1.C11113d(aVar, true);
        aVar.f29998h.mo36646b(dVar);
        C11109j1.C11113d dVar2 = new C11109j1.C11113d(aVar, false);
        aVar.f29998h.mo36646b(dVar2);
        this.f29150f.subscribe(dVar);
        this.f29988g.subscribe(dVar2);
    }
}
