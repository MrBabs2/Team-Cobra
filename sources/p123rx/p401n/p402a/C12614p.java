package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12464c;
import p123rx.C12475j;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12761e;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.p */
/* compiled from: OnSubscribeFlatMapCompletable */
public final class C12614p<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5368e<T> f32534f;

    /* renamed from: g */
    final C5379n<? super T, ? extends C5328b> f32535g;

    /* renamed from: h */
    final boolean f32536h;

    /* renamed from: i */
    final int f32537i;

    public C12614p(C5368e<T> eVar, C5379n<? super T, ? extends C5328b> nVar, boolean z, int i) {
        if (nVar == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.f32534f = eVar;
            this.f32535g = nVar;
            this.f32536h = z;
            this.f32537i = i;
        } else {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12615a aVar = new C12615a(jVar, this.f32535g, this.f32536h, this.f32537i);
        jVar.add(aVar);
        jVar.add(aVar.f32543k);
        this.f32534f.mo18668b(aVar);
    }

    /* renamed from: rx.n.a.p$a */
    /* compiled from: OnSubscribeFlatMapCompletable */
    static final class C12615a<T> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super T> f32538f;

        /* renamed from: g */
        final C5379n<? super T, ? extends C5328b> f32539g;

        /* renamed from: h */
        final boolean f32540h;

        /* renamed from: i */
        final int f32541i;

        /* renamed from: j */
        final AtomicInteger f32542j = new AtomicInteger(1);

        /* renamed from: k */
        final C5383b f32543k = new C5383b();

        /* renamed from: l */
        final AtomicReference<Throwable> f32544l = new AtomicReference<>();

        /* renamed from: rx.n.a.p$a$a */
        /* compiled from: OnSubscribeFlatMapCompletable */
        final class C12616a extends AtomicReference<C5375k> implements C12464c, C5375k {
            C12616a() {
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                if (!compareAndSet((Object) null, kVar)) {
                    kVar.unsubscribe();
                    if (get() != this) {
                        C12844c.m41417b((Throwable) new IllegalStateException("Subscription already set!"));
                    }
                }
            }

            public boolean isUnsubscribed() {
                return get() == this;
            }

            public void onCompleted() {
                C12615a.this.mo40752a(this);
            }

            public void onError(Throwable th) {
                C12615a.this.mo40753a(this, th);
            }

            public void unsubscribe() {
                C5375k kVar = (C5375k) getAndSet(this);
                if (kVar != null && kVar != this) {
                    kVar.unsubscribe();
                }
            }
        }

        C12615a(C12475j<? super T> jVar, C5379n<? super T, ? extends C5328b> nVar, boolean z, int i) {
            this.f32538f = jVar;
            this.f32539g = nVar;
            this.f32540h = z;
            this.f32541i = i;
            request(i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40754a() {
            if (this.f32542j.decrementAndGet() != 0) {
                return false;
            }
            Throwable a = C12761e.m41254a(this.f32544l);
            if (a != null) {
                this.f32538f.onError(a);
                return true;
            }
            this.f32538f.onCompleted();
            return true;
        }

        public void onCompleted() {
            mo40754a();
        }

        public void onError(Throwable th) {
            if (this.f32540h) {
                C12761e.m41256a(this.f32544l, th);
                onCompleted();
                return;
            }
            this.f32543k.unsubscribe();
            if (this.f32544l.compareAndSet((Object) null, th)) {
                this.f32538f.onError(C12761e.m41254a(this.f32544l));
            } else {
                C12844c.m41417b(th);
            }
        }

        public void onNext(T t) {
            try {
                C5328b bVar = (C5328b) this.f32539g.call(t);
                if (bVar != null) {
                    C12616a aVar = new C12616a();
                    this.f32543k.mo18721a((C5375k) aVar);
                    this.f32542j.getAndIncrement();
                    bVar.mo18604b((C12464c) aVar);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Completable");
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(th);
            }
        }

        /* renamed from: a */
        public void mo40753a(C12615a<T>.C0000a aVar, Throwable th) {
            this.f32543k.mo18722b(aVar);
            if (this.f32540h) {
                C12761e.m41256a(this.f32544l, th);
                if (!mo40754a() && this.f32541i != Integer.MAX_VALUE) {
                    request(1);
                    return;
                }
                return;
            }
            this.f32543k.unsubscribe();
            unsubscribe();
            if (this.f32544l.compareAndSet((Object) null, th)) {
                this.f32538f.onError(C12761e.m41254a(this.f32544l));
            } else {
                C12844c.m41417b(th);
            }
        }

        /* renamed from: a */
        public void mo40752a(C12615a<T>.C0000a aVar) {
            this.f32543k.mo18722b(aVar);
            if (!mo40754a() && this.f32541i != Integer.MAX_VALUE) {
                request(1);
            }
        }
    }
}
