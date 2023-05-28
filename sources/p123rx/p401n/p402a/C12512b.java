package p123rx.p401n.p402a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.p126m.C5377a;
import p123rx.p127s.C5382d;
import p123rx.p128t.C12889e;

/* renamed from: rx.n.a.b */
/* compiled from: BufferUntilSubscriber */
public final class C12512b<T> extends C5382d<T, T> {

    /* renamed from: i */
    static final C5372f f32273i = new C12513a();

    /* renamed from: g */
    final C12516c<T> f32274g;

    /* renamed from: h */
    private boolean f32275h;

    /* renamed from: rx.n.a.b$a */
    /* compiled from: BufferUntilSubscriber */
    static class C12513a implements C5372f {
        C12513a() {
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.n.a.b$b */
    /* compiled from: BufferUntilSubscriber */
    static final class C12514b<T> implements C5368e.C5370a<T> {

        /* renamed from: f */
        final C12516c<T> f32276f;

        /* renamed from: rx.n.a.b$b$a */
        /* compiled from: BufferUntilSubscriber */
        class C12515a implements C5377a {
            C12515a() {
            }

            public void call() {
                C12514b.this.f32276f.set(C12512b.f32273i);
            }
        }

        public C12514b(C12516c<T> cVar) {
            this.f32276f = cVar;
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            boolean z;
            if (this.f32276f.mo40678a((C5372f) null, jVar)) {
                jVar.add(C12889e.m41501a(new C12515a()));
                synchronized (this.f32276f.f32278f) {
                    z = true;
                    if (!this.f32276f.f32279g) {
                        this.f32276f.f32279g = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    while (true) {
                        Object poll = this.f32276f.f32280h.poll();
                        if (poll != null) {
                            C12558h.m41017a((C5372f) this.f32276f.get(), poll);
                        } else {
                            synchronized (this.f32276f.f32278f) {
                                if (this.f32276f.f32280h.isEmpty()) {
                                    this.f32276f.f32279g = false;
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                jVar.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    /* renamed from: rx.n.a.b$c */
    /* compiled from: BufferUntilSubscriber */
    static final class C12516c<T> extends AtomicReference<C5372f<? super T>> {

        /* renamed from: f */
        final Object f32278f = new Object();

        /* renamed from: g */
        boolean f32279g;

        /* renamed from: h */
        final ConcurrentLinkedQueue<Object> f32280h = new ConcurrentLinkedQueue<>();

        C12516c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40678a(C5372f<? super T> fVar, C5372f<? super T> fVar2) {
            return compareAndSet(fVar, fVar2);
        }
    }

    private C12512b(C12516c<T> cVar) {
        super(new C12514b(cVar));
        this.f32274g = cVar;
    }

    /* renamed from: d */
    private void m40980d(Object obj) {
        synchronized (this.f32274g.f32278f) {
            this.f32274g.f32280h.add(obj);
            if (this.f32274g.get() != null && !this.f32274g.f32279g) {
                this.f32275h = true;
                this.f32274g.f32279g = true;
            }
        }
        if (this.f32275h) {
            while (true) {
                Object poll = this.f32274g.f32280h.poll();
                if (poll != null) {
                    C12558h.m41017a((C5372f) this.f32274g.get(), poll);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    public static <T> C12512b<T> m40981p() {
        return new C12512b<>(new C12516c());
    }

    public void onCompleted() {
        if (this.f32275h) {
            ((C5372f) this.f32274g.get()).onCompleted();
        } else {
            m40980d(C12558h.m41014a());
        }
    }

    public void onError(Throwable th) {
        if (this.f32275h) {
            ((C5372f) this.f32274g.get()).onError(th);
        } else {
            m40980d(C12558h.m41015a(th));
        }
    }

    public void onNext(T t) {
        if (this.f32275h) {
            ((C5372f) this.f32274g.get()).onNext(t);
        } else {
            m40980d(C12558h.m41020d(t));
        }
    }
}
