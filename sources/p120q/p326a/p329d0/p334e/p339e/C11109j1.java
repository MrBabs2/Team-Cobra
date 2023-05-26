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
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.j1 */
/* compiled from: ObservableGroupJoin */
public final class C11109j1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C10980a<TLeft, R> {

    /* renamed from: g */
    final C11488s<? extends TRight> f29571g;

    /* renamed from: h */
    final C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> f29572h;

    /* renamed from: i */
    final C10861o<? super TRight, ? extends C11488s<TRightEnd>> f29573i;

    /* renamed from: j */
    final C10849c<? super TLeft, ? super C11482n<TRight>, ? extends R> f29574j;

    /* renamed from: q.a.d0.e.e.j1$a */
    /* compiled from: ObservableGroupJoin */
    static final class C11110a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C10842c, C11111b {

        /* renamed from: s */
        static final Integer f29575s = 1;

        /* renamed from: t */
        static final Integer f29576t = 2;

        /* renamed from: u */
        static final Integer f29577u = 3;

        /* renamed from: v */
        static final Integer f29578v = 4;

        /* renamed from: f */
        final C11490u<? super R> f29579f;

        /* renamed from: g */
        final C11385c<Object> f29580g = new C11385c<>(C11482n.bufferSize());

        /* renamed from: h */
        final C10841b f29581h = new C10841b();

        /* renamed from: i */
        final Map<Integer, C11476d<TRight>> f29582i = new LinkedHashMap();

        /* renamed from: j */
        final Map<Integer, TRight> f29583j = new LinkedHashMap();

        /* renamed from: k */
        final AtomicReference<Throwable> f29584k = new AtomicReference<>();

        /* renamed from: l */
        final C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> f29585l;

        /* renamed from: m */
        final C10861o<? super TRight, ? extends C11488s<TRightEnd>> f29586m;

        /* renamed from: n */
        final C10849c<? super TLeft, ? super C11482n<TRight>, ? extends R> f29587n;

        /* renamed from: o */
        final AtomicInteger f29588o;

        /* renamed from: p */
        int f29589p;

        /* renamed from: q */
        int f29590q;

        /* renamed from: r */
        volatile boolean f29591r;

        C11110a(C11490u<? super R> uVar, C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super TLeft, ? super C11482n<TRight>, ? extends R> cVar) {
            this.f29579f = uVar;
            this.f29585l = oVar;
            this.f29586m = oVar2;
            this.f29587n = cVar;
            this.f29588o = new AtomicInteger(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36880a() {
            this.f29581h.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36887b() {
            if (getAndIncrement() == 0) {
                C11385c<Object> cVar = this.f29580g;
                C11490u<? super R> uVar = this.f29579f;
                int i = 1;
                while (!this.f29591r) {
                    if (this.f29584k.get() != null) {
                        cVar.clear();
                        mo36880a();
                        mo36884a((C11490u<?>) uVar);
                        return;
                    }
                    boolean z = this.f29588o.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        for (C11476d<TRight> onComplete : this.f29582i.values()) {
                            onComplete.onComplete();
                        }
                        this.f29582i.clear();
                        this.f29583j.clear();
                        this.f29581h.dispose();
                        uVar.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        if (num == f29575s) {
                            C11476d e = C11476d.m37564e();
                            int i2 = this.f29589p;
                            this.f29589p = i2 + 1;
                            this.f29582i.put(Integer.valueOf(i2), e);
                            try {
                                Object apply = this.f29585l.apply(poll);
                                C10910b.m36861a(apply, "The leftEnd returned a null ObservableSource");
                                C11488s sVar = (C11488s) apply;
                                C11112c cVar2 = new C11112c(this, true, i2);
                                this.f29581h.mo36646b(cVar2);
                                sVar.subscribe(cVar2);
                                if (this.f29584k.get() != null) {
                                    cVar.clear();
                                    mo36880a();
                                    mo36884a((C11490u<?>) uVar);
                                    return;
                                }
                                try {
                                    Object a = this.f29587n.mo7653a(poll, e);
                                    C10910b.m36861a(a, "The resultSelector returned a null value");
                                    uVar.onNext(a);
                                    for (TRight onNext : this.f29583j.values()) {
                                        e.onNext(onNext);
                                    }
                                } catch (Throwable th) {
                                    mo36882a(th, uVar, cVar);
                                    return;
                                }
                            } catch (Throwable th2) {
                                mo36882a(th2, uVar, cVar);
                                return;
                            }
                        } else if (num == f29576t) {
                            int i3 = this.f29590q;
                            this.f29590q = i3 + 1;
                            this.f29583j.put(Integer.valueOf(i3), poll);
                            try {
                                Object apply2 = this.f29586m.apply(poll);
                                C10910b.m36861a(apply2, "The rightEnd returned a null ObservableSource");
                                C11488s sVar2 = (C11488s) apply2;
                                C11112c cVar3 = new C11112c(this, false, i3);
                                this.f29581h.mo36646b(cVar3);
                                sVar2.subscribe(cVar3);
                                if (this.f29584k.get() != null) {
                                    cVar.clear();
                                    mo36880a();
                                    mo36884a((C11490u<?>) uVar);
                                    return;
                                }
                                for (C11476d<TRight> onNext2 : this.f29582i.values()) {
                                    onNext2.onNext(poll);
                                }
                            } catch (Throwable th3) {
                                mo36882a(th3, uVar, cVar);
                                return;
                            }
                        } else if (num == f29577u) {
                            C11112c cVar4 = (C11112c) poll;
                            C11476d remove = this.f29582i.remove(Integer.valueOf(cVar4.f29594h));
                            this.f29581h.mo36645a((C10842c) cVar4);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == f29578v) {
                            C11112c cVar5 = (C11112c) poll;
                            this.f29583j.remove(Integer.valueOf(cVar5.f29594h));
                            this.f29581h.mo36645a((C10842c) cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        public void dispose() {
            if (!this.f29591r) {
                this.f29591r = true;
                mo36880a();
                if (getAndIncrement() == 0) {
                    this.f29580g.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29591r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36884a(C11490u<?> uVar) {
            Throwable a = C11435j.m37465a(this.f29584k);
            for (C11476d<TRight> onError : this.f29582i.values()) {
                onError.onError(a);
            }
            this.f29582i.clear();
            this.f29583j.clear();
            uVar.onError(a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36882a(Throwable th, C11490u<?> uVar, C11385c<?> cVar) {
            C9034a.m29708a(th);
            C11435j.m37466a(this.f29584k, th);
            cVar.clear();
            mo36880a();
            mo36884a(uVar);
        }

        /* renamed from: a */
        public void mo36883a(C11113d dVar) {
            this.f29581h.mo36647c(dVar);
            this.f29588o.decrementAndGet();
            mo36887b();
        }

        /* renamed from: a */
        public void mo36885a(boolean z, Object obj) {
            synchronized (this) {
                this.f29580g.mo37109a(z ? f29575s : f29576t, obj);
            }
            mo36887b();
        }

        /* renamed from: a */
        public void mo36886a(boolean z, C11112c cVar) {
            synchronized (this) {
                this.f29580g.mo37109a(z ? f29577u : f29578v, cVar);
            }
            mo36887b();
        }

        /* renamed from: a */
        public void mo36881a(Throwable th) {
            if (C11435j.m37466a(this.f29584k, th)) {
                mo36887b();
            } else {
                C11459a.m37531b(th);
            }
        }

        /* renamed from: b */
        public void mo36888b(Throwable th) {
            if (C11435j.m37466a(this.f29584k, th)) {
                this.f29588o.decrementAndGet();
                mo36887b();
                return;
            }
            C11459a.m37531b(th);
        }
    }

    /* renamed from: q.a.d0.e.e.j1$b */
    /* compiled from: ObservableGroupJoin */
    interface C11111b {
        /* renamed from: a */
        void mo36881a(Throwable th);

        /* renamed from: a */
        void mo36883a(C11113d dVar);

        /* renamed from: a */
        void mo36885a(boolean z, Object obj);

        /* renamed from: a */
        void mo36886a(boolean z, C11112c cVar);

        /* renamed from: b */
        void mo36888b(Throwable th);
    }

    /* renamed from: q.a.d0.e.e.j1$c */
    /* compiled from: ObservableGroupJoin */
    static final class C11112c extends AtomicReference<C10842c> implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11111b f29592f;

        /* renamed from: g */
        final boolean f29593g;

        /* renamed from: h */
        final int f29594h;

        C11112c(C11111b bVar, boolean z, int i) {
            this.f29592f = bVar;
            this.f29593g = z;
            this.f29594h = i;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            this.f29592f.mo36886a(this.f29593g, this);
        }

        public void onError(Throwable th) {
            this.f29592f.mo36881a(th);
        }

        public void onNext(Object obj) {
            if (C10867d.m36773a((AtomicReference<C10842c>) this)) {
                this.f29592f.mo36886a(this.f29593g, this);
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.j1$d */
    /* compiled from: ObservableGroupJoin */
    static final class C11113d extends AtomicReference<C10842c> implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11111b f29595f;

        /* renamed from: g */
        final boolean f29596g;

        C11113d(C11111b bVar, boolean z) {
            this.f29595f = bVar;
            this.f29596g = z;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            this.f29595f.mo36883a(this);
        }

        public void onError(Throwable th) {
            this.f29595f.mo36888b(th);
        }

        public void onNext(Object obj) {
            this.f29595f.mo36885a(this.f29596g, obj);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    public C11109j1(C11488s<TLeft> sVar, C11488s<? extends TRight> sVar2, C10861o<? super TLeft, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super TLeft, ? super C11482n<TRight>, ? extends R> cVar) {
        super(sVar);
        this.f29571g = sVar2;
        this.f29572h = oVar;
        this.f29573i = oVar2;
        this.f29574j = cVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        C11110a aVar = new C11110a(uVar, this.f29572h, this.f29573i, this.f29574j);
        uVar.onSubscribe(aVar);
        C11113d dVar = new C11113d(aVar, true);
        aVar.f29581h.mo36646b(dVar);
        C11113d dVar2 = new C11113d(aVar, false);
        aVar.f29581h.mo36646b(dVar2);
        this.f29150f.subscribe(dVar);
        this.f29571g.subscribe(dVar2);
    }
}
