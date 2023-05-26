package p123rx;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.OnErrorFailedException;
import p123rx.p126m.C12492l;
import p123rx.p126m.C12495m;
import p123rx.p126m.C12496o;
import p123rx.p126m.C12497p;
import p123rx.p126m.C12498q;
import p123rx.p126m.C12499r;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.p401n.p402a.C12503a0;
import p123rx.p401n.p402a.C12505a1;
import p123rx.p401n.p402a.C12517b0;
import p123rx.p401n.p402a.C12519b1;
import p123rx.p401n.p402a.C12524c0;
import p123rx.p401n.p402a.C12527c1;
import p123rx.p401n.p402a.C12532d0;
import p123rx.p401n.p402a.C12533d1;
import p123rx.p401n.p402a.C12537e0;
import p123rx.p401n.p402a.C12541e1;
import p123rx.p401n.p402a.C12546f0;
import p123rx.p401n.p402a.C12548f1;
import p123rx.p401n.p402a.C12551g;
import p123rx.p401n.p402a.C12552g0;
import p123rx.p401n.p402a.C12554g1;
import p123rx.p401n.p402a.C12564h1;
import p123rx.p401n.p402a.C12570i0;
import p123rx.p401n.p402a.C12574j;
import p123rx.p401n.p402a.C12577j0;
import p123rx.p401n.p402a.C12580k;
import p123rx.p401n.p402a.C12585k0;
import p123rx.p401n.p402a.C12590l;
import p123rx.p401n.p402a.C12591l0;
import p123rx.p401n.p402a.C12598m;
import p123rx.p401n.p402a.C12600m0;
import p123rx.p401n.p402a.C12604n;
import p123rx.p401n.p402a.C12606n0;
import p123rx.p401n.p402a.C12609o;
import p123rx.p401n.p402a.C12611o0;
import p123rx.p401n.p402a.C12614p;
import p123rx.p401n.p402a.C12617p0;
import p123rx.p401n.p402a.C12625q;
import p123rx.p401n.p402a.C12629q0;
import p123rx.p401n.p402a.C12637r;
import p123rx.p401n.p402a.C12641r0;
import p123rx.p401n.p402a.C12646s;
import p123rx.p401n.p402a.C12648s0;
import p123rx.p401n.p402a.C12654t;
import p123rx.p401n.p402a.C12655t0;
import p123rx.p401n.p402a.C12663u;
import p123rx.p401n.p402a.C12665u0;
import p123rx.p401n.p402a.C12671v;
import p123rx.p401n.p402a.C12672v0;
import p123rx.p401n.p402a.C12674w;
import p123rx.p401n.p402a.C12676w0;
import p123rx.p401n.p402a.C12679x;
import p123rx.p401n.p402a.C12681x0;
import p123rx.p401n.p402a.C12683y;
import p123rx.p401n.p402a.C12693y0;
import p123rx.p401n.p402a.C12700z0;
import p123rx.p401n.p406e.C12756a;
import p123rx.p401n.p406e.C12757b;
import p123rx.p401n.p406e.C12762f;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.C12775j;
import p123rx.p401n.p406e.C12792m;
import p123rx.p409o.C12829a;
import p123rx.p409o.C12831b;
import p123rx.p410p.C12835c;
import p123rx.p411q.C12844c;
import p123rx.schedulers.Schedulers;

/* renamed from: rx.e */
/* compiled from: Observable */
public class C5368e<T> {

    /* renamed from: f */
    final C5370a<T> f9636f;

    /* renamed from: rx.e$c */
    /* compiled from: Observable */
    public interface C5369c<T, R> extends C5379n<C5368e<T>, C5368e<R>> {
    }

    /* renamed from: rx.e$a */
    /* compiled from: Observable */
    public interface C5370a<T> extends C5378b<C12475j<? super T>> {
    }

    /* renamed from: rx.e$b */
    /* compiled from: Observable */
    public interface C5371b<R, T> extends C5379n<C12475j<? super R>, C12475j<? super T>> {
    }

    protected C5368e(C5370a<T> aVar) {
        this.f9636f = aVar;
    }

    @Deprecated
    /* renamed from: a */
    public static <T> C5368e<T> m10241a(C5370a<T> aVar) {
        return new C5368e<>(C12844c.m41407a(aVar));
    }

    /* renamed from: b */
    public static <T> C5368e<T> m10253b(C5370a<T> aVar) {
        return new C5368e<>(C12844c.m41407a(aVar));
    }

    /* renamed from: c */
    public static <T> C5368e<T> m10257c(T t) {
        return C12775j.m41278d(t);
    }

    /* renamed from: e */
    public static C5368e<Long> m10259e(long j, TimeUnit timeUnit, C5373h hVar) {
        return m10253b(new C12546f0(j, timeUnit, hVar));
    }

    /* renamed from: f */
    public static <T> C5368e<T> m10261f(C5368e<? extends C5368e<? extends T>> eVar) {
        return eVar.mo18650a((C5379n<? super Object, ? extends C5368e<? extends R>>) C12792m.m41299b());
    }

    /* renamed from: g */
    public static <T> C5368e<T> m10262g(C5368e<? extends C5368e<? extends T>> eVar) {
        if (eVar.getClass() == C12775j.class) {
            return ((C12775j) eVar).mo40901s(C12792m.m41299b());
        }
        return eVar.mo18640a((C5371b<? extends R, ? super Object>) C12629q0.m41089a(false));
    }

    /* renamed from: h */
    public static <T> C5368e<T> m10263h(C5368e<? extends C5368e<? extends T>> eVar) {
        return eVar.mo18640a((C5371b<? extends R, ? super Object>) C12629q0.m41089a(true));
    }

    /* renamed from: i */
    public static <T> C5368e<T> m10264i(C5368e<? extends C5368e<? extends T>> eVar) {
        return eVar.mo18640a((C5371b<? extends R, ? super Object>) C12505a1.m40965a(false));
    }

    /* renamed from: n */
    public static <T> C5368e<T> m10265n() {
        return C12551g.m41010a();
    }

    /* renamed from: d */
    public final C5368e<T> mo18679d(C5368e<? extends T> eVar) {
        if (eVar != null) {
            return m10253b(new C12524c0(this, eVar));
        }
        throw new NullPointerException("alternate is null");
    }

    /* renamed from: j */
    public final <R> C5368e<R> mo18694j(C5379n<? super T, ? extends R> nVar) {
        return m10253b(new C12674w(this, nVar));
    }

    /* renamed from: k */
    public C5328b mo18696k() {
        return C5328b.m10165b((C5368e<?>) this);
    }

    /* renamed from: l */
    public final C5368e<T> mo18699l(C5379n<? super Throwable, ? extends T> nVar) {
        return mo18640a(C12655t0.m41139a(nVar));
    }

    /* renamed from: m */
    public Single<T> mo18700m() {
        return new Single<>(C12503a0.m40963a(this));
    }

    /* renamed from: o */
    public final <R> C5368e<R> mo18703o(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        return m10264i(mo18694j(nVar));
    }

    /* renamed from: p */
    public final C5368e<T> mo18704p(C5379n<? super T, Boolean> nVar) {
        return mo18681d(nVar).mo18657b(1);
    }

    /* renamed from: q */
    public final C5368e<T> mo18705q(C5379n<? super T, Boolean> nVar) {
        return mo18640a(new C12533d1(nVar));
    }

    /* renamed from: r */
    public final C5368e<T> mo18706r(C5379n<? super T, Boolean> nVar) {
        return mo18640a(new C12541e1(nVar));
    }

    /* renamed from: b */
    public static <T> C5368e<T> m10252b(Iterable<? extends C5368e<? extends T>> iterable) {
        return m10262g(m10234a(iterable));
    }

    /* renamed from: c */
    public static <T> C5368e<T> m10258c(C5368e<? extends T> eVar, C5368e<? extends T> eVar2) {
        return m10263h(m10235a(eVar, eVar2));
    }

    /* renamed from: f */
    public static C5368e<Long> m10260f(long j, TimeUnit timeUnit) {
        return m10259e(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public final <R> C5368e<R> mo18640a(C5371b<? extends R, ? super T> bVar) {
        return m10253b(new C12671v(this.f9636f, bVar));
    }

    /* renamed from: e */
    public final C5368e<T> mo18684e(C5379n<? super T, Boolean> nVar) {
        return mo18704p(nVar).mo18690h();
    }

    /* renamed from: h */
    public final <R> C5368e<R> mo18691h(C5379n<? super T, ? extends Iterable<? extends R>> nVar) {
        return mo18666b(nVar, C12772h.f32957h);
    }

    /* renamed from: i */
    public final <R> C5368e<R> mo18692i(C5379n<? super T, ? extends Single<? extends R>> nVar) {
        return mo18667b(nVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final C12829a<T> mo18695j() {
        return C12829a.m41381b(this);
    }

    /* renamed from: k */
    public final C5368e<T> mo18697k(C5379n<? super Throwable, ? extends C5368e<? extends T>> nVar) {
        return mo18640a(new C12655t0(nVar));
    }

    /* renamed from: l */
    public final C5368e<List<T>> mo18698l() {
        return mo18640a(C12548f1.m41008a());
    }

    /* renamed from: m */
    public final C5368e<T> mo18701m(C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>> nVar) {
        return C12683y.m41170a(this, C12762f.m41257a(nVar));
    }

    /* renamed from: n */
    public final C5368e<T> mo18702n(C5379n<? super T, Boolean> nVar) {
        return mo18640a(new C12693y0(C12693y0.m41177a(nVar)));
    }

    /* renamed from: b */
    public static <T> C5368e<T> m10254b(C5368e<? extends T> eVar, C5368e<? extends T> eVar2) {
        return m10250a((C5368e<? extends T>[]) new C5368e[]{eVar, eVar2});
    }

    /* renamed from: a */
    public <R> C5368e<R> mo18641a(C5369c<? super T, ? extends R> cVar) {
        return (C5368e) cVar.call(this);
    }

    /* renamed from: c */
    public final <U> C5368e<T> mo18674c(C5379n<? super T, ? extends U> nVar) {
        return mo18640a(new C12600m0(nVar));
    }

    /* renamed from: d */
    public final C5368e<T> mo18680d(C5377a aVar) {
        return mo18640a(new C12611o0(aVar));
    }

    /* renamed from: e */
    public final C12831b<T> mo18685e() {
        return C12665u0.m41149j(this);
    }

    /* renamed from: f */
    public final <R> C5368e<R> mo18687f(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        if (getClass() == C12775j.class) {
            return ((C12775j) this).mo40901s(nVar);
        }
        return m10262g(mo18694j(nVar));
    }

    /* renamed from: h */
    public final C5368e<T> mo18690h() {
        return mo18640a(C12676w0.m41163a());
    }

    /* renamed from: i */
    public final C5375k mo18693i() {
        return mo18654a(new C12757b(C12492l.m40956a(), C12762f.f32952g, C12492l.m40956a()));
    }

    /* renamed from: a */
    public static <T1, T2, R> C5368e<R> m10247a(C5368e<? extends T1> eVar, C5368e<? extends T2> eVar2, C12496o<? super T1, ? super T2, ? extends R> oVar) {
        return m10239a(Arrays.asList(new C5368e[]{eVar, eVar2}), C12499r.m40957a(oVar));
    }

    /* renamed from: b */
    public static <T> C5368e<T> m10255b(C5368e<? extends T> eVar, C5368e<? extends T> eVar2, C5368e<? extends T> eVar3) {
        return m10263h(m10236a(eVar, eVar2, eVar3));
    }

    /* renamed from: c */
    public final C5368e<T> mo18673c(C5377a aVar) {
        return m10253b(new C12604n(this, new C12756a(C12492l.m40956a(), C12492l.m40955a(aVar), aVar)));
    }

    /* renamed from: d */
    public final C5368e<T> mo18681d(C5379n<? super T, Boolean> nVar) {
        return m10253b(new C12609o(this, nVar));
    }

    /* renamed from: e */
    public final <E> C5368e<T> mo18683e(C5368e<? extends E> eVar) {
        return mo18640a(new C12527c1(eVar));
    }

    /* renamed from: g */
    public final C5368e<T> mo18689g(C5379n<? super T, ? extends C5328b> nVar) {
        return mo18652a(nVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C5368e<R> m10246a(C5368e<? extends T1> eVar, C5368e<? extends T2> eVar2, C5368e<? extends T3> eVar3, C12497p<? super T1, ? super T2, ? super T3, ? extends R> pVar) {
        return m10239a(Arrays.asList(new C5368e[]{eVar, eVar2, eVar3}), C12499r.m40958a(pVar));
    }

    /* renamed from: b */
    public static <T1, T2, R> C5368e<R> m10256b(C5368e<? extends T1> eVar, C5368e<? extends T2> eVar2, C12496o<? super T1, ? super T2, ? extends R> oVar) {
        return m10257c(new C5368e[]{eVar, eVar2}).mo18640a(new C12564h1(oVar));
    }

    /* renamed from: d */
    public final C5368e<T> mo18676d() {
        return mo18640a(C12648s0.m41128a());
    }

    /* renamed from: e */
    public final C5368e<T> mo18682e(long j, TimeUnit timeUnit) {
        return mo18670c(j, timeUnit);
    }

    /* renamed from: g */
    public final C5368e<T> mo18688g() {
        return mo18685e().mo41038p();
    }

    /* renamed from: a */
    public static <T, R> C5368e<R> m10239a(List<? extends C5368e<? extends T>> list, C12498q<? extends R> qVar) {
        return m10253b(new C12574j(list, qVar));
    }

    /* renamed from: b */
    public final C5368e<T> mo18658b(long j, TimeUnit timeUnit) {
        return mo18659b(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: d */
    public final C5368e<T> mo18677d(long j, TimeUnit timeUnit) {
        return mo18678d(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: f */
    public final C5368e<T> mo18686f() {
        return C12683y.m41169a(this);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10242a(C5368e<? extends T> eVar, C5368e<? extends T> eVar2) {
        return m10261f(m10235a(eVar, eVar2));
    }

    /* renamed from: b */
    public final C5368e<T> mo18659b(long j, TimeUnit timeUnit, C5373h hVar) {
        return mo18640a(new C12591l0(j, timeUnit, hVar));
    }

    /* renamed from: d */
    public final C5368e<T> mo18678d(long j, TimeUnit timeUnit, C5373h hVar) {
        return m10253b(new C12517b0(this, j, timeUnit, hVar));
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10248a(C12495m<C5368e<T>> mVar) {
        return m10253b(new C12590l(mVar));
    }

    /* renamed from: b */
    public final C5368e<T> mo18656b() {
        return mo18640a(C12600m0.m41060a());
    }

    /* renamed from: c */
    public final C5368e<T> mo18669c() {
        return mo18657b(1).mo18690h();
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10238a(Throwable th) {
        return m10253b(new C12532d0(th));
    }

    /* renamed from: b */
    public final C5368e<T> mo18664b(C5378b<? super T> bVar) {
        return m10253b(new C12604n(this, new C12756a(bVar, C12492l.m40956a(), C12492l.m40956a())));
    }

    /* renamed from: c */
    public final C5368e<T> mo18672c(C5368e<? extends T> eVar) {
        return mo18640a(C12655t0.m41138a(eVar));
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10234a(Iterable<? extends T> iterable) {
        return m10253b(new C12663u(iterable));
    }

    /* renamed from: c */
    public final C5368e<T> mo18670c(long j, TimeUnit timeUnit) {
        return mo18671c(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10249a(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m10265n();
        }
        if (length == 1) {
            return m10257c(tArr[0]);
        }
        return m10253b(new C12646s(tArr));
    }

    /* renamed from: c */
    public final C5368e<T> mo18671c(long j, TimeUnit timeUnit, C5373h hVar) {
        return mo18640a(new C12672v0(j, timeUnit, hVar));
    }

    /* renamed from: c */
    public final C5375k mo18675c(C5378b<? super T> bVar) {
        if (bVar != null) {
            return mo18654a(new C12757b(bVar, C12762f.f32952g, C12492l.m40956a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* renamed from: b */
    public final C5368e<T> mo18663b(C5377a aVar) {
        return mo18640a(new C12606n0(aVar));
    }

    /* renamed from: b */
    public final <R> C5368e<R> mo18665b(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        return mo18651a(nVar, C12772h.f32957h);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10240a(Callable<? extends T> callable) {
        return m10253b(new C12654t(callable));
    }

    /* renamed from: b */
    public final <R> C5368e<R> mo18666b(C5379n<? super T, ? extends Iterable<? extends R>> nVar, int i) {
        return C12637r.m41112a(this, nVar, i);
    }

    /* renamed from: a */
    public static C5368e<Long> m10232a(long j, long j2, TimeUnit timeUnit) {
        return m10233a(j, j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: b */
    public final <R> C5368e<R> mo18667b(C5379n<? super T, ? extends Single<? extends R>> nVar, boolean z, int i) {
        return m10253b(new C12625q(this, nVar, z, i));
    }

    /* renamed from: a */
    public static C5368e<Long> m10233a(long j, long j2, TimeUnit timeUnit, C5373h hVar) {
        return m10253b(new C12552g0(j, j2, timeUnit, hVar));
    }

    /* renamed from: b */
    public final C5368e<T> mo18661b(C5368e<? extends T> eVar) {
        return m10254b(this, (C5368e) eVar);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10235a(T t, T t2) {
        return m10249a((T[]) new Object[]{t, t2});
    }

    /* renamed from: b */
    public final C5368e<T> mo18660b(T t) {
        return m10242a(m10257c(t), this);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10236a(T t, T t2, T t3) {
        return m10249a((T[]) new Object[]{t, t2, t3});
    }

    /* renamed from: b */
    public final C5375k mo18668b(C12475j<? super T> jVar) {
        try {
            jVar.onStart();
            C12844c.m41408a(this, this.f9636f).call(jVar);
            return C12844c.m41411a((C5375k) jVar);
        } catch (Throwable th) {
            C12472a.m40945c(th);
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
            C12844c.m41418c((Throwable) onErrorFailedException);
            throw onErrorFailedException;
        }
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10237a(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return m10249a((T[]) new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10243a(C5368e<? extends T> eVar, C5368e<? extends T> eVar2, C5368e<? extends T> eVar3) {
        return m10250a((C5368e<? extends T>[]) new C5368e[]{eVar, eVar2, eVar3});
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10244a(C5368e<? extends T> eVar, C5368e<? extends T> eVar2, C5368e<? extends T> eVar3, C5368e<? extends T> eVar4) {
        return m10250a((C5368e<? extends T>[]) new C5368e[]{eVar, eVar2, eVar3, eVar4});
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10250a(C5368e<? extends T>[] eVarArr) {
        return m10262g(m10249a((T[]) eVarArr));
    }

    /* renamed from: a */
    public static <T> C5368e<T> m10245a(C5368e<? extends T> eVar, C5368e<? extends T> eVar2, C5368e<? extends T> eVar3, C5368e<? extends T> eVar4, C5368e<? extends T> eVar5, C5368e<? extends T> eVar6, C5368e<? extends T> eVar7, C5368e<? extends T> eVar8) {
        return m10263h(m10237a(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8));
    }

    /* renamed from: a */
    public static C5368e<Integer> m10231a(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        } else if (i2 == 0) {
            return m10265n();
        } else {
            if (i > (Integer.MAX_VALUE - i2) + 1) {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            } else if (i2 == 1) {
                return m10257c(Integer.valueOf(i));
            } else {
                return m10253b(new C12679x(i, (i2 - 1) + i));
            }
        }
    }

    /* renamed from: b */
    public final C5368e<T> mo18662b(C5373h hVar) {
        return mo18646a(hVar, true);
    }

    /* renamed from: a */
    public final C5368e<T> mo18632a() {
        return mo18640a(C12570i0.m41028a());
    }

    /* renamed from: b */
    public final C5368e<T> mo18657b(int i) {
        return mo18640a(new C12519b1(i));
    }

    /* renamed from: a */
    public final <R> C5368e<R> mo18638a(Class<R> cls) {
        return mo18640a(new C12577j0(cls));
    }

    /* renamed from: a */
    public final <R> C5368e<R> mo18650a(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        if (this instanceof C12775j) {
            return ((C12775j) this).mo40901s(nVar);
        }
        return m10253b(new C12580k(this, nVar, 2, 0));
    }

    /* renamed from: a */
    public final C5368e<T> mo18634a(long j, TimeUnit timeUnit) {
        return mo18637a(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public final C5368e<T> mo18637a(long j, TimeUnit timeUnit, C5373h hVar) {
        return mo18640a(new C12585k0(j, timeUnit, hVar));
    }

    /* renamed from: a */
    public final C5368e<T> mo18639a(T t) {
        return mo18679d(m10257c(t));
    }

    /* renamed from: a */
    public final <U> C5368e<T> mo18642a(C5368e<U> eVar) {
        if (eVar != null) {
            return m10253b(new C12598m(this, eVar));
        }
        throw null;
    }

    /* renamed from: a */
    public final C5368e<T> mo18648a(C5377a aVar) {
        return m10253b(new C12604n(this, new C12756a(C12492l.m40956a(), C12492l.m40956a(), aVar)));
    }

    /* renamed from: a */
    public final C5368e<T> mo18649a(C5378b<? super Throwable> bVar) {
        return m10253b(new C12604n(this, new C12756a(C12492l.m40956a(), bVar, C12492l.m40956a())));
    }

    /* renamed from: a */
    public final <R> C5368e<R> mo18651a(C5379n<? super T, ? extends C5368e<? extends R>> nVar, int i) {
        if (i >= 1) {
            return mo18640a(new C12617p0(nVar, i, Integer.MAX_VALUE));
        }
        throw new IllegalArgumentException("capacityHint > 0 required but it was " + i);
    }

    /* renamed from: a */
    public final C5368e<T> mo18652a(C5379n<? super T, ? extends C5328b> nVar, boolean z, int i) {
        return m10253b(new C12614p(this, nVar, z, i));
    }

    /* renamed from: a */
    public final C5368e<T> mo18644a(C5373h hVar) {
        return mo18645a(hVar, C12772h.f32957h);
    }

    /* renamed from: a */
    public final C5368e<T> mo18645a(C5373h hVar, int i) {
        return mo18647a(hVar, false, i);
    }

    /* renamed from: a */
    public final C5368e<T> mo18647a(C5373h hVar, boolean z, int i) {
        if (this instanceof C12775j) {
            return ((C12775j) this).mo40899c(hVar);
        }
        return mo18640a(new C12641r0(hVar, z, i));
    }

    /* renamed from: a */
    public final C5368e<T> mo18633a(int i) {
        return mo18640a(new C12681x0(i));
    }

    /* renamed from: a */
    public final C5375k mo18655a(C5378b<? super T> bVar, C5378b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (bVar2 != null) {
            return mo18654a(new C12757b(bVar, bVar2, C12492l.m40956a()));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: a */
    public final C5375k mo18654a(C12475j<? super T> jVar) {
        return m10251a(jVar, this);
    }

    /* renamed from: a */
    static <T> C5375k m10251a(C12475j<? super T> jVar, C5368e<T> eVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (eVar.f9636f != null) {
            jVar.onStart();
            if (!(jVar instanceof C12835c)) {
                jVar = new C12835c<>(jVar);
            }
            try {
                C12844c.m41408a(eVar, eVar.f9636f).call(jVar);
                return C12844c.m41411a((C5375k) jVar);
            } catch (Throwable th) {
                C12472a.m40945c(th);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C12844c.m41418c((Throwable) onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    /* renamed from: a */
    public final C5368e<T> mo18646a(C5373h hVar, boolean z) {
        if (this instanceof C12775j) {
            return ((C12775j) this).mo40899c(hVar);
        }
        return m10253b(new C12700z0(this, hVar, z));
    }

    /* renamed from: a */
    public final C5368e<T> mo18635a(long j, TimeUnit timeUnit, C5368e<? extends T> eVar) {
        return mo18636a(j, timeUnit, eVar, Schedulers.computation());
    }

    /* renamed from: a */
    public final C5368e<T> mo18636a(long j, TimeUnit timeUnit, C5368e<? extends T> eVar, C5373h hVar) {
        return m10253b(new C12537e0(this, j, timeUnit, hVar, eVar));
    }

    /* renamed from: a */
    public final C5368e<List<T>> mo18653a(C12496o<? super T, ? super T, Integer> oVar) {
        return mo18640a(new C12554g1(oVar, 10));
    }

    /* renamed from: a */
    public final <T2, R> C5368e<R> mo18643a(C5368e<? extends T2> eVar, C12496o<? super T, ? super T2, ? extends R> oVar) {
        return m10256b(this, eVar, oVar);
    }
}
