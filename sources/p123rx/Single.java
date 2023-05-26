package p123rx;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p123rx.C5328b;
import p123rx.C5373h;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12492l;
import p123rx.p126m.C12495m;
import p123rx.p126m.C12496o;
import p123rx.p126m.C12497p;
import p123rx.p126m.C12498q;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.p401n.p402a.C12522c;
import p123rx.p401n.p402a.C12572i1;
import p123rx.p401n.p402a.C12579j1;
import p123rx.p401n.p402a.C12589k1;
import p123rx.p401n.p402a.C12607n1;
import p123rx.p401n.p402a.C12612o1;
import p123rx.p401n.p402a.C12622p1;
import p123rx.p401n.p402a.C12635q1;
import p123rx.p401n.p402a.C12644r1;
import p123rx.p401n.p402a.C12651s1;
import p123rx.p401n.p402a.C12660t1;
import p123rx.p401n.p402a.C12670u1;
import p123rx.p401n.p406e.C12784k;
import p123rx.p401n.p406e.C12792m;
import p123rx.p411q.C12844c;
import p123rx.p412r.C12869a;
import p123rx.schedulers.Schedulers;

/* renamed from: rx.Single */
public class Single<T> {

    /* renamed from: a */
    final C5327j<T> f9549a;

    /* renamed from: rx.Single$a */
    class C5315a extends C12474i<T> {

        /* renamed from: g */
        final /* synthetic */ C5378b f9550g;

        /* renamed from: h */
        final /* synthetic */ C5378b f9551h;

        C5315a(Single single, C5378b bVar, C5378b bVar2) {
            this.f9550g = bVar;
            this.f9551h = bVar2;
        }

        /* renamed from: a */
        public final void mo18573a(T t) {
            try {
                this.f9551h.call(t);
            } finally {
                unsubscribe();
            }
        }

        public final void onError(Throwable th) {
            try {
                this.f9550g.call(th);
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: rx.Single$b */
    class C5316b implements C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ C5373h f9552f;

        /* renamed from: rx.Single$b$a */
        class C5317a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12474i f9554f;

            /* renamed from: g */
            final /* synthetic */ C5373h.C5374a f9555g;

            /* renamed from: rx.Single$b$a$a */
            class C5318a extends C12474i<T> {
                C5318a() {
                }

                /* renamed from: a */
                public void mo18573a(T t) {
                    try {
                        C5317a.this.f9554f.mo18573a(t);
                    } finally {
                        C5317a.this.f9555g.unsubscribe();
                    }
                }

                public void onError(Throwable th) {
                    try {
                        C5317a.this.f9554f.onError(th);
                    } finally {
                        C5317a.this.f9555g.unsubscribe();
                    }
                }
            }

            C5317a(C12474i iVar, C5373h.C5374a aVar) {
                this.f9554f = iVar;
                this.f9555g = aVar;
            }

            public void call() {
                C5318a aVar = new C5318a();
                this.f9554f.mo40654b(aVar);
                Single.this.mo18560a(aVar);
            }
        }

        C5316b(C5373h hVar) {
            this.f9552f = hVar;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            C5373h.C5374a createWorker = this.f9552f.createWorker();
            iVar.mo40654b(createWorker);
            createWorker.mo18710a(new C5317a(iVar, createWorker));
        }
    }

    /* renamed from: rx.Single$c */
    class C5319c implements C12495m<Single<T>> {
        C5319c(Single single) {
        }

        public Single<T> call() {
            return Single.m10120a((Throwable) new TimeoutException());
        }
    }

    /* renamed from: rx.Single$d */
    class C5320d implements C5378b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ C5378b f9558f;

        C5320d(Single single, C5378b bVar) {
            this.f9558f = bVar;
        }

        /* renamed from: a */
        public void call(Throwable th) {
            this.f9558f.call(th);
        }
    }

    /* renamed from: rx.Single$e */
    static class C5321e implements C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ Callable f9559f;

        C5321e(Callable callable) {
            this.f9559f = callable;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            try {
                ((Single) this.f9559f.call()).mo18560a(iVar);
            } catch (Throwable th) {
                C12472a.m40945c(th);
                iVar.onError(th);
            }
        }
    }

    /* renamed from: rx.Single$f */
    static class C5322f implements C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ Throwable f9560f;

        C5322f(Throwable th) {
            this.f9560f = th;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            iVar.onError(this.f9560f);
        }
    }

    /* renamed from: rx.Single$g */
    static class C5323g implements C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ Single f9561f;

        /* renamed from: rx.Single$g$a */
        class C5324a extends C12474i<Single<? extends T>> {

            /* renamed from: g */
            final /* synthetic */ C12474i f9562g;

            C5324a(C5323g gVar, C12474i iVar) {
                this.f9562g = iVar;
            }

            public void onError(Throwable th) {
                this.f9562g.onError(th);
            }

            /* renamed from: a */
            public void mo18573a(Single<? extends T> single) {
                single.mo18560a((C12474i<? super Object>) this.f9562g);
            }
        }

        C5323g(Single single) {
            this.f9561f = single;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            C5324a aVar = new C5324a(this, iVar);
            iVar.mo40654b(aVar);
            this.f9561f.mo18560a(aVar);
        }
    }

    /* renamed from: rx.Single$h */
    static class C5325h implements C12498q<R> {

        /* renamed from: a */
        final /* synthetic */ C12496o f9563a;

        C5325h(C12496o oVar) {
            this.f9563a = oVar;
        }

        public R call(Object... objArr) {
            return this.f9563a.call(objArr[0], objArr[1]);
        }
    }

    /* renamed from: rx.Single$i */
    static class C5326i implements C12498q<R> {

        /* renamed from: a */
        final /* synthetic */ C12497p f9564a;

        C5326i(C12497p pVar) {
            this.f9564a = pVar;
        }

        public R call(Object... objArr) {
            return this.f9564a.call(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* renamed from: rx.Single$j */
    public interface C5327j<T> extends C5378b<C12474i<? super T>> {
    }

    protected Single(C5327j<T> jVar) {
        this.f9549a = C12844c.m41403a(jVar);
    }

    /* renamed from: a */
    public static <T> Single<T> m10122a(C5327j<T> jVar) {
        return new Single<>(jVar);
    }

    /* renamed from: b */
    public static <T> Single<T> m10126b(Callable<? extends T> callable) {
        return m10122a(new C12589k1(callable));
    }

    /* renamed from: c */
    public final <R> C5368e<R> mo18568c(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        return C5368e.m10262g(m10125a(mo18569d(nVar)));
    }

    /* renamed from: d */
    public final <R> Single<R> mo18569d(C5379n<? super T, ? extends R> nVar) {
        return m10122a(new C12635q1(this, nVar));
    }

    /* renamed from: e */
    public final Single<T> mo18570e(C5379n<Throwable, ? extends Single<? extends T>> nVar) {
        return new Single<>(C12644r1.m41122a(this, nVar));
    }

    /* renamed from: f */
    public final Single<T> mo18571f(C5379n<Throwable, ? extends T> nVar) {
        return m10122a(new C12612o1(this.f9549a, nVar));
    }

    /* renamed from: g */
    public final Single<T> mo18572g(C5379n<C5368e<? extends Throwable>, ? extends C5368e<?>> nVar) {
        return mo18567c().mo18701m(nVar).mo18700m();
    }

    /* renamed from: a */
    private static <T> C5368e<T> m10125a(Single<T> single) {
        return C5368e.m10253b(new C12670u1(single.f9549a));
    }

    /* renamed from: b */
    public static <T> Single<T> m10127b(Single<? extends Single<? extends T>> single) {
        if (single instanceof C12784k) {
            return ((C12784k) single).mo40909h(C12792m.m41299b());
        }
        return m10122a(new C5323g(single));
    }

    /* renamed from: c */
    public final C5368e<T> mo18567c() {
        return m10125a(this);
    }

    /* renamed from: a */
    public static <T> Single<T> m10120a(Throwable th) {
        return m10122a(new C5322f(th));
    }

    /* renamed from: a */
    public static <T> Single<T> m10119a(T t) {
        return C12784k.m41287b(t);
    }

    /* renamed from: a */
    public static <T1, T2, R> Single<R> m10124a(Single<? extends T1> single, Single<? extends T2> single2, C12496o<? super T1, ? super T2, ? extends R> oVar) {
        return C12651s1.m41134a(new Single[]{single, single2}, new C5325h(oVar));
    }

    /* renamed from: b */
    public final C5328b mo18566b(C5379n<? super T, ? extends C5328b> nVar) {
        return C5328b.m10158a((C5328b.C5366w) new C12522c(this, nVar));
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> Single<R> m10123a(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, C12497p<? super T1, ? super T2, ? super T3, ? extends R> pVar) {
        return C12651s1.m41134a(new Single[]{single, single2, single3}, new C5326i(pVar));
    }

    /* renamed from: b */
    public final Single<T> mo18563b(C5373h hVar) {
        if (this instanceof C12784k) {
            return ((C12784k) this).mo40908c(hVar);
        }
        return m10122a(new C5316b(hVar));
    }

    /* renamed from: a */
    public final <R> Single<R> mo18559a(C5379n<? super T, ? extends Single<? extends R>> nVar) {
        if (this instanceof C12784k) {
            return ((C12784k) this).mo40909h(nVar);
        }
        return m10127b(mo18569d(nVar));
    }

    /* renamed from: b */
    public final C5328b mo18565b() {
        return C5328b.m10164b((Single<?>) this);
    }

    /* renamed from: a */
    public final Single<T> mo18556a(C5373h hVar) {
        if (this instanceof C12784k) {
            return ((C12784k) this).mo40908c(hVar);
        }
        if (hVar != null) {
            return m10122a(new C12607n1(this.f9549a, hVar));
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: b */
    public final Single<T> mo18564b(C5378b<? super T> bVar) {
        if (bVar != null) {
            return m10122a(new C12572i1(this, bVar, C12492l.m40956a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    /* renamed from: a */
    public final C5375k mo18561a(C5378b<? super T> bVar, C5378b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (bVar2 != null) {
            return mo18560a(new C5315a(this, bVar2, bVar));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: a */
    public final C5375k mo18560a(C12474i<? super T> iVar) {
        if (iVar != null) {
            try {
                C12844c.m41404a(this, this.f9549a).call(iVar);
                return C12844c.m41415b((C5375k) iVar);
            } catch (Throwable th) {
                C12472a.m40945c(th);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C12844c.m41421d(runtimeException);
                throw runtimeException;
            }
        } else {
            throw new IllegalArgumentException("te is null");
        }
    }

    /* renamed from: a */
    public final Single<T> mo18553a(long j, TimeUnit timeUnit) {
        return mo18554a(j, timeUnit, (Single) null, Schedulers.computation());
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [java.util.concurrent.Callable, rx.Single$c] */
    /* renamed from: a */
    public final Single<T> mo18554a(long j, TimeUnit timeUnit, Single<? extends T> single, C5373h hVar) {
        if (single == null) {
            single = m10121a(new C5319c(this));
        }
        return m10122a(new C12660t1(this.f9549a, j, timeUnit, hVar, single.f9549a));
    }

    /* renamed from: a */
    public final C12869a<T> mo18562a() {
        return C12869a.m41465a(this);
    }

    /* renamed from: a */
    public final Single<T> mo18558a(C5378b<Throwable> bVar) {
        if (bVar != null) {
            return m10122a(new C12572i1(this, C12492l.m40956a(), new C5320d(this, bVar)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    /* renamed from: a */
    public final Single<T> mo18557a(C5377a aVar) {
        return m10122a(new C12579j1(this.f9549a, aVar));
    }

    /* renamed from: a */
    public static <T> Single<T> m10121a(Callable<Single<T>> callable) {
        return m10122a(new C5321e(callable));
    }

    /* renamed from: a */
    public final Single<T> mo18555a(C5368e<?> eVar) {
        if (eVar != null) {
            return m10122a(new C12622p1(this, eVar));
        }
        throw null;
    }
}
