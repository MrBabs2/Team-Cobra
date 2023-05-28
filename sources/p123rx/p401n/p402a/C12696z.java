package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p409o.C12831b;

/* renamed from: rx.n.a.z */
/* compiled from: OnSubscribeRefCount */
public final class C12696z<T> implements C5368e.C5370a<T> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12831b<? extends T> f32785f;

    /* renamed from: g */
    volatile C5383b f32786g = new C5383b();

    /* renamed from: h */
    final AtomicInteger f32787h = new AtomicInteger(0);

    /* renamed from: i */
    final ReentrantLock f32788i = new ReentrantLock();

    /* renamed from: rx.n.a.z$a */
    /* compiled from: OnSubscribeRefCount */
    class C12697a implements C5378b<C5375k> {

        /* renamed from: f */
        final /* synthetic */ C12475j f32789f;

        /* renamed from: g */
        final /* synthetic */ AtomicBoolean f32790g;

        C12697a(C12475j jVar, AtomicBoolean atomicBoolean) {
            this.f32789f = jVar;
            this.f32790g = atomicBoolean;
        }

        /* renamed from: a */
        public void call(C5375k kVar) {
            try {
                C12696z.this.f32786g.mo18721a(kVar);
                C12696z.this.mo40839a(this.f32789f, C12696z.this.f32786g);
            } finally {
                C12696z.this.f32788i.unlock();
                this.f32790g.set(false);
            }
        }
    }

    /* renamed from: rx.n.a.z$b */
    /* compiled from: OnSubscribeRefCount */
    class C12698b extends C12475j<T> {

        /* renamed from: f */
        final /* synthetic */ C12475j f32792f;

        /* renamed from: g */
        final /* synthetic */ C5383b f32793g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12698b(C12475j jVar, C12475j jVar2, C5383b bVar) {
            super(jVar);
            this.f32792f = jVar2;
            this.f32793g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40841a() {
            C12696z.this.f32788i.lock();
            try {
                if (C12696z.this.f32786g == this.f32793g) {
                    if (C12696z.this.f32785f instanceof C5375k) {
                        ((C5375k) C12696z.this.f32785f).unsubscribe();
                    }
                    C12696z.this.f32786g.unsubscribe();
                    C12696z.this.f32786g = new C5383b();
                    C12696z.this.f32787h.set(0);
                }
            } finally {
                C12696z.this.f32788i.unlock();
            }
        }

        public void onCompleted() {
            mo40841a();
            this.f32792f.onCompleted();
        }

        public void onError(Throwable th) {
            mo40841a();
            this.f32792f.onError(th);
        }

        public void onNext(T t) {
            this.f32792f.onNext(t);
        }
    }

    /* renamed from: rx.n.a.z$c */
    /* compiled from: OnSubscribeRefCount */
    class C12699c implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C5383b f32795f;

        C12699c(C5383b bVar) {
            this.f32795f = bVar;
        }

        public void call() {
            C12696z.this.f32788i.lock();
            try {
                if (C12696z.this.f32786g == this.f32795f && C12696z.this.f32787h.decrementAndGet() == 0) {
                    if (C12696z.this.f32785f instanceof C5375k) {
                        ((C5375k) C12696z.this.f32785f).unsubscribe();
                    }
                    C12696z.this.f32786g.unsubscribe();
                    C12696z.this.f32786g = new C5383b();
                }
            } finally {
                C12696z.this.f32788i.unlock();
            }
        }
    }

    public C12696z(C12831b<? extends T> bVar) {
        this.f32785f = bVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        this.f32788i.lock();
        if (this.f32787h.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f32785f.mo40814d(m41181a(jVar, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f32788i.unlock();
                }
            }
        } else {
            try {
                mo40839a(jVar, this.f32786g);
            } finally {
                this.f32788i.unlock();
            }
        }
    }

    /* renamed from: a */
    private C5378b<C5375k> m41181a(C12475j<? super T> jVar, AtomicBoolean atomicBoolean) {
        return new C12697a(jVar, atomicBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40839a(C12475j<? super T> jVar, C5383b bVar) {
        jVar.add(m41180a(bVar));
        this.f32785f.mo18668b(new C12698b(jVar, jVar, bVar));
    }

    /* renamed from: a */
    private C5375k m41180a(C5383b bVar) {
        return C12889e.m41501a(new C12699c(bVar));
    }
}
