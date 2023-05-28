package p123rx.p401n.p406e;

import java.util.concurrent.atomic.AtomicBoolean;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p401n.p403b.C12707c;
import p123rx.p401n.p404c.C12715b;
import p123rx.p410p.C12839f;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.e.j */
/* compiled from: ScalarSynchronousObservable */
public final class C12775j<T> extends C5368e<T> {

    /* renamed from: h */
    static final boolean f32962h = Boolean.valueOf(System.getProperty("rx.just.strong-mode", AdultContentAnalytics.UNLOCK)).booleanValue();

    /* renamed from: g */
    final T f32963g;

    /* renamed from: rx.n.e.j$a */
    /* compiled from: ScalarSynchronousObservable */
    class C12776a implements C5379n<C5377a, C5375k> {

        /* renamed from: f */
        final /* synthetic */ C12715b f32964f;

        C12776a(C12775j jVar, C12715b bVar) {
            this.f32964f = bVar;
        }

        /* renamed from: a */
        public C5375k call(C5377a aVar) {
            return this.f32964f.mo40858a(aVar);
        }
    }

    /* renamed from: rx.n.e.j$b */
    /* compiled from: ScalarSynchronousObservable */
    class C12777b implements C5379n<C5377a, C5375k> {

        /* renamed from: f */
        final /* synthetic */ C5373h f32965f;

        /* renamed from: rx.n.e.j$b$a */
        /* compiled from: ScalarSynchronousObservable */
        class C12778a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C5377a f32966f;

            /* renamed from: g */
            final /* synthetic */ C5373h.C5374a f32967g;

            C12778a(C12777b bVar, C5377a aVar, C5373h.C5374a aVar2) {
                this.f32966f = aVar;
                this.f32967g = aVar2;
            }

            public void call() {
                try {
                    this.f32966f.call();
                } finally {
                    this.f32967g.unsubscribe();
                }
            }
        }

        C12777b(C12775j jVar, C5373h hVar) {
            this.f32965f = hVar;
        }

        /* renamed from: a */
        public C5375k call(C5377a aVar) {
            C5373h.C5374a createWorker = this.f32965f.createWorker();
            createWorker.mo18710a(new C12778a(this, aVar, createWorker));
            return createWorker;
        }
    }

    /* renamed from: rx.n.e.j$c */
    /* compiled from: ScalarSynchronousObservable */
    class C12779c implements C5368e.C5370a<R> {

        /* renamed from: f */
        final /* synthetic */ C5379n f32968f;

        C12779c(C5379n nVar) {
            this.f32968f = nVar;
        }

        /* renamed from: a */
        public void call(C12475j<? super R> jVar) {
            C5368e eVar = (C5368e) this.f32968f.call(C12775j.this.f32963g);
            if (eVar instanceof C12775j) {
                jVar.setProducer(C12775j.m41277a(jVar, ((C12775j) eVar).f32963g));
            } else {
                eVar.mo18668b(C12839f.m41394a(jVar));
            }
        }
    }

    /* renamed from: rx.n.e.j$d */
    /* compiled from: ScalarSynchronousObservable */
    static final class C12780d<T> implements C5368e.C5370a<T> {

        /* renamed from: f */
        final T f32970f;

        C12780d(T t) {
            this.f32970f = t;
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            jVar.setProducer(C12775j.m41277a(jVar, this.f32970f));
        }
    }

    /* renamed from: rx.n.e.j$e */
    /* compiled from: ScalarSynchronousObservable */
    static final class C12781e<T> implements C5368e.C5370a<T> {

        /* renamed from: f */
        final T f32971f;

        /* renamed from: g */
        final C5379n<C5377a, C5375k> f32972g;

        C12781e(T t, C5379n<C5377a, C5375k> nVar) {
            this.f32971f = t;
            this.f32972g = nVar;
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            jVar.setProducer(new C12782f(jVar, this.f32971f, this.f32972g));
        }
    }

    /* renamed from: rx.n.e.j$f */
    /* compiled from: ScalarSynchronousObservable */
    static final class C12782f<T> extends AtomicBoolean implements C12473g, C5377a {

        /* renamed from: f */
        final C12475j<? super T> f32973f;

        /* renamed from: g */
        final T f32974g;

        /* renamed from: h */
        final C5379n<C5377a, C5375k> f32975h;

        public C12782f(C12475j<? super T> jVar, T t, C5379n<C5377a, C5375k> nVar) {
            this.f32973f = jVar;
            this.f32974g = t;
            this.f32975h = nVar;
        }

        public void call() {
            C12475j<? super T> jVar = this.f32973f;
            if (!jVar.isUnsubscribed()) {
                T t = this.f32974g;
                try {
                    jVar.onNext(t);
                    if (!jVar.isUnsubscribed()) {
                        jVar.onCompleted();
                    }
                } catch (Throwable th) {
                    C12472a.m40940a(th, (C5372f<?>) jVar, (Object) t);
                }
            }
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0 && compareAndSet(false, true)) {
                this.f32973f.add(this.f32975h.call(this));
            }
        }

        public String toString() {
            return "ScalarAsyncProducer[" + this.f32974g + ", " + get() + "]";
        }
    }

    /* renamed from: rx.n.e.j$g */
    /* compiled from: ScalarSynchronousObservable */
    static final class C12783g<T> implements C12473g {

        /* renamed from: f */
        final C12475j<? super T> f32976f;

        /* renamed from: g */
        final T f32977g;

        /* renamed from: h */
        boolean f32978h;

        public C12783g(C12475j<? super T> jVar, T t) {
            this.f32976f = jVar;
            this.f32977g = t;
        }

        public void request(long j) {
            if (!this.f32978h) {
                if (j < 0) {
                    throw new IllegalStateException("n >= required but it was " + j);
                } else if (j != 0) {
                    this.f32978h = true;
                    C12475j<? super T> jVar = this.f32976f;
                    if (!jVar.isUnsubscribed()) {
                        T t = this.f32977g;
                        try {
                            jVar.onNext(t);
                            if (!jVar.isUnsubscribed()) {
                                jVar.onCompleted();
                            }
                        } catch (Throwable th) {
                            C12472a.m40940a(th, (C5372f<?>) jVar, (Object) t);
                        }
                    }
                }
            }
        }
    }

    protected C12775j(T t) {
        super(C12844c.m41407a(new C12780d(t)));
        this.f32963g = t;
    }

    /* renamed from: a */
    static <T> C12473g m41277a(C12475j<? super T> jVar, T t) {
        if (f32962h) {
            return new C12707c(jVar, t);
        }
        return new C12783g(jVar, t);
    }

    /* renamed from: d */
    public static <T> C12775j<T> m41278d(T t) {
        return new C12775j<>(t);
    }

    /* renamed from: c */
    public C5368e<T> mo40899c(C5373h hVar) {
        C5379n nVar;
        if (hVar instanceof C12715b) {
            nVar = new C12776a(this, (C12715b) hVar);
        } else {
            nVar = new C12777b(this, hVar);
        }
        return C5368e.m10253b(new C12781e(this.f32963g, nVar));
    }

    /* renamed from: o */
    public T mo40900o() {
        return this.f32963g;
    }

    /* renamed from: s */
    public <R> C5368e<R> mo40901s(C5379n<? super T, ? extends C5368e<? extends R>> nVar) {
        return C5368e.m10253b(new C12779c(nVar));
    }
}
