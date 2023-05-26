package p120q.p326a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10848b;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10850d;
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
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10916e;
import p120q.p326a.p329d0.p333d.C10923e;
import p120q.p326a.p329d0.p333d.C10924f;
import p120q.p326a.p329d0.p333d.C10929k;
import p120q.p326a.p329d0.p333d.C10930l;
import p120q.p326a.p329d0.p333d.C10933o;
import p120q.p326a.p329d0.p334e.p336b.C10946b;
import p120q.p326a.p329d0.p334e.p336b.C10952e;
import p120q.p326a.p329d0.p334e.p338d.C10961a;
import p120q.p326a.p329d0.p334e.p338d.C10964b;
import p120q.p326a.p329d0.p334e.p338d.C10967c;
import p120q.p326a.p329d0.p334e.p338d.C10970d;
import p120q.p326a.p329d0.p334e.p338d.C10973e;
import p120q.p326a.p329d0.p334e.p338d.C10976f;
import p120q.p326a.p329d0.p334e.p339e.C10981a0;
import p120q.p326a.p329d0.p334e.p339e.C10983a1;
import p120q.p326a.p329d0.p334e.p339e.C10985a2;
import p120q.p326a.p329d0.p334e.p339e.C10988a3;
import p120q.p326a.p329d0.p334e.p339e.C10990a4;
import p120q.p326a.p329d0.p334e.p339e.C10992b;
import p120q.p326a.p329d0.p334e.p339e.C10994b0;
import p120q.p326a.p329d0.p334e.p339e.C10996b1;
import p120q.p326a.p329d0.p334e.p339e.C10998b2;
import p120q.p326a.p329d0.p334e.p339e.C11002b4;
import p120q.p326a.p329d0.p334e.p339e.C11004c;
import p120q.p326a.p329d0.p334e.p339e.C11006c0;
import p120q.p326a.p329d0.p334e.p339e.C11009c1;
import p120q.p326a.p329d0.p334e.p339e.C11010c2;
import p120q.p326a.p329d0.p334e.p339e.C11012c3;
import p120q.p326a.p329d0.p334e.p339e.C11015c4;
import p120q.p326a.p329d0.p334e.p339e.C11017d;
import p120q.p326a.p329d0.p334e.p339e.C11020d0;
import p120q.p326a.p329d0.p334e.p339e.C11023d1;
import p120q.p326a.p329d0.p334e.p339e.C11024d2;
import p120q.p326a.p329d0.p334e.p339e.C11026d3;
import p120q.p326a.p329d0.p334e.p339e.C11027d4;
import p120q.p326a.p329d0.p334e.p339e.C11030e;
import p120q.p326a.p329d0.p334e.p339e.C11033e0;
import p120q.p326a.p329d0.p334e.p339e.C11034e1;
import p120q.p326a.p329d0.p334e.p339e.C11036e2;
import p120q.p326a.p329d0.p334e.p339e.C11038e3;
import p120q.p326a.p329d0.p334e.p339e.C11040e4;
import p120q.p326a.p329d0.p334e.p339e.C11044f0;
import p120q.p326a.p329d0.p334e.p339e.C11049f1;
import p120q.p326a.p329d0.p334e.p339e.C11051f2;
import p120q.p326a.p329d0.p334e.p339e.C11055f3;
import p120q.p326a.p329d0.p334e.p339e.C11057f4;
import p120q.p326a.p329d0.p334e.p339e.C11060g;
import p120q.p326a.p329d0.p334e.p339e.C11062g0;
import p120q.p326a.p329d0.p334e.p339e.C11065g1;
import p120q.p326a.p329d0.p334e.p339e.C11069g3;
import p120q.p326a.p329d0.p334e.p339e.C11071g4;
import p120q.p326a.p329d0.p334e.p339e.C11074h;
import p120q.p326a.p329d0.p334e.p339e.C11077h0;
import p120q.p326a.p329d0.p334e.p339e.C11079h1;
import p120q.p326a.p329d0.p334e.p339e.C11082h3;
import p120q.p326a.p329d0.p334e.p339e.C11084h4;
import p120q.p326a.p329d0.p334e.p339e.C11091i0;
import p120q.p326a.p329d0.p334e.p339e.C11093i1;
import p120q.p326a.p329d0.p334e.p339e.C11097i2;
import p120q.p326a.p329d0.p334e.p339e.C11100i3;
import p120q.p326a.p329d0.p334e.p339e.C11102i4;
import p120q.p326a.p329d0.p334e.p339e.C11105j;
import p120q.p326a.p329d0.p334e.p339e.C11107j0;
import p120q.p326a.p329d0.p334e.p339e.C11109j1;
import p120q.p326a.p329d0.p334e.p339e.C11114j2;
import p120q.p326a.p329d0.p334e.p339e.C11116j3;
import p120q.p326a.p329d0.p334e.p339e.C11119j4;
import p120q.p326a.p329d0.p334e.p339e.C11126k;
import p120q.p326a.p329d0.p334e.p339e.C11127k0;
import p120q.p326a.p329d0.p334e.p339e.C11129k1;
import p120q.p326a.p329d0.p334e.p339e.C11131k2;
import p120q.p326a.p329d0.p334e.p339e.C11133k3;
import p120q.p326a.p329d0.p334e.p339e.C11135k4;
import p120q.p326a.p329d0.p334e.p339e.C11138l;
import p120q.p326a.p329d0.p334e.p339e.C11141l0;
import p120q.p326a.p329d0.p334e.p339e.C11143l1;
import p120q.p326a.p329d0.p334e.p339e.C11145l2;
import p120q.p326a.p329d0.p334e.p339e.C11147l3;
import p120q.p326a.p329d0.p334e.p339e.C11150l4;
import p120q.p326a.p329d0.p334e.p339e.C11154m;
import p120q.p326a.p329d0.p334e.p339e.C11158m0;
import p120q.p326a.p329d0.p334e.p339e.C11160m1;
import p120q.p326a.p329d0.p334e.p339e.C11162m2;
import p120q.p326a.p329d0.p334e.p339e.C11164m3;
import p120q.p326a.p329d0.p334e.p339e.C11166m4;
import p120q.p326a.p329d0.p334e.p339e.C11169n;
import p120q.p326a.p329d0.p334e.p339e.C11172n0;
import p120q.p326a.p329d0.p334e.p339e.C11174n1;
import p120q.p326a.p329d0.p334e.p339e.C11190n2;
import p120q.p326a.p329d0.p334e.p339e.C11191n3;
import p120q.p326a.p329d0.p334e.p339e.C11194n4;
import p120q.p326a.p329d0.p334e.p339e.C11196o;
import p120q.p326a.p329d0.p334e.p339e.C11199o0;
import p120q.p326a.p329d0.p334e.p339e.C11200o1;
import p120q.p326a.p329d0.p334e.p339e.C11205o3;
import p120q.p326a.p329d0.p334e.p339e.C11208p;
import p120q.p326a.p329d0.p334e.p339e.C11216p1;
import p120q.p326a.p329d0.p334e.p339e.C11218p2;
import p120q.p326a.p329d0.p334e.p339e.C11220p3;
import p120q.p326a.p329d0.p334e.p339e.C11222q;
import p120q.p326a.p329d0.p334e.p339e.C11225q0;
import p120q.p326a.p329d0.p334e.p339e.C11227q1;
import p120q.p326a.p329d0.p334e.p339e.C11229q2;
import p120q.p326a.p329d0.p334e.p339e.C11231q3;
import p120q.p326a.p329d0.p334e.p339e.C11235r0;
import p120q.p326a.p329d0.p334e.p339e.C11237r1;
import p120q.p326a.p329d0.p334e.p339e.C11238r2;
import p120q.p326a.p329d0.p334e.p339e.C11241r3;
import p120q.p326a.p329d0.p334e.p339e.C11243s;
import p120q.p326a.p329d0.p334e.p339e.C11245s0;
import p120q.p326a.p329d0.p334e.p339e.C11246s1;
import p120q.p326a.p329d0.p334e.p339e.C11248s2;
import p120q.p326a.p329d0.p334e.p339e.C11265s3;
import p120q.p326a.p329d0.p334e.p339e.C11268t;
import p120q.p326a.p329d0.p334e.p339e.C11271t0;
import p120q.p326a.p329d0.p334e.p339e.C11272t1;
import p120q.p326a.p329d0.p334e.p339e.C11274t2;
import p120q.p326a.p329d0.p334e.p339e.C11276t3;
import p120q.p326a.p329d0.p334e.p339e.C11278u;
import p120q.p326a.p329d0.p334e.p339e.C11283u0;
import p120q.p326a.p329d0.p334e.p339e.C11285u1;
import p120q.p326a.p329d0.p334e.p339e.C11286u2;
import p120q.p326a.p329d0.p334e.p339e.C11288u3;
import p120q.p326a.p329d0.p334e.p339e.C11290v;
import p120q.p326a.p329d0.p334e.p339e.C11292v0;
import p120q.p326a.p329d0.p334e.p339e.C11295v1;
import p120q.p326a.p329d0.p334e.p339e.C11297v2;
import p120q.p326a.p329d0.p334e.p339e.C11300v3;
import p120q.p326a.p329d0.p334e.p339e.C11302w;
import p120q.p326a.p329d0.p334e.p339e.C11307w1;
import p120q.p326a.p329d0.p334e.p339e.C11309w2;
import p120q.p326a.p329d0.p334e.p339e.C11313w3;
import p120q.p326a.p329d0.p334e.p339e.C11315x;
import p120q.p326a.p329d0.p334e.p339e.C11317x0;
import p120q.p326a.p329d0.p334e.p339e.C11320x1;
import p120q.p326a.p329d0.p334e.p339e.C11322x2;
import p120q.p326a.p329d0.p334e.p339e.C11327x3;
import p120q.p326a.p329d0.p334e.p339e.C11329y;
import p120q.p326a.p329d0.p334e.p339e.C11331y0;
import p120q.p326a.p329d0.p334e.p339e.C11334y1;
import p120q.p326a.p329d0.p334e.p339e.C11337y2;
import p120q.p326a.p329d0.p334e.p339e.C11340y3;
import p120q.p326a.p329d0.p334e.p339e.C11347z0;
import p120q.p326a.p329d0.p334e.p339e.C11350z1;
import p120q.p326a.p329d0.p334e.p339e.C11353z2;
import p120q.p326a.p329d0.p334e.p339e.C11355z3;
import p120q.p326a.p329d0.p345j.C11427b;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p329d0.p345j.C11438l;
import p120q.p326a.p346e0.C11448a;
import p120q.p326a.p346e0.C11449b;
import p120q.p326a.p347f0.C11454d;
import p120q.p326a.p347f0.C11456f;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p349h0.C11461a;
import p120q.p326a.p349h0.C11470b;
import p415t.p416a.C12934a;

/* renamed from: q.a.n */
/* compiled from: Observable */
public abstract class C11482n<T> implements C11488s<T> {

    /* renamed from: q.a.n$a */
    /* compiled from: Observable */
    static /* synthetic */ class C11483a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30715a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                q.a.a[] r0 = p120q.p326a.C10837a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30715a = r0
                q.a.a r1 = p120q.p326a.C10837a.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30715a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.a.a r1 = p120q.p326a.C10837a.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30715a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.a.a r1 = p120q.p326a.C10837a.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30715a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.a.a r1 = p120q.p326a.C10837a.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.C11482n.C11483a.<clinit>():void");
        }
    }

    public static <T> C11482n<T> amb(Iterable<? extends C11488s<? extends T>> iterable) {
        C10910b.m36861a(iterable, "sources is null");
        return C11459a.m37519a(new C11074h((C11488s<? extends T>[]) null, iterable));
    }

    public static <T> C11482n<T> ambArray(C11488s<? extends T>... sVarArr) {
        C10910b.m36861a(sVarArr, "sources is null");
        int length = sVarArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(sVarArr[0]);
        }
        return C11459a.m37519a(new C11074h(sVarArr, (Iterable) null));
    }

    public static int bufferSize() {
        return C11460h.m37538d();
    }

    public static <T, R> C11482n<R> combineLatest(C10861o<? super Object[], ? extends R> oVar, int i, C11488s<? extends T>... sVarArr) {
        return combineLatest(sVarArr, oVar, i);
    }

    public static <T, R> C11482n<R> combineLatestDelayError(C11488s<? extends T>[] sVarArr, C10861o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(sVarArr, oVar, bufferSize());
    }

    public static <T> C11482n<T> concat(Iterable<? extends C11488s<? extends T>> iterable) {
        C10910b.m36861a(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(C10872a.m36822e(), bufferSize(), false);
    }

    public static <T> C11482n<T> concatArray(C11488s<? extends T>... sVarArr) {
        if (sVarArr.length == 0) {
            return empty();
        }
        if (sVarArr.length == 1) {
            return wrap(sVarArr[0]);
        }
        return C11459a.m37519a(new C11278u(fromArray(sVarArr), C10872a.m36822e(), bufferSize(), C11434i.BOUNDARY));
    }

    public static <T> C11482n<T> concatArrayDelayError(C11488s<? extends T>... sVarArr) {
        if (sVarArr.length == 0) {
            return empty();
        }
        if (sVarArr.length == 1) {
            return wrap(sVarArr[0]);
        }
        return concatDelayError(fromArray(sVarArr));
    }

    public static <T> C11482n<T> concatArrayEager(C11488s<? extends T>... sVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), sVarArr);
    }

    public static <T> C11482n<T> concatArrayEagerDelayError(C11488s<? extends T>... sVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), sVarArr);
    }

    public static <T> C11482n<T> concatDelayError(Iterable<? extends C11488s<? extends T>> iterable) {
        C10910b.m36861a(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> C11482n<T> concatEager(C11488s<? extends C11488s<? extends T>> sVar) {
        return concatEager(sVar, bufferSize(), bufferSize());
    }

    public static <T> C11482n<T> create(C11486q<T> qVar) {
        C10910b.m36861a(qVar, "source is null");
        return C11459a.m37519a(new C10994b0(qVar));
    }

    public static <T> C11482n<T> defer(Callable<? extends C11488s<? extends T>> callable) {
        C10910b.m36861a(callable, "supplier is null");
        return C11459a.m37519a(new C11033e0(callable));
    }

    private C11482n<T> doOnEach(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar, C10847a aVar2) {
        C10910b.m36861a(gVar, "onNext is null");
        C10910b.m36861a(gVar2, "onError is null");
        C10910b.m36861a(aVar, "onComplete is null");
        C10910b.m36861a(aVar2, "onAfterTerminate is null");
        return C11459a.m37519a(new C11172n0(this, gVar, gVar2, aVar, aVar2));
    }

    public static <T> C11482n<T> empty() {
        return C11459a.m37519a(C11245s0.f30068f);
    }

    public static <T> C11482n<T> error(Callable<? extends Throwable> callable) {
        C10910b.m36861a(callable, "errorSupplier is null");
        return C11459a.m37519a(new C11271t0(callable));
    }

    public static <T> C11482n<T> fromArray(T... tArr) {
        C10910b.m36861a(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        return C11459a.m37519a(new C10996b1(tArr));
    }

    public static <T> C11482n<T> fromCallable(Callable<? extends T> callable) {
        C10910b.m36861a(callable, "supplier is null");
        return C11459a.m37519a(new C11009c1(callable));
    }

    public static <T> C11482n<T> fromFuture(Future<? extends T> future) {
        C10910b.m36861a(future, "future is null");
        return C11459a.m37519a(new C11023d1(future, 0, (TimeUnit) null));
    }

    public static <T> C11482n<T> fromIterable(Iterable<? extends T> iterable) {
        C10910b.m36861a(iterable, "source is null");
        return C11459a.m37519a(new C11034e1(iterable));
    }

    public static <T> C11482n<T> fromPublisher(C12934a<? extends T> aVar) {
        C10910b.m36861a(aVar, "publisher is null");
        return C11459a.m37519a(new C11049f1(aVar));
    }

    public static <T> C11482n<T> generate(C10853g<C11458g<T>> gVar) {
        C10910b.m36861a(gVar, "generator is null");
        return generate(C10872a.m36825h(), C11174n1.m37107a(gVar), C10872a.m36821d());
    }

    public static C11482n<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, C11461a.m37546a());
    }

    public static C11482n<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, C11461a.m37546a());
    }

    public static <T> C11482n<T> just(T t) {
        C10910b.m36861a(t, "item is null");
        return C11459a.m37519a(new C11237r1(t));
    }

    public static <T> C11482n<T> merge(Iterable<? extends C11488s<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C10872a.m36822e(), false, i, i2);
    }

    public static <T> C11482n<T> mergeArray(int i, int i2, C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).flatMap(C10872a.m36822e(), false, i, i2);
    }

    public static <T> C11482n<T> mergeArrayDelayError(int i, int i2, C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).flatMap(C10872a.m36822e(), true, i, i2);
    }

    public static <T> C11482n<T> mergeDelayError(Iterable<? extends C11488s<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C10872a.m36822e(), true);
    }

    public static <T> C11482n<T> never() {
        return C11459a.m37519a(C10998b2.f29196f);
    }

    public static C11482n<Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        } else if (i2 == 0) {
            return empty();
        } else {
            if (i2 == 1) {
                return just(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C11459a.m37519a(new C11114j2(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public static C11482n<Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        } else if (j2 == 0) {
            return empty();
        } else {
            if (j2 == 1) {
                return just(Long.valueOf(j));
            }
            long j3 = (j2 - 1) + j;
            if (j <= 0 || j3 >= 0) {
                return C11459a.m37519a(new C11131k2(j, j2));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    public static <T> C11496w<Boolean> sequenceEqual(C11488s<? extends T> sVar, C11488s<? extends T> sVar2) {
        return sequenceEqual(sVar, sVar2, C10910b.m36862a(), bufferSize());
    }

    public static <T> C11482n<T> switchOnNext(C11488s<? extends C11488s<? extends T>> sVar, int i) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11191n3(sVar, C10872a.m36822e(), i, false));
    }

    public static <T> C11482n<T> switchOnNextDelayError(C11488s<? extends C11488s<? extends T>> sVar) {
        return switchOnNextDelayError(sVar, bufferSize());
    }

    private C11482n<T> timeout0(long j, TimeUnit timeUnit, C11488s<? extends T> sVar, C11491v vVar) {
        C10910b.m36861a(timeUnit, "timeUnit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11355z3(this, j, timeUnit, vVar, sVar));
    }

    public static C11482n<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, C11461a.m37546a());
    }

    public static <T> C11482n<T> unsafeCreate(C11488s<T> sVar) {
        C10910b.m36861a(sVar, "onSubscribe is null");
        if (!(sVar instanceof C11482n)) {
            return C11459a.m37519a(new C11065g1(sVar));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    public static <T, D> C11482n<T> using(Callable<? extends D> callable, C10861o<? super D, ? extends C11488s<? extends T>> oVar, C10853g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> C11482n<T> wrap(C11488s<T> sVar) {
        C10910b.m36861a(sVar, "source is null");
        if (sVar instanceof C11482n) {
            return C11459a.m37519a((C11482n) sVar);
        }
        return C11459a.m37519a(new C11065g1(sVar));
    }

    public static <T, R> C11482n<R> zip(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar) {
        C10910b.m36861a(oVar, "zipper is null");
        C10910b.m36861a(iterable, "sources is null");
        return C11459a.m37519a(new C11166m4((C11488s<? extends T>[]) null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> C11482n<R> zipArray(C10861o<? super Object[], ? extends R> oVar, boolean z, int i, C11488s<? extends T>... sVarArr) {
        if (sVarArr.length == 0) {
            return empty();
        }
        C10910b.m36861a(oVar, "zipper is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11166m4(sVarArr, (Iterable) null, oVar, i, z));
    }

    public static <T, R> C11482n<R> zipIterable(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar, boolean z, int i) {
        C10910b.m36861a(oVar, "zipper is null");
        C10910b.m36861a(iterable, "sources is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11166m4((C11488s<? extends T>[]) null, iterable, oVar, i, z));
    }

    public final C11496w<Boolean> all(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "predicate is null");
        return C11459a.m37524a(new C11060g(this, pVar));
    }

    public final C11482n<T> ambWith(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return ambArray(this, sVar);
    }

    public final C11496w<Boolean> any(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "predicate is null");
        return C11459a.m37524a(new C11105j(this, pVar));
    }

    /* renamed from: as */
    public final <R> R mo37257as(C11484o<T, ? extends R> oVar) {
        C10910b.m36861a(oVar, "converter is null");
        return oVar.mo37597a(this);
    }

    public final T blockingFirst() {
        C10923e eVar = new C10923e();
        subscribe(eVar);
        T a = eVar.mo36710a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(C10853g<? super T> gVar) {
        Iterator it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.mo8098a(it.next());
            } catch (Throwable th) {
                C9034a.m29708a(th);
                ((C10842c) it).dispose();
                throw C11435j.m37463a(th);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() {
        C10924f fVar = new C10924f();
        subscribe(fVar);
        T a = fVar.mo36710a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingLatest() {
        return new C11004c(this);
    }

    public final Iterable<T> blockingMostRecent(T t) {
        return new C11017d(this, t);
    }

    public final Iterable<T> blockingNext() {
        return new C11030e(this);
    }

    public final T blockingSingle() {
        T b = singleElement().mo37245b();
        if (b != null) {
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        C11126k.m37063a(this);
    }

    public final C11482n<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final C11482n<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final C11482n<T> cacheWithInitialCapacity(int i) {
        C10910b.m36858a(i, "initialCapacity");
        return C11459a.m37519a(new C11222q(this, i));
    }

    public final <U> C11482n<U> cast(Class<U> cls) {
        C10910b.m36861a(cls, "clazz is null");
        return map(C10872a.m36800a(cls));
    }

    public final <U> C11496w<U> collect(Callable<? extends U> callable, C10848b<? super U, ? super T> bVar) {
        C10910b.m36861a(callable, "initialValueSupplier is null");
        C10910b.m36861a(bVar, "collector is null");
        return C11459a.m37524a(new C11243s(this, callable, bVar));
    }

    public final <U> C11496w<U> collectInto(U u, C10848b<? super U, ? super T> bVar) {
        C10910b.m36861a(u, "initialValue is null");
        return collect(C10872a.m36814b(u), bVar);
    }

    public final <R> C11482n<R> compose(C11489t<? super T, ? extends R> tVar) {
        C10910b.m36861a(tVar, "composer is null");
        return wrap(tVar.mo37599a(this));
    }

    public final <R> C11482n<R> concatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    public final C10839b concatMapCompletable(C10861o<? super T, ? extends C11450f> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final C10839b concatMapCompletableDelayError(C10861o<? super T, ? extends C11450f> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> C11482n<R> concatMapDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> C11482n<R> concatMapEager(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> C11482n<R> concatMapEagerDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar, boolean z) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z);
    }

    public final <U> C11482n<U> concatMapIterable(C10861o<? super T, ? extends Iterable<? extends U>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10983a1(this, oVar));
    }

    public final <R> C11482n<R> concatMapMaybe(C10861o<? super T, ? extends C11480l<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> C11482n<R> concatMapMaybeDelayError(C10861o<? super T, ? extends C11480l<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> C11482n<R> concatMapSingle(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> C11482n<R> concatMapSingleDelayError(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final C11482n<T> concatWith(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return concat(this, (C11482n) sVar);
    }

    public final C11496w<Boolean> contains(Object obj) {
        C10910b.m36861a(obj, "element is null");
        return any(C10872a.m36812a(obj));
    }

    public final C11496w<Long> count() {
        return C11459a.m37524a(new C10981a0(this));
    }

    public final <U> C11482n<T> debounce(C10861o<? super T, ? extends C11488s<U>> oVar) {
        C10910b.m36861a(oVar, "debounceSelector is null");
        return C11459a.m37519a(new C11006c0(this, oVar));
    }

    public final C11482n<T> defaultIfEmpty(T t) {
        C10910b.m36861a(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    public final <U> C11482n<T> delay(C10861o<? super T, ? extends C11488s<U>> oVar) {
        C10910b.m36861a(oVar, "itemDelay is null");
        return flatMap(C11174n1.m37112b(oVar));
    }

    public final <U> C11482n<T> delaySubscription(C11488s<U> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return C11459a.m37519a(new C11062g0(this, sVar));
    }

    @Deprecated
    public final <T2> C11482n<T2> dematerialize() {
        return C11459a.m37519a(new C11077h0(this, C10872a.m36822e()));
    }

    public final C11482n<T> distinct() {
        return distinct(C10872a.m36822e(), C10872a.m36818c());
    }

    public final C11482n<T> distinctUntilChanged() {
        return distinctUntilChanged(C10872a.m36822e());
    }

    public final C11482n<T> doAfterNext(C10853g<? super T> gVar) {
        C10910b.m36861a(gVar, "onAfterNext is null");
        return C11459a.m37519a(new C11141l0(this, gVar));
    }

    public final C11482n<T> doAfterTerminate(C10847a aVar) {
        C10910b.m36861a(aVar, "onFinally is null");
        return doOnEach(C10872a.m36821d(), C10872a.m36821d(), C10872a.f28933c, aVar);
    }

    public final C11482n<T> doFinally(C10847a aVar) {
        C10910b.m36861a(aVar, "onFinally is null");
        return C11459a.m37519a(new C11158m0(this, aVar));
    }

    public final C11482n<T> doOnComplete(C10847a aVar) {
        return doOnEach(C10872a.m36821d(), C10872a.m36821d(), aVar, C10872a.f28933c);
    }

    public final C11482n<T> doOnDispose(C10847a aVar) {
        return doOnLifecycle(C10872a.m36821d(), aVar);
    }

    public final C11482n<T> doOnError(C10853g<? super Throwable> gVar) {
        C10853g d = C10872a.m36821d();
        C10847a aVar = C10872a.f28933c;
        return doOnEach(d, gVar, aVar, aVar);
    }

    public final C11482n<T> doOnLifecycle(C10853g<? super C10842c> gVar, C10847a aVar) {
        C10910b.m36861a(gVar, "onSubscribe is null");
        C10910b.m36861a(aVar, "onDispose is null");
        return C11459a.m37519a(new C11199o0(this, gVar, aVar));
    }

    public final C11482n<T> doOnNext(C10853g<? super T> gVar) {
        C10853g d = C10872a.m36821d();
        C10847a aVar = C10872a.f28933c;
        return doOnEach(gVar, d, aVar, aVar);
    }

    public final C11482n<T> doOnSubscribe(C10853g<? super C10842c> gVar) {
        return doOnLifecycle(gVar, C10872a.f28933c);
    }

    public final C11482n<T> doOnTerminate(C10847a aVar) {
        C10910b.m36861a(aVar, "onTerminate is null");
        return doOnEach(C10872a.m36821d(), C10872a.m36799a(aVar), aVar, C10872a.f28933c);
    }

    public final C11478j<T> elementAt(long j) {
        if (j >= 0) {
            return C11459a.m37517a(new C11225q0(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final C11496w<T> elementAtOrError(long j) {
        if (j >= 0) {
            return C11459a.m37524a(new C11235r0(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final C11482n<T> filter(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "predicate is null");
        return C11459a.m37519a(new C11283u0(this, pVar));
    }

    public final C11496w<T> first(T t) {
        return elementAt(0, t);
    }

    public final C11478j<T> firstElement() {
        return elementAt(0);
    }

    public final C11496w<T> firstOrError() {
        return elementAtOrError(0);
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return flatMap(oVar, false);
    }

    public final C10839b flatMapCompletable(C10861o<? super T, ? extends C11450f> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> C11482n<U> flatMapIterable(C10861o<? super T, ? extends Iterable<? extends U>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10983a1(this, oVar));
    }

    public final <R> C11482n<R> flatMapMaybe(C10861o<? super T, ? extends C11480l<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> C11482n<R> flatMapSingle(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final C10842c forEach(C10853g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final C10842c forEachWhile(C10862p<? super T> pVar) {
        return forEachWhile(pVar, C10872a.f28935e, C10872a.f28933c);
    }

    public final <K> C11482n<C11449b<K, T>> groupBy(C10861o<? super T, ? extends K> oVar) {
        return groupBy(oVar, C10872a.m36822e(), false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> C11482n<R> groupJoin(C11488s<? extends TRight> sVar, C10861o<? super T, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super T, ? super C11482n<TRight>, ? extends R> cVar) {
        C10910b.m36861a(sVar, "other is null");
        C10910b.m36861a(oVar, "leftEnd is null");
        C10910b.m36861a(oVar2, "rightEnd is null");
        C10910b.m36861a(cVar, "resultSelector is null");
        return C11459a.m37519a(new C11109j1(this, sVar, oVar, oVar2, cVar));
    }

    public final C11482n<T> hide() {
        return C11459a.m37519a(new C11129k1(this));
    }

    public final C10839b ignoreElements() {
        return C11459a.m37513a((C10839b) new C11160m1(this));
    }

    public final C11496w<Boolean> isEmpty() {
        return all(C10872a.m36811a());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> C11482n<R> join(C11488s<? extends TRight> sVar, C10861o<? super T, ? extends C11488s<TLeftEnd>> oVar, C10861o<? super TRight, ? extends C11488s<TRightEnd>> oVar2, C10849c<? super T, ? super TRight, ? extends R> cVar) {
        C10910b.m36861a(sVar, "other is null");
        C10910b.m36861a(oVar, "leftEnd is null");
        C10910b.m36861a(oVar2, "rightEnd is null");
        C10910b.m36861a(cVar, "resultSelector is null");
        return C11459a.m37519a(new C11227q1(this, sVar, oVar, oVar2, cVar));
    }

    public final C11496w<T> last(T t) {
        C10910b.m36861a(t, "defaultItem is null");
        return C11459a.m37524a(new C11272t1(this, t));
    }

    public final C11478j<T> lastElement() {
        return C11459a.m37517a(new C11246s1(this));
    }

    public final C11496w<T> lastOrError() {
        return C11459a.m37524a(new C11272t1(this, null));
    }

    public final <R> C11482n<R> lift(C11487r<? extends R, ? super T> rVar) {
        C10910b.m36861a(rVar, "lifter is null");
        return C11459a.m37519a(new C11285u1(this, rVar));
    }

    public final <R> C11482n<R> map(C10861o<? super T, ? extends R> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C11295v1(this, oVar));
    }

    public final C11482n<C11481m<T>> materialize() {
        return C11459a.m37519a(new C11320x1(this));
    }

    public final C11482n<T> mergeWith(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return merge(this, (C11482n) sVar);
    }

    public final C11482n<T> observeOn(C11491v vVar) {
        return observeOn(vVar, false, bufferSize());
    }

    public final <U> C11482n<U> ofType(Class<U> cls) {
        C10910b.m36861a(cls, "clazz is null");
        return filter(C10872a.m36817b(cls)).cast(cls);
    }

    public final C11482n<T> onErrorResumeNext(C10861o<? super Throwable, ? extends C11488s<? extends T>> oVar) {
        C10910b.m36861a(oVar, "resumeFunction is null");
        return C11459a.m37519a(new C11024d2(this, oVar, false));
    }

    public final C11482n<T> onErrorReturn(C10861o<? super Throwable, ? extends T> oVar) {
        C10910b.m36861a(oVar, "valueSupplier is null");
        return C11459a.m37519a(new C11036e2(this, oVar));
    }

    public final C11482n<T> onErrorReturnItem(T t) {
        C10910b.m36861a(t, "item is null");
        return onErrorReturn(C10872a.m36820c(t));
    }

    public final C11482n<T> onExceptionResumeNext(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "next is null");
        return C11459a.m37519a(new C11024d2(this, C10872a.m36820c(sVar), true));
    }

    public final C11482n<T> onTerminateDetach() {
        return C11459a.m37519a(new C11091i0(this));
    }

    public final C11448a<T> publish() {
        return C11051f2.m36995a(this);
    }

    public final C11478j<T> reduce(C10849c<T, T, T> cVar) {
        C10910b.m36861a(cVar, "reducer is null");
        return C11459a.m37517a(new C11145l2(this, cVar));
    }

    public final <R> C11496w<R> reduceWith(Callable<R> callable, C10849c<R, ? super T, R> cVar) {
        C10910b.m36861a(callable, "seedSupplier is null");
        C10910b.m36861a(cVar, "reducer is null");
        return C11459a.m37524a(new C11190n2(this, callable, cVar));
    }

    public final C11482n<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final C11482n<T> repeatUntil(C10851e eVar) {
        C10910b.m36861a(eVar, "stop is null");
        return C11459a.m37519a(new C11229q2(this, eVar));
    }

    public final C11482n<T> repeatWhen(C10861o<? super C11482n<Object>, ? extends C11488s<?>> oVar) {
        C10910b.m36861a(oVar, "handler is null");
        return C11459a.m37519a(new C11238r2(this, oVar));
    }

    public final C11448a<T> replay() {
        return C11248s2.m37180a(this);
    }

    public final C11482n<T> retry() {
        return retry(Long.MAX_VALUE, C10872a.m36816b());
    }

    public final C11482n<T> retryUntil(C10851e eVar) {
        C10910b.m36861a(eVar, "stop is null");
        return retry(Long.MAX_VALUE, C10872a.m36813a(eVar));
    }

    public final C11482n<T> retryWhen(C10861o<? super C11482n<Throwable>, ? extends C11488s<?>> oVar) {
        C10910b.m36861a(oVar, "handler is null");
        return C11459a.m37519a(new C11297v2(this, oVar));
    }

    public final void safeSubscribe(C11490u<? super T> uVar) {
        C10910b.m36861a(uVar, "observer is null");
        if (uVar instanceof C11454d) {
            subscribe(uVar);
        } else {
            subscribe(new C11454d(uVar));
        }
    }

    public final C11482n<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, C11461a.m37546a());
    }

    public final C11482n<T> scan(C10849c<T, T, T> cVar) {
        C10910b.m36861a(cVar, "accumulator is null");
        return C11459a.m37519a(new C11353z2(this, cVar));
    }

    public final <R> C11482n<R> scanWith(Callable<R> callable, C10849c<R, ? super T, R> cVar) {
        C10910b.m36861a(callable, "seedSupplier is null");
        C10910b.m36861a(cVar, "accumulator is null");
        return C11459a.m37519a(new C10988a3(this, callable, cVar));
    }

    public final C11482n<T> serialize() {
        return C11459a.m37519a(new C11026d3(this));
    }

    public final C11482n<T> share() {
        return publish().mo37210b();
    }

    public final C11496w<T> single(T t) {
        C10910b.m36861a(t, "defaultItem is null");
        return C11459a.m37524a(new C11055f3(this, t));
    }

    public final C11478j<T> singleElement() {
        return C11459a.m37517a(new C11038e3(this));
    }

    public final C11496w<T> singleOrError() {
        return C11459a.m37524a(new C11055f3(this, null));
    }

    public final C11482n<T> skip(long j) {
        if (j <= 0) {
            return C11459a.m37519a(this);
        }
        return C11459a.m37519a(new C11069g3(this, j));
    }

    public final C11482n<T> skipLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
        } else if (i == 0) {
            return C11459a.m37519a(this);
        } else {
            return C11459a.m37519a(new C11082h3(this, i));
        }
    }

    public final <U> C11482n<T> skipUntil(C11488s<U> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return C11459a.m37519a(new C11116j3(this, sVar));
    }

    public final C11482n<T> skipWhile(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "predicate is null");
        return C11459a.m37519a(new C11133k3(this, pVar));
    }

    public final C11482n<T> sorted() {
        return toList().mo37613d().map(C10872a.m36801a(C10872a.m36823f())).flatMapIterable(C10872a.m36822e());
    }

    public final C11482n<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final C11482n<T> startWithArray(T... tArr) {
        C11482n fromArray = fromArray(tArr);
        if (fromArray == empty()) {
            return C11459a.m37519a(this);
        }
        return concatArray(fromArray, this);
    }

    public final C10842c subscribe() {
        return subscribe(C10872a.m36821d(), C10872a.f28935e, C10872a.f28933c, C10872a.m36821d());
    }

    /* access modifiers changed from: protected */
    public abstract void subscribeActual(C11490u<? super T> uVar);

    public final C11482n<T> subscribeOn(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11147l3(this, vVar));
    }

    public final <E extends C11490u<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final C11482n<T> switchIfEmpty(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return C11459a.m37519a(new C11164m3(this, sVar));
    }

    public final <R> C11482n<R> switchMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final C10839b switchMapCompletable(C10861o<? super T, ? extends C11450f> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37513a((C10839b) new C10970d(this, oVar, false));
    }

    public final C10839b switchMapCompletableDelayError(C10861o<? super T, ? extends C11450f> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37513a((C10839b) new C10970d(this, oVar, true));
    }

    public final <R> C11482n<R> switchMapDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> C11482n<R> switchMapMaybe(C10861o<? super T, ? extends C11480l<? extends R>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10973e(this, oVar, false));
    }

    public final <R> C11482n<R> switchMapMaybeDelayError(C10861o<? super T, ? extends C11480l<? extends R>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10973e(this, oVar, true));
    }

    public final <R> C11482n<R> switchMapSingle(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10976f(this, oVar, false));
    }

    public final <R> C11482n<R> switchMapSingleDelayError(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C10976f(this, oVar, true));
    }

    public final C11482n<T> take(long j) {
        if (j >= 0) {
            return C11459a.m37519a(new C11205o3(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    public final C11482n<T> takeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
        } else if (i == 0) {
            return C11459a.m37519a(new C11143l1(this));
        } else {
            if (i == 1) {
                return C11459a.m37519a(new C11231q3(this));
            }
            return C11459a.m37519a(new C11220p3(this, i));
        }
    }

    public final <U> C11482n<T> takeUntil(C11488s<U> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return C11459a.m37519a(new C11265s3(this, sVar));
    }

    public final C11482n<T> takeWhile(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "predicate is null");
        return C11459a.m37519a(new C11288u3(this, pVar));
    }

    public final C11456f<T> test() {
        C11456f<T> fVar = new C11456f<>();
        subscribe(fVar);
        return fVar;
    }

    public final C11482n<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, C11461a.m37546a());
    }

    public final C11482n<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final C11482n<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, C11461a.m37546a(), false);
    }

    public final C11482n<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final C11482n<C11470b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C11461a.m37546a());
    }

    public final <V> C11482n<T> timeout(C10861o<? super T, ? extends C11488s<V>> oVar) {
        return timeout0((C11488s) null, oVar, (C11488s) null);
    }

    public final C11482n<C11470b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C11461a.m37546a());
    }

    /* renamed from: to */
    public final <R> R mo37550to(C10861o<? super C11482n<T>, R> oVar) {
        try {
            C10910b.m36861a(oVar, "converter is null");
            return oVar.apply(this);
        } catch (Throwable th) {
            C9034a.m29708a(th);
            throw C11435j.m37463a(th);
        }
    }

    public final C11460h<T> toFlowable(C10837a aVar) {
        C10946b bVar = new C10946b(this);
        int i = C11483a.f30715a[aVar.ordinal()];
        if (i == 1) {
            return bVar.mo37220b();
        }
        if (i == 2) {
            return bVar.mo37221c();
        }
        if (i == 3) {
            return bVar;
        }
        if (i != 4) {
            return bVar.mo37216a();
        }
        return C11459a.m37516a(new C10952e(bVar));
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new C10930l());
    }

    public final C11496w<List<T>> toList() {
        return toList(16);
    }

    public final <K> C11496w<Map<K, T>> toMap(C10861o<? super T, ? extends K> oVar) {
        C10910b.m36861a(oVar, "keySelector is null");
        return collect(C11438l.m37473a(), C10872a.m36796a(oVar));
    }

    public final <K> C11496w<Map<K, Collection<T>>> toMultimap(C10861o<? super T, ? extends K> oVar) {
        return toMultimap(oVar, C10872a.m36822e(), C11438l.m37473a(), C11427b.m37447d());
    }

    public final C11496w<List<T>> toSortedList() {
        return toSortedList(C10872a.m36824g());
    }

    public final C11482n<T> unsubscribeOn(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11027d4(this, vVar));
    }

    public final C11482n<C11482n<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    public final <U, R> C11482n<R> withLatestFrom(C11488s<? extends U> sVar, C10849c<? super T, ? super U, ? extends R> cVar) {
        C10910b.m36861a(sVar, "other is null");
        C10910b.m36861a(cVar, "combiner is null");
        return C11459a.m37519a(new C11135k4(this, cVar, sVar));
    }

    public final <U, R> C11482n<R> zipWith(Iterable<U> iterable, C10849c<? super T, ? super U, ? extends R> cVar) {
        C10910b.m36861a(iterable, "other is null");
        C10910b.m36861a(cVar, "zipper is null");
        return C11459a.m37519a(new C11194n4(this, iterable, cVar));
    }

    public static <T, R> C11482n<R> combineLatest(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> C11482n<R> combineLatestDelayError(C10861o<? super Object[], ? extends R> oVar, int i, C11488s<? extends T>... sVarArr) {
        return combineLatestDelayError(sVarArr, oVar, i);
    }

    public static <T> C11482n<T> concatArrayEager(int i, int i2, C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).concatMapEagerDelayError(C10872a.m36822e(), i, i2, false);
    }

    public static <T> C11482n<T> concatArrayEagerDelayError(int i, int i2, C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).concatMapEagerDelayError(C10872a.m36822e(), i, i2, true);
    }

    public static <T> C11482n<T> concatEager(C11488s<? extends C11488s<? extends T>> sVar, int i, int i2) {
        return wrap(sVar).concatMapEager(C10872a.m36822e(), i, i2);
    }

    public static C11482n<Long> interval(long j, long j2, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11200o1(Math.max(0, j), Math.max(0, j2), timeUnit, vVar));
    }

    public static C11482n<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, C11491v vVar) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C11491v vVar2 = vVar;
        if (j5 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j5);
        } else if (j5 == 0) {
            return empty().delay(j6, timeUnit2, vVar2);
        } else {
            long j7 = j + (j5 - 1);
            if (j <= 0 || j7 >= 0) {
                C10910b.m36861a(timeUnit2, "unit is null");
                C10910b.m36861a(vVar2, "scheduler is null");
                return C11459a.m37519a(new C11216p1(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, vVar));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    public static <T> C11482n<T> merge(Iterable<? extends C11488s<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C10872a.m36822e());
    }

    public static <T> C11482n<T> mergeArray(C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).flatMap(C10872a.m36822e(), sVarArr.length);
    }

    public static <T> C11482n<T> mergeArrayDelayError(C11488s<? extends T>... sVarArr) {
        return fromArray(sVarArr).flatMap(C10872a.m36822e(), true, sVarArr.length);
    }

    public static <T> C11482n<T> mergeDelayError(Iterable<? extends C11488s<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C10872a.m36822e(), true, i, i2);
    }

    public static <T> C11496w<Boolean> sequenceEqual(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar) {
        return sequenceEqual(sVar, sVar2, dVar, bufferSize());
    }

    public static <T> C11482n<T> switchOnNextDelayError(C11488s<? extends C11488s<? extends T>> sVar, int i) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C11191n3(sVar, C10872a.m36822e(), i, true));
    }

    public static C11482n<Long> timer(long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C10990a4(Math.max(j, 0), timeUnit, vVar));
    }

    public static <T, D> C11482n<T> using(Callable<? extends D> callable, C10861o<? super D, ? extends C11488s<? extends T>> oVar, C10853g<? super D> gVar, boolean z) {
        C10910b.m36861a(callable, "resourceSupplier is null");
        C10910b.m36861a(oVar, "sourceSupplier is null");
        C10910b.m36861a(gVar, "disposer is null");
        return C11459a.m37519a(new C11040e4(callable, oVar, gVar, z));
    }

    public final Iterable<T> blockingIterable(int i) {
        C10910b.m36858a(i, "bufferSize");
        return new C10992b(this, i);
    }

    public final void blockingSubscribe(C10853g<? super T> gVar) {
        C11126k.m37064a(this, gVar, C10872a.f28935e, C10872a.f28933c);
    }

    public final C11482n<List<T>> buffer(int i, int i2) {
        return buffer(i, i2, C11427b.m37446a());
    }

    public final <R> C11482n<R> concatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        if (!(this instanceof C10916e)) {
            return C11459a.m37519a(new C11278u(this, oVar, i, C11434i.IMMEDIATE));
        }
        Object call = ((C10916e) this).call();
        if (call == null) {
            return empty();
        }
        return C11337y2.m37295a(call, oVar);
    }

    public final C10839b concatMapCompletable(C10861o<? super T, ? extends C11450f> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "capacityHint");
        return C11459a.m37513a((C10839b) new C10961a(this, oVar, C11434i.IMMEDIATE, i));
    }

    public final C10839b concatMapCompletableDelayError(C10861o<? super T, ? extends C11450f> oVar, boolean z) {
        return concatMapCompletableDelayError(oVar, z, 2);
    }

    public final <R> C11482n<R> concatMapDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, boolean z) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        if (this instanceof C10916e) {
            Object call = ((C10916e) this).call();
            if (call == null) {
                return empty();
            }
            return C11337y2.m37295a(call, oVar);
        }
        return C11459a.m37519a(new C11278u(this, oVar, i, z ? C11434i.END : C11434i.BOUNDARY));
    }

    public final <R> C11482n<R> concatMapEager(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, int i2) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "maxConcurrency");
        C10910b.m36858a(i2, "prefetch");
        return C11459a.m37519a(new C11290v(this, oVar, C11434i.IMMEDIATE, i, i2));
    }

    public final <R> C11482n<R> concatMapEagerDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, int i2, boolean z) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "maxConcurrency");
        C10910b.m36858a(i2, "prefetch");
        return C11459a.m37519a(new C11290v(this, oVar, z ? C11434i.END : C11434i.BOUNDARY, i, i2));
    }

    public final <R> C11482n<R> concatMapMaybe(C10861o<? super T, ? extends C11480l<? extends R>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C10964b(this, oVar, C11434i.IMMEDIATE, i));
    }

    public final <R> C11482n<R> concatMapMaybeDelayError(C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
        return concatMapMaybeDelayError(oVar, z, 2);
    }

    public final <R> C11482n<R> concatMapSingle(C10861o<? super T, ? extends C10838a0<? extends R>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C10967c(this, oVar, C11434i.IMMEDIATE, i));
    }

    public final <R> C11482n<R> concatMapSingleDelayError(C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
        return concatMapSingleDelayError(oVar, z, 2);
    }

    public final <R> C11482n<R> dematerialize(C10861o<? super T, C11481m<R>> oVar) {
        C10910b.m36861a(oVar, "selector is null");
        return C11459a.m37519a(new C11077h0(this, oVar));
    }

    public final <K> C11482n<T> distinct(C10861o<? super T, K> oVar) {
        return distinct(oVar, C10872a.m36818c());
    }

    public final <K> C11482n<T> distinctUntilChanged(C10861o<? super T, K> oVar) {
        C10910b.m36861a(oVar, "keySelector is null");
        return C11459a.m37519a(new C11127k0(this, oVar, C10910b.m36862a()));
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, boolean z) {
        return flatMap(oVar, z, Integer.MAX_VALUE);
    }

    public final C10839b flatMapCompletable(C10861o<? super T, ? extends C11450f> oVar, boolean z) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37513a((C10839b) new C11317x0(this, oVar, z));
    }

    public final <R> C11482n<R> flatMapMaybe(C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C11331y0(this, oVar, z));
    }

    public final <R> C11482n<R> flatMapSingle(C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37519a(new C11347z0(this, oVar, z));
    }

    public final C10842c forEachWhile(C10862p<? super T> pVar, C10853g<? super Throwable> gVar) {
        return forEachWhile(pVar, gVar, C10872a.f28933c);
    }

    public final <K> C11482n<C11449b<K, T>> groupBy(C10861o<? super T, ? extends K> oVar, boolean z) {
        return groupBy(oVar, C10872a.m36822e(), z, bufferSize());
    }

    public final C11482n<T> observeOn(C11491v vVar, boolean z) {
        return observeOn(vVar, z, bufferSize());
    }

    public final <R> C11482n<R> publish(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar) {
        C10910b.m36861a(oVar, "selector is null");
        return C11459a.m37519a(new C11097i2(this, oVar));
    }

    public final C11482n<T> repeat(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was " + j);
        } else if (j == 0) {
            return empty();
        } else {
            return C11459a.m37519a(new C11218p2(this, j));
        }
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar) {
        C10910b.m36861a(oVar, "selector is null");
        return C11248s2.m37185a(C11174n1.m37101a(this), oVar);
    }

    public final C11482n<T> retry(C10850d<? super Integer, ? super Throwable> dVar) {
        C10910b.m36861a(dVar, "predicate is null");
        return C11459a.m37519a(new C11274t2(this, dVar));
    }

    public final C11482n<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, C11461a.m37546a(), z);
    }

    public final C11482n<T> sorted(Comparator<? super T> comparator) {
        C10910b.m36861a(comparator, "sortFunction is null");
        return toList().mo37613d().map(C10872a.m36801a(comparator)).flatMapIterable(C10872a.m36822e());
    }

    public final C11482n<T> startWith(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return concatArray(sVar, this);
    }

    public final C10842c subscribe(C10853g<? super T> gVar) {
        return subscribe(gVar, C10872a.f28935e, C10872a.f28933c, C10872a.m36821d());
    }

    public final <R> C11482n<R> switchMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "bufferSize");
        if (!(this instanceof C10916e)) {
            return C11459a.m37519a(new C11191n3(this, oVar, i, false));
        }
        Object call = ((C10916e) this).call();
        if (call == null) {
            return empty();
        }
        return C11337y2.m37295a(call, oVar);
    }

    public final <R> C11482n<R> switchMapDelayError(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "bufferSize");
        if (!(this instanceof C10916e)) {
            return C11459a.m37519a(new C11191n3(this, oVar, i, true));
        }
        Object call = ((C10916e) this).call();
        if (call == null) {
            return empty();
        }
        return C11337y2.m37295a(call, oVar);
    }

    public final C11482n<T> throttleFirst(long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11300v3(this, j, timeUnit, vVar));
    }

    public final C11482n<T> throttleLast(long j, TimeUnit timeUnit, C11491v vVar) {
        return sample(j, timeUnit, vVar);
    }

    public final C11482n<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, C11461a.m37546a(), z);
    }

    public final C11482n<T> throttleWithTimeout(long j, TimeUnit timeUnit, C11491v vVar) {
        return debounce(j, timeUnit, vVar);
    }

    public final C11482n<C11470b<T>> timeInterval(C11491v vVar) {
        return timeInterval(TimeUnit.MILLISECONDS, vVar);
    }

    public final <V> C11482n<T> timeout(C10861o<? super T, ? extends C11488s<V>> oVar, C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return timeout0((C11488s) null, oVar, sVar);
    }

    public final C11482n<C11470b<T>> timestamp(C11491v vVar) {
        return timestamp(TimeUnit.MILLISECONDS, vVar);
    }

    public final C11496w<List<T>> toList(int i) {
        C10910b.m36858a(i, "capacityHint");
        return C11459a.m37524a(new C11015c4(this, i));
    }

    public final C11496w<List<T>> toSortedList(Comparator<? super T> comparator) {
        C10910b.m36861a(comparator, "comparator is null");
        return toList().mo37610b(C10872a.m36801a(comparator));
    }

    public final C11482n<C11482n<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    public static <T, R> C11482n<R> combineLatest(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar, int i) {
        C10910b.m36861a(iterable, "sources is null");
        C10910b.m36861a(oVar, "combiner is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11268t((C11488s<? extends T>[]) null, iterable, oVar, i << 1, false));
    }

    public static <T, R> C11482n<R> combineLatestDelayError(C11488s<? extends T>[] sVarArr, C10861o<? super Object[], ? extends R> oVar, int i) {
        C10910b.m36858a(i, "bufferSize");
        C10910b.m36861a(oVar, "combiner is null");
        if (sVarArr.length == 0) {
            return empty();
        }
        return C11459a.m37519a(new C11268t(sVarArr, (Iterable) null, oVar, i << 1, true));
    }

    public static <T> C11482n<T> concat(C11488s<? extends C11488s<? extends T>> sVar) {
        return concat(sVar, bufferSize());
    }

    public static <T> C11482n<T> concatDelayError(C11488s<? extends C11488s<? extends T>> sVar) {
        return concatDelayError(sVar, bufferSize(), true);
    }

    public static <T> C11482n<T> concatEager(Iterable<? extends C11488s<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> C11482n<T> error(Throwable th) {
        C10910b.m36861a(th, "exception is null");
        return error((Callable<? extends Throwable>) C10872a.m36814b(th));
    }

    public static <T> C11482n<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C10910b.m36861a(future, "future is null");
        C10910b.m36861a(timeUnit, "unit is null");
        return C11459a.m37519a(new C11023d1(future, j, timeUnit));
    }

    public static <T> C11482n<T> just(T t, T t2) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        return fromArray(t, t2);
    }

    public static <T> C11482n<T> merge(Iterable<? extends C11488s<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C10872a.m36822e(), i);
    }

    public static <T> C11482n<T> mergeDelayError(Iterable<? extends C11488s<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C10872a.m36822e(), true, i);
    }

    public static <T> C11496w<Boolean> sequenceEqual(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C10850d<? super T, ? super T> dVar, int i) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(dVar, "isEqual is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37524a(new C11012c3(sVar, sVar2, dVar, i));
    }

    public final T blockingSingle(T t) {
        return single(t).mo37609b();
    }

    public final void blockingSubscribe(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2) {
        C11126k.m37064a(this, gVar, gVar2, C10872a.f28933c);
    }

    public final <U extends Collection<? super T>> C11482n<U> buffer(int i, int i2, Callable<U> callable) {
        C10910b.m36858a(i, "count");
        C10910b.m36858a(i2, "skip");
        C10910b.m36861a(callable, "bufferSupplier is null");
        return C11459a.m37519a(new C11138l(this, i, i2, callable));
    }

    public final C10839b concatMapCompletableDelayError(C10861o<? super T, ? extends C11450f> oVar, boolean z, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37513a((C10839b) new C10961a(this, oVar, z ? C11434i.END : C11434i.BOUNDARY, i));
    }

    public final <U> C11482n<U> concatMapIterable(C10861o<? super T, ? extends Iterable<? extends U>> oVar, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return concatMap(C11174n1.m37108a(oVar), i);
    }

    public final <R> C11482n<R> concatMapMaybeDelayError(C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C10964b(this, oVar, z ? C11434i.END : C11434i.BOUNDARY, i));
    }

    public final <R> C11482n<R> concatMapSingleDelayError(C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z, int i) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C10967c(this, oVar, z ? C11434i.END : C11434i.BOUNDARY, i));
    }

    public final C11482n<T> concatWith(C10838a0<? extends T> a0Var) {
        C10910b.m36861a(a0Var, "other is null");
        return C11459a.m37519a(new C11329y(this, a0Var));
    }

    public final C11482n<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, C11461a.m37546a());
    }

    public final C11482n<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, C11461a.m37546a(), false);
    }

    public final C11482n<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, C11461a.m37546a());
    }

    public final <K> C11482n<T> distinct(C10861o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        C10910b.m36861a(oVar, "keySelector is null");
        C10910b.m36861a(callable, "collectionSupplier is null");
        return C11459a.m37519a(new C11107j0(this, oVar, callable));
    }

    public final C11496w<T> elementAt(long j, T t) {
        if (j >= 0) {
            C10910b.m36861a(t, "defaultItem is null");
            return C11459a.m37524a(new C11235r0(this, j, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, boolean z, int i) {
        return flatMap(oVar, z, i, bufferSize());
    }

    public final <U, V> C11482n<V> flatMapIterable(C10861o<? super T, ? extends Iterable<? extends U>> oVar, C10849c<? super T, ? super U, ? extends V> cVar) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36861a(cVar, "resultSelector is null");
        return flatMap(C11174n1.m37108a(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final C10842c forEachWhile(C10862p<? super T> pVar, C10853g<? super Throwable> gVar, C10847a aVar) {
        C10910b.m36861a(pVar, "onNext is null");
        C10910b.m36861a(gVar, "onError is null");
        C10910b.m36861a(aVar, "onComplete is null");
        C10929k kVar = new C10929k(pVar, gVar, aVar);
        subscribe(kVar);
        return kVar;
    }

    public final <K, V> C11482n<C11449b<K, V>> groupBy(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final C11482n<T> mergeWith(C10838a0<? extends T> a0Var) {
        C10910b.m36861a(a0Var, "other is null");
        return C11459a.m37519a(new C10985a2(this, a0Var));
    }

    public final C11482n<T> observeOn(C11491v vVar, boolean z, int i) {
        C10910b.m36861a(vVar, "scheduler is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11010c2(this, vVar, z, i));
    }

    public final C11482n<T> onErrorResumeNext(C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "next is null");
        return onErrorResumeNext(C10872a.m36820c(sVar));
    }

    public final <R> C11496w<R> reduce(R r, C10849c<R, ? super T, R> cVar) {
        C10910b.m36861a(r, "seed is null");
        C10910b.m36861a(cVar, "reducer is null");
        return C11459a.m37524a(new C11162m2(this, r, cVar));
    }

    public final C11482n<T> sample(long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11309w2(this, j, timeUnit, vVar, false));
    }

    public final <R> C11482n<R> scan(R r, C10849c<R, ? super T, R> cVar) {
        C10910b.m36861a(r, "initialValue is null");
        return scanWith(C10872a.m36814b(r), cVar);
    }

    public final C11482n<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final C10842c subscribe(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, C10872a.f28933c, C10872a.m36821d());
    }

    public final C11482n<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final C11482n<T> takeUntil(C10862p<? super T> pVar) {
        C10910b.m36861a(pVar, "stopPredicate is null");
        return C11459a.m37519a(new C11276t3(this, pVar));
    }

    public final C11456f<T> test(boolean z) {
        C11456f<T> fVar = new C11456f<>();
        if (z) {
            fVar.dispose();
        }
        subscribe(fVar);
        return fVar;
    }

    public final C11482n<T> throttleLatest(long j, TimeUnit timeUnit, C11491v vVar) {
        return throttleLatest(j, timeUnit, vVar, false);
    }

    public final C11482n<C11470b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C11461a.m37546a());
    }

    public final C11482n<C11470b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C11461a.m37546a());
    }

    public final <K, V> C11496w<Map<K, V>> toMap(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2) {
        C10910b.m36861a(oVar, "keySelector is null");
        C10910b.m36861a(oVar2, "valueSelector is null");
        return collect(C11438l.m37473a(), C10872a.m36797a(oVar, oVar2));
    }

    public final C11482n<C11482n<T>> window(long j, long j2, int i) {
        C10910b.m36860a(j, "count");
        C10910b.m36860a(j2, "skip");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11057f4(this, j, j2, i));
    }

    public static <T> C11482n<T> concat(C11488s<? extends C11488s<? extends T>> sVar, int i) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "prefetch");
        return C11459a.m37519a(new C11278u(sVar, C10872a.m36822e(), i, C11434i.IMMEDIATE));
    }

    public static <T> C11482n<T> concatDelayError(C11488s<? extends C11488s<? extends T>> sVar, int i, boolean z) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "prefetch is null");
        return C11459a.m37519a(new C11278u(sVar, C10872a.m36822e(), i, z ? C11434i.END : C11434i.BOUNDARY));
    }

    public static <T> C11482n<T> concatEager(Iterable<? extends C11488s<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(C10872a.m36822e(), i, i2, false);
    }

    public static <T> C11482n<T> merge(C11488s<? extends C11488s<? extends T>> sVar) {
        C10910b.m36861a(sVar, "sources is null");
        return C11459a.m37519a(new C11292v0(sVar, C10872a.m36822e(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> C11482n<T> mergeDelayError(C11488s<? extends C11488s<? extends T>> sVar) {
        C10910b.m36861a(sVar, "sources is null");
        return C11459a.m37519a(new C11292v0(sVar, C10872a.m36822e(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> C11482n<T> switchOnNext(C11488s<? extends C11488s<? extends T>> sVar) {
        return switchOnNext(sVar, bufferSize());
    }

    private <U, V> C11482n<T> timeout0(C11488s<U> sVar, C10861o<? super T, ? extends C11488s<V>> oVar, C11488s<? extends T> sVar2) {
        C10910b.m36861a(oVar, "itemTimeoutIndicator is null");
        return C11459a.m37519a(new C11340y3(this, sVar, oVar, sVar2));
    }

    public static <T, R> C11482n<R> zip(C11488s<? extends C11488s<? extends T>> sVar, C10861o<? super Object[], ? extends R> oVar) {
        C10910b.m36861a(oVar, "zipper is null");
        C10910b.m36861a(sVar, "sources is null");
        return C11459a.m37519a(new C11002b4(sVar, 16).flatMap(C11174n1.m37114c(oVar)));
    }

    public final void blockingSubscribe(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar) {
        C11126k.m37064a(this, gVar, gVar2, aVar);
    }

    public final C11482n<T> debounce(long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11020d0(this, j, timeUnit, vVar));
    }

    public final C11482n<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, C11461a.m37546a(), z);
    }

    public final C11482n<T> delaySubscription(long j, TimeUnit timeUnit, C11491v vVar) {
        return delaySubscription(timer(j, timeUnit, vVar));
    }

    public final C11482n<T> distinctUntilChanged(C10850d<? super T, ? super T> dVar) {
        C10910b.m36861a(dVar, "comparer is null");
        return C11459a.m37519a(new C11127k0(this, C10872a.m36822e(), dVar));
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, boolean z, int i, int i2) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36858a(i, "maxConcurrency");
        C10910b.m36858a(i2, "bufferSize");
        if (!(this instanceof C10916e)) {
            return C11459a.m37519a(new C11292v0(this, oVar, z, i, i2));
        }
        Object call = ((C10916e) this).call();
        if (call == null) {
            return empty();
        }
        return C11337y2.m37295a(call, oVar);
    }

    public final <K, V> C11482n<C11449b<K, V>> groupBy(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, boolean z) {
        return groupBy(oVar, oVar2, z, bufferSize());
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, int i) {
        C10910b.m36861a(oVar, "selector is null");
        C10910b.m36858a(i, "bufferSize");
        return C11248s2.m37185a(C11174n1.m37102a(this, i), oVar);
    }

    public final C11482n<T> retry(long j) {
        return retry(j, C10872a.m36816b());
    }

    public final C11482n<T> skip(long j, TimeUnit timeUnit, C11491v vVar) {
        return skipUntil(timer(j, timeUnit, vVar));
    }

    public final C11482n<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, C11461a.m37550d(), false, bufferSize());
    }

    public final C11482n<T> startWith(T t) {
        C10910b.m36861a(t, "item is null");
        return concatArray(just(t), this);
    }

    public final C10842c subscribe(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar) {
        return subscribe(gVar, gVar2, aVar, C10872a.m36821d());
    }

    public final C11482n<T> take(long j, TimeUnit timeUnit, C11491v vVar) {
        return takeUntil(timer(j, timeUnit, vVar));
    }

    public final C11482n<T> throttleLatest(long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11313w3(this, j, timeUnit, vVar, z));
    }

    public final C11482n<C11470b<T>> timeInterval(TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11327x3(this, timeUnit, vVar));
    }

    public final C11482n<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, (C11488s) null, C11461a.m37546a());
    }

    public final C11482n<C11470b<T>> timestamp(TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return map(C10872a.m36802a(timeUnit, vVar));
    }

    public final <U extends Collection<? super T>> C11496w<U> toList(Callable<U> callable) {
        C10910b.m36861a(callable, "collectionSupplier is null");
        return C11459a.m37524a(new C11015c4(this, callable));
    }

    public final C11496w<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        C10910b.m36861a(comparator, "comparator is null");
        return toList(i).mo37610b(C10872a.m36801a(comparator));
    }

    public final <T1, T2, R> C11482n<R> withLatestFrom(C11488s<T1> sVar, C11488s<T2> sVar2, C10854h<? super T, ? super T1, ? super T2, R> hVar) {
        C10910b.m36861a(sVar, "o1 is null");
        C10910b.m36861a(sVar2, "o2 is null");
        C10910b.m36861a(hVar, "combiner is null");
        return withLatestFrom((C11488s<?>[]) new C11488s[]{sVar, sVar2}, C10872a.m36804a(hVar));
    }

    public final <U, R> C11482n<R> zipWith(C11488s<? extends U> sVar, C10849c<? super T, ? super U, ? extends R> cVar) {
        C10910b.m36861a(sVar, "other is null");
        return zip(this, sVar, cVar);
    }

    public static <T, S> C11482n<T> generate(Callable<S> callable, C10848b<S, C11458g<T>> bVar) {
        C10910b.m36861a(bVar, "generator is null");
        return generate(callable, C11174n1.m37106a(bVar), C10872a.m36821d());
    }

    public static C11482n<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, C11461a.m37546a());
    }

    public final T blockingFirst(T t) {
        C10923e eVar = new C10923e();
        subscribe(eVar);
        T a = eVar.mo36710a();
        return a != null ? a : t;
    }

    public final T blockingLast(T t) {
        C10924f fVar = new C10924f();
        subscribe(fVar);
        T a = fVar.mo36710a();
        return a != null ? a : t;
    }

    public final void blockingSubscribe(C11490u<? super T> uVar) {
        C11126k.m37065a(this, uVar);
    }

    public final C11482n<T> concatWith(C11480l<? extends T> lVar) {
        C10910b.m36861a(lVar, "other is null");
        return C11459a.m37519a(new C11315x(this, lVar));
    }

    public final C11482n<T> delay(long j, TimeUnit timeUnit, C11491v vVar) {
        return delay(j, timeUnit, vVar, false);
    }

    public final <K, V> C11482n<C11449b<K, V>> groupBy(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, boolean z, int i) {
        C10910b.m36861a(oVar, "keySelector is null");
        C10910b.m36861a(oVar2, "valueSelector is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11093i1(this, oVar, oVar2, i, z));
    }

    public final C11482n<T> mergeWith(C11480l<? extends T> lVar) {
        C10910b.m36861a(lVar, "other is null");
        return C11459a.m37519a(new C11350z1(this, lVar));
    }

    public final C11482n<T> retry(long j, C10862p<? super Throwable> pVar) {
        if (j >= 0) {
            C10910b.m36861a(pVar, "predicate is null");
            return C11459a.m37519a(new C11286u2(this, j, pVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    public final C11482n<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, C11461a.m37550d(), z, bufferSize());
    }

    public final C10842c subscribe(C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar, C10853g<? super C10842c> gVar3) {
        C10910b.m36861a(gVar, "onNext is null");
        C10910b.m36861a(gVar2, "onError is null");
        C10910b.m36861a(aVar, "onComplete is null");
        C10910b.m36861a(gVar3, "onSubscribe is null");
        C10933o oVar = new C10933o(gVar, gVar2, aVar, gVar3);
        subscribe(oVar);
        return oVar;
    }

    public final C11482n<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, C11461a.m37550d(), false, bufferSize());
    }

    public final C11482n<T> timeout(long j, TimeUnit timeUnit, C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return timeout0(j, timeUnit, sVar, C11461a.m37546a());
    }

    public final <K, V> C11496w<Map<K, Collection<V>>> toMultimap(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, C11438l.m37473a(), C11427b.m37447d());
    }

    public static <T> C11482n<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(vVar);
    }

    public static C11482n<Long> interval(long j, TimeUnit timeUnit, C11491v vVar) {
        return interval(j, j, timeUnit, vVar);
    }

    public static <T> C11482n<T> just(T t, T t2, T t3) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    public static <T> C11482n<T> merge(C11488s<? extends C11488s<? extends T>> sVar, int i) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "maxConcurrency");
        return C11459a.m37519a(new C11292v0(sVar, C10872a.m36822e(), false, i, bufferSize()));
    }

    public static <T> C11482n<T> mergeDelayError(C11488s<? extends C11488s<? extends T>> sVar, int i) {
        C10910b.m36861a(sVar, "sources is null");
        C10910b.m36858a(i, "maxConcurrency");
        return C11459a.m37519a(new C11292v0(sVar, C10872a.m36822e(), true, i, bufferSize()));
    }

    public final C11482n<T> delay(long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11044f0(this, j, timeUnit, vVar, z));
    }

    public final C11482n<T> doOnEach(C10853g<? super C11481m<T>> gVar) {
        C10910b.m36861a(gVar, "onNotification is null");
        return doOnEach(C10872a.m36819c(gVar), C10872a.m36815b(gVar), C10872a.m36795a(gVar), C10872a.f28933c);
    }

    public final C11482n<T> sample(long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37519a(new C11309w2(this, j, timeUnit, vVar, z));
    }

    public final C11482n<T> skipLast(long j, TimeUnit timeUnit, C11491v vVar) {
        return skipLast(j, timeUnit, vVar, false, bufferSize());
    }

    public final C11482n<T> takeLast(long j, long j2, TimeUnit timeUnit, C11491v vVar) {
        return takeLast(j, j2, timeUnit, vVar, false, bufferSize());
    }

    public final <K, V> C11496w<Map<K, V>> toMap(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        C10910b.m36861a(oVar, "keySelector is null");
        C10910b.m36861a(oVar2, "valueSelector is null");
        C10910b.m36861a(callable, "mapSupplier is null");
        return collect(callable, C10872a.m36797a(oVar, oVar2));
    }

    public final C11496w<List<T>> toSortedList(int i) {
        return toSortedList(C10872a.m36824g(), i);
    }

    public final <U, R> C11482n<R> zipWith(C11488s<? extends U> sVar, C10849c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return zip(this, sVar, cVar, z);
    }

    public static <T, R> C11482n<R> combineLatest(C11488s<? extends T>[] sVarArr, C10861o<? super Object[], ? extends R> oVar) {
        return combineLatest(sVarArr, oVar, bufferSize());
    }

    public static <T> C11482n<T> concat(C11488s<? extends T> sVar, C11488s<? extends T> sVar2) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return concatArray(sVar, sVar2);
    }

    public static <T, S> C11482n<T> generate(Callable<S> callable, C10848b<S, C11458g<T>> bVar, C10853g<? super S> gVar) {
        C10910b.m36861a(bVar, "generator is null");
        return generate(callable, C11174n1.m37106a(bVar), gVar);
    }

    public final <U extends Collection<? super T>> C11482n<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final C11482n<T> concatWith(C11450f fVar) {
        C10910b.m36861a(fVar, "other is null");
        return C11459a.m37519a(new C11302w(this, fVar));
    }

    public final C11482n<T> mergeWith(C11450f fVar) {
        C10910b.m36861a(fVar, "other is null");
        return C11459a.m37519a(new C11334y1(this, fVar));
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, int i, long j, TimeUnit timeUnit) {
        return replay(oVar, i, j, timeUnit, C11461a.m37546a());
    }

    public final C11482n<T> skipLast(long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        return skipLast(j, timeUnit, vVar, z, bufferSize());
    }

    public final C11482n<T> takeLast(long j, long j2, TimeUnit timeUnit, C11491v vVar, boolean z, int i) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        C10910b.m36858a(i, "bufferSize");
        if (j >= 0) {
            return C11459a.m37519a(new C11241r3(this, j, j2, timeUnit, vVar, i, z));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j);
    }

    public final C11482n<T> timeout(long j, TimeUnit timeUnit, C11491v vVar, C11488s<? extends T> sVar) {
        C10910b.m36861a(sVar, "other is null");
        return timeout0(j, timeUnit, sVar, vVar);
    }

    public final C11482n<C11482n<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, C11461a.m37546a(), bufferSize());
    }

    public final <U, R> C11482n<R> zipWith(C11488s<? extends U> sVar, C10849c<? super T, ? super U, ? extends R> cVar, boolean z, int i) {
        return zip(this, sVar, cVar, z, i);
    }

    public static <T, R> C11482n<R> combineLatest(C11488s<? extends T>[] sVarArr, C10861o<? super Object[], ? extends R> oVar, int i) {
        C10910b.m36861a(sVarArr, "sources is null");
        if (sVarArr.length == 0) {
            return empty();
        }
        C10910b.m36861a(oVar, "combiner is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11268t(sVarArr, (Iterable) null, oVar, i << 1, false));
    }

    public static <T, R> C11482n<R> combineLatestDelayError(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> C11496w<Boolean> sequenceEqual(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, int i) {
        return sequenceEqual(sVar, sVar2, C10910b.m36862a(), i);
    }

    public final C11482n<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, C11461a.m37546a(), C11427b.m37446a());
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, int i, long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(oVar, "selector is null");
        C10910b.m36858a(i, "bufferSize");
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37185a(C11174n1.m37103a(this, i, j, timeUnit, vVar), oVar);
    }

    public final C11482n<T> retry(C10862p<? super Throwable> pVar) {
        return retry(Long.MAX_VALUE, pVar);
    }

    public final C11482n<T> skipLast(long j, TimeUnit timeUnit, C11491v vVar, boolean z, int i) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11100i3(this, j, timeUnit, vVar, i << 1, z));
    }

    public final <K, V> C11496w<Map<K, Collection<V>>> toMultimap(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, C10861o<? super K, ? extends Collection<? super V>> oVar3) {
        C10910b.m36861a(oVar, "keySelector is null");
        C10910b.m36861a(oVar2, "valueSelector is null");
        C10910b.m36861a(callable, "mapSupplier is null");
        C10910b.m36861a(oVar3, "collectionFactory is null");
        return collect(callable, C10872a.m36798a(oVar, oVar2, oVar3));
    }

    public final C11482n<C11482n<T>> window(long j, long j2, TimeUnit timeUnit, C11491v vVar) {
        return window(j, j2, timeUnit, vVar, bufferSize());
    }

    public static <T, R> C11482n<R> combineLatestDelayError(Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar, int i) {
        C10910b.m36861a(iterable, "sources is null");
        C10910b.m36861a(oVar, "combiner is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11268t((C11488s<? extends T>[]) null, iterable, oVar, i << 1, true));
    }

    public static <T> C11482n<T> fromFuture(Future<? extends T> future, C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return fromFuture(future).subscribeOn(vVar);
    }

    public static <T, S> C11482n<T> generate(Callable<S> callable, C10849c<S, C11458g<T>, S> cVar) {
        return generate(callable, cVar, C10872a.m36821d());
    }

    public static <T> C11482n<T> merge(C11488s<? extends T> sVar, C11488s<? extends T> sVar2) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return fromArray(sVar, sVar2).flatMap(C10872a.m36822e(), false, 2);
    }

    public static <T> C11482n<T> mergeDelayError(C11488s<? extends T> sVar, C11488s<? extends T> sVar2) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return fromArray(sVar, sVar2).flatMap(C10872a.m36822e(), true, 2);
    }

    public static <T1, T2, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C10849c<? super T1, ? super T2, ? extends R> cVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return zipArray(C10872a.m36803a(cVar), false, bufferSize(), sVar, sVar2);
    }

    public final C11482n<List<T>> buffer(long j, long j2, TimeUnit timeUnit, C11491v vVar) {
        return buffer(j, j2, timeUnit, vVar, C11427b.m37446a());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [q.a.c0.o<? super T, ? extends q.a.s<V>>, q.a.c0.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <U, V> p120q.p326a.C11482n<T> delay(p120q.p326a.C11488s<U> r1, p120q.p326a.p328c0.C10861o<? super T, ? extends p120q.p326a.C11488s<V>> r2) {
        /*
            r0 = this;
            q.a.n r1 = r0.delaySubscription(r1)
            q.a.n r1 = r1.delay(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.C11482n.delay(q.a.s, q.a.c0.o):q.a.n");
    }

    public final <U> C11482n<T> sample(C11488s<U> sVar) {
        C10910b.m36861a(sVar, "sampler is null");
        return C11459a.m37519a(new C11322x2(this, sVar, false));
    }

    public final C11482n<T> timeout(long j, TimeUnit timeUnit, C11491v vVar) {
        return timeout0(j, timeUnit, (C11488s) null, vVar);
    }

    public final C11482n<C11482n<T>> window(long j, long j2, TimeUnit timeUnit, C11491v vVar, int i) {
        C10910b.m36860a(j, "timespan");
        long j3 = j2;
        C10910b.m36860a(j3, "timeskip");
        int i2 = i;
        C10910b.m36858a(i2, "bufferSize");
        C11491v vVar2 = vVar;
        C10910b.m36861a(vVar2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C10910b.m36861a(timeUnit2, "unit is null");
        return C11459a.m37519a(new C11119j4(this, j, j3, timeUnit2, vVar2, Long.MAX_VALUE, i2, false));
    }

    public final <T1, T2, T3, R> C11482n<R> withLatestFrom(C11488s<T1> sVar, C11488s<T2> sVar2, C11488s<T3> sVar3, C10855i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        C10910b.m36861a(sVar, "o1 is null");
        C10910b.m36861a(sVar2, "o2 is null");
        C10910b.m36861a(sVar3, "o3 is null");
        C10910b.m36861a(iVar, "combiner is null");
        return withLatestFrom((C11488s<?>[]) new C11488s[]{sVar, sVar2, sVar3}, C10872a.m36805a(iVar));
    }

    public static <T> C11482n<T> concat(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        return concatArray(sVar, sVar2, sVar3);
    }

    public static <T, S> C11482n<T> generate(Callable<S> callable, C10849c<S, C11458g<T>, S> cVar, C10853g<? super S> gVar) {
        C10910b.m36861a(callable, "initialState is null");
        C10910b.m36861a(cVar, "generator is null");
        C10910b.m36861a(gVar, "disposeState is null");
        return C11459a.m37519a(new C11079h1(callable, cVar, gVar));
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    public final <U extends Collection<? super T>> C11482n<U> buffer(long j, long j2, TimeUnit timeUnit, C11491v vVar, Callable<U> callable) {
        TimeUnit timeUnit2 = timeUnit;
        C10910b.m36861a(timeUnit2, "unit is null");
        C11491v vVar2 = vVar;
        C10910b.m36861a(vVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        C10910b.m36861a(callable2, "bufferSupplier is null");
        return C11459a.m37519a(new C11208p(this, j, j2, timeUnit2, vVar2, callable2, Integer.MAX_VALUE, false));
    }

    public final <U, V> C11482n<T> timeout(C11488s<U> sVar, C10861o<? super T, ? extends C11488s<V>> oVar) {
        C10910b.m36861a(sVar, "firstTimeoutIndicator is null");
        return timeout0(sVar, oVar, (C11488s) null);
    }

    public final C11482n<T> doOnEach(C11490u<? super T> uVar) {
        C10910b.m36861a(uVar, "observer is null");
        return doOnEach(C11174n1.m37113c(uVar), C11174n1.m37111b(uVar), C11174n1.m37105a(uVar), C10872a.f28933c);
    }

    public final <U> C11482n<T> sample(C11488s<U> sVar, boolean z) {
        C10910b.m36861a(sVar, "sampler is null");
        return C11459a.m37519a(new C11322x2(this, sVar, z));
    }

    public final void subscribe(C11490u<? super T> uVar) {
        C10910b.m36861a(uVar, "observer is null");
        try {
            C11490u<? super Object> a = C11459a.m37520a(this, uVar);
            C10910b.m36861a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C11459a.m37531b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static <T> C11482n<T> merge(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        return fromArray(sVar, sVar2, sVar3).flatMap(C10872a.m36822e(), false, 3);
    }

    public static <T> C11482n<T> mergeDelayError(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        return fromArray(sVar, sVar2, sVar3).flatMap(C10872a.m36822e(), true, 3);
    }

    public static <T1, T2, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C10849c<? super T1, ? super T2, ? extends R> cVar, boolean z) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return zipArray(C10872a.m36803a(cVar), z, bufferSize(), sVar, sVar2);
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, C10861o<? super Throwable, ? extends C11488s<? extends R>> oVar2, Callable<? extends C11488s<? extends R>> callable) {
        C10910b.m36861a(oVar, "onNextMapper is null");
        C10910b.m36861a(oVar2, "onErrorMapper is null");
        C10910b.m36861a(callable, "onCompleteSupplier is null");
        return merge(new C11307w1(this, oVar, oVar2, callable));
    }

    public final C11482n<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, C11461a.m37550d(), false, bufferSize());
    }

    public final <U, V> C11482n<T> timeout(C11488s<U> sVar, C10861o<? super T, ? extends C11488s<V>> oVar, C11488s<? extends T> sVar2) {
        C10910b.m36861a(sVar, "firstTimeoutIndicator is null");
        C10910b.m36861a(sVar2, "other is null");
        return timeout0(sVar, oVar, sVar2);
    }

    public final C11482n<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, C11461a.m37550d(), z, bufferSize());
    }

    public final <K, V> C11496w<Map<K, Collection<V>>> toMultimap(C10861o<? super T, ? extends K> oVar, C10861o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, C11427b.m37447d());
    }

    public static <T1, T2, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C10849c<? super T1, ? super T2, ? extends R> cVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return combineLatest(C10872a.m36803a(cVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2});
    }

    public static <T> C11482n<T> concat(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3, C11488s<? extends T> sVar4) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        return concatArray(sVar, sVar2, sVar3, sVar4);
    }

    public final C11482n<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, C11461a.m37546a(), Integer.MAX_VALUE);
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, int i, C11491v vVar) {
        C10910b.m36861a(oVar, "selector is null");
        C10910b.m36861a(vVar, "scheduler is null");
        C10910b.m36858a(i, "bufferSize");
        return C11248s2.m37185a(C11174n1.m37102a(this, i), C11174n1.m37110a(oVar, vVar));
    }

    public final C11482n<T> takeLast(long j, TimeUnit timeUnit, C11491v vVar) {
        return takeLast(j, timeUnit, vVar, false, bufferSize());
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    public static <T1, T2, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C10849c<? super T1, ? super T2, ? extends R> cVar, boolean z, int i) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        return zipArray(C10872a.m36803a(cVar), z, i, sVar, sVar2);
    }

    public final C11482n<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, C11461a.m37546a(), i);
    }

    public final C11482n<T> takeLast(long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        return takeLast(j, timeUnit, vVar, z, bufferSize());
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, C11461a.m37546a(), Long.MAX_VALUE, false);
    }

    public final <T1, T2, T3, T4, R> C11482n<R> withLatestFrom(C11488s<T1> sVar, C11488s<T2> sVar2, C11488s<T3> sVar3, C11488s<T4> sVar4, C10856j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        C10910b.m36861a(sVar, "o1 is null");
        C10910b.m36861a(sVar2, "o2 is null");
        C10910b.m36861a(sVar3, "o3 is null");
        C10910b.m36861a(sVar4, "o4 is null");
        C10910b.m36861a(jVar, "combiner is null");
        return withLatestFrom((C11488s<?>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4}, C10872a.m36806a(jVar));
    }

    public static <T> C11482n<T> merge(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3, C11488s<? extends T> sVar4) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        return fromArray(sVar, sVar2, sVar3, sVar4).flatMap(C10872a.m36822e(), false, 4);
    }

    public static <T> C11482n<T> mergeDelayError(C11488s<? extends T> sVar, C11488s<? extends T> sVar2, C11488s<? extends T> sVar3, C11488s<? extends T> sVar4) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        return fromArray(sVar, sVar2, sVar3, sVar4).flatMap(C10872a.m36822e(), true, 4);
    }

    public final C11482n<List<T>> buffer(long j, TimeUnit timeUnit, C11491v vVar, int i) {
        return buffer(j, timeUnit, vVar, i, C11427b.m37446a(), false);
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, C10861o<Throwable, ? extends C11488s<? extends R>> oVar2, Callable<? extends C11488s<? extends R>> callable, int i) {
        C10910b.m36861a(oVar, "onNextMapper is null");
        C10910b.m36861a(oVar2, "onErrorMapper is null");
        C10910b.m36861a(callable, "onCompleteSupplier is null");
        return merge(new C11307w1(this, oVar, oVar2, callable), i);
    }

    public final C11482n<T> takeLast(long j, TimeUnit timeUnit, C11491v vVar, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, vVar, z, i);
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, C11461a.m37546a(), j2, false);
    }

    public static <T1, T2, T3, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C10854h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        return combineLatest(C10872a.m36804a(hVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3});
    }

    public final <U extends Collection<? super T>> C11482n<U> buffer(long j, TimeUnit timeUnit, C11491v vVar, int i, Callable<U> callable, boolean z) {
        C10910b.m36861a(timeUnit, "unit is null");
        C11491v vVar2 = vVar;
        C10910b.m36861a(vVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        C10910b.m36861a(callable2, "bufferSupplier is null");
        int i2 = i;
        C10910b.m36858a(i2, "count");
        return C11459a.m37519a(new C11208p(this, j, j, timeUnit, vVar2, callable2, i2, z));
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, C11461a.m37546a(), j2, z);
    }

    public static <T1, T2, T3, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C10854h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        return zipArray(C10872a.m36804a(hVar), false, bufferSize(), sVar, sVar2, sVar3);
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, C11491v vVar) {
        return window(j, timeUnit, vVar, Long.MAX_VALUE, false);
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, C11491v vVar, long j2) {
        return window(j, timeUnit, vVar, j2, false);
    }

    public final <R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i) {
        return flatMap(oVar, false, i, bufferSize());
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, long j, TimeUnit timeUnit) {
        return replay(oVar, j, timeUnit, C11461a.m37546a());
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, C11491v vVar, long j2, boolean z) {
        return window(j, timeUnit, vVar, j2, z, bufferSize());
    }

    public static <T1, T2, T3, T4, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C10855i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        return combineLatest(C10872a.m36805a(iVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4});
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        C10910b.m36861a(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    public final <U, R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(oVar, "selector is null");
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37185a(C11174n1.m37104a(this, j, timeUnit, vVar), oVar);
    }

    public final C11482n<C11482n<T>> window(long j, TimeUnit timeUnit, C11491v vVar, long j2, boolean z, int i) {
        int i2 = i;
        C10910b.m36858a(i2, "bufferSize");
        C11491v vVar2 = vVar;
        C10910b.m36861a(vVar2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C10910b.m36861a(timeUnit2, "unit is null");
        long j3 = j2;
        C10910b.m36860a(j3, "count");
        return C11459a.m37519a(new C11119j4(this, j, j, timeUnit2, vVar2, j3, i2, z));
    }

    public static <T1, T2, T3, T4, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C10855i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        return zipArray(C10872a.m36805a(iVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4);
    }

    public final C11482n<List<T>> buffer(long j, TimeUnit timeUnit, C11491v vVar) {
        return buffer(j, timeUnit, vVar, Integer.MAX_VALUE, C11427b.m37446a(), false);
    }

    public final <U, R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return flatMap(oVar, cVar, z, bufferSize(), bufferSize());
    }

    public final <R> C11482n<R> withLatestFrom(C11488s<?>[] sVarArr, C10861o<? super Object[], R> oVar) {
        C10910b.m36861a(sVarArr, "others is null");
        C10910b.m36861a(oVar, "combiner is null");
        return C11459a.m37519a(new C11150l4(this, sVarArr, oVar));
    }

    public final <TOpening, TClosing> C11482n<List<T>> buffer(C11488s<? extends TOpening> sVar, C10861o<? super TOpening, ? extends C11488s<? extends TClosing>> oVar) {
        return buffer(sVar, oVar, C11427b.m37446a());
    }

    public final <U, R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar, boolean z, int i) {
        return flatMap(oVar, cVar, z, i, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> C11482n<U> buffer(C11488s<? extends TOpening> sVar, C10861o<? super TOpening, ? extends C11488s<? extends TClosing>> oVar, Callable<U> callable) {
        C10910b.m36861a(sVar, "openingIndicator is null");
        C10910b.m36861a(oVar, "closingIndicator is null");
        C10910b.m36861a(callable, "bufferSupplier is null");
        return C11459a.m37519a(new C11154m(this, sVar, oVar, callable));
    }

    public final <U, R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar, boolean z, int i, int i2) {
        C10910b.m36861a(oVar, "mapper is null");
        C10910b.m36861a(cVar, "combiner is null");
        return flatMap(C11174n1.m37109a(oVar, cVar), z, i, i2);
    }

    public final <R> C11482n<R> replay(C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar, C11491v vVar) {
        C10910b.m36861a(oVar, "selector is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37185a(C11174n1.m37101a(this), C11174n1.m37110a(oVar, vVar));
    }

    public final <R> C11482n<R> withLatestFrom(Iterable<? extends C11488s<?>> iterable, C10861o<? super Object[], R> oVar) {
        C10910b.m36861a(iterable, "others is null");
        C10910b.m36861a(oVar, "combiner is null");
        return C11459a.m37519a(new C11150l4(this, iterable, oVar));
    }

    public static <T1, T2, T3, T4, T5, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C10856j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        return combineLatest(C10872a.m36806a(jVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4, sVar5});
    }

    public final <B> C11482n<C11482n<T>> window(C11488s<B> sVar) {
        return window(sVar, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C10856j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        return zipArray(C10872a.m36806a(jVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4, sVar5);
    }

    public final <U, R> C11482n<R> flatMap(C10861o<? super T, ? extends C11488s<? extends U>> oVar, C10849c<? super T, ? super U, ? extends R> cVar, int i) {
        return flatMap(oVar, cVar, false, i, bufferSize());
    }

    public final <B> C11482n<C11482n<T>> window(C11488s<B> sVar, int i) {
        C10910b.m36861a(sVar, "boundary is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11071g4(this, sVar, i));
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        C10910b.m36861a(t6, "item6 is null");
        C10910b.m36861a(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    public final <B> C11482n<List<T>> buffer(C11488s<B> sVar) {
        return buffer(sVar, C11427b.m37446a());
    }

    public final <B> C11482n<List<T>> buffer(C11488s<B> sVar, int i) {
        C10910b.m36858a(i, "initialCapacity");
        return buffer(sVar, C10872a.m36794a(i));
    }

    public final C11448a<T> replay(int i) {
        C10910b.m36858a(i, "bufferSize");
        return C11248s2.m37181a(this, i);
    }

    public final <U, V> C11482n<C11482n<T>> window(C11488s<U> sVar, C10861o<? super U, ? extends C11488s<V>> oVar) {
        return window(sVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> C11482n<U> buffer(C11488s<B> sVar, Callable<U> callable) {
        C10910b.m36861a(sVar, "boundary is null");
        C10910b.m36861a(callable, "bufferSupplier is null");
        return C11459a.m37519a(new C11196o(this, sVar, callable));
    }

    public final <U, V> C11482n<C11482n<T>> window(C11488s<U> sVar, C10861o<? super U, ? extends C11488s<V>> oVar, int i) {
        C10910b.m36861a(sVar, "openingIndicator is null");
        C10910b.m36861a(oVar, "closingIndicator is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11084h4(this, sVar, oVar, i));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C10857k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        return combineLatest(C10872a.m36807a(kVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6});
    }

    public final C11448a<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, C11461a.m37546a());
    }

    public static <T1, T2, T3, T4, T5, T6, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C10857k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        return zipArray(C10872a.m36807a(kVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4, sVar5, sVar6);
    }

    public final C11448a<T> replay(int i, long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36858a(i, "bufferSize");
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37183a(this, j, timeUnit, vVar, i);
    }

    public final <B> C11482n<List<T>> buffer(Callable<? extends C11488s<B>> callable) {
        return buffer(callable, C11427b.m37446a());
    }

    public final <B, U extends Collection<? super T>> C11482n<U> buffer(Callable<? extends C11488s<B>> callable, Callable<U> callable2) {
        C10910b.m36861a(callable, "boundarySupplier is null");
        C10910b.m36861a(callable2, "bufferSupplier is null");
        return C11459a.m37519a(new C11169n(this, callable, callable2));
    }

    public final <B> C11482n<C11482n<T>> window(Callable<? extends C11488s<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        C10910b.m36861a(t6, "item6 is null");
        C10910b.m36861a(t7, "item7 is null");
        C10910b.m36861a(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    public final <B> C11482n<C11482n<T>> window(Callable<? extends C11488s<B>> callable, int i) {
        C10910b.m36861a(callable, "boundary is null");
        C10910b.m36858a(i, "bufferSize");
        return C11459a.m37519a(new C11102i4(this, callable, i));
    }

    public final C11448a<T> replay(int i, C11491v vVar) {
        C10910b.m36858a(i, "bufferSize");
        return C11248s2.m37179a(replay(i), vVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C10858l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        return combineLatest(C10872a.m36808a(lVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7});
    }

    public final C11448a<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, C11461a.m37546a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C10858l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        return zipArray(C10872a.m36808a(lVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7);
    }

    public final C11448a<T> replay(long j, TimeUnit timeUnit, C11491v vVar) {
        C10910b.m36861a(timeUnit, "unit is null");
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37182a(this, j, timeUnit, vVar);
    }

    public final C11448a<T> replay(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11248s2.m37179a(replay(), vVar);
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        C10910b.m36861a(t6, "item6 is null");
        C10910b.m36861a(t7, "item7 is null");
        C10910b.m36861a(t8, "item8 is null");
        C10910b.m36861a(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C11488s<? extends T8> sVar8, C10859m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        C10910b.m36861a(sVar8, "source8 is null");
        return combineLatest(C10872a.m36809a(mVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C11488s<? extends T8> sVar8, C10859m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        C10910b.m36861a(sVar8, "source8 is null");
        return zipArray(C10872a.m36809a(mVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8);
    }

    public static <T> C11482n<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C10910b.m36861a(t, "item1 is null");
        C10910b.m36861a(t2, "item2 is null");
        C10910b.m36861a(t3, "item3 is null");
        C10910b.m36861a(t4, "item4 is null");
        C10910b.m36861a(t5, "item5 is null");
        C10910b.m36861a(t6, "item6 is null");
        C10910b.m36861a(t7, "item7 is null");
        C10910b.m36861a(t8, "item8 is null");
        C10910b.m36861a(t9, "item9 is null");
        C10910b.m36861a(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C11482n<R> combineLatest(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C11488s<? extends T8> sVar8, C11488s<? extends T9> sVar9, C10860n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        C10910b.m36861a(sVar8, "source8 is null");
        C10910b.m36861a(sVar9, "source9 is null");
        return combineLatest(C10872a.m36810a(nVar), bufferSize(), (C11488s<? extends T>[]) new C11488s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C11482n<R> zip(C11488s<? extends T1> sVar, C11488s<? extends T2> sVar2, C11488s<? extends T3> sVar3, C11488s<? extends T4> sVar4, C11488s<? extends T5> sVar5, C11488s<? extends T6> sVar6, C11488s<? extends T7> sVar7, C11488s<? extends T8> sVar8, C11488s<? extends T9> sVar9, C10860n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C10910b.m36861a(sVar, "source1 is null");
        C10910b.m36861a(sVar2, "source2 is null");
        C10910b.m36861a(sVar3, "source3 is null");
        C10910b.m36861a(sVar4, "source4 is null");
        C10910b.m36861a(sVar5, "source5 is null");
        C10910b.m36861a(sVar6, "source6 is null");
        C10910b.m36861a(sVar7, "source7 is null");
        C10910b.m36861a(sVar8, "source8 is null");
        C10910b.m36861a(sVar9, "source9 is null");
        return zipArray(C10872a.m36810a(nVar), false, bufferSize(), sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }
}
