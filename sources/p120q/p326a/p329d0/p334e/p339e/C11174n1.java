package p120q.p326a.p329d0.p334e.p339e;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p120q.p326a.C11458g;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10848b;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p346e0.C11448a;

/* renamed from: q.a.d0.e.e.n1 */
/* compiled from: ObservableInternalHelper */
public final class C11174n1 {

    /* renamed from: q.a.d0.e.e.n1$a */
    /* compiled from: ObservableInternalHelper */
    static final class C11175a<T> implements Callable<C11448a<T>> {

        /* renamed from: f */
        private final C11482n<T> f29803f;

        /* renamed from: g */
        private final int f29804g;

        C11175a(C11482n<T> nVar, int i) {
            this.f29803f = nVar;
            this.f29804g = i;
        }

        public C11448a<T> call() {
            return this.f29803f.replay(this.f29804g);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$b */
    /* compiled from: ObservableInternalHelper */
    static final class C11176b<T> implements Callable<C11448a<T>> {

        /* renamed from: f */
        private final C11482n<T> f29805f;

        /* renamed from: g */
        private final int f29806g;

        /* renamed from: h */
        private final long f29807h;

        /* renamed from: i */
        private final TimeUnit f29808i;

        /* renamed from: j */
        private final C11491v f29809j;

        C11176b(C11482n<T> nVar, int i, long j, TimeUnit timeUnit, C11491v vVar) {
            this.f29805f = nVar;
            this.f29806g = i;
            this.f29807h = j;
            this.f29808i = timeUnit;
            this.f29809j = vVar;
        }

        public C11448a<T> call() {
            return this.f29805f.replay(this.f29806g, this.f29807h, this.f29808i, this.f29809j);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$c */
    /* compiled from: ObservableInternalHelper */
    static final class C11177c<T, U> implements C10861o<T, C11488s<U>> {

        /* renamed from: f */
        private final C10861o<? super T, ? extends Iterable<? extends U>> f29810f;

        C11177c(C10861o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f29810f = oVar;
        }

        public C11488s<U> apply(T t) throws Exception {
            Object apply = this.f29810f.apply(t);
            C10910b.m36861a(apply, "The mapper returned a null Iterable");
            return new C11034e1((Iterable) apply);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$d */
    /* compiled from: ObservableInternalHelper */
    static final class C11178d<U, R, T> implements C10861o<U, R> {

        /* renamed from: f */
        private final C10849c<? super T, ? super U, ? extends R> f29811f;

        /* renamed from: g */
        private final T f29812g;

        C11178d(C10849c<? super T, ? super U, ? extends R> cVar, T t) {
            this.f29811f = cVar;
            this.f29812g = t;
        }

        public R apply(U u) throws Exception {
            return this.f29811f.mo7653a(this.f29812g, u);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$e */
    /* compiled from: ObservableInternalHelper */
    static final class C11179e<T, R, U> implements C10861o<T, C11488s<R>> {

        /* renamed from: f */
        private final C10849c<? super T, ? super U, ? extends R> f29813f;

        /* renamed from: g */
        private final C10861o<? super T, ? extends C11488s<? extends U>> f29814g;

        C11179e(C10849c<? super T, ? super U, ? extends R> cVar, C10861o<? super T, ? extends C11488s<? extends U>> oVar) {
            this.f29813f = cVar;
            this.f29814g = oVar;
        }

        public C11488s<R> apply(T t) throws Exception {
            Object apply = this.f29814g.apply(t);
            C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
            return new C11295v1((C11488s) apply, new C11178d(this.f29813f, t));
        }
    }

    /* renamed from: q.a.d0.e.e.n1$f */
    /* compiled from: ObservableInternalHelper */
    static final class C11180f<T, U> implements C10861o<T, C11488s<T>> {

        /* renamed from: f */
        final C10861o<? super T, ? extends C11488s<U>> f29815f;

        C11180f(C10861o<? super T, ? extends C11488s<U>> oVar) {
            this.f29815f = oVar;
        }

        public C11488s<T> apply(T t) throws Exception {
            Object apply = this.f29815f.apply(t);
            C10910b.m36861a(apply, "The itemDelay returned a null ObservableSource");
            return new C11205o3((C11488s) apply, 1).map(C10872a.m36820c(t)).defaultIfEmpty(t);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$g */
    /* compiled from: ObservableInternalHelper */
    static final class C11181g<T> implements C10847a {

        /* renamed from: f */
        final C11490u<T> f29816f;

        C11181g(C11490u<T> uVar) {
            this.f29816f = uVar;
        }

        public void run() throws Exception {
            this.f29816f.onComplete();
        }
    }

    /* renamed from: q.a.d0.e.e.n1$h */
    /* compiled from: ObservableInternalHelper */
    static final class C11182h<T> implements C10853g<Throwable> {

        /* renamed from: f */
        final C11490u<T> f29817f;

        C11182h(C11490u<T> uVar) {
            this.f29817f = uVar;
        }

        /* renamed from: a */
        public void mo8098a(Throwable th) throws Exception {
            this.f29817f.onError(th);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$i */
    /* compiled from: ObservableInternalHelper */
    static final class C11183i<T> implements C10853g<T> {

        /* renamed from: f */
        final C11490u<T> f29818f;

        C11183i(C11490u<T> uVar) {
            this.f29818f = uVar;
        }

        /* renamed from: a */
        public void mo8098a(T t) throws Exception {
            this.f29818f.onNext(t);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$j */
    /* compiled from: ObservableInternalHelper */
    static final class C11184j<T> implements Callable<C11448a<T>> {

        /* renamed from: f */
        private final C11482n<T> f29819f;

        C11184j(C11482n<T> nVar) {
            this.f29819f = nVar;
        }

        public C11448a<T> call() {
            return this.f29819f.replay();
        }
    }

    /* renamed from: q.a.d0.e.e.n1$k */
    /* compiled from: ObservableInternalHelper */
    static final class C11185k<T, R> implements C10861o<C11482n<T>, C11488s<R>> {

        /* renamed from: f */
        private final C10861o<? super C11482n<T>, ? extends C11488s<R>> f29820f;

        /* renamed from: g */
        private final C11491v f29821g;

        C11185k(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, C11491v vVar) {
            this.f29820f = oVar;
            this.f29821g = vVar;
        }

        /* renamed from: a */
        public C11488s<R> apply(C11482n<T> nVar) throws Exception {
            Object apply = this.f29820f.apply(nVar);
            C10910b.m36861a(apply, "The selector returned a null ObservableSource");
            return C11482n.wrap((C11488s) apply).observeOn(this.f29821g);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$l */
    /* compiled from: ObservableInternalHelper */
    static final class C11186l<T, S> implements C10849c<S, C11458g<T>, S> {

        /* renamed from: a */
        final C10848b<S, C11458g<T>> f29822a;

        C11186l(C10848b<S, C11458g<T>> bVar) {
            this.f29822a = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo7653a(Object obj, Object obj2) throws Exception {
            mo36932a(obj, (C11458g) obj2);
            return obj;
        }

        /* renamed from: a */
        public S mo36932a(S s, C11458g<T> gVar) throws Exception {
            this.f29822a.mo36652a(s, gVar);
            return s;
        }
    }

    /* renamed from: q.a.d0.e.e.n1$m */
    /* compiled from: ObservableInternalHelper */
    static final class C11187m<T, S> implements C10849c<S, C11458g<T>, S> {

        /* renamed from: a */
        final C10853g<C11458g<T>> f29823a;

        C11187m(C10853g<C11458g<T>> gVar) {
            this.f29823a = gVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo7653a(Object obj, Object obj2) throws Exception {
            mo36933a(obj, (C11458g) obj2);
            return obj;
        }

        /* renamed from: a */
        public S mo36933a(S s, C11458g<T> gVar) throws Exception {
            this.f29823a.mo8098a(gVar);
            return s;
        }
    }

    /* renamed from: q.a.d0.e.e.n1$n */
    /* compiled from: ObservableInternalHelper */
    static final class C11188n<T> implements Callable<C11448a<T>> {

        /* renamed from: f */
        private final C11482n<T> f29824f;

        /* renamed from: g */
        private final long f29825g;

        /* renamed from: h */
        private final TimeUnit f29826h;

        /* renamed from: i */
        private final C11491v f29827i;

        C11188n(C11482n<T> nVar, long j, TimeUnit timeUnit, C11491v vVar) {
            this.f29824f = nVar;
            this.f29825g = j;
            this.f29826h = timeUnit;
            this.f29827i = vVar;
        }

        public C11448a<T> call() {
            return this.f29824f.replay(this.f29825g, this.f29826h, this.f29827i);
        }
    }

    /* renamed from: q.a.d0.e.e.n1$o */
    /* compiled from: ObservableInternalHelper */
    static final class C11189o<T, R> implements C10861o<List<C11488s<? extends T>>, C11488s<? extends R>> {

        /* renamed from: f */
        private final C10861o<? super Object[], ? extends R> f29828f;

        C11189o(C10861o<? super Object[], ? extends R> oVar) {
            this.f29828f = oVar;
        }

        /* renamed from: a */
        public C11488s<? extends R> apply(List<C11488s<? extends T>> list) {
            return C11482n.zipIterable(list, this.f29828f, false, C11482n.bufferSize());
        }
    }

    /* renamed from: a */
    public static <T, S> C10849c<S, C11458g<T>, S> m37107a(C10853g<C11458g<T>> gVar) {
        return new C11187m(gVar);
    }

    /* renamed from: b */
    public static <T, U> C10861o<T, C11488s<T>> m37112b(C10861o<? super T, ? extends C11488s<U>> oVar) {
        return new C11180f(oVar);
    }

    /* renamed from: c */
    public static <T> C10853g<T> m37113c(C11490u<T> uVar) {
        return new C11183i(uVar);
    }

    /* renamed from: a */
    public static <T, S> C10849c<S, C11458g<T>, S> m37106a(C10848b<S, C11458g<T>> bVar) {
        return new C11186l(bVar);
    }

    /* renamed from: b */
    public static <T> C10853g<Throwable> m37111b(C11490u<T> uVar) {
        return new C11182h(uVar);
    }

    /* renamed from: c */
    public static <T, R> C10861o<List<C11488s<? extends T>>, C11488s<? extends R>> m37114c(C10861o<? super Object[], ? extends R> oVar) {
        return new C11189o(oVar);
    }

    /* renamed from: a */
    public static <T> C10847a m37105a(C11490u<T> uVar) {
        return new C11181g(uVar);
    }

    /* renamed from: a */
    public static <T, U, R> C10861o<T, C11488s<R>> m37109a(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar) {
        return new C11179e(cVar, oVar);
    }

    /* renamed from: a */
    public static <T, U> C10861o<T, C11488s<U>> m37108a(C10861o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new C11177c(oVar);
    }

    /* renamed from: a */
    public static <T> Callable<C11448a<T>> m37101a(C11482n<T> nVar) {
        return new C11184j(nVar);
    }

    /* renamed from: a */
    public static <T> Callable<C11448a<T>> m37102a(C11482n<T> nVar, int i) {
        return new C11175a(nVar, i);
    }

    /* renamed from: a */
    public static <T> Callable<C11448a<T>> m37103a(C11482n<T> nVar, int i, long j, TimeUnit timeUnit, C11491v vVar) {
        return new C11176b(nVar, i, j, timeUnit, vVar);
    }

    /* renamed from: a */
    public static <T> Callable<C11448a<T>> m37104a(C11482n<T> nVar, long j, TimeUnit timeUnit, C11491v vVar) {
        return new C11188n(nVar, j, timeUnit, vVar);
    }

    /* renamed from: a */
    public static <T, R> C10861o<C11482n<T>, C11488s<R>> m37110a(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, C11491v vVar) {
        return new C11185k(oVar, vVar);
    }
}
