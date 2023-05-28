package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p333d.C10934p;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p329d0.p345j.C11439m;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.h4 */
/* compiled from: ObservableWindowBoundarySelector */
public final class C11084h4<T, B, V> extends C10980a<T, C11482n<T>> {

    /* renamed from: g */
    final C11488s<B> f29476g;

    /* renamed from: h */
    final C10861o<? super B, ? extends C11488s<V>> f29477h;

    /* renamed from: i */
    final int f29478i;

    /* renamed from: q.a.d0.e.e.h4$a */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C11085a<T, V> extends C11453c<V> {

        /* renamed from: g */
        final C11087c<T, ?, V> f29479g;

        /* renamed from: h */
        final C11476d<T> f29480h;

        /* renamed from: i */
        boolean f29481i;

        C11085a(C11087c<T, ?, V> cVar, C11476d<T> dVar) {
            this.f29479g = cVar;
            this.f29480h = dVar;
        }

        public void onComplete() {
            if (!this.f29481i) {
                this.f29481i = true;
                this.f29479g.mo36861a(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f29481i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29481i = true;
            this.f29479g.mo36860a(th);
        }

        public void onNext(V v) {
            dispose();
            onComplete();
        }
    }

    /* renamed from: q.a.d0.e.e.h4$b */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C11086b<T, B> extends C11453c<B> {

        /* renamed from: g */
        final C11087c<T, B, ?> f29482g;

        C11086b(C11087c<T, B, ?> cVar) {
            this.f29482g = cVar;
        }

        public void onComplete() {
            this.f29482g.onComplete();
        }

        public void onError(Throwable th) {
            this.f29482g.mo36860a(th);
        }

        public void onNext(B b) {
            this.f29482g.mo36859a(b);
        }
    }

    /* renamed from: q.a.d0.e.e.h4$d */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C11088d<T, B> {

        /* renamed from: a */
        final C11476d<T> f29492a;

        /* renamed from: b */
        final B f29493b;

        C11088d(C11476d<T> dVar, B b) {
            this.f29492a = dVar;
            this.f29493b = b;
        }
    }

    public C11084h4(C11488s<T> sVar, C11488s<B> sVar2, C10861o<? super B, ? extends C11488s<V>> oVar, int i) {
        super(sVar);
        this.f29476g = sVar2;
        this.f29477h = oVar;
        this.f29478i = i;
    }

    public void subscribeActual(C11490u<? super C11482n<T>> uVar) {
        this.f29150f.subscribe(new C11087c(new C11455e(uVar), this.f29476g, this.f29477h, this.f29478i));
    }

    /* renamed from: q.a.d0.e.e.h4$c */
    /* compiled from: ObservableWindowBoundarySelector */
    static final class C11087c<T, B, V> extends C10934p<T, Object, C11482n<T>> implements C10842c {

        /* renamed from: l */
        final C11488s<B> f29483l;

        /* renamed from: m */
        final C10861o<? super B, ? extends C11488s<V>> f29484m;

        /* renamed from: n */
        final int f29485n;

        /* renamed from: o */
        final C10841b f29486o;

        /* renamed from: p */
        C10842c f29487p;

        /* renamed from: q */
        final AtomicReference<C10842c> f29488q = new AtomicReference<>();

        /* renamed from: r */
        final List<C11476d<T>> f29489r;

        /* renamed from: s */
        final AtomicLong f29490s = new AtomicLong();

        /* renamed from: t */
        final AtomicBoolean f29491t = new AtomicBoolean();

        C11087c(C11490u<? super C11482n<T>> uVar, C11488s<B> sVar, C10861o<? super B, ? extends C11488s<V>> oVar, int i) {
            super(uVar, new C11382a());
            this.f29483l = sVar;
            this.f29484m = oVar;
            this.f29485n = i;
            this.f29486o = new C10841b();
            this.f29489r = new ArrayList();
            this.f29490s.lazySet(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36860a(Throwable th) {
            this.f29487p.dispose();
            this.f29486o.dispose();
            onError(th);
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super C11482n<T>> uVar, Object obj) {
        }

        public void dispose() {
            if (this.f29491t.compareAndSet(false, true)) {
                C10867d.m36773a(this.f29488q);
                if (this.f29490s.decrementAndGet() == 0) {
                    this.f29487p.dispose();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36862f() {
            this.f29486o.dispose();
            C10867d.m36773a(this.f29488q);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36863g() {
            C11382a aVar = (C11382a) this.f29010h;
            C11490u<? super V> uVar = this.f29009g;
            List<C11476d<T>> list = this.f29489r;
            int i = 1;
            while (true) {
                boolean z = this.f29012j;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    mo36862f();
                    Throwable th = this.f29013k;
                    if (th != null) {
                        for (C11476d<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C11476d<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z2) {
                    i = mo36729a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C11088d) {
                    C11088d dVar = (C11088d) poll;
                    C11476d<T> dVar2 = dVar.f29492a;
                    if (dVar2 != null) {
                        if (list.remove(dVar2)) {
                            dVar.f29492a.onComplete();
                            if (this.f29490s.decrementAndGet() == 0) {
                                mo36862f();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f29491t.get()) {
                        C11476d a = C11476d.m37562a(this.f29485n);
                        list.add(a);
                        uVar.onNext(a);
                        try {
                            Object apply = this.f29484m.apply(dVar.f29493b);
                            C10910b.m36861a(apply, "The ObservableSource supplied is null");
                            C11488s sVar = (C11488s) apply;
                            C11085a aVar2 = new C11085a(this, a);
                            if (this.f29486o.mo36646b(aVar2)) {
                                this.f29490s.getAndIncrement();
                                sVar.subscribe(aVar2);
                            }
                        } catch (Throwable th2) {
                            C9034a.m29708a(th2);
                            this.f29491t.set(true);
                            uVar.onError(th2);
                        }
                    }
                } else {
                    for (C11476d<T> onNext : list) {
                        C11439m.m37479b(poll);
                        onNext.onNext(poll);
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.f29491t.get();
        }

        public void onComplete() {
            if (!this.f29012j) {
                this.f29012j = true;
                if (mo36736d()) {
                    mo36863g();
                }
                if (this.f29490s.decrementAndGet() == 0) {
                    this.f29486o.dispose();
                }
                this.f29009g.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29012j) {
                C11459a.m37531b(th);
                return;
            }
            this.f29013k = th;
            this.f29012j = true;
            if (mo36736d()) {
                mo36863g();
            }
            if (this.f29490s.decrementAndGet() == 0) {
                this.f29486o.dispose();
            }
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            if (mo36737e()) {
                for (C11476d<T> onNext : this.f29489r) {
                    onNext.onNext(t);
                }
                if (mo36729a(-1) == 0) {
                    return;
                }
            } else {
                C10917f<U> fVar = this.f29010h;
                C11439m.m37483e(t);
                fVar.offer(t);
                if (!mo36736d()) {
                    return;
                }
            }
            mo36863g();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29487p, cVar)) {
                this.f29487p = cVar;
                this.f29009g.onSubscribe(this);
                if (!this.f29491t.get()) {
                    C11086b bVar = new C11086b(this);
                    if (this.f29488q.compareAndSet((Object) null, bVar)) {
                        this.f29483l.subscribe(bVar);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36859a(B b) {
            this.f29010h.offer(new C11088d((C11476d) null, b));
            if (mo36736d()) {
                mo36863g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36861a(C11085a<T, V> aVar) {
            this.f29486o.mo36647c(aVar);
            this.f29010h.offer(new C11088d(aVar.f29480h, null));
            if (mo36736d()) {
                mo36863g();
            }
        }
    }
}
