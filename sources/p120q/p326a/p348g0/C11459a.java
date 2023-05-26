package p120q.p326a.p348g0;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.CompositeException;
import p036io.reactivex.exceptions.MissingBackpressureException;
import p036io.reactivex.exceptions.OnErrorNotImplementedException;
import p036io.reactivex.exceptions.UndeliverableException;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11460h;
import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10851e;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p346e0.C11448a;
import p415t.p416a.C12935b;

/* renamed from: q.a.g0.a */
/* compiled from: RxJavaPlugins */
public final class C11459a {

    /* renamed from: a */
    static volatile C10853g<? super Throwable> f30658a;

    /* renamed from: b */
    static volatile C10861o<? super Runnable, ? extends Runnable> f30659b;

    /* renamed from: c */
    static volatile C10861o<? super Callable<C11491v>, ? extends C11491v> f30660c;

    /* renamed from: d */
    static volatile C10861o<? super Callable<C11491v>, ? extends C11491v> f30661d;

    /* renamed from: e */
    static volatile C10861o<? super Callable<C11491v>, ? extends C11491v> f30662e;

    /* renamed from: f */
    static volatile C10861o<? super Callable<C11491v>, ? extends C11491v> f30663f;

    /* renamed from: g */
    static volatile C10861o<? super C11491v, ? extends C11491v> f30664g;

    /* renamed from: h */
    static volatile C10861o<? super C11491v, ? extends C11491v> f30665h;

    /* renamed from: i */
    static volatile C10861o<? super C11491v, ? extends C11491v> f30666i;

    /* renamed from: j */
    static volatile C10861o<? super C11460h, ? extends C11460h> f30667j;

    /* renamed from: k */
    static volatile C10861o<? super C11482n, ? extends C11482n> f30668k;

    /* renamed from: l */
    static volatile C10861o<? super C11448a, ? extends C11448a> f30669l;

    /* renamed from: m */
    static volatile C10861o<? super C11478j, ? extends C11478j> f30670m;

    /* renamed from: n */
    static volatile C10861o<? super C11496w, ? extends C11496w> f30671n;

    /* renamed from: o */
    static volatile C10861o<? super C10839b, ? extends C10839b> f30672o;

    /* renamed from: p */
    static volatile C10849c<? super C11460h, ? super C12935b, ? extends C12935b> f30673p;

    /* renamed from: q */
    static volatile C10849c<? super C11478j, ? super C11479k, ? extends C11479k> f30674q;

    /* renamed from: r */
    static volatile C10849c<? super C11482n, ? super C11490u, ? extends C11490u> f30675r;

    /* renamed from: s */
    static volatile C10849c<? super C11496w, ? super C11498y, ? extends C11498y> f30676s;

    /* renamed from: t */
    static volatile C10849c<? super C10839b, ? super C10863d, ? extends C10863d> f30677t;

    /* renamed from: u */
    static volatile C10851e f30678u;

    /* renamed from: v */
    static volatile boolean f30679v;

    /* renamed from: a */
    public static boolean m37527a() {
        return f30679v;
    }

    /* renamed from: b */
    public static C11491v m37529b(Callable<C11491v> callable) {
        C10910b.m36861a(callable, "Scheduler Callable can't be null");
        C10861o<? super Callable<C11491v>, ? extends C11491v> oVar = f30660c;
        if (oVar == null) {
            return m37521a(callable);
        }
        return m37522a(oVar, callable);
    }

    /* renamed from: c */
    public static C11491v m37533c(Callable<C11491v> callable) {
        C10910b.m36861a(callable, "Scheduler Callable can't be null");
        C10861o<? super Callable<C11491v>, ? extends C11491v> oVar = f30662e;
        if (oVar == null) {
            return m37521a(callable);
        }
        return m37522a(oVar, callable);
    }

    /* renamed from: d */
    public static C11491v m37536d(Callable<C11491v> callable) {
        C10910b.m36861a(callable, "Scheduler Callable can't be null");
        C10861o<? super Callable<C11491v>, ? extends C11491v> oVar = f30663f;
        if (oVar == null) {
            return m37521a(callable);
        }
        return m37522a(oVar, callable);
    }

    /* renamed from: e */
    public static C11491v m37537e(Callable<C11491v> callable) {
        C10910b.m36861a(callable, "Scheduler Callable can't be null");
        C10861o<? super Callable<C11491v>, ? extends C11491v> oVar = f30661d;
        if (oVar == null) {
            return m37521a(callable);
        }
        return m37522a(oVar, callable);
    }

    /* renamed from: a */
    public static C11491v m37523a(C11491v vVar) {
        C10861o<? super C11491v, ? extends C11491v> oVar = f30664g;
        if (oVar == null) {
            return vVar;
        }
        return (C11491v) m37511a(oVar, vVar);
    }

    /* renamed from: a */
    static boolean m37528a(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m37531b(Throwable th) {
        C10853g<? super Throwable> gVar = f30658a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m37528a(th)) {
            th = new UndeliverableException(th);
        }
        if (gVar != null) {
            try {
                gVar.mo8098a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m37535c(th2);
            }
        }
        th.printStackTrace();
        m37535c(th);
    }

    /* renamed from: c */
    static void m37535c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: c */
    public static C11491v m37534c(C11491v vVar) {
        C10861o<? super C11491v, ? extends C11491v> oVar = f30665h;
        if (oVar == null) {
            return vVar;
        }
        return (C11491v) m37511a(oVar, vVar);
    }

    /* renamed from: a */
    public static Runnable m37512a(Runnable runnable) {
        C10910b.m36861a(runnable, "run is null");
        C10861o<? super Runnable, ? extends Runnable> oVar = f30659b;
        if (oVar == null) {
            return runnable;
        }
        return (Runnable) m37511a(oVar, runnable);
    }

    /* renamed from: a */
    public static <T> C12935b<? super T> m37526a(C11460h<T> hVar, C12935b<? super T> bVar) {
        C10849c<? super C11460h, ? super C12935b, ? extends C12935b> cVar = f30673p;
        return cVar != null ? (C12935b) m37510a(cVar, hVar, bVar) : bVar;
    }

    /* renamed from: b */
    public static C11491v m37530b(C11491v vVar) {
        C10861o<? super C11491v, ? extends C11491v> oVar = f30666i;
        if (oVar == null) {
            return vVar;
        }
        return (C11491v) m37511a(oVar, vVar);
    }

    /* renamed from: a */
    public static <T> C11490u<? super T> m37520a(C11482n<T> nVar, C11490u<? super T> uVar) {
        C10849c<? super C11482n, ? super C11490u, ? extends C11490u> cVar = f30675r;
        return cVar != null ? (C11490u) m37510a(cVar, nVar, uVar) : uVar;
    }

    /* renamed from: b */
    public static boolean m37532b() {
        C10851e eVar = f30678u;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo36654a();
        } catch (Throwable th) {
            throw C11435j.m37463a(th);
        }
    }

    /* renamed from: a */
    public static <T> C11498y<? super T> m37525a(C11496w<T> wVar, C11498y<? super T> yVar) {
        C10849c<? super C11496w, ? super C11498y, ? extends C11498y> cVar = f30676s;
        return cVar != null ? (C11498y) m37510a(cVar, wVar, yVar) : yVar;
    }

    /* renamed from: a */
    public static C10863d m37514a(C10839b bVar, C10863d dVar) {
        C10849c<? super C10839b, ? super C10863d, ? extends C10863d> cVar = f30677t;
        return cVar != null ? (C10863d) m37510a(cVar, bVar, dVar) : dVar;
    }

    /* renamed from: a */
    public static <T> C11479k<? super T> m37518a(C11478j<T> jVar, C11479k<? super T> kVar) {
        C10849c<? super C11478j, ? super C11479k, ? extends C11479k> cVar = f30674q;
        return cVar != null ? (C11479k) m37510a(cVar, jVar, kVar) : kVar;
    }

    /* renamed from: a */
    public static <T> C11478j<T> m37517a(C11478j<T> jVar) {
        C10861o<? super C11478j, ? extends C11478j> oVar = f30670m;
        return oVar != null ? (C11478j) m37511a(oVar, jVar) : jVar;
    }

    /* renamed from: a */
    public static <T> C11460h<T> m37516a(C11460h<T> hVar) {
        C10861o<? super C11460h, ? extends C11460h> oVar = f30667j;
        return oVar != null ? (C11460h) m37511a(oVar, hVar) : hVar;
    }

    /* renamed from: a */
    public static <T> C11482n<T> m37519a(C11482n<T> nVar) {
        C10861o<? super C11482n, ? extends C11482n> oVar = f30668k;
        return oVar != null ? (C11482n) m37511a(oVar, nVar) : nVar;
    }

    /* renamed from: a */
    public static <T> C11448a<T> m37515a(C11448a<T> aVar) {
        C10861o<? super C11448a, ? extends C11448a> oVar = f30669l;
        return oVar != null ? (C11448a) m37511a(oVar, aVar) : aVar;
    }

    /* renamed from: a */
    public static <T> C11496w<T> m37524a(C11496w<T> wVar) {
        C10861o<? super C11496w, ? extends C11496w> oVar = f30671n;
        return oVar != null ? (C11496w) m37511a(oVar, wVar) : wVar;
    }

    /* renamed from: a */
    public static C10839b m37513a(C10839b bVar) {
        C10861o<? super C10839b, ? extends C10839b> oVar = f30672o;
        return oVar != null ? (C10839b) m37511a(oVar, bVar) : bVar;
    }

    /* renamed from: a */
    static <T, R> R m37511a(C10861o<T, R> oVar, T t) {
        try {
            return oVar.apply(t);
        } catch (Throwable th) {
            throw C11435j.m37463a(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m37510a(C10849c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.mo7653a(t, u);
        } catch (Throwable th) {
            throw C11435j.m37463a(th);
        }
    }

    /* renamed from: a */
    static C11491v m37521a(Callable<C11491v> callable) {
        try {
            C11491v call = callable.call();
            C10910b.m36861a(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw C11435j.m37463a(th);
        }
    }

    /* renamed from: a */
    static C11491v m37522a(C10861o<? super Callable<C11491v>, ? extends C11491v> oVar, Callable<C11491v> callable) {
        Object a = m37511a(oVar, callable);
        C10910b.m36861a(a, "Scheduler Callable result can't be null");
        return (C11491v) a;
    }
}
