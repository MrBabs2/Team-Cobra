package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11439m;
import p120q.p326a.p346e0.C11448a;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p349h0.C11470b;

/* renamed from: q.a.d0.e.e.s2 */
/* compiled from: ObservableReplay */
public final class C11248s2<T> extends C11448a<T> implements Object<T> {

    /* renamed from: j */
    static final C11250b f30073j = new C11263o();

    /* renamed from: f */
    final C11488s<T> f30074f;

    /* renamed from: g */
    final AtomicReference<C11258j<T>> f30075g;

    /* renamed from: h */
    final C11250b<T> f30076h;

    /* renamed from: i */
    final C11488s<T> f30077i;

    /* renamed from: q.a.d0.e.e.s2$a */
    /* compiled from: ObservableReplay */
    static abstract class C11249a<T> extends AtomicReference<C11254f> implements C11256h<T> {

        /* renamed from: f */
        C11254f f30078f;

        /* renamed from: g */
        int f30079g;

        C11249a() {
            C11254f fVar = new C11254f((Object) null);
            this.f30078f = fVar;
            set(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo36984a(C11254f fVar) {
            this.f30078f.set(fVar);
            this.f30078f = fVar;
            this.f30079g++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object mo36985b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo36987b(C11254f fVar) {
            set(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Object mo36988c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo36989c() {
            this.f30079g--;
            mo36987b((C11254f) ((C11254f) get()).get());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo36990d() {
            C11254f fVar = (C11254f) get();
            if (fVar.f30087f != null) {
                C11254f fVar2 = new C11254f((Object) null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo36991e();

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36992f() {
            mo36990d();
        }

        /* renamed from: b */
        public final void mo36986b() {
            mo36984a(new C11254f(mo36985b(C11439m.m37474a())));
            mo36992f();
        }

        /* renamed from: a */
        public final void mo36981a(T t) {
            C11439m.m37483e(t);
            mo36984a(new C11254f(mo36985b((Object) t)));
            mo36991e();
        }

        /* renamed from: a */
        public final void mo36982a(Throwable th) {
            mo36984a(new C11254f(mo36985b(C11439m.m37475a(th))));
            mo36992f();
        }

        /* renamed from: a */
        public final void mo36983a(C11252d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C11254f fVar = (C11254f) dVar.mo36995a();
                    if (fVar == null) {
                        fVar = mo36980a();
                        dVar.f30083h = fVar;
                    }
                    while (!dVar.isDisposed()) {
                        C11254f fVar2 = (C11254f) fVar.get();
                        if (fVar2 == null) {
                            dVar.f30083h = fVar;
                            i = dVar.addAndGet(-i);
                        } else if (C11439m.m37478a(mo36988c(fVar2.f30087f), dVar.f30082g)) {
                            dVar.f30083h = null;
                            return;
                        } else {
                            fVar = fVar2;
                        }
                    }
                    dVar.f30083h = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11254f mo36980a() {
            return (C11254f) get();
        }
    }

    /* renamed from: q.a.d0.e.e.s2$b */
    /* compiled from: ObservableReplay */
    interface C11250b<T> {
        C11256h<T> call();
    }

    /* renamed from: q.a.d0.e.e.s2$c */
    /* compiled from: ObservableReplay */
    static final class C11251c<R> implements C10853g<C10842c> {

        /* renamed from: f */
        private final C11207o4<R> f30080f;

        C11251c(C11207o4<R> o4Var) {
            this.f30080f = o4Var;
        }

        /* renamed from: a */
        public void mo8098a(C10842c cVar) {
            this.f30080f.mo36952a(cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.s2$d */
    /* compiled from: ObservableReplay */
    static final class C11252d<T> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11258j<T> f30081f;

        /* renamed from: g */
        final C11490u<? super T> f30082g;

        /* renamed from: h */
        Object f30083h;

        /* renamed from: i */
        volatile boolean f30084i;

        C11252d(C11258j<T> jVar, C11490u<? super T> uVar) {
            this.f30081f = jVar;
            this.f30082g = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <U> U mo36995a() {
            return this.f30083h;
        }

        public void dispose() {
            if (!this.f30084i) {
                this.f30084i = true;
                this.f30081f.mo36999b(this);
                this.f30083h = null;
            }
        }

        public boolean isDisposed() {
            return this.f30084i;
        }
    }

    /* renamed from: q.a.d0.e.e.s2$e */
    /* compiled from: ObservableReplay */
    static final class C11253e<R, U> extends C11482n<R> {

        /* renamed from: f */
        private final Callable<? extends C11448a<U>> f30085f;

        /* renamed from: g */
        private final C10861o<? super C11482n<U>, ? extends C11488s<R>> f30086g;

        C11253e(Callable<? extends C11448a<U>> callable, C10861o<? super C11482n<U>, ? extends C11488s<R>> oVar) {
            this.f30085f = callable;
            this.f30086g = oVar;
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(C11490u<? super R> uVar) {
            try {
                Object call = this.f30085f.call();
                C10910b.m36861a(call, "The connectableFactory returned a null ConnectableObservable");
                C11448a aVar = (C11448a) call;
                Object apply = this.f30086g.apply(aVar);
                C10910b.m36861a(apply, "The selector returned a null ObservableSource");
                C11488s sVar = (C11488s) apply;
                C11207o4 o4Var = new C11207o4(uVar);
                sVar.subscribe(o4Var);
                aVar.mo36838a(new C11251c(o4Var));
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10868e.m36781a(th, (C11490u<?>) uVar);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.s2$f */
    /* compiled from: ObservableReplay */
    static final class C11254f extends AtomicReference<C11254f> {

        /* renamed from: f */
        final Object f30087f;

        C11254f(Object obj) {
            this.f30087f = obj;
        }
    }

    /* renamed from: q.a.d0.e.e.s2$g */
    /* compiled from: ObservableReplay */
    static final class C11255g<T> extends C11448a<T> {

        /* renamed from: f */
        private final C11448a<T> f30088f;

        /* renamed from: g */
        private final C11482n<T> f30089g;

        C11255g(C11448a<T> aVar, C11482n<T> nVar) {
            this.f30088f = aVar;
            this.f30089g = nVar;
        }

        /* renamed from: a */
        public void mo36838a(C10853g<? super C10842c> gVar) {
            this.f30088f.mo36838a(gVar);
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(C11490u<? super T> uVar) {
            this.f30089g.subscribe(uVar);
        }
    }

    /* renamed from: q.a.d0.e.e.s2$h */
    /* compiled from: ObservableReplay */
    interface C11256h<T> {
        /* renamed from: a */
        void mo36981a(T t);

        /* renamed from: a */
        void mo36982a(Throwable th);

        /* renamed from: a */
        void mo36983a(C11252d<T> dVar);

        /* renamed from: b */
        void mo36986b();
    }

    /* renamed from: q.a.d0.e.e.s2$i */
    /* compiled from: ObservableReplay */
    static final class C11257i<T> implements C11250b<T> {

        /* renamed from: a */
        private final int f30090a;

        C11257i(int i) {
            this.f30090a = i;
        }

        public C11256h<T> call() {
            return new C11262n(this.f30090a);
        }
    }

    /* renamed from: q.a.d0.e.e.s2$k */
    /* compiled from: ObservableReplay */
    static final class C11259k<T> implements C11488s<T> {

        /* renamed from: f */
        private final AtomicReference<C11258j<T>> f30097f;

        /* renamed from: g */
        private final C11250b<T> f30098g;

        C11259k(AtomicReference<C11258j<T>> atomicReference, C11250b<T> bVar) {
            this.f30097f = atomicReference;
            this.f30098g = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void subscribe(p120q.p326a.C11490u<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.s2$j<T>> r0 = r3.f30097f
                java.lang.Object r0 = r0.get()
                q.a.d0.e.e.s2$j r0 = (p120q.p326a.p329d0.p334e.p339e.C11248s2.C11258j) r0
                if (r0 != 0) goto L_0x0020
                q.a.d0.e.e.s2$b<T> r0 = r3.f30098g
                q.a.d0.e.e.s2$h r0 = r0.call()
                q.a.d0.e.e.s2$j r1 = new q.a.d0.e.e.s2$j
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.s2$j<T>> r0 = r3.f30097f
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                q.a.d0.e.e.s2$d r1 = new q.a.d0.e.e.s2$d
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.mo36997a(r1)
                boolean r4 = r1.isDisposed()
                if (r4 == 0) goto L_0x0035
                r0.mo36999b(r1)
                return
            L_0x0035:
                q.a.d0.e.e.s2$h<T> r4 = r0.f30093f
                r4.mo36983a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11248s2.C11259k.subscribe(q.a.u):void");
        }
    }

    /* renamed from: q.a.d0.e.e.s2$l */
    /* compiled from: ObservableReplay */
    static final class C11260l<T> implements C11250b<T> {

        /* renamed from: a */
        private final int f30099a;

        /* renamed from: b */
        private final long f30100b;

        /* renamed from: c */
        private final TimeUnit f30101c;

        /* renamed from: d */
        private final C11491v f30102d;

        C11260l(int i, long j, TimeUnit timeUnit, C11491v vVar) {
            this.f30099a = i;
            this.f30100b = j;
            this.f30101c = timeUnit;
            this.f30102d = vVar;
        }

        public C11256h<T> call() {
            return new C11261m(this.f30099a, this.f30100b, this.f30101c, this.f30102d);
        }
    }

    /* renamed from: q.a.d0.e.e.s2$m */
    /* compiled from: ObservableReplay */
    static final class C11261m<T> extends C11249a<T> {

        /* renamed from: h */
        final C11491v f30103h;

        /* renamed from: i */
        final long f30104i;

        /* renamed from: j */
        final TimeUnit f30105j;

        /* renamed from: k */
        final int f30106k;

        C11261m(int i, long j, TimeUnit timeUnit, C11491v vVar) {
            this.f30103h = vVar;
            this.f30106k = i;
            this.f30104i = j;
            this.f30105j = timeUnit;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11254f mo36980a() {
            C11254f fVar;
            long a = this.f30103h.mo37600a(this.f30105j) - this.f30104i;
            C11254f fVar2 = (C11254f) get();
            Object obj = fVar2.get();
            while (true) {
                C11254f fVar3 = (C11254f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 != null) {
                    C11470b bVar = (C11470b) fVar2.f30087f;
                    if (C11439m.m37481c(bVar.mo37227b()) || C11439m.m37482d(bVar.mo37227b()) || bVar.mo37226a() > a) {
                        break;
                    }
                    obj = fVar2.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object mo36985b(Object obj) {
            return new C11470b(obj, this.f30103h.mo37600a(this.f30105j), this.f30105j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Object mo36988c(Object obj) {
            return ((C11470b) obj).mo37227b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo36991e() {
            C11254f fVar;
            long a = this.f30103h.mo37600a(this.f30105j) - this.f30104i;
            C11254f fVar2 = (C11254f) get();
            C11254f fVar3 = (C11254f) fVar2.get();
            int i = 0;
            while (true) {
                C11254f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i2 = this.f30079g;
                if (i2 <= this.f30106k || i2 <= 1) {
                    if (((C11470b) fVar2.f30087f).mo37226a() > a) {
                        break;
                    }
                    i++;
                    this.f30079g--;
                    fVar3 = (C11254f) fVar2.get();
                } else {
                    i++;
                    this.f30079g = i2 - 1;
                    fVar3 = (C11254f) fVar2.get();
                }
            }
            if (i != 0) {
                mo36987b(fVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36992f() {
            /*
                r10 = this;
                q.a.v r0 = r10.f30103h
                java.util.concurrent.TimeUnit r1 = r10.f30105j
                long r0 = r0.mo37600a((java.util.concurrent.TimeUnit) r1)
                long r2 = r10.f30104i
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                q.a.d0.e.e.s2$f r2 = (p120q.p326a.p329d0.p334e.p339e.C11248s2.C11254f) r2
                java.lang.Object r3 = r2.get()
                q.a.d0.e.e.s2$f r3 = (p120q.p326a.p329d0.p334e.p339e.C11248s2.C11254f) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003c
                int r5 = r10.f30079g
                r6 = 1
                if (r5 <= r6) goto L_0x003c
                java.lang.Object r5 = r2.f30087f
                q.a.h0.b r5 = (p120q.p326a.p349h0.C11470b) r5
                long r7 = r5.mo37226a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                int r4 = r4 + 1
                int r3 = r10.f30079g
                int r3 = r3 - r6
                r10.f30079g = r3
                java.lang.Object r3 = r2.get()
                q.a.d0.e.e.s2$f r3 = (p120q.p326a.p329d0.p334e.p339e.C11248s2.C11254f) r3
                goto L_0x0018
            L_0x003c:
                if (r4 == 0) goto L_0x0041
                r10.mo36987b((p120q.p326a.p329d0.p334e.p339e.C11248s2.C11254f) r3)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11248s2.C11261m.mo36992f():void");
        }
    }

    /* renamed from: q.a.d0.e.e.s2$n */
    /* compiled from: ObservableReplay */
    static final class C11262n<T> extends C11249a<T> {

        /* renamed from: h */
        final int f30107h;

        C11262n(int i) {
            this.f30107h = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo36991e() {
            if (this.f30079g > this.f30107h) {
                mo36989c();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.s2$o */
    /* compiled from: ObservableReplay */
    static final class C11263o implements C11250b<Object> {
        C11263o() {
        }

        public C11256h<Object> call() {
            return new C11264p(16);
        }
    }

    private C11248s2(C11488s<T> sVar, C11488s<T> sVar2, AtomicReference<C11258j<T>> atomicReference, C11250b<T> bVar) {
        this.f30077i = sVar;
        this.f30074f = sVar2;
        this.f30075g = atomicReference;
        this.f30076h = bVar;
    }

    /* renamed from: a */
    public static <U, R> C11482n<R> m37185a(Callable<? extends C11448a<U>> callable, C10861o<? super C11482n<U>, ? extends C11488s<R>> oVar) {
        return C11459a.m37519a(new C11253e(callable, oVar));
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f30077i.subscribe(uVar);
    }

    /* renamed from: q.a.d0.e.e.s2$p */
    /* compiled from: ObservableReplay */
    static final class C11264p<T> extends ArrayList<Object> implements C11256h<T> {

        /* renamed from: f */
        volatile int f30108f;

        C11264p(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo36981a(T t) {
            C11439m.m37483e(t);
            add(t);
            this.f30108f++;
        }

        /* renamed from: b */
        public void mo36986b() {
            add(C11439m.m37474a());
            this.f30108f++;
        }

        /* renamed from: a */
        public void mo36982a(Throwable th) {
            add(C11439m.m37475a(th));
            this.f30108f++;
        }

        /* renamed from: a */
        public void mo36983a(C11252d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                C11490u<? super T> uVar = dVar.f30082g;
                int i = 1;
                while (!dVar.isDisposed()) {
                    int i2 = this.f30108f;
                    Integer num = (Integer) dVar.mo36995a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!C11439m.m37478a(get(intValue), uVar) && !dVar.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    dVar.f30083h = Integer.valueOf(intValue);
                    i = dVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37179a(C11448a<T> aVar, C11491v vVar) {
        return C11459a.m37515a(new C11255g(aVar, aVar.observeOn(vVar)));
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37180a(C11488s<? extends T> sVar) {
        return m37184a(sVar, f30073j);
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37181a(C11488s<T> sVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return m37180a(sVar);
        }
        return m37184a(sVar, new C11257i(i));
    }

    /* renamed from: q.a.d0.e.e.s2$j */
    /* compiled from: ObservableReplay */
    static final class C11258j<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c {

        /* renamed from: j */
        static final C11252d[] f30091j = new C11252d[0];

        /* renamed from: k */
        static final C11252d[] f30092k = new C11252d[0];

        /* renamed from: f */
        final C11256h<T> f30093f;

        /* renamed from: g */
        boolean f30094g;

        /* renamed from: h */
        final AtomicReference<C11252d[]> f30095h = new AtomicReference<>(f30091j);

        /* renamed from: i */
        final AtomicBoolean f30096i = new AtomicBoolean();

        C11258j(C11256h<T> hVar) {
            this.f30093f = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36997a(C11252d<T> dVar) {
            C11252d[] dVarArr;
            C11252d[] dVarArr2;
            do {
                dVarArr = this.f30095h.get();
                if (dVarArr == f30092k) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new C11252d[(length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.f30095h.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36999b(C11252d<T> dVar) {
            C11252d[] dVarArr;
            C11252d[] dVarArr2;
            do {
                dVarArr = this.f30095h.get();
                int length = dVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (dVarArr[i2].equals(dVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            dVarArr2 = f30091j;
                        } else {
                            C11252d[] dVarArr3 = new C11252d[(length - 1)];
                            System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                            System.arraycopy(dVarArr, i + 1, dVarArr3, i, (length - i) - 1);
                            dVarArr2 = dVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f30095h.compareAndSet(dVarArr, dVarArr2));
        }

        public void dispose() {
            this.f30095h.set(f30092k);
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return this.f30095h.get() == f30092k;
        }

        public void onComplete() {
            if (!this.f30094g) {
                this.f30094g = true;
                this.f30093f.mo36986b();
                mo36998b();
            }
        }

        public void onError(Throwable th) {
            if (!this.f30094g) {
                this.f30094g = true;
                this.f30093f.mo36982a(th);
                mo36998b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (!this.f30094g) {
                this.f30093f.mo36981a(t);
                mo36996a();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar)) {
                mo36996a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36996a() {
            for (C11252d a : this.f30095h.get()) {
                this.f30093f.mo36983a(a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36998b() {
            for (C11252d a : this.f30095h.getAndSet(f30092k)) {
                this.f30093f.mo36983a(a);
            }
        }
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37182a(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar) {
        return m37183a(sVar, j, timeUnit, vVar, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37183a(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar, int i) {
        return m37184a(sVar, new C11260l(i, j, timeUnit, vVar));
    }

    /* renamed from: a */
    static <T> C11448a<T> m37184a(C11488s<T> sVar, C11250b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C11459a.m37515a(new C11248s2(new C11259k(atomicReference, bVar), sVar, atomicReference, bVar));
    }

    /* renamed from: a */
    public void mo36979a(C10842c cVar) {
        this.f30075g.compareAndSet((C11258j) cVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36838a(p120q.p326a.p328c0.C10853g<? super p120q.p326a.p327b0.C10842c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.s2$j<T>> r0 = r4.f30075g
            java.lang.Object r0 = r0.get()
            q.a.d0.e.e.s2$j r0 = (p120q.p326a.p329d0.p334e.p339e.C11248s2.C11258j) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            q.a.d0.e.e.s2$b<T> r1 = r4.f30076h
            q.a.d0.e.e.s2$h r1 = r1.call()
            q.a.d0.e.e.s2$j r2 = new q.a.d0.e.e.s2$j
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.s2$j<T>> r1 = r4.f30075g
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30096i
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30096i
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r5.mo8098a(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            q.a.s<T> r5 = r4.f30074f
            r5.subscribe(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f30096i
            r0.compareAndSet(r2, r3)
        L_0x004d:
            p036io.reactivex.exceptions.C9034a.m29708a(r5)
            java.lang.RuntimeException r5 = p120q.p326a.p329d0.p345j.C11435j.m37463a((java.lang.Throwable) r5)
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11248s2.mo36838a(q.a.c0.g):void");
    }
}
