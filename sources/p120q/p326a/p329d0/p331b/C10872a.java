package p120q.p326a.p329d0.p331b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p036io.reactivex.exceptions.OnErrorNotImplementedException;
import p120q.p326a.C11481m;
import p120q.p326a.C11491v;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10848b;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10851e;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10854h;
import p120q.p326a.p328c0.C10855i;
import p120q.p326a.p328c0.C10856j;
import p120q.p326a.p328c0.C10857k;
import p120q.p326a.p328c0.C10858l;
import p120q.p326a.p328c0.C10859m;
import p120q.p326a.p328c0.C10860n;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p349h0.C11470b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.b.a */
/* compiled from: Functions */
public final class C10872a {

    /* renamed from: a */
    static final C10861o<Object, Object> f28931a = new C10905v();

    /* renamed from: b */
    public static final Runnable f28932b = new C10900q();

    /* renamed from: c */
    public static final C10847a f28933c = new C10897n();

    /* renamed from: d */
    static final C10853g<Object> f28934d = new C10898o();

    /* renamed from: e */
    public static final C10853g<Throwable> f28935e = new C10884f0();

    /* renamed from: f */
    static final C10862p<Object> f28936f = new C10894k0();

    /* renamed from: g */
    static final C10862p<Object> f28937g = new C10903t();

    /* renamed from: h */
    static final Callable<Object> f28938h = new C10882e0();

    /* renamed from: i */
    static final Comparator<Object> f28939i = new C10874a0();

    /* renamed from: q.a.d0.b.a$a */
    /* compiled from: Functions */
    static final class C10873a<T> implements C10853g<T> {

        /* renamed from: f */
        final C10847a f28940f;

        C10873a(C10847a aVar) {
            this.f28940f = aVar;
        }

        /* renamed from: a */
        public void mo8098a(T t) throws Exception {
            this.f28940f.run();
        }
    }

    /* renamed from: q.a.d0.b.a$a0 */
    /* compiled from: Functions */
    static final class C10874a0 implements Comparator<Object> {
        C10874a0() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: q.a.d0.b.a$b */
    /* compiled from: Functions */
    static final class C10875b<T1, T2, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10849c<? super T1, ? super T2, ? extends R> f28941f;

        C10875b(C10849c<? super T1, ? super T2, ? extends R> cVar) {
            this.f28941f = cVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f28941f.mo7653a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$b0 */
    /* compiled from: Functions */
    static final class C10876b0<T> implements C10847a {

        /* renamed from: f */
        final C10853g<? super C11481m<T>> f28942f;

        C10876b0(C10853g<? super C11481m<T>> gVar) {
            this.f28942f = gVar;
        }

        public void run() throws Exception {
            this.f28942f.mo8098a(C11481m.m37581f());
        }
    }

    /* renamed from: q.a.d0.b.a$c */
    /* compiled from: Functions */
    static final class C10877c<T1, T2, T3, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10854h<T1, T2, T3, R> f28943f;

        C10877c(C10854h<T1, T2, T3, R> hVar) {
            this.f28943f = hVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f28943f.mo36656a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$c0 */
    /* compiled from: Functions */
    static final class C10878c0<T> implements C10853g<Throwable> {

        /* renamed from: f */
        final C10853g<? super C11481m<T>> f28944f;

        C10878c0(C10853g<? super C11481m<T>> gVar) {
            this.f28944f = gVar;
        }

        /* renamed from: a */
        public void mo8098a(Throwable th) throws Exception {
            this.f28944f.mo8098a(C11481m.m37580a(th));
        }
    }

    /* renamed from: q.a.d0.b.a$d */
    /* compiled from: Functions */
    static final class C10879d<T1, T2, T3, T4, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10855i<T1, T2, T3, T4, R> f28945f;

        C10879d(C10855i<T1, T2, T3, T4, R> iVar) {
            this.f28945f = iVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.f28945f.mo36657a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$d0 */
    /* compiled from: Functions */
    static final class C10880d0<T> implements C10853g<T> {

        /* renamed from: f */
        final C10853g<? super C11481m<T>> f28946f;

        C10880d0(C10853g<? super C11481m<T>> gVar) {
            this.f28946f = gVar;
        }

        /* renamed from: a */
        public void mo8098a(T t) throws Exception {
            this.f28946f.mo8098a(C11481m.m37579a(t));
        }
    }

    /* renamed from: q.a.d0.b.a$e */
    /* compiled from: Functions */
    static final class C10881e<T1, T2, T3, T4, T5, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        private final C10856j<T1, T2, T3, T4, T5, R> f28947f;

        C10881e(C10856j<T1, T2, T3, T4, T5, R> jVar) {
            this.f28947f = jVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.f28947f.mo36658a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$e0 */
    /* compiled from: Functions */
    static final class C10882e0 implements Callable<Object> {
        C10882e0() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: q.a.d0.b.a$f */
    /* compiled from: Functions */
    static final class C10883f<T1, T2, T3, T4, T5, T6, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10857k<T1, T2, T3, T4, T5, T6, R> f28948f;

        C10883f(C10857k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f28948f = kVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return this.f28948f.mo36659a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$f0 */
    /* compiled from: Functions */
    static final class C10884f0 implements C10853g<Throwable> {
        C10884f0() {
        }

        /* renamed from: a */
        public void mo8098a(Throwable th) {
            C11459a.m37531b((Throwable) new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: q.a.d0.b.a$g */
    /* compiled from: Functions */
    static final class C10885g<T1, T2, T3, T4, T5, T6, T7, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10858l<T1, T2, T3, T4, T5, T6, T7, R> f28949f;

        C10885g(C10858l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f28949f = lVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 7) {
                return this.f28949f.mo36660a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$g0 */
    /* compiled from: Functions */
    static final class C10886g0<T> implements C10861o<T, C11470b<T>> {

        /* renamed from: f */
        final TimeUnit f28950f;

        /* renamed from: g */
        final C11491v f28951g;

        C10886g0(TimeUnit timeUnit, C11491v vVar) {
            this.f28950f = timeUnit;
            this.f28951g = vVar;
        }

        public C11470b<T> apply(T t) throws Exception {
            return new C11470b<>(t, this.f28951g.mo37600a(this.f28950f), this.f28950f);
        }
    }

    /* renamed from: q.a.d0.b.a$h */
    /* compiled from: Functions */
    static final class C10887h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10859m<T1, T2, T3, T4, T5, T6, T7, T8, R> f28952f;

        C10887h(C10859m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f28952f = mVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.f28952f.mo36661a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$h0 */
    /* compiled from: Functions */
    static final class C10888h0<K, T> implements C10848b<Map<K, T>, T> {

        /* renamed from: a */
        private final C10861o<? super T, ? extends K> f28953a;

        C10888h0(C10861o<? super T, ? extends K> oVar) {
            this.f28953a = oVar;
        }

        /* renamed from: a */
        public void mo36652a(Map<K, T> map, T t) throws Exception {
            map.put(this.f28953a.apply(t), t);
        }
    }

    /* renamed from: q.a.d0.b.a$i */
    /* compiled from: Functions */
    static final class C10889i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements C10861o<Object[], R> {

        /* renamed from: f */
        final C10860n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f28954f;

        C10889i(C10860n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f28954f = nVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return this.f28954f.mo36662a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* renamed from: q.a.d0.b.a$i0 */
    /* compiled from: Functions */
    static final class C10890i0<K, V, T> implements C10848b<Map<K, V>, T> {

        /* renamed from: a */
        private final C10861o<? super T, ? extends V> f28955a;

        /* renamed from: b */
        private final C10861o<? super T, ? extends K> f28956b;

        C10890i0(C10861o<? super T, ? extends V> oVar, C10861o<? super T, ? extends K> oVar2) {
            this.f28955a = oVar;
            this.f28956b = oVar2;
        }

        /* renamed from: a */
        public void mo36652a(Map<K, V> map, T t) throws Exception {
            map.put(this.f28956b.apply(t), this.f28955a.apply(t));
        }
    }

    /* renamed from: q.a.d0.b.a$j */
    /* compiled from: Functions */
    static final class C10891j<T> implements Callable<List<T>> {

        /* renamed from: f */
        final int f28957f;

        C10891j(int i) {
            this.f28957f = i;
        }

        public List<T> call() throws Exception {
            return new ArrayList(this.f28957f);
        }
    }

    /* renamed from: q.a.d0.b.a$j0 */
    /* compiled from: Functions */
    static final class C10892j0<K, V, T> implements C10848b<Map<K, Collection<V>>, T> {

        /* renamed from: a */
        private final C10861o<? super K, ? extends Collection<? super V>> f28958a;

        /* renamed from: b */
        private final C10861o<? super T, ? extends V> f28959b;

        /* renamed from: c */
        private final C10861o<? super T, ? extends K> f28960c;

        C10892j0(C10861o<? super K, ? extends Collection<? super V>> oVar, C10861o<? super T, ? extends V> oVar2, C10861o<? super T, ? extends K> oVar3) {
            this.f28958a = oVar;
            this.f28959b = oVar2;
            this.f28960c = oVar3;
        }

        /* renamed from: a */
        public void mo36652a(Map<K, Collection<V>> map, T t) throws Exception {
            Object apply = this.f28960c.apply(t);
            Collection collection = map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f28958a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f28959b.apply(t));
        }
    }

    /* renamed from: q.a.d0.b.a$k */
    /* compiled from: Functions */
    static final class C10893k<T> implements C10862p<T> {

        /* renamed from: f */
        final C10851e f28961f;

        C10893k(C10851e eVar) {
            this.f28961f = eVar;
        }

        /* renamed from: a */
        public boolean mo36663a(T t) throws Exception {
            return !this.f28961f.mo36654a();
        }
    }

    /* renamed from: q.a.d0.b.a$k0 */
    /* compiled from: Functions */
    static final class C10894k0 implements C10862p<Object> {
        C10894k0() {
        }

        /* renamed from: a */
        public boolean mo36663a(Object obj) {
            return true;
        }
    }

    /* renamed from: q.a.d0.b.a$l */
    /* compiled from: Functions */
    static final class C10895l<T, U> implements C10861o<T, U> {

        /* renamed from: f */
        final Class<U> f28962f;

        C10895l(Class<U> cls) {
            this.f28962f = cls;
        }

        public U apply(T t) throws Exception {
            return this.f28962f.cast(t);
        }
    }

    /* renamed from: q.a.d0.b.a$m */
    /* compiled from: Functions */
    static final class C10896m<T, U> implements C10862p<T> {

        /* renamed from: f */
        final Class<U> f28963f;

        C10896m(Class<U> cls) {
            this.f28963f = cls;
        }

        /* renamed from: a */
        public boolean mo36663a(T t) throws Exception {
            return this.f28963f.isInstance(t);
        }
    }

    /* renamed from: q.a.d0.b.a$n */
    /* compiled from: Functions */
    static final class C10897n implements C10847a {
        C10897n() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: q.a.d0.b.a$o */
    /* compiled from: Functions */
    static final class C10898o implements C10853g<Object> {
        C10898o() {
        }

        /* renamed from: a */
        public void mo8098a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: q.a.d0.b.a$p */
    /* compiled from: Functions */
    static final class C10899p {
        C10899p() {
        }
    }

    /* renamed from: q.a.d0.b.a$q */
    /* compiled from: Functions */
    static final class C10900q implements Runnable {
        C10900q() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: q.a.d0.b.a$r */
    /* compiled from: Functions */
    static final class C10901r<T> implements C10862p<T> {

        /* renamed from: f */
        final T f28964f;

        C10901r(T t) {
            this.f28964f = t;
        }

        /* renamed from: a */
        public boolean mo36663a(T t) throws Exception {
            return C10910b.m36863a((Object) t, (Object) this.f28964f);
        }
    }

    /* renamed from: q.a.d0.b.a$s */
    /* compiled from: Functions */
    static final class C10902s implements C10853g<Throwable> {
        C10902s() {
        }

        /* renamed from: a */
        public void mo8098a(Throwable th) {
            C11459a.m37531b(th);
        }
    }

    /* renamed from: q.a.d0.b.a$t */
    /* compiled from: Functions */
    static final class C10903t implements C10862p<Object> {
        C10903t() {
        }

        /* renamed from: a */
        public boolean mo36663a(Object obj) {
            return false;
        }
    }

    /* renamed from: q.a.d0.b.a$u */
    /* compiled from: Functions */
    enum C10904u implements Callable<Set<Object>> {
        INSTANCE;

        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: q.a.d0.b.a$v */
    /* compiled from: Functions */
    static final class C10905v implements C10861o<Object, Object> {
        C10905v() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: q.a.d0.b.a$w */
    /* compiled from: Functions */
    static final class C10906w<T, U> implements Callable<U>, C10861o<T, U> {

        /* renamed from: f */
        final U f28967f;

        C10906w(U u) {
            this.f28967f = u;
        }

        public U apply(T t) throws Exception {
            return this.f28967f;
        }

        public U call() throws Exception {
            return this.f28967f;
        }
    }

    /* renamed from: q.a.d0.b.a$x */
    /* compiled from: Functions */
    static final class C10907x<T> implements C10861o<List<T>, List<T>> {

        /* renamed from: f */
        final Comparator<? super T> f28968f;

        C10907x(Comparator<? super T> comparator) {
            this.f28968f = comparator;
        }

        /* renamed from: a */
        public List<T> mo36698a(List<T> list) {
            Collections.sort(list, this.f28968f);
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            List list = (List) obj;
            mo36698a(list);
            return list;
        }
    }

    /* renamed from: q.a.d0.b.a$y */
    /* compiled from: Functions */
    static final class C10908y implements C10853g<C12936c> {
        C10908y() {
        }

        /* renamed from: a */
        public void mo8098a(C12936c cVar) throws Exception {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: q.a.d0.b.a$z */
    /* compiled from: Functions */
    enum C10909z implements Comparator<Object> {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static {
        new C10902s();
        new C10899p();
        new C10908y();
    }

    /* renamed from: a */
    public static <T1, T2, R> C10861o<Object[], R> m36803a(C10849c<? super T1, ? super T2, ? extends R> cVar) {
        C10910b.m36861a(cVar, "f is null");
        return new C10875b(cVar);
    }

    /* renamed from: b */
    public static <T> C10862p<T> m36816b() {
        return f28936f;
    }

    /* renamed from: c */
    public static <T, U> C10861o<T, U> m36820c(U u) {
        return new C10906w(u);
    }

    /* renamed from: d */
    public static <T> C10853g<T> m36821d() {
        return f28934d;
    }

    /* renamed from: e */
    public static <T> C10861o<T, T> m36822e() {
        return f28931a;
    }

    /* renamed from: f */
    public static <T> Comparator<T> m36823f() {
        return C10909z.INSTANCE;
    }

    /* renamed from: g */
    public static <T> Comparator<T> m36824g() {
        return f28939i;
    }

    /* renamed from: h */
    public static <T> Callable<T> m36825h() {
        return f28938h;
    }

    /* renamed from: b */
    public static <T> Callable<T> m36814b(T t) {
        return new C10906w(t);
    }

    /* renamed from: c */
    public static <T> Callable<Set<T>> m36818c() {
        return C10904u.INSTANCE;
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C10861o<Object[], R> m36804a(C10854h<T1, T2, T3, R> hVar) {
        C10910b.m36861a(hVar, "f is null");
        return new C10877c(hVar);
    }

    /* renamed from: b */
    public static <T> C10853g<Throwable> m36815b(C10853g<? super C11481m<T>> gVar) {
        return new C10878c0(gVar);
    }

    /* renamed from: c */
    public static <T> C10853g<T> m36819c(C10853g<? super C11481m<T>> gVar) {
        return new C10880d0(gVar);
    }

    /* renamed from: b */
    public static <T, U> C10862p<T> m36817b(Class<U> cls) {
        return new C10896m(cls);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C10861o<Object[], R> m36805a(C10855i<T1, T2, T3, T4, R> iVar) {
        C10910b.m36861a(iVar, "f is null");
        return new C10879d(iVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> C10861o<Object[], R> m36806a(C10856j<T1, T2, T3, T4, T5, R> jVar) {
        C10910b.m36861a(jVar, "f is null");
        return new C10881e(jVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C10861o<Object[], R> m36807a(C10857k<T1, T2, T3, T4, T5, T6, R> kVar) {
        C10910b.m36861a(kVar, "f is null");
        return new C10883f(kVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> C10861o<Object[], R> m36808a(C10858l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        C10910b.m36861a(lVar, "f is null");
        return new C10885g(lVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C10861o<Object[], R> m36809a(C10859m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        C10910b.m36861a(mVar, "f is null");
        return new C10887h(mVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C10861o<Object[], R> m36810a(C10860n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        C10910b.m36861a(nVar, "f is null");
        return new C10889i(nVar);
    }

    /* renamed from: a */
    public static <T> C10862p<T> m36811a() {
        return f28937g;
    }

    /* renamed from: a */
    public static <T, U> C10861o<T, U> m36800a(Class<U> cls) {
        return new C10895l(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m36794a(int i) {
        return new C10891j(i);
    }

    /* renamed from: a */
    public static <T> C10862p<T> m36812a(T t) {
        return new C10901r(t);
    }

    /* renamed from: a */
    public static <T> C10847a m36795a(C10853g<? super C11481m<T>> gVar) {
        return new C10876b0(gVar);
    }

    /* renamed from: a */
    public static <T> C10853g<T> m36799a(C10847a aVar) {
        return new C10873a(aVar);
    }

    /* renamed from: a */
    public static <T> C10862p<T> m36813a(C10851e eVar) {
        return new C10893k(eVar);
    }

    /* renamed from: a */
    public static <T> C10861o<T, C11470b<T>> m36802a(TimeUnit timeUnit, C11491v vVar) {
        return new C10886g0(timeUnit, vVar);
    }

    /* renamed from: a */
    public static <T, K> C10848b<Map<K, T>, T> m36796a(C10861o<? super T, ? extends K> oVar) {
        return new C10888h0(oVar);
    }

    /* renamed from: a */
    public static <T, K, V> C10848b<Map<K, V>, T> m36797a(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2) {
        return new C10890i0(oVar2, oVar);
    }

    /* renamed from: a */
    public static <T, K, V> C10848b<Map<K, Collection<V>>, T> m36798a(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, C10861o<? super K, ? extends Collection<? super V>> oVar3) {
        return new C10892j0(oVar3, oVar2, oVar);
    }

    /* renamed from: a */
    public static <T> C10861o<List<T>, List<T>> m36801a(Comparator<? super T> comparator) {
        return new C10907x(comparator);
    }
}
