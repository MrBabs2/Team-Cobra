package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p123rx.C12474i;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.t1 */
/* compiled from: SingleTimeout */
public final class C12660t1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single.C5327j<T> f32691f;

    /* renamed from: g */
    final long f32692g;

    /* renamed from: h */
    final TimeUnit f32693h;

    /* renamed from: i */
    final C5373h f32694i;

    /* renamed from: j */
    final Single.C5327j<? extends T> f32695j;

    /* renamed from: rx.n.a.t1$a */
    /* compiled from: SingleTimeout */
    static final class C12661a<T> extends C12474i<T> implements C5377a {

        /* renamed from: g */
        final C12474i<? super T> f32696g;

        /* renamed from: h */
        final AtomicBoolean f32697h = new AtomicBoolean();

        /* renamed from: i */
        final Single.C5327j<? extends T> f32698i;

        /* renamed from: rx.n.a.t1$a$a */
        /* compiled from: SingleTimeout */
        static final class C12662a<T> extends C12474i<T> {

            /* renamed from: g */
            final C12474i<? super T> f32699g;

            C12662a(C12474i<? super T> iVar) {
                this.f32699g = iVar;
            }

            /* renamed from: a */
            public void mo18573a(T t) {
                this.f32699g.mo18573a(t);
            }

            public void onError(Throwable th) {
                this.f32699g.onError(th);
            }
        }

        C12661a(C12474i<? super T> iVar, Single.C5327j<? extends T> jVar) {
            this.f32696g = iVar;
            this.f32698i = jVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            if (this.f32697h.compareAndSet(false, true)) {
                try {
                    this.f32696g.mo18573a(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        public void call() {
            if (this.f32697h.compareAndSet(false, true)) {
                try {
                    Single.C5327j<? extends T> jVar = this.f32698i;
                    if (jVar == null) {
                        this.f32696g.onError(new TimeoutException());
                    } else {
                        C12662a aVar = new C12662a(this.f32696g);
                        this.f32696g.mo40654b(aVar);
                        jVar.call(aVar);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32697h.compareAndSet(false, true)) {
                try {
                    this.f32696g.onError(th);
                } finally {
                    unsubscribe();
                }
            } else {
                C12844c.m41417b(th);
            }
        }
    }

    public C12660t1(Single.C5327j<T> jVar, long j, TimeUnit timeUnit, C5373h hVar, Single.C5327j<? extends T> jVar2) {
        this.f32691f = jVar;
        this.f32692g = j;
        this.f32693h = timeUnit;
        this.f32694i = hVar;
        this.f32695j = jVar2;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12661a aVar = new C12661a(iVar, this.f32695j);
        C5373h.C5374a createWorker = this.f32694i.createWorker();
        aVar.mo40654b(createWorker);
        iVar.mo40654b(aVar);
        createWorker.mo18712a(aVar, this.f32692g, this.f32693h);
        this.f32691f.call(aVar);
    }
}
