package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p346e0.C11449b;

/* renamed from: q.a.d0.e.e.i1 */
/* compiled from: ObservableGroupBy */
public final class C11093i1<T, K, V> extends C10980a<T, C11449b<K, V>> {

    /* renamed from: g */
    final C10861o<? super T, ? extends K> f29501g;

    /* renamed from: h */
    final C10861o<? super T, ? extends V> f29502h;

    /* renamed from: i */
    final int f29503i;

    /* renamed from: j */
    final boolean f29504j;

    /* renamed from: q.a.d0.e.e.i1$a */
    /* compiled from: ObservableGroupBy */
    public static final class C11094a<T, K, V> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: n */
        static final Object f29505n = new Object();

        /* renamed from: f */
        final C11490u<? super C11449b<K, V>> f29506f;

        /* renamed from: g */
        final C10861o<? super T, ? extends K> f29507g;

        /* renamed from: h */
        final C10861o<? super T, ? extends V> f29508h;

        /* renamed from: i */
        final int f29509i;

        /* renamed from: j */
        final boolean f29510j;

        /* renamed from: k */
        final Map<Object, C11095b<K, V>> f29511k;

        /* renamed from: l */
        C10842c f29512l;

        /* renamed from: m */
        final AtomicBoolean f29513m = new AtomicBoolean();

        public C11094a(C11490u<? super C11449b<K, V>> uVar, C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, int i, boolean z) {
            this.f29506f = uVar;
            this.f29507g = oVar;
            this.f29508h = oVar2;
            this.f29509i = i;
            this.f29510j = z;
            this.f29511k = new ConcurrentHashMap();
            lazySet(1);
        }

        /* renamed from: a */
        public void mo36864a(K k) {
            if (k == null) {
                k = f29505n;
            }
            this.f29511k.remove(k);
            if (decrementAndGet() == 0) {
                this.f29512l.dispose();
            }
        }

        public void dispose() {
            if (this.f29513m.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f29512l.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f29513m.get();
        }

        public void onComplete() {
            ArrayList<C11095b> arrayList = new ArrayList<>(this.f29511k.values());
            this.f29511k.clear();
            for (C11095b onComplete : arrayList) {
                onComplete.onComplete();
            }
            this.f29506f.onComplete();
        }

        public void onError(Throwable th) {
            ArrayList<C11095b> arrayList = new ArrayList<>(this.f29511k.values());
            this.f29511k.clear();
            for (C11095b onError : arrayList) {
                onError.onError(th);
            }
            this.f29506f.onError(th);
        }

        public void onNext(T t) {
            Object obj;
            try {
                Object apply = this.f29507g.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f29505n;
                }
                C11095b bVar = this.f29511k.get(obj);
                if (bVar == null) {
                    if (!this.f29513m.get()) {
                        bVar = C11095b.m37026a(apply, this.f29509i, this, this.f29510j);
                        this.f29511k.put(obj, bVar);
                        getAndIncrement();
                        this.f29506f.onNext(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object apply2 = this.f29508h.apply(t);
                    C10910b.m36861a(apply2, "The value supplied is null");
                    bVar.onNext(apply2);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29512l.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                this.f29512l.dispose();
                onError(th2);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29512l, cVar)) {
                this.f29512l = cVar;
                this.f29506f.onSubscribe(this);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.i1$b */
    /* compiled from: ObservableGroupBy */
    static final class C11095b<K, T> extends C11449b<K, T> {

        /* renamed from: g */
        final C11096c<T, K> f29514g;

        protected C11095b(K k, C11096c<T, K> cVar) {
            super(k);
            this.f29514g = cVar;
        }

        /* renamed from: a */
        public static <T, K> C11095b<K, T> m37026a(K k, int i, C11094a<?, K, T> aVar, boolean z) {
            return new C11095b<>(k, new C11096c(i, aVar, k, z));
        }

        public void onComplete() {
            this.f29514g.mo36872b();
        }

        public void onError(Throwable th) {
            this.f29514g.mo36870a(th);
        }

        public void onNext(T t) {
            this.f29514g.mo36869a(t);
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(C11490u<? super T> uVar) {
            this.f29514g.subscribe(uVar);
        }
    }

    public C11093i1(C11488s<T> sVar, C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, int i, boolean z) {
        super(sVar);
        this.f29501g = oVar;
        this.f29502h = oVar2;
        this.f29503i = i;
        this.f29504j = z;
    }

    public void subscribeActual(C11490u<? super C11449b<K, V>> uVar) {
        this.f29150f.subscribe(new C11094a(uVar, this.f29501g, this.f29502h, this.f29503i, this.f29504j));
    }

    /* renamed from: q.a.d0.e.e.i1$c */
    /* compiled from: ObservableGroupBy */
    static final class C11096c<T, K> extends AtomicInteger implements C10842c, C11488s<T> {

        /* renamed from: f */
        final K f29515f;

        /* renamed from: g */
        final C11385c<T> f29516g;

        /* renamed from: h */
        final C11094a<?, K, T> f29517h;

        /* renamed from: i */
        final boolean f29518i;

        /* renamed from: j */
        volatile boolean f29519j;

        /* renamed from: k */
        Throwable f29520k;

        /* renamed from: l */
        final AtomicBoolean f29521l = new AtomicBoolean();

        /* renamed from: m */
        final AtomicBoolean f29522m = new AtomicBoolean();

        /* renamed from: n */
        final AtomicReference<C11490u<? super T>> f29523n = new AtomicReference<>();

        C11096c(int i, C11094a<?, K, T> aVar, K k, boolean z) {
            this.f29516g = new C11385c<>(i);
            this.f29517h = aVar;
            this.f29515f = k;
            this.f29518i = z;
        }

        /* renamed from: a */
        public void mo36869a(T t) {
            this.f29516g.offer(t);
            mo36868a();
        }

        /* renamed from: b */
        public void mo36872b() {
            this.f29519j = true;
            mo36868a();
        }

        public void dispose() {
            if (this.f29521l.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f29523n.lazySet((Object) null);
                this.f29517h.mo36864a(this.f29515f);
            }
        }

        public boolean isDisposed() {
            return this.f29521l.get();
        }

        public void subscribe(C11490u<? super T> uVar) {
            if (this.f29522m.compareAndSet(false, true)) {
                uVar.onSubscribe(this);
                this.f29523n.lazySet(uVar);
                if (this.f29521l.get()) {
                    this.f29523n.lazySet((Object) null);
                } else {
                    mo36868a();
                }
            } else {
                C10868e.m36781a((Throwable) new IllegalStateException("Only one Observer allowed!"), (C11490u<?>) uVar);
            }
        }

        /* renamed from: a */
        public void mo36870a(Throwable th) {
            this.f29520k = th;
            this.f29519j = true;
            mo36868a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36868a() {
            if (getAndIncrement() == 0) {
                C11385c<T> cVar = this.f29516g;
                boolean z = this.f29518i;
                C11490u uVar = this.f29523n.get();
                int i = 1;
                while (true) {
                    if (uVar != null) {
                        while (true) {
                            boolean z2 = this.f29519j;
                            T poll = cVar.poll();
                            boolean z3 = poll == null;
                            if (!mo36871a(z2, z3, uVar, z)) {
                                if (z3) {
                                    break;
                                }
                                uVar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (uVar == null) {
                            uVar = this.f29523n.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36871a(boolean z, boolean z2, C11490u<? super T> uVar, boolean z3) {
            if (this.f29521l.get()) {
                this.f29516g.clear();
                this.f29517h.mo36864a(this.f29515f);
                this.f29523n.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.f29520k;
                    if (th != null) {
                        this.f29516g.clear();
                        this.f29523n.lazySet((Object) null);
                        uVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f29523n.lazySet((Object) null);
                        uVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f29520k;
                    this.f29523n.lazySet((Object) null);
                    if (th2 != null) {
                        uVar.onError(th2);
                    } else {
                        uVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }
}
